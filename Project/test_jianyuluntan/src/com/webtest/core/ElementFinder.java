package com.webtest.core;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.webtest.utils.Log;

import java.util.List;

/**
 * author:lihuanzhen
 * ����Ԫ����
 */
public class ElementFinder {
	
	WebDriver driver;
	public  ElementFinder(WebDriver driver)
	{
		this.driver=driver;
	}
	

	
	public WebElement findElement(String target) {
		WebElement element = null;

		try {
			element = findElementByPrefix(target);
		} catch (Exception e) {

			Log.info(e.toString());
		}
		return element;

	}
	
	public WebElement findElementByPrefix(String locator)
	{
		String target=locator.trim();
		if(target.startsWith("id="))
		{
			locator = locator.substring("id=".length());
			return driver.findElement(By.id(locator));
		}else if(target.startsWith("class="))
		{
			locator = locator.substring("class=".length());
			return driver.findElement(By.className(locator));
		}else if(target.startsWith("name="))
		{
			locator = locator.substring("name=".length());
			return driver.findElement(By.name(locator));
		}else if(target.startsWith("link="))
		{
			locator = locator.substring("link=".length());
	
			return driver.findElement(By.linkText(locator));
		}else if(target.startsWith("partLink="))
		{
			locator = locator.substring("partLink=".length());
		
			return driver.findElement(By.partialLinkText(locator));
		}
		
		
		
		
		else if(target.startsWith("css="))
		{
			locator = locator.substring("css=".length());
			return driver.findElement(By.cssSelector(locator));
		}else if(target.startsWith("xpath="))
		{
			locator = locator.substring("xpath=".length());
			return driver.findElement(By.xpath(locator));
		}else if(target.startsWith("tag="))
		{
			locator = locator.substring("tag=".length());
			return driver.findElement(By.tagName(locator));
		}
		else
		{
			Log.info(locator+"can't find element by prefix.");
			return null;
		}
	}
	
	public WebElement findElementsByPrefix(String locator,int no)
	{
		String target=locator.trim();
		if(target.startsWith("id="))
		{
			locator = locator.substring("id=".length());
			List<WebElement> links = driver.findElements(By.id(locator));
			return links.get(no);
		}else if(target.startsWith("class="))
		{
			locator = locator.substring("class=".length());
			List<WebElement> links = driver.findElements(By.className(locator));
			return links.get(no);
		}else if(target.startsWith("name="))
		{
			locator = locator.substring("name=".length());
			List<WebElement> links = driver.findElements(By.name(locator));
			return links.get(no);
		}else if(target.startsWith("link="))
		{
			locator = locator.substring("link=".length());
			List<WebElement> links = driver.findElements(By.linkText(locator));
			return links.get(no);
		}else if(target.startsWith("partLink="))
		{
			locator = locator.substring("partLink=".length());
			List<WebElement> links = driver.findElements(By.partialLinkText(locator));
			return links.get(no);
		}
		
		
		
		
		else if(target.startsWith("css="))
		{
			locator = locator.substring("css=".length());
			List<WebElement> links = driver.findElements(By.cssSelector(locator));
			return links.get(no);
		}else if(target.startsWith("xpath="))
		{
			locator = locator.substring("xpath=".length());
			List<WebElement> links = driver.findElements(By.xpath(locator));
			return links.get(no);
		}else if(target.startsWith("tag="))
		{
			locator = locator.substring("tag=".length());
			List<WebElement> links = driver.findElements(By.tagName(locator));
			return links.get(no);
		}
		else
		{
			Log.info(locator+"can't find element by prefix.");
			return null;
		}
	}
	
}
