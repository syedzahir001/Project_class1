package com.adactinbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass_Adactin {
	
	public static WebDriver driver;

	public static WebDriver getbrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}
	
	
	public static void geturl(String url) {
		
		driver.get(url);
		
	}
	
	
	public static  void sendkeys(WebElement element , String value) {
		
		element.sendKeys(value);

	}
	

}
