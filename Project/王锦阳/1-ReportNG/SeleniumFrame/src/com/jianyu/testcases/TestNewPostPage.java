package com.jianyu.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jianyu.base.BaseTest;
import com.jianyu.pages.LoginPage;
import com.jianyu.pages.NewPostPage;

public class TestNewPostPage extends BaseTest{
	NewPostPage newPostPage;
	@BeforeClass
	public void initPage() throws InterruptedException {
		webtest.open("http://testjianyu:2020/index.php/index.html");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("jianyu2018", "jianyu2018");
	}
//	@Test
//	public void newPost() throws InterruptedException {
//		Thread.sleep(1000);
//		newPostPage.post_message("新闻", "原创", "测试标题", "内容加粗不斜线", true, false, "D:\\test\\s1.jpg");
//	}
	@Test
	public void test1() {
		assertEquals(1, 1);
	}

}
