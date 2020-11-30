package com.webtest.zssdemo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

/**
 * 我的日常模块
 * 
 * @author 张帅帅
 *
 */

public class SignInTest extends BaseTest {

	@BeforeClass
	public void Login() throws IOException {
		webtest.open("/index.php/denglu.html");
		webtest.type("name=user", ReadProperties.getPropertyValue("username"));
		webtest.type("name=pwd", ReadProperties.getPropertyValue("password"));
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("版块选择"));
	}

	// 点击签到
	@Test(priority = 0)
	public void test_SignIn_click() {
		webtest.click("link=签到");
		assertTrue(webtest.isTextPresent("可签到"));
	}

	// 点击蓝色日期签到
	@Test(priority = 1)
	public void test_date_click() {
		webtest.click("xpath=//button[@class='btn btn-info keqiandao']");
	}

	// 点击上个月
	@Test(priority = 2)
	public void test_lastmonth_click() throws InterruptedException {
		webtest.click("id=shanggeyue");
		assertTrue(webtest.isTextPresent("31"));
	}

	// 点击下个月
	@Test(priority = 3)
	public void test_nextmonth_click() {
		webtest.click("id=xiageyue");
	}

}