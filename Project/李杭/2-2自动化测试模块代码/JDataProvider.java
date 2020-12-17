package com.webtest.lhdemo;

import com.webtest.dataprovider.ExcelDataProvider;
import org.testng.annotations.DataProvider;

import java.io.IOException;

/*
数据提供者DataProvider
 */
public class JDataProvider {

    @DataProvider(name = "newSectionNameData")
    public Object[][] NewSectionNameDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","SectionName");
    }

    @DataProvider(name = "newSectionAliasData")
    public Object[][] NewSectionAliasDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","SectionAlias");
    }

    @DataProvider(name = "newSectionMenuData")
    public Object[][] NewSectionMenuDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","SectionMenu");
    }

    @DataProvider(name = "newSectionIconData")
    public Object[][] NewSectionIconDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","SectionIcon");
    }

    @DataProvider(name = "newSectionLinkData")
    public Object[][] NewSectionLinkDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","SectionLink");
    }

    @DataProvider(name = "hasBuiltSectionSortData")
    public Object[][] hasBuiltSectionSortDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","hasBuiltSectionSort");
    }

    @DataProvider(name="transferSectionData")
    public Object[][] TransferDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","transferSection");
    }

    @DataProvider(name="userNamePointData")
    public Object[][] userNamePointDataProvider() throws IOException {
        return new ExcelDataProvider().
                getTestDataByExcel("point-data.xlsx","userName");

    }

    @DataProvider(name="changePointData")
    public Object[][] changePointDataProvider() throws IOException {
        return new ExcelDataProvider().
                getTestDataByExcel("point-data.xlsx","changePoint");

    }

    @DataProvider(name="exchangePointData")
    public Object[][] ExchangePointDataProvider() throws IOException {
        return new ExcelDataProvider().
                getTestDataByExcel("point-data.xlsx","exchangePoint");

    }



}
