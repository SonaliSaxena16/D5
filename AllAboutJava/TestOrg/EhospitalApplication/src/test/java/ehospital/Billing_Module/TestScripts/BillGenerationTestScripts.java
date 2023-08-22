package ehospital.Billing_Module.TestScripts;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.BillGenerationHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;

public class BillGenerationTestScripts extends BaseClass {
	BillGenerationHelper bgh;
	BillGenerationTestScripts bgt;
	PreparationOfReceiptsHelper porh;
	
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void BillGenerationlinkisDisplayed() {
bgh = new BillGenerationHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
bgt = new BillGenerationTestScripts();
delay();

bgt.switchtoLeftFrame();
boolean BillGenerationlink = bgh.ValidateBillGenerationlinkisDisplayed();
softAssert.assertTrue(BillGenerationlink, "Bill Generation link is Not Displayed");
if(BillGenerationlink == true) {
	System.out.println("Bill Generation link is Displayed");
}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void BillGenerationlinkisEnablededandClickable() {
boolean BillGenerationlink = bgh.ValidateBillGenerationlinkisEnabled();
softAssert.assertTrue(BillGenerationlink, "Bill Generation link is Not Enabled");
if(BillGenerationlink == true) {
	System.out.println("Bill Generation link is Enabled");
	delay();
	bgh.ClickonBillGenerationlink();
	delay();
	bgt.switchtoinnerRightFrame();
}
}

@Test(priority = 3,groups = {"Functional","Smoke"})
public void RegisteredPatientRadioButtonisEnabledandClickable() {	
boolean RegisteredPatientRadioButton = bgh.validateRegisteredPatientRadioButtonisEnabled();
softAssert.assertTrue(RegisteredPatientRadioButton, "Registered Patient Radio Button is not enabled");
if(RegisteredPatientRadioButton == true) {
	System.out.println("Registered Patient Radio Button is enabled");
	delay();
bgh.SelectRegisteredPatientRadioButton();
}
}
@Test(priority = 4,groups = {"Functional"})
public void RegisteredPatientRadioButtonisSelectable() {	
boolean RegisteredPatientRadioButton = bgh.validateRegisteredPatientRadioButtonisSelected();
softAssert.assertTrue(RegisteredPatientRadioButton, "Registered Patient Radio Button is not selected");
if(RegisteredPatientRadioButton == true) {
	System.out.println("Registered Patient Radio Button is selected");
}
}

@Test(priority = 5,groups = {"Functional","Smoke"})
public void PatientIDDropdownisEnabledandSelectvalue() {
	
boolean PatientIDDropdown = bgh.validatePatientIDDropdownisEnabled();
softAssert.assertTrue(PatientIDDropdown, "Patient ID Dropdown is not enabled");
if(PatientIDDropdown == true) {
	System.out.println("Patient ID Dropdown is enabled");
	delay();
bgh.SelectValuefromPatientIDDropdown();
}
}

@Test(priority = 6,groups = {"Functional"})
public void PatientIDDropdownisMultiple() {
	
boolean PatientIDDropdown = bgh.validatePatientIDDropdownisMultiple();
softAssert.assertFalse(PatientIDDropdown, "Patient ID Dropdown is multiple");
if(PatientIDDropdown == false) {
	System.out.println("Patient ID Dropdown is not multiple");
}
}

@Test(priority = 7,groups = {"Functional"})
public void SearchButtonisDisplayed() {
	
boolean SearchButton = bgh.validateSearchButtonisDisplayed();
softAssert.assertTrue(SearchButton, "Search button is not Displayed");
if(SearchButton == true) {
	System.out.println("Search button is Displayed");
}
}
@Test(priority = 8,groups = {"Functional","Smoke"})
public void SearchbuttonisEnabledandClickable() {
	
boolean SearchButton = bgh.validateSearchButtonisEnabled();
softAssert.assertTrue(SearchButton, "Search button is not enabled");
if(SearchButton == true) {
	System.out.println("Search button is enabled");
	delay();
bgh.clickonSearchButton();
delay();
softAssert.assertEquals(GetAlertText(), "Please Enter UHID", "Alert pop up is not coming");
delay();
HandleAlert();
}
delay();
List<String> PatientInfoAfterEnteredUHID = bgh.PatientInformation();
}

@Test(priority = 9,groups = {"Functional"})
public void EnterInvalidIDintothePatientIDTextBox() {

delay();
bgh.EnterInvalidIDintothePatientIDTextBox("%^&54552huyh");
delay();
softAssert.assertEquals(GetAlertText(), "Please Enter Valid UHID", "Alert pop up is not coming");
delay();
HandleAlert();

}


@Test(priority = 10,groups = {"Functional","Smoke"})	
public void EntervalidIDintothePatientIDTextBox() {
delay();
List<String> PatientInfoBeforeEnteredUHID = bgh.PatientInformation();		
delay();
Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

String ValidID = reader.getCellData("OPD", "UHID", 4);
delay();
bgh.EntervalidIDintothePatientIDTextBox(ValidID);
delay();
List<String> PatientInfoAfterEnteredUHID = bgh.PatientInformation();
Assert.assertNotEquals(PatientInfoBeforeEnteredUHID, PatientInfoAfterEnteredUHID);	
}

@Test(priority = 11,groups = {"Functional","Smoke"})
public void ValidatePatientTypeDropdownandIsEnabledTryingtoselectValues() throws Exception {
 delay();
boolean PatientTypeDropdown =  bgh.ValidatePatientTypeDropdownisEnabled();
if (PatientTypeDropdown == true) {
	bgh.TryingtoSelectValueFromPatientTypeDropdown();
    throw new Exception("Dropdown is Selectable");
}
else if (PatientTypeDropdown == false){
	System.out.println("Dropdown is Not Selectable");
}
delay();
}

@Test(priority = 12,groups = {"Functional"})
public void PatientTypeDropdwonisMultiple() {
	delay();
boolean PatientTypeDropdwon = bgh.validatePatientTypeDropdwonisMultiple();
softAssert.assertFalse(PatientTypeDropdwon, "Patient Type Dropdwon is multiple");
if(PatientTypeDropdwon == false) {
	System.out.println("Patient Type Dropdwon is Not multiple");
}

}
@Test(priority = 13,groups = {"Functional","Smoke"})
public void ValidateBillibgTypeDropdownandIsEnabledTryingtoselectValues() throws Exception {
 delay();
boolean PatientTypeDropdown =  bgh.ValidateBillingTypeDropdownisEnabled();
if (PatientTypeDropdown == true) {
	bgh.TryingtoSelectValueFromBillingTypeDropdown();
    throw new Exception("Dropdown is Selectable");
}
else if (PatientTypeDropdown == false){
	System.out.println("Dropdown is Not Selectable");
}
delay();
}

@Test(priority = 14,groups = {"Functional"})
public void BillingTypeDropdwonisMultiple() {
	delay();
boolean PatientTypeDropdwon = bgh.validateBillingTypeDropdwonisMultiple();
softAssert.assertFalse(PatientTypeDropdwon, "Billing Type Dropdwon is multiple");
if(PatientTypeDropdwon == false) {
	System.out.println("Billing Type Dropdwon is Not multiple");
}
}

@Test(priority = 15,groups = {"Functional","Smoke"})
public void SchemeDropdownisEnabledandSelectValue() {
boolean SchemeDropdown = bgh.ValidateSchemeDropdownisEnabled();
softAssert.assertTrue(SchemeDropdown, "Scheme Dropdown is not enabled");
if(SchemeDropdown == true) {
	System.out.println("Scheme Dropdown is enabled");
	delay();
bgh.SelectValueFromSchemeDropdown();
}
}

@Test(priority = 16,groups = {"Functional"})
public void SchemeDropdownisMultiple() {
	delay();
boolean SchemeDropdown = bgh.validateSchemeDropdownisMultiple();
softAssert.assertFalse(SchemeDropdown, "Scheme  Dropdwon is multiple");
if(SchemeDropdown == false) {
	System.out.println("Scheme Dropdwon is Not multiple");
}
}

@Test(priority = 17,groups = {"Functional"})
public void OtherServicesCheckBoxisEnabledandSelectable() {
	delay();
boolean OtherServicesCheckBox = bgh.ValidateOtherServicesCheckBoxisEnabled();
softAssert.assertTrue(OtherServicesCheckBox, "Other Services Check Box is not enabled");
if(OtherServicesCheckBox == true) {
	System.out.println("Other Services Check Box is enabled");
	delay();
	bgh.SelectOtherServiceCheckBox();
}
}
@Test(priority = 18,groups = {"Functional"})
public void OtherServicesCheckBoxisSelected() {
	delay();
boolean OtherServicesCheckBox = bgh.ValidateOtherServicesCheckBoxisSelected();
softAssert.assertTrue(OtherServicesCheckBox, "Other Services Check Box is not Selected");
if(OtherServicesCheckBox == true) {
	System.out.println("Other Services Check Box is Selected");
}
}

@Test(priority = 19,groups = {"Functional"})
public void CancelButtonofOtherServicesisEnabledandClickable() {
	delay();
boolean OtherServicesCheckBox = bgh.ValidateCancelButtonofOtherServicesisEnabled();
softAssert.assertTrue(OtherServicesCheckBox, "Other Services Cancel button is not Enabled");
if(OtherServicesCheckBox == true) {
	System.out.println("Other Services Cancel button is Enabled");
	bgh.ClickonCancelButtonofOtherServices();
}
}

@Test(priority = 20,groups = {"Functional","Smoke"})
public void PrepareRecepitForOtherServices() {
	delay();
	bgh.PrepareRecepitForOtherServices("Injection", "2", "20");
delay();
boolean Serviceinfotable = bgh.ServiceinfotableisDisplayed();
softAssert.assertTrue(Serviceinfotable, "Service info table is not Displayed");
if(Serviceinfotable == true) {
	System.out.println("Service info table is Displayed.");
}
}

@Test(priority = 21,groups = {"Functional"})
public void RemoveServicesImgbuttonisEnabledandClickable() {
boolean RemoveServices = bgh.ValidateRemoveServicesImgbuttonisEnabled();
softAssert.assertTrue(RemoveServices, "Remove Services img button is not enabled");
if(RemoveServices == true) {
	System.out.println("Remove Services img button is enabled");
	delay();
	bgh.ClickonRemoveServicesImgbutton();
	delay();
Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

String ValidID = reader.getCellData("OPD", "UHID", 4);
delay();
bgh.EntervalidIDintothePatientIDTextBox(ValidID);
delay();
bgh.PrepareRecepitForOtherServices("Injection", "2", "20");		
}
}

@Test(priority = 22,groups = {"Functional","Smoke"})
public void ViewStatementlinkisEnabledandClickable() {
boolean ViewStatementlink = bgh.ValidateViewStatementlinkisEnabled();
softAssert.assertTrue(ViewStatementlink, "View Statement link is not Enabled");
if(ViewStatementlink == true) {
	System.out.println("View Statement link is Enabled");
	delay();
bgh.ClickonViewStatementlink();
boolean ViewStatementPopUp = bgh.ValidateViewStatementPopupisDisplayed();
softAssert.assertTrue(ViewStatementPopUp, "View Statement Pop Up is not Displayed");
}
delay();
bgh.ClickonCancelbuttonofViewStatementPopup();
}

@Test(priority = 23,groups = {"Functional","Smoke"})
public void NextbuttonisEnabledandClickable() {
boolean ViewStatementlink = bgh.ValidateNextbuttonisEnabled();
softAssert.assertTrue(ViewStatementlink, "Next button is not Enabled");
if(ViewStatementlink == true) {
	System.out.println("Next button is Enabled");
	delay();
bgh.ClickonNextbutton();	
}
}

@Test(priority = 24,groups = {"Functional","Smoke"})
public void RegisterPatientandPrepareBillbuttonisEnabledandClickable() {
boolean RegisterPatientandPrepareBill = bgh.ValidateRegisterPatientandPrepareBillbuttonisEnabled();
softAssert.assertTrue(RegisterPatientandPrepareBill, "Register Patient and Prepare Bill is not Enabled");
if(RegisterPatientandPrepareBill == true) {
	System.out.println("Register Patient and Prepare Bill is Enabled");
	delay();
bgh.ClickonRegisterPatientandPrepareBillbutton();	
delay();
boolean BillPreparedPopup = bgh.ValidateBillPreparedPopupisdisplayed();
softAssert.assertTrue(BillPreparedPopup, "Bill Prepared Successfully Message Popup is not displayed");
}
}

@Test(priority = 25,groups = {"Functional","Smoke"})
public void DetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisEnabledandClickable() {
boolean DetailedReceipt = bgh.ValidateDetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisEnabled();
softAssert.assertTrue(DetailedReceipt, "Detailed Receipt Radio button is not Enabled");
if(DetailedReceipt == true) {
	System.out.println("Detailed Receipt Radio button is Enabled");
	delay();
bgh.ClickonDetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup();	

}
}

@Test(priority = 26,groups = {"Functional"})
public void DetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisSelected() {
boolean DetailedReceipt = bgh.ValidateDetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisSelected();
softAssert.assertTrue(DetailedReceipt, "Detailed Receipt Radio button is not Selected");
if(DetailedReceipt == true) {
	System.out.println("Detailed Receipt Radio button is Selected");
}
}

@Test(priority = 27,groups = {"Functional","Smoke"})
public void ClickheretoprintMoneyReceiptbuttonisEnabledandClickable() {
boolean printMoneyReceipt = bgh.ValidateClickheretoprintMoneyReceiptbuttonisEnabled();
softAssert.assertTrue(printMoneyReceipt, "print Money Receipt button is not Enabled");
if(printMoneyReceipt == true) {
	System.out.println("print Money Receipt button is Enabled");
	delay();
bgh.ClickonClickheretoprintMoneyReceiptbutton();	
longDelay();
bgt.switchtoPrintbackFrameforBillGenerationRecepit();
delay();
porh.ClickonBackbuttoninRecepit();
longDelay();
bgt.switchtoinnerRightFrame();
}
}

@Test(priority = 28,groups = {"Functional","Smoke"})
public void HeadOfAccountDropdownisEnabledandSelectValue() {
	delay();
boolean HeadOfAccount = bgh.ValidateHeadOfAccountDropdownisEnabled();
softAssert.assertTrue(HeadOfAccount, "Head Of Account is not enabled");
if(HeadOfAccount == true) {
	System.out.println("Head Of Account is enabled");
	delay();
	bgh.SelectValueFromHeadOfAccountDropdown();
}
}
@Test(priority = 29,groups = {"Functional"})
public void HeadOfAccountDropdownisMultiple() {
	delay();
boolean HeadOfAccount = bgh.ValidateHeadOfAccountDropdownisMultiple();
softAssert.assertTrue(HeadOfAccount, "Head Of Account is Multiple");
if(HeadOfAccount == true) {
	System.out.println("Head Of Account is not Multiple");

}
}
@Test(priority = 30,groups = {"Functional","Smoke"})
public void CategoryDropdownisEnabledandSelectvalue() {
	delay();
boolean CategoryDropdown = bgh.ValidateCategoryDropdownDropdownisEnabled();
softAssert.assertTrue(CategoryDropdown, "Category Dropdown is Not Enabled");
if(CategoryDropdown == true) {
	System.out.println("Category Dropdown is Enabled");
	delay();
	bgh.SelectValueFromCategoryDropdown();

}
}
@Test(priority = 31,groups = {"Functional"})
public void CategoryDropdownisMultiple() {
	delay();
boolean CategoryDropdown = bgh.ValidateCategoryDropdownDropdownisMultiple();
softAssert.assertTrue(CategoryDropdown, "Category Dropdown is Multiple");
if(CategoryDropdown == true) {
	System.out.println("Category Dropdown is not Multiple");
}
}

@Test(priority = 32,groups = {"Functional","Smoke"})
public void Checkboxtoselectservices1isEnabledandSelectable() {
boolean Checkboxtoselectservices = bgh.ValidateCheckboxtoselectservices1isEnabled();
softAssert.assertTrue(Checkboxtoselectservices, "Check box to selects ervices is Not Enabled");
if(Checkboxtoselectservices == true) {
	System.out.println("Check box to selects ervices is Enabled");
	delay();
bgh.SelectCheckboxtoselectservices1();
}
}
@Test(priority = 33,groups = {"Functional"})
public void Checkboxtoselectservices1isSelected() {
boolean Checkboxtoselectservices = bgh.ValidateCheckboxtoselectservices1isSelected();
softAssert.assertTrue(Checkboxtoselectservices, "Check box to selects ervices is Not Selected");
if(Checkboxtoselectservices == true) {
	System.out.println("Check box to selects ervices is Selected");

}
}
@Test(priority = 34,groups = {"Functional","Smoke"})
public void AddToListButtonisEnabledandClickable() {
boolean AddToListButton = bgh.ValidateAddToListButtonisEnabled();
softAssert.assertTrue(AddToListButton, "Add To List Button is Not Enabled");
if(AddToListButton == true) {
	System.out.println("Add To List Button is Enabled");
delay();
bgh.ClickonAddToListButton();
delay();
bgh.ClickonNextbutton();
delay();
bgh.ClickonRegisterPatientandPrepareBillbutton();
}
}

@Test(priority = 35,groups = {"Functional","Smoke"})
public void ConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisEnabledandClickable() {
boolean ConsolidatedReceipt = bgh.ValidateConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisEnabled();
softAssert.assertTrue(ConsolidatedReceipt, "Detailed Receipt Radio button is not Enabled");
if(ConsolidatedReceipt == true) {
	System.out.println("Detailed Receipt Radio button is Enabled");
	delay();
bgh.ClickonConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup();	
}
}

@Test(priority = 36,groups = {"Functional","Smoke"})
public void ConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisSelected() {
boolean DetailedReceipt = bgh.ValidateConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisSelecetd();
softAssert.assertTrue(DetailedReceipt, "Detailed Receipt Radio button is not Selected");
if(DetailedReceipt == true) {
	System.out.println("Detailed Receipt Radio button is Selected");
delay();
bgh.ClickonClickheretoprintMoneyReceiptbutton();
delay();
longDelay();
bgt.switchtoPrintbackFrameforBillGenerationRecepit();
delay();
porh.ClickonBackbuttoninRecepit();
longDelay();
bgt.switchtoinnerRightFrame();

}
}
























}
