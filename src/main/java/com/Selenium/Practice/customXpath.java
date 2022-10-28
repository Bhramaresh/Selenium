package com.Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class customXpath {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		
		Thread.sleep(5000);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test
	public void custom_Xpath() {
		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
	}
}
