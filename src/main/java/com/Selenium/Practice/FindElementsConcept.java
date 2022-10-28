package com.Selenium.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementsConcept {
	
	WebDriver driver;

	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test
	public void checkElementsOnPage() {
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for (WebElement list : linklist) {
			System.out.println(list.getText());
		}
	}

}
