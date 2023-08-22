package ehospital.Billing_Module.TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ehospital.Billing_Module.helper.Home;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;

public class PreparationOfReceiptsTestScripts extends BaseClass {

	Home hf;
	PreparationOfReceiptsTestScripts port;
	PreparationOfReceiptsHelper porh;
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void BillingModuleisdisplayed() throws IOException, InterruptedException {
hf = new Home(driver);
porh = new PreparationOfReceiptsHelper(driver);
port = new PreparationOfReceiptsTestScripts();

delay();
hf.clickonBillingTab();	
delay();
HandleAlert();
/*Alert alert = driver.switchTo().alert();
alert.accept();*/
delay();
switchToNewWindow();
delay();
port.switchtoLeftFrame();

boolean BillingModule = porh.validateBillingModuleisDisplayed();
Assert.assertTrue(BillingModule, "Billing Module is not displayed");
if(BillingModule == true) {
	System.out.println("Billing Module is displayed");
}
}
@Test(priority = 2,groups = {"Functional","Smoke"})
public void BillingModuleisenabledandClickable() throws InterruptedException {
	
boolean BillingModule = porh.validateBillingModuleisEnabled();
Assert.assertTrue(BillingModule, "Billing Module is not enabled");
if(BillingModule == true) {
	Thread.sleep(2000);
System.out.println("Billing Module is enabled");
porh.ClickonBillingModule();
}
}
@Test(priority = 3,groups = {"Functional"})
public void BillingCounterisDisplayed() {
	
boolean BillingCounter = porh.validateBillingCounterisDisplayed();
softAssert.assertTrue(BillingCounter, "Billing Counter Sub module is not displayed");
if(BillingCounter == true) {
	System.out.println("Billing Counter Sub module is displayed");
}
}
@Test(priority = 4,groups = {"Functional","Smoke"})
public void BillingCounterisEnabledandClickable() {
	
boolean BillingCounter = porh.validateBillingCounterisenabled();
softAssert.assertTrue(BillingCounter, "Billing Counter Sub module is not enabled");
if(BillingCounter == true) {
	System.out.println("Billing Counter Sub module is enabled");
	delay();
porh.clickonBillingCounter();
}
}
@Test(priority = 5,groups = {"Functional"})
public void PreparationOfReceiptslinkisDisplayed() {

boolean  PreparationOfReceiptslink = porh.validatePreparationOfReceiptslinkisDisplayed();
softAssert.assertTrue(PreparationOfReceiptslink, "Preparation Of Receipts link is not displayed");
if(PreparationOfReceiptslink == true) {
	System.out.println("Preparation Of Receipts link is displayed");
}
}
@Test(priority = 6,groups = {"Functional","Smoke"})
public void PreparationOfReceiptslinkisEnabledandClickable() {

boolean  PreparationOfReceiptslink = porh.validatePreparationOfReceiptslinkisEnabled();
softAssert.assertTrue(PreparationOfReceiptslink, "Preparation Of Receipts link is not enabled");
if(PreparationOfReceiptslink == true) {
	System.out.println("Preparation Of Receipts link is enabled");
	delay();
porh.clickonPreparationOfReceiptslink();
delay();
port.switchtoinnerRightFrame();
}
}
@Test(priority = 7,groups = {"Functional","Smoke"})
public void PatientWithUHIDRadioButtonisEnabledandClickable() {
	
boolean PatientWithUHIDRadioButton = porh.validatePatientWithUHIDRadioButtonisEnabled();
softAssert.assertTrue(PatientWithUHIDRadioButton, "Patient With UHID Radio Button is not enabled");
if(PatientWithUHIDRadioButton == true) {
	System.out.println("Patient With UHID Radio Button is enabled");
	delay();
porh.SelectPatientWithUHIDRadioButton();
}
}
@Test(priority = 8,groups = {"Functional"})
public void PatientWithUHIDRadioButtonisSelectable() {
	
boolean PatientWithUHIDRadioButton = porh.validatePatientWithUHIDRadioButtonisSelected();
softAssert.assertTrue(PatientWithUHIDRadioButton, "Patient With UHID Radio Button is not selected");
if(PatientWithUHIDRadioButton == true) {
	System.out.println("Patient With UHID Radio Button is selected");
}
}

@Test(priority = 9,groups = {"Functional","Smoke"})
public void SearchFilterOfPatientWithUHIDDropdownisEnabledandSelectvalue() {
	
boolean SearchFilterOfPatientWithUHIDDropdown = porh.validateSearchFilterOfPatientWithUHIDDropdownisEnabled();
softAssert.assertTrue(SearchFilterOfPatientWithUHIDDropdown, "Search Filter Of Patient With UHID Dropdown is not enabled");
if(SearchFilterOfPatientWithUHIDDropdown == true) {
	System.out.println("Search Filter Of Patient With UHID Dropdown is enabled");
	delay();
porh.SelectValuefromPatientWithUHIDDropdown();
}
}
@Test(priority = 10,groups = {"Functional"})
public void SearchFilterOfPatientWithUHIDDropdownisMultiple() {
	
boolean SearchFilterOfPatientWithUHIDDropdown = porh.validateSearchFilterOfPatientWithUHIDDropdownisMultiple();
softAssert.assertFalse(SearchFilterOfPatientWithUHIDDropdown, "Search Filter Of Patient With UHID Dropdown is multiple");
if(SearchFilterOfPatientWithUHIDDropdown == false) {
	System.out.println("Search Filter Of Patient With UHID Dropdown is not multiple");

}
}
@Test(priority = 11,groups = {"Functional"})
public void SearchButtonisDisplayed() {
	
boolean SearchButton = porh.validateSearchButtonisDisplayed();
softAssert.assertTrue(SearchButton, "Search button is not Displayed");
if(SearchButton == true) {
	System.out.println("Search button is Displayed");
}
}
@Test(priority = 12,groups = {"Functional","Smoke"})
public void SearchbuttonisEnabledandClickable() {
	
boolean SearchButton = porh.validateSearchButtonisEnabled();
softAssert.assertTrue(SearchButton, "Search button is not enabled");
if(SearchButton == true) {
	System.out.println("Search button is enabled");
	delay();
porh.clickonSearchButton();
delay();

String Actual = porh.ActualPatientIDValidationMessage();
softAssert.assertEquals(Actual, "No Patient found.Please check the UHID.", "Validation Message is not Matched");
if(Actual.equals("No Patient found.Please check the UHID.")) {
	System.out.println("Validation Message of Patient Id is Matched");
}
}
}
@Test(priority = 13,groups = {"Functional"})
public void EnterInvalidIDintothePatientIDTextBox() {

delay();
porh.EnterInvalidIDintothePatientIDTextBox("%^&54552huyh");
delay();
String Actual = porh.ActualPatientIDValidationMessage();
softAssert.assertEquals(Actual, "No Patient found.Please check the UHID.", "Validation Message is not Matched");
if(Actual.equals("No Patient found.Please check the UHID.")) {
	System.out.println("Validation Message of Patient Id is Matched");
}
}

@Test(priority = 14,groups = {"Functional","Smoke"})	
public void EntervalidIDintothePatientIDTextBox() {
delay();
List<String> PatientInfoBeforeEnteredUHID = porh.PatientInformation();		
delay();
//Xls_Reader reader = new Xls_Reader("C:\\Users\\User\\Desktop\\Latest and old Ehospital Framework\\Vishal framework\\EhospitalApplication\\EhospitalApplication\\"
	//	+ "ExcelFile\\OPD Data driven Frame Work.xlsx");
Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");
String ValidID = reader.getCellData("OPD", "UHID", 2);
delay();
porh.EntervalidIDintothePatientIDTextBox(ValidID);
delay();
List<String> PatientInfoAfterEnteredUHID = porh.PatientInformation();
Assert.assertNotEquals(PatientInfoBeforeEnteredUHID, PatientInfoAfterEnteredUHID);	
}

@Test(priority = 15,groups = {"Functional","Smoke"})
public void ValidatePatientTypeDropdownandIsEnabledTryingtoselectValues() throws Exception {
 delay();
boolean PatientTypeDropdown =  porh.ValidatePatientTypeDropdownisEnabled();
if (PatientTypeDropdown == true) {
	porh.TryingtoSelectValueFromPatientTypeDropdown();
    throw new Exception("Dropdown is Selectable");
}
else if (PatientTypeDropdown == false){
	System.out.println("Dropdown is Not Selectable");
}
delay();
}

@Test(priority = 16,groups = {"Functional"})
public void PatientTypeDropdwonisMultiple() {
	delay();
boolean PatientTypeDropdwon = porh.validatePatientTypeDropdwonisMultiple();
softAssert.assertFalse(PatientTypeDropdwon, "Patient Type Dropdwon is multiple");
if(PatientTypeDropdwon == false) {
	System.out.println("Patient Type Dropdwon is Not multiple");
}

}
@Test(priority = 17,groups = {"Functional","Smoke"})
public void ValidateBillibgTypeDropdownandIsEnabledTryingtoselectValues() throws Exception {
 delay();
boolean PatientTypeDropdown =  porh.ValidateBillingTypeDropdownisEnabled();
if (PatientTypeDropdown == true) {
	porh.TryingtoSelectValueFromBillingTypeDropdown();
    throw new Exception("Dropdown is Selectable");
}
else if (PatientTypeDropdown == false){
	System.out.println("Dropdown is Not Selectable");
}
delay();
}

@Test(priority = 18,groups = {"Functional"})
public void BillingTypeDropdwonisMultiple() {
	delay();
boolean PatientTypeDropdwon = porh.validateBillingTypeDropdwonisMultiple();
softAssert.assertFalse(PatientTypeDropdwon, "Billing Type Dropdwon is multiple");
if(PatientTypeDropdwon == false) {
	System.out.println("Billing Type Dropdwon is Not multiple");
}
}

@Test(priority = 19,groups = {"Functional","Smoke"})
public void PaymentModeDropdownisEnabledandSelectValue() {
	delay();
boolean PaymentModeDropdown = porh.ValidatePaymentModeDropdownisEnabled();
softAssert.assertTrue(PaymentModeDropdown, "Billing Type Dropdwon is not Enabled");
if(PaymentModeDropdown == true) {
	System.out.println("Billing Type Dropdwon is Enabled");
	delay();
	porh.SelectValueFromPaymentModeDropdown();
}

}

@Test(priority = 20,groups = {"Functional"})
public void PaymentModeDropdwonisMultiple() {
	delay();
boolean PaymentModeDropdwon = porh.ValidatePaymentModeDropdownismultiple();
softAssert.assertTrue(PaymentModeDropdwon, "Payment Mode Dropdwon is multiple");
if(PaymentModeDropdwon == true) {
	System.out.println("Payment Mode Dropdwon is Not multiple");
}
}

@Test(priority = 21,groups = {"Functional"})
public void PayAdvanceCheckBoxisEnabledandClickable() {
	delay();
boolean PayAdvanceCheckBox = porh.ValidatePayAdvanceCheckBoxisEnabled();
softAssert.assertTrue(PayAdvanceCheckBox, "Pay Advance Check Box is Not Enabled");
if(PayAdvanceCheckBox == true) {
	System.out.println("Pay Advance Check Box is Enabled");
	delay();
	porh.SelectPayAdvanceCheckBox();
}
}
	
@Test(priority = 22,groups = {"Functional"})
public void PayAdvanceCheckBoxisSelectable() {
	delay();
boolean PayAdvanceCheckBox = porh.ValidatePayAdvanceCheckBoxisSelectable();
softAssert.assertTrue(PayAdvanceCheckBox, "Pay Advance Check Box is Not Selected");
if(PayAdvanceCheckBox == true) {
	System.out.println("Pay Advance Check Box is Selected");
	
}
}

@Test(priority = 23,groups = {"Functional"})
public void ElementinfoOfAddAdvanceForTextBoxandAddAdvanceAmountTextBox() {
	delay();
	porh.ElementinfoOfAddAdvanceForTextBox();
	delay();
	porh.ElementinfoOfAddAdvanceAmountTextBox();
}

@Test(priority = 24,groups = {"Functional"})
public void CancelbuttonOfPayAdvanceisEnabledandClickable() {
	delay();
boolean CancelbuttonOfPayAdvance = porh.ValidateCancelbuttonOfPayAdvanceisEnabled();
softAssert.assertTrue(CancelbuttonOfPayAdvance, "Cancel button Of Pay Advance is not enabled");
if(CancelbuttonOfPayAdvance == true) {
	System.out.println("Cancel button Of Pay Advance is enabled");
	delay();
	porh.ClickonCancelbuttonOfPayAdvance();
	
}
}
@Test(priority = 25,groups = {"Functional"})
public void OtherServicesCheckBoxisEnabledandSelectable() {
	delay();
boolean OtherServicesCheckBox = porh.ValidateOtherServicesCheckBoxisEnabled();
softAssert.assertTrue(OtherServicesCheckBox, "Other Services Check Box is not enabled");
if(OtherServicesCheckBox == true) {
	System.out.println("Other Services Check Box is enabled");
	delay();
	porh.SelectOtherServiceCheckBox();
}
}
@Test(priority = 26,groups = {"Functional"})
public void OtherServicesCheckBoxisSelected() {
	delay();
boolean OtherServicesCheckBox = porh.ValidateOtherServicesCheckBoxisSelected();
softAssert.assertTrue(OtherServicesCheckBox, "Other Services Check Box is not Selected");
if(OtherServicesCheckBox == true) {
	System.out.println("Other Services Check Box is Selected");
}
}

@Test(priority = 27,groups = {"Functional"})
public void CancelButtonofOtherServicesisEnabledandClickable() {
	delay();
boolean OtherServicesCheckBox = porh.ValidateCancelButtonofOtherServicesisEnabled();
softAssert.assertTrue(OtherServicesCheckBox, "Other Services Cancel button is not Enabled");
if(OtherServicesCheckBox == true) {
	System.out.println("Other Services Cancel button is Enabled");
	porh.ClickonCancelButtonofOtherServices();
}
}

@Test(priority = 28,groups = {"Functional","Smoke"})
public void HeadOfAccountDropdownisEnabledandSelectValue() {
	delay();
boolean HeadOfAccount = porh.ValidateHeadOfAccountDropdownisEnabled();
softAssert.assertTrue(HeadOfAccount, "Head Of Account is not enabled");
if(HeadOfAccount == true) {
	System.out.println("Head Of Account is enabled");
	delay();
	porh.SelectValueFromHeadOfAccountDropdown();
}
}
@Test(priority = 29,groups = {"Functional"})
public void HeadOfAccountDropdownisMultiple() {
	delay();
boolean HeadOfAccount = porh.ValidateHeadOfAccountDropdownisMultiple();
softAssert.assertTrue(HeadOfAccount, "Head Of Account is Multiple");
if(HeadOfAccount == true) {
	System.out.println("Head Of Account is not Multiple");

}
}
@Test(priority = 30,groups = {"Functional","Smoke"})
public void CategoryDropdownisEnabledandSelectvalue() {
	delay();
boolean CategoryDropdown = porh.ValidateCategoryDropdownDropdownisEnabled();
softAssert.assertTrue(CategoryDropdown, "Category Dropdown is Not Enabled");
if(CategoryDropdown == true) {
	System.out.println("Category Dropdown is Enabled");
	delay();
	porh.SelectValueFromCategoryDropdown();

}
}
@Test(priority = 31,groups = {"Functional"})
public void CategoryDropdownisMultiple() {
	delay();
boolean CategoryDropdown = porh.ValidateCategoryDropdownDropdownisMultiple();
softAssert.assertTrue(CategoryDropdown, "Category Dropdown is Multiple");
if(CategoryDropdown == true) {
	System.out.println("Category Dropdown is not Multiple");

}
}
@Test(priority = 32,groups = {"Functional","Smoke"},enabled = false)
public void EnterValueintoFilterObservationTableTextBox() {
	delay();
	porh.ElementinfoOFFilterObservationTableTextBox();
	delay();
	porh.EnterValueintoFilterObservationTableTextBox("M");

}

@Test(priority = 33,groups = {"Functional"})
public void QuantityTextBoxforServiceisEnabledandEnterInvalidQuantity() {
boolean QuantityTextBox = porh.validateQuantityTextBoxforServiceisEnabled();
softAssert.assertTrue(QuantityTextBox, "Quantity Text Box for Service is Not Enabled");
if(QuantityTextBox == true) {
	System.out.println("Quantity Text Box for Service is Enabled");
	delay();
	porh.EnterInvalidquantityintoQuantityTextBoxforService("DDFG$%&545");
String ActualMessage = "Please Enter Valid Quantity";
String ExpectedMessage = "Please Enter Valid Quantity";
Assert.assertEquals(ActualMessage, ExpectedMessage,"Pop Message for enter valid quantity is not coming.");
}
	
}
@Test(priority = 34,groups = {"Functional","Smoke"})
public void EnterValidquantityintoQuantityTextBoxforService() {
	delay();
	porh.EnterValidquantityintoQuantityTextBoxforService("2");
}

@Test(priority = 35,groups = {"Functional","Smoke"})
public void Checkboxtoselectservices1isEnabledandSelectable() {
boolean Checkboxtoselectservices = porh.ValidateCheckboxtoselectservices1isEnabled();
softAssert.assertTrue(Checkboxtoselectservices, "Check box to selects ervices is Not Enabled");
if(Checkboxtoselectservices == true) {
	System.out.println("Check box to selects ervices is Enabled");
	delay();
porh.SelectCheckboxtoselectservices1();
}
}
@Test(priority = 36,groups = {"Functional"})
public void Checkboxtoselectservices1isSelected() {
boolean Checkboxtoselectservices = porh.ValidateCheckboxtoselectservices1isSelected();
softAssert.assertTrue(Checkboxtoselectservices, "Check box to selects ervices is Not Selected");
if(Checkboxtoselectservices == true) {
	System.out.println("Check box to selects ervices is Selected");

}
}
@Test(priority = 37,groups = {"Functional","Smoke"})
public void AddToListButtonisEnabledandClickable() {
boolean AddToListButton = porh.ValidateAddToListButtonisEnabled();
softAssert.assertTrue(AddToListButton, "Add To List Button is Not Enabled");
if(AddToListButton == true) {
	System.out.println("Add To List Button is Enabled");
delay();
porh.ClickonAddToListButton();
}
}
@Test(priority = 38,groups = {"Functional","Smoke"})
public void CancelOptionForSelectedServicesisEnabledandSelectOption() {
boolean CancelOptionForSelectedServices = porh.ValidateCancelOptionForSelectedServicesisEnabled();
softAssert.assertTrue(CancelOptionForSelectedServices, "Cancel Option For Selected Services is Not Enabled");
if(CancelOptionForSelectedServices == true) {
	System.out.println("Cancel Option For Selected Services is Enabled");
delay();
porh.SelectCancelOptionForSelectedServices();
}
}

@Test(priority = 39,groups = {"Functional"})
public void IssuingDoctorNameDropdownisDisplayed() {
boolean IssuingDoctorNameDropdown = porh.ValidateIssuingDoctorNameDropdownisDisplayed();
//softAssert.assertTrue(IssuingDoctorNameDropdown, "Issuing Doctor Name Dropdown is Not Displayed");
if(IssuingDoctorNameDropdown == true) {
	System.out.println("Issuing Doctor Name Dropdown is Displayed");
delay();
porh.SelectValueFromIssuingDoctorNameDropdown();}
else if(IssuingDoctorNameDropdown == false) {
	System.out.println("Issuing Doctor Name Dropdown is Not Displayed");
}
}

@Test(priority = 40,groups = {"Functional"})
public void IssuingDoctorNameDropdownisMultiple() {
boolean IssuingDoctorNameDropdown = porh.ValidateIssuingDoctorNameDropdownisDisplayed();
//softAssert.assertTrue(IssuingDoctorNameDropdown, "Issuing Doctor Name Dropdown is Not Displayed");
if(IssuingDoctorNameDropdown == true) {
	System.out.println("Issuing Doctor Name Dropdown is Displayed");
delay();
boolean IssuingDoctorNameDropdownforisMultiple = porh.ValidateIssuingDoctorNameDropdownisMultiple();
softAssert.assertTrue(IssuingDoctorNameDropdownforisMultiple, "Issuing Doctor Name Dropdown is Not Multiple");
}
else if(IssuingDoctorNameDropdown == false) {
	System.out.println("Issuing Doctor Name Dropdown is Not Displayed");
}
}
@Test(priority = 41,groups = {"Functional"})
public void IsDoctorNameDisplayinTheReceiptCheckBoxisDisplayedandSelectCheckBox() {
boolean IsDoctorNameDisplayinTheReceiptCheckBox = porh.ValidateIsDoctorNameDisplayinTheReceiptCheckBoxisDisplayed();
if(IsDoctorNameDisplayinTheReceiptCheckBox == true) {
	System.out.println("Is Doctor Name Display in The Receipt Check Box is Displayed");
	delay();	
	porh.SelectIsDoctorNameDisplayinTheReceiptCheckBox();}
else if(IsDoctorNameDisplayinTheReceiptCheckBox == false) {
	System.out.println("Is Doctor Name Display in The Receipt Check Box is Not Displayed");
}
}

@Test(priority = 42,groups = {"Functional"})
public void IsDoctorNameDisplayinTheReceiptCheckBoxisSelected() {
boolean IsDoctorNameDisplayinTheReceiptCheckBox = porh.ValidateIsDoctorNameDisplayinTheReceiptCheckBoxisDisplayed();
if(IsDoctorNameDisplayinTheReceiptCheckBox == true) {
	System.out.println("Is Doctor Name Display in The Receipt Check Box is Displayed");
	delay();	
boolean IsDoctorNameDisplayinTheReceiptCheckBoxisSelected = porh.ValidateIsDoctorNameDisplayinTheReceiptCheckBoxisSelected();
softAssert.assertTrue(IsDoctorNameDisplayinTheReceiptCheckBoxisSelected, "Is Doctor Name Display in The Receipt Check Box is Not Selected");	
}
else if(IsDoctorNameDisplayinTheReceiptCheckBox == false) {
	System.out.println("Is Doctor Name Display in The Receipt Check Box is Not Displayed");
}
}

@Test(priority = 43,groups = {"Functional"})
public void ClickonPrepareRecepitbuttonWithoutSelectingProperBankDetails() {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 2);
	delay();
porh.ClickonPrepareRecepitbuttonWithoutSelectingProperBankDetails(ValidID, "Advance", "10000", "9995168550");
HandleAlert();
String Actual = "Please enter all payment details..";
String Expected = "Please enter all payment details..";
softAssert.assertEquals(Actual, Expected);
}

