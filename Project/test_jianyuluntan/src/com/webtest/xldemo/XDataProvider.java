package com.webtest.xldemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.webtest.dataprovider.*;
//作者：徐良
public class XDataProvider {

	//登录参数的数据提供者
	@DataProvider(name = "loginData")
	public Object[][] getDataOfLogin() throws IOException {
		return new ExcelDataProvider()
				.getTestDataByExcel("data.xlsx","login");
	}
	//注册参数的数据提供者
	@DataProvider(name = "registerData")
	public Object[][] getDataOfRegister() throws IOException {
		return new ExcelDataProvider()
				.getTestDataByExcel("data.xlsx", "register");
	}
	
}
