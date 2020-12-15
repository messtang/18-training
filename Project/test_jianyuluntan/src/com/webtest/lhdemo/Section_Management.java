package com.webtest.lhdemo;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;
/**
 * 版块:版块管理
 * @author lihang
 *运行结果:40个test,通过31个,不通过9个
 */
public class Section_Management extends BaseTest {

    @BeforeMethod
    public void login() throws IOException {
        webtest.open("/index.php/denglu.html");

        webtest.type("name=user", ReadProperties.getPropertyValue("admin_username"));
        webtest.type("name=pwd", ReadProperties.getPropertyValue("admin_password"));
        webtest.click("id=submit");
        assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
    }

    @Test(description = "版块名",
            dataProviderClass = JDataProvider.class,dataProvider = "newSectionNameData")
    public void test_New_Section_name(String section_name) throws InterruptedException {
        webtest.click("link=新建版块");
//        版块名
        webtest.type("name=sname",section_name);
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
//        提交按钮
        webtest.click("id=formsubmit");
//        判断没有出错的弹窗,即添加成功;否则添加失败
        Assert.assertFalse(webtest.isElementPresent("class=jconfirm-title-c"));
    }

    @Test(description = "版块别名",
            dataProviderClass = JDataProvider.class,dataProvider = "newSectionAliasData")
    public void test_New_Section_alias
            (String section_name,String section_alis) throws InterruptedException {
        webtest.click("link=新建版块");
//        版块名
        webtest.type("name=sname",section_name);
//        版块别名
        webtest.type("name=bieming",section_alis);
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
//        提交按钮
        webtest.click("id=formsubmit");
//        判断没有出错的弹窗,即添加成功;否则添加失败
        Assert.assertFalse(webtest.isElementPresent("class=jconfirm-title-c"));

    }

    @Test(description = "是否用于菜单",
            dataProviderClass = JDataProvider.class,dataProvider = "newSectionMenuData")
    public void test_New_Section_Menu(String section_name,String menu){
        webtest.click("link=新建版块");
//        版块名
        webtest.type("name=sname",section_name);
//        输入1用于菜单,输入0不用于菜单
        if(menu.equals("1")){
//         是否用于菜单
            webtest.click("xpath=//label[@for='formenu']");
        }
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
//        提交按钮
        webtest.click("id=formsubmit");

    }

    @Test(description = "图标",
            dataProviderClass = JDataProvider.class,dataProvider = "newSectionIconData")
    public void test_New_Section_Icon(String section_name,String menu,String icon_html) throws InterruptedException {
        webtest.click("link=新建版块");
//        版块名
        webtest.type("name=sname",section_name);
        if(menu.equals("1")){
//        是否用于菜单
            webtest.click("xpath=//label[@for='formenu']");
        }
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight*0.2)");
        Thread.sleep(3000);
//        图标
        webtest.type("name=icon",icon_html);
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
//        提交按钮
        webtest.click("id=formsubmit");
    }

    @Test(description = "是否用于链接",
            dataProviderClass = JDataProvider.class,dataProvider = "newSectionLinkData")
    public void test_New_Section_Link(String section_name,String link){
        webtest.click("link=新建版块");
//        版块名
        webtest.type("name=sname",section_name);
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight*0.2)");
        if(!link.equals("0")){
//        是否用于链接
            webtest.click("xpath=//label[@for='islink']");

            webtest.type("xpath=//input[@placeholder='请输入链接地址']",link);
        }
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
//        提交按钮
        webtest.click("id=formsubmit");
//        判断没有出错的弹窗
        Assert.assertFalse(webtest.isElementPresent("class=jconfirm-title-c"));
    }


    @Test(description = "排序",
            dataProviderClass = JDataProvider.class,dataProvider = "hasBuiltSectionSortData")
    public void test_Has_Built_Sort(String num1,String num2,String num3) throws InterruptedException {
        webtest.click("link=已建版块");
        webtest.typeAndClear("name=1",num1);
        webtest.typeAndClear("name=2",num2);
        webtest.typeAndClear("name=3",num3);
        Thread.sleep(5000);
        webtest.click("xpath=//button[@class='btn btn-info btn-sm submit']");
        Thread.sleep(3000);
    }



    @Test(description = "转移版块",
            dataProviderClass = JDataProvider.class,dataProvider = "transferSectionData")
    public void test_Transfer_Section(String before,String after){
        webtest.click("link=转移版块");
        if(!before.equals("")){
//            转出版块
            webtest.click("xpath=//button[@class='btn btn-light dropdown-toggle']");
            webtest.click("link="+before);
        }
        if(!after.equals("")){
//            转入版块
            webtest.tapClick();
            webtest.enter();
            webtest.click("link="+after);
        }

//        提交按钮
        webtest.click("id=formsubmit");
    }



}
