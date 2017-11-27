package com.util;

import org.openqa.selenium.WebDriver;

public class SeleniumTestBase {
	protected WebDriver myDriver;

	public SeleniumTestBase(WebDriver webDriver) {
		myDriver = webDriver;
	}

	public DataTable GetData(String connString, String SQL) {
		return null;
		// Some code which will query a DB for you
	}

	public WebDriver StartBrowser(String browserType) {
		return myDriver;
		// Some code which will launch different types of browsers
	}

	public void SwitchToWindow(String handle) {
		// Some code which will switch windows for you
	}

	public void SwitchToFrame(String handle) {
		// Some code which will switch frames for you
	}

	public void LaunchUrl(String URL) {
		// Some code which will navigate directly to the specified URL.
	}

	public void Refresh() {
		// Some code to refresh the page you are currently on
	}
}