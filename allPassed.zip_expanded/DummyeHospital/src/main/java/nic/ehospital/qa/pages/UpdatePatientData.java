package nic.ehospital.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import nic.ehospital.qa.base.TestBase;

public class UpdatePatientData extends TestBase{

	
	@FindBy(partialLinkText="Patient Data Administration")
	WebElement patientDataAdministrationLink;
	
	@FindBy(xpath="//*[contains(@title,'Update Patient Data')]")
	WebElement updatePatientDataLink;
	
	@FindBy(xpath="//*[contains(@id,'txtRegNo')]")
	WebElement registrationNumberTxtbox;

	@FindBy(xpath="//*[contains(@id,'btnSearch')]")
	WebElement searchPatientBtn;
	
	@FindBy(xpath="//*[contains(@id,'patient_name_patient_name_initials')]")
	WebElement initialsDrpdwn;
	
	@FindBy(xpath="//*[contains(@id,'patient_name_patient_name_first')]")
	WebElement firstNameTxtbox;
	
	@FindBy(xpath="//*[contains(@id,'patient_name_patient_name_middle')]")
	WebElement middleNameTxtbox;
	
	@FindBy(xpath="//*[contains(@id,'patient_name_patient_name_last')]")
	WebElement lastNameTxtbox;
	
	@FindBy(xpath="//*[contains(@id,'date_time_birth_year')]")
	WebElement ageInYrsTxtbox;
	
	@FindBy(xpath="//*[contains(@id,'date_time_birth_month')]")
	WebElement ageInMonthTxtbox;
	
	@FindBy(xpath="//*[contains(@id,'date_time_birth_day')]")
	WebElement ageInDaysTxtbox;
	
	@FindBy(xpath="//*[contains(@id,'mobileNo')]")
	WebElement mobileNoTxtbox;
	
	@FindBy(xpath="//*[contains(@id,'mlc_chk')]")
	WebElement mlcDrpdwn;
	
	@FindBy(xpath="//*[contains(@id,'address_patient_add_street')]")
	WebElement addressLine1;
	
	@FindBy(xpath="//*[contains(@id,'address_patient_add_other')]")
	WebElement addressLine2;

	@FindBy(xpath="//*[contains(@id,'fathers_name')]")
	WebElement fathersName;

	@FindBy(xpath="//*[contains(@id,'btnUpdate')]")
	WebElement updatePatientDetailsBtn;
	
	
	
	
	
	
	

	public UpdatePatientData() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	
	// Perform Actions
	
	//Validate: Patient Data Administration Link Is Displayed
	public boolean patientDataAdministrationLinkIsDisplayed(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
	WebElement link = patientDataAdministrationLink;
	return link.isDisplayed();
	}			

	//Validate: Patient Data Administration Link is Enabled
	public boolean patientDataAdministrationLinkIsEnabled(){
	WebElement btn = patientDataAdministrationLink;
	return btn.isEnabled();
	}		
				
				
	//Validate: Patient Data Administration Link is Clickable
	public void patientDataAdministrationLinkIsClickable() throws InterruptedException{
	patientDataAdministrationLink.click();
	Thread.sleep(2000);
	}

	
	
		//Validate: Update Patient Data Link Is Displayed
		public boolean updatePatientDataLinkIsDisplayed(){
		WebElement link = updatePatientDataLink;
		return link.isDisplayed();
		}			

		//Validate: Update Patient Data Link is Enabled
		public boolean updatePatientDataLinkIsEnabled(){
		WebElement btn = updatePatientDataLink;
		return btn.isEnabled();
		}		
					
					
		//Validate: Update Patient Data Link is Clickable
		public void updatePatientDataLinkIsClickable() throws InterruptedException{
		updatePatientDataLink.click();
		Thread.sleep(2000);
		}

	
		//Validate: Registration number textbox Is Displayed
		public boolean registratinNoTxtboxIsDisplayed(){
		WebElement link = registrationNumberTxtbox;
		return link.isDisplayed();
		}				

