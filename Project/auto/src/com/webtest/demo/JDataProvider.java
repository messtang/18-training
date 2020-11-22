package com.webtest.demo;

import com.webtest.dataprovider.ExcelDataProvider;
import org.testng.annotations.DataProvider;
import java.io.IOException;
/*
数据提供者DataProvider
 */
public class JDataProvider {
    @DataProvider(name = "loginData")
    public Object[][] LoginDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("user-data.xlsx","Sheet1");
    }

    @DataProvider(name = "newSectionData")
    public Object[][] NewSectionDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","Sheet1");
    }

    @DataProvider(name="transferSectionData")
    public Object[][] TransferDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","Sheet2");
    }

    @DataProvider(name="addPointData")
    public Object[][] AddPointDataProvider() throws IOException {
        return new ExcelDataProvider().
                getTestDataByExcel("point-data.xlsx","Sheet1");

    }

    @DataProvider(name="exchangePointData")
    public Object[][] ExchangePointDataProvider() throws IOException {
        return new ExcelDataProvider().
                getTestDataByExcel("point-data.xlsx","Sheet2");

    }



}
