package com.tng.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

public class OhrmAddEmployee2 {
	WebDriver driver;

	@BeforeClass
	public void openApplication() {
		// get driver
		driver = DriverFactory.getDriver("chrome");

		// specify page load timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// specify findelement time
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// maximize browser window
		driver.manage().window().maximize();

		// goto application
		driver.get("http://opensource.demo.orangehrmlive.com");

		System.out.println("Open application completed");
		System.out.println("this is a new change");
	}

	@Test()
	public void login() {
		// enter text in user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// enter text in password
		driver.findElement(By.name("txtPassword")).sendKeys("admin");

		// click on login
		driver.findElement(By.id("btnLogin")).click();

		System.out.println("Logged in to application");
	}

	@Test(dependsOnMethods = "login")
	public void addEmployee() {
		// click on pim link
		driver.findElement(By.linkText("PIM")).click();

		// click on add employee
		driver.findElement(By.partialLinkText("Add Emp")).click();

		// enter text on first name
		driver.findElement(By.id("firstName")).sendKeys("selenium");

		// enter last name
		driver.findElement(By.id("lastName")).sendKeys("hq");

		// click on save
		driver.findElement(By.id("btnSave")).click();

		System.out.println("Employee Added");
	}

	@AfterClass
	public void CloseApplication() {
		driver.quit();
		System.out.println("application closed");
	}
}