		//Validate: Registration number textbox is Enabled
		public boolean registratinNoTxtboxIsEnabled(){
		WebElement btn = registrationNumberTxtbox;
		return btn.isEnabled();
		}		
			
	
		//Validate: Search button Is Displayed
		public boolean searchPatientBtnIsDisplayed(){
		WebElement link = searchPatientBtn;
		return link.isDisplayed();
		}				

						
		//Validate: Search button is Enabled
		public boolean searchPatientBtnIsEnabled(){
		WebElement btn = searchPatientBtn;
		return btn.isEnabled();
		}						
							
				
		//Validate: Search button is Clickable
		public void searchPatientBtnIsClickable() throws InterruptedException{
		searchPatientBtn.click();
		Thread.sleep(2000);
		}
	
		//Validate: Initials Dropdown is Displayed
		public boolean initialsDrpdwnIsDisplayed() throws InterruptedException{
		WebElement drpdwn = initialsDrpdwn;
		return drpdwn.isDisplayed();
		}
		
		//Validate: Initials Dropdown is Enabled
		public boolean initialsDrpdwnIsEnabled(){
		WebElement drpdwn = initialsDrpdwn;
		return drpdwn.isEnabled();
		}
		
		//Validate: Initials Dropdown is Multiple
		public boolean initialsDrpdwnIsMultiple() throws InterruptedException{
		Select ListBox = new Select(initialsDrpdwn);
		boolean value = ListBox.isMultiple() ;
		return value;
		}
	

		//Validate: First Name textbox Is Displayed
		public boolean firstNameTxtboxIsDisplayed(){
		WebElement link = firstNameTxtbox;
		return link.isDisplayed();
		}					

		//Validate: First Name textbox is Enabled
		public boolean firstNameTxtboxIsEnabled(){
		WebElement btn = firstNameTxtbox;
		return btn.isEnabled();
		}		
		
		//Validate: Middle Name textbox Is Displayed
		public boolean middleNameTxtboxIsDisplayed(){
		WebElement link = middleNameTxtbox;
		return link.isDisplayed();
		}							

		//Validate: Middle Name textbox is Enabled
		public boolean middleNameTxtboxIsEnabled(){
		WebElement btn = middleNameTxtbox;
		return btn.isEnabled();
		}								
	
	
		//Validate: Last Name textbox Is Displayed
		public boolean lastNameTxtboxIsDisplayed(){
		WebElement link = lastNameTxtbox;
		return link.isDisplayed();
		}				
	
		
		//Validate: Last Name textbox is Enabled
		public boolean lastNameTxtboxIsEnabled(){
		WebElement btn = lastNameTxtbox;
		return btn.isEnabled();
		}	
		
		
		//Validate: Age in years textbox Is Displayed
		public boolean ageInYrsTxtboxIsDisplayed(){
		WebElement link = ageInYrsTxtbox;
		return link.isDisplayed();
		}				
			
		
		//Validate: Age in years textbox Is Enabled
		public boolean ageInYrsTxtboxIsEnabled(){
		WebElement link = ageInYrsTxtbox;
		return link.isEnabled();
		}			
					
		
		//Validate: Age in month textbox Is Displayed
		public boolean ageInMonthTxtboxIsDisplayed(){
		WebElement link = ageInMonthTxtbox;
		return link.isDisplayed();
		}					
					
				
		//Validate: Age in month textbox Is Enabled
		public boolean ageInMonthTxtboxIsEnabled(){
		WebElement link = ageInMonthTxtbox;
		return link.isEnabled();
		}						
		
		
		//Validate: Age in days textbox Is Displayed
		public boolean ageInDaysTxtboxIsDisplayed(){
		WebElement link = ageInDaysTxtbox;
		return link.isDisplayed();
		}							
							
		//Validate: Age in days textbox Is Enabled
		public boolean ageInDaysTxtboxIsEnabled(){
		WebElement link = ageInDaysTxtbox;
		return link.isEnabled();
		}						
							
				
		
		//Validate: Mobile number textbox Is Displayed
		public boolean mobileNoTxtboxIsDisplayed(){
		WebElement link = mobileNoTxtbox;
		return link.isDisplayed();
		}								
									
		//Validate: Mobile number textbox Is Enabled
		public boolean mobileNoTxtboxIsEnabled(){
		WebElement link = mobileNoTxtbox;
		return link.isEnabled();
		}			
		
		
		//Validate: MLC Dropdown Is Displayed
		public boolean mlcDrpdwnIsDisplayed(){
		WebElement link = mlcDrpdwn;
		return link.isDisplayed();
		}								
				
		
		//Validate: MLC Dropdown Is Enabled
		public boolean mlcDrpdwnIsEnabled(){
		WebElement link = mlcDrpdwn;
		return link.isEnabled();
		}		
		
