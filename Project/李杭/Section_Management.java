package com.webtest.demo;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import static org.testng.Assert.assertTrue;
/*
版块管理
 */
public class Section_Management extends BaseTest {

    @BeforeClass
    public void test_Login() throws IOException {
        webtest.open("/index.php/denglu.html");

        webtest.type("name=user", ReadProperties.getPropertyValue("admin_username"));
        webtest.type("name=pwd", ReadProperties.getPropertyValue("admin_password"));
        webtest.click("id=submit");
        assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
    }

    @Test(dataProviderClass = JDataProvider.class,dataProvider = "newSectionData")
    public void test_New_Section
            (String section_name,String section_alis,String superior_section,
             String icon_html,String section_photo,String key_word,String section_desc) throws InterruptedException {
        webtest.click("link=新建版块");
//        版块名
        webtest.type("name=sname",section_name);
//        版块别名
        webtest.type("name=bieming",section_alis);
//        作为上一级版块
        webtest.click("xpath=//button[@class='btn btn-light dropdown-toggle']");
//        上一级版块
        webtest.click("link="+superior_section);
//        是否用于菜单
        webtest.click("xpath=//label[@for='formenu']");

        webtest.runJs("window.scrollTo(0,document.body.scrollHeight*0.2)");
        Thread.sleep(3000);
//        图标
        webtest.type("name=icon",icon_html);

//       是否用于链接
//        webtest.click("xpath=//label[@for='islink']");
//???????
//        webtest.type("xpath=//input[@placeholder='请输入链接地址']","123");


//        版块图
        webtest.type("id=image",section_photo);
//        是否用于模块
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight*0.4)");
        Thread.sleep(3000);
//        webtest.click("xpath=//label[@for='formodules']");
//        用于模块时是否包含子版块
//        webtest.click("xpath=//label[@for='subclasses']");
//        是否设置为虚版块
//        webtest.click("xpath=//label[@for='virtualblock']");


//        关键字
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
        webtest.type("name=guanjianzi",key_word);
//        版块描述
        webtest.type("name=description",section_desc);
//        提交按钮
        webtest.click("id=formsubmit");
    }

//    @Test
    public void test_Built_Section(){
        webtest.click("link=已建版块");
//        排序
        webtest.click("xpath=//button[@class='btn btn-info btn-sm submit']");


    }

    @Test(dataProviderClass = JDataProvider.class,dataProvider = "transferSectionData")
    public void test_Transfer_Section(String before,String after){
        webtest.click("link=转移版块");
//        转出版块
        webtest.click("xpath=//button[@class='btn btn-light dropdown-toggle']");
        webtest.click("link="+before);
//        转入版块
        webtest.tapClick();
        webtest.enter();
        webtest.click("link="+after);
//        提交按钮
        webtest.click("id=formsubmit");
    }

}
