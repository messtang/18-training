package com.webtest.zssdemo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

/**
 * 个人信息模块
 * 
 * @author 张帅帅
 *
 */
public class InformationTest extends BaseTest {

	@BeforeClass
	public void Login() throws IOException {
		webtest.open("/index.php/denglu.html");
		webtest.type("name=user", ReadProperties.getPropertyValue("username"));
		webtest.type("name=pwd", ReadProperties.getPropertyValue("password"));
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("版块选择"));
	}

	// 点击我的头像
	@Test(priority = 0)
	public void test_MyPicture_click() {
		webtest.click("link=我的头像");
		assertTrue(webtest.isTextPresent("选择图片"));
	}

	// 上传头像，此处有5条数据
	@Test(priority = 1, dataProviderClass = ZSS_DataProvider.class, dataProvider = "pictureFile")
	public void test_picture_upload(String pictureFile) throws InterruptedException {
		webtest.type("id=inputImage", pictureFile);
		webtest.click("id=upload");
		assertTrue(webtest.isTextPresent("头像已经保存"));
		webtest.click("xpath=//div[@class='jconfirm-buttons']/button");
	}

	// 点击我的资料
	@Test(priority = 2)
	public void test_MyInformation_click() {
		webtest.click("link=我的资料");
		assertTrue(webtest.isTextPresent("昵称"));
	}

	// 修改昵称，此处有2条数据
	@Test(priority = 3, dataProviderClass = ZSS_DataProvider.class, dataProvider = "nickName")
	public void test_nickname_change(String nickName) {
		webtest.typeAndClear("name=nicheng", nickName);
		webtest.click("id=formsubmit");
		if (nickName.equals("test1")) {
			assertTrue(webtest.isTextPresent(nickName));
		} else {
			// 昵称为空格
			assertTrue(webtest.isTextPresent("昵称必须填写"));
			webtest.click("xpath=//div[@class='jconfirm-buttons']/button");
		}
	}

	// 修改性别，此处修改3次
	@Test(priority = 4)
	public void test_sex_change() {
		for (int i = 0; i <= 2; i++) {
			if (i == 0) {
				webtest.click("xpath=//option[@value='0']");
				webtest.click("id=formsubmit");
				assertTrue(webtest.isTextPresent("保密"));
			} else if (i == 1) {
				webtest.click("xpath=//option[@value='1']");
				webtest.click("id=formsubmit");
				assertTrue(webtest.isTextPresent("男"));
			} else {
				webtest.click("xpath=//option[@value='2']");
				webtest.click("id=formsubmit");
				assertTrue(webtest.isTextPresent("女"));
			}
		}
	}

	// 修改邮箱，此处有9条数据，包含4个测试类
	@Test(priority = 5, dataProviderClass = ZSS_DataProvider.class, dataProvider = "data")
	public void test_mail_change(String email) {
		webtest.typeAndClear("name=email", email);
		webtest.click("id=formsubmit");
		if (email.equals("1234567890@qq.com")) {
			// 未被使用过的邮箱
			assertTrue(webtest.isTextPresent("1234567890@QQ.com"));
		} else {
			// 被使用过的邮箱
			// 邮箱格式错误
			// 邮箱未填写
			assertTrue(webtest.isTextPresent("出错"));
			webtest.click("xpath=//div[@class='jconfirm-buttons']/button");
		}
	}

	// 修改生日，此处有8条数据
	@Test(priority = 6, dataProviderClass = ZSS_DataProvider.class, dataProvider = "birthday")
	public void test_birthday_change(String birthday) throws InterruptedException {
		webtest.typeAndClear("name=shengri", birthday);
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent(birthday));
	}

	// 修改手机号码，此处有9条数据，包含2个测试类
	@Test(priority = 7, dataProviderClass = ZSS_DataProvider.class, dataProvider = "data")
	public void test_phoneNumber_change(String phoneNumber) {
		webtest.typeAndClear("name=shouji", phoneNumber);
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent(phoneNumber));
	}

	// 修改个人网址，此处有9条数据，包含2个测试类
	@Test(priority = 8, dataProviderClass = ZSS_DataProvider.class, dataProvider = "data")
	public void test_website_change(String website) {
		webtest.typeAndClear("name=url", website);
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent(website));
	}

	// 修改学校，此处有9条数据，包含2个测试类
	@Test(priority = 9, dataProviderClass = ZSS_DataProvider.class, dataProvider = "data")
	public void test_school_change(String school) {
		webtest.typeAndClear("name=xuexiao", school);
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent(school));
	}

	// 修改微博，此处有9条数据，包含2个测试类
	@Test(priority = 10, dataProviderClass = ZSS_DataProvider.class, dataProvider = "data")
	public void test_MicroBlog_change(String MicroBlog) {
		webtest.typeAndClear("name=weibo", MicroBlog);
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent(MicroBlog));
	}

	// 修改微信，此处有9条数据，包含1个测试类
	@Test(priority = 11, dataProviderClass = ZSS_DataProvider.class, dataProvider = "data")
	public void test_WeChat_change(String WeChat) {
		webtest.typeAndClear("name=wechat", WeChat);
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent(WeChat));
	}

	// 修改QQ，此处有9条数据，包含2个测试类
	@Test(priority = 12, dataProviderClass = ZSS_DataProvider.class, dataProvider = "data")
	public void test_QQ_change(String QQ) {
		webtest.typeAndClear("name=qq", QQ);
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent(QQ));
	}

	// 修改脸书，此处有9条数据，包含2个测试类
	@Test(priority = 13, dataProviderClass = ZSS_DataProvider.class, dataProvider = "data")
	public void test_FaceBook_change(String FaceBook) {
		webtest.typeAndClear("name=facebook", FaceBook);
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent(FaceBook));
	}

	// 修改推特，此处有9条数据，包含2个测试类
	@Test(priority = 14, dataProviderClass = ZSS_DataProvider.class, dataProvider = "data")
	public void test_Twitter_change(String Twitter) {
		webtest.typeAndClear("name=twitter", Twitter);
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent(Twitter));
	}

	// 修改个性签名，此处共1条数据，包含3个测试类
	@Test(priority = 15, dataProviderClass = ZSS_DataProvider.class, dataProvider = "message")
	public void test_message_change(String message) {
		webtest.typeAndClear("name=qianming", message);
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent(message));
	}

	// 点击修改密码
	@Test(priority = 16)
	public void test_ChangePassword_click() {
		webtest.click("link=修改密码");
		assertTrue(webtest.isTextPresent("原密码"));
	}

	// 修改密码，直接提交
	@Test(priority = 17)
	public void test_password_notchange() {
		webtest.click("id=formsubmit");
		assertTrue(webtest.isTextPresent("出错"));
		webtest.click("xpath=//div[@class='jconfirm-buttons']/button");
	}

	// 修改密码，包含6条数据，包含5个测试用例
	@Test(priority = 18, dataProviderClass = ZSS_DataProvider.class, dataProvider = "password")
	public void test_password_change(String old_password, String new_password, String renew_password) {
		webtest.typeAndClear("name=opwd", old_password);
		webtest.typeAndClear("name=npwd", new_password);
		webtest.typeAndClear("name=rpwd", renew_password);
		webtest.click("id=formsubmit");
		if (old_password.equals("admintest") && new_password.equals("admintest1")
				&& renew_password.equals("admintest1")) {
			assertTrue(webtest.isTextPresent("提交"));
		} else if (old_password.equals("admintest1") && new_password.equals("admintest")
				&& renew_password.equals("admintest")) {
			assertTrue(webtest.isTextPresent("提交"));
		} else {
			assertTrue(webtest.isTextPresent("出错"));
			webtest.click("xpath=//div[@class='jconfirm-buttons']/button");
		}
	}

}