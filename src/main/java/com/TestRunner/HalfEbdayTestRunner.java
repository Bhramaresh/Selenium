package com.TestRunner;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestDataUtil.TestDataUtil;

public class HalfEbdayTestRunner {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestDataUtil.getDataFromExcel();
		System.out.println(testData.size());
		return testData.iterator();
		
		
	}
	
	@Test(dataProvider = "getTestData")
	public void halfEbdayRegdPage(String firstName,String lastName,String businessName,String eMail) throws InterruptedException {
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.cssSelector("input.first_name.input.form-control.form-group")).clear();
		driver.findElement(By.cssSelector("input.first_name.input.form-control.form-group")).sendKeys(firstName);
		
		driver.findElement(By.cssSelector("input.last_name.input.form-control.form-group")).clear();
		driver.findElement(By.cssSelector("input.last_name.input.form-control.form-group")).sendKeys(lastName);
		
		driver.findElement(By.cssSelector("input.business_name.input.form-control.form-group")).clear();
		driver.findElement(By.cssSelector("input.business_name.input.form-control.form-group")).sendKeys(businessName);
		
		driver.findElement(By.cssSelector("input.email.input.form-control.form-group")).clear();
		driver.findElement(By.cssSelector("input.email.input.form-control.form-group")).sendKeys(eMail);
		
		Thread.sleep(10000);
		
		//driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border")).click();
		
		
		driver.findElement(By.cssSelector("button#demo")).click();
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
