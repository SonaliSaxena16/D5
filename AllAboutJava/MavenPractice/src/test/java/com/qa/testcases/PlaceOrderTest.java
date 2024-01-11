package com.qa.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import industryBuying.com.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PlaceOrderTest extends BaseClass{
	
	
	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void fetchReportSmc() throws InterruptedException, IOException {
		setUp();
		
driver.findElement(By.xpath("/html/body/app-root/app-login-page/div/div/div[2]/form/input[1]")).sendKeys("m3084");

driver.findElement(By.xpath("/html/body/app-root/app-login-page/div/div/div[2]/form/input[2]")).sendKeys("m3084");

driver.findElement(By.xpath("/html/body/app-root/app-login-page/div/div/div[2]/form/button/span[2]")).click();

Thread.sleep(10000);

driver.findElement(By.xpath("/html/body/app-root/app-dashbaord/div/div[1]/div/app-side-menu/ul/li[1]/ul/li[1]/a/span[1]")).click();

driver.findElement(By.xpath("/html/body/app-root/app-dashbaord/div/div[1]/div/app-side-menu/ul/li[1]/ul/li[1]/ul/li[5]/a/span[1]")).click();
		
Thread.sleep(5000);

 WebElement toDate = driver.findElement(By.xpath("/html/body/app-root/app-dashbaord/div/div[2]/div/app-commercial-cibil/div/div/p-card/div/div/div[2]/form/div[1]/div[1]/input"));

Thread.sleep(5000);


Actions actions = new Actions(driver);

// Use Actions to send keys to the textbox
actions.sendKeys(toDate, "05-10-2023").perform();
Thread.sleep(5000);

WebElement fromDate = driver.findElement(By.xpath("/html/body/app-root/app-dashbaord/div/div[2]/div/app-commercial-cibil/div/div/p-card/div/div/div[2]/form/div[1]/div[2]/input"));

Thread.sleep(5000);

actions.sendKeys(fromDate, "07-10-2023").perform();
Thread.sleep(5000);


driver.findElement(By.xpath("/html/body/app-root/app-dashbaord/div/div[2]/div/app-commercial-cibil/div/div/p-card/div/div/div[2]/form/div[2]/div[2]/p-button/button/span[2]")).click();








////////////////////////////////////////////////////////////
		
////	    waitTo();
////	    Thread.sleep(5000);	
//	    
//	   driver.findElement(By.id("wzrk-cancel")).click();
//	   
////	   waitTo();
//	   Thread.sleep(5000);	
//	   
//	   WebElement elementToHover = driver.findElement(By.xpath("/html/body/div[6]/div/div/section/div[4]/div[2]/div/div/div[2]/div"));
//
//       Actions actions = new Actions(driver);
//
//       actions.moveToElement(elementToHover).build().perform();
//	    
////       waitTo();
//       Thread.sleep(5000);	
//       
//       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Adjust the timeout as needed
//       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/section/div[4]/div[2]/div/div/div[2]/div/div[1]/div[1]")));
//       element.click();
//       
////       waitTo();
//       Thread.sleep(10000);	
//       
//       driver.findElement(By.xpath("//*[@src='/static/svg/cart-icon.svg']")).click();     
//       
////       waitTo();
//       Thread.sleep(5000);	
//       
//       
//       driver.findElement(By.xpath("//*[@class='placeorder-btn']")).click(); 
//
////       waitTo();
//       Thread.sleep(5000);	
//
//       driver.findElement(By.xpath("//*[@class='otp']")).click();  
//       
////       waitTo();
//       Thread.sleep(5000);	
//       
//       
//       driver.findElement(By.xpath("//*[@name='email']")).sendKeys("xyz@gmail.com");
//       
////       waitTo();
//       Thread.sleep(5000);	
//       
//       driver.quit();
//		
	}
	
	
	
	
	
	
	
	
	
}
