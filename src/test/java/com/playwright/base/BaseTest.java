package com.playwright.base;

import java.nio.file.Paths;

import org.testng.ITestResult;
import org.testng.annotations.*;

import com.microsoft.playwright.*;

public class BaseTest {

	protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeMethod
    public void setUp() {
        playwright = Playwright.create();

        browser = playwright.chromium().launch(
            new BrowserType.LaunchOptions()
                .setHeadless(true)
                .setSlowMo(3000)
        );

        page = browser.newPage();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        // Take screenshot ONLY if failed
        if (result.getStatus() == ITestResult.FAILURE && page != null) {
            try {
                page.screenshot(new Page.ScreenshotOptions()
                        .setPath(Paths.get("screenshots/" + result.getName() + ".png")));
            } catch (Exception e) {
                System.out.println("Screenshot failed: " + e.getMessage());
            }
        }

        // Safe cleanup
        if (browser != null) {
            browser.close();
        }

        if (playwright != null) {
            playwright.close();
        }
    }
}