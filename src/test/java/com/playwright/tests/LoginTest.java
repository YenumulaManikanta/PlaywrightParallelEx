package com.playwright.tests;

import org.testng.annotations.Test;

import com.playwright.base.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginTest() {
		page.navigate("https://example.com");
		page.waitForTimeout(3000);
	    System.out.println("Login Test: " + Thread.currentThread().getId());

	}

}
