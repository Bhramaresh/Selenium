package com.Selenium.Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HoverAction {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
//		Thread.sleep(5000);
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.dismiss();
//		System.out.println("completed");
		
		
		
		
		
		
	}
	
	@Test
	public void searchForFlight() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-13qz1uu.r-1g40b8q > div.css-1dbjc4n.r-184aecr.r-18u37iz.r-1777fci.r-1w50u8q.r-184en5c > div > div.css-1dbjc4n.r-kgf08f.r-18u37iz > div:nth-child(5) > div > div.css-1dbjc4n.r-1awozwy.r-1loqt21.r-18u37iz.r-le9fof.r-1otgn73 > div.css-76zvg2.r-jwli3a.r-ubezar.r-16dba41.r-1pzd9i8"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Tiers")).click();
		
		
	}
	
	

}
