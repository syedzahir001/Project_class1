package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_page {

	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "passwd")
	private WebElement psd;

	public Signin_page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getEmail() {
		return email;

	}

	public WebElement getPsd() {
		return psd;
	}

}
