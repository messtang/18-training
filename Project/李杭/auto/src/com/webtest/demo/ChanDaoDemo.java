package com.webtest.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.webtest.utils.ReadProperties;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
/*
自动化批量添加管理用例
 */
public class ChanDaoDemo{
    @Test
    public void testAdd() throws InterruptedException, IOException {
        String filepath = ReadProperties.getPropertyValue("data_root")+"chandao-case.xlsx";
        System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
//		允许浏览器执行js代码
        DesiredCapabilities sCaps = new DesiredCapabilities();
        sCaps.setJavascriptEnabled(true);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://2018testing.zentaopm.com/user-login-L215Lmh0bWw=.html");

        driver.findElement(By.id("account")).sendKeys("lihang2020");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lihang2020");

        driver.findElement(By.id("submit")).click();

        List<WebElement> ls = driver.findElements(By.xpath("//a[text()='测试']"));
        ls.get(0).click();

        driver.findElement(By.xpath("//li[@class='dropdown dropdown-hover ']/a")).click();


        FileInputStream in = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet sheet = workbook.getSheetAt(0);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        for(int j = 1; j < 62; ++j) {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,1000)");
            XSSFRow row = sheet.getRow(j);

            XSSFCell cell = row.getCell(1);
            //设置单元格类型
            cell.setCellType(CellType.STRING);
            String title = cell.getStringCellValue();

            XSSFCell cell2 = row.getCell(2);
            String moves = cell2.getStringCellValue();

            Thread.sleep(1000);
            driver.findElement(By.id("title")).sendKeys(title);
            driver.findElement(By.name("steps[1]")).sendKeys(moves);

            driver.findElement(By.id("submit")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        in.close();
        workbook.close();
        driver.quit();
    }
}


