package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvider1 {


	@DataProvider(name="zl_shop")
	public  Object[][] getTxtData() throws IOException{
		return new  TxtDataProvider().getTxtUser("user.txt");
	}
	@DataProvider(name="movie")
	public  Object[][] getMovieData() throws IOException{
		return new  ExcelDataProvider().getTestDataByExcel("movie.xlxs","Sheet1");
	}
	@Test(dataProvider="txt")
	public void getData(String a,String b) {
		System.out.println(a+" "+b);

	}

	@DataProvider(name="excel1")
	public Object[][] getExcelDada1() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet1");
	}

	@DataProvider(name="excel2")
	public Object[][] getExcelDada2() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet2");
	}

	@DataProvider(name="excel3")
	public Object[][] getExcelDada3() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet3");
	}

	@DataProvider(name="excel4")
	public Object[][] getExcelDada4() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet4");
	}

	@DataProvider(name="excel5")
	public Object[][] getExcelDada5() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet5");
	}

	@DataProvider(name="excel6")
	public Object[][] getExcelDada6() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet6");
	}

	@DataProvider(name="excel7")
	public Object[][] getExcelDada7() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet7");
	}

	@DataProvider(name="excel8")
	public Object[][] getExcelDada8() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet8");
	}

	@DataProvider(name="excel9")
	public Object[][] getExcelDada9() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet9");
	}

	@DataProvider(name="excel10")
	public Object[][] getExcelDada10() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet10");
	}

	@DataProvider(name="excel11")
	public Object[][] getExcelDada11() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet11");
	}

	@DataProvider(name="excel12")
	public Object[][] getExcelDada12() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet12");
	}

	@DataProvider(name="excel13")
	public Object[][] getExcelDada13() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet13");
	}

	@DataProvider(name="excel14")
	public Object[][] getExcelDada14() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet14");
	}

	@DataProvider(name="excel15")
	public Object[][] getExcelDada15() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet15");
	}

	@DataProvider(name="excel16")
	public Object[][] getExcelDada16() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet16");
	}

	@DataProvider(name="excel17")
	public Object[][] getExcelDada17() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet17");
	}

	@DataProvider(name="excel18")
	public Object[][] getExcelDada18() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet18");
	}

	@DataProvider(name="excel19")
	public Object[][] getExcelDada19() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet19");
	}

	@DataProvider(name="excel20")
	public Object[][] getExcelDada20() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet20");
	}

	@DataProvider(name="excel21")
	public Object[][] getExcelDada21() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet21");
	}

	@DataProvider(name="excel22")
	public Object[][] getExcelDada22() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet22");
	}

	@DataProvider(name="excel23")
	public Object[][] getExcelDada23() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet23");
	}

	@DataProvider(name="excel24")
	public Object[][] getExcelDada24() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet24");
	}

	@DataProvider(name="excel25")
	public Object[][] getExcelDada25() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet25");
	}

	@DataProvider(name="excel26")
	public Object[][] getExcelDada26() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet26");
	}

	@DataProvider(name="excel27")
	public Object[][] getExcelDada27() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("excel1.xls","Sheet27");
	}

	@DataProvider(name="mysql")
	public Object[][] getMysqlDada() throws IOException{
		return new MysqlDataProvider().getTestDataByMysql("SELECT filmname, petname\r\n" +
				"FROM `mm_movie` ");
	}

	@Test(dataProvider="mysql")
	public void testDB(String a,String b) {
		System.out.println(a+" "+b);
	}

}