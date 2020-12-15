package com.webtest.xxqdemo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;
import com.webtest.zssdemo.ZSS_DataProvider;

/**
 * 我的足迹
 * @author 邢晓倩
 *59条用例，其中FAIL：9个
 */
public class XXQ_test extends BaseTest{
	
	@BeforeClass
	public void Login() throws IOException {
		webtest.open("/index.php/denglu.html");
		webtest.type("name=user", ReadProperties.getPropertyValue("xxquser"));
		webtest.type("name=pwd", ReadProperties.getPropertyValue("xxqpassword"));
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("版块选择"));
	}
	@Test(priority = 1)
    public void shoucang_test_click1(){
  		//点击我的收藏
  		webtest.click("link=我的收藏");
  		assertTrue(webtest.isTextPresent("收藏时间"));
	
	}
	
	@Test(priority = 2)
	public void shoucang_test_click2() throws InterruptedException{
	      //点击删除按钮
		
	      webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/table/tbody/tr/td[3]/a/i[1]");
	
	      webtest.click("xpath=//button[text()='取消']");
	      
	}
	@Test(priority = 3)
	public void shoucang_test_click3(){
		//  点击帖子标题链接
		webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/table/tbody/tr[1]/td[1]/a");
		////点赞
		    //确定网页（爬虫webDriverEngine.java文件）
	    webtest.getWindow(1);
		    //点赞
		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div[2]/div/div[3]/button[1]");
	    //点确认
	    webtest.click("xpath=//button[text()='确定']");
	}

 	
	@Test(priority = 4)
	public void shoucang_test_click4(){
	    //点踩
		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div[2]/div/div[3]/button[2]");
	    //点确认
	    webtest.click("xpath=//button[text()='确定']");
	}
	@Test(priority = 5)
	public void shoucang_test_click5(){
	    //点收藏
		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div[2]/div/div[3]/button[3]");
	    //点确认
	    webtest.click("xpath=//button[text()='确定']");
	}
	//7条用例
	@Test(priority = 6,dataProviderClass = XXQ_DataProvider.class, dataProvider = "neirong")
	public void shoucang_test_click5(String neirong) throws InterruptedException {
	    //点击第一条评论的回复
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[2]/button");
	    //点击输入框
	    //webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[4]/div/div[1]/div[3]");
	    //输入
	   
         webtest.typeAndClear("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[4]/div/div[1]/div[3]",neirong);
         Thread.sleep(2000);
	    
	    webtest.click("id=quxiaohuifu");
	 }
	//7条用例
	@Test(priority = 12,dataProviderClass = XXQ_DataProvider.class, dataProvider = "neirong")
	public void shoucang_test_click6(String neirong) throws InterruptedException {
	    //点击第一条评论的回复
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[2]/button");
	    //点击输入框
	    //webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[4]/div/div[1]/div[3]");
	    //输入
	    
          webtest.typeAndClear("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[4]/div/div[1]/div[3]",neirong);
          Thread.sleep(2000);
	    
	    webtest.click("id=huifu");
	 }
	@Test(priority = 7)
	public void shoucang_test_click7() throws InterruptedException{
		//webtest.getWindow(1);
	    //点排序
//	     webtest.click("xpath=//a[@class=btn btn-light btn-sm text-black-50]/i");
	  webtest.mouseToElementandClick("xpath=/html/body/div[1]/div/div[1]/div/ul/li[1]/div/a");
	  
	  Thread.sleep(2000);
	    //点击按时间排序
	 	webtest.click("link=按最新跟帖");
	 	//点击第一条评论的删除
	 	webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[1]/a[2]");
	 	//取消
	 	webtest.click("xpath=/html/body/div[22]/div[2]/div/div/div/div/div/div/div/div[4]/button[2]");
	     //assertTrue(webtest.isTextPresent("错误"));
	 }

	 //7个用例
     @Test(priority = 8,dataProviderClass = XXQ_DataProvider.class, dataProvider = "neirong")
		public void shoucang_test_click8(String neirong) throws InterruptedException{ 
	      //点击第一条评论的修改
	  	  webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[1]/a[1]");
	  	  //修改
	      webtest.typeAndClear("class=HandyEditor_editor",neirong);
	      Thread.sleep(2000);
	  	  //取消
	  	  webtest.click("xpath=//button[text()='取消']");
	  	     //assertTrue(webtest.isTextPresent("错误"));
	  }
	 //7个用例
	 @Test(priority = 9,dataProviderClass = XXQ_DataProvider.class, dataProvider = "neirong")
		public void shoucang_test_clic9(String neirong) throws InterruptedException{ 
	      //点击第一条评论的修改
	   	  webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[1]/a[1]");
	   	  //修改
	       webtest.typeAndClear("class=HandyEditor_editor",neirong);
	       Thread.sleep(2000);
	   	  //继续
	   	  webtest.click("xpath=//button[text()='继续']");
	  	     //assertTrue(webtest.isTextPresent("错误"));
	  }

	 
		@Test(priority = 10)
	    public void shoucang_test_click10() throws InterruptedException{
	        //点排序
		  webtest.mouseToElementandClick("xpath=/html/body/div[1]/div/div[1]/div/ul/li[1]/div/a");
		  
		  Thread.sleep(2000);
		    //点击按时间排序
	 	  webtest.click("link=按最新跟帖");
	  	    //点击第一条评论的删除
	  	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[1]/a[2]");
	  	    //继续
	  	    webtest.click("xpath=//button[text()='继续']");
	  }
	 //7条
	 @Test(priority = 11,dataProviderClass = XXQ_DataProvider.class, dataProvider = "neirong")
	 public void shoucang_test_click11(String neirong) throws InterruptedException{ 
	 	//点击输入框
	 	webtest.click("xpath=/html/body/div/div/div[1]/div/div[3]/div[2]/div[1]/div[3]");
	 	//输入
	 	webtest.typeAndClear("xpath=/html/body/div/div/div[1]/div/div[3]/div[2]/div[1]/div[3]",neirong);
	 	Thread.sleep(2000);
	     //点击跟帖
	    webtest.click("id=gentie");
	 }
	 @Test(priority = 12)
	    public void shoucang_test_click12()throws InterruptedException{
	        //点排序
		  webtest.mouseToElementandClick("xpath=/html/body/div[1]/div/div[1]/div/ul/li[1]/div/a");
		  
		  Thread.sleep(2000);
		    //点击按顺序排序
	 	  webtest.click("link=按跟帖顺序");
	 }
		 
	 @Test(priority = 13)
	    public void shoucang_test_click13(){
			//点首页
	     	webtest.click("xpath=//a[text()='首页']");
      	////点击头像
	     	   //确定网页页面
	        webtest.getWindow(1);
	           //点击头像
	        webtest.click("id=navbarDropdowny");
	        //点击用户中心
	        webtest.click("link=用户中心");
	 }
	
	
     @Test(priority = 20)
	    public void cai1_test_click1() throws InterruptedException{
	  	//收起前两个模块
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[1]/i");
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[3]/i");
	     //点击踩过的跟帖
  		webtest.click("link=踩过的跟帖");
  		assertTrue(webtest.isTextPresent("踩过的时间"));
	
	 }
     @Test(priority=21)
     public void cai1_test_click2() throws InterruptedException{
    	 //点击主贴链接
    	 webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/table/tbody/tr[1]/td[1]/a");
    	 //点击首页，回到用户中心
    	   //点首页
     	webtest.click("xpath=//a[text()='首页']");
           //点击头像
     	   //确定网页页面
        webtest.getWindow(1);
           //点击头像
        webtest.click("id=navbarDropdowny");
        //点击用户中心
        webtest.click("link=用户中心");
    	 
     }
	 
	 @Test(priority = 22)
    public void zhifu_test_click1() throws InterruptedException{
		//收起前两个模块
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[1]/i");
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[3]/i");
  		//点击支付过的帖子
  		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[8]/nav/a[3]");
  		assertTrue(webtest.isTextPresent("支付时间"));
	
	 }
	@Test(priority = 23)
	    public void zhifu_test_click2() throws InterruptedException{
		//点击主贴链接
    	 webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/table/tbody/tr[1]/td[1]/a");
		//点击首页，回到用户中心
		   //点首页
		webtest.click("xpath=//a[text()='首页']");
		     //点击头像
		   //确定网页页面
		webtest.getWindow(1);
		     //点击头像
		webtest.click("id=navbarDropdowny");
		  //点击用户中心
		webtest.click("link=用户中心");
		
	}
	 
	 @Test(priority = 24)
    public void zan_test_click1() throws InterruptedException{
		//收起前两个模块
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[1]/i");
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[3]/i");
  		//点击赞过的帖子
  		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[8]/nav/a[4]");
  		assertTrue(webtest.isTextPresent("点赞时间"));
	
	 }
	 @Test(priority = 25)
	    public void zan_test_click2() throws InterruptedException{
		//点击主贴链接
	 	webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/table/tbody/tr[1]/td[1]/a");
	 	//点击首页，回到用户中心
		   //点首页
		webtest.click("xpath=//a[text()='首页']");
		     //点击头像
		   //确定网页页面
		webtest.getWindow(1);
		     //点击头像
		webtest.click("id=navbarDropdowny");
		  //点击用户中心
		webtest.click("link=用户中心");
	}
	 @Test(priority = 26)
    public void cai_test_click1() throws InterruptedException{
		//收起前两个模块
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[1]/i");
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[3]/i");
  		//点击踩过的帖子
  		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[8]/nav/a[5]");
  		assertTrue(webtest.isTextPresent("踩过的时间"));
	
	 }
	 @Test(priority = 27)
	    public void cai_test_click2() throws InterruptedException{
		//点击主贴链接
	 	webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/table/tbody/tr/td[1]/a");
	 	//点击首页，回到用户中心
		   //点首页
		webtest.click("xpath=//a[text()='首页']");
		     //点击头像
		   //确定网页页面
		webtest.getWindow(1);
		     //点击头像
		webtest.click("id=navbarDropdowny");
		  //点击用户中心
		webtest.click("link=用户中心");
	}
	@Test(priority = 28)
	    public void zan1_test_click1() throws InterruptedException{
		//收起前两个模块
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[1]/i");
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[3]/i");
  		//点击赞过的跟帖
  		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[8]/nav/a[6]");
  		assertTrue(webtest.isTextPresent("点赞时间"));
	
	 }
	@Test(priority = 29)
    public void zan1_test_click2() throws InterruptedException{
	//点击主贴链接
 	 webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/table/tbody/tr[1]/td[1]/a");
 	 
}
	

	
	
}
