package com.lhz.edu0920;

import java.io.IOException;

import org.apache.hc.client5.http.cookie.BasicCookieStore;
import org.apache.hc.client5.http.cookie.Cookie;
import org.apache.hc.client5.http.cookie.CookieStore;
import org.apache.hc.client5.http.impl.cookie.BasicClientCookie;
import org.apache.hc.core5.http.ParseException;
import org.testng.annotations.Test;

import net.sf.json.JSONObject;

public class MallDemo{


	@Test
	public void test_login() throws ParseException, IOException {
		JSONObject user=new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "20000000000");
		user.element("password", "netease123");
		HttpDriver.doPost("/common/fgadmin/login", user);
	}
	
	@Test
	public void test_skuList() throws ParseException, IOException {
		HttpDriver.doGet("/common/skuList", "goodsId=1");
	}
	
	@Test
	public void test_list() throws ParseException, IOException {
		HttpDriver.doGet("/fgadmin/address/list");
	}
	
	@Test
	public void test_getTransportFee() throws ParseException, IOException {
		HttpDriver.doGet("/common/getTransportFee","id=1&addressDetail='河北石家庄'");
	}
	
	@Test
	public void test_orders() throws ParseException, IOException {
		JSONObject order=new JSONObject();
		order.element("phoneArea", "86");
		order.element("phoneNumber", "20000000000");
		order.element("password", "netease123");
		HttpDriver.doPost("/fgadmin/orders/submit", order);
	}
	
	@Test
	public void test_add_address() throws ParseException, IOException {
		JSONObject address=new JSONObject();
		address.element("phoneArea", "86");
		address.element("phoneNumber", "20000000000");
		address.element("password", "netease123");
		HttpDriver.doPost("/fgadmin/address/new", address);
	}
	
	@Test
	public void test_delete_address() throws ParseException, IOException {
		JSONObject id=new JSONObject();
		id.element("id", "1");
		HttpDriver.doPost("/fgadmin/address/delete", id);
	}

}
