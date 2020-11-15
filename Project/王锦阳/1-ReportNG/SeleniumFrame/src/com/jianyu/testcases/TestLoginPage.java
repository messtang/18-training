package com.jianyu.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.jianyu.base.BaseTest;
import com.jianyu.pages.LoginPage;

public class TestLoginPage extends BaseTest{
	LoginPage loginPage;
	
	@BeforeClass
	public void initPage() {
		webtest.open("http://testjianyu:2020/index.php/index.html");
		loginPage=new LoginPage(driver);
	}
	
	@Test(priority=1)
	public void login_fail() throws InterruptedException {
		loginPage.login("jianyu2018", "jianyu");
		WebElement yes=driver.findElement(By.className("jconfirm-buttons"));
		assertEquals(yes.getText(),"确定");
		webtest.click(yes);
		Thread.sleep(1000);
		WebElement firstpage=driver.findElement(By.linkText("首页"));
		webtest.click(firstpage);
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void login_success() throws InterruptedException {
		loginPage.login("jianyu2018", "jianyu2018");
		WebElement admin=driver.findElement(By.linkText("jianyu2018"));
		assertEquals(admin.getText(), "jianyu2018");
	}
	
	@Test
	public void test1() {
		assertEquals(1, 2);
	}
	@Test
	public void test2() {
		assertEquals(2, 2);
	}
	@Test
	public void test3() {
		assertEquals(1, 3);
	}
	@AfterClass
	public void quitPage() {
		driver.quit();
	}
}