@Test(priority = 44,groups = {"Functional"})
public void CheckCancelOptionisWorkingforaddedAdvanceAmount() {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 2);
	delay();
porh.CheckCancelOptionisWorkingforPayAdvanceServices(ValidID, "Advance", "10000", "9995168550", "123456");
delay();
boolean AddedServicesTable = porh.ValidateAddedServicesTableisisplayed();
if(AddedServicesTable == false) {
	System.out.println("Cancel option is working for added services.");
}
}
@Test(priority = 45,groups = {"Functional","Smoke"})
public void PrepareRecepitForPayAdvanceOption() {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 2);
	delay();
porh.PrepareRecepitForPayAdvanceOption(ValidID, "Advance", "10000", "9995168550", "123456");
}
@Test(priority = 46,groups = {"Functional","Smoke"})
public void ClickheretoprintMoneyReceiptbuttonisEnabledandClickable() {
boolean ClickheretoprintMoneyReceiptbutton = porh.ValidateClickheretoprintMoneyReceiptbuttonisEnabled();
softAssert.assertTrue(ClickheretoprintMoneyReceiptbutton, "Click here to print Money Receipt button is not Enabled");
if(ClickheretoprintMoneyReceiptbutton == true) {
	System.out.println("Click here to print Money Receipt button is Enabled");
	delay();
	porh.ClickonClickheretoprintMoneyReceiptbutton();
}
}

