package com.webtest.ljjdemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.webtest.utils.ReadProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import java.io.IOException;

public class Level_setting extends BaseTest{
	@BeforeMethod(description="管理员登录")
	public void login_to() throws IOException {
		webtest.open("/index.php/denglu.html");
		webtest.type("name=user", ReadProperties.getPropertyValue("admin_username"));
		webtest.type("name=pwd", ReadProperties.getPropertyValue("admin_password"));
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
		webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTo(0,document.getElementById('jianyuluntansidebar').scrollHeight)");
		webtest.click("xpath=//a[text()='等级设置']");
	}
	
	@AfterMethod
	public void submitAndQuit() throws InterruptedException {
		webtest.click("xpath=//a[text()='退出']");
		assertEquals(webtest.isDisplayed("class=navbar-brand"), true);
	}
	
	@Test(description="等级描述",dataProvider="level_description",dataProviderClass= Excel_data.class)
	public void test_level_description(String level) {
		webtest.typeAndClear("class=djmiaoshu", level);
		webtest.click("xpath=//a[text()='等级设置']");
		assertEquals(webtest.getValue("class=djmiaoshu"), level);
		
	}
	
	@Test(description="所需成长值",dataProvider="required_growth_value",dataProviderClass=Excel_data.class)
	public void test_required_growth_value(String value) {
		webtest.typeAndClear("class=djzhi", value);
		webtest.click("xpath=//a[text()='等级设置']");
		assertEquals(webtest.getValue("class=djzhi"), value);
	}
	
	
}
