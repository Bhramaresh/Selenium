package com.ScreenShotPractice;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ScreenListener.class)
public class ScreenShotRunner {
	
	@BeforeTest
	public void setUp() {
		Base.initilizer();
		
	}
	@Test
	public void LogInTest() {
		
		Base.driver.manage().window().maximize();
		Base.driver.manage().deleteAllCookies();
		Base.driver.get("http://www.google.com");
		Assert.assertEquals(false, true);
		
		
	}
	
	@Test
	public void VaerifyTest() {
		
		Base.driver.manage().window().maximize();
		Base.driver.manage().deleteAllCookies();
		Base.driver.get("http://www.google.com");
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void ShutdownTest() {
		
		Base.driver.manage().window().maximize();
		Base.driver.manage().deleteAllCookies();
		Base.driver.get("http://www.google.com");
		Assert.assertEquals(false, true);
	}
	@AfterTest
	public void tearDown() {
		Base.driver.quit();
		
	}

}
