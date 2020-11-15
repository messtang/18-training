package com.jianyu.base;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.jianyu.utils.Log;
import com.jianyu.utils.ReadProperties;

public class BaseTest {
	public  WebDriverEngine webtest;
	public WebDriver driver;
	public String driverType;
	
	private WebDriver newWebDriver(String driverType) throws IOException {
		WebDriver driver = null;
		if (driverType.equalsIgnoreCase("firefox")) {
		    String firefox_driver =ReadProperties.getPropertyValue("gecko_driver_path");
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
	
	@BeforeClass
	public void doBeforeClass() throws Exception {
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
	
	public WebDriver getDriver() {
        return driver;
    }

	@BeforeSuite(description = "添加监听器")
	public void addListener(ITestContext context) {
		TestRunner runner=(TestRunner)context;
	}
	

}
