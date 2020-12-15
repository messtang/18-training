package com.webtest.core;


import java.io.IOException;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class WebTestListenner2 extends TestListenerAdapter{

//	@Override
//	public void onFinish(ITestContext testContext) {
//		// TODO Auto-generated method stub
//		super.onFinish(testContext);
////		打印出总的测试用例的数目
//		ITestNGMethod[] methods = this.getAllTestMethods();
//		System.out.println("一共执行了"+methods.length+"条测试用例");
////		打印出成功的/失败的测试用例的名称和数目	
//		List<ITestResult> failedTest = this.getFailedTests();
//		System.out.println("失败的测试用例:"+failedTest.size());
//		int len=failedTest.size();
//		for(int i=0;i<len;++i) {
//			ITestResult tr=failedTest.get(i);
//			System.out.println(tr.getInstanceName()+":"+tr.getName()+"失败了");
//		}
//		
//		
//	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailure(tr);
//		失败测试用例截屏
		BaseTest tb=(BaseTest) tr.getInstance();
		SeleniumScreenShot screenshot = new SeleniumScreenShot(tb.getDriver());
		try {
			screenshot.screenShot();
			System.out.println(tr.getInstanceName()+":"+tr.getName()+"失败了");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