		//Validate: MLC Dropdown is Multiple
		public boolean mlcDrpdwnIsMultiple() throws InterruptedException{
		Select ListBox = new Select(mlcDrpdwn);
		boolean value = ListBox.isMultiple() ;
		return value;
		}
		
				
		//Validate: Address line 1 textbox Is Displayed
		public boolean addressLine1TxtboxIsDisplayed(){
		WebElement link = addressLine1;
		return link.isDisplayed();
		}			
		
		
		//Validate: Address line 1 textbox Is Enabled
		public boolean addressLine1TxtboxIsEnabled(){
		WebElement link = addressLine1;
		return link.isEnabled();
		}	
		
		
		//Validate: Address line 2 textbox Is Displayed
		public boolean addressLine2TxtboxIsDisplayed(){
		WebElement link = addressLine2;
		return link.isDisplayed();
		}					
				
		//Validate: Address line 1 textbox Is Enabled
		public boolean addressLine2TxtboxIsEnabled(){
		WebElement link = addressLine2;
		return link.isEnabled();
		}	
		
		
		//Validate: Father's Name textbox Is Displayed
		public boolean fathersNameTxtboxIsDisplayed(){
		WebElement link = fathersName;
		return link.isDisplayed();
		}					
				
		//Validate: Father's Name textbox Is Enabled
		public boolean fathersNameTxtboxIsEnabled(){
		WebElement link = fathersName;
		return link.isEnabled();
		}	
		

		//Validate: enter Valid UHID in order to get Update Patient Details Btn on UI
		public void enterUhidToReflectUpdatePatDetailsBtn(String uhid) throws InterruptedException{
		registrationNumberTxtbox.sendKeys(uhid); 
		Thread.sleep(2000);
		searchPatientBtn.click();
		Thread.sleep(2000);
		}
		
		//Validate: Update Patient Details Button Is Displayed
		public boolean updatePatientDetailsBtnIsDisplayed() throws InterruptedException{
		WebElement link = updatePatientDetailsBtn;
		return link.isDisplayed();
		}			

		//Validate: Update Patient Details Button is Enabled
		public boolean updatePatientDetailsBtnIsEnabled(){
		WebElement btn = updatePatientDetailsBtn;
		return btn.isEnabled();
		}		
					
					
		//Validate: Update Patient Details Button is Clickable
		public void updatePatientDetailsBtnIsClickable() throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("javascript:window.scrollBy(0,500)");
					
