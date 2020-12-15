package com.webtest.wjydemo;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.BNSDataProvider;

/**
 * 王锦阳
 */
public class TestNewPost extends BaseTest{
	@Test(priority=1,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void newPostSuccess_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
//		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.click("id=formsubmit");
		//Thread.sleep(1000);
		webtest.click("link=我的主帖");
		assertTrue(webtest.isTextPresent(title));
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=2)
	public void newPostFail_test() throws InterruptedException {
		webtest.click("id=formsubmit");
		//Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("出错"));
//		Thread.sleep(100);
		webtest.click("xpath=/html/body/div[11]/div[2]/div/div/div/div/div/div/div/div[4]/button");
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=3,dataProvider="excel1",dataProviderClass=BNSDataProvider.class)
	public void withTheAttachment_test(String Sectionname,String Typename,String title,String content,String filePath) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
//		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.type("id=fujian", filePath);
//		//Thread.sleep(1000);
		webtest.click("id=formsubmit");
		//Thread.sleep(1000);
		webtest.click("link=我的主帖");
		assertTrue(webtest.isTextPresent(title));
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=4,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void IntegralPositiveInt_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
//		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.type("name=jifen", "2");
//		//Thread.sleep(1000);
		webtest.click("id=formsubmit");
		//Thread.sleep(1000);
		webtest.click("link=我的主帖");
		assertTrue(webtest.isTextPresent(title));
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=5,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void IntegralNegativeInt_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
//		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.type("name=jifen", "-2");
//		//Thread.sleep(1000);
		webtest.click("id=formsubmit");
		//Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("出错"));
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[11]/div[2]/div/div/div/div/div/div/div/div[4]/button");
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=6,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void IntegralFloat_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
//		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.type("name=jifen", "2.5");
//		//Thread.sleep(1000);
		webtest.click("id=formsubmit");
		//Thread.sleep(1000);
		webtest.click("link=我的主帖");
		assertTrue(webtest.isTextPresent(title));
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=7,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void IntegralChar_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
//		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.type("name=jifen", "a");
//		//Thread.sleep(1000);
		webtest.click("id=formsubmit");
		//Thread.sleep(1000);
		webtest.click("link=我的主帖");
		assertTrue(webtest.isTextPresent(title));
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=8,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textOverstriking_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
//		//Thread.sleep(1000);
		webtest.click("class=he-bold");
//		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//b")).getText(), content);
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=9,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textBias_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
//		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
//		//Thread.sleep(1000);
		webtest.click("class=he-italic");
//		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//i")).getText(), content);
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=10,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textStrikethrough_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
//		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
//		//Thread.sleep(1000);
		webtest.click("class=he-strike");
//		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//strike")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=11,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textUnderline_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
//		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
//		//Thread.sleep(1000);
		webtest.click("class=he-underline");
//		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//u")).getText(), content);
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=12,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textFontSize_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
//		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
//		//Thread.sleep(1000);
		webtest.click("link="+Typename);
//		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
//		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
//		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
//		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
//		//Thread.sleep(1000);
		webtest.click("class=he-fontsize");
//		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_2");
//		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//font")).getAttribute("size"), "2");
//		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=13,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textFont_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-font-2");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_songti");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//font")).getAttribute("face"), "SimSun");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=14,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textParagraph_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-h-sigh");
		//Thread.sleep(1000);
		webtest.click("xpath=//div[@id='HandyEditor_newdiv_down_paragraph_1']//h1");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//h1")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=15,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textStrikethroughAndUnderline_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-underline");
		//Thread.sleep(1000);
		webtest.click("class=he-strike");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//strike//u")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=16,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textFontsizeAndParagraph_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-h-sigh");
		//Thread.sleep(1000);
		webtest.click("xpath=//div[@id='HandyEditor_newdiv_down_paragraph_1']//h1");
		//Thread.sleep(1000);
		webtest.click("class=he-fontsize");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_2");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//h1//font")).getAttribute("size"), "2");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=17,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textColor_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-font-1");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_colorblock_base_ff0000");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_colorok");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//font")).getAttribute("color"), "#ff0000");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=18,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textBackgroundColor_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-vkontakte");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_colorblock_base_ffff00");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_backcolorok");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//span")).getAttribute("style"), "background-color: rgb(255, 255, 0);");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=19,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAlignCenter_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-align-center");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//div")).getAttribute("align"), "center");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=20,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAlignLeft_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-align-left");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//div")).getAttribute("align"), "left");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=21,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAlignRight_test(String Sectionname,String Typename,String title,String content) throws InterruptedException {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-align-right");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//div")).getAttribute("align"), "right");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=22,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textJustify_test(String Sectionname,String Typename,String title,String content) throws InterruptedException {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-align-justify");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//div")).getAttribute("align"), "justify");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=23,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textRetract_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-indent-right");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//blockquote")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=24,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textCancleRetract_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-indent-right");
		//Thread.sleep(1000);
		webtest.click("class=he-indent-left");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=25,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textLink_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-link");
		//Thread.sleep(1000);
		webtest.type("id=HandyEditor_newdiv_down_link","https://www.baidu.com/");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_linkok");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//a")).getAttribute("href"), "https://www.baidu.com/");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=26,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textCancleLink_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-link");
		//Thread.sleep(1000);
		webtest.type("id=HandyEditor_newdiv_down_link","https://www.baidu.com/");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_linkok");
		//Thread.sleep(1000);
		webtest.click("class=he-unlink");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=27,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textLinkError_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-link");
		//Thread.sleep(1000);
		webtest.type("id=HandyEditor_newdiv_down_link","aaa");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_linkok");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//a")).getAttribute("href"), "http://testjianyu:2020/index.php/user/index/aaa");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=28,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaAdd_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.click("xpath=//div[@class='HandyEditor_editor']/pre");
		//Thread.sleep(1000);
		webtest.type("xpath=//div[@class='HandyEditor_editor']",content);
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=29,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textrevocation_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-bold");
		//Thread.sleep(1000);
		webtest.click("class=he-italic");
		//Thread.sleep(1000);
		webtest.click("class=he-reply");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//b")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=30,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textProcedureCode_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-code");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_js");
		//Thread.sleep(1000);
		webtest.click("xpah=//div[@class='HandyEditor_editor']//pre");
		//Thread.sleep(1000);
		webtest.type("xpath=//div[@class='HandyEditor_editor']",content);
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre")).getAttribute("class"), " prettyprint lang-js");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=31,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaOverstriking_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-bold");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre//b")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=32,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaBias_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-italic");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre//i")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=33,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaStrikethrough_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-strike");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre//strike")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=34,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaUnderline_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-underline");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre//u")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=35,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaFontSize_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-fontsize");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_2");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//font")).getAttribute("size"), "2");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=36,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaFont_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-font-2");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_songti");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre//font")).getAttribute("face"), "SimSun");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=37,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaParagraph_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-h-sigh");
		//Thread.sleep(1000);
		webtest.click("xpath=//div[@id='HandyEditor_newdiv_down_paragraph_1']//h1");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//h1")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=38,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaStrikethroughAndUnderline_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-underline");
		//Thread.sleep(1000);
		webtest.click("class=he-strike");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre//strike//u")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=39,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaFontsizeAndParagraph_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-h-sigh");
		//Thread.sleep(1000);
		webtest.click("xpath=//div[@id='HandyEditor_newdiv_down_paragraph_1']//h1");
		//Thread.sleep(1000);
		webtest.click("class=he-fontsize");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_2");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//h1//font")).getAttribute("size"), "2");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=40,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaColor_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-font-1");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_colorblock_base_ff0000");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_colorok");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre//font")).getAttribute("color"), "#ff0000");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=41,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaBackgroundColor_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-vkontakte");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_colorblock_base_ffff00");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_backcolorok");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre//span")).getAttribute("style"), "background-color: rgb(255, 255, 0);");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=42,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaAlignCenter_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-align-center");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//div")).getAttribute("align"), "center");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=43,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaAlignLeft_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-align-left");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//div")).getAttribute("align"), "left");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=44,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaAlignRight_test(String Sectionname,String Typename,String title,String content) throws InterruptedException {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-align-right");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//div")).getAttribute("align"), "right");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=45,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaJustify_test(String Sectionname,String Typename,String title,String content) throws InterruptedException {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-align-justify");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//div")).getAttribute("align"), "justify");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=46,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaRetract_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-indent-right");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//blockquote//pre")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=47,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaCancleRetract_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-indent-right");
		//Thread.sleep(1000);
		webtest.click("class=he-indent-left");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=48,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaLink_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-link");
		//Thread.sleep(1000);
		webtest.type("id=HandyEditor_newdiv_down_link","https://www.baidu.com/");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_linkok");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre//a")).getAttribute("href"), "https://www.baidu.com/");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=49,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaCancleLink_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-link");
		//Thread.sleep(1000);
		webtest.type("id=HandyEditor_newdiv_down_link","https://www.baidu.com/");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_linkok");
		//Thread.sleep(1000);
		webtest.click("class=he-unlink");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre")).getText(), content);
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
	@Test(priority=50,dataProvider="excel",dataProviderClass=BNSDataProvider.class)
	public void textAreaLinkError_test(String Sectionname,String Typename,String title,String content) throws Exception {
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Sectionname);
		//Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/div[1]/div[2]/div/div/button");
		//Thread.sleep(1000);
		webtest.click("link="+Typename);
		//Thread.sleep(1000);
		webtest.type("name=biaoti", title);
		//Thread.sleep(1000);
		webtest.click("class=HandyEditor_editor");
		//Thread.sleep(1000);
		webtest.type("class=HandyEditor_editor", content);
		//Thread.sleep(1000);
		webtest.click("class=he-imdb");
		//Thread.sleep(1000);
		webtest.click("class=he-cursor");
		//Thread.sleep(1000);
		webtest.click("class=he-link");
		//Thread.sleep(1000);
		webtest.type("id=HandyEditor_newdiv_down_link","aaa");
		//Thread.sleep(1000);
		webtest.click("id=HandyEditor_newdiv_down_linkok");
		//Thread.sleep(1000);
		assertEquals(driver.findElement(By.xpath("//div[@class='HandyEditor_editor']//pre//a")).getAttribute("href"), "http://testjianyu:2020/index.php/user/index/aaa");
		//Thread.sleep(1000);
		webtest.click("link=发新帖");
	}
}
