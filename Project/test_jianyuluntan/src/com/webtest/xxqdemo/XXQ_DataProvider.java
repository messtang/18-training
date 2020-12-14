package com.webtest.xxqdemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.webtest.dataprovider.ExcelDataProvider;

public class XXQ_DataProvider {

	@DataProvider(name = "neirong")
	public Object[][] pictureFile() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("XXQ_data.xlsx", "内容");
	}
}
