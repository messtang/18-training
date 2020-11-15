package com.freemarker;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.webtest.utils.ReadProperties;

public class WebTestListener extends TestListenerAdapter{

	FreemarkerTemplateEngine ft = new FreemarkerTemplateEngine();
	
	@Override
	public void onFinish(ITestContext testContext) {
		// TODO Auto-generated method stub
		super.onFinish(testContext);
		ITestNGMethod method[] = this.getAllTestMethods();
		List<ITestResult> failedList = this.getFailedTests();
		List<ITestResult> passedList = this.getPassedTests();
		List<ITestResult> faileditems = new ArrayList<>();
		List<ITestResult> passeditems = new ArrayList<>();
		
		for(int i = 0;i < failedList.size();i++) {
			ITestResult tr = failedList.get(i);
			for(int j = 0;j < method.length;j++) {
				if(tr.getMethod().getMethodName().equals(method[j].getMethodName())) {
					if(method[j].getDescription()!=null) {
						tr.setAttribute("name", method[j].getDescription());
					}else {
						tr.setAttribute("name", "");
					}
					break;
				}
			}
			faileditems.add(tr);
		}
		
		for(int i = 0;i < passedList.size();i++) {
			ITestResult tr = passedList.get(i);
			for(int j = 0;j < method.length;j++) {
				if(tr.getMethod().getMethodName().equals(method[j].getMethodName())) {
					if(method[j].getDescription()!=null) {
						tr.setAttribute("name", method[j].getDescription());
					}else {
						tr.setAttribute("name", "");
					}
					break;
				}
			}
			passeditems.add(tr);
		}
		
		Map<String, Object> context = new HashMap<String, Object>();
		context.put("faileditems", faileditems);
		context.put("passeditems", passeditems);
		context.put("casesize", faileditems.size()+passeditems.size());
		context.put("failcasesize", faileditems.size());
		
		try {
			String content = ft.run(context);
			String to = ReadProperties.getPropertyValue("tomail");
			String user = ReadProperties.getPropertyValue("to_user");
			MailUtil.sendEmail(to,user, "自动化测试报告",content);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

	
	

}
