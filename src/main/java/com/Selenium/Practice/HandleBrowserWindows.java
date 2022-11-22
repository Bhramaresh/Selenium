package com.Selenium.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//1)Handeling single window from the browser
		/*String windowID =  driver.getWindowHandle();//Captures the single window ID
		System.out.println(windowID);//CDwindow-C183569FBAE0075343E03ED4DD247BC7*/
		
		//2)Handeling multiple windows from the browser
		driver.findElement(By.xpath("//p //a[@target='_blank']")).click();
		
		/*Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		
		String parent_ID =  it.next();
		String child_ID = it.next();
		
		System.out.println(parent_ID);
		System.out.println(child_ID);
		Thread.sleep(3000);*/
		
		//3)How to switch from one window to another window
		/*driver.switchTo().window(parent_ID);
		System.out.println("Parent window Title - "+driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(child_ID);
		System.out.println("child window title - "+ driver.getTitle());*/
		
		List <String>windowIDs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(5000);
		for(String str : windowIDs) {
			
			String title = driver.switchTo().window(str).getTitle();
			if(title.equalsIgnoreCase("OrangeHRM"))
				driver.close();
		}
		
		
	}

}
