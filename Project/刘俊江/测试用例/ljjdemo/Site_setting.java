package com.webtest.ljjdemo;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.webtest.utils.ReadProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import java.io.IOException;


//@Listeners(WebTestListener.class)
public class Site_setting extends BaseTest{
	
	@BeforeMethod(description="管理员登录")
	public void login_to() throws IOException {
		webtest.open("/index.php/denglu.html");
		webtest.type("name=user", ReadProperties.getPropertyValue("admin_username"));
		webtest.type("name=pwd", ReadProperties.getPropertyValue("admin_password"));
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
		webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTo(0,document.getElementById('jianyuluntansidebar').scrollHeight)");
		webtest.click("xpath=//a[text()='网站设置']");
	}
	
	@AfterMethod
	public void submitAndQuit() {
		webtest.click("xpath=//a[text()='退出']");
		assertEquals(webtest.isDisplayed("class=navbar-brand"), true);
	}
	
	
	@Test(description="论坛名称",dataProvider="forum_title",dataProviderClass= Excel_data.class)
	public void test_forum_title_enter(String title) {
		webtest.typeAndClear("name=title", title);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=formsubmit");
		webtest.click("xpath=//a[text()='网站设置']");
		assertEquals(webtest.getValue("name=title"), title);
		
	}
	
	@Test(description="论坛副名称",dataProvider="forum_subtitle",dataProviderClass=Excel_data.class)
	public void test_forum_subtitle_enter(String subtitle) {
		webtest.typeAndClear("name=subtitle", subtitle);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=formsubmit");
		webtest.click("xpath=//a[text()='网站设置']");
		assertEquals(webtest.getValue("name=subtitle"), subtitle);
	}
	
	
}

