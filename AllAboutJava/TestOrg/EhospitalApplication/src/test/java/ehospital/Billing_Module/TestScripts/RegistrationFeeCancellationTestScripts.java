package ehospital.Billing_Module.TestScripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.CancelReceiptHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import ehospital.Billing_Module.helper.RegistrationFeeCancellationHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;

public class RegistrationFeeCancellationTestScripts extends BaseClass{
	RegistrationFeeCancellationHelper rfch;
	RegistrationFeeCancellationTestScripts rfct;
	PreparationOfReceiptsHelper porh;
	
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void RegistrationFeeCancellationlinkisDispalyed() {
rfch = new RegistrationFeeCancellationHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
rfct = new RegistrationFeeCancellationTestScripts();
delay();

rfct.switchtoLeftFrame();
boolean RegistrationFeeCancellationlink = rfch.ValidateRegistrationFeeCancellationlinkisDisplayed();
softAssert.assertTrue(RegistrationFeeCancellationlink, "Registration Fee Cancellation link is not Displayed");
if(RegistrationFeeCancellationlink == true) {
	System.out.println("Registration Fee Cancellation link is Displayed");
}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void RegistrationFeeCancellationlinkisEnabledandClickable() {
boolean RegistrationFeeCancellationlink = rfch.ValidateRegistrationFeeCancellationlinkisEnabled();
softAssert.assertTrue(RegistrationFeeCancellationlink, "Registration Fee Cancellation link is not Enabled");
if(RegistrationFeeCancellationlink == true) {
    System.out.println("Registration Fee Cancellation link is Enabled");
    delay();
    rfch.ClickonRegistrationFeeCancellationlink();
    rfct.switchtoinnerRightFrame();
}
}

@Test(priority = 3,groups = {"Functional"})
public void SearchCriterionexpandimageButtonisDisplayedandClickable() {
boolean SearchCriterion = rfch.ValidateSearchCriterionexpandimageButtonisDisplayed();
softAssert.assertTrue(SearchCriterion, "Search Criterion expand image Button is Not Displayed");
if(SearchCriterion == true) {
	System.out.println("Search Criterion expand image Button is Displayed");
	delay();
	rfch.ClickonSearchCriterionexpandimageButton();
boolean SearchFilterContainerBox = rfch.ValidateSearchFilterContainerBoxisEnabled();
softAssert.assertTrue(SearchFilterContainerBox, "Search Filter Container Box is Not Enabled");
}
}

@Test(priority = 4,groups = {"Functional"})
public void GetResultbuttonisEnabledandClickable() {
boolean GetResultbutton = rfch.ValidateGetResultbuttonisEnabled();
softAssert.assertTrue(GetResultbutton, "Get Result button is Not Enabled");
if(GetResultbutton == true) {
	System.out.println("Get Result button is Enabled");
	delay();
	rfch.ClickonGetResultbutton();
softAssert.assertEquals(GetAlertText(), "Please select any criteria.", "Alert Message not Matched");
HandleAlert();
}
}

@Test(priority = 5,groups = {"Functional"})
public void ContactNumberCheckboxisEnabledandSelectable() {
boolean ContactNumber = rfch.ValidateContactNumberCheckboxisEnabled();
softAssert.assertTrue(ContactNumber, "Contact Number Check Box is not Enabled");
if(ContactNumber == true) {
	System.out.println("Contact Number Check Box is Enabled");
	delay();	
	rfch.SelectContactNumberCheckbox();
	rfch.ClickonGetResultbutton();
softAssert.assertEquals(GetAlertText(), "Please enter contact no", "Aler Message are not Matched");

HandleAlert();
}
}

@Test(priority = 6,groups = {"Functional"})
public void ContactNumberCheckboxisSelected() {
boolean ContactNumber = rfch.ValidateContactNumberCheckboxisSelected();
softAssert.assertTrue(ContactNumber, "Contact Number Check Box is not Selected");
if(ContactNumber == true) {
	System.out.println("Contact Number Check Box is Selected");

}
}

@Test(priority = 7,groups = {"Functional"})
public void MobileNumberTextBoxisEnabledandEnterNumber() {
boolean MobileNumberTextBox = rfch.ValidateMobileNumberTextBoxisEnabled();
softAssert.assertTrue(MobileNumberTextBox, "Mobile Number Text Box is not Enabled");
if(MobileNumberTextBox == true) {
	System.out.println("Mobile Number Text Box is Enabled");
	delay();
	rfch.EnterValueintotheMobileNumberTextBox("9999999");
}
}

@Test(priority = 8,groups = {"Functional"})
public void ClickonResultbuttonafterEnterInvalidMobileNumber() {
	rfch.ClickonResultbuttonafterEnterInvalidMobileNumber("1234567890");
	delay();
softAssert.assertEquals(GetAlertText(), "Enter Valid Mobile Number", "Alert Pop Message is not coming");

HandleAlert();
}

@Test(priority = 9,groups = {"Functional"})
public void CheckMobileNumberMaxLenth() {
	rfch.CheckMobileNumberMaxLenth("1234567");
	delay();
softAssert.assertEquals(GetAlertText(), "Mobile Number must be 10 digit", "Alert Pop Message is not coming");
HandleAlert();
}

@Test(priority = 10,groups = {"Functional"})
public void ClickonResultbuttonafterEnterValidMobileNumber() {
	rfch.ClickonResultbuttonafterEnterValidMobileNumber("8234933653");
	delay();
boolean SearchResultInfo = rfch.ValidateSearchResultInfoBoxisDisplayed();
softAssert.assertTrue(SearchResultInfo, "Search Result Info Box is not displayed");
}

@Test(priority = 11,groups = {"Functional"})
public void SearchResultExpandbuttonisEnabledandClickable() {
boolean SearchResultExpandbutton = rfch.ValidateSearchResultExpandbuttonisEnabled();
softAssert.assertTrue(SearchResultExpandbutton, "Search Result Expand button is not Enabled");
if(SearchResultExpandbutton == true) {
	System.out.println("Search Result Expand button is Enabled");
	delay();
	rfch.ClickonSearchResultExpandbutton();
boolean SearchResultInfo = rfch.ValidateSearchResultInfoBoxisDisplayed();
softAssert.assertTrue(SearchResultInfo, "Search Result Info Box is not displayed");	
delay();
rfch.SelectContactNumberCheckbox();
}
}

@Test(priority = 12,groups = {"Functional"})
public void RangeofVisitDateCheckboxisEnabledandSelectable() {
boolean RangeofVisitDate = rfch.ValidateRangeofVisitDateCheckboxisEnabled();
softAssert.assertTrue(RangeofVisitDate, "Range of Visit Date Check Box is not Enabled");
if(RangeofVisitDate == true) {
	System.out.println("Range of Visit Date Check Box is Enabled");
	delay();	
	rfch.SelectRangeofVisitDateCheckbox();
}
}

@Test(priority = 13,groups = {"Functional"})
public void RangeofVisitDateCheckboxisSelected() {
boolean RangeofVisitDate = rfch.ValidateRangeofVisitDateCheckboxisSelected();
softAssert.assertTrue(RangeofVisitDate, "Range of Visit Date Check Box is not Selected");
if(RangeofVisitDate == true) {
	System.out.println("Range of Visit Date Check Box is Selected");
}
}

@Test(priority = 14,groups = {"Functional"})
public void dateCalenderbuttonisEnabledandClickable() {
boolean dateCalenderbutton = rfch.ValidatedateCalenderbuttonisEnabled();
softAssert.assertTrue(dateCalenderbutton,"date Calender button is not Enabled");
if(dateCalenderbutton == true) {
	System.out.println("date Calender button is Enabled");
	delay();
	rfch.clickondateCalenderbutton();
	delay();	
	rfch.SelectRangeofVisitDateCheckbox();	
}
}

@Test(priority = 15,groups = {"Functional"})
public void ClinicCheckboxisEnabledandSelectable() {
boolean ClinicCheckbox = rfch.ValidateClinicCheckboxisEnabled();
softAssert.assertTrue(ClinicCheckbox, "Clinic Check box is not Enabled");
if(ClinicCheckbox == true) {
	System.out.println("Clinic Check box is Enabled");
	delay();	
	rfch.SelectClinicCheckbox();
}
}

@Test(priority = 16,groups = {"Functional"})
public void ClinicCheckboxisSelected() {
boolean ClinicCheckbox = rfch.ValidateClinicCheckboxisSelected();
softAssert.assertTrue(ClinicCheckbox, "Clinic Check box is not Selected");
if(ClinicCheckbox == true) {
	System.out.println("Clinic Check box is Selected");
	delay();
	rfch.ClickonGetResultbutton();
	delay();
	rfch.SelectClinicCheckbox();
}
}

@Test(priority = 17,groups = {"Functional"})
public void AnyPartofNameCheckBoxisEnabledandSelectable() {
boolean AnyPartofName = rfch.ValidateAnyPartofNameCheckBoxisEnabled();
softAssert.assertTrue(AnyPartofName, "Any Part of Name Check box is not Enabled");
if(AnyPartofName == true) {
	System.out.println("Any Part of Name Check box is Enabled");
	delay();	
	rfch.SelectAnyPartofNameCheckBox();
	delay();
	rfch.ClickonGetResultbutton();
softAssert.assertEquals(GetAlertText(), "Please enter any part of Name.", "Alert Message not matched");
HandleAlert();
}
}

@Test(priority = 18,groups = {"Functional"})
public void AnyPartofNameCheckBoxisSelected() {
boolean AnyPartofName = rfch.ValidateAnyPartofNameCheckBoxisSelected();
softAssert.assertTrue(AnyPartofName, "Any Part of Name Check box is not Selected");
if(AnyPartofName == true) {
	System.out.println("Any Part of Name Check box is Selected");	
}
}

@Test(priority = 19,groups = {"Functional"})
public void AnyPartofNameTextBoxisEnabledandEnterInvalidName() {
boolean AnyPartofName = rfch.ValidateAnyPartofNameTextBoxisEnabled();
softAssert.assertTrue(AnyPartofName, "Any Part of Name Text box is not Enabled");
if(AnyPartofName == true) {
	System.out.println("Any Part of Name Text box is Enabled");
	rfch.EnterInvalidNameintotheAnyPartofNameTextBox("455556646464");
softAssert.assertEquals(GetAlertText(), "Enter Valid Any Part of the Name", "Alert PopUp Message is not coming");
HandleAlert();
}
}

@Test(priority = 20,groups = {"Functional"})
public void AnyPartofNameTextBoxisEnabledandEnterValidName() {
boolean AnyPartofName = rfch.ValidateAnyPartofNameTextBoxisEnabled();
softAssert.assertTrue(AnyPartofName, "Any Part of Name Text box is not Enabled");
if(AnyPartofName == true) {
	System.out.println("Any Part of Name Text box is Enabled");
	rfch.EnterValidNameintotheAnyPartofNameTextBox("NIC");
	longDelay();
	rfch.SelectAnyPartofNameCheckBox();
}
}

@Test(priority = 21,groups = {"Functional","Smoke"})
public void UHIDcheckBoxisEnabledandSelectable() {
boolean UHIDcheckBox = rfch.ValidateUHIDcheckBoxisEnabled();
softAssert.assertTrue(UHIDcheckBox, "UHID check Box is not Enabled");
if(UHIDcheckBox == true) {
	System.out.println("UHID check Box is Enabled");
	rfch.SelectUHIDcheckBox();
	delay();
	rfch.ClickonGetResultbutton();
softAssert.assertEquals(GetAlertText(), "Please enter a valid UHID.", "Alert Message not matched");
HandleAlert();	
}
}

@Test(priority = 22,groups = {"Functional"})
public void UHIDcheckBoxisSelected() {
boolean AnyPartofName = rfch.ValidateUHIDcheckBoxisSelected();
softAssert.assertTrue(AnyPartofName, "UHID check Box is not Selected");
if(AnyPartofName == true) {
	System.out.println("UHID check Box is Selected");	
}
}

@Test(priority = 23,groups = {"Functional"})
public void UHIDTextBoxisEnabledandEnterInvalidID() {
boolean UHIDTextBox = rfch.ValidateUHIDTextBoxisEnabled();
softAssert.assertTrue(UHIDTextBox, "UHID Text Box is not Enabled");
if(UHIDTextBox == true) {
	System.out.println("UHID Text Box is Enabled");
	rfch.EnterInvalididintotheUHIDTextBox("$%^&JHJJHJJ");
softAssert.assertEquals(GetAlertText(), "Enter Valid UHID", "Alert PopUp Message is not coming");
HandleAlert();
}
}

@Test(priority = 24,groups = {"Functional","Smoke"})
public void UHIDTextBoxisEnabledandEnterValidID() {
boolean UHIDTextBox = rfch.ValidateUHIDTextBoxisEnabled();
softAssert.assertTrue(UHIDTextBox, "UHID Text Box is not Enabled");
if(UHIDTextBox == true) {
	System.out.println("UHID Text Box is Enabled");
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 4);
	delay();
	rfch.EnterValididintotheUHIDTextBox(ValidID);
}
}

@Test(priority = 25,groups = {"Functional","Smoke"})
public void SelectbuttonisEnabledandClickable() {
boolean Selectbutton = rfch.ValidateSelectbuttonisEnabled();
softAssert.assertTrue(Selectbutton, "Select button is Not Enabled");
if(Selectbutton == true) {
	System.out.println("Select button is Enabled");
	delay();
	rfch.ClickonSelectbutton();
	longDelay();
}
}

@Test(priority = 26,groups = {"Functional","Smoke"})
public void CancelRegistrationFeebuttonisEnabledandClickable() {
boolean CancelRegistrationFee = rfch.ValidateCancelRegistrationFeebuttonisEnabled();
softAssert.assertTrue(CancelRegistrationFee, "Cancel Registration Fee button is Not Enabled");
if(CancelRegistrationFee == true) {
	System.out.println("Cancel Registration Fee button is Enabled");
	delay();
	rfch.ClickonCancelRegistrationFeebutton();
softAssert.assertEquals(GetAlertText(), "Please Enter Reason for Updation...", "Alert PopUp Message is not coming");
HandleAlert();
//rfch.VerifyPatientinfoData();
}
}

@Test(priority = 27,groups = {"Functional","Smoke"})
public void RemarksTextAreaisEnabledandEnterText() {
boolean RemarksTextArea = rfch.ValidateRemarksTextAreaisEnabled();
softAssert.assertTrue(RemarksTextArea, "Remarks Text Area is Not Enabled");
if(RemarksTextArea == true) {
	System.out.println("Remarks Text Area is Enabled");
	delay();
	rfch.EnterTextintoRemarksTextArea("Reason Entered by NIC Tester ");
}
}

@Test(priority = 28,groups = {"Functional"})
public void RegistrationFeeTextboxisEnabledandEnterInvalidFee() {
boolean RegistrationFee = rfch.ValidateRegistrationFeeTextboxisEnabled();
softAssert.assertTrue(RegistrationFee, "Registration Fee Text Box is Not Enabled");
if(RegistrationFee == true) {
	System.out.println("Registration Fee Text Box is Enabled");
	delay();
	rfch.EnterInvalidFeeintoRegistrationFeeTextbox("$%^GGHBB");
HandleAlert();
delay();
softAssert.assertEquals(GetAlertText(), "Please Enter Valid fee Details", "Popup message is not Matched");
delay();
HandleAlert();

}
}

@Test(priority = 29,groups = {"Functional","Smoke"})
public void RegistrationFeeTextboxisEnabledandEnterValidFee() throws InterruptedException {
boolean RegistrationFee = rfch.ValidateRegistrationFeeTextboxisEnabled();
softAssert.assertTrue(RegistrationFee, "Registration Fee Text Box is Not Enabled");
if(RegistrationFee == true) {
	System.out.println("Registration Fee Text Box is Enabled");
	delay();
	rfch.EnterValidFeeintoRegistrationFeeTextbox("0");
HandleAlert();
Thread.sleep(15000);
softAssert.assertEquals(GetAlertText(), "Fee Updation done...", "Popup message is not Matched");
HandleAlert();
delay();
rfch.SelectUHIDcheckBox();
delay();
Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

String ValidID = reader.getCellData("OPD", "UHID", 4);
delay();
rfch.EnterValididintotheUHIDTextBox(ValidID);
delay();
rfch.PatientDetailofSearchPageforVerification();
delay();
rfch.ClickonSelectbutton();
longDelay();
boolean FeeUpdationMessage = rfch.ValidateFeeUpdationMessageisDisplayed();
softAssert.assertTrue(FeeUpdationMessage, "Fee Updation Message is Not displayed");
delay();
rfch.PatientDetailofRegistrationFeeUpdationforVerification();
}
}

@Test(priority = 30,groups = {"Functional","Smoke"})
public void ReSearchbuttonisEnabledandClickable() {
boolean ReSearchbutton = rfch.ValidateReSearchbuttonisEnabled();
softAssert.assertTrue(ReSearchbutton, "ReSearch button is not Enabled");
if(ReSearchbutton == true) {
	System.out.println("ReSearch button is Enabled");
delay();
rfch.ClickonReSearchbutton();
boolean SearchFilterContainerBox = rfch.ValidateSearchFilterContainerBoxisEnabled();
softAssert.assertTrue(SearchFilterContainerBox, "Search Filter Container Box is Not Enabled");
}
delay();
//rfch.VerifyPatientinfoData();

}




}
