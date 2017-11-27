package com.util;

import org.openqa.selenium.WebDriver;

public class SeleniumActionBase {
	protected WebDriver myDriver;

	public SeleniumActionBase(WebDriver webDriver) {
		myDriver = webDriver;
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
