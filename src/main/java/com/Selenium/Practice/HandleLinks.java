package com.Selenium.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//1)LinkText()
		driver.findElement(By.linkText("Mobiles")).click();
		//2)PartialLinkText()
		driver.findElement(By.partialLinkText("Best")).click();
		//3)Capture all links from the web page
		List<WebElement> links =  driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		for(WebElement ele : links) {
			//System.out.println(ele.getText());
			System.out.println(ele.getAttribute("href"));
		}

	}

}
