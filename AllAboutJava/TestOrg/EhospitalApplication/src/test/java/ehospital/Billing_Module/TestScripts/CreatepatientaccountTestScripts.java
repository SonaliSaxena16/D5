package ehospital.Billing_Module.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.CreatepatientaccountHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;

public class CreatepatientaccountTestScripts extends BaseClass {
	CreatepatientaccountHelper cpah;
	CreatepatientaccountTestScripts cpat;
	PreparationOfReceiptsHelper porh;
	
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void CreatepatientaccountLinkisDisplayed() {
cpah = new CreatepatientaccountHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
cpat = new CreatepatientaccountTestScripts();
delay();

cpat.switchtoLeftFrame();
boolean CreatepatientaccountLink = cpah.ValidateCreatepatientaccountLinkisDisplayed();
softAssert.assertTrue(CreatepatientaccountLink, "Create patient account Link is not Displayed");
if(CreatepatientaccountLink == true) {
	System.out.println("Create patient account Link is Displayed");
}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void CreatepatientaccountLinkisEnabledandClickable() {
boolean CreatepatientaccountLink = cpah.ValidateCreatepatientaccountLinkisEnabled();
softAssert.assertTrue(CreatepatientaccountLink, "Create patient account Link is not Enabled");
if(CreatepatientaccountLink == true) {
	System.out.println("Create patient account Link is Enabled");
	delay();
	cpah.ClickonCreatepatientaccountLink();
	delay();
	cpat.switchtoinnerRightFrame();
}
}

@Test(priority = 3,groups = {"Functional","Smoke"})
public void IDDropdownisEnabledandSelectValue() {
boolean IDDropdown = cpah.ValidateIDDropdownisEnabled();
softAssert.assertTrue(IDDropdown, "ID Dropdown is not Enabled");
if(IDDropdown == true) {
	System.out.println("ID Dropdown is Enabled");
delay();
cpah.SelectValuefromIDDropdown();
}
}

@Test(priority = 4,groups = {"Functional"})
public void IDDropdownisMultiple() {
boolean IDDropdown = cpah.ValidateIDDropdownisMultiple();
softAssert.assertFalse(IDDropdown, "ID Dropdown is Multiple");
if(IDDropdown == false) {
	System.out.println("ID Dropdown is not Multiple");
}
}

@Test(priority = 5,groups = {"Functional"})
public void SearchbuttonisEnabledandClickable() {
boolean Searchbutton = cpah.ValidateSearchbuttonisEnabled();
softAssert.assertTrue(Searchbutton, "Search button is not Enabled");
if(Searchbutton == true) {
	System.out.println("Search button is Enabled");
	delay();
	cpah.ClickonSearchbutton();
	delay();
softAssert.assertEquals(GetAlertText(), "Please Enter UHID", "Alert Popup is not coming.");
delay();
HandleAlert();
}
}

@Test(priority = 6,groups = {"Functional"})
public void IDTextboxisEnabledandEnterInvalidID() {
boolean IDTextboxisEnabled = cpah.ValidateIDTextboxisEnabled();
softAssert.assertTrue(IDTextboxisEnabled, "ID Text box is not Enabled");
if(IDTextboxisEnabled == true) {
	System.out.println("ID Text box is Enabled ");
	delay();
	cpah.EnterInvalidIDintotheTextBox("@#$%^");
	delay();
softAssert.assertEquals(GetAlertText(), "Please Enter Valid UHID", "Alert Popup is not coming.");
delay();
HandleAlert();
}
}

@Test(priority = 7,groups = {"Functional","Smoke"})
public void IDTextboxisEnabledandEnterValidID() {
boolean IDTextboxisEnabled = cpah.ValidateIDTextboxisEnabled();
softAssert.assertTrue(IDTextboxisEnabled, "ID Text box is not Enabled");
if(IDTextboxisEnabled == true) {
	System.out.println("ID Text box is Enabled ");
	delay();
	delay();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 4);
	delay();
	cpah.EnterValidIDintotheTextBox(ValidID);
	delay();
}
boolean BillingCategoryDetails = cpah.ValidateBillingCategoryDetailsisDisplayed();
softAssert.assertTrue(BillingCategoryDetails, "Billing Category Details Message is Not Displayed");
}

@Test(priority = 8,groups = {"Functional","Smoke"})
public void PatientTypeDropdownisEnabled() throws Exception {
boolean PatientType = cpah.ValidatePatientTypeDropdownisEnabled();
if(PatientType == true) {
	System.out.println("Patient Type Dropdown is Enabled");
	delay();
	throw new Exception("Patient Type dropdown should not be Editable.");
}else if(PatientType == false) {
	System.out.println("Patient Type Dropdown is Not Enabled");
}
}

@Test(priority = 9,groups = {"Functional","Smoke"})
public void BillingTypeDropdownisEnabled() throws Exception {
boolean BillingType = cpah.ValidateBillingTypeDropdownisEnabled();
if(BillingType == true) {
	System.out.println("Billing Type Dropdown is Enabled");
	delay();
	throw new Exception("Billing Type dropdown should not be Editable.");
}else if(BillingType == false) {
	System.out.println("Billing Type Dropdown is Not Enabled");
}
}

@Test(priority = 10,groups = {"Functional"})
public void SaveButtonisEnabledandClickable() {
boolean SaveButton = cpah.ValidateSaveButtonisEnabled();
softAssert.assertTrue(SaveButton, "Save Button is Not Enabled");
if(SaveButton == true) {
	System.out.println("Save Button is Enabled");
	delay();
cpah.ClickonSaveButton();
delay();
softAssert.assertEquals(GetAlertText(), "Please select a scheme..", "Alert message not Matched");
delay();
HandleAlert();

}
}

@Test(priority = 11,groups = {"Functional","Smoke"})
public void SchemeNamedropdownisEnabledandSelectValue() {
boolean SchemeName = cpah.ValidateSchemeNamedropdownisEnabled();
softAssert.assertTrue(SchemeName, "Scheme Name Dropdown is not Enabled");
if(SchemeName == true) {
	System.out.println("Scheme Name Dropdown is Enabled");
delay();
cpah.SelectValuefromSchemeNameDropdown();
}
}

@Test(priority = 12,groups = {"Functional"})
public void SchemeNamedropdownisMultiple() {
boolean SchemeName = cpah.ValidateIDDropdownisMultiple();
softAssert.assertFalse(SchemeName, "Scheme Name Dropdown is Multiple");
if(SchemeName == false) {
	System.out.println("Scheme Name Dropdown is not Multiple");
}
}

@Test(priority = 13,groups = {"Functional","Smoke"})
public void AmountLimitTextBoxisEnabledandChangetheAmount() throws Exception {
boolean AmountTextbox = cpah.ValidateAmountLimitTextBoxisEnabled();
softAssert.assertTrue(AmountTextbox, "Amount Text box is not Enabled");
if(AmountTextbox == true) {
	System.out.println("Amount Text box is Enabled ");
	delay();
	cpah.ChangetheAmountintoAmountLimitTextBox("500000");
	delay();
	throw new Exception("Amount Limit Text Box should not editable");
}
delay();
cpah.SelectValueFromSchemeNameDropdown("50000");
delay();
softAssert.assertEquals(GetAlertText(), "Please enter account no..", "Alert message not Matched");
delay();
HandleAlert();
}

@Test(priority = 14,groups = {"Functional","Smoke"})
public void AccountNumberTextBoxisEnabledandEnterAccountNumber() {
boolean AccountNumber = cpah.ValidateAccountNumberTextBoxisEnabled();
softAssert.assertTrue(AccountNumber, "Account Number Text Box is Not Enabled");
if(AccountNumber == true) {
	System.out.println("Account Number Text Box is Enabled");
	delay();
	cpah.EnterAccountNumberintotheAccounttNumberTextBox("ABCNIC123");
delay();
softAssert.assertEquals(GetAlertText(), "Please enter account valid date..", "Alert message not Matched");
delay();
HandleAlert();
}
delay();
cpah.SelectDateFromCalender();
}

@Test(priority = 15,groups = {"Functional","Smoke"})
public void AccountDetailsTextBoxisEnabledandEnterDetail() {
boolean AccountDetails = cpah.ValidateAccountDetailsTextBoxisEnabled();
softAssert.assertTrue(AccountDetails, "Account Details Text box is Not Enabled");
if(AccountDetails == true) {
	System.out.println("Account Details Text box is Enabled");
	delay();
	cpah.EnterAccountDetailintoAccountDetailsTextBox("NIC user Testing the Account");
delay();
softAssert.assertEquals(GetAlertText(), "Account created successfully..", "Alert Pop up message is not matched");
delay();
HandleAlert();
delay();
}
}

@Test(priority = 16,groups = {"Functional","Smoke"})
public void BlockimgbuttonisDisplayedandClickable() {
boolean Blockimg = cpah.ValidateBlockimgbuttonisDisplayed();
softAssert.assertTrue(Blockimg, "Block img button is not displayed");
if(Blockimg == true) {
	System.out.println("Block img button is displayed");
delay();
cpah.GeneratePatientSchemeAccountinonego("ABCD1234");
delay();
HandleAlert();
delay();
cpah.ClickonBlockimgbutton();
delay();
softAssert.assertEquals(GetAlertText(), "Do you really want to Block The Account ??", "Alert Pop message is not matched");
delay();
HandleAlert();
delay();
HandleAlert();	
}
}

@Test(priority = 17,groups = {"Functional","Smoke"})
public void UnblocklinkisEnabledandClickable() {
boolean Unblocklink = cpah.ValidateUnblocklinkisEnabled();
softAssert.assertTrue(Unblocklink, "Unblock link is Not Enabled");
if(Unblocklink == true) {
	System.out.println("Unblock link is Enabled");
delay();
cpah.ClickonUnblocklink();
delay();
softAssert.assertEquals(GetAlertText(), "Do you really want to Unblock The Account ??", "Alert Pop message is not matched");
delay();
HandleAlert();
delay();
HandleAlert();	
}
}

@Test(priority = 18,groups = {"Functional","Smoke"})
public void DeletebuttonisEnabledandClickable() {
boolean Deletebutton = cpah.ValidatedeletebuttonisEnabled();
softAssert.assertTrue(Deletebutton, "Delete button is not Enabled");
if(Deletebutton == true) {
	System.out.println("Delete button is Enabled");
	delay();
	cpah.Clickondeletebutton();
delay();
softAssert.assertEquals(GetAlertText(), "Do you really want to Delete The Account ??", "Alert Pop message is not matched");
delay();
HandleAlert();
delay();
HandleAlert();	

}
}

@Test(priority = 19,groups = {"Functional"})
public void TryingtocreatePatientAccountwithDuplicateAccountNumber() {
	delay();
cpah.TryingtocreatePatientAccountwithDuplicateAccountNumber("ABCNIC123");
delay();
HandleAlert();
}

@Test(priority = 20,groups = {"Functional","Smoke"})
public void TryingtocreatePatientAccountforTransGenderPatirnt() throws Exception {
	delay();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 5);
	delay();
cpah.TryingtocreatePatientAccountforTransGenderPatirnt(ValidID, "ABC123456","TransGender Patient account test");
delay();

if(GetAlertText().equalsIgnoreCase("undefined")) {
	delay();
	HandleAlert();
	throw new Exception("Unable to create the account for TransGender Patient");
}else if(GetAlertText() .equalsIgnoreCase("Account created successfully..")) {
	System.out.println("able to create account for TransGender Patient");
}	
//softAssert.assertEquals(GetAlertText(),"Account created successfully..", "Alert Pop up message is not matched");
delay();
HandleAlert();
}

}
