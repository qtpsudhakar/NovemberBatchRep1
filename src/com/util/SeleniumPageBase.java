package com.util;

import org.openqa.selenium.WebDriver;

public class SeleniumPageBase {
	
	protected WebDriver myWebDriver;

	public SeleniumPageBase(WebDriver webDriver) {
		myWebDriver = webDriver;
	}

}
