package com.Selenium.Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkDropDownSortedorNot {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button#details-button")).click();
		driver.findElement(By.linkText("Proceed to www.twoplugs.com (unsafe)")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement drop = driver.findElement(By.xpath("//select[@name='category_id']"));
		Select dropSelect = new Select(drop);
		
		List<WebElement> list = dropSelect.getOptions();
		
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for(WebElement ele:list) {
			originalList.add(ele.getText());
			tempList.add(ele.getText());
		}

		
		Collections.sort(tempList);
		
		if (originalList.equals(tempList))
			System.out.println("Drop Down is in Sorted order");
		else 
			System.out.println("Drop Down not in Sorted order");
	}

}
