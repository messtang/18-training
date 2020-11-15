package com.freemarker;

import java.io.File;
import java.io.StringWriter;
import java.util.Map;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public class FreemarkerTemplateEngine {
	
	public String run(Map<String,Object> context) throws Exception {
		return executeFreemarker(context);
	}
	
	public String executeFreemarker(Map<String,Object> context)throws Exception{
    	//创建一个合适的Configuration对象
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_22);
		configuration.setDirectoryForTemplateLoading(new File("conf/"));
		configuration.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_22));
		configuration.setDefaultEncoding("UTF-8");
		
		//获取或创建一个模板
		Template template = configuration.getTemplate("static.html");
//		Map<String,Object> root = new HashMap<>();
//        root.put("user", "Big Joe");
//        Map<String,Object> latest = new HashMap<>();
//        root.put("latestProduct", latest);
//        latest.put("url", "products/greenmouse.html");
//        latest.put("name", "green mouse");
		
		
		StringWriter out = new StringWriter();
		template.process(context, out);
		
		return out.toString();
		
	}
	
	
}