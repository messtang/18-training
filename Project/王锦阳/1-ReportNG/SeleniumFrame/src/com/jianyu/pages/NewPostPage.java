package com.jianyu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jianyu.base.BaseTest;
import com.jianyu.base.WebDriverEngine;

public class NewPostPage extends BaseTest{
//构造方法
	public NewPostPage(WebDriver driver) {
		this.driver=driver;
		this.webtest=new WebDriverEngine(driver);
	}
//页面元素
	//选择版块
	public WebElement button_section() {
		return driver.findElement(By.linkText("请选择发布到哪个版块"));
	}
	//选择类型
	public WebElement button_type() {
		return driver.findElement(By.xpath("//button[@text='请选择类型']"));
	}
	//输入标题
	public WebElement text_headline() {
		return driver.findElement(By.name("biaoti"));
	}
	//输入内容
	public WebElement textarea_content() {
		return driver.findElement(By.className("HandyEditor_editor"));
	}
	//加粗
	public WebElement button_overstriking() {
		return driver.findElement(By.className("he-bold"));
	}
	//斜体
	public WebElement button_bias() {
		return driver.findElement(By.className("he-italic"));
	}
	//附件
	public WebElement text_accessory() {
		return driver.findElement(By.id("fujian"));
	}
	//提交
	public WebElement button_submit() {
		return driver.findElement(By.id("formsubmit"));
	}
//操作方法
	public WebElement select_section(String Sectionname) throws InterruptedException {
		webtest.click(button_section());
		Thread.sleep(1000);
		return driver.findElement(By.linkText(Sectionname));
	}
	public WebElement select_type(String Typename) throws InterruptedException {
		webtest.click(button_type());
		Thread.sleep(1000);
		return driver.findElement(By.linkText(Typename));
	}
	public void post_message(String Sectionname,String Typename,String title,
			String content,boolean overstriking,boolean bias,String accessory) throws InterruptedException {
		webtest.click(button_section());
		Thread.sleep(1000);
		webtest.click(driver.findElement(By.linkText(Sectionname)));
		Thread.sleep(1000);
//		webtest.click(select_type(Typename));
//		Thread.sleep(1000);
//		webtest.sendKeys(text_headline(), title);
//		Thread.sleep(1000);
//		if(overstriking) {
//			webtest.click(button_overstriking());
//			Thread.sleep(1000);
//		}
//		if(bias) {
//			webtest.click(button_bias());
//			Thread.sleep(1000);
//		}
//		webtest.sendKeys(textarea_content(), content);
//		Thread.sleep(1000);
////		webtest.sendKeys(text_accessory(), accessory);
////		Thread.sleep(1000);
//		webtest.click(button_submit());
//		Thread.sleep(1000);
	}

}
