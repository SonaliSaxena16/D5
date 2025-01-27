package nic.ehospital.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import nic.ehospital.qa.base.TestBase;

public class AuditTrail extends TestBase{
	
	@FindBy(xpath="//*[contains(@title,'Audit trail')]")
	WebElement AuditTrailLink;
	
	@FindBy(xpath="//*[contains(@id,'searchlirpt')]")
	WebElement AuditTrail_SearchBtn;
	

	public AuditTrail() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	
		//Validate: Audit trail Link is Displayed
		public boolean auditTrailLinkIsDisplayed(){
		WebElement link = AuditTrailLink;
		return link.isDisplayed();
		}

		//Validate: Audit trail link is Enabled
		public boolean auditTrailLinkIsEnabled(){
		WebElement btn = AuditTrailLink;
		return btn.isEnabled();
		}
		
		//Validate: Audit trail link is Clickable
		public void auditTrailLinkIsClickable() throws InterruptedException{
		AuditTrailLink.click();
		Thread.sleep(5000);
		}

		
			//Validate: Audit trail_Search Btn is Displayed
				public boolean auditTrail_SearchBtnIsDisplayed(){
				WebElement link = AuditTrail_SearchBtn;
				return link.isDisplayed();
				}

				//Validate: Audit trail_Search Btn is Enabled
				public boolean auditTrail_SearchBtnIsEnabled(){
				WebElement btn = AuditTrail_SearchBtn;
				return btn.isEnabled();
				}
				
				//Validate: Audit trail_Search Btn is Clickable
				public void auditTrail_SearchBtnIsClickable() throws InterruptedException{
				AuditTrail_SearchBtn.click();
				Thread.sleep(5000);
				}
		
}
