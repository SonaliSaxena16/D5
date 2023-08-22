package ehospital.Billing_Module.TestScripts;

import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.CancelReceiptHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import ehospital.Billing_Module.helper.RefundReceiptHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;
import junit.framework.Assert;

public class CancelReceiptTestScripts extends BaseClass {
	CancelReceiptHelper crh;
	CancelReceiptTestScripts crt;
	PreparationOfReceiptsHelper porh;
	
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void CancelReceiptlinkisDispalyed() {
crh = new CancelReceiptHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
crt = new CancelReceiptTestScripts();
delay();

crt.switchtoLeftFrame();
boolean CancelReceiptlink = crh.ValidateCancelReceiptlinkisDisplayed();
softAssert.assertTrue(CancelReceiptlink, "Cancel Receipt link is not displayed");
if(CancelReceiptlink == true) {
	System.out.println("Cancel Receipt link is displayed");
}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void CancelReceiptlinkisEnabledandClickable() {
boolean CancelReceiptlink = crh.ValidateCancelReceiptlinkisEnabled();
softAssert.assertTrue(CancelReceiptlink, "Cancel Receipt link is not Enabled");
if(CancelReceiptlink == true) {
	System.out.println("Cancel Receipt link is Enabled");
	delay();
	crh.ClickonCancelReceiptlink();
	delay();
	crt.switchtoinnerRightFrame();
}
}

@Test(priority = 3,groups = {"Functional","Smoke"})
public void HeadofAccountDropdownisEnabledandSelectValue() {
boolean HeadofAccountDropdown = crh.ValidateHeadofAccountDropdownisEnabled();
softAssert.assertTrue(HeadofAccountDropdown, "Head of Account Dropdown is not Enabled");
if(HeadofAccountDropdown == true) {
	System.out.println("Head of Account Dropdown is Enabled");
	delay();
	crh.SelectValueFromtheDropdown();
}
}

@Test(priority = 4,groups = {"Functional"})
public void HeadofAccountDropdownisMultiple() {
boolean HeadofAccountDropdown = crh.ValidateHeadofAccountDropdownisMultiple();
softAssert.assertTrue(HeadofAccountDropdown, "Head of Account Dropdown is  Multiple");
if(HeadofAccountDropdown == false) {
	System.out.println("Head of Account Dropdown is Not Multiple");
}
}

@Test(priority = 5,groups = {"Functional"})
public void DateRadioButtonisEnabledandSelectable() {
boolean DateRadioButton = crh.ValidateDateRadioButtonisEnabled();
softAssert.assertTrue(DateRadioButton, "Date Radio Button is not enabled");
if(DateRadioButton == true) {
	System.out.println("Date Radio Button is enabled");
	delay();
	crh.SelectDateRadioButton();
}
}

@Test(priority = 6,groups = {"Functional"})
public void DateRadioButtonisSelected() {
boolean DateRadioButton = crh.ValidateDateRadioButtonisSelected();
softAssert.assertTrue(DateRadioButton, "Date Radio Button is not Selected");
if(DateRadioButton == true) {
	System.out.println("Date Radio Button is Selected");
}
}

@Test(priority = 7,groups = {"Functional"})
public void CalenderImageisDisplayedandClickable() {
boolean CalenderImage = crh.ValidateCalenderImageisDisplayed();
softAssert.assertTrue(CalenderImage, "Calender Image is not Displayed");
if(CalenderImage == true) {
	System.out.println("Calender Image is Displayed");
	delay();
	crh.ClickonCalenderImage();
}	
}

@Test(priority = 8,groups = {"Functional"})
public void TodayoptioninCalenderImageisEnabledandClickable() {
boolean TodayoptioninCalenderImage = crh.ValidateTodayoptioninCalenderImageisEnabled();
softAssert.assertTrue(TodayoptioninCalenderImage, "Today option in Calender Image is not Enabled");
if(TodayoptioninCalenderImage == true) {
	System.out.println("Today option in Calender Image is Enabled");
	delay();
	crh.ClickonTodayoptioninCalenderImage();
}
}

@Test(priority = 9,groups = {"Functional"})
public void GetSearchresultbuttonisEnabledandClickable() {
boolean GetSearchresultbutton = crh.ValidateGetSearchresultbuttonisEnabled();
softAssert.assertTrue(GetSearchresultbutton, "Get Search result button is not Enabled");
if(GetSearchresultbutton == true) {
	System.out.println("Get Search result button is Enabled");
	delay();
	crh.ClickonGetSearchresultbutton();
}
}

@Test(priority = 10,groups = {"Functional","Smoke"})
public void UHIDRadiobuttonisEnabledandClickbale() {
boolean UHIDRadiobutton = crh.ValidateUHIDRadiobuttonisEnabled();
softAssert.assertTrue(UHIDRadiobutton, "UHID Radio button is not Enabled");
if(UHIDRadiobutton == true) {
	System.out.println("UHID Radio button is Enabled");
	delay();
	crh.SelectUHIDRadiobutton();
}
}

@Test(priority = 11,groups = {"Functional"})
public void UHIDRadiobuttonisSelected() {
boolean UHIDRadiobutton = crh.ValidateUHIDRadiobuttonisSelected();
softAssert.assertTrue(UHIDRadiobutton, "UHID Radio button is not Selected");
if(UHIDRadiobutton == true) {
	System.out.println("UHID Radio button is Selected");
}
}

@Test(priority = 12,groups = {"Functional","Smoke"})
public void CashbookDropdownisEnabledandSelectable() {
boolean CashbookDropdown = crh.ValidateCashbookDropdownisEnabled();
softAssert.assertTrue(CashbookDropdown, "Cashbook Dropdown is not Enabled");
if(CashbookDropdown == true) {
	System.out.println("Cashbook Dropdown is Enabled");
	delay();
	crh.SelectValueFromCashbookDropdown();
}
}

@Test(priority = 13,groups = {"Functional"})
public void CashbookDropdownisMultiple() {
boolean CashbookDropdown = crh.ValidateCashbookDropdownisMultiple();
softAssert.assertTrue(CashbookDropdown, "Cashbook Dropdown is Multiple");
if(CashbookDropdown == false) {
	System.out.println("Cashbook Dropdown is Not Multiple");
}
}

@Test(priority = 14,groups = {"Functional","Smoke"})
public void GetSearchresultbuttonofUHIDFilterisEnabledandClickable() {
boolean GetSearchresultbutton = crh.ValidateGetSearchresultbuttonofUHIDateRecepitNoFilterisEnabled();
softAssert.assertTrue(GetSearchresultbutton, "Get Search result button is not Enabled");
if(GetSearchresultbutton == true) {
	System.out.println("Get Search result button is Enabled");
	delay();
	crh.ClickonGetSearchresultbuttonofUHIDateRecepitNoFilter();
	HandleAlert();
Assert.assertEquals("Pop Up Alert Message's not matched", "Please Enter UHID Number","Please Enter UHID Number");
}
}

@Test(priority = 15,groups = {"Functional"})
public void ClickonSerchbuttonWithInvalidUHID() {
crh.ClickonSerchbuttonWithInvalidUHID("DFGHJ!@#");
softAssert.assertEquals(" No record found!!! ", "Please Enter a Valid UHID","Alert PopUp Message is not coming");
}

@Test(priority = 16,groups = {"Functional"})
public void CheckPatientIDMaxlength() {
crh.CheckPatientIDMaxlength("2020005");
softAssert.assertEquals(" No record found!!! ", "UHID must be 11 digits","Alert PopUp Message is not coming");
}

@Test(priority = 17,groups = {"Functional","Smoke"})
public void clickonGetSearchResultbuttonwithvalidUHID() {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String validUHID = reader.getCellData("OPD", "UHID", 2);
	delay();

crh.clickonGetSearchResultbuttonwithvalidUHID(validUHID);
boolean PatientinfoTable = crh.PatientinfoTableisDisplayed();
if(PatientinfoTable == true) {
	delay();
System.out.println("Patient info table is dispalyed");
}
}

@Test(priority = 18,groups = {"Functional","Smoke"})
public void SelectbuttonisEnabledandClickable() {
boolean Selectbutton = crh.ValidateSelectbuttonisEnabled();
softAssert.assertTrue(Selectbutton, "Select button is not Enabled");
if(Selectbutton == true) {
	System.out.println("Select button is Enabled");
	delay();
	crh.ClickonSelectbutton();
	HandleAlert();
}
}

@Test(priority = 19,groups = {"Functional","Smoke"})
public void ReasonForCancellationTextBoxisEnabledandEnterResult() {
boolean ReasonForCancellation = crh.ValidateReasonForCancellationTextBoxisEnabled();
softAssert.assertTrue(ReasonForCancellation, "Reason For Cancellation Text Box is Not Enabled ");
if(ReasonForCancellation == true) {
	System.out.println("Reason For Cancellation Text Box is Enabled");
	delay();
crh.EnterReasonIntotheReasonForCancellationTextBox("NIC Tester testing Cancel recepit functionality");
}
}

@Test(priority = 20,groups = {"Functional","Smoke"})
public void CancelReceiptButtonisenabledandClickable() {
boolean CancelReceiptButton = crh.ValidateCancelReceiptButtonisenabled();
softAssert.assertTrue(CancelReceiptButton, "Cancel Receipt Button is Not Enabled");
if(CancelReceiptButton == true) {
	System.out.println("Cancel Receipt Button is Enabled");
	delay();
crh.ClickonCancelReceiptButton();
delay();
Assert.assertEquals("PopUp Message Not Matched!...", "Receipt Cancelled...", GetAlertText());
delay();
HandleAlert();
}
}

@Test(priority = 21,groups = {"Functional","Smoke"})
public void RecepitNoRadiobuttonisEnabledandSelectable() {
boolean RecepitNo = crh.ValidateRecepitNoRadiobuttonisEnabled();
softAssert.assertTrue(RecepitNo, "Recepit No. Radio button is not enabled");
if(RecepitNo == true) {
	System.out.println("Recepit No. Radio button is enabled");
	delay();
	crh.SelectRecepitNoRadiobutton();
}
}

@Test(priority = 22,groups = {"Functional"})
public void RecepitNoRadiobuttonisSelectable() {
boolean RecepitNo = crh.ValidateRecepitNoRadiobuttonisSelected();
softAssert.assertTrue(RecepitNo, "Recepit No. Radio button is not Selected");
if(RecepitNo == true) {
	System.out.println("Recepit No. Radio button is Selected");
}
}

@Test(priority = 23,groups = {"Functional"})
public void ClickonSerchbuttonWithInvalidRecepitNo() {
crh.ClickonSerchbuttonWithInvalidRecepitNo("DFGHJ!@#");
softAssert.assertEquals(" No record found!!! ", "Please Enter a Valid Receipt Number","Alert PopUp Message is not coming");
}

@Test(priority = 24,groups = {"Functional","Smoke"})
public void ClickonSerchbuttonWithvalidRecepitNo() {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String validRecepitNumber = reader.getCellData("OPD", "RecepitNumber", 2);
	delay();

crh.ClickonSerchbuttonWithvalidRecepitNo(validRecepitNumber);
boolean PatientinfoTable = crh.PatientinfoTableisDisplayed();
if(PatientinfoTable == true) {
	System.out.println("Patient Info Table is displayed");
}
}






}