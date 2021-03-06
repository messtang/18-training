package com.webtest.core;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.*;

import com.mysql.jdbc.Driver;
import com.webtest.utils.Log;
import com.webtest.utils.ReadProperties;

/**
 * author:lihuanzhen
 *
 */

//第一种解决办法
// 修改BaseTest:添加初始化浏览器2和关闭浏览器2的方法,分别设置为BeforeMethod和AfterMethod;
// 在每个的单独的类里面,把登录设置为BeforeMethod
public class BaseTest {

	public  WebDriverEngine webtest;
	private WebDriver driver;
	public String driverType;




	private WebDriver newWebDriver(String driverType) throws IOException {
		WebDriver driver = null;
	 if (driverType.equalsIgnoreCase("firefox")) {
		    String firefox_driver =ReadProperties.getPropertyValue("gecko_driver");
			String firefox_path = ReadProperties.getPropertyValue("firefox_path");
			System.setProperty("webdriver.gecko.driver", firefox_driver);
			System.setProperty("webdriver.firefox.bin", firefox_path);
			driver = new FirefoxDriver();
	
			Log.info("Using Firefox");
		}  else if (driverType.equalsIgnoreCase("chrome")) {
			String chrome_path = ReadProperties.getPropertyValue("chrome_path");
			System.setProperty("webdriver.chrome.driver",chrome_path);
			driver = new ChromeDriver();
			Log.info("Using Chrome");
			
		}else{
			return null;
		}

		
		return driver;

	
	}


	/**
	 * 
	 *鎵撳紑娴忚鍣�
	 * 
	 */
	@BeforeClass(enabled=false)
	public void doBeforeClass() throws Exception {
		driverType=ReadProperties.getPropertyValue("driverType");
		driver = this.newWebDriver(driverType);
		driver.manage().window().maximize();
		Log.info(driverType);
		webtest = new WebDriverEngine(driver);

	}

	@BeforeMethod
	public void doBeforeClass_2() throws Exception {
		driverType=ReadProperties.getPropertyValue("driverType");
		driver = this.newWebDriver(driverType);
		driver.manage().window().maximize();
		Log.info(driverType);
		webtest = new WebDriverEngine(driver);

	}


	@AfterClass
	public void doAfterMethod() {
		if(this.driver != null){
			this.driver.quit();
			}
		Log.info("Quitted Browser");
	}

	@AfterMethod
	public void doAfterMethod_2() {
		if(this.driver != null){
			this.driver.quit();
		}
	}
	


	
	
	public WebDriver getDriver() {
        return driver;
    }

	@BeforeSuite(description="设置监听器")
	public void addListener(ITestContext context) {
//		System.out.println("设置监听器");
		TestRunner runnner = (TestRunner)context;
		runnner.addListener(new WebTestListener());
	}
	

}