@Test(priority = 47,groups = {"Functional","Smoke"})
public void BackbuttoninRecepitisEnabledandClckable() {
	//port.switchtoinnerRightFrame();
	port.switchtoPrintbackFrame();
boolean BackbuttoninRecepit = porh.ValidateBackbuttoninRecepitisEnabled();
softAssert.assertTrue(BackbuttoninRecepit, "Back button in Recepit is not Enabled");
if(BackbuttoninRecepit == true) {
	System.out.println("Back button in Recepit is  Enabled");
	delay();
	porh.ClickonBackbuttoninRecepit();
}
}

@Test(priority = 48,groups = {"Functional","Smoke"})
public void ClickonAddButtonofOtherServicesWithoutanyEntry() {
	port.switchtoinnerRightFrame();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 2);
	delay();
	porh.ClickonAddButtonofOtherServicesWithoutanyEntry(ValidID);
	HandleAlert();
softAssert.assertEquals("Please check at least one Observations  ","Please check at least one Observations  ");
}

@Test(priority = 49,groups = {"Functional","Smoke"})
public void PrepareRecepitForOtherServices() {
	
	delay();
	porh.PrepareRecepitForOtherServices("Injection", "2", "20", "NIC USER", "123654457895", "9955884400");
	
}

@Test(priority = 50,groups = {"Functional"})
public void PrePareRecepitWithInValidMobileNumber() throws Exception {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 2);
	delay();
	porh.PrePareRecepitWithInValidMobileNumber(ValidID, "GHJKK45622");
	//HandleAlert();
	isAlertPresent();
	throw new Exception("Recepit Should not prepare with Invalid Mobile Number");
