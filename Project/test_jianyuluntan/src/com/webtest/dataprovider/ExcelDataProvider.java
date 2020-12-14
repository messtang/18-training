package com.webtest.dataprovider;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.webtest.utils.ReadProperties;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*
 * Excel����������
 */

public class ExcelDataProvider {



	public Object[][] getTestDataByExcel(String fileName, String sheetName)
			throws IOException {
		File file = new File(ReadProperties.getPropertyValue("data_root")+fileName);
		FileInputStream inputstream = new FileInputStream(file);
		Workbook wbook = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		System.out.println(fileExtensionName);
		if (fileExtensionName.equals(".xlsx")) {
			wbook = new XSSFWorkbook(inputstream);
		
		} else if (fileExtensionName.equals(".xls")) {
			wbook = new HSSFWorkbook(inputstream);
		}
		Sheet sheet = wbook.getSheet(sheetName);
		// ͨ��sheetName����Sheet����
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		// ��ȡ��ǰsheet�������кź��кŶ��Ǵӣ���ʼ
		List<Object[]> records = new ArrayList<Object[]>();
		// ʹ��˫ѭ����ȡexcel�ļ����������ݣ���һ�г��⣩
		for (int i = 1; i < rowCount + 1; i++) {
			Row row = sheet.getRow(i);
			String fields[] = new String[row.getLastCellNum()];
			for (int j = 0; j < row.getLastCellNum(); j++) {
				try {
					fields[j] = row.getCell(j).getStringCellValue();
				} catch (Exception e) {
					double d = row.getCell(j).getNumericCellValue();
					fields[j] = String.valueOf((int)d);
				}
			}
			records.add(fields);
		}
		Object[][] results = new Object[records.size()][];
		for (int i = 0; i < records.size(); i++) {
			results[i] = records.get(i);
		}
		return results;
	}
	

}
