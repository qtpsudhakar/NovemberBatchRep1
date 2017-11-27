package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleneniumPageElement {

	public By myBy;
	public WebDriver myDriver;
	public int myIndex;
	public SeleneniumPageElement myParent;

	public SeleneniumPageElement(By locator, WebDriver webDriver, SeleneniumPageElement parent, int index) {
		myBy = locator;
		myDriver = webDriver;
		myIndex = index;
		myParent = parent;
	}
}