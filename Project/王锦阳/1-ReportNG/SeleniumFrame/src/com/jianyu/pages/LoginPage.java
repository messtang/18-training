package com.jianyu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jianyu.base.BaseTest;
import com.jianyu.base.WebDriverEngine;

public class LoginPage extends BaseTest{
//	public WebDriver driver;
//	public WebDriverEngine webtest;
	//构造方法
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		this.webtest=new WebDriverEngine(driver);
	}
	//页面元素
	public WebElement a_login() {
		return driver.findElement(By.linkText("登录"));
	}
	public WebElement a_register() {
		return driver.findElement(By.linkText("注册"));
	}
	public WebElement username_text() {
		return driver.findElement(By.name("user"));
	}
	public WebElement password_text() {
		return driver.findElement(By.name("pwd"));
	}
	public WebElement submit_button() {
		return driver.findElement(By.id("submit"));
	}
	//操作方法
	public void login(String username,String password) throws InterruptedException {
		webtest.click(a_login());
		Thread.sleep(1000);
		webtest.sendKeys(username_text(), username);
		Thread.sleep(1000);
		webtest.sendKeys(password_text(), password);
		Thread.sleep(1000);
		webtest.click(submit_button());
		Thread.sleep(1000);
	}
	
}
