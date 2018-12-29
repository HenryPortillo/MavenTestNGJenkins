package com.MavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		driver = new ChromeDriver();
		
		
	}
	
	@Test
	public void failThis() {
		Assert.assertEquals(12, 12);
	}

}
