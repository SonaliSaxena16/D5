package nic.ehospital.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import nic.ehospital.qa.base.TestBase;


public class TestUtil extends TestBase{

public TestUtil() throws IOException {		
}

	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 20;
	
	

public void BannerFrame() throws InterruptedException{
Thread.sleep(2000);
driver.switchTo().defaultContent();	
driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='ehosfrm']")));
driver.switchTo().frame(driver.findElement(By.xpath ("/html/frameset/frame")));	
}

public void LeftFrame(){
driver.switchTo().defaultContent();	
driver.switchTo().frame(driver.findElement(By.id("ehosfrm")));
driver.switchTo().frame(driver.findElement(By.xpath ("/html/frameset/frameset/frame[1]")));}	


public  void RightFrame(){
driver.switchTo().defaultContent();	
driver.switchTo().frame(driver.findElement(By.id("ehosfrm")));
driver.switchTo().frame(driver.findElement(By.xpath ("/html/frameset/frameset/frame[2]")));}
}

