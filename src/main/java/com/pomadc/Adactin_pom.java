package com.pomadc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adactin_pom {
	
	@FindBy(id = "username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	

}
