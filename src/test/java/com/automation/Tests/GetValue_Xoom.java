package com.automation.Tests;

import org.testng.annotations.Test;

import com.automation.Pages.Xoom;
import com.automation.Utils.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class GetValue_Xoom extends BaseTest {

	BaseTest test;
	Xoom xoomTransfer;

	@BeforeClass
	public void setup() {
		xoomTransfer = new Xoom(getDriver());
	}

	@Test
	public void getValue() {

		xoomTransfer.clickOnDropDwn();
		xoomTransfer.chooseCountry();
		xoomTransfer.enterAmount();
		int INR = xoomTransfer.getAmount();
		String rate = xoomTransfer.getRate(INR);
		Assert.assertEquals(rate, "75.9245");
	}

	/*
	 * @BeforeMethod public static void browser() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "/Users/ravimaddali/Desktop/chromedriver"); driver = new ChromeDriver();
	 * driver.get("https://www.google.com/"); String strPageTitle =
	 * driver.getTitle();
	 * Assert.assertEquals(strPageTitle.equalsIgnoreCase("Google"),
	 * "Page title does not match");
	 * System.out.println("Browser is up and running"); }
	 * 
	 * @Test(priority=1) public static void Xoom() throws InterruptedException{
	 * WebElement xoomrate; driver.get("https://www.xoom.com");
	 * driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "t");
	 * Thread.sleep(5000); ArrayList<String> arr = new ArrayList<String>
	 * (driver.getWindowHandles()); System.out.println(arr.get(1));
	 * driver.switchTo().window(arr.get(1)); JavascriptExecutor jse =
	 * (JavascriptExecutor)driver; jse.executeScript("window.scrollBy(0,500)", "");
	 * Thread.sleep(10000); boolean present=
	 * driver.findElement(By.linkText("Send Money")).isEnabled();
	 * System.out.println(present);
	 * 
	 * driver.findElement(By.xpath("//*[@id='picker-selector-1']/span/span/span")).
	 * click(); Actions builder = new Actions(driver);
	 * builder.moveToElement(driver.findElement(By.linkText("Send
	 * Money"))).build().perform(); Thread.sleep(2000);
	 * builder.click(driver.findElement(By.linkText("Send Money"))).perform();
	 * System.out.println(driver.findElement(By.linkText("India")).isDisplayed());
	 * driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "w"); } }
	 * 
	 * @Test(priority = 2) public static void Transfast() throws
	 * InterruptedException { String trate; double transfastrate;
	 * Thread.sleep(5000);
	 * driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "t");
	 * System.out.println("Transfast tab open");
	 * driver.get("https://www.transfast.com");
	 * driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "t");
	 * Thread.sleep(5000); try{ ArrayList<String> arr = new ArrayList<String>
	 * (driver.getWindowHandles()); System.out.println(arr.get(1));
	 * driver.switchTo().window(arr.get(1)); } catch(IndexOutOfBoundsException e){
	 * System.out.println("This is causing an exception"); } Thread.sleep(5000);
	 * driver.findElement(By.xpath("//input[contains(@class,'searchable-country')]")
	 * ).sendKeys("India"); Thread.sleep(2000);
	 * driver.findElement(By.linkText("India")).click(); Thread.sleep(2000); trate =
	 * driver.findElement(By.className("exchange-rate")).getText();
	 * driver.findElement(By.xpath(
	 * "/html/body/div[2]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[3]/span[4]"
	 * )).getAttribute("exchange-rate"); transfastrate = Double.parseDouble(trate);
	 * System.out.println(transfastrate); // The below line of (87)code doesn't seem
	 * to be working
	 * driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "w");
	 * System.out.println("Transfast tab closed"); }
	 * 
	 * @Test(priority = 3) public static void Remitly() throws InterruptedException
	 * { driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "t");
	 * System.out.println("Remitly tab open"); String rrate; Thread.sleep(5000);
	 * ArrayList<String> arr = new ArrayList<String> (driver.getWindowHandles());
	 * System.out.println(arr.get(1)); driver.switchTo().window(arr.get(1));
	 * driver.get("https://www.remitly.com/"); rrate = driver .findElement(By.xpath(
	 * "/html/body/div[3]/div[1]/div/div/div[1]/div/div[3]/div[2]/div[3]/div[2]/p[1]"
	 * )) .getText(); System.out.println(rrate); // The below line of (87)code
	 * doesn't seem to be working
	 * driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "w");
	 * System.out.println("Remitly tab closed"); }
	 * 
	 * @Test(priority=4) public static void Ria(){
	 * driver.get("https://www.riamoneytransfer.com/");
	 * driver.findElement(By.linkText("Send Money to India")).click(); WebDriverWait
	 * wait = new WebDriverWait(driver,10); WebElement exchangeRate
	 * =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	 * "exchangeRate"))); exchangeRate.getText(); System.out.println(exchangeRate);
	 * driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "w"); }
	 */
}
