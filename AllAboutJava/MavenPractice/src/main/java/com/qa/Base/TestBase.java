package com.qa.Base;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.Util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream reader = new FileInputStream("D:\\Repo\\AllAboutJava\\MavenPractice\\src\\main\\java\\com\\qa\\Config\\config.properties");		
		// FileInputStream reader = new FileInputStream("./MavenPractice/src/main/java/com/qa/Config/config.properties");
		prop.load(reader);
	}
	
	public static void initialization() throws InterruptedException{
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("ff")) {
			
	System.setProperty("webdriver.gecko.driver", "D:\\Repo\\AllAboutJava\\MavenPractice\\ExeFiles\\geckodriver.exe");
			
			 driver = new FirefoxDriver();
			
			
		}
		
		else if(browserName.equals("cc")){
			
	System.setProperty("webdriver.chrome.driver", "D:\\Repo\\AllAboutJava\\MavenPractice\\ExeFiles\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			Thread.sleep(5000);
		}
	
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
//	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeOut, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(TestUtil.ImpWait, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	Thread.sleep(5000);
//	driver.quit();
	
	}


	
}


	