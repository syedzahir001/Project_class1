package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enter_page {
	
	public static WebDriver driver;
	
	@FindBy (xpath = "//span[contains(text(),'Add to cart')]")
			private WebElement  Add;
	
	public Enter_page(WebDriver driver2) {
		
		this.driver = driver2;
		 PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
		
	}

	public WebElement getAdd() {
		return Add;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getBtn1() {
		return btn1;
	}

	public WebElement getBtn2() {
		return btn2;
	}

	public WebElement getCheckb() {
		return checkb;
	}

	public WebElement getBtn3() {
		return btn3;
	}

	@FindBy (xpath = "//div[@id='page']/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
	private WebElement  proceed;
	
	@FindBy (xpath = "//div[@id='page']/div[2]/div/div[3]/div/p[2]/a[1]/span")
	private WebElement  btn;
	
	@FindBy (xpath = "//div[@id='page']/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
	private WebElement  btn1 ;
	
	@FindBy (xpath = "//div[@id='page']/div[2]/div/div[3]/div/form/p/button/span")
	private WebElement btn2  ;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement checkb  ;
	
	@FindBy (xpath = "//div[@id='page']/div[2]/div/div[3]/div/div/form/p/button/span")
	private WebElement btn3  ;
	
	
	
	

}
