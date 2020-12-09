package com.webtest.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Demo extends BaseTest{
	@Test
	public void testLogin1() {
		assertEquals(1, 1);
	}
}
