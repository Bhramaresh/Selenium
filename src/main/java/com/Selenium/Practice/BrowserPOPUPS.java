package com.Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.html.Option;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPOPUPS {
	public static void main(String[] args) {
	/*	WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();//Using this class we can disable notifications from the browser, based on the browser this class will be changed
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/"); */
		
		
		
		int arr [] = {1,2,3,4,5,2};
		
		for(int i = 0; i < arr.length; i++) {
			
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					
					System.out.println("Found duplicate in Array "+arr[i]);
					
					
				}
				
				
			}
			
			
		}
		
	
	}

}
