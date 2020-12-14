package com.webtest.demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.servlet.annotation.WebListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.freemarker.WebTestListener;
import com.webtest.core.BaseTest;
@Listeners(WebTestListener.class)
public class Demo1 extends BaseTest{
	@Test
	public void demo1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("hello");
		webtest.open("localhost:80/");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", "root");
		Thread.sleep(1000);
		webtest.type("name=pwd", "1309429717mm");
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		webtest.click("link=root");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertEquals(webtest.isElementPresent("link=发新帖"), true);
	}
	
	@Test()
	public void demo2() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("hello");
		webtest.open("localhost:80/");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", "root");
		Thread.sleep(1000);
		webtest.type("name=pwd", "1309429717mm");
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=修改密码");
		Thread.sleep(2000);
		webtest.type("name=opwd", "1309429717mm");
		Thread.sleep(1000);
		webtest.type("name=npwd", "17341803733");
		Thread.sleep(1000);
		webtest.type("name=rpwd", "17341803733");
		Thread.sleep(1000);
		webtest.click("id=formsubmit");
		Thread.sleep(1000);
		webtest.click("link=root");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertEquals(webtest.isElementPresent("link=发新帖"), true);
	}
	
	@Test()
	public void demo3() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("hello");
		webtest.open("localhost:80/");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", "root");
		Thread.sleep(1000);
		webtest.type("name=pwd", "17341803733");
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		Thread.sleep(1000);
		webtest.click("link=修改密码");
		Thread.sleep(2000);
		webtest.type("name=opwd", "17341803733");
		Thread.sleep(1000);
		webtest.type("name=npwd", "1309429717mm");
		Thread.sleep(1000);
		webtest.type("name=rpwd", "1309429717mm");
		Thread.sleep(1000);
		webtest.click("id=formsubmit");
		Thread.sleep(1000);
		assertEquals(webtest.isElementPresent("link=发新帖"), true);
	}
	
	@Test
	public void demo4() throws InterruptedException {
		webtest.open("localhost:80/");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", "root");
		Thread.sleep(1000);
		webtest.type("name=pwd", "1309429717ss");
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		webtest.click("link=root");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertEquals(webtest.isElementPresent("link=发新帖"), true);
	}
	
	@Test
	public void demo5() throws InterruptedException {
		webtest.open("localhost:80/");
		Thread.sleep(3000);
		webtest.click("link=登录");
		Thread.sleep(2000);
		webtest.type("name=user", "root");
		Thread.sleep(1000);
		webtest.type("name=pwd", "1309429717vv");
		Thread.sleep(1000);
		webtest.click("id=submit");
		Thread.sleep(2000);
		assertEquals(webtest.isDisplayed("link=发新帖"), true);
	}
	
}

