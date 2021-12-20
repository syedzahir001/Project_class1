package com.sdl;

import org.openqa.selenium.WebDriver;

import com.pom.Enter_page;
import com.pom.Signin_page;

public class Page_Objectmanager {
	public static WebDriver driver;

	private Enter_page ep;

	private Signin_page si;

	public Page_Objectmanager(WebDriver driver2) {
		this.driver = driver2;

	}

	public Enter_page getinstanceHp() {
		if (ep == null) {

			ep = new Enter_page(driver);

		}
		return ep;
	}

	public Signin_page getinstancesignin() {

		if (si == null) {

			si = new Signin_page(driver);

		}

		return si;
	}

}
