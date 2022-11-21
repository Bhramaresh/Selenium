package com.Selenium.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		driver.findElement(By.cssSelector("input#sb_form_q")).sendKeys("selenium");
		List<WebElement> li = driver.findElements(By.cssSelector("li.sa_sg span.sa_tm_text"));
		System.out.println("Number of suggestions "+li.size());
		
		for(WebElement ele:li) {
			if(ele.getText().equalsIgnoreCase("selenium download")) {
				ele.click();
				break;
			}
		}
		

	}

}
