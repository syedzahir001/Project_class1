package com.Runner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.Base_Class;
import com.pom.Enter_page;
import com.pom.Signin_page;
import com.sdl.Page_Objectmanager;

public class Miniproj_Runner extends Base_Class {
	public static WebDriver driver = getbrowser("chrome");
	

	public static Page_Objectmanager pom = new Page_Objectmanager(driver);
	
	public static Logger log = Logger.getLogger(Miniproj_Runner.class);

	public static void main(String[] args) throws InterruptedException, IOException {
		
	PropertyConfigurator.configure("log4j.properties");

//		Enter_page ep = new Enter_page(driver);
//
//		Signin_page si = new Signin_page(driver);
	
	
	log.info("Browser lunch");
                                                         
		geturl("http://automationpractice.com/index.php?id_category=5&controller=category");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getAdd());

		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getProceed());
		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getBtn());

		Thread.sleep(2000);

		sendkeys(pom.getinstancesignin().getEmail(), "nileg46187@latovic.com");

		sendkeys(pom.getinstancesignin().getPsd(), "nileg46187");

		Clickelement(pom.getinstanceHp().getBtn1());
		
		log.info("user signin");
		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getBtn2());
		Thread.sleep(2000);

		Clickelement(pom.getinstanceHp().getCheckb());

		Clickelement(pom.getinstanceHp().getBtn3());
		
		log.info("DRESS Booked");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\home\\eclipse-workspace\\Selenium\\Screenshoot\\payment.png");

		FileUtils.copyFile(screenshotAs, dest);

	}

}
