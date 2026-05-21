package com.playwright.tests;

import org.testng.annotations.Test;

import com.playwright.base.BaseTest;

public class BasicTest extends BaseTest{
	
	@Test
	public void basicTest() {
		page.navigate("https://google.com");
	    System.out.println("Basic Test: " + Thread.currentThread().getId());

	}

}
