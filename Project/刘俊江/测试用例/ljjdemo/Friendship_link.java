package com.webtest.ljjdemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.webtest.utils.ReadProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import java.io.IOException;

public class Friendship_link extends BaseTest{
	@BeforeMethod(description="管理员登录")
	public void login_to() throws IOException {
		webtest.open("/index.php/denglu.html");
		webtest.type("name=user", ReadProperties.getPropertyValue("admin_username"));
		webtest.type("name=pwd", ReadProperties.getPropertyValue("admin_password"));
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
		webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTo(0,document.getElementById('jianyuluntansidebar').scrollHeight)");
		
	}
	
	@AfterMethod
	public void submitAndQuit() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=formsubmit");
		webtest.click("xpath=//a[text()='退出']");
		assertEquals(webtest.isDisplayed("class=navbar-brand"), true);
	}
	
	@Test(description="添加友情链接",dataProvider="friendship_link_add",dataProviderClass= Excel_data.class)
	public void test_friendship_link_add(String name,String url) {
		webtest.click("xpath=//a[text()='添加友情链接']");
		webtest.typeAndClear("name=mingcheng", name);		
		webtest.typeAndClear("name=dizhi", url);
		webtest.click("xpath=//label[@class='custom-control-label']");
	}

	@Test(description="友情链接排序",dataProvider="friendship_link_sort",dataProviderClass=Excel_data.class)
	public void test_friendship_link_sort(String num) {
		webtest.click("xpath=//a[text()='所有友情链接']");
		webtest.typeAndClear("class=form-control-sm",num);
		webtest.click("class=submit");
	}

	
}
