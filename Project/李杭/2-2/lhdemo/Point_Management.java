package com.webtest.lhdemo;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

/*
积分管理
运行结果:14个test,通过9个,不通过5个
 */
public class Point_Management extends BaseTest {

    @BeforeMethod
    public void login() throws IOException {
        webtest.open("/index.php/denglu.html");

        webtest.type("name=user", ReadProperties.getPropertyValue("admin_username"));
        webtest.type("name=pwd", ReadProperties.getPropertyValue("admin_password"));
        webtest.click("id=submit");
        assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
    }

    @Test(description = "用户名",
            dataProviderClass = JDataProvider.class,dataProvider = "userNamePointData")
    public void test_username_point(String username){
        webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTop=300");
        webtest.click("link=用户积分");
        if(!username.equals("")){
            webtest.type("name=yonghuming",username);
        }
        webtest.click("xpath=//button[@type='submit']");
    }

    @Test(description = "增加/减少积分",
            dataProviderClass = JDataProvider.class,dataProvider = "changePointData")
    public void test_add_point(String name,String add_point,String sub_point) throws InterruptedException {
        webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTop=300");
//        webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTo(0,document.getElementById('jianyuluntansidebar').scrollHeight)");
        webtest.click("link=用户积分");
        webtest.type("name=yonghuming",name);
        webtest.click("xpath=//button[@type='submit']");
        if(!add_point.equals("")){
            webtest.type("xpath=//input[@placeholder='输入增加数量']",add_point);
            webtest.tapClick();
            webtest.enter();
            Thread.sleep(3000);
        }
        if(!sub_point.equals("")){
            webtest.type("xpath=//input[@placeholder='输入减少数量']",sub_point);
            webtest.tapClick();
            webtest.enter();
            Thread.sleep(3000);
        }
//      判断没有出错的弹窗
        Assert.assertFalse(webtest.isElementPresent("class=jconfirm-title-c"));

    }

    @Test(description = "积分兑换",
            dataProviderClass = JDataProvider.class,dataProvider = "exchangePointData")
    public void test_exchange_point(String point){
        webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTop=300");
        webtest.click("link=积分兑换");
        webtest.typeAndClear("name=jifen",point);
        webtest.click("id=formsubmit");
//        判断没有出错的弹窗
        Assert.assertFalse(webtest.isElementPresent("class=jconfirm-title-c"));
    }
}
