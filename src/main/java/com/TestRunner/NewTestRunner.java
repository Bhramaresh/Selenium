package com.TestRunner;

import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestRunner {
	
	WebDriver driver;
	
	@BeforeMethod
	public void before_Test() {
		System.setProperty("webdriver.chrome.driver", "src/main/java/com/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
	}

	@Test()
	public void test_ANF() {
		driver.get("https://www.abercrombie.com");
		//driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google","");	
		
	
	}

	
	
	
	
	@AfterMethod
	public void after_Test() {
		driver.quit();

	}
}
