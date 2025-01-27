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
import nic.ehospital.qa.pages.AuditTrail;
import nic.ehospital.qa.pages.HospitalConfigurationReport;
import nic.ehospital.qa.util.TestUtil;

public class AuditTrailTest extends TestBase{
	
	AuditTrail auditTrail;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	

	public AuditTrailTest() throws IOException {
		super();
	}

	@Test(priority=1, groups={"Functional","Smoke"})
	public void auditTrailLinkIsDisplayed() throws IOException, InterruptedException{
		auditTrail = new AuditTrail();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = auditTrail.auditTrailLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Audit Trail Link Is Displayed");
		}
	}

	@Test(priority=2, groups={"Functional","Smoke"})
	public void auditTrailLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = auditTrail.auditTrailLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			auditTrail.auditTrailLinkIsClickable();
			testUtil.RightFrame();
			Thread.sleep(2000);
			List<WebElement>elements = driver.findElements(By.tagName("body"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		   // 	System.out.println(od); 
		    	}
		Reporter.log("Configure Reg Para Link is Enabled & Clickable", true);
		}
	}


	@Test(priority=3, groups={"Functional"})
	public void auditTrail_SearchBtnIsDisplayed() throws IOException, InterruptedException{
		boolean flag = auditTrail.auditTrail_SearchBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Audit Trail Link_Search Button Is Displayed");
		}
	}

	@Test(priority=4, groups={"Functional","Smoke"})
	public void auditTrail_SearchBtnIsEnabled() throws IOException, InterruptedException{
		boolean flag = auditTrail.auditTrail_SearchBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			auditTrail.auditTrail_SearchBtnIsClickable();
			
		Reporter.log("Audit Trail Link_Search Button Is Enabled & Clickable", true);
		}
	}
	
}
