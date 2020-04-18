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

	public void getRate() {

		String rate = driver.findElement(By.xpath("//*[@id=\"js-ui-content-update-animation-item-0\"]/p/text()"))
				.toString();
//		String rate = rates.get(0).toString();
		System.out.println(rate);
		Assert.assertEquals(rate, "75.9247");
	}

}
