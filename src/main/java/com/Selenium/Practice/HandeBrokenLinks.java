package com.Selenium.Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandeBrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.deadlinkcity.com/");
		
		
		List<WebElement> links =  driver.findElements(By.xpath("//a"));
		
		for(WebElement ele : links) {
			String link_url = ele.getAttribute("href");
			
			if(link_url==null || link_url.isEmpty()) {
				System.out.println(link_url+" URL is Empty");
				continue;
			}
			
			URL url = new URL(link_url);
			
			HttpURLConnection url_conn = (HttpURLConnection) url.openConnection();
			url_conn.connect();
			
			if (url_conn.getResponseCode() >= 400) {
				System.out.println(url_conn+" Invalid URL");
				
			}
			else {
				System.out.println(url_conn+" Valid URL");
			}
			
		
			
				
			}
		}

}

