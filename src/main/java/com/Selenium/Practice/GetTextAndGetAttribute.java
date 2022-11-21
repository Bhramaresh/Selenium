package com.Selenium.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GetTextAndGetAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1156794741%3A1668621006553908&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAsELoFeIP5cNzc57iWPDdQYKmclIPRx0hPktViGH5q0fIBmGXKbhAF-sTrNKm5ggjQXtla07g");
//		driver.findElement(By.id("identifierId")).sendKeys("bhramaresh9646");
//		
//		System.out.println(driver.findElement(By.id("identifierId")).getAttribute("value"));
		
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div.navbar-right.hidden-xs a.btn.btn-black.navbar-btn")).click();
		WebElement drop_ctry_ele = driver.findElement(By.id("input-country"));
		Select drop_ctry_ = new Select(drop_ctry_ele);
//		drop_ctry_.selectByVisibleText("Greece");
//		Thread.sleep(2000);
//		drop_ctry_.selectByValue("5");
//		Thread.sleep(2000);
//		drop_ctry_.selectByIndex(10);
		
		List<WebElement> all_options  = drop_ctry_.getOptions();
		
		for(WebElement ele : all_options) {
			if (ele.getText().equals("Greece")) {
				ele.click();
				break;
			}
		}
	}

}
