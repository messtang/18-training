package com.webtest.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ChanDaoDemo{
	@Test
	public void testAdd() throws InterruptedException, IOException {
		String filepath = "D:\\TestProjectFile\\18-training\\Project\\王锦阳\\1-50条测试用例\\探索性测试.xlsx";
		System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "E:\\Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
//		允许浏览器执行js代码
		DesiredCapabilities sCaps = new DesiredCapabilities();
		sCaps.setJavascriptEnabled(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://2018testing.zentaopm.com/user-login-L215Lmh0bWw=.html");
		
		driver.findElement(By.id("account")).sendKeys("wangjinyang2020");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("wangjinyang2020");
		
		driver.findElement(By.id("submit")).click();
		
		List<WebElement> ls = driver.findElements(By.xpath("//a[text()='测试']"));
		ls.get(0).click();
		
		driver.findElement(By.xpath("//li[@class='dropdown dropdown-hover ']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("currentItem")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='jianyuluntan']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("b_其他")).click();
		Thread.sleep(1000);
		FileInputStream in = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(in);
		XSSFSheet sheet = workbook.getSheetAt(0);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		for(int j = 4; j < 54; ++j) {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0,1000)");
			XSSFRow row = sheet.getRow(j);
			
			XSSFCell cell = row.getCell(2);
			//设置单元格类型
			cell.setCellType(CellType.STRING);
			String title = cell.getStringCellValue();
			
			XSSFCell cell1 = row.getCell(3);
			XSSFCell cell2 = row.getCell(4);
			String move1 = cell1.getStringCellValue();
			String move2 = cell2.getStringCellValue();
			
			Thread.sleep(1000);
			driver.findElement(By.id("title")).sendKeys(title);
			Thread.sleep(1000);
			driver.findElement(By.name("steps[1]")).sendKeys(move1);
			Thread.sleep(1000);
			driver.findElement(By.name("steps[2]")).sendKeys(move2);
			Thread.sleep(1000);
			
			driver.findElement(By.id("submit")).click();
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		in.close();
		workbook.close();
		driver.quit();
	}
}