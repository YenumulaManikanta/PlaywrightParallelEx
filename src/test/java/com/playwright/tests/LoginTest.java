package com.playwright.tests;

import org.testng.annotations.Test;

import com.playwright.base.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginTest() {
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    System.out.println("Login Test: " + Thread.currentThread().getId());

	}

}
