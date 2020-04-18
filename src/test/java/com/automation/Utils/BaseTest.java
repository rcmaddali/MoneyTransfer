package com.automation.Utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class BaseTest {
	private WebDriver driver;

	@BeforeClass
	public void beforeAllClasses() throws Exception {
		driver = WebDriverHelper.createDriver();
	}

	public WebDriver getDriver() {
		return driver;
	}

	@AfterMethod
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
