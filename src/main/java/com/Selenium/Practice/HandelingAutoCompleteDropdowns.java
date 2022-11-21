package com.Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingAutoCompleteDropdowns {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		driver.findElement(By.cssSelector("button#details-button")).click();
		driver.findElement(By.linkText("Proceed to www.twoplugs.com (unsafe)")).click();//a#proceed-link
		WebElement autoComplete =  driver.findElement(By.cssSelector("input#autocomplete"));
		Thread.sleep(3000);
		
		autoComplete.clear();
		Thread.sleep(3000);
		autoComplete.sendKeys("Toronto");
		Thread.sleep(3000);
		String text;
		
		do {
			
			autoComplete.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			text = autoComplete.getAttribute("value");
			Thread.sleep(3000);
			if(text.contains("Toronto, OH, USA")) {
				Thread.sleep(3000);
				autoComplete.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				break;
				
			}
		} while (!text.isEmpty());
	}

}
