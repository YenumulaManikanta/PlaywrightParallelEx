package com.playwright.tests;

import org.testng.annotations.Test;

import com.playwright.base.BaseTest;

public class UserTest extends BaseTest{
	
	@Test
	public void baseTest() {
		page.navigate("https://github.com");
	    System.out.println("User Test: " + Thread.currentThread().getId());

	}

}
