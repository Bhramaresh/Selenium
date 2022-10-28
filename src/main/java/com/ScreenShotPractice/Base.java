package com.ScreenShotPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;

	public static void initilizer() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\src\\main\\java\\com\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	//To take screenshot
	public void TakeScreenForFailedTest(String testName) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(
					"C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Selenium-Practice\\Selenium-Practice\\Screenshots\\"+testName+".jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
