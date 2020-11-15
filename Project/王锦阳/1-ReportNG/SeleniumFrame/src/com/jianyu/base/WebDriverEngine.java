package com.jianyu.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jianyu.utils.Log;
import com.jianyu.utils.ReadProperties;

public class WebDriverEngine {

	WebDriver driver = null;
	Actions action  =null;

	public WebDriverEngine(WebDriver driver) {
		
		this.driver = driver;
		driver.manage().window().maximize();
		action = new Actions(driver);
	}
	public String[] getAllWindowTitles() {
		// TODO Auto-generated method stub
	    String current = driver.getWindowHandle();

	    List<String> attributes = new ArrayList<String>();
	    for (String handle : driver.getWindowHandles()) {
	      driver.switchTo().window(handle);
	      attributes.add(driver.getTitle());
	    }

	    driver.switchTo().window(current);

	    return attributes.toArray(new String[attributes.size()]);
	}



	public void enterFrame(String frameID) {
		this.pause(3000);
		driver.switchTo().frame(frameID);
		Log.info("Entered iframe " + frameID);
	}
	public void enterFrame(int frameID) {
		this.pause(3000);
		driver.switchTo().frame(frameID);
		Log.info("Entered iframe " + frameID);
	}
	
	public void enterFrame1(WebElement element) {
		this.pause(3000);
		driver.switchTo().frame(element);
		Log.info("Entered iframe " + element);
	}


	public void leaveFrame() {
		driver.switchTo().defaultContent();
		Log.info("Left the iframe");
	}

	public void open(String url) {

		try {
			driver.get(url);
			pause(5000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		Log.info("Opened url " + url);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	private void pause(int time) {
		if (time <= 0) {
			return;
		}
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean isTextPresent(String pattern) {

		String text = driver.getPageSource();
		text = text.trim();
		if (text.contains(pattern)) {
			return true;
		}
		return false;
	}
	public void enter() {
		action.sendKeys(Keys.ENTER);
	}

	public void typeAndClear(WebElement element, String value) {
		if (element != null) {
			element.clear();
			element.sendKeys(value);
		}
	}

	public void sendKeys(WebElement element, String value) {
		if (element != null) {
			element.sendKeys(value);
		}
	}

	public boolean isChecked(WebElement element) {
		return element.isSelected();
	}

	public void click(WebElement element) {
		if (element != null) {
			element.click();
			this.pause(3000);
		}
	}

	public void clickLonger(WebElement element) {
		if (element != null) {
			runJs("window.scrollTo(0," + element.getLocation().x + ")");
			element.click();
			this.pause(3000);
		}
	}

	public void doubleClick(WebElement element) throws InterruptedException {
		action.doubleClick(element).build().perform();
	}

	public boolean isDisplayed(WebElement element) {
		if (element != null) {
			return element.isDisplayed();
		}
		return false;
	}

	public String getText(WebElement element) {

		return element.getText().trim();
	}

	public String getValue(WebElement element) {

		return element.getAttribute("value");
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	public void goBack() {
		driver.navigate().back();
	}

	public void goForward() {

		driver.navigate().forward();
	}

	public Alert getAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	public String getAlertTest() {

		return getAlert().getText();
	}

	public void alertAccept() {

		getAlert().accept();
		}

	public Select getSelect(WebElement element) {
		Select inputSelect = new Select(element);
		return inputSelect;
	}

	public void selectByValue(WebElement element, String value) {
		getSelect(element).selectByValue(value);
		this.pause(5000);
	}

	public void selectByVisibleText(WebElement element, String value) {
		getSelect(element).selectByVisibleText(value);
	}

	public void selectByIndex(WebElement element, int index) {
		getSelect(element).selectByIndex(index);
	}

	

	public String getHtmlSource() {

		return driver.getPageSource();
	}

	public void runJs(String js) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript(js);
	}


	public void mouseToElement(WebElement element) throws InterruptedException {
		action.moveToElement(element).perform();
	}

	public void mouseToElementandClick(WebElement element) throws InterruptedException {
		action.moveToElement(element).click().perform();
	}
	public void switchWidow(int i){
	    List<String> windows = new ArrayList<String>();
	    for (String handle : driver.getWindowHandles()) {
	    
	    	windows.add(handle);
	    }
	    driver.switchTo().window(windows.get(i));
	}
	//�Ҽ�
	public void rightClickMouse(WebElement element) throws InterruptedException {
		action.contextClick(element).perform();
		}
	//Tab��
	public void tapClick(){
	
		action.sendKeys(Keys.TAB).perform();;
	}
	
	public void tapType(String content){
		
			action.sendKeys(content).perform();
		}
	
	public void getWindow(int i){
		List<String> windows = new ArrayList<String>();
		for (String handle : driver.getWindowHandles())
		{
			//System.out.println(handle);  
			windows.add(handle);
		}
		driver.switchTo().window(windows.get(i));
	}



	
	
	
}
