package com.webtest.demo;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import static org.testng.Assert.assertTrue;
/*
积分管理
 */
public class Point_Management extends BaseTest {

    @BeforeClass
    public void test_Login() throws IOException {
        webtest.open("/index.php/denglu.html");

        webtest.type("name=user", ReadProperties.getPropertyValue("admin_username"));
        webtest.type("name=pwd", ReadProperties.getPropertyValue("admin_password"));
        webtest.click("id=submit");
        assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
    }

    @Test(dataProviderClass = JDataProvider.class,dataProvider = "addPointData")
    public void test_add_point(String name,String add_point,String sub_point) throws InterruptedException {
        webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTop=300");
//        webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTo(0,document.getElementById('jianyuluntansidebar').scrollHeight)");
        webtest.click("link=用户积分");
        webtest.type("name=yonghuming",name);
        webtest.click("xpath=//button[@type='submit']");
        webtest.type("xpath=//input[@placeholder='输入增加数量']",add_point);
        webtest.tapClick();
        webtest.enter();
        webtest.type("xpath=//input[@placeholder='输入减少数量']",sub_point);
        webtest.tapClick();
        webtest.enter();
    }

    @Test(dataProviderClass = JDataProvider.class,dataProvider = "exchangePointData")
    public void test_exchange_point(String point){
        webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTop=300");
        webtest.click("link=积分兑换");
        webtest.typeAndClear("name=jifen",point);
        webtest.click("id=formsubmit");
    }
}
