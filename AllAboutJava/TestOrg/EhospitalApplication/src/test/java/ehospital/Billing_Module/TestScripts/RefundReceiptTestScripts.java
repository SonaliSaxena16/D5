package ehospital.Billing_Module.TestScripts;

import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import ehospital.Billing_Module.helper.RateConfigurationofServicesHelper;
import ehospital.Billing_Module.helper.RefundReceiptHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;
import junit.framework.Assert;

public class RefundReceiptTestScripts extends BaseClass {
	RefundReceiptHelper rrh;
	RefundReceiptTestScripts rrt;
	PreparationOfReceiptsHelper porh;
	
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void BillingRefundRecepitisDispalyed() {
rrh = new RefundReceiptHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
rrt = new RefundReceiptTestScripts();
delay();

rrt.switchtoLeftFrame();
boolean RefundReceiptlink = rrh.ValidateRefundReceiptlinkisDisplayed();
softAssert.assertTrue(RefundReceiptlink, "Refund dReceipt link is not displayed");
if(RefundReceiptlink == true) {
	System.out.println("Refund dReceipt link is displayed");
}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void BillingRefundRecepitisEnabledandClickable() {
boolean RefundReceiptlink = rrh.ValidateRefundReceiptlinkisEnabled();
softAssert.assertTrue(RefundReceiptlink, "Refund dReceipt link is not Enabled");
if(RefundReceiptlink == true) {
	System.out.println("Refund dReceipt link is Enabled");
	delay();
	rrh.ClickonRefundReceiptlink();
	delay();
	rrt.switchtoinnerRightFrame();

}
}

@Test(priority = 3,groups = {"Functional","Smoke"})
public void HeadofAccountDropdownisEnabledandSelectValue() {
boolean HeadofAccountDropdown = rrh.ValidateHeadofAccountDropdownisEnabled();
softAssert.assertTrue(HeadofAccountDropdown, "Head of Account Dropdown is not Enabled");
if(HeadofAccountDropdown == true) {
	System.out.println("Head of Account Dropdown is Enabled");
	delay();
	rrh.SelectValueFromtheDropdown();
}
}

@Test(priority = 4,groups = {"Functional"})
public void HeadofAccountDropdownisMultiple() {
boolean HeadofAccountDropdown = rrh.ValidateHeadofAccountDropdownisMultiple();
softAssert.assertTrue(HeadofAccountDropdown, "Head of Account Dropdown is  Multiple");
if(HeadofAccountDropdown == false) {
	System.out.println("Head of Account Dropdown is Not Multiple");
}
}

@Test(priority = 5,groups = {"Functional"})
public void DateRadioButtonisEnabledandSelectable() {
boolean DateRadioButton = rrh.ValidateDateRadioButtonisEnabled();
softAssert.assertTrue(DateRadioButton, "Date Radio Button is not enabled");
if(DateRadioButton == true) {
	System.out.println("Date Radio Button is enabled");
	delay();
	rrh.SelectDateRadioButton();
}
}

@Test(priority = 6,groups = {"Functional"})
public void DateRadioButtonisSelected() {
boolean DateRadioButton = rrh.ValidateDateRadioButtonisSelected();
softAssert.assertTrue(DateRadioButton, "Date Radio Button is not Selected");
if(DateRadioButton == true) {
	System.out.println("Date Radio Button is Selected");
}
}

@Test(priority = 7,groups = {"Functional"})
public void CalenderImageisDisplayedandClickable() {
boolean CalenderImage = rrh.ValidateCalenderImageisDisplayed();
softAssert.assertTrue(CalenderImage, "Calender Image is not Displayed");
if(CalenderImage == true) {
	System.out.println("Calender Image is Displayed");
	delay();
	rrh.ClickonCalenderImage();
}	
}

@Test(priority = 8,groups = {"Functional"})
public void TodayoptioninCalenderImageisEnabledandClickable() {
boolean TodayoptioninCalenderImage = rrh.ValidateTodayoptioninCalenderImageisEnabled();
softAssert.assertTrue(TodayoptioninCalenderImage, "Today option in Calender Image is not Enabled");
if(TodayoptioninCalenderImage == true) {
	System.out.println("Today option in Calender Image is Enabled");
	delay();
	rrh.ClickonTodayoptioninCalenderImage();
}
}

@Test(priority = 9,groups = {"Functional"})
public void GetSearchresultbuttonisEnabledandClickable() {
boolean GetSearchresultbutton = rrh.ValidateGetSearchresultbuttonisEnabled();
softAssert.assertTrue(GetSearchresultbutton, "Get Search result button is not Enabled");
if(GetSearchresultbutton == true) {
	System.out.println("Get Search result button is Enabled");
	delay();
	rrh.ClickonGetSearchresultbutton();
}
}

@Test(priority = 10,groups = {"Functional"})
public void SelectbuttonisEnabledandClickable() {
boolean Selectbutton = rrh.ValidateSelectbuttonisEnabled();
softAssert.assertTrue(Selectbutton, "Select button is Not Enabled");
if(Selectbutton == true) {
	System.out.println("Select button is Enabled");
	delay();
	rrh.ClickonSelectbutton();
}
}

@Test(priority = 11,groups = {"Functional"})
public void CancelbuttonisEnabledandClickable() {
boolean Selectbutton = rrh.ValidateCancelbuttonisEnabled();
softAssert.assertTrue(Selectbutton, "Cancel button is Not Enabled");
if(Selectbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	rrh.ClickonCancelbutton();
}
}

@Test(priority = 12,groups = {"Functional","Smoke"})
public void UHIDRadiobuttonisEnabledandClickbale() {
boolean UHIDRadiobutton = rrh.ValidateUHIDRadiobuttonisEnabled();
softAssert.assertTrue(UHIDRadiobutton, "UHID Radio button is not Enabled");
if(UHIDRadiobutton == true) {
	System.out.println("UHID Radio button is Enabled");
	delay();
	rrh.SelectUHIDRadiobutton();
}
}

@Test(priority = 13,groups = {"Functional"})
public void UHIDRadiobuttonisSelected() {
boolean UHIDRadiobutton = rrh.ValidateUHIDRadiobuttonisSelected();
softAssert.assertTrue(UHIDRadiobutton, "UHID Radio button is not Selected");
if(UHIDRadiobutton == true) {
	System.out.println("UHID Radio button is Selected");
}
}

@Test(priority = 14,groups = {"Functional","Smoke"})
public void CashbookDropdownisEnabledandSelectable() {
boolean CashbookDropdown = rrh.ValidateCashbookDropdownisEnabled();
softAssert.assertTrue(CashbookDropdown, "Cashbook Dropdown is not Enabled");
if(CashbookDropdown == true) {
	System.out.println("Cashbook Dropdown is Enabled");
	delay();
	rrh.SelectValueFromCashbookDropdown();
}
}

@Test(priority = 15,groups = {"Functional"})
public void CashbookDropdownisMultiple() {
boolean CashbookDropdown = rrh.ValidateCashbookDropdownisMultiple();
softAssert.assertTrue(CashbookDropdown, "Cashbook Dropdown is Multiple");
if(CashbookDropdown == false) {
	System.out.println("Cashbook Dropdown is Not Multiple");
}
}

@Test(priority = 16,groups = {"Functional","Smoke"})
public void GetSearchresultbuttonofUHIDFilterisEnabledandClickable() {
boolean GetSearchresultbutton = rrh.ValidateGetSearchresultbuttonofUHIDateRecepitNoFilterisEnabled();
softAssert.assertTrue(GetSearchresultbutton, "Get Search result button is not Enabled");
if(GetSearchresultbutton == true) {
	System.out.println("Get Search result button is Enabled");
	delay();
	rrh.ClickonGetSearchresultbuttonofUHIDateRecepitNoFilter();
	HandleAlert();
Assert.assertEquals("Pop Up Alert Message's not matched", "Please Enter UHID Number","Please Enter UHID Number");
}
}

@Test(priority = 17,groups = {"Functional"})
public void ClickonSerchbuttonWithInvalidUHID() {
rrh.ClickonSerchbuttonWithInvalidUHID("DFGHJ!@#");
softAssert.assertEquals(" No record found!!! ", "Please Enter a Valid UHID","Alert PopUp Message is not coming");
}

@Test(priority = 18,groups = {"Functional"})
public void CheckPatientIDMaxlength() {
rrh.CheckPatientIDMaxlength("2020005");
softAssert.assertEquals(" No record found!!! ", "UHID must be 11 digits","Alert PopUp Message is not coming");
}

@Test(priority = 19,groups = {"Functional","Smoke"})
public void clickonGetSearchResultbuttonwithvalidUHID() {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String validUHID = reader.getCellData("OPD", "UHID", 2);
	delay();

rrh.clickonGetSearchResultbuttonwithvalidUHID(validUHID);
boolean PatientinfoTable = rrh.PatientinfoTableisDisplayed();
if(PatientinfoTable == true) {
	delay();
rrh.ClickonSelectbutton();

}
}

@Test(priority = 20,groups = {"Functional","Smoke"})
public void FirstCheckboxtoSelectServiceisEnabledandClickable() {
boolean CheckboxtoSelectService = rrh.ValidateFirstCheckboxtoSelectServiceisEnabled();
softAssert.assertTrue(CheckboxtoSelectService, "Check box to Select Service is Not Enabled");
if(CheckboxtoSelectService == true) {
	System.out.println("Check box to Select Service is Enabled");
	delay();
	rrh.SelectFirstCheckboxtoSelectService();
}
}

@Test(priority = 21,groups = {"Functional"})
public void FirstCheckboxtoSelectServiceisSelected() {
boolean CheckboxtoSelectService = rrh.ValidateFirstCheckboxtoSelectServiceisSelected();
softAssert.assertTrue(CheckboxtoSelectService, "Check box to Select Service is Selected");
if(CheckboxtoSelectService == false) {
	System.out.println("Check box to Select Service is Not Selected");
}
}

@Test(priority = 22,groups = {"Functional"})
public void GrossAmountTextBoxisEnabledandEnterAmount() throws Exception {
boolean GrossAmount = rrh.ValidateGrossAmountTextBoxisEnabled();
softAssert.assertTrue(GrossAmount, "Gross Amount Text Box is Enabled");
if(GrossAmount == true) {
	System.out.println("Gross Amount Text is Enabled");
	delay();
	rrh.EnterAmountintoGrossAmountTextBox("250");
	throw new Exception("Gross Amount Text Box Should not be Enabled");
}else if(GrossAmount == false){
	System.out.println("Gross Amount Text is Not Enabled");
}
}

@Test(priority = 23,groups = {"Functional","Smoke"})
public void DisscountAmountTextBoxisEnabledandEnterAmount() throws Exception {
boolean DisscountAmount = rrh.ValidateDisscountAmountTextBoxisEnabled();
softAssert.assertTrue(DisscountAmount, "Disscount Amount Text Box is Enabled");
if(DisscountAmount == true) {
	System.out.println("Disscount Amount Text is Enabled");
	delay();
	rrh.EnterAmountintoDisscountAmountTextBox("250");
	throw new Exception("Disscount Amount Text Box Should not be Enabled");
}else if(DisscountAmount == false){
	System.out.println("Disscount Amount Text is Not Enabled");
}
}

@Test(priority = 24,groups = {"Functional","Smoke"})
public void NetAmountTextBoxisEnabledandEnterAmount() throws Exception {
boolean NetAmount = rrh.ValidateNetAmountTextBoxisEnabled();
softAssert.assertTrue(NetAmount, "Net Amount Text Box is Enabled");
if(NetAmount == true) {
	System.out.println("Net Amount Text is Enabled");
	delay();
	rrh.EnterAmountintoNetAmountTextBox("250");
	throw new Exception("Net Amount Text Box Should not be Enabled");
}else if(NetAmount == false){
	System.out.println("Net Amount Text is Not Enabled");
}
}

@Test(priority = 25,groups = {"Functional","Smoke"})
public void TotalRefundAmountTextBoxisEnabledandEnterAmount() throws Exception {
boolean TotalRefundAmount = rrh.ValidateGrossAmountTextBoxisEnabled();
softAssert.assertTrue(TotalRefundAmount, "Total Refund Amount Text Box is Enabled");
if(TotalRefundAmount == true) {
	System.out.println("Total Refund Amount Text Box is Enabled");
	delay();
	rrh.EnterAmountintoGrossAmountTextBox("250");
	throw new Exception("Total Refund Amount Text Box Should not be Enabled");
}else if(TotalRefundAmount == false){
	System.out.println("Total Refund Amount Text Box is Not Enabled");
}
}

@Test(priority = 26,groups = {"Functional","Smoke"},enabled = false)
public void RefundAmountTextBoxisEnabledandEnterInvalidAmount() {
boolean RefundAmount = rrh.ValidateRefundAmountTextBoxisEnabled();
softAssert.assertTrue(RefundAmount, "Refund Amount Text box is Not Enabled");
if(RefundAmount == true) {
	System.out.println("Refund Amount Text box is Enabled");
	delay();
rrh.EnterInValidAmountintotheRefundAmountTextBox("1000");
softAssert.assertEquals(GetAlertText(), "Refund Amount Cannot Exceed Net Amount...", "Alert Message is not matched.");
HandleAlert();
}
}

@Test(priority = 27,groups = {"Functional","Smoke"},enabled = false)
public void RefundAmountTextBoxisEnabledandEntervalidAmount() {
boolean RefundAmount = rrh.ValidateRefundAmountTextBoxisEnabled();
softAssert.assertTrue(RefundAmount, "Refund Amount Text box is Not Enabled");
if(RefundAmount == true) {
System.out.println("Refund Amount Text box is Enabled");
delay();
rrh.EnterValidAmountintotheRefundAmountTextBox("250");
}
}

@Test(priority = 28,groups = {"Functional","Smoke"})
public void RemarksTextBoxisEnabledandEnterRemarks() {
boolean Remarks = rrh.ValidateRemarksTextBoxisEnabled();
softAssert.assertTrue(Remarks, "Remarks Text box is not Enabled");
if(Remarks == true) {
System.out.println("Remarks Text box is Enabled");
delay();
rrh.EnterRemarksintoRemarksTextBox("NIC Tester Testing Remarks Field");
}
}

@Test(priority = 29,groups = {"Functional","Smoke"})
public void RefundBillButtonisEnabledandClickable() {
boolean RefundBill = rrh.ValidateRefundBillButtonisEnabled();
softAssert.assertTrue(RefundBill, "Refund Bill Button is Not Enabled");
if(RefundBill == true) {
	System.out.println("Refund Bill Button is Enabled");
	delay();
	rrh.RefundRecepitEntryforminfoforVerification();
	delay();
	rrh.ClickonRefundBillButton();
softAssert.assertEquals(GetAlertText(), "Are you sure you wish to continue?", "Alert Message not Matched");
HandleAlert();
delay();
HandleAlert();
longDelay();
rrt.switchtoPrintPageFrame();
delay();
//rrh.RefundRecepitPrintoutinfoforVerification();
//rrh.VerifyRefundRecepitData();
delay();
rrt.switchtoPrintbackFrame();
delay();
porh.ClickonBackbuttoninRecepit();
rrt.switchtoinnerRightFrame();
}
}

@Test(priority = 30,groups = {"Functional","Smoke"})
public void RecepitNoRadiobuttonisEnabledandSelectable() {
boolean RecepitNo = rrh.ValidateRecepitNoRadiobuttonisEnabled();
softAssert.assertTrue(RecepitNo, "Recepit No. Radio button is not enabled");
if(RecepitNo == true) {
	System.out.println("Recepit No. Radio button is enabled");
	delay();
	rrh.SelectRecepitNoRadiobutton();
}
}

@Test(priority = 31,groups = {"Functional"})
public void RecepitNoRadiobuttonisSelectable() {
boolean RecepitNo = rrh.ValidateRecepitNoRadiobuttonisSelected();
softAssert.assertTrue(RecepitNo, "Recepit No. Radio button is not Selected");
if(RecepitNo == true) {
	System.out.println("Recepit No. Radio button is Selected");
}
}

@Test(priority = 32,groups = {"Functional"})
public void ClickonSerchbuttonWithInvalidRecepitNo() {
rrh.ClickonSerchbuttonWithInvalidRecepitNo("DFGHJ!@#");
softAssert.assertEquals(" No record found!!! ", "Please Enter a Valid Receipt Number","Alert PopUp Message is not coming");
}

@Test(priority = 33,groups = {"Functional","Smoke"})
public void ClickonSerchbuttonWithvalidRecepitNo() {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String validRecepitNumber = reader.getCellData("OPD", "RecepitNumber", 2);
	delay();

rrh.ClickonSerchbuttonWithvalidRecepitNo(validRecepitNumber);
boolean PatientinfoTable = rrh.PatientinfoTableisDisplayed();
if(PatientinfoTable == true) {
	System.out.println("Patient Info Table is displayed");
	
}
delay();
//rrh.VerifyRefundRecepitData();

}


}