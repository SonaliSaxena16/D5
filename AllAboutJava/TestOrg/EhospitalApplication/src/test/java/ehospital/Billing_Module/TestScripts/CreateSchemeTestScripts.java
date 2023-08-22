package ehospital.Billing_Module.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.BillSettlementHelper;
import ehospital.Billing_Module.helper.CreateSchemeHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import in.nic.ehospial.generic.BaseClass;

public class CreateSchemeTestScripts extends BaseClass {
	CreateSchemeHelper csh;
	CreateSchemeTestScripts cst;
	PreparationOfReceiptsHelper porh;
	
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void CreateSchemelinkisDispalyed() {
csh = new CreateSchemeHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
cst = new CreateSchemeTestScripts();
delay();

cst.switchtoLeftFrame();
boolean CreateSchemelink = csh.ValidateCreateSchemelinkisDisplayed();
softAssert.assertTrue(CreateSchemelink, "Create Scheme link is Not Displayed");
if(CreateSchemelink == true) {
	System.out.println("Create Scheme link is Displayed");
}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void CreateSchemelinkisEnabledandClickable() {
boolean CreateSchemelink = csh.ValidateCreateSchemelinkisEnabled();
softAssert.assertTrue(CreateSchemelink, "Create Scheme link is Not Enabled");
if(CreateSchemelink == true) {
	System.out.println("Create Scheme link is Enabled");
	delay();
	csh.ClickonCreateSchemelink();
	delay();
	cst.switchtoinnerRightFrame();
}	
}

@Test(priority = 3,groups = {"Functional"})
public void SavebuttonisEnabledandClickable() {
boolean Savebutton = csh.ValidateSavebuttonisEnabled();
softAssert.assertTrue(Savebutton, "Save button is not Enabled");
if(Savebutton == true) {
	System.out.println("Save button is Enabled");
delay();
csh.ClickonSavebutton();
delay();
softAssert.assertEquals(GetAlertText(), "Please Enter Credit Scheme Name", "Popup Message Not matched");
delay();
HandleAlert();
}
}

@Test(priority = 4,groups = {"Functional"})
public void CreditSchemeNameTextBoxisEnabledandEnterInvalidName() {
boolean CreditSchemeName = csh.ValidateCreditSchemeNameTextBoxisEnabled();
softAssert.assertTrue(CreditSchemeName, "Credit Scheme Name Text Box is not Enabled");
if(CreditSchemeName == true) {
   System.out.println("Credit Scheme Name Text Box is Enabled");
	delay();
	csh.EnterInavalidNameintotheCreditSchemeNameTextBox("%^&*()_545");
	delay();
	softAssert.assertEquals(GetAlertText(), "Please Enter Valid Credit Scheme Name", "Alert Message is Not Coming");
	delay();
	HandleAlert();
}
}

@Test(priority = 5,groups = {"Functional","Smoke"})
public void CreditSchemeNameTextBoxisEnabledandEnterValidName() {
boolean CreditSchemeName = csh.ValidateCreditSchemeNameTextBoxisEnabled();
softAssert.assertTrue(CreditSchemeName, "Credit Scheme Name Text Box is not Enabled");
if(CreditSchemeName == true) {
   System.out.println("Credit Scheme Name Text Box is Enabled");
	delay();
	csh.EnterInValidNameintotheCreditSchemeNameTextBox("Automation Ayush");
	delay();
	HandleAlert();
}
}

@Test(priority = 6,groups = {"Functional","Smoke"})
public void StateRadiobuttonisEnabledandSelectable() {
boolean StateRadiobutton = csh.ValidateStateRadiobuttonisEnabled();
softAssert.assertTrue(StateRadiobutton, "State Radio button is not Enabled");
	if(StateRadiobutton == true) {
	 System.out.println("State Radio button is Enabled");
	delay();
	csh.ClickonStateRadiobutton();
}
}

@Test(priority = 7,groups = {"Functional"})
public void StateRadiobuttonisSelected() {
boolean StateRadiobutton = csh.ValidateStateRadiobuttonisSelected();
softAssert.assertTrue(StateRadiobutton, "State Radio button is not Selected");
	if(StateRadiobutton == true) {
	 System.out.println("State Radio button is Selected");
}
}

@Test(priority = 8,groups = {"Functional"})
public void CreditSchemeCodeTextBoxisEnabledandEnterInvalidCode() {
boolean CreditSchemeName = csh.ValidateCreditSchemeCodeTextBoxisEnabled();
softAssert.assertTrue(CreditSchemeName, "Credit Scheme Name Text Box is not Enabled");
if(CreditSchemeName == true) {
   System.out.println("Credit Scheme Name Text Box is Enabled");
	delay();
	csh.EnterInavalidCodeintotheCreditSchemeCodeTextBox("%^&*()_545");
	delay();
	softAssert.assertEquals(GetAlertText(), "Please Enter Valid Credit Scheme Code", "Alert Message is Not Coming");
	delay();
	HandleAlert();
}
}

@Test(priority = 9,groups = {"Functional","Smoke"})
public void CreditSchemeCodeTextBoxisEnabledandEnterValidCode() {
boolean CreditSchemeName = csh.ValidateCreditSchemeCodeTextBoxisEnabled();
softAssert.assertTrue(CreditSchemeName, "Credit Scheme Name Text Box is not Enabled");
if(CreditSchemeName == true) {
   System.out.println("Credit Scheme Name Text Box is Enabled");
	delay();
	csh.EnterValidCodeintotheCreditSchemeCodeTextBox("ABC007");
	delay();
	HandleAlert();
}
}

@Test(priority = 10,groups = {"Functional"})
public void CreditAmountLimitTextBoxisEnabledandEnterInvalidAmount() {
boolean CreditAmountLimit = csh.ValidateCreditAmountLimitTextBoxisEnabled();
softAssert.assertTrue(CreditAmountLimit, "Credit Amount Limit Text Box is not Enabled");
if(CreditAmountLimit == true) {
   System.out.println("Credit Amount Limit Text Box is Enabled");
	delay();
	csh.EnterInavalidAmountintotheCreditAmountLimitTextBox("%^&*()_545");
	delay();
	softAssert.assertEquals(GetAlertText(), "Please Enter Valid Credit Amount Limit", "Alert Message is Not Coming");
	delay();
	HandleAlert();
}
}

@Test(priority = 11,groups = {"Functional","Smoke"})
public void CreditAmountLimitTextBoxisEnabledandEnterValidAmount() {
boolean CreditAmountLimit = csh.ValidateCreditAmountLimitTextBoxisEnabled();
softAssert.assertTrue(CreditAmountLimit, "Credit Amount Limit Text Box is not Enabled");
if(CreditAmountLimit == true) {
   System.out.println("Credit Amount Limit Text Box is Enabled");
	delay();
	csh.EnterValidAmountintotheCreditAmountLimitTextBox("50000");
	delay();
	HandleAlert();
}
}

@Test(priority = 12,groups = {"Functional"})
public void CreditOrganizedBodyTextBoxisEnabledandEnterInvalidName() {
boolean CreditOrganizedBody = csh.ValidateCreditOrganizedBodyTextBoxisEnabled();
softAssert.assertTrue(CreditOrganizedBody, "Credit Organized Body Text Box is not Enabled");
if(CreditOrganizedBody == true) {
   System.out.println("Credit Organized Body Text Box is Enabled");
	delay();
	csh.EnterInvalidNameintotheCreditOrganizedBodyTextBox("%^&*()_545");
	delay();
	softAssert.assertEquals(GetAlertText(), "Please Enter Valid Credit Organized Body Name", "Alert Message is Not Coming");
	delay();
	HandleAlert();
}
}

@Test(priority = 13,groups = {"Functional","Smoke"})
public void CreditOrganizedBodyTextBoxisEnabledandEnterValidName() {
boolean CreditOrganizedBody = csh.ValidateCreditOrganizedBodyTextBoxisEnabled();
softAssert.assertTrue(CreditOrganizedBody, "Credit Organized Body Text Box is not Enabled");
if(CreditOrganizedBody == true) {
   System.out.println("Credit Organized Body Text Box is Enabled");
	delay();
	csh.EnterValidNameintotheCreditOrganizedBodyTextBox("Automation Test");
	delay();
	HandleAlert();
}
}

@Test(priority = 14,groups = {"Functional"})
public void MainOfficeAddressTextBoxisEnabledandEnterInvalidName() {
boolean MainOfficeAddress = csh.ValidateMainOfficeAddressTextBoxisEnabled();
softAssert.assertTrue(MainOfficeAddress, "Main Office Address Text Box is not Enabled");
if(MainOfficeAddress == true) {
   System.out.println("Main Office Address Text Box is Enabled");
	delay();
	csh.EnterInvalidNameintotheMainOfficeAddressTextBox("%^&*()_545");
	delay();
	softAssert.assertEquals(GetAlertText(), "Please Enter Valid Main Office Address Name", "Alert Message is Not Coming");
	delay();
	HandleAlert();
}
}

@Test(priority = 15,groups = {"Functional","Smoke"})
public void MainOfficeAddressTextBoxisEnabledandEnterValidName() {
boolean MainOfficeAddress = csh.ValidateMainOfficeAddressTextBoxisEnabled();
softAssert.assertTrue(MainOfficeAddress, "Main Office Address Text Box is not Enabled");
if(MainOfficeAddress == true) {
   System.out.println("Main Office Address Text Box is Enabled");
	delay();
	csh.EnterValidNameintotheMainOfficeAddressTextBox("CGO Complex,Delhi");
	delay();
	HandleAlert();
}
}

@Test(priority = 16,groups = {"Functional"})
public void MainOfficePINTextBoxisEnabledandEnterInvalidPIN() {
boolean MainOfficePIN = csh.ValidateMainOfficePINTextBoxisEnabled();
softAssert.assertTrue(MainOfficePIN, "Main Office PIN Text Box is not Enabled");
if(MainOfficePIN == true) {
   System.out.println("Main Office PIN Text Box is Enabled");
	delay();
	csh.EnterInvalidPINintotheMainOfficePINTextBox("%^&*()_545");
	delay();
	softAssert.assertEquals(GetAlertText(), "Please Enter Valid Main Office PIN", "Alert Message is Not Coming");
	delay();
	HandleAlert();
}
}

@Test(priority = 17,groups = {"Functional","Smoke"})
public void MainOfficePINTextBoxisEnabledandEnterValidPIN() {
boolean MainOfficePIN = csh.ValidateMainOfficePINTextBoxisEnabled();
softAssert.assertTrue(MainOfficePIN, "Main Office PIN Text Box is not Enabled");
if(MainOfficePIN == true) {
   System.out.println("Main Office PIN Text Box is Enabled");
	delay();
	csh.EnterValidPINintotheMainOfficePINTextBox("110066");
	delay();
	HandleAlert();
}
}

@Test(priority = 18,groups = {"Functional"})
public void MainOfficeLandLineTextBoxisEnabledandEnterInvalidText() {
boolean MainOfficeLandLine = csh.ValidateMainOfficeLandLineTextBoxisEnabled();
softAssert.assertTrue(MainOfficeLandLine, "Main Office Land Line Text Box is not Enabled");
if(MainOfficeLandLine == true) {
   System.out.println("Main Office Land Line Text Box is Enabled");
	delay();
	csh.EnterInvalidTextintotheMainOfficeLandLineTextBox("%^&*()_545");
	delay();
	softAssert.assertEquals(GetAlertText(), "Please Enter Valid Main Office Land Line", "Alert Message is Not Coming");
	delay();
	HandleAlert();
}
}

@Test(priority = 19,groups = {"Functional","Smoke"})
public void MainOfficeLandLineTextBoxisEnabledandEnterValidText() {
boolean MainOfficeLandLine = csh.ValidateMainOfficeLandLineTextBoxisEnabled();
softAssert.assertTrue(MainOfficeLandLine, "Main Office Land Line Text Box is not Enabled");
if(MainOfficeLandLine == true) {
   System.out.println("Main Office Land Line Text Box is Enabled");
	delay();
	csh.EnterValidTextintotheMainOfficeLandLineTextBox("0112525252545656");
	delay();
	HandleAlert();
}
}

@Test(priority = 20,groups = {"Functional"})
public void CompanyWebsiteURLTextBoxisEnabledandEnterInvalidText() {
boolean CompanyWebsiteURL = csh.ValidateCompanyWebsiteURLTextBoxisEnabled();
softAssert.assertTrue(CompanyWebsiteURL, "Company Website URL Text Box is not Enabled");
if(CompanyWebsiteURL == true) {
   System.out.println("Company Website URL Text Box is Enabled");
	delay();
	csh.EnterInvalidURLintotheCompanyWebsiteURLTextBox("%^&*()_545");
	delay();
	softAssert.assertEquals(GetAlertText(), "Please Enter Valid Company Website URL", "Alert Message is Not Coming");
	delay();
	HandleAlert();
}
}

@Test(priority = 21,groups = {"Functional","Smoke"})
public void CompanyWebsiteURLTextBoxisEnabledandEnterValidText() {
boolean CompanyWebsiteURL = csh.ValidateCompanyWebsiteURLTextBoxisEnabled();
softAssert.assertTrue(CompanyWebsiteURL, "Company Website URL Text Box is not Enabled");
if(CompanyWebsiteURL == true) {
   System.out.println("Company Website URL Text Box is Enabled");
	delay();
	csh.EnterValidURLintotheCompanyWebsiteURLTextBox("https://ehospital.gov.in");
	delay();
	HandleAlert();
}
}

@Test(priority = 22,groups = {"Functional"})
public void ContactPersonNameTextBoxisEnabledandEnterInvalidText() {
boolean ContactPersonName = csh.ValidateContactPersonNameTextBoxisEnabled();
softAssert.assertTrue(ContactPersonName, "Contact Person Name Text Box is not Enabled");
if(ContactPersonName == true) {
   System.out.println("Contact Person Name Text Box is Enabled");
	delay();
	csh.EnterInvalidNameintotheContactPersonNameTextBox("%^&*()_545");
	delay();
	softAssert.assertEquals(GetAlertText(), "Please Enter Valid Contact Person Name", "Alert Message is Not Coming");
	delay();
	HandleAlert();
}
}

@Test(priority = 23,groups = {"Functional","Smoke"})
public void ContactPersonNameTextBoxisEnabledandEnterValidText() {
boolean ContactPersonName = csh.ValidateContactPersonNameTextBoxisEnabled();
softAssert.assertTrue(ContactPersonName, "Contact Person Name Text Box is not Enabled");
if(ContactPersonName == true) {
   System.out.println("Contact Person Name Text Box is Enabled");
	delay();
	csh.EnterValidNameintotheContactPersonNameTextBox("NIC User");
	delay();
	csh.ClickonSavebutton();
	delay();
Assert.assertEquals(csh.getSavedSuccessfullyMessage(), "Saved Successfully", "Assert Message Not Matched");
}
}

@Test(priority = 24,groups = {"Functional","Smoke"})
public void SelectbuttonisEnabledandClickable() {
boolean Selectbutton = csh.ValidateSelectbuttonisEnabled();
softAssert.assertTrue(Selectbutton, "Select button is not Enabled");
if(Selectbutton == true) {
	System.out.println("Select button is Enabled");
	delay();
	csh.ClickonSelectbutton();
}	
}

@Test(priority = 25,groups = {"Functional","Smoke"})
public void UpdateSCHEMEbuttonisEnabledandClickable() {
boolean Selectbutton = csh.ValidateUpdateSCHEMEbuttonisEnabled();
softAssert.assertTrue(Selectbutton, "Select button is not Enabled");
if(Selectbutton == true) {
	System.out.println("Select button is Enabled");
	delay();
	csh.ClickonUpdateSCHEMEbutton("110077");
	delay();
	HandleAlert();
	delay();
softAssert.assertEquals(GetAlertText(), "Scheme Updated Successfully.. ", "Alert Message Not Matched");
delay();
HandleAlert();
}	
}

@Test(priority = 26,groups = {"Functional"})
public void ADDNEWSCHEMEbuttonbuttonisEnabledandClickable() {
boolean ADDNEWSCHEME = csh.ValidateADDNEWSCHEMEbuttonbuttonisEnabled();
softAssert.assertTrue(ADDNEWSCHEME, "ADD NEW SCHEME button is not Enabled");
if(ADDNEWSCHEME == true) {
	System.out.println("ADD NEW SCHEME button is Enabled");
	delay();
	csh.ClickonADDNEWSCHEMEbutton();
	
}
}









}
