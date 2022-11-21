package com.Selenium.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingMultiDropDowns {
	
	
	
	public static void selectDropDown(List <WebElement> element, String drop_value) {
		
		
		for(WebElement ele : element) {
			
			if(ele.getText().equals(drop_value)) {
				ele.click();
				System.out.println("Selected "+ele.getText()+" from the drop down");
				break;
				
			}
			
		}
	}
	

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		
		
		
		
		//1st dropdown
		driver.findElement(By.cssSelector("div.drp1 div.dropdown a.btn-primary.dropdown-toggle.btn-block")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List <WebElement> first_drop_options =  driver.findElements(By.cssSelector("ul.dropdown1.dropdown-menu li"));//
		selectDropDown(first_drop_options, "Invest");
		
		//2nd Dropdown
		driver.findElement(By.cssSelector("div .drp2 div.dropdown a.btn-primary.dropdown-toggle.btn-block")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> second_drop_options = driver.findElements(By.cssSelector("ul.dropdown2.dropdown-menu li"));
		selectDropDown(second_drop_options, "Public Provident Fund");
		
		
		
//		List <WebElement> drop_options =  driver.findElements(By.cssSelector("ul.dropdown1.dropdown-menu li"));
//		
//		for(WebElement ele : drop_options) {
//			
//			if(ele.getText().equals("Invest")) {
//				ele.click();
//				System.out.println("Selected "+ele.getText()+" from the drop down");
//				break;
//				
//			}
//			
//		}
	}

}
