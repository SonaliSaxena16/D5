package ehospital.Billing_Module.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ehospital.Billing_Module.Locators.CreateSchemeLocators;
import in.nic.ehospial.generic.BaseClass;

public class CreateSchemeHelper extends BaseClass {
public WebDriver driver;
	
CreateSchemeLocators CreateScheme;
							
							
public CreateSchemeHelper(WebDriver driver) {
this.driver = driver;
CreateScheme = new CreateSchemeLocators(driver);
}

//Action
///////////////////////////CreateSchemelink////////////////////////////////////
public boolean ValidateCreateSchemelinkisDisplayed() {
WebElement CreateSchemelink = CreateScheme.getCreateSchemelink();
return CreateSchemelink.isDisplayed();
}

public boolean ValidateCreateSchemelinkisEnabled() {
WebElement CreateSchemelink = CreateScheme.getCreateSchemelink();
return CreateSchemelink.isEnabled();
}

public void ClickonCreateSchemelink() {
	CreateScheme.getCreateSchemelink().click();
}

///////////////////////////////////Savebutton/////////////////////////////
public boolean ValidateSavebuttonisEnabled() {
WebElement Savebutton = CreateScheme.getSavebutton();
return Savebutton.isEnabled();
}

public void ClickonSavebutton() {
	CreateScheme.getSavebutton().click();
}

///////////////////////////CreditSchemeNameTextBox/////////////////////////////
public boolean ValidateCreditSchemeNameTextBoxisEnabled() {
WebElement CreditSchemeName = CreateScheme.getCreditSchemeNameTextBox();
return CreditSchemeName.isEnabled();
}

public void EnterInavalidNameintotheCreditSchemeNameTextBox(String InvalidName) {
	delay();
	CreateScheme.getCreditSchemeNameTextBox().clear();
	delay();
	CreateScheme.getCreditSchemeNameTextBox().sendKeys(InvalidName);
	delay();
	CreateScheme.getStateRadiobutton().click();
}

public void EnterInValidNameintotheCreditSchemeNameTextBox(String ValidName) {
	delay();
	CreateScheme.getCreditSchemeNameTextBox().clear();
	delay();
	CreateScheme.getCreditSchemeNameTextBox().sendKeys(ValidName);
}


////////////////StateRadiobutton////////////////////////////////////////////////
public boolean ValidateStateRadiobuttonisEnabled() {
WebElement StateRadiobutton = CreateScheme.getStateRadiobutton();
return StateRadiobutton.isEnabled();
}

public boolean ValidateStateRadiobuttonisSelected() {
WebElement StateRadiobutton = CreateScheme.getStateRadiobutton();
return StateRadiobutton.isSelected();
}

public void ClickonStateRadiobutton() {
	CreateScheme.getStateRadiobutton().click();
}

///////////////////////////////CreditSchemeCodeTextBox////////////////////////////////
public boolean ValidateCreditSchemeCodeTextBoxisEnabled() {
WebElement CreditSchemeCode = CreateScheme.getCreditSchemeCodeTextBox();
return CreditSchemeCode.isEnabled();
}

public void EnterInavalidCodeintotheCreditSchemeCodeTextBox(String InvalidCode) {
	delay();
	CreateScheme.getCreditSchemeCodeTextBox().clear();
	delay();
	CreateScheme.getCreditSchemeCodeTextBox().sendKeys(InvalidCode);
	delay();
	CreateScheme.getStateRadiobutton().click();
}

public void EnterValidCodeintotheCreditSchemeCodeTextBox(String ValidCode) {
	delay();
	CreateScheme.getCreditSchemeCodeTextBox().clear();
	delay();
	CreateScheme.getCreditSchemeCodeTextBox().sendKeys(ValidCode);
}

/////////////////////////////////CreditAmountLimitTextBox//////////////////////////////////
public boolean ValidateCreditAmountLimitTextBoxisEnabled() {
WebElement CreditAmountLimit = CreateScheme.getCreditAmountLimitTextBox();
return CreditAmountLimit.isEnabled();
}

public void EnterInavalidAmountintotheCreditAmountLimitTextBox(String InvalidAmount) {
	delay();
	CreateScheme.getCreditAmountLimitTextBox().clear();
	delay();
	CreateScheme.getCreditAmountLimitTextBox().sendKeys(InvalidAmount);
	delay();
	CreateScheme.getStateRadiobutton().click();
}

public void EnterValidAmountintotheCreditAmountLimitTextBox(String ValidAmount) {
	delay();
	CreateScheme.getCreditAmountLimitTextBox().clear();
	delay();
	CreateScheme.getCreditAmountLimitTextBox().sendKeys(ValidAmount);
}

////////////////////////////CreditOrganizedBodyTextBox/////////////////////////////
public boolean ValidateCreditOrganizedBodyTextBoxisEnabled() {
WebElement CreditOrganizedBody = CreateScheme.getCreditOrganizedBodyTextBox();
return CreditOrganizedBody.isEnabled();
}

public void EnterInvalidNameintotheCreditOrganizedBodyTextBox(String InvalidName) {
	delay();
	CreateScheme.getCreditOrganizedBodyTextBox().clear();
	delay();
	CreateScheme.getCreditOrganizedBodyTextBox().sendKeys(InvalidName);
	delay();
	CreateScheme.getStateRadiobutton().click();
}

public void EnterValidNameintotheCreditOrganizedBodyTextBox(String ValidName) {
	delay();
	CreateScheme.getCreditOrganizedBodyTextBox().clear();
	delay();
	CreateScheme.getCreditOrganizedBodyTextBox().sendKeys(ValidName);
}

//////////////////////////MainOfficeAddressTextBox//////////////////////////////////////////////
public boolean ValidateMainOfficeAddressTextBoxisEnabled() {
WebElement MainOfficeAddress = CreateScheme.getMainOfficeAddressTextBox();
return MainOfficeAddress.isEnabled();
}

public void EnterInvalidNameintotheMainOfficeAddressTextBox(String InvalidName) {
	delay();
	CreateScheme.getMainOfficeAddressTextBox().clear();
	delay();
	CreateScheme.getMainOfficeAddressTextBox().sendKeys(InvalidName);
	delay();
	CreateScheme.getStateRadiobutton().click();
}

public void EnterValidNameintotheMainOfficeAddressTextBox(String ValidName) {
	delay();
	CreateScheme.getMainOfficeAddressTextBox().clear();
	delay();
	CreateScheme.getMainOfficeAddressTextBox().sendKeys(ValidName);
}

//////////////////////////////////MainOfficePINTextBox/////////////////////////////////////
public boolean ValidateMainOfficePINTextBoxisEnabled() {
WebElement MainOfficePIN = CreateScheme.getMainOfficePINTextBox();
return MainOfficePIN.isEnabled();
}

public void EnterInvalidPINintotheMainOfficePINTextBox(String InvalidPIN) {
	delay();
	CreateScheme.getMainOfficePINTextBox().clear();
	delay();
	CreateScheme.getMainOfficePINTextBox().sendKeys(InvalidPIN);
	delay();
	CreateScheme.getStateRadiobutton().click();
}

public void EnterValidPINintotheMainOfficePINTextBox(String ValidPIN) {
	delay();
	CreateScheme.getMainOfficePINTextBox().clear();
	delay();
	CreateScheme.getMainOfficePINTextBox().sendKeys(ValidPIN);
}

//////////////////////////////////MainOfficeLandLineTextBox///////////////////////////////////
public boolean ValidateMainOfficeLandLineTextBoxisEnabled() {
WebElement MainOfficeLandLine = CreateScheme.getMainOfficeLandLineTextBox();
return MainOfficeLandLine.isEnabled();
}

public void EnterInvalidTextintotheMainOfficeLandLineTextBox(String InvalidText) {
	delay();
	CreateScheme.getMainOfficeLandLineTextBox().clear();
	delay();
	CreateScheme.getMainOfficeLandLineTextBox().sendKeys(InvalidText);
	delay();
	CreateScheme.getStateRadiobutton().click();
}

public void EnterValidTextintotheMainOfficeLandLineTextBox(String ValidText) {
	delay();
	CreateScheme.getMainOfficeLandLineTextBox().clear();
	delay();
	CreateScheme.getMainOfficeLandLineTextBox().sendKeys(ValidText);
}

///////////////////////////////////////CompanyWebsiteURLTextBox/////////////////////////////////
public boolean ValidateCompanyWebsiteURLTextBoxisEnabled() {
WebElement MainOfficeLandLine = CreateScheme.getCompanyWebsiteURLTextBox();
return MainOfficeLandLine.isEnabled();
}

public void EnterInvalidURLintotheCompanyWebsiteURLTextBox(String InvalidURL) {
	delay();
	CreateScheme.getCompanyWebsiteURLTextBox().clear();
	delay();
	CreateScheme.getCompanyWebsiteURLTextBox().sendKeys(InvalidURL);
	delay();
	CreateScheme.getStateRadiobutton().click();
}

public void EnterValidURLintotheCompanyWebsiteURLTextBox(String ValidURL) {
	delay();
	CreateScheme.getCompanyWebsiteURLTextBox().clear();
	delay();
	CreateScheme.getCompanyWebsiteURLTextBox().sendKeys(ValidURL);
}

///////////////////////////////////////////ContactPersonNameTextBox////////////////////////////////////////
public boolean ValidateContactPersonNameTextBoxisEnabled() {
WebElement ContactPersonName = CreateScheme.getContactPersonNameTextBox();
return ContactPersonName.isEnabled();
}

public void EnterInvalidNameintotheContactPersonNameTextBox(String InvalidName) {
	delay();
	CreateScheme.getContactPersonNameTextBox().clear();
	delay();
	CreateScheme.getContactPersonNameTextBox().sendKeys(InvalidName);
	delay();
	CreateScheme.getStateRadiobutton().click();
}

public void EnterValidNameintotheContactPersonNameTextBox(String ValidName) {
	delay();
	CreateScheme.getContactPersonNameTextBox().clear();
	delay();
	CreateScheme.getContactPersonNameTextBox().sendKeys(ValidName);
}

/////////////////////////////SavedSuccessfullyMessage//////////////////
public String getSavedSuccessfullyMessage() {
	delay();
	String Message = CreateScheme.getSavedSuccessfullyMessage().getText();
	return Message;
}

//////////////////////////////Selectbutton/////////////////////////////
public boolean ValidateSelectbuttonisEnabled() {
WebElement Selectbutton = CreateScheme.getSelectbutton();
return Selectbutton.isEnabled();
}

public void ClickonSelectbutton() {
	CreateScheme.getSelectbutton().click();
}

///////////////////////////UpdateSCHEMEbutton////////////////////////////////////
public boolean ValidateUpdateSCHEMEbuttonisEnabled() {
WebElement UpdateSCHEME = CreateScheme.getUpdateSCHEMEbutton();
return UpdateSCHEME.isEnabled();
}

public void ClickonUpdateSCHEMEbutton(String ValidPIN) {
	delay();
	CreateScheme.getMainOfficePINTextBox().clear();
	delay();
	CreateScheme.getMainOfficePINTextBox().sendKeys(ValidPIN);
	delay();
	CreateScheme.getUpdateSCHEMEbutton().click();
}

/////////////////////////////ADDNEWSCHEMEbutton///////////////////////////
public boolean ValidateADDNEWSCHEMEbuttonbuttonisEnabled() {
WebElement ADDNEWSCHEME = CreateScheme.getADDNEWSCHEMEbutton();
return ADDNEWSCHEME.isEnabled();
}

public void ClickonADDNEWSCHEMEbutton() {
	delay();
	CreateScheme.getSelectbutton().click();
	delay();
	CreateScheme.getADDNEWSCHEMEbutton().click();
}






}
