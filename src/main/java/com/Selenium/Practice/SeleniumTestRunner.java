package com.Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.After;

public class SeleniumTestRunner {
	
	WebDriver driver;
	Select dropDown;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void verifyLogIn() throws InterruptedException {
		
//		//1.Using XPath
//		driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/input[1]")).sendKeys("Tom");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/input[2]")).sendKeys("Jerry");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/input[3]")).sendKeys("Tom&Jerry");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/input[4]")).sendKeys("Tomandjerry@gmail.com");
		//absolute xPath
//		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Tom");
//		Thread.sleep(5000);
		
		
		//2.Using ID
		
		
		
		//3.Using Name
//		driver.findElement(By.name("first_name")).sendKeys("Tom");
//		driver.findElement(By.name("last_name")).sendKeys("Jerry");
//		driver.findElement(By.name("business_name")).sendKeys("Tom&Jerry");
//		driver.findElement(By.name("email")).sendKeys("Tomandjerry@gmail.com");
//		Thread.sleep(2000);
			
		
		
		//4.Using linkText
//		driver.findElement(By.linkText("Sign Up")).click();
//		Thread.sleep(5000);
		
		//5.PartialLinkText
//		driver.findElement(By.partialLinkText("Sign ")).click();
//		Thread.sleep(5000);
		
		//6.Using CssSelector
//		driver.findElement(By.cssSelector("#content > section.grey-box.mt5 > div > div > div:nth-child(2) > div > div > div > div > div > div > div > div.form > input.first_name.input.mb1")).sendKeys("Tom");
//		driver.findElement(By.cssSelector("#content > section.grey-box.mt5 > div > div > div:nth-child(2) > div > div > div > div > div > div > div > div.form > input.last_name.input.mb1")).sendKeys("Jerry");
//		driver.findElement(By.cssSelector("#content > section.grey-box.mt5 > div > div > div:nth-child(2) > div > div > div > div > div > div > div > div.form > input.business_name.input.mb1")).sendKeys("Tom&Jerry");
		
		
		//7.Using class
//		driver.findElement(By.className("first_name input mb1")).sendKeys("Tom");
//		driver.findElement(By.className("last_name input mb1")).sendKeys("Jerry");
		
		
		driver.findElement(By.id("nav-orders")).click();
		driver.findElement(By.id("ap_email")).sendKeys("919666309646");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector("span #continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Bhrama@9646");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector("#signInSubmit")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		dropDown = new Select(driver.findElement(By.id("time-filter")));
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		//dropDown.selectByVisibleText("2020");
		Thread.sleep(2000);
		//dropDown.selectByValue("year-2022");
		//dropDown.selectByIndex(2);
		//dropDown.deselectAll();
		//dropDown.deselectByIndex(0);
		
		
		
		//dropDown.
		
		
		
	}
	
	@AfterTest
	public void tearDown() {
		if(driver != null) {
			//driver.close();
			//driver.quit();
		}
		
	}
	
	

}
