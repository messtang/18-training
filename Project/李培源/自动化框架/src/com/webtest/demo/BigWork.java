package com.webtest.demo;


import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
public class BigWork extends BaseTest{
	
	@Test
	public void test1() throws InterruptedException {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("link=登录");
		webtest.type("id=user", "lipeiyuan1");
		Thread.sleep(1000);
		webtest.type("id=pw", "lipeiyuan");
		Thread.sleep(1000);
		webtest.click("class=submit");
		Thread.sleep(3000);
	}
	
	@Test
	public void test2() throws InterruptedException {
		webtest.click("partLink=我的空间");
		Thread.sleep(1000);
		webtest.click("partLink=点我写游记");
		Thread.sleep(2000);
		webtest.type("id=title", "江南烟雨");
		Thread.sleep(1000);
		webtest.enterFrame1("class=ke-edit-iframe");
		Thread.sleep(1000);
		webtest.click("tag=body");
		webtest.type("tag=body", "lalalala");
		Thread.sleep(1000);
		webtest.leaveFrame();
		Thread.sleep(1000);
		webtest.click("xpath=//input[@type = 'submit']");
		Thread.sleep(3000);
		webtest.goBack();
		Thread.sleep(1000);
		webtest.enterFrame1("class=ke-edit-iframe");
		Thread.sleep(1000);
		webtest.click("tag=body");
		webtest.type("tag=body", "bulabula");
		Thread.sleep(1000);
		webtest.leaveFrame();
		Thread.sleep(1000);
		webtest.click("xpath=//input[@type = 'submit']");
		Thread.sleep(1000);
	}
	
	@Test
	public void test3() throws InterruptedException {
		webtest.click("partLink=我的空间");
		Thread.sleep(1000);
		webtest.click("link=个人相册");
		Thread.sleep(1000);
		webtest.click("class=show_advset");
		Thread.sleep(1000);
		webtest.type("xpath=//input[@type='file']","D:\\SpringWind\\1.png");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='上传']");	
		Thread.sleep(1000);


	}
	
	@Test
	public void test4() throws InterruptedException {
		webtest.open("http://www.roqisoft.com/zhsx/blog/");
		Thread.sleep(1000);
		webtest.click("partLink=非常满意");
		Thread.sleep(1000);
		webtest.type("name=comment", "nice！");
		Thread.sleep(1000);
		webtest.click("name=submit");
		Thread.sleep(1000);
		
	}
}
