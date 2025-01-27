package nic.ehospital.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import nic.ehospital.qa.base.TestBase;

public class HospitalConfigurationReport extends TestBase {
	
	@FindBy(xpath="//*[contains(@title,'Hospital Configuration Report')]")
	WebElement HospitalConfigurationReportLink;


	public HospitalConfigurationReport() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	
	//Validate: Hospital Configuration Report Link is Displayed
	public boolean hospitalConfigurationReportLinkIsDisplayed(){
	WebElement link = HospitalConfigurationReportLink;
	return link.isDisplayed();
	}

	//Validate: Hospital Configuration Report link is Enabled
	public boolean hospitalConfigurationReportLinkIsEnabled(){
	WebElement btn = HospitalConfigurationReportLink;
	return btn.isEnabled();
	}
	
	//Validate: Hospital Configuration Report link is Clickable
	public void hospitalConfigurationReportLinkIsClickable() throws InterruptedException{
	HospitalConfigurationReportLink.click();
	Thread.sleep(5000);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
