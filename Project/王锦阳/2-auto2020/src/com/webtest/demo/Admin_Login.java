package com.webtest.demo;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Admin_Login  extends BaseTest{
	
	@Test
	public void testLogin1() {
		
		webtest.open("https://www.baidu.com");
		
//		webtest.type("name=username", "admin");
//		webtest.type("name=password", "admin");
//		webtest.click("xpath=//input[@type='submit']");
//		assertTrue(webtest.isTextPresent("退出"));
	}

	@Test
	public void testLogin2() {
		
		webtest.open("/admin.php/Login/index.html");
		
		webtest.type("name=username", "admin");
		webtest.type("name=password", "admin1");
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("退出"));
	}
}
