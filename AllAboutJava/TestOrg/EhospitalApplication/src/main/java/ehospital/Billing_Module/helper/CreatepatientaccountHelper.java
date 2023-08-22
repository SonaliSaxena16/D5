package ehospital.Billing_Module.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ehospital.Billing_Module.Locators.CreatepatientaccountLocators;
import in.nic.ehospial.generic.BaseClass;

public class CreatepatientaccountHelper extends BaseClass{
public WebDriver driver;
	
CreatepatientaccountLocators Createpatientaccount;
							
							
public CreatepatientaccountHelper(WebDriver driver) {
this.driver = driver;
Createpatientaccount = new CreatepatientaccountLocators(driver);
}

//Action
////////////////////////////////CreatepatientaccountLink/////////////////////////////////
public boolean ValidateCreatepatientaccountLinkisDisplayed() {
WebElement Createpatientaccountlink = Createpatientaccount.getCreatepatientaccountLink();
return Createpatientaccountlink.isDisplayed();
}

public boolean ValidateCreatepatientaccountLinkisEnabled() {
WebElement Createpatientaccountlink = Createpatientaccount.getCreatepatientaccountLink();
return Createpatientaccountlink.isEnabled();
}

public void ClickonCreatepatientaccountLink() {
	Createpatientaccount.getCreatepatientaccountLink().click();
}

//////////////////////////IDDropdown///////////////////////////////////////////
public boolean ValidateIDDropdownisEnabled() {
WebElement IDDropdown = Createpatientaccount.getIDDropdown();
return IDDropdown.isEnabled();
}

public boolean ValidateIDDropdownisMultiple() {
WebElement IDDropdown = Createpatientaccount.getIDDropdown();
return ISDropdownisMultiple(IDDropdown);
}

public void SelectValuefromIDDropdown() {
	delay();
	selectDropdownVisibleElement(Createpatientaccount.getIDDropdown(),"UHID");
}

/////////////////////////////////Searchbutton////////////////////////////////////////
public boolean ValidateSearchbuttonisEnabled() {
WebElement Searchbutton = Createpatientaccount.getSearchbutton();
return Searchbutton.isEnabled();
}

public void ClickonSearchbutton() {
	Createpatientaccount.getSearchbutton().click();
}

///////////////////////////////////IDTextbox/////////////////////////////////////////////////
public boolean ValidateIDTextboxisEnabled() {
WebElement IDTextbox = Createpatientaccount.getIDTextbox();
return IDTextbox.isEnabled();
}

public void EnterInvalidIDintotheTextBox(String InvalidID ) {
	Createpatientaccount.getIDTextbox().clear();
	delay();
	Createpatientaccount.getIDTextbox().sendKeys(InvalidID);
	delay();
	Createpatientaccount.getSearchbutton().click();
	
}

public void EnterValidIDintotheTextBox(String ValidID ) {
	Createpatientaccount.getIDTextbox().clear();
	delay();
	Createpatientaccount.getIDTextbox().sendKeys(ValidID);
	delay();
	Createpatientaccount.getSearchbutton().click();
	
}

//////////////////////////////BillingCategoryDetails///////////////////////////////
public boolean ValidateBillingCategoryDetailsisDisplayed() {
WebElement BillingCategoryDetails = Createpatientaccount.getBillingCategoryDetails();
return BillingCategoryDetails.isDisplayed();
}

//////////////////////////////////PatientTypeDropdown/////////////////////////////////
public boolean ValidatePatientTypeDropdownisEnabled() {
WebElement PatientType = Createpatientaccount.getPatientTypeDropdown();
return PatientType.isEnabled();
}

////////////////////////////////BillingTypeDropdown//////////////////////////////////
public boolean ValidateBillingTypeDropdownisEnabled() {
WebElement BillingType = Createpatientaccount.getBillingTypeDropdown();
return BillingType.isEnabled();
}

////////////////////////SaveButton/////////////////////////////////////////////////////
public boolean ValidateSaveButtonisEnabled() {
WebElement SaveButton = Createpatientaccount.getSaveButton();
return SaveButton.isEnabled();
}

public void ClickonSaveButton() {
	Createpatientaccount.getSaveButton().click();
}

/////////////////////////////SchemeNamedropdown////////////////////////////////
public boolean ValidateSchemeNamedropdownisEnabled() {
WebElement SchemeName = Createpatientaccount.getSchemeNamedropdown();
return SchemeName.isEnabled();
}

public boolean ValidateSchemeNamedropdownisMultiple() {
WebElement SchemeName = Createpatientaccount.getSchemeNamedropdown();
return ISDropdownisMultiple(SchemeName);
}

public void SelectValuefromSchemeNameDropdown() {
	delay();
	selectDropdownVisibleElement(Createpatientaccount.getSchemeNamedropdown(),"Automation Ayush");
}

//////////////////////////////////AmountLimitTextBox//////////////////////////////////////////
public boolean ValidateAmountLimitTextBoxisEnabled() {
WebElement AmountTextbox = Createpatientaccount.getAmountLimitTextBox();
return AmountTextbox.isEnabled();
}

public void ChangetheAmountintoAmountLimitTextBox(String Amount ) {
	Createpatientaccount.getAmountLimitTextBox().clear();
	delay();
	Createpatientaccount.getAmountLimitTextBox().sendKeys(Amount);
	delay();
		
}

public void SelectValueFromSchemeNameDropdown(String Amount ) {
	selectDropdownVisibleElementwithIndexValue(Createpatientaccount.getSchemeNamedropdown(),1);
	delay();
	selectDropdownVisibleElement(Createpatientaccount.getSchemeNamedropdown(),"Automation Ayush");
	delay();
	Createpatientaccount.getSaveButton().click();

}

///////////////////////////////////////////////AccounttNumberTextBox////////////////////////////////////////////////
public boolean ValidateAccountNumberTextBoxisEnabled() {
WebElement AccountTextbox = Createpatientaccount.getAccounttNumberTextBox();
return AccountTextbox.isEnabled();
}

public void EnterAccountNumberintotheAccounttNumberTextBox(String AccountNumber ) {
	Createpatientaccount.getAccounttNumberTextBox().clear();
	delay();
	Createpatientaccount.getAccounttNumberTextBox().sendKeys(AccountNumber);
	delay();
	Createpatientaccount.getSaveButton().click();
}

///////////////////////////////ValiduptoTextbox//////////////////////////////////////////////////////////////
public void SelectDateFromCalender() {
	Createpatientaccount.getValiduptoTextbox().click();
	delay();
	selectDropdownVisibleElement(Createpatientaccount.getMonthDropdown(),"December");
delay();
selectDropdownVisibleElement(Createpatientaccount.getYearDropdown(),"2022");
delay();
Createpatientaccount.getSelectDate().click();
}


////////////////////////////////////////AccountDetailsTextBox////////////////////////////////////
public boolean ValidateAccountDetailsTextBoxisEnabled() {
WebElement AccountDetails = Createpatientaccount.getAccountDetailsTextBox();
return AccountDetails.isEnabled();
}

public void EnterAccountDetailintoAccountDetailsTextBox(String AccountDetail) {
	delay();
Createpatientaccount.getAccountDetailsTextBox().clear();
delay();
Createpatientaccount.getAccountDetailsTextBox().sendKeys(AccountDetail);
delay();
Createpatientaccount.getSaveButton().click();

}

///////////////////////////////////////////////////////////////////////////////////////////////
public void GeneratePatientSchemeAccountinonego(String AccountNumber) {
delay();	
selectDropdownVisibleElementwithIndexValue(Createpatientaccount.getSchemeNamedropdown(),0);
	delay();
selectDropdownVisibleElement(Createpatientaccount.getSchemeNamedropdown(),"Automation Ayush");
delay();
Createpatientaccount.getAccounttNumberTextBox().clear();
delay();
Createpatientaccount.getAccounttNumberTextBox().sendKeys(AccountNumber);
delay();
Createpatientaccount.getSaveButton().click();
}

////////////////////////////////////////Blockimgbutton//////////////////////////////////////////
public boolean ValidateBlockimgbuttonisDisplayed() {
WebElement Blockimgbutton = Createpatientaccount.getBlockimgbutton();
return Blockimgbutton.isDisplayed();
}

public void ClickonBlockimgbutton() {
	Createpatientaccount.getBlockimgbutton().click();
}

////////////////////////////////////////Unblocklink///////////////////////////////
public boolean ValidateUnblocklinkisEnabled() {
WebElement Unblocklink = Createpatientaccount.getUnblocklink();
return Unblocklink.isEnabled();
}

public void ClickonUnblocklink() {
	Createpatientaccount.getUnblocklink().click();
}

///////////////////////////////////////////////////deletebutton//////////////////////////////////
public boolean ValidatedeletebuttonisEnabled() {
WebElement Deletebutton = Createpatientaccount.getDeletebutton();
return Deletebutton.isEnabled();
}

public void Clickondeletebutton() {
	Createpatientaccount.getDeletebutton().click();
}

/////////////////////////Trying to create Patient Account with Duplicate Account Number//////////////////////
public void TryingtocreatePatientAccountwithDuplicateAccountNumber(String AccountNumber) {
	delay();
selectDropdownVisibleElementwithIndexValue(Createpatientaccount.getSchemeNamedropdown(),0);
	delay();
selectDropdownVisibleElement(Createpatientaccount.getSchemeNamedropdown(),"Automation Ayush");
delay();
Createpatientaccount.getAccounttNumberTextBox().clear();
delay();
Createpatientaccount.getAccounttNumberTextBox().sendKeys(AccountNumber);
delay();
Createpatientaccount.getSaveButton().click();
}	

////////////////////////////Trying to create Patient Account for TransGenderPatirnt/////////////////
public void TryingtocreatePatientAccountforTransGenderPatirnt(String ValidID,String AccountNumber,String AccountDetail) {
delay();
Createpatientaccount.getIDTextbox().clear();
delay();
Createpatientaccount.getIDTextbox().sendKeys(ValidID);
delay();
Createpatientaccount.getSearchbutton().click();
delay();
selectDropdownVisibleElementwithIndexValue(Createpatientaccount.getSchemeNamedropdown(),0);
delay();
selectDropdownVisibleElement(Createpatientaccount.getSchemeNamedropdown(),"Automation Ayush");
delay();
Createpatientaccount.getAccounttNumberTextBox().clear();
delay();
Createpatientaccount.getAccounttNumberTextBox().sendKeys(AccountNumber);
delay();
Createpatientaccount.getValiduptoTextbox().click();
delay();
selectDropdownVisibleElement(Createpatientaccount.getMonthDropdown(),"December");
delay();
selectDropdownVisibleElement(Createpatientaccount.getYearDropdown(),"2022");
delay();
Createpatientaccount.getSelectDate().click();
delay();
delay();
Createpatientaccount.getAccountDetailsTextBox().clear();
delay();
Createpatientaccount.getAccountDetailsTextBox().sendKeys(AccountDetail);
delay();
Createpatientaccount.getSaveButton().click();
}





}
