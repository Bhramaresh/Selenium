package com.Selenium.Practice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//1.Select specific check box
		//driver.findElement(By.cssSelector("input#monday")).click();
		
		//2.Select allcheckboxes
		 List<WebElement> checks = driver.findElements(By.xpath("//div[@class='form-check']//input[@type='checkbox']"));
//		 for(WebElement ele: checks) {
//			 Thread.sleep(1000);
//			 ele.click();
//			 System.out.println(ele.getText());
//		 }
		 
		 for (WebElement webElement : checks) {
			 String s = webElement.getAttribute("id");
			 if (s.equalsIgnoreCase("monday") || s.equalsIgnoreCase("sunday")) {
				webElement.click();
				
			}
			
		}

	}

}
