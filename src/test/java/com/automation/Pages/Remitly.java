package com.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.automation.Utils.WebDriverHelper;

public class Remitly extends BasePage {

	public Remitly(WebDriver driver) {
		super(driver);

	}

	public void clickOnDropDwn() {
		WebElement selectCountryDrpdwn = driver.findElement(By.xpath("//span[text()= 'Select a country']"));
		selectCountryDrpdwn.click();
	}

	public void chooseCountry() {

		// Select chooseCountryfromDrpDwn = new
		// Select(driver.findElement(By.xpath("")));
		WebElement chooseCountryfromDrpDwn = driver.findElement(By.xpath("//span[contains(text(), 'India')]"));
		chooseCountryfromDrpDwn.click();
		WebDriverHelper.implicitWaits();
	}

	public void getRate() {

		WebElement rate = driver.findElement(By.className("rm-col-lg-8 f7euuco"));
//		String rate = rates.get(0).toString();
		rate.getText().toString();
		System.out.println(rate);
		Assert.assertEquals(rate, "75.9247");
	}
}
