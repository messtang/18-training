package com.example.platform;

import java.io.IOException;
import java.util.List;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.cookie.Cookie;
import org.apache.hc.client5.http.cookie.CookieStore;
import org.apache.hc.client5.http.cookie.StandardCookieSpec;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import com.lhz.edu0920.ReadProperties;
import com.sun.jna.platform.linux.LibC.Sysinfo;

import net.sf.json.JSONObject;
/**
 * 
 * @author lihang
 *
 */
public class HttpDriver {
	
	public static JSONObject doGet(String url,CookieStore cookieStore) throws ParseException, IOException {
		RequestConfig config=RequestConfig.custom().setCookieSpec(StandardCookieSpec.STRICT).build();
		CloseableHttpClient httpClient=HttpClients.custom().setDefaultRequestConfig(config).setDefaultCookieStore(cookieStore).build();
		HttpGet httpGet=new HttpGet(ReadProperties.getPropertyValue("Host")+url);
		CloseableHttpResponse httpResponse=httpClient.execute(httpGet);
		HttpEntity entity=httpResponse.getEntity();
		String result=EntityUtils.toString(entity,"UTF-8");
		System.out.println(result);
		EntityUtils.consume(entity);
		httpResponse.close();
		httpClient.close();
		
		List<Cookie> listCookies=cookieStore.getCookies();
		for (Cookie cookie : listCookies) {
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		
		return JSONObject.fromObject(result);//方便做断言
	}

	public static JSONObject doGet(String url) throws ParseException, IOException {
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpGet httpGet=new HttpGet(ReadProperties.getPropertyValue("Host")+url);
		CloseableHttpResponse httpResponse=httpClient.execute(httpGet);
		HttpEntity entity=httpResponse.getEntity();//响应体
//		httpResponse.getCode();//状态码
//		httpResponse.getHeaders();//响应头
		String result=EntityUtils.toString(entity,"UTF-8");
		System.out.println(result);
		EntityUtils.consume(entity);
		httpResponse.close();
		httpClient.close();
		return JSONObject.fromObject(result);//方便做断言
		
	}
	
	public static void doGet2(String url) throws ParseException, IOException {
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpGet httpGet=new HttpGet(ReadProperties.getPropertyValue("Host")+url);
		CloseableHttpResponse httpResponse=httpClient.execute(httpGet);
		HttpEntity entity=httpResponse.getEntity();
		String result=EntityUtils.toString(entity,"UTF-8");
		System.out.println(httpResponse.getCode());
		EntityUtils.consume(entity);
		httpResponse.close();
		httpClient.close();
	}
	
	public static JSONObject doGet(String url,String para) throws ParseException, IOException {
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpGet httpGet=new HttpGet(ReadProperties.getPropertyValue("Host")+url+"?"+para);
		CloseableHttpResponse httpResponse=httpClient.execute(httpGet);
		HttpEntity entity=httpResponse.getEntity();//响应体
		String result=EntityUtils.toString(entity,"UTF-8");
		System.out.println(result);
		EntityUtils.consume(entity);
		httpResponse.close();
		httpClient.close();
		return JSONObject.fromObject(result);//方便做断言
		
	}
	
	public static JSONObject doPost(String url,String formBody) throws ParseException, IOException {
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpPost httpPost=new HttpPost(ReadProperties.getPropertyValue("Host")+url);
		httpPost.setHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
		httpPost.setEntity(new StringEntity(formBody));
		CloseableHttpResponse httpResponse=httpClient.execute(httpPost);
		HttpEntity entity=httpResponse.getEntity();
		String result=EntityUtils.toString(entity,"UTF-8");
		System.out.println(result);
		EntityUtils.consume(entity);
		httpResponse.close();
		httpClient.close();
		return JSONObject.fromObject(result);
	}
	
	public static JSONObject doPost(String url,JSONObject body) throws ParseException, IOException {
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpPost httpPost=new HttpPost(ReadProperties.getPropertyValue("Host")+url);
		httpPost.setHeader("Content-Type","application/json;charset=UTF-8");
		httpPost.setEntity(new StringEntity(body.toString()));
		CloseableHttpResponse httpResponse=httpClient.execute(httpPost);
		HttpEntity entity=httpResponse.getEntity();
		String result=EntityUtils.toString(entity,"UTF-8");
		System.out.println(result);
		EntityUtils.consume(entity);
		httpResponse.close();
		httpClient.close();
		return JSONObject.fromObject(result);
	}
}
