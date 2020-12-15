package com.webtest.xldemo;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//作者：徐良
public class TestDemo extends BaseTest{

	//测试登录的方法
	@Test(dataProviderClass=XDataProvider.class,dataProvider = "loginData")
	private void testLogin(String username,String password) throws InterruptedException, IOException {
		webtest.open("/index.php/denglu.html");
		Thread.sleep(500);
		webtest.type("name=user",username);
        webtest.type("name=pwd", password);
        Thread.sleep(500);
        webtest.click("id=submit");
        assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
        webtest.click("xpath=/html/body/nav/div[1]/ul/li[4]");
	}
	//测试注册的方法
	@Test(dataProviderClass=XDataProvider.class,dataProvider ="registerData")
	public void testRegister(String username,String password,String again,String mail) throws InterruptedException {
		webtest.open("/index.php/zhuce.html");
		Thread.sleep(500);
		webtest.type("name=user",username);
        webtest.type("name=pwd", password);
        Thread.sleep(500);
        webtest.type("name=repeat",again);
        webtest.type("name=email", mail);
        Thread.sleep(500);
        webtest.click("id=submit");
        assertTrue(webtest.isTextPresent("登陆成功"));
        webtest.click("xpath=/html/body/nav/div[1]/ul/li[4]");
	}
	//测试签到状态的方法
	@Test
	public void testQiandao() throws InterruptedException {
		webtest.open("/index.php/index.html");
		Thread.sleep(500);
		webtest.click("id=qiandao");
		assertTrue(webtest.isTextPresent("已签到"));
	}
	//测试发帖的方法
	@Test
	public void testFatie() throws InterruptedException {
		webtest.open("/index.php/index.html");
		Thread.sleep(500);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div[1]/div/div[2]/a");
		assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
	}
	//测试搜索框的方法
	@Test
	public void testFind() throws InterruptedException {
		webtest.open("/index.php/index.html");
		Thread.sleep(500);
		webtest.type("name=find", "");
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div[3]/form/div/div/button");
		assertTrue(webtest.isTextPresent("搜索结果"));
	}
}
