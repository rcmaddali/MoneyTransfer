package com.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automation.Utils.WebDriverHelper;

public class Ria extends BasePage {

	public Ria(WebDriver driver) {
		super(driver);

	}

	public void inputSendTo() {
		Select sendTo = new Select(driver.findElement(By.id("68c8c3f7-9ae6-47e6-b015-2f7e767f985b"))); 
		sendTo.selectByVisibleText("India");
		WebDriverHelper.implicitWaits();
	}

	public void inputYouSend() {
		WebElement youSend = driver.findElement(By.id("76c8a71c-3a8e-4d5b-9d12-e301fd171740"));
		youSend.sendKeys("2000");
		WebDriverHelper.implicitWaits();
	}

	public float theyGet() {

		WebElement receivedAmt = driver.findElement(By.id("e3245d3b-50f4-4c08-ae47-c840d6b4ecaf"));
		return Float.parseFloat(receivedAmt.getText());
	}

	public String getRate(float receivedAmt) {

		float rate;
		rate = Float.valueOf(receivedAmt / 2000);
		return String.valueOf(rate);
	}
}
