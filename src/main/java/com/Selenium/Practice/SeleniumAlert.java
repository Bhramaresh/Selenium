package com.Selenium.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumAlert {
	
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.demoblaze.com/#");
	}
	
	@Test
	public void verifyLogIn() throws InterruptedException {
		driver.findElement(By.cssSelector("a#signin2")).click();
		Thread.sleep(5000);
		//driver.switchTo().frame("");
		//driver.findElement(By.cssSelector("div.modal-body form div.form-group input#sign-username")).sendKeys("9666309646");
		//driver.findElement(By.cssSelector("div.modal-body form div.form-group input#sign-password")).sendKeys("9666309646");
		//driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		Alert alert = driver.switchTo().alert();
		String Text = alert.getText();
		System.out.println(Text);
		alert.dismiss();
		//alert.accept();
	}

}
