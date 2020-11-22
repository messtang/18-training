package com.webtest.demo;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
/*
后台登录界面
*/

public class Admin_Login  extends BaseTest{

    @Test(dataProviderClass = JDataProvider.class,dataProvider = "loginData")
    public void test_Login(String username,String password) {
        webtest.open("/index.php/denglu.html");

        webtest.type("name=user", username);
        webtest.type("name=pwd", password);
        webtest.click("id=submit");
        assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
    }


//	@Test
////	public void testLogin1() {
////
////		webtest.open("/index.php/denglu.html");
////
////		webtest.type("name=user", "admin");
////		webtest.type("name=pwd", "admin1234");
////        webtest.click("id=submit");
////		assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
////	}
////
////	@Test
////	public void testLogin2() {
////
////		webtest.open("/index.php/denglu.html");
////
////		webtest.type("name=user", "admin");
////		webtest.type("name=pwd", "");
////        webtest.click("id=submit");
////		assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
////	}
}
