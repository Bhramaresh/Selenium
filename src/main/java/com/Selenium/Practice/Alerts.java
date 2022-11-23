package com.Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//Java Script Alert with OK button
		
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		driver.switchTo().alert().accept();*/
		
		
		//Java Script alert with OK and cancel button
		/*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.switchTo().alert().accept();//It will accept the Alert popup
		driver.switchTo().alert().dismiss();//It will cancel the Alert popup*/
		
		
				
		//Java Script alert with text feild box 
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("bhramaresh");
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		

	}

}
