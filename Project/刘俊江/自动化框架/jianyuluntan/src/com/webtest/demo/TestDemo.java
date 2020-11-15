package com.webtest.demo;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.freemarker.WebTestListener;
import com.webtest.core.BaseTest;


@Listeners(WebTestListener.class)
public class TestDemo extends BaseTest{
	
	@BeforeMethod
	public void quit() {
		webtest.click("class=btn-group");
		webtest.click("xpath=/html/body/nav/div[2]/div/a[last()]");
	}
	@Test(description="管理员登录")
	public void test1() {
		webtest.open("http://127.0.0.1:80/index.php/index.html");
		webtest.click("xpath=//a[text()='登录']");
		webtest.type("name=user", "admin");
		webtest.type("name=pwd", "12345678");
		webtest.click("id=submit");
	}
	@Test(description="用户1登录")
	public void test2() {
		webtest.open("http://127.0.0.1:80/index.php/index.html");
		webtest.click("xpath=//a[text()='登录']");
		webtest.type("name=user", "liujunjiang");
		webtest.type("name=pwd", "12345678");
		webtest.click("id=submit");
	}
	
	@Test(description="用户2登录")
	public void test3() {
		webtest.open("http://127.0.0.1:80/index.php/index.html");
		webtest.click("xpath=//a[text()='登录']");
		webtest.type("name=user", "jiangshen1307");
		webtest.type("name=pwd", "12345678");
		webtest.click("id=submit");
	}
	

}

