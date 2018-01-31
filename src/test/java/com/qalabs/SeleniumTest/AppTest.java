package com.qalabs.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class AppTest {
	public WebDriver driver;
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("testBeforeSuite()");
	}

	@AfterSuite
	public void testAfterSuite() {
		System.out.println("testAfterSuite()");
	}
	
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
	}
	
	@Test(description = "facebook open page")
	public void url() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(description = "Login page", dependsOnMethods = "url")
	public void login() {
		driver.findElement(By.id("email")).sendKeys("*******");
		driver.findElement(By.id("pass")).sendKeys("******");
		driver.findElement(By.id("u_0_2")).click();
	}
	
}
