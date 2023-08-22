package ehospital.Billing_Module.TestScripts;

import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.GenerateSettledReceiptHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;

public class GenerateSettledReceiptTestScripts extends BaseClass {
	GenerateSettledReceiptHelper gsrh;
	GenerateSettledReceiptTestScripts gsrt;
	PreparationOfReceiptsHelper porh;
	
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void GenerateSettledReceiptlinkisDispalyed() {
gsrh = new GenerateSettledReceiptHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
gsrt = new GenerateSettledReceiptTestScripts();
delay();

gsrt.switchtoLeftFrame();
boolean GenerateSettledReceiptlink = gsrh.ValidateGenerateSettledReceiptlinkisDisplayed();
softAssert.assertTrue(GenerateSettledReceiptlink, "Generate Settled Receipt link is Not Displayed");
if(GenerateSettledReceiptlink == true) {
	System.out.println("Generate Settled Receipt link is Displayed");
}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void GenerateSettledReceiptlinkisEnabledandClickable() {
boolean GenerateSettledReceiptlink = gsrh.ValidateGenerateSettledReceiptlinkisEnabled();
softAssert.assertTrue(GenerateSettledReceiptlink, "Generate Settled Receipt link is Not Enabled");
if(GenerateSettledReceiptlink == true) {
	System.out.println("Generate Settled Receipt link is Enabled");
	delay();
	gsrh.ClickonGenerateSettledReceiptlink();
	delay();
	gsrt.switchtoinnerRightFrame();
}
}

@Test(priority = 3,groups = {"Functional"})
public void UHIDRadiobuttonisEnabledandSelectable() {
boolean UHIDRadiobutton = gsrh.ValidateUHIDRadiobuttonisEnabled();
softAssert.assertTrue(UHIDRadiobutton, "UHID Radio button is Not Enabled");
if(UHIDRadiobutton == true) {
	System.out.println("UHID Radio button is Enabled");
	delay();
	gsrh.SelectUHIDRadiobutton();
}
}

@Test(priority = 4,groups = {"Functional"})
public void UHIDRadiobuttonisSelected() {
boolean UHIDRadiobutton = gsrh.ValidateUHIDRadiobuttonisSelecetd();
softAssert.assertTrue(UHIDRadiobutton, "UHID Radio button is Not Selected");
if(UHIDRadiobutton == true) {
	System.out.println("UHID Radio button is Selected");
}
}
	
@Test(priority = 5,groups = {"Functional"})
public void SearchbuttonisEnabledandClickable() {
boolean Searchbutton = gsrh.ValidateSearchbuttonisEnabled();
softAssert.assertTrue(Searchbutton, "Search button is Not Enabled");
if(Searchbutton == true) {
	System.out.println("Search button is Enabled");
	delay();
	gsrh.SelectSearchbutton();
softAssert.assertEquals(GetAlertText(), "Please Enter Valid UHID...", "Alert Message Not matched");
delay();
HandleAlert();
}
}
	
@Test(priority = 6,groups = {"Functional"})
public void EnterUHIDTextboxisEnabledandEnterInvalidID() {
boolean UHID = gsrh.ValidateEnterUHIDTextBoxisEnabled();
softAssert.assertTrue(UHID, "Enter UHID Text Box is Not Enabled");
if(UHID == true) {
	System.out.println("Enter UHID Text Box is Enabled");
	delay();
	gsrh.EnterInvalidUHIDintotheTextBox("HJJK &*");
softAssert.assertEquals(GetAlertText(), "Please Enter Valid UHID...", "Alert PopUp Message is not coming");
delay();
HandleAlert();
}
}
	
@Test(priority = 7,groups = {"Functional"})
public void EnterUHIDTextboxisEnabledandEnterInvalidlengthofID() {
boolean UHID = gsrh.ValidateEnterUHIDTextBoxisEnabled();
softAssert.assertTrue(UHID, "Enter UHID Text Box is Not Enabled");
if(UHID == true) {
	System.out.println("Enter UHID Text Box is Enabled");
	delay();
	gsrh.EnterInvalidlengthofUHIDintotheTextBox("2020000");
softAssert.assertEquals(GetAlertText(), "UHID ID Must be 11 Digit", "Alert PopUp Message is not coming");
delay();
HandleAlert();
}
}
	
@Test(priority = 8,groups = {"Functional"})
public void EnterUHIDTextboxisEnabledandEnterValidID() {
boolean UHID = gsrh.ValidateEnterUHIDTextBoxisEnabled();
softAssert.assertTrue(UHID, "Enter UHID Text Box is Not Enabled");
if(UHID == true) {
	System.out.println("Enter UHID Text Box is Enabled");
	delay();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 2);
	delay();
	gsrh.EnterValidUHIDintotheTextBox(ValidID);
}
}

@Test(priority =9,groups = {"Functional"})
public void PaymentModeDropdownisEnabledandSelectValue() {
boolean PaymentDropdown = gsrh.ValidatePaymentModeDropdownisEnabled();
softAssert.assertTrue(PaymentDropdown, "Payment Mode Dropdwon is not Enabled");
if(PaymentDropdown == true) {
	System.out.println("Payment Mode Dropdwon is Enabled");
	delay();
	gsrh.SelectValuefromPaymentModeDropdown();
boolean DetailReport = gsrh.ValidateDetailsReportTableisDisplayed();
softAssert.assertTrue(DetailReport, "Detail Report table is not displayed");
}
}

@Test(priority =10,groups = {"Functional"})
public void PaymentModeDropdownisMultiple() {
boolean PaymentDropdown = gsrh.ValidatePaymentModeDropdownisMultiple();
softAssert.assertTrue(PaymentDropdown, "Payment Mode Dropdwon is Multiple");
if(PaymentDropdown == false) {
	System.out.println("Payment Mode Dropdwon is Not Multiple");
}
}

@Test(priority = 11,groups = {"Functional"})
public void AdmissionIDRadiobuttonisEnabledandSelectable() {
boolean AdmissionIDRadiobutton = gsrh.ValidateAdmissionIDRadiobuttonisEnabled();
softAssert.assertTrue(AdmissionIDRadiobutton, "Admission ID Radio button is Not Enabled");
if(AdmissionIDRadiobutton == true) {
	System.out.println("Admission ID Radio button is Enabled");
	delay();
	gsrh.SelectAdmissionIDRadiobutton();
}
}

@Test(priority = 12,groups = {"Functional"})
public void AdmissionIDRadiobuttonisSelected() {
boolean AdmissionIDRadiobutton = gsrh.ValidateAdmissionIDRadiobuttonisSelecetd();
softAssert.assertTrue(AdmissionIDRadiobutton, "Admission ID Radio button is Not Selected");
if(AdmissionIDRadiobutton == true) {
	System.out.println("Admission ID Radio button is Selected");
}
}

@Test(priority = 13,groups = {"Functional"})
public void AdmissionIDTextboxisEnabledandEnterInvalidID() {
boolean AdmissionID = gsrh.ValidateAdmissionIDTextBoxisEnabled();
softAssert.assertTrue(AdmissionID, "AdmissionID Text Box is Not Enabled");
if(AdmissionID == true) {
	System.out.println("AdmissionID Text Box is Enabled");
	delay();
	gsrh.EnterInvalidAdmissionIDintotheTextBox("HJJK &*");
softAssert.assertEquals(GetAlertText(), "Please Enter Valid Admission Id...", "Alert PopUp Message is not coming");
delay();
HandleAlert();
}
}
		
@Test(priority = 14,groups = {"Functional"})
public void AdmissionIDTextboxisEnabledandEnterValidID() {
boolean AdmissionID = gsrh.ValidateAdmissionIDTextBoxisEnabled();
softAssert.assertTrue(AdmissionID, "AdmissionID Text Box is Not Enabled");
if(AdmissionID == true) {
	System.out.println("AdmissionID Text Box is Enabled");
	delay();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "IPNumber", 2);
	delay();
	gsrh.EnterValidAdmissionIDintotheTextBox(ValidID);
boolean DetailReport = gsrh.ValidateDetailsReportTableisDisplayed();
softAssert.assertTrue(DetailReport, "Detail Report table is not displayed");
}
}

