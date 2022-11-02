package com.Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Navigations {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/bus-tickets");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void navigations() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}

}
