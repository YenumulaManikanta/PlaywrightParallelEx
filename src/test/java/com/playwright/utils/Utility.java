package com.playwright.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Utility {
	
	public void generateReports() {
		
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("extent-report.html");
		extent.attachReporter(spark);
	}

}
