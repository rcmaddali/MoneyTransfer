package com.automation.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {
	
	protected static Properties userProperties = new Properties();
	

	static WebDriver driver = null;
	
	public WebDriverHelper() throws IOException{
		loadProperties();
	}

	private static Properties loadProperties() throws IOException {
		try{
			FileInputStream configStream = new FileInputStream("config.user.properties");
			userProperties.load(configStream);
			return userProperties;
		} catch (FileNotFoundException e){
			System.out.println("No config file Found");
		}
		return userProperties;
		
	}
	
	public static String getStringProperty(String propertyname) throws FileNotFoundException{
		try{
			userProperties = loadProperties();
		}catch(IOException e){
			e.printStackTrace();
		}
		String returnValue = userProperties.getProperty(propertyname);
		return returnValue;
	}

	public static WebDriver createDriver() throws FileNotFoundException {
		if (driver == null) {
			String browser = getStringProperty("browser");
			if(browser.contains("chrome")){
				System.setProperty("webdriver.chrome.driver",
						"./resources/chromedriver");
				driver = new ChromeDriver();
			}else if(browser.contains("Firefox")){
				System.setProperty("webdriver.gecko.driver",
						"./resources/geckodriver");
				driver= new FirefoxDriver();
			}
			else{
				System.out.println("No Browser found");
			}
			driver.navigate().to(getStringProperty("url"));
		//	driver.manage().window().maximize();
		}
		return driver;

	}
	public static void implicitWaits() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	
	

}
