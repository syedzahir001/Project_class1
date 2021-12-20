package com.Runner1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactinbase.Baseclass_Adactin;
import com.sdl.Page_Objectmanager;

public class Adactin_project extends Baseclass_Adactin{
	
	public static WebDriver driver = getbrowser("chrome");
	
	public static Page_Objectmanager pom = new Page_Objectmanager(driver);
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		
		
		
		
		WebDriver driver  = new ChromeDriver();
		
		geturl("http://adactinhotelapp.com/index.php");
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
