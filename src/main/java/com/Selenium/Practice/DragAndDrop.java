package com.Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	
WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		

}
	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions actions = new Actions(driver);
		actions.clickAndHold(driver.findElement(By.cssSelector("div#draggable"))).moveToElement(driver.findElement(By.cssSelector("div#droppable"))).release().build().perform();
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void tearDown() {
		
			//driver.close();
		System.out.println("Operation Completed");
	}
}