		updatePatientDetailsBtn.click();
		Thread.sleep(2000);
		}
		
		
		//Validate: clear all mandatory fields & hit update patient details button
		public void clearAllMandatoryFieldsThenClickUpdatePatientDetailsBtn() throws InterruptedException{
			firstNameTxtbox.clear();
			Thread.sleep(2000);	
			middleNameTxtbox.clear();
			Thread.sleep(2000);
			lastNameTxtbox.clear();
			Thread.sleep(2000);
			ageInYrsTxtbox.clear();
			Thread.sleep(2000);
			ageInMonthTxtbox.clear();
			Thread.sleep(2000);
			ageInDaysTxtbox.clear();
			Thread.sleep(2000);
			mobileNoTxtbox.clear();
			Thread.sleep(2000);
			addressLine1.clear();
			Thread.sleep(2000);
			addressLine2.clear();
			Thread.sleep(2000);
			fathersName.clear();
			Thread.sleep(2000);
	//		updatePatientDetailsBtn.click();
	//		Thread.sleep(2000);
			}
				
		
		public void enterInvalidFstMiddleLastName() throws InterruptedException{
		firstNameTxtbox.sendKeys("@@%%");
		Thread.sleep(2000);	
		middleNameTxtbox.sendKeys("@@%%");
		Thread.sleep(2000);	
		lastNameTxtbox.sendKeys("@@%%");
		Thread.sleep(2000);	
		updatePatientDetailsBtn.click();
		Thread.sleep(2000);
		}
		
		public void enterValidFirstName(String fstName) throws InterruptedException{
		firstNameTxtbox.clear();
		Thread.sleep(2000);	
		firstNameTxtbox.sendKeys(fstName);
		Thread.sleep(2000);	
		updatePatientDetailsBtn.click();
		Thread.sleep(2000);
		}
		
		public void enterValidMiddleName(String middlName) throws InterruptedException{
		middleNameTxtbox.clear();
		Thread.sleep(2000);	
		middleNameTxtbox.sendKeys(middlName);
		Thread.sleep(2000);	
		updatePatientDetailsBtn.click();
		Thread.sleep(2000);
		}		
			
		public void enterValidLastName(String lastName) throws InterruptedException{		
		lastNameTxtbox.clear();
		Thread.sleep(2000);	
		lastNameTxtbox.sendKeys(lastName);
		Thread.sleep(2000);	
		updatePatientDetailsBtn.click();
		Thread.sleep(2000);
		}		
		
		
		public void enterAgeInYrsOnly(String age) throws InterruptedException{		
		ageInYrsTxtbox.sendKeys(age);
		Thread.sleep(2000);
		updatePatientDetailsBtn.click();
		Thread.sleep(2000);
		}		
		
		public void enterAgeInMonths(String age) throws InterruptedException{		
		ageInMonthTxtbox.sendKeys(age);			
		Thread.sleep(2000);		
		updatePatientDetailsBtn.click();
		Thread.sleep(2000);
		}	
			
		
		public void enterAgeInDays(String age) throws InterruptedException{		
		ageInDaysTxtbox.sendKeys(age);	
		Thread.sleep(2000);
		updatePatientDetailsBtn.click();
		Thread.sleep(2000);
		}		
		
			
		public void enterInvalidAddLine1() throws InterruptedException{		
		addressLine1.sendKeys("@@$$");			
		Thread.sleep(2000);		
		updatePatientDetailsBtn.click();
		Thread.sleep(2000);
		}	
				
		
		public void enterValidAddLine1AndInvalidAddLine2(String address1) throws InterruptedException{		
		addressLine1.clear();
		Thread.sleep(2000);	
		addressLine1.sendKeys(address1);			
		Thread.sleep(2000);		
		addressLine2.sendKeys("@@$$");			
		Thread.sleep(2000);		
		updatePatientDetailsBtn.click();
		Thread.sleep(2000);
		}
		
		public void enterValidAddLine1AndAddLine2(String address2) throws InterruptedException{		
		addressLine2.clear();
		Thread.sleep(2000);	
		addressLine2.sendKeys(address2);			
		Thread.sleep(2000);		
		updatePatientDetailsBtn.click();
		}
		
		public void enterFatherNameAndMobile(String fathrName, String mobile) throws InterruptedException{		
		fathersName.sendKeys(fathrName);			
		Thread.sleep(2000);	
		mobileNoTxtbox.sendKeys(mobile);			
		Thread.sleep(2000);
		updatePatientDetailsBtn.click();
		}
		
	/*	public void enterMobileNmbr(String mobile) throws InterruptedException{		
		mobileNoTxtbox.sendKeys(mobile);			
		Thread.sleep(2000);		
		updatePatientDetailsBtn.click();
		}
			*/
		
		//Validate: Update patient details in one go
public void updatePatDetailsInOneGo(String fstName, String middlName, String lastName, String ageY,String ageM,String ageD, String mobile, String address1, String address2, String fathrName) throws InterruptedException{
	
			firstNameTxtbox.sendKeys(fstName);
			Thread.sleep(2000);	
			middleNameTxtbox.sendKeys(middlName);
			Thread.sleep(2000);
			lastNameTxtbox.sendKeys(lastName);
			Thread.sleep(2000);
			ageInYrsTxtbox.sendKeys(ageY);
			Thread.sleep(2000);
			ageInMonthTxtbox.sendKeys(ageM);
			Thread.sleep(2000);
			ageInDaysTxtbox.sendKeys(ageD);
			Thread.sleep(2000);
			addressLine1.sendKeys(address1);
			Thread.sleep(2000);
			addressLine2.sendKeys(address2);
			Thread.sleep(2000);
			fathersName.sendKeys(fathrName);
			Thread.sleep(2000);
			mobileNoTxtbox.sendKeys(mobile);
			Thread.sleep(2000);
			updatePatientDetailsBtn.click();
			Thread.sleep(2000);
			}
		
		
		
		
		
		
		
		
		
		
		
		
		

}
