package com.wd.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

	public static WebDriver getDriver(String brName) {

		WebDriver driver;

		switch (brName.toLowerCase()) {

		case "chrome":
			// specify driver exe path
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");

			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");

			// Opens new chrome window
			driver = new ChromeDriver(co);
			break;
		case "firefox":
			// specify driver exe path
			System.setProperty("webdriver.gecko.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");

			FirefoxProfile p = new FirefoxProfile();
			p.setPreference("dom.webnotifications.enabled", false);
			FirefoxOptions fo = new FirefoxOptions();
			fo.setProfile(p);
			// Opens new firefox window
			driver = new FirefoxDriver(fo);
			break;
		case "ie":
			// specify driver exe path
			System.setProperty("webdriver.ie.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\iedriverserver.exe");

			// Opens new ie window
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			// specify driver exe path
			System.setProperty("webdriver.edge.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\MicrosoftWebDriver.exe");

			// Opens new edge window
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("browser not found");
			driver = null;
		}
		return driver;
	}

	public static WebDriver getRemoteDriver(String brName, String os, String hUrl) {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(brName);

		switch (os) {
		case "windows":
			cap.setPlatform(Platform.WINDOWS);
			break;
		case "win10":
			cap.setPlatform(Platform.WIN10);
			break;
		case "mac":
			cap.setPlatform(Platform.MAC);
			break;
		default:
			cap.setPlatform(Platform.WINDOWS);
		}

		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL(hUrl), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return driver;
	}

}
