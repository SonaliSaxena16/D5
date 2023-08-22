package ehospital.ADT_Module.helper;

import org.openqa.selenium.WebDriver;

import ehospital.ADT_Module.Locators.ExistingPatientLocators;
import in.nic.ehospial.generic.BaseClass;

public class ExistingPatientHelper extends BaseClass{
public WebDriver driver;
	
ExistingPatientLocators ExistingPatient;
								
								
public ExistingPatientHelper(WebDriver driver) {
this.driver = driver;
ExistingPatient = new ExistingPatientLocators(driver);
}

//Action

public void SelectIPDModule() {
	delay();
	ExistingPatient.getADTModule().click();
	delay();
	ExistingPatient.getIPDAdmissionSubModule().click();
	delay();
	ExistingPatient.getExistingPatientLink().click();
}

public void AdmitthePatient(String ValidID) throws InterruptedException {
	ExistingPatient.getUHIDTextBox().clear();
	delay();
	ExistingPatient.getUHIDTextBox().sendKeys(ValidID);
	delay();
	ExistingPatient.getShowPatientDetailsButton().click();
	Thread.sleep(10000);
	selectDropdownVisibleElement(ExistingPatient.getDepartMentDropdown(),"IPD Automation");
	delay();
	selectDropdownVisibleElement(ExistingPatient.getUnitDropdown(),"Automation Unit");
	delay();
	selectDropdownVisibleElement(ExistingPatient.getWardDropdown(),"IPD Automation Ward");
	delay();
	ExistingPatient.getSaveandGenerateTicketbutton().click();
}

public void SelectDuplicateAdmissionSliplink() {
	ExistingPatient.getDuplicateAdmissionSliplink().click();
}

public void EnterUHID(String ValidID) throws InterruptedException {
	ExistingPatient.getUHIDTextBox().clear();
	delay();
	ExistingPatient.getUHIDTextBox().sendKeys(ValidID);
	delay();
	ExistingPatient.getSearchbutton().click();
}

public String getAdmissionId() {
	delay();
	String IPNumber = ExistingPatient.getAdmissionID().getText();
	return IPNumber;
}

public void ClickonADTModule() {
	delay();
	ExistingPatient.getADTModule().click();
	
}



}
