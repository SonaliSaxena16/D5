package ehospital.Billing_Module.helper;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ehospital.Billing_Module.Locators.RegistrationFeeCancellationLocators;
import in.nic.ehospial.generic.BaseClass;

public class RegistrationFeeCancellationHelper extends BaseClass {
public WebDriver driver;
	
RegistrationFeeCancellationLocators RegistrationFeeCancellation;
					
					
public RegistrationFeeCancellationHelper(WebDriver driver) {
this.driver = driver;
RegistrationFeeCancellation = new RegistrationFeeCancellationLocators(driver);
}

//Action
//////////////////////////////RegistrationFeeCancellationlink//////////////////////////////////
public boolean ValidateRegistrationFeeCancellationlinkisDisplayed() {
WebElement RegistrationFeeCancellationlink = RegistrationFeeCancellation.getRegistrationFeeCancellationlink();
return RegistrationFeeCancellationlink.isDisplayed();
}

public boolean ValidateRegistrationFeeCancellationlinkisEnabled() {
WebElement RegistrationFeeCancellationlink = RegistrationFeeCancellation.getRegistrationFeeCancellationlink();
return RegistrationFeeCancellationlink.isEnabled();
}

public void ClickonRegistrationFeeCancellationlink() {
	RegistrationFeeCancellation.getRegistrationFeeCancellationlink().click();
}

/////////////////////////////////////SearchCriterionexpandimageButton/////////////////////////
public boolean ValidateSearchCriterionexpandimageButtonisDisplayed() {
WebElement SearchCriterion = RegistrationFeeCancellation.getSearchCriterionexpandimageButton();
return SearchCriterion.isDisplayed();
}

public void ClickonSearchCriterionexpandimageButton() {
	RegistrationFeeCancellation.getSearchCriterionexpandimageButton().click();
	delay();
	RegistrationFeeCancellation.getSearchCriterionexpandimageButton().click();
}

////////////////////////////////SearchFilterContainerBox//////////////////////////////////
public boolean ValidateSearchFilterContainerBoxisEnabled() {
WebElement SearchFilter = RegistrationFeeCancellation.getSearchFilterContainerBox();
return SearchFilter.isEnabled();
}

//////////////////////////////////////GetResultbutton///////////////////////////////////
public boolean ValidateGetResultbuttonisEnabled() {
WebElement GetResultbutton = RegistrationFeeCancellation.getGetResultbutton();
return GetResultbutton.isEnabled();
}

public void ClickonGetResultbutton() {
	RegistrationFeeCancellation.getGetResultbutton().click();
}

/////////////////////////////////////////ContactNumberCheckbox//////////////////////////////
public boolean ValidateContactNumberCheckboxisEnabled() {
WebElement ContactNumber = RegistrationFeeCancellation.getContactNumberCheckbox();
return ContactNumber.isEnabled();
}

public boolean ValidateContactNumberCheckboxisSelected() {
WebElement ContactNumber = RegistrationFeeCancellation.getContactNumberCheckbox();
return ContactNumber.isSelected();
}

public void SelectContactNumberCheckbox() {
	RegistrationFeeCancellation.getContactNumberCheckbox().click();
	
}

////////////////////////////////////MobileNumberTextBox/////////////////////////
public boolean ValidateMobileNumberTextBoxisEnabled() {
WebElement MobileNumberTextBox = RegistrationFeeCancellation.getMobileNumberTextBox();
return MobileNumberTextBox.isEnabled();
}
	
public void EnterValueintotheMobileNumberTextBox(String MobileNumber) {
	RegistrationFeeCancellation.getMobileNumberTextBox().sendKeys(MobileNumber);
	delay();
	RegistrationFeeCancellation.getMobileNumberTextBox().clear();
}

/////////////////////////////ClickonResultbuttonafterEnterInvalidMobileNumber////////////////
public void ClickonResultbuttonafterEnterInvalidMobileNumber(String InvalidMobileNumber) {
delay();
RegistrationFeeCancellation.getMobileNumberTextBox().sendKeys(InvalidMobileNumber);
delay();
RegistrationFeeCancellation.getGetResultbutton().click();
}

/////////////////////////////CheckMobileNumberMaxLenth////////////////
public void CheckMobileNumberMaxLenth(String InvalidMobileNumber) {
	RegistrationFeeCancellation.getMobileNumberTextBox().clear();
delay();
RegistrationFeeCancellation.getMobileNumberTextBox().sendKeys(InvalidMobileNumber);
delay();
RegistrationFeeCancellation.getGetResultbutton().click();

}


/////////////////////////////ClickonResultbuttonafterEnterValidMobileNumber////////////////
public void ClickonResultbuttonafterEnterValidMobileNumber(String ValidMobileNumber) {
RegistrationFeeCancellation.getMobileNumberTextBox().clear();
delay();
RegistrationFeeCancellation.getMobileNumberTextBox().sendKeys(ValidMobileNumber);
delay();
RegistrationFeeCancellation.getGetResultbutton().click();
}

///////////////////////////////////////SearchResultInfoBox//////////////////////////
public boolean ValidateSearchResultInfoBoxisDisplayed() {
WebElement SearchResultInfo = RegistrationFeeCancellation.getSearchResultInfoBox();
return SearchResultInfo.isDisplayed();
}

//////////////////////////////SearchResultExpandbutton////////////////////////////////
public boolean ValidateSearchResultExpandbuttonisEnabled() {
WebElement SearchResultExpandbutton = RegistrationFeeCancellation.getSearchResultExpandbutton();
return SearchResultExpandbutton.isEnabled();
}

public void ClickonSearchResultExpandbutton() {
	RegistrationFeeCancellation.getSearchResultExpandbutton().click();
	delay();
	RegistrationFeeCancellation.getSearchResultExpandbutton().click();
}

///////////////////////////////////////////RangeofVisitDateCheckbox/////////////////////////
public boolean ValidateRangeofVisitDateCheckboxisEnabled() {
WebElement RangeofVisitDate = RegistrationFeeCancellation.getRangeofVisitDateCheckbox();
return RangeofVisitDate.isEnabled();
}

public boolean ValidateRangeofVisitDateCheckboxisSelected() {
WebElement RangeofVisitDate = RegistrationFeeCancellation.getRangeofVisitDateCheckbox();
return RangeofVisitDate.isSelected();
}

public void SelectRangeofVisitDateCheckbox() {
	RegistrationFeeCancellation.getRangeofVisitDateCheckbox().click();
	
}

///////////////////////////////////////dateCalenderbutton//////////////////////////////////////
public boolean ValidatedateCalenderbuttonisEnabled() {
WebElement dateCalenderbutton = RegistrationFeeCancellation.getDateCalenderbutton();
return dateCalenderbutton.isEnabled();
}

public void clickondateCalenderbutton() {
	RegistrationFeeCancellation.getDateCalenderbutton().click();
	delay();
	RegistrationFeeCancellation.getTodayDate().click();
	delay();
	RegistrationFeeCancellation.getGetResultbutton().click();
}

////////////////////////////////////ClinicCheckbox/////////////////////////////////////////////////
public boolean ValidateClinicCheckboxisEnabled() {
WebElement ClinicCheckbox = RegistrationFeeCancellation.getClinicCheckbox();
return ClinicCheckbox.isEnabled();
}

public boolean ValidateClinicCheckboxisSelected() {
WebElement ClinicCheckbox = RegistrationFeeCancellation.getClinicCheckbox();
return ClinicCheckbox.isSelected();
}

public void SelectClinicCheckbox() {
	RegistrationFeeCancellation.getClinicCheckbox().click();
	
}

///////////////////////////////////AnyPartofNameCheckBox/////////////////////////////////
public boolean ValidateAnyPartofNameCheckBoxisEnabled() {
WebElement ClinicCheckbox = RegistrationFeeCancellation.getAnyPartofNameCheckBox();
return ClinicCheckbox.isEnabled();
}

public boolean ValidateAnyPartofNameCheckBoxisSelected() {
WebElement ClinicCheckbox = RegistrationFeeCancellation.getAnyPartofNameCheckBox();
return ClinicCheckbox.isSelected();
}

public void SelectAnyPartofNameCheckBox() {
	RegistrationFeeCancellation.getAnyPartofNameCheckBox().click();
	
}

//////////////////////////////////AnyPartofNameTextBox///////////////////////////////
public boolean ValidateAnyPartofNameTextBoxisEnabled() {
WebElement AnyPartofName = RegistrationFeeCancellation.getAnyPartofNameTextBox();
return AnyPartofName.isEnabled();
}

public void EnterInvalidNameintotheAnyPartofNameTextBox(String InvalidName) {
delay();
RegistrationFeeCancellation.getAnyPartofNameTextBox().sendKeys(InvalidName);
delay();
RegistrationFeeCancellation.getGetResultbutton().click();
}

public void EnterValidNameintotheAnyPartofNameTextBox(String ValidName) {
RegistrationFeeCancellation.getAnyPartofNameTextBox().clear();
delay();
RegistrationFeeCancellation.getAnyPartofNameTextBox().sendKeys(ValidName);
delay();
RegistrationFeeCancellation.getGetResultbutton().click();
}

///////////////////////////////////////////////UHIDCheckBox//////////////////////////////////
public boolean ValidateUHIDcheckBoxisEnabled() {
WebElement ClinicCheckbox = RegistrationFeeCancellation.getUHIDcheckBox();
return ClinicCheckbox.isEnabled();
}

public boolean ValidateUHIDcheckBoxisSelected() {
WebElement ClinicCheckbox = RegistrationFeeCancellation.getUHIDcheckBox();
return ClinicCheckbox.isSelected();
}

public void SelectUHIDcheckBox() {
	RegistrationFeeCancellation.getUHIDcheckBox().click();
}

//////////////////////////////////////UHIDTextBox////////////////////////////////////////////
public boolean ValidateUHIDTextBoxisEnabled() {
WebElement UHIDTextBox = RegistrationFeeCancellation.getUHIDTextBox();
return UHIDTextBox.isEnabled();
}

public void EnterInvalididintotheUHIDTextBox(String InvalidID) {
delay();
RegistrationFeeCancellation.getUHIDTextBox().sendKeys(InvalidID);
delay();
RegistrationFeeCancellation.getGetResultbutton().click();
}

public void EnterValididintotheUHIDTextBox(String ValidID) {
RegistrationFeeCancellation.getUHIDTextBox().clear();
delay();
RegistrationFeeCancellation.getUHIDTextBox().sendKeys(ValidID);
delay();
RegistrationFeeCancellation.getGetResultbutton().click();
}

/////////////////////////StorethePatientDetailofSearchPageintoListforVerification////////////////////

public List<String> PatientDetailofSearchPageforVerification() {
List<WebElement> PatientDetail = RegistrationFeeCancellation.getPatientinfoTableForVerification();


List<String> TextofPatientDetail= new ArrayList<String>();

TextofPatientDetail.add(PatientDetail.get(0).getText());//UHID
TextofPatientDetail.add(PatientDetail.get(1).getText());//Patient Name
TextofPatientDetail.add(PatientDetail.get(2).getText());//DepartMent
TextofPatientDetail.add(PatientDetail.get(3).getText());//Clinic
TextofPatientDetail.add(PatientDetail.get(4).getText());//VisitDate
return TextofPatientDetail;
}

///////////////////////////////////Select button//////////////////////////////////
public boolean ValidateSelectbuttonisEnabled() {
WebElement Selectbutton = RegistrationFeeCancellation.getSelectbutton();
return Selectbutton.isEnabled();
}

public void ClickonSelectbutton() {
	RegistrationFeeCancellation.getSelectbutton().click();
}

/////////////////////////StorethePatientDetailofRegistrationFeeUpdationintoListforVerification////////////////////

public List<String> PatientDetailofRegistrationFeeUpdationforVerification() {
List<WebElement> PatientDetailintoUpdationPage = RegistrationFeeCancellation.getPatientinfoTableintoUpdattionPageForVerification();


List<String> TextofPatientDetailUpdationPage= new ArrayList<String>();

TextofPatientDetailUpdationPage.add(PatientDetailintoUpdationPage.get(1).getText());//UHID
TextofPatientDetailUpdationPage.add(PatientDetailintoUpdationPage.get(3).getText());//Patient Name
TextofPatientDetailUpdationPage.add(PatientDetailintoUpdationPage.get(5).getText());//DepartMent
TextofPatientDetailUpdationPage.add(PatientDetailintoUpdationPage.get(7).getText());//Clinic
TextofPatientDetailUpdationPage.add(PatientDetailintoUpdationPage.get(14).getText());//VisitDate
return TextofPatientDetailUpdationPage;
}

public void VerifyPatientinfoData() {
Assert.assertEquals(PatientDetailofRegistrationFeeUpdationforVerification(), PatientDetailofSearchPageforVerification(),"Data Validation Not matched");
}

///////////////////////////////////CancelRegistrationFeebutton//////////////////
public boolean ValidateCancelRegistrationFeebuttonisEnabled() {
WebElement CancelRegistrationFeebutton = RegistrationFeeCancellation.getCancelRegistrationFeebutton();
return CancelRegistrationFeebutton.isEnabled();
}

public void ClickonCancelRegistrationFeebutton() {
	RegistrationFeeCancellation.getCancelRegistrationFeebutton().click();
}

////////////////////////////////RemarksTextArea/////////////////////////////////////
public boolean ValidateRemarksTextAreaisEnabled() {
WebElement RemarksTextArea = RegistrationFeeCancellation.getRemarksTextArea();
return RemarksTextArea.isEnabled();
}

public void EnterTextintoRemarksTextArea(String Reason) {
	RegistrationFeeCancellation.getRemarksTextArea().clear();
	delay();
	RegistrationFeeCancellation.getRemarksTextArea().sendKeys(Reason);
}

/////////////////////////////////////////////////RegistrationFeeTextbox///////////////////////
public boolean ValidateRegistrationFeeTextboxisEnabled() {
WebElement RemarksTextArea = RegistrationFeeCancellation.getRegistrationFeeTextbox();
return RemarksTextArea.isEnabled();
}

public void EnterInvalidFeeintoRegistrationFeeTextbox(String InvalidFee) {
	delay();
	selectDropdownVisibleElement(RegistrationFeeCancellation.getCategoryDropdown(),"BPL");
	delay();
	RegistrationFeeCancellation.getRegistrationFeeTextbox().clear();
	delay();
	RegistrationFeeCancellation.getRegistrationFeeTextbox().sendKeys(InvalidFee);
	delay();
	RegistrationFeeCancellation.getCancelRegistrationFeebutton().click();
}

public void EnterValidFeeintoRegistrationFeeTextbox(String ValidFee) {
	delay();
	selectDropdownVisibleElement(RegistrationFeeCancellation.getCategoryDropdown(),"BPL");
	delay();
	RegistrationFeeCancellation.getRegistrationFeeTextbox().clear();
	delay();
	RegistrationFeeCancellation.getRegistrationFeeTextbox().sendKeys(ValidFee);
	delay();
	RegistrationFeeCancellation.getCancelRegistrationFeebutton().click();
}

/////////////////////////////////FeeUpdationMessage/////////////////////////////
public boolean ValidateFeeUpdationMessageisDisplayed() {
WebElement FeeUpdationMessage = RegistrationFeeCancellation.getFeeUpdationMessage();
return FeeUpdationMessage.isDisplayed();
}

///////////////////////////////////ReSearchbutton//////////////////////////////////////
public boolean ValidateReSearchbuttonisEnabled() {
WebElement ReSearchbutton = RegistrationFeeCancellation.getReSearchbutton();
return ReSearchbutton.isEnabled();
}

public void ClickonReSearchbutton() {
	RegistrationFeeCancellation.getReSearchbutton().click();
}





}
