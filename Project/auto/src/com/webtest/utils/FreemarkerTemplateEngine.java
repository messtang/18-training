package com.webtest.utils;

import java.io.File;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerTemplateEngine {
//template模板文件的名字
    private static final String DEFAULT_TEMPLATE = "1.ftl";   
//tempalte模板文件的路径 
    public String getTemplatePath() {   
        return System.getProperty("user.dir")+"/template";
    }   
       
    public String run(Map context) throws Exception{   
    	return executeFreemarker(context); 
    }   
    
    private String executeFreemarker(Map context)throws Exception{   
//    	String content="";
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_30);   
        cfg.setDirectoryForTemplateLoading(   
                new File(getTemplatePath()));   
        cfg.setEncoding(Locale.CHINA, "UTF-8");
//        cfg.setObjectWrapper(new DefaultObjectWrapper());              
        cfg.setCacheStorage(new freemarker.cache.MruCacheStorage(20, 250));                      
        Template temp = cfg.getTemplate(getTemplate());    
        StringWriter out = new StringWriter();   
        temp.process(context, out);   
//        System.out.print(out.toString());
        return out.toString();
    }   
  
    public String getTemplate() {   
        // TODO Auto-generated method stub   
        return DEFAULT_TEMPLATE;   
    }    
}