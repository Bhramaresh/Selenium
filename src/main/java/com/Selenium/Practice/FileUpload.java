package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	
	WebDriver driver;
	
	
	
	
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://html.com/input-type-file/");
		
	
	}
	
	@Test
	public void uploadFile() {
		
		driver.findElement(By.cssSelector("input#fileupload")).sendKeys("C:\\Users\\user\\Downloads\\PFSOffshoreDiwaliVideo.Mp4");
		driver.findElement(By.cssSelector("div.render form input[type='submit']")).click();
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Test Case Passed");
		
	}

}
