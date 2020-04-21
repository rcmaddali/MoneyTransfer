package com.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automation.Utils.WebDriverHelper;

public class Remitly extends BasePage {

	public Remitly(WebDriver driver) {
		super(driver);

	}

	public void clickOnDropDwn() {
		WebElement selectCountryDrpdwn = driver
				.findElement(By.xpath("//div[@class='fhh5v12']//div//span[contains(text(),'Select a country')]"));
		selectCountryDrpdwn.click();
	}

	public void chooseCountry() {
		WebElement chooseCountryfromDrpDwn = driver.findElement(By.xpath("//div[@class='fhh5v12']//li[2]//div[1]"));
		chooseCountryfromDrpDwn.click();
		WebDriverHelper.implicitWaits();
	}

	public void clickonGetStarted() {

		WebElement getStarted = driver.findElement(By.xpath("//a[text()= 'Get started']"));
		getStarted.click();
		WebDriverHelper.implicitWaits();
	}

	public String getRate() {

		WebElement rate = driver.findElement(By.className("forex-bar-rate-bold_f347vxz"));
		return rate.getText().toString();
	}
}
