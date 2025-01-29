package nic.ehospital.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import nic.ehospital.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException{		
		
			prop = new Properties();
			
//  FileInputStream fis=new FileInputStream("D:\\J Eclipse\\DummyeHospital\\src\\main\\java\\nic\\ehospital\\qa\\config\\config.properties");
			
	FileInputStream fis=new FileInputStream("./src/main/java/nic/ehospital/qa/config/config.properties");	

		prop.load(fis);
		
		
	}
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("ff")){
		//	System.setProperty("webdriver.gecko.driver","C:\\Users\\Sonali-pc\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
System.setProperty("webdriver.gecko.driver","./ExeFiles/geckodriver.exe");
			
			driver = new FirefoxDriver();
		} 
		else if(browserName.equals("chrome")){
// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali-pc\\Downloads\\chromedriver_win32\\chromedriver.exe");

System.setProperty("webdriver.chrome.driver", "./ExeFiles/chromedriver.exe");

	driver = new ChromeDriver();
	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.navigate().to(browserName);
		Reporter.log("url", true);
		}
	
	public boolean isElementVisible(WebElement element) {
	    try {
	    	WebElement ele = element;
	    	ele.isDisplayed();
	        return  true;
	    } 
	    catch (Exception e) {
	        return false;
	    }
	}
	
	
	
	public boolean isPathVisible(WebElement element, String sendkey){
		try{
		WebElement ele = element;
		ele.sendKeys(sendkey);
		return true;
		}
		
		catch (Exception e) {
		}
		return false;
		}
	










}

	
	
	
	
	
	
		


	
