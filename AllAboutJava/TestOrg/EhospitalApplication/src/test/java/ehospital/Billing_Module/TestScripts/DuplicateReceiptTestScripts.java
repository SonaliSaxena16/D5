package ehospital.Billing_Module.TestScripts;

import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.DuplicateReceiptHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;
import junit.framework.Assert;

public class DuplicateReceiptTestScripts extends BaseClass {
	DuplicateReceiptHelper drh;
	DuplicateReceiptTestScripts drt;
	PreparationOfReceiptsHelper porh;
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void DuplicateRecepitlinkisDisplayed() {
drh = new DuplicateReceiptHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
drt = new DuplicateReceiptTestScripts();
delay();

drt.switchtoLeftFrame();
boolean DuplicateRecepitlink = drh.ValidateDuplicateRecepitlinkisDisplayed();
softAssert.assertTrue(DuplicateRecepitlink, "Duplicate Recepit link is not displayed");
if(DuplicateRecepitlink == true) {
	System.out.println("Duplicate Recepit link is displayed");
}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void DuplicateRecepitlinkisEnabledandClickable() {
boolean DuplicateRecepitlink = drh.ValidateDuplicateRecepitlinkisEnabled();
softAssert.assertTrue(DuplicateRecepitlink, "Duplicate Recepit link is not Enabled");
if(DuplicateRecepitlink == true) {
	System.out.println("Duplicate Recepit link is Enabled");
	delay();
	drh.clickonDuplicateRecepitlink();
	delay();
drt.switchtoinnerRightFrame();
}
}
@Test(priority = 3,groups = {"Functional"})
public void DateRadiobuttonisEnabledandSelectable() {
boolean DateRadiobutton = drh.ValidateDateRadiobuttonisEnabled();
softAssert.assertTrue(DateRadiobutton, "Date Radio button is not Enabled");
if(DateRadiobutton == true) {
	System.out.println("Date Radio button is Enabled");
	delay();
	drh.ClickonDateRadiobutton();
	
}
}

@Test(priority = 4,groups = {"Functional"})
public void DateRadiobuttonisSelected() {
boolean DateRadiobutton = drh.ValidateDateRadiobuttonisSelected();
softAssert.assertTrue(DateRadiobutton, "Date Radio button is not Selected");
if(DateRadiobutton == true) {
	System.out.println("Date Radio button is Selected");
}
}

@Test(priority = 5,groups = {"Functional"})
public void CalenderImageisDisplayedandClickable() {
boolean CalenderImage = drh.ValidateCalenderImageisDisplayed();
softAssert.assertTrue(CalenderImage, "Calender Image is not Displayed");
if(CalenderImage == true) {
	System.out.println("Calender Image is Displayed");
	delay();
	drh.ClickonCalenderImage();
}	
}

@Test(priority = 6,groups = {"Functional"})
public void TodayoptioninCalenderImageisEnabledandClickable() {
boolean TodayoptioninCalenderImage = drh.ValidateTodayoptioninCalenderImageisEnabled();
softAssert.assertTrue(TodayoptioninCalenderImage, "Today option in Calender Image is not Enabled");
if(TodayoptioninCalenderImage == true) {
	System.out.println("Today option in Calender Image is Enabled");
	delay();
	drh.ClickonTodayoptioninCalenderImage();
}
}

@Test(priority = 7,groups = {"Functional"})
public void GetSearchresultbuttonisEnabledandClickable() {
boolean GetSearchresultbutton = drh.ValidateGetSearchresultbuttonisEnabled();
softAssert.assertTrue(GetSearchresultbutton, "Get Search result button is not Enabled");
if(GetSearchresultbutton == true) {
	System.out.println("Get Search result button is Enabled");
	delay();
	drh.ClickonGetSearchresultbutton();
}
}

@Test(priority = 8,groups = {"Functional","Smoke"})
public void UHIDRadiobuttonisEnabledandClickbale() {
boolean UHIDRadiobutton = drh.ValidateUHIDRadiobuttonisEnabled();
softAssert.assertTrue(UHIDRadiobutton, "UHID Radio button is not Enabled");
if(UHIDRadiobutton == true) {
	System.out.println("UHID Radio button is Enabled");
	delay();
	drh.SelectUHIDRadiobutton();
}
}

@Test(priority = 9,groups = {"Functional"})
public void UHIDRadiobuttonisSelected() {
boolean UHIDRadiobutton = drh.ValidateUHIDRadiobuttonisSelected();
softAssert.assertTrue(UHIDRadiobutton, "UHID Radio button is not Selected");
if(UHIDRadiobutton == true) {
	System.out.println("UHID Radio button is Selected");
}
}

@Test(priority = 10,groups = {"Functional","Smoke"})
public void CashbookDropdownisEnabledandSelectable() {
boolean CashbookDropdown = drh.ValidateCashbookDropdownisEnabled();
softAssert.assertTrue(CashbookDropdown, "Cashbook Dropdown is not Enabled");
if(CashbookDropdown == true) {
	System.out.println("Cashbook Dropdown is Enabled");
	delay();
	drh.SelectValueFromCashbookDropdown();
}
}

@Test(priority = 11,groups = {"Functional"})
public void CashbookDropdownisMultiple() {
boolean CashbookDropdown = drh.ValidateCashbookDropdownisMultiple();
softAssert.assertTrue(CashbookDropdown, "Cashbook Dropdown is not Multiple");
if(CashbookDropdown == true) {
	System.out.println("Cashbook Dropdown is Multiple");
}
}

@Test(priority = 12,groups = {"Functional","Smoke"})
public void GetSearchresultbuttonofUHIDFilterisEnabledandClickable() {
boolean GetSearchresultbutton = drh.ValidateGetSearchresultbuttonofUHIDateRecepitNoFilterisEnabled();
softAssert.assertTrue(GetSearchresultbutton, "Get Search result button is not Enabled");
if(GetSearchresultbutton == true) {
	System.out.println("Get Search result button is Enabled");
	delay();
	drh.ClickonGetSearchresultbuttonofUHIDateRecepitNoFilter();
	HandleAlert();
Assert.assertEquals("Pop Up Alert Message's not matched", "Please Enter UHID Number","Please Enter UHID Number");
}
}

@Test(priority = 13,groups = {"Functional"})
public void ClickonSerchbuttonWithInvalidUHID() {
drh.ClickonSerchbuttonWithInvalidUHID("DFGHJ!@#");
softAssert.assertEquals(" No record found!!! ", "Please Enter a Valid UHID","Alert PopUp Message is not coming");
}

@Test(priority = 14,groups = {"Functional"})
public void CheckPatientIDMaxlength() {
drh.CheckPatientIDMaxlength("2020005");
softAssert.assertEquals(" No record found!!! ", "UHID must be 11 digits","Alert PopUp Message is not coming");
}

@Test(priority = 15,groups = {"Functional","Smoke"})
public void clickonGetSearchResultbuttonwithvalidUHID() {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String validUHID = reader.getCellData("OPD", "UHID", 2);
	delay();

drh.clickonGetSearchResultbuttonwithvalidUHID(validUHID);
boolean PatientinfoTable = drh.PatientinfoTableisDisplayed();
if(PatientinfoTable == true) {
	String RecepitNumber = drh.getRecepitNo();
	reader.setCellData("OPD", "RecepitNumber", 2, RecepitNumber);
	delay();
	drh.ClickonSelectbuttontoPrintReport();
	delay();
	drt.switchtoPrintbackFrame();
	delay();
	porh.ClickonBackbuttoninRecepit();
	drt.switchtoinnerRightFrame();
}
}

@Test(priority = 16,groups = {"Functional","Smoke"})
public void RecepitNoRadiobuttonisEnabledandSelectable() {
boolean RecepitNo = drh.ValidateRecepitNoRadiobuttonisEnabled();
softAssert.assertTrue(RecepitNo, "Recepit No. Radio button is not enabled");
if(RecepitNo == true) {
	System.out.println("Recepit No. Radio button is enabled");
	delay();
	drh.SelectRecepitNoRadiobutton();
}
}

@Test(priority = 17,groups = {"Functional"})
public void RecepitNoRadiobuttonisSelectable() {
boolean RecepitNo = drh.ValidateRecepitNoRadiobuttonisSelected();
softAssert.assertTrue(RecepitNo, "Recepit No. Radio button is not Selected");
if(RecepitNo == true) {
	System.out.println("Recepit No. Radio button is Selected");
}
}

@Test(priority = 18,groups = {"Functional","Smoke"})
public void GetSearchresultbuttonofRecepitNoFilterisEnabledandClickable() {
boolean GetSearchresultbutton = drh.ValidateGetSearchresultbuttonofUHIDateRecepitNoFilterisEnabled();
softAssert.assertTrue(GetSearchresultbutton, "Get Search result button is not Enabled");
if(GetSearchresultbutton == true) {
	System.out.println("Get Search result button is Enabled");
	delay();
	drh.ClickonGetSearchresultbuttonofUHIDateRecepitNoFilter();
Assert.assertEquals("Pop Up Alert Message's not matched", "Please Enter Receipt Number",GetAlertText());
HandleAlert();


}
}

@Test(priority = 19,groups = {"Functional"})
public void ClickonSerchbuttonWithInvalidRecepitNo() {
drh.ClickonSerchbuttonWithInvalidRecepitNo("DFGHJ!@#");
softAssert.assertEquals(" No record found!!! ", "Please Enter a Valid Receipt Number","Alert PopUp Message is not coming");
}

@Test(priority = 20,groups = {"Functional","Smoke"})
public void ClickonSerchbuttonWithvalidRecepitNo() {
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String validRecepitNumber = reader.getCellData("OPD", "RecepitNumber", 2);
	delay();

drh.ClickonSerchbuttonWithvalidRecepitNo(validRecepitNumber);
boolean PatientinfoTable = drh.PatientinfoTableisDisplayed();
if(PatientinfoTable == true) {
	delay();
	drh.ClickonSelectbuttontoPrintReport();
	delay();
	drt.switchtoPrintbackFrame();
	delay();
	porh.ClickonBackbuttoninRecepit();
	drt.switchtoinnerRightFrame();
}
}



}