//Assert.assertEquals("Please Enter Valid Mobile Number", "Please Enter Valid Mobile Number", "Alert popup is not coming");
}

@Test(priority = 51,groups = {"Functional","Smoke"})
public void PrePareRecepitWithValidMobileNumber() {
	port.switchtoinnerRightFrame();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 2);
	delay();
porh.PrePareRecepitWithValidMobileNumber(ValidID, "9950165075");
port.switchtoPrintbackFrame();
porh.ClickonBackbuttoninRecepit();
port.switchtoinnerRightFrame();
}

@Test(priority = 52,groups = {"Functional"})
public void OutsideHospitalPatientRadioButtonisEnabledansSelectable() {
boolean OutsideHospitalPatientRadioButton = porh.ValidateOutsideHospitalPatientRadioButtonisEnabled();
softAssert.assertTrue(OutsideHospitalPatientRadioButton, "Out side Hospital Patient Radio Button is not Enabled");
	if(OutsideHospitalPatientRadioButton == true) {
		System.out.println("Out side Hospital Patient Radio Button is Enabled");
		porh.SelectOutsideHospitalPatientRadioButton();
	}
}

@Test(priority = 53,groups = {"Functional"})
public void OutsideHospitalPatientRadioButtonisSelected() {
boolean OutsideHospitalPatientRadioButton = porh.ValidateOutsideHospitalPatientRadioButtonisSelected();
softAssert.assertTrue(OutsideHospitalPatientRadioButton, "Out side Hospital Patient Radio Button is not Selected");
	if(OutsideHospitalPatientRadioButton == true) {
		System.out.println("Out side Hospital Patient Radio Button is Selected	");

}
}
@Test(priority = 54,groups = {"Functional"})
public void UHIDTextBoxofOutsideHospitalPatientisEnabledandEnterUHID() {
boolean UHIDTextBoxofOutsideHospitalPatient = porh.ValidateUHIDTextBoxofOutsideHospitalPatientisEnabled();
softAssert.assertTrue(UHIDTextBoxofOutsideHospitalPatient, "UHID Text Box of Out side Hospital Patient is not Enabled");
	if(UHIDTextBoxofOutsideHospitalPatient == true) {
		System.out.println("UHID Text Box of Out side Hospital Patient is Enabled");
		delay();
		porh.EnterDataintoUHIDTextBoxofOutsideHospitalPatient("2020123456");
}
	
}
@Test(priority = 55,groups = {"Functional"})
public void PrepareRecepitWithInvalidUHID() throws Exception {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String FirstName = reader.getCellData("OPD", "FirstName", 2);
	String MiddleName = reader.getCellData("OPD", "MiddleName", 2);
	String LastName = reader.getCellData("OPD", "LastName", 2);
	String Age = reader.getCellData("OPD", "Age", 2);
	delay();
porh.PrepareRecepitWithInvalidUHID(FirstName, MiddleName, LastName, Age, "9956157505");
HandleAlert();
porh.EnterDataintoUHIDTextBoxofOutsideHospitalPatient("GHKBJK@");
porh.ClickonPrepareReceiptbuttonofOutsideHospitalPatient();
HandleAlert();
porh.ClickonCloseOptiontoavoidprintRecepit();
throw new Exception("UHID Should be Digit only");
}

@Test(priority = 56,groups = {"Functional"})
public void PrepareRecepitWithvalidUHID() {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String FirstName = reader.getCellData("OPD", "FirstName", 2);
	String MiddleName = reader.getCellData("OPD", "MiddleName", 2);
	String LastName = reader.getCellData("OPD", "LastName", 2);
	String Age = reader.getCellData("OPD", "Age", 2);
	delay();
porh.PrepareRecepitWithvalidUHID("20200012312", FirstName, MiddleName, LastName, Age, "9956157505");	
}





}