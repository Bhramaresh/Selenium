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

	public static void main(String[] args) throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenLinks = 0;
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			
			if(url == null || url.isEmpty()) {
				System.out.println("URL is EMPTY");
				continue;
			}
			
			URL url_link = new URL(url);//This is the class from java.net package to convert the String to URL
			try {
				HttpURLConnection httpconn = (HttpURLConnection) url_link.openConnection();//This is the class from java.net package, it is used to establish the connection to the particular URL
				httpconn.connect();
				if(httpconn.getResponseCode()>=400) {
					System.out.println(httpconn.getResponseCode()+" "+url+" "+" is Briken LInk");
					brokenLinks++;
				}
				else{
					System.out.println(httpconn.getResponseCode()+" "+url+" is valid Link");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("number of broken links"+ brokenLinks);

	}

}
