package ehospital.Billing_Module.helper;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ehospital.Billing_Module.Locators.GenerateSettledReceiptLocators;
import in.nic.ehospial.generic.BaseClass;

public class GenerateSettledReceiptHelper extends BaseClass {
public WebDriver driver;
	
GenerateSettledReceiptLocators GenerateSettledReceipt;
							
							
public GenerateSettledReceiptHelper(WebDriver driver) {
this.driver = driver;
GenerateSettledReceipt = new GenerateSettledReceiptLocators(driver);
}

//Action
///////////////////////////////////GenerateSettledReceiptlink/////////////////////////
public boolean ValidateGenerateSettledReceiptlinkisDisplayed() {
WebElement GenerateSettledReceiptlink = GenerateSettledReceipt.getGenerateSettledReceiptLink();
return GenerateSettledReceiptlink.isDisplayed();
}

public boolean ValidateGenerateSettledReceiptlinkisEnabled() {
WebElement GenerateSettledReceiptlink = GenerateSettledReceipt.getGenerateSettledReceiptLink();
return GenerateSettledReceiptlink.isEnabled();
}

public void ClickonGenerateSettledReceiptlink() {
	GenerateSettledReceipt.getGenerateSettledReceiptLink().click();
}

/////////////////////////////////UHIDRadiobutton///////////////////////////
public boolean ValidateUHIDRadiobuttonisEnabled() {
WebElement UHIDRadiobutton = GenerateSettledReceipt.getUHIDRadiobutton();
return UHIDRadiobutton.isEnabled();
}

public boolean ValidateUHIDRadiobuttonisSelecetd() {
WebElement UHIDRadiobutton = GenerateSettledReceipt.getUHIDRadiobutton();
return UHIDRadiobutton.isSelected();
}

public void SelectUHIDRadiobutton() {
GenerateSettledReceipt.getUHIDRadiobutton().click();
}

///////////////////////////Searchbutton/////////////////////////////////
public boolean ValidateSearchbuttonisEnabled() {
WebElement Searchbutton = GenerateSettledReceipt.getSearchbutton();
return Searchbutton.isEnabled();
}

public void SelectSearchbutton() {
GenerateSettledReceipt.getSearchbutton().click();
}

//////////////////////////////EnterUHIDTextBox////////////////////////////////////////////
public boolean ValidateEnterUHIDTextBoxisEnabled() {
WebElement UHID = GenerateSettledReceipt.getEnterUHIDTextBox();
return UHID.isEnabled();
}

public void EnterInvalidUHIDintotheTextBox(String InvalidUHID) {
GenerateSettledReceipt.getEnterUHIDTextBox().clear();
delay();
GenerateSettledReceipt.getEnterUHIDTextBox().sendKeys(InvalidUHID);
delay();
GenerateSettledReceipt.getSearchbutton().click();
}

public void EnterValidUHIDintotheTextBox(String ValidUHID) {
GenerateSettledReceipt.getEnterUHIDTextBox().clear();
delay();
GenerateSettledReceipt.getEnterUHIDTextBox().sendKeys(ValidUHID);
delay();
GenerateSettledReceipt.getSearchbutton().click();

}

public void EnterInvalidlengthofUHIDintotheTextBox(String InvalidlengthofID) {
GenerateSettledReceipt.getEnterUHIDTextBox().clear();
delay();
GenerateSettledReceipt.getEnterUHIDTextBox().sendKeys(InvalidlengthofID);
delay();
GenerateSettledReceipt.getSearchbutton().click();
}

///////////////////////////////////PaymentModeDropdown//////////////////////////////////////////////
public boolean ValidatePaymentModeDropdownisEnabled() {
WebElement PaymentMode = GenerateSettledReceipt.getPaymentModeDropdown();
return PaymentMode.isEnabled();
}

public boolean ValidatePaymentModeDropdownisMultiple() {
WebElement PaymentMode = GenerateSettledReceipt.getPaymentModeDropdown();
return ISDropdownisMultiple(PaymentMode);
}

public void SelectValuefromPaymentModeDropdown() {
delay();
selectDropdownVisibleElement(GenerateSettledReceipt.getPaymentModeDropdown(),"Cash");
delay();
GenerateSettledReceipt.getSearchbutton().click();
}

//////////////////////////////////DetailsReportTable////////////////////////////
public boolean ValidateDetailsReportTableisDisplayed() {
WebElement DetailsReport = GenerateSettledReceipt.getPaymentModeDropdown();
return DetailsReport.isDisplayed();
}

/////////////////////////////////////AdmissionIDRadiobutton////////////////////////////
public boolean ValidateAdmissionIDRadiobuttonisEnabled() {
WebElement AdmissionIDRadiobutton = GenerateSettledReceipt.getAdmissionIDRadiobutton();
return AdmissionIDRadiobutton.isEnabled();
}

public boolean ValidateAdmissionIDRadiobuttonisSelecetd() {
WebElement AdmissionIDRadiobutton = GenerateSettledReceipt.getAdmissionIDRadiobutton();
return AdmissionIDRadiobutton.isSelected();
}

public void SelectAdmissionIDRadiobutton() {
GenerateSettledReceipt.getAdmissionIDRadiobutton().click();
}

/////////////////////////////////////AdmissionIDTextBox//////////////////////////
public boolean ValidateAdmissionIDTextBoxisEnabled() {
WebElement AdmissionID = GenerateSettledReceipt.getAdmissionIDTextBox();
return AdmissionID.isEnabled();
}

public void EnterInvalidAdmissionIDintotheTextBox(String InvalidAdmissionID) {
GenerateSettledReceipt.getAdmissionIDTextBox().clear();
delay();
GenerateSettledReceipt.getAdmissionIDTextBox().sendKeys(InvalidAdmissionID);
delay();
GenerateSettledReceipt.getSearchbutton().click();
}

public void EnterValidAdmissionIDintotheTextBox(String ValidAdmissionID) {
GenerateSettledReceipt.getAdmissionIDTextBox().clear();
delay();
GenerateSettledReceipt.getAdmissionIDTextBox().sendKeys(ValidAdmissionID);
delay();
GenerateSettledReceipt.getSearchbutton().click();
}

////////////////////////////DateRadiobutton///////////////////////////////
public boolean ValidateDateRadiobuttonisEnabled() {
WebElement DateRadiobutton = GenerateSettledReceipt.getDateRadiobutton();
return DateRadiobutton.isEnabled();
}

public boolean ValidateDateRadiobuttonisSelecetd() {
WebElement DateRadiobutton = GenerateSettledReceipt.getDateRadiobutton();
return DateRadiobutton.isSelected();
}

public void SelectDateRadiobutton() {
GenerateSettledReceipt.getDateRadiobutton().click();
delay();
selectDropdownVisibleElement(GenerateSettledReceipt.getPaymentModeDropdown(),"Cash");
delay();
GenerateSettledReceipt.getSearchbutton().click();

}
/////////////////////////Openbutton////////////////////////////////
public boolean ValidateOpenbuttonisEnabled() {
WebElement Openbutton = GenerateSettledReceipt.getOpenbutton();
return Openbutton.isEnabled();
}

public void ClickonOpenbutton() {
GenerateSettledReceipt.getOpenbutton().click();
}

////////////////////////////Cancelbutton////////////////////////////////
public boolean ValidateCancelbuttonisEnabled() {
WebElement Cancelbutton = GenerateSettledReceipt.getCancelbutton();
return Cancelbutton.isEnabled();
}

public void ClickonCancelbutton() {
GenerateSettledReceipt.getCancelbutton().click();
}

////////////////////////////////Selectbutton//////////////////////////////
public boolean ValidateSelectbuttonisEnabled() {
WebElement Selectbutton = GenerateSettledReceipt.getSelectbutton();
return Selectbutton.isEnabled();
}

public void ClickonSelectbutton() {
GenerateSettledReceipt.getSelectbutton().click();
delay();
GenerateSettledReceipt.getCancelbutton().click();
delay();
GenerateSettledReceipt.getSelectbutton().click();

}
////////////////////////////////PatientDetailsDuringSettlement/////////////////////////////
public List<String> PatientDetailsDuringSettlementForVerification() {
List<WebElement> PatientDetails = GenerateSettledReceipt.getPatientDetailsDuringSettlement();


List<String> TextofPatientDetails= new ArrayList<String>();

TextofPatientDetails.add(PatientDetails.get(1).getText());//Patient Name
TextofPatientDetails.add(PatientDetails.get(2).getText());//Age
TextofPatientDetails.add(PatientDetails.get(3).getText());//Sex
TextofPatientDetails.add(PatientDetails.get(4).getText());//AdmissionID
return TextofPatientDetails;
}

/////////////////////////////////////PatientDetailsDuringSettlementApproval/////////////////
public List<String> PatientDetailsDuringSettlementApprovalForVerification() {
List<WebElement> PatientDetails = GenerateSettledReceipt.getPatientDetailsDuringSettlementApproval();


List<String> TextofPatientDetails= new ArrayList<String>();

TextofPatientDetails.add(PatientDetails.get(1).getText());//Patient Name
TextofPatientDetails.add(PatientDetails.get(2).getText());//Age
TextofPatientDetails.add(PatientDetails.get(3).getText());//Sex
TextofPatientDetails.add(PatientDetails.get(4).getText());//AdmissionID
return TextofPatientDetails;
}

public void VerifyPatientDetails() {
Assert.assertEquals(PatientDetailsDuringSettlementForVerification(), PatientDetailsDuringSettlementApprovalForVerification(),"Data Validation Not matched");

}

//////////////////////////////////Generatebutton///////////////////////////
public boolean ValidateGeneratebuttonisEnabled() {
WebElement Generatebutton = GenerateSettledReceipt.getGeneratebutton();
return Generatebutton.isEnabled();
}

public void ClickonGeneratebutton() {
GenerateSettledReceipt.getGeneratebutton().click();
delay();
GenerateSettledReceipt.getPrintMoneyReceiptbutton().click();
}

///////////////////////////Backbutton////////////////////////////////
public void ClickonBackbutton() {
GenerateSettledReceipt.getBackbutton().click();
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
