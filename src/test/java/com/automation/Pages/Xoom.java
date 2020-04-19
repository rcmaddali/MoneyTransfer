package com.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

		// Select chooseCountryfromDrpDwn = new
		// Select(driver.findElement(By.xpath("")));
		WebElement chooseCountryfromDrpDwn = driver.findElement(By.xpath("//li[contains(text(),'India')]"));
		chooseCountryfromDrpDwn.click();
		WebDriverHelper.implicitWaits();
	}
	
	public void enterAmount() {
		
		WebElement sendAmount = driver.findElement(By.id("sendAmount"));
		sendAmount.sendKeys("2000");
		WebDriverHelper.implicitWaits();
	}
	
	public int getAmount() {
		
		WebElement receiveAmount = driver.findElement(By.id("receiveAmount"));
		int INR = Integer.parseInt(receiveAmount.getText());
		return INR;
		
	}

	public String getRate(int INR) {

		float rate;
		rate = Float.valueOf(INR/ 2000);
		System.out.println(rate);
		return String.valueOf(rate);
	}

}
