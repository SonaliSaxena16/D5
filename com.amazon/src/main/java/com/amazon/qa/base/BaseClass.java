package com.amazon.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	public static WebDriver driver;
//	public static Properties prop;
	
	public  void setUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/com.amazon/Exe Files/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver= new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("www.google.com");
	}
	
}
