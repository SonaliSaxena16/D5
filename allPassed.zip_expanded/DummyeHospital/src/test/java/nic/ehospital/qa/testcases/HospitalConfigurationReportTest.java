package nic.ehospital.qa.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import nic.ehospital.qa.base.TestBase;
import nic.ehospital.qa.excel.XLS_Reader;
import nic.ehospital.qa.pages.ConfigureRegistrationParameters;
import nic.ehospital.qa.pages.HospitalConfigurationReport;
import nic.ehospital.qa.util.TestUtil;

public class HospitalConfigurationReportTest extends TestBase{
	
	HospitalConfigurationReport HCR;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	
	
	public HospitalConfigurationReportTest() throws IOException {
		super();
	}
	
	@Test(priority=1, groups={"Functional","Smoke"})
	public void hospitalConfigurationReportLinkIsDisplayed() throws IOException, InterruptedException{
		HCR = new HospitalConfigurationReport();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = HCR.hospitalConfigurationReportLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Hospital Configuration Report Link Is Displayed");
		}
	}

	@Test(priority=2, groups={"Functional","Smoke"})
	public void hospitalConfigurationReportLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = HCR.hospitalConfigurationReportLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			HCR.hospitalConfigurationReportLinkIsClickable();
			testUtil.RightFrame();
			Thread.sleep(2000);
			List<WebElement>elements = driver.findElements(By.tagName("body"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		   // 	System.out.println(od); 
		    	}
		Reporter.log("Hospital Configuration Report Link is Enabled & Clickable", true);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
