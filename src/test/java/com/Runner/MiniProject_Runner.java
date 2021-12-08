package com.Runner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base.Base_Class;

public class MiniProject_Runner  {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");

		driver.manage().window().maximize();

		 



		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		

		Thread.sleep(2000);

		WebElement Add = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));

		Add.click();

		Thread.sleep(2000);

		WebElement proceed = driver.findElement(By.xpath("//div[@id='page']/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));

		proceed.click();
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/p[2]/a[1]/span"));

		btn.click();
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("nileg46187@latovic.com");

		WebElement psd = driver.findElement(By.id("passwd"));

		psd.sendKeys("nileg46187");

		WebElement btn1 = driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));

		btn1.click();
		Thread.sleep(2000);

		WebElement btn2 = driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/form/p/button/span"));

		btn2.click();
		Thread.sleep(2000);

		WebElement checkb = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkb.click();


		WebElement btn3 = driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/div/form/p/button/span"));

		btn3.click();
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		
		File dest = new File("C:\\Users\\home\\eclipse-workspace\\Mini_Project\\Screenshoot\\Payment.png");
		
		FileUtils.copyFile(screenshotAs, dest);
		
	}
}
