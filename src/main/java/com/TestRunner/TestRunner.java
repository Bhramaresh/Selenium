package com.TestRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



//System.setProperty("webdriver.chrome.driver", "src/main/java/com/Drivers/chromedriver.exe");

public class TestRunner {

	WebDriver driver;

	@Parameters({"URL"})
	@BeforeMethod
	public void before_Test(String URL) {
		System.setProperty("webdriver.chrome.driver", "src/main/java/com/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println(URL+"From before test");
		driver.get(URL);
		
		
	}

	
	@Parameters({"URL","emailID","password","SKU"})
	@Test()
	public void test_ANF(String URL,String emailID,String password,String SKU) {
			
		
		//driver.get(URL);
		//driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "Google","");	
		
//		driver.findElement(By.cssSelector("#search-input-field")).sendKeys(SKU);
//		driver.findElement(By.cssSelector("#search-input-field"));
//		driver.findElement(By.cssSelector("#customer-web-service-SignInBlockFrontend button.button "));//.sendKeys("prodtesting@gmail.com");
//		driver.findElement(By.cssSelector("#email-sign-in")).sendKeys("emailID");
//		driver.findElement(By.cssSelector("#login-password-field-sign-in")).sendKeys("password");
//		driver.findElement(By.cssSelector("button ds-override primary-button js-social-signon-remembered-sign-in")).click();
		
		
		
		
	
	}

	
	
	
	
	@AfterMethod
	public void after_Test() {
		driver.quit();

	}

}
