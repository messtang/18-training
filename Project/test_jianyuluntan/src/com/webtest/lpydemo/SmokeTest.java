package com.webtest.lpydemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.servlet.annotation.WebListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.webtest.core.BaseTest;
import com.webtest.core.ElementFinder;
import com.webtest.core.WebDriverEngine;
import com.webtest.dataprovider.NSDataProvider1;

//autor:李培源
//测试模块：后台登录，后台发帖管理，后台用户管理

public class SmokeTest extends BaseTest {
	@Test(priority = 1)
	public void test1() throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
	}

	@Test(priority = 2,dataProvider = "excel1",dataProviderClass = NSDataProvider1.class)
	public void test2(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
	}

	@Test(priority = 3,dataProvider = "excel2",dataProviderClass = NSDataProvider1.class)
	public void test3(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=pwd", s1);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
	}

	@Test(priority = 4,dataProvider = "excel3",dataProviderClass = NSDataProvider1.class)
	public void test4(String s1,String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
	}

	@Test(priority = 5,dataProvider = "excel4",dataProviderClass = NSDataProvider1.class)
	public void test5(String s1,String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
	}

	@Test(priority = 6,dataProvider = "excel5",dataProviderClass = NSDataProvider1.class)
	public void test6(String s1, String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
	}

	@Test(priority = 7,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test7(String s1, String s2) throws InterruptedException {
		if(webtest.isElementPresent("xpath=//a[@class='nav-link text-light dropdown-toggle']")) {
			webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
			Thread.sleep(1000);
			webtest.click("link=退出");
			Thread.sleep(1000);
		}
		
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), true);
		
	}

	@Test(priority = 8,dataProvider = "excel7",dataProviderClass = NSDataProvider1.class)
	public void test8(String s1) throws InterruptedException {
		webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
		Thread.sleep(1000);
		webtest.click("link=退出");
		Thread.sleep(1000);
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
		
		
	}

	@Test(priority = 9,dataProvider = "excel8",dataProviderClass = NSDataProvider1.class)
	public void test9(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=pwd", s1);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
	}

	@Test(priority = 10,dataProvider = "excel9",dataProviderClass = NSDataProvider1.class)
	public void test10(String s1,String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
	}

	@Test(priority = 11,dataProvider = "excel10",dataProviderClass = NSDataProvider1.class)
	public void test11(String s1,String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
	}

	@Test(priority = 12,dataProvider = "excel11",dataProviderClass = NSDataProvider1.class)
	public void test12(String s1,String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isElementPresent("link=首页置顶"), false);
		
	}

	@Test(priority = 13,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test13(String s1,String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		ElementFinder ef = new ElementFinder(driver);
		WebElement element = ef.findElementsByPrefix("xpath=//div[@class='custom-control custom-switch']", 0);
		webtest.click(element);
		Thread.sleep(1000);
		assertEquals(element.isSelected(), false);
		webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
		Thread.sleep(1000);
		webtest.click("link=退出");
		Thread.sleep(1000);
	}

	@Test(priority = 14,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test14(String s1, String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		ElementFinder ef = new ElementFinder(driver);
		WebElement element = ef.findElementsByPrefix("xpath=//div[@class='custom-control custom-switch']", 0);
		webtest.click(element);
		Thread.sleep(1000);
		assertEquals(element.isEnabled(), true);
		webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
		Thread.sleep(1000);
		webtest.click("link=退出");
		Thread.sleep(1000);
	}

	@Test(priority = 15,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test15(String s1, String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		ElementFinder ef = new ElementFinder(driver);
		WebElement element = ef.findElementsByPrefix("xpath=//div[@class='custom-control custom-switch']", 1);
		webtest.click(element);
		Thread.sleep(1000);
		assertEquals(element.isEnabled(), true);
		Thread.sleep(1000);
		webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
		Thread.sleep(1000);
		webtest.click("link=退出");
		Thread.sleep(1000);
	}

	@Test(priority = 16,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test16(String s1, String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		ElementFinder ef = new ElementFinder(driver);
		WebElement element = ef.findElementsByPrefix("xpath=//div[@class='custom-control custom-switch']", 1);
		webtest.click(element);
		Thread.sleep(1000);
		assertEquals(element.isSelected(), false);
		webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
		Thread.sleep(1000);
		webtest.click("link=退出");
		Thread.sleep(1000);
	}

	@Test(priority = 17,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test17(String s1,String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		ElementFinder ef = new ElementFinder(driver);
		WebElement element = ef.findElementsByPrefix("xpath=//div[@class='custom-control custom-switch']", 2);
		webtest.click(element);
		Thread.sleep(1000);
		assertEquals(element.isEnabled(), true);
		webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
		Thread.sleep(1000);
		webtest.click("link=退出");
		Thread.sleep(1000);
	}

	@Test(priority = 18,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test18(String s1, String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		ElementFinder ef = new ElementFinder(driver);
		WebElement element = ef.findElementsByPrefix("xpath=//div[@class='custom-control custom-switch']", 2);
		webtest.click(element);
		Thread.sleep(1000);
		assertEquals(element.isSelected(), false);
		webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
		Thread.sleep(1000);
		webtest.click("link=退出");
		Thread.sleep(1000);
	}

	@Test(priority = 19,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test19(String s1, String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		ElementFinder ef = new ElementFinder(driver);
		WebElement element = ef.findElementsByPrefix("xpath=//div[@class='custom-control custom-switch']", 3);
		webtest.click(element);
		Thread.sleep(1000);
		assertEquals(element.isEnabled(), true);
		webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
		Thread.sleep(1000);
		webtest.click("link=退出");
		Thread.sleep(1000);
	}

	@Test(priority = 20,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test20(String s1, String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		ElementFinder ef = new ElementFinder(driver);
		WebElement element = ef.findElementsByPrefix("xpath=//div[@class='custom-control custom-switch']", 3);
		webtest.click(element);
		Thread.sleep(1000);
		assertEquals(element.isSelected(), false);
		webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
		Thread.sleep(1000);
		webtest.click("link=退出");
		Thread.sleep(1000);
	}

	@Test(priority = 21,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test21(String s1, String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.click("xpath=//td[@class='text-center']/a");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//button[@class='btn btn-info']"), true);
		webtest.click("xpath=//button[@class='btn btn-default']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[@class='nav-link text-light dropdown-toggle']");
		Thread.sleep(1000);
		webtest.click("link=退出");
		Thread.sleep(1000);
	}

	@Test(priority = 22,dataProvider = "excel6",dataProviderClass = NSDataProvider1.class)
	public void test22(String s1, String s2) throws InterruptedException {
		Thread.sleep(1000);
		webtest.open("/index.php/denglu.html");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", s1);
		Thread.sleep(1000);
		webtest.type("name=pwd", s2);
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.click("xpath=//td[@class='text-center']/a");
		Thread.sleep(1000);
		webtest.click("xpath=//button[@class='btn btn-info']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("link=test-delete"), false);
		
	}

	@Test(priority = 23,dataProvider = "excel12",dataProviderClass = NSDataProvider1.class)
	public void test23(String s1) throws InterruptedException {
		
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=guanjianzi", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']/a"), true);
		
	}

	@Test(priority = 24,dataProvider = "excel13",dataProviderClass = NSDataProvider1.class)
	public void test24(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=yonghuming", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']/a"), true);
		
	}

	@Test(priority = 25)
	public void test25() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("name=yonghuming"), true);
		
	}

	@Test(priority = 26,dataProvider = "excel14",dataProviderClass = NSDataProvider1.class)
	public void test26(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.type("xpath=//input[@class='form-control']", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[text()='root']"), true);
		
	}

	@Test(priority = 27,dataProvider = "excel15",dataProviderClass = NSDataProvider1.class)
	public void test27(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.type("xpath=//input[@class='form-control']", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[text()='admin']"), false);
		
	}

	@Test(priority = 28,dataProvider = "excel16",dataProviderClass = NSDataProvider1.class)
	public void test28(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.type("xpath=//input[@class='form-control']", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[text()='lala']"), false);
		
	}

	@Test(priority = 29)
	public void test29() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//div[@class='custom-control custom-switch']");
		Thread.sleep(1000);
		assertEquals(webtest.isChecked("xpath=//div[@class='custom-control custom-switch']"), false);
		
	}

	@Test(priority = 30)
	public void test30() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//div[@class='custom-control custom-switch']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//div[@class='custom-control custom-switch']"), true);
		
	}

	@Test(priority = 31)
	public void test31() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//select[@class='form-control banzhuzu']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//option[text()='普通用户']"), true);
		

	}
	
	@Test(priority = 32)
	public void test32() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//select[@class='form-control banzhuzu']");
		Thread.sleep(1000);
		webtest.click("xpath=//option[text()='实习版主']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//option[text()='实习版主']"), true);
		
	}
	
	@Test(priority = 33)
	public void test33() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//select[@class='form-control banzhuzu']");
		Thread.sleep(1000);
		webtest.click("xpath=//option[text()='副版主']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//option[text()='副版主']"), true);
		
	}
	
	@Test(priority = 34)
	public void test34() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//select[@class='form-control banzhuzu']");
		Thread.sleep(1000);
		webtest.click("xpath=//option[text()='版主']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//option[text()='版主']"), true);
		
	}
	
	@Test(priority = 35)
	public void test35() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//select[@class='form-control banzhuzu']");
		Thread.sleep(1000);
		webtest.click("xpath=//option[text()='普通用户']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//option[text()='普通用户']"), true);
		
	}
	
	@Test(priority = 36)
	public void test36() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//select[@class='form-control yonghuzu']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//option[text()='普通用户']"), true);
		
	}
	
	@Test(priority = 37)
	public void test37() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//select[@class='form-control yonghuzu']");
		Thread.sleep(1000);
		webtest.click("xpath=//option[text()='普通管理员']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//option[text()='普通管理员']"), true);
		
	}
	
	@Test(priority = 38)
	public void test38() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//select[@class='form-control yonghuzu']");
		Thread.sleep(1000);
		webtest.click("xpath=//option[text()='高级管理员']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//option[text()='高级管理员']"), true);
		
	}
	
	@Test(priority = 39)
	public void test39() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=所有用户");
		Thread.sleep(1000);
		webtest.click("xpath=//select[@class='form-control yonghuzu']");
		Thread.sleep(1000);
		webtest.click("xpath=//option[text()='普通用户']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//option[text()='普通用户']"), true);
		
	}
	
	@Test(priority = 40,dataProvider = "excel17",dataProviderClass = NSDataProvider1.class)
	public void test40(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=guanjianzi", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']"), true);
		
	}
	
	@Test(priority = 41,dataProvider = "excel18",dataProviderClass = NSDataProvider1.class)
	public void test41(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=guanjianzi", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']"), true);
		
	}
	
	@Test(priority = 42,dataProvider = "excel19",dataProviderClass = NSDataProvider1.class)
	public void test42(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=guanjianzi", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']"), true);
		
	}
	
	@Test(priority = 43,dataProvider = "excel20",dataProviderClass = NSDataProvider1.class)
	public void test43(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=guanjianzi", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']"), true);
		
	}
	
	@Test(priority = 44,dataProvider = "excel21",dataProviderClass = NSDataProvider1.class)
	public void test44(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=guanjianzi", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']"), true);
		
	}
	
	@Test(priority = 45,dataProvider = "excel22",dataProviderClass = NSDataProvider1.class)
	public void test45(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=guanjianzi", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']"), true);
		
	}
	
	@Test(priority = 46,dataProvider = "excel23",dataProviderClass = NSDataProvider1.class)
	public void test46(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=yonghuming", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']/a"), false);
		
	}
	
	@Test(priority = 47,dataProvider = "excel24",dataProviderClass = NSDataProvider1.class)
	public void test47(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=yonghuming", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']/a"), false);
		
	}
	
	@Test(priority = 48,dataProvider = "excel25",dataProviderClass = NSDataProvider1.class)
	public void test48(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=yonghuming", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']/a"), false);
		
	}
	
	@Test(priority = 49,dataProvider = "excel26",dataProviderClass = NSDataProvider1.class)
	public void test49(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000); 
		webtest.type("name=yonghuming", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']/a"), false);
		
	}
	
	@Test(priority = 50,dataProvider = "excel27",dataProviderClass = NSDataProvider1.class)
	public void test50(String s1) throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("link=主帖");
		Thread.sleep(1000);
		webtest.type("name=yonghuming", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("xpath=//td[@class='text-center']/a"), false);
		
	}

}
