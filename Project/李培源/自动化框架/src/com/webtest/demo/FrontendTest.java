package com.webtest.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FrontendTest extends BaseTest{
	@Test
	public void testLogin() {
		webtest.open("");
		webtest.type("name=","qingdao01");
		webtest.type("name=", "123456");
		webtest.click("");
		
		Assert.assertTrue(webtest.isTextPresent("退出"));
		
	}
}
