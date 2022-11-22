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
		
		//Java Script Alert with OK button
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();*/
		
		//Java Script alert with OK and cancel button
		/*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();*/
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert_window = driver.switchTo().alert();
		Thread.sleep(3000);
		alert_window.sendKeys("Welcome");
		Thread.sleep(3000);
		System.out.println("alert message "+alert_window.getText());
		alert_window.dismiss();
		
		

	}

}
