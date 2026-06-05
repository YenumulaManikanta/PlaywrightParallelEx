package com.playwright.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.playwright.base.BaseTest;
import com.playwright.utils.RetryAnalyzer;

public class LoginTest extends BaseTest{
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void loginTest() {

	    page.navigate("https://www.discover.com/");
	    page.waitForLoadState();

	    Assert.assertTrue(page.title().contains("Discover"));

	}

}
