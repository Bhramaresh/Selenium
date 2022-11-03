package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/bus-tickets");

	}

	@Test
	public void LogIn() throws InterruptedException {
		driver.findElement(By.cssSelector("i.icon.D121_icon_userlogo.icon-userprofile")).click();
		driver.findElement(By.cssSelector("div#D121_signupDrop a span")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.D121_iframe")));
		driver.findElement(By.cssSelector("input#mobileNoInp")).sendKeys("9666309646");
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("div.D121_frame_close i.icon.icon-cross")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("i.icon.icon-cross")).click();
	
	}

}
