package ehospital.Billing_Module.helper;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ehospital.Billing_Module.Locators.PatientRegistrationLocators;
import in.nic.ehospial.generic.BaseClass;

public class PatientRegistrationHelper extends BaseClass {
	public WebDriver driver;
	PatientRegistrationLocators prl;
	
	public PatientRegistrationHelper(WebDriver driver) throws IOException  {
		this.driver = driver;
		prl = new PatientRegistrationLocators(driver);
	}
	
	//Action
	//Validate Patient Registration link is displayed or not
	public boolean ValidatePatientRegistrationlinkisdisplayed() throws IOException {
		
		
		
	WebElement PatientRegistrationlink = prl.getPatientRegistration();
	return PatientRegistrationlink.isDisplayed();
	}
	//Validate Patient Registration link is enabled or not
	public boolean ValidatePatientRegistrationlinkisenabled() {
	WebElement PatientRegistrationlink = prl.getPatientRegistration();
	return PatientRegistrationlink.isEnabled();
		}
	//click on patient registration link
	public void Selectpatientregistrationlink() throws InterruptedException {
	Thread.sleep(2000);
	prl.getPatientRegistration().click();	
	}
	//validate New Registration link is displayed or not
	public boolean validateNewRegistrationlinkisdispalyed() {
	WebElement NewRegistrationlink = prl.getNewRegistration();
	return NewRegistrationlink.isDisplayed();
	}
	//validate New Registration link is enabled or not
	public boolean validateNewRegistrationlinkisenabled() {
	WebElement NewRegistrationlink = prl.getNewRegistration();
	return NewRegistrationlink.isEnabled();
	}
	//Select new registration link
	public void selectnewregistrationlink() {
		prl.getNewRegistration().click();	
	}
	//validate skip button is displayed
	public boolean validateskipbuttonisdisplayed() {
		WebElement skipbutton = prl.getSkipbutton();
		return skipbutton.isDisplayed();
	}
	//validate skip button is enabled
	public boolean validateskipbuttonisenabled() {
		WebElement skipbutton = prl.getSkipbutton();
		return skipbutton.isEnabled();
	}
	//click on skip button
	public void clickonskipbutton() {
		prl.getSkipbutton().click();
	}
	public void clearageboxdata() throws InterruptedException {
		Thread.sleep(2000);
		prl.getAge().clear();	
	}

	public void RegistrationData(String Initials, String FirstName, String MiddleName, String LastName, String Age, String Guardianname, String Address) throws InterruptedException {
		Thread.sleep(2000);
		Select dopdown = new Select(prl.getInitialsdropdown());
		dopdown.selectByVisibleText(Initials);
		Thread.sleep(2000);
		prl.getFirstName().sendKeys(FirstName);
		Thread.sleep(2000);
		prl.getMiddleName().sendKeys(MiddleName);
		Thread.sleep(2000);
		prl.getLastName().sendKeys(LastName);
		Thread.sleep(2000);
		prl.getAge().sendKeys(Age);
		Thread.sleep(2000);
		prl.getGuardianname().sendKeys(Guardianname);
		Thread.sleep(2000);
		prl.getAddress().sendKeys(Address);
	}
	public void Selectdepartmentandclickonsavebutton() throws InterruptedException {
		Select dopdown = new Select(prl.getDepartmentdropdown());
		dopdown.selectByIndex(1);
		Thread.sleep(2000);
		prl.getSavebutton().click();
		Thread.sleep(5000);
		
		prl.getClosebutton().click();
	}

	public void clickonDuplicateRegistrationSliplink() throws InterruptedException {
		Thread.sleep(2000);
		prl.getDuplicateRegistrationSlip().click();
	}

	public void clickondatecheckbox() throws InterruptedException {
		Thread.sleep(2000);
		prl.getDatecheckbox().click();
	}
	public void clickongetresult() throws InterruptedException {
		Thread.sleep(2000);
		prl.getGetResult().click();
	}
	public String getUHID() throws InterruptedException {
		Thread.sleep(2000);
		String UHID = prl.getSelectuhid().getText();
		return UHID;
	}


	
}