@Test(priority = 15,groups = {"Functional","Smoke"})
public void DateRadiobuttonisEnabledandSelectable() {
boolean DateRadiobutton = gsrh.ValidateDateRadiobuttonisEnabled();
softAssert.assertTrue(DateRadiobutton, "Date Radio button is Not Enabled");
if(DateRadiobutton == true) {
	System.out.println("Date Radio button is Enabled");
	delay();
	gsrh.SelectDateRadiobutton();
}
}

@Test(priority = 16,groups = {"Functional"})
public void DateRadiobuttonisSelected() {
boolean DateRadiobutton = gsrh.ValidateDateRadiobuttonisSelecetd();
softAssert.assertTrue(DateRadiobutton, "Date Radio button is Not Selected");
if(DateRadiobutton == true) {
	System.out.println("Date Radio button is Selected");
}
}

@Test(priority = 17,groups = {"Functional"})
public void OpenbuttonisEnabledandClickable() {
boolean Openbutton = gsrh.ValidateOpenbuttonisEnabled();
softAssert.assertTrue(Openbutton, "Open button is Not Enabled");
if(Openbutton == true) {
	System.out.println("Open button is Enabled");
	delay();
	gsrh.ClickonOpenbutton();
}
}

@Test(priority = 18,groups = {"Functional"})
public void CancelbuttonisEnabledandClickable() {
boolean Cancelbutton = gsrh.ValidateCancelbuttonisEnabled();
softAssert.assertTrue(Cancelbutton, "Cancel button is Not Enabled");
if(Cancelbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	gsrh.ClickonCancelbutton();
}
}

@Test(priority = 19,groups = {"Functional","Smoke"})
public void SelectbuttonisEnabledandClickable() {
boolean Selectbutton = gsrh.ValidateSelectbuttonisEnabled();
softAssert.assertTrue(Selectbutton, "Select button is Not Enabled");
if(Selectbutton == true) {
	System.out.println("Select button is Enabled");
	delay();
	gsrh.ClickonSelectbutton();
delay();
//gsrh.PatientDetailsDuringSettlementForVerification();
delay();
//gsrh.PatientDetailsDuringSettlementApprovalForVerification();
//gsrh.VerifyPatientDetails();
}
}

@Test(priority = 20,groups = {"Functional","Smoke"})
public void GeneratebuttonisEnabledandClickable() {
boolean Generatebutton = gsrh.ValidateGeneratebuttonisEnabled();
softAssert.assertTrue(Generatebutton, "Generate button is Not Enabled");
if(Generatebutton == true) {
	System.out.println("Generate button is Enabled");
	delay();
	gsrh.ClickonGeneratebutton();
	delay();
	gsrt.switchtoPrintbackFrame();
	delay();
	gsrh.ClickonBackbutton();
	gsrt.switchtoLeftFrame();
}
}
	
}
