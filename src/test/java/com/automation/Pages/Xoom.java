package com.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automation.Utils.WebDriverHelper;

public class Xoom extends BasePage {

	public Xoom(WebDriver driver) {
		super(driver);

	}

	public void clickOnDropDwn() {
		WebElement selectCountryDrpdwn = driver.findElement(By.xpath("//div[@aria-owns= 'headerCountryPicker']"));
		selectCountryDrpdwn.click();
	}

	public void chooseCountry() {

		WebElement chooseCountryfromDrpDwn = driver.findElement(By.xpath("//li[contains(text(),'India')]"));
		chooseCountryfromDrpDwn.click();
		WebDriverHelper.implicitWaits();
	}

	public void enterAmount() throws InterruptedException {

		WebElement sendAmount = driver.findElement(By.id("sendAmount"));
		sendAmount.clear();
		sendAmount.sendKeys("2000.00");
		WebDriverHelper.implicitWaits();

	}

	public float getAmount() {

		WebElement receiveAmount = driver.findElement(By.id("receiveAmount"));
		float INR = Float.parseFloat(receiveAmount.getAttribute("value"));
		return INR;

	}

	public String getRate(float INR) {

		float rate;
		rate = Float.valueOf(INR / 2000);
		return String.valueOf(rate);
	}

}
