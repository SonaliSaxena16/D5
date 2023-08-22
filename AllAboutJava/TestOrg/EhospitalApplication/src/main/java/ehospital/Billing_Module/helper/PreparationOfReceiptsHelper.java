package ehospital.Billing_Module.helper;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ehospital.Billing_Module.Locators.PreparationOfReceiptsLocators;
import in.nic.ehospial.generic.BaseClass;

public class PreparationOfReceiptsHelper extends BaseClass {
	
	public WebDriver driver;
	
	PreparationOfReceiptsLocators PreparationOfReceipts;
	
	public PreparationOfReceiptsHelper(WebDriver driver) {
		this.driver = driver;
		PreparationOfReceipts = new PreparationOfReceiptsLocators(driver);
	}
	
//Action
////////////////////////////////////////Billing Modules ////////////////////////////////////	

public boolean validateBillingModuleisDisplayed() {
	WebElement BillingModule = PreparationOfReceipts.getBillingModule();
	return isElementVisible(BillingModule);
}

public void ClickonBillingModule() {
	delay();
	PreparationOfReceipts.getBillingModule().click();
}

public boolean validateBillingModuleisEnabled() {
	WebElement BillingModule = PreparationOfReceipts.getBillingModule();
	return isElementEnabled(BillingModule);
}

//////////////////////////////////Billing Counter //////////////////////////////
public boolean validateBillingCounterisDisplayed() {
	WebElement BillingCounter = PreparationOfReceipts.getBillingCounterSubModule();
	return BillingCounter.isDisplayed();
}
public boolean validateBillingCounterisenabled() {
	WebElement BillingCounter = PreparationOfReceipts.getBillingCounterSubModule();
	return BillingCounter.isEnabled();
}
public void clickonBillingCounter() {
	delay();
	PreparationOfReceipts.getBillingCounterSubModule().click();
}

/////////////////////////// Preparation Of Receipts link////////////////////////////
public boolean validatePreparationOfReceiptslinkisDisplayed() {
	WebElement PreparationOfReceiptslink = PreparationOfReceipts.getPreparationOfReceiptslink();
	return PreparationOfReceiptslink.isDisplayed();
}

public boolean validatePreparationOfReceiptslinkisEnabled() {
	WebElement PreparationOfReceiptslink = PreparationOfReceipts.getPreparationOfReceiptslink();
	return PreparationOfReceiptslink.isEnabled();

}
public void clickonPreparationOfReceiptslink() {
	delay();
	PreparationOfReceipts.getPreparationOfReceiptslink().click();
	
}

////////////////////////////////////PatientWithUHIDRadioButton////////////////////////////////
public boolean validatePatientWithUHIDRadioButtonisEnabled() {
	WebElement PatientWithUHIDRadioButton = PreparationOfReceipts.getPatientWithUHIDRadioButton();
	return PatientWithUHIDRadioButton.isEnabled();
}
public boolean validatePatientWithUHIDRadioButtonisSelected() {
	WebElement PatientWithUHIDRadioButton = PreparationOfReceipts.getPatientWithUHIDRadioButton();
	return PatientWithUHIDRadioButton.isSelected();

}
public void SelectPatientWithUHIDRadioButton() {
	delay();
	PreparationOfReceipts.getPatientWithUHIDRadioButton().click();
}

////////////////////////////////////SearchFilterOfPatientWithUHIDDropdown////////////////////////////////
public boolean validateSearchFilterOfPatientWithUHIDDropdownisEnabled() {
	WebElement SearchFilterOfPatientWithUHIDDrpdown = PreparationOfReceipts.getSearchFilterOfPatientWithUHIDDropdown();
	return SearchFilterOfPatientWithUHIDDrpdown.isEnabled();
}

public void SelectValuefromPatientWithUHIDDropdown() {
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getSearchFilterOfPatientWithUHIDDropdown(), "UHID");
}
public boolean validateSearchFilterOfPatientWithUHIDDropdownisMultiple() {
	return ISDropdownisMultiple(PreparationOfReceipts.getSearchFilterOfPatientWithUHIDDropdown());
}

/////////////////////////////////////////EnterPatientIDTextBox///////////////////////////
public boolean validateEnterPatientIDTextBoxisEnabled() {
	WebElement EnterPatientIDTextBox = PreparationOfReceipts.getEnterPatientIDTextBox();
	return EnterPatientIDTextBox.isEnabled();
}

///////////////////////////////////////SearchButton///////////////////////
public boolean validateSearchButtonisDisplayed() {
	WebElement SearchButton = PreparationOfReceipts.getSearchButton();
	return SearchButton.isDisplayed();
}
public boolean validateSearchButtonisEnabled() {
	WebElement SearchButton = PreparationOfReceipts.getSearchButton();
	return SearchButton.isEnabled();
}
public void clickonSearchButton() {
	delay();
	PreparationOfReceipts.getSearchButton().click();
}

public String ActualPatientIDValidationMessage() {
	String PatientIDValidationMessage = PreparationOfReceipts.getPatientIDValidationMessage().getText();
	return PatientIDValidationMessage;
}

public void EnterInvalidIDintothePatientIDTextBox(String InvalidID) {
	PreparationOfReceipts.getEnterPatientIDTextBox().sendKeys(InvalidID);
	delay();
	PreparationOfReceipts.getSearchButton().click();
}

public void EntervalidIDintothePatientIDTextBox(String ValidID) {
	PreparationOfReceipts.getEnterPatientIDTextBox().sendKeys(ValidID);
	delay();
	PreparationOfReceipts.getSearchButton().click();
}
public List<String> PatientInformation() {
List<String> PatientInformation = getTextForElementfromList(PreparationOfReceipts.getPatientInformationBox());
return PatientInformation;
}
////////////////////////////////////PatientTypeDropdown////////////////////////////////////////////
public boolean ValidatePatientTypeDropdownisEnabled() {
   WebElement PatientTypeDropdown = PreparationOfReceipts.getPatientTypeDropdown();
   return PatientTypeDropdown.isEnabled();
   
}
public boolean validatePatientTypeDropdwonisMultiple() {
	WebElement PatientTypeDropdown = PreparationOfReceipts.getPatientTypeDropdown();
	return ISDropdownisMultiple(PatientTypeDropdown);
}

public void TryingtoSelectValueFromPatientTypeDropdown() {
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getPatientTypeDropdown(),"Casualty Patient");
	
}

////////////////////////////////////BillingTypeDropdown////////////////////////////////////////////
public boolean ValidateBillingTypeDropdownisEnabled() {
WebElement PatientTypeDropdown = PreparationOfReceipts.getBillingTypeDropdown();
return PatientTypeDropdown.isEnabled();

}
public boolean validateBillingTypeDropdwonisMultiple() {
WebElement PatientTypeDropdown = PreparationOfReceipts.getBillingTypeDropdown();
return ISDropdownisMultiple(PatientTypeDropdown);
}

public void TryingtoSelectValueFromBillingTypeDropdown() {
delay();
selectDropdownVisibleElement(PreparationOfReceipts.getBillingTypeDropdown(),"General");
}

////////////////////////////////////MobileNumberTextBox////////////////////////////////////////////
public void MobileNumberTextBoxElementInfo() {
WebElement MobileNumberTextBox = PreparationOfReceipts.getMobileNumberTextBox();
elementInformation(MobileNumberTextBox);
}

/////////////////////////////////PaymentModeDropdown/////////////////////////////////////////////
public boolean ValidatePaymentModeDropdownisEnabled() {
	WebElement PaymentModeDropdown = PreparationOfReceipts.getPaymentModeDropdown();
	return PaymentModeDropdown.isEnabled();
}

public boolean ValidatePaymentModeDropdownismultiple() {
	WebElement PaymentModeDropdown = PreparationOfReceipts.getPaymentModeDropdown();
	return ISDropdownisMultiple(PaymentModeDropdown);
	
}
public void SelectValueFromPaymentModeDropdown() {
delay();
selectDropdownVisibleElement(PreparationOfReceipts.getPaymentModeDropdown(),"Cash");
}

/////////////////////////////////PayAdvanceCheckBox/////////////////////////////////////////////
public boolean ValidatePayAdvanceCheckBoxisEnabled() {
	WebElement PayAdvanceCheckBox = PreparationOfReceipts.getPayAdvanceCheckBox();
	return PayAdvanceCheckBox.isEnabled();
}

public boolean ValidatePayAdvanceCheckBoxisSelectable() {
	WebElement PayAdvanceCheckBox = PreparationOfReceipts.getPayAdvanceCheckBox();
	return PayAdvanceCheckBox.isSelected();
}

public void SelectPayAdvanceCheckBox() {
	PreparationOfReceipts.getPayAdvanceCheckBox().click();
}

/////////////////////////////////AddAdvanceForTextBox/////////////////////////////////////////////
public void ElementinfoOfAddAdvanceForTextBox() {
	WebElement AddAdvanceForTextBox = PreparationOfReceipts.getAddAdvanceForTextBox();
	elementInformation(AddAdvanceForTextBox);
}

/////////////////////////////////AddAdvanceAmountTextBox/////////////////////////////////////////////
public void ElementinfoOfAddAdvanceAmountTextBox() {
	WebElement AddAdvanceAmountTextBox = PreparationOfReceipts.getAddAdvanceAmountTextBox();
	elementInformation(AddAdvanceAmountTextBox);
}

////////////////////////////////////////////AddAdvanceButton//////////////////////////////////////
public boolean ValidateAddAdvanceButtonisEnabled() {
	WebElement AddAdvanceButton = PreparationOfReceipts.getAddAdvanceButton();
	return AddAdvanceButton.isEnabled();
}

public void ClickonAddAdvanceButton() {
	PreparationOfReceipts.getAddAdvanceButton().click();
}

/////////////////////////////////CancelbuttonOfPayAdvance/////////////////////////////////////////////
public boolean ValidateCancelbuttonOfPayAdvanceisEnabled() {
	WebElement CancelbuttonOfPayAdvance = PreparationOfReceipts.getCancelbuttonOfPayAdvance();
	return CancelbuttonOfPayAdvance.isEnabled();
}

public void ClickonCancelbuttonOfPayAdvance() {
	PreparationOfReceipts.getCancelbuttonOfPayAdvance().click();
}

/////////////////////////////////OtherServicesCheckBox/////////////////////////////////////////////
public boolean ValidateOtherServicesCheckBoxisEnabled() {
	WebElement OtherServicesCheckBox = PreparationOfReceipts.getOtherServicesCheckBox();
	return OtherServicesCheckBox.isEnabled();
}

public boolean ValidateOtherServicesCheckBoxisSelected() {
	WebElement OtherServicesCheckBox = PreparationOfReceipts.getOtherServicesCheckBox();
	return OtherServicesCheckBox.isSelected();
}

public void SelectOtherServiceCheckBox() {
	PreparationOfReceipts.getOtherServicesCheckBox().click();
}

/////////////////////////////////CancelButtonofOtherServices//////////////////////////////////////
public boolean ValidateCancelButtonofOtherServicesisEnabled() {
	WebElement CancelButtonofOtherServices = PreparationOfReceipts.getCancelButtonofOtherServices();
	return CancelButtonofOtherServices.isEnabled();
}

public void ClickonCancelButtonofOtherServices() {
	PreparationOfReceipts.getCancelButtonofOtherServices().click();
}
///////////////////////////////////HeadOfAccountDropdown///////////////////////////////////////
public boolean ValidateHeadOfAccountDropdownisEnabled() {
	WebElement HeadOfAccountDropdown = PreparationOfReceipts.getHeadOfAccountDropdown();
	return HeadOfAccountDropdown.isEnabled();
}
public boolean ValidateHeadOfAccountDropdownisMultiple() {
	WebElement HeadOfAccountDropdown = PreparationOfReceipts.getHeadOfAccountDropdown();
	return ISDropdownisMultiple(HeadOfAccountDropdown);
	
}
public void SelectValueFromHeadOfAccountDropdown() {
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getHeadOfAccountDropdown(),"Automation Head_Recepit");
}

///////////////////////////////////CategoryDropdown///////////////////////////////////////
public boolean ValidateCategoryDropdownDropdownisEnabled() {
	WebElement CategoryDropdown = PreparationOfReceipts.getCategoryDropdown();
	return CategoryDropdown.isEnabled();
}
public boolean ValidateCategoryDropdownDropdownisMultiple() {
	WebElement CategoryDropdown = PreparationOfReceipts.getCategoryDropdown();
	return ISDropdownisMultiple(CategoryDropdown);
	
}
public void SelectValueFromCategoryDropdown() {
	delay();
	selectDropdownVisibleElementWithCondition(PreparationOfReceipts.getCategoryDropdown(),"MICRO AUTOMATION TEST","AUTOMATION BILLING SERVICE");
}

///////////////////////////////////////////////FilterObservationTableTextBox/////////////////////////////
public void ElementinfoOFFilterObservationTableTextBox() {
	WebElement FilterObservationTable = PreparationOfReceipts.getFilterObservationTableTextBox();
	elementInformation(FilterObservationTable);
}

public void EnterValueintoFilterObservationTableTextBox(String Value) {
	PreparationOfReceipts.getFilterObservationTableTextBox().sendKeys(Value);
	delay();
	PreparationOfReceipts.getFilterObservationTableTextBox().clear();
}

///////////////////////////////////////////////QuantityTextBoxforService/////////////////////////////
public boolean validateQuantityTextBoxforServiceisEnabled() {
	WebElement QuantityTextBoxforService = PreparationOfReceipts.getQuantityTextBoxforService();
	return QuantityTextBoxforService.isEnabled();
}
public void EnterInvalidquantityintoQuantityTextBoxforService(String invalidQuantity) {
	delay();
	PreparationOfReceipts.getQuantityTextBoxforService().clear();
	delay();
	PreparationOfReceipts.getQuantityTextBoxforService().sendKeys(invalidQuantity);
}

public void EnterValidquantityintoQuantityTextBoxforService(String validQuantity) {
	delay();
	PreparationOfReceipts.getQuantityTextBoxforService().clear();
	delay();
	PreparationOfReceipts.getQuantityTextBoxforService().sendKeys(validQuantity);
}

/////////////////////////////////////Checkboxtoselectservices1////////////////////////////////////////
public boolean ValidateCheckboxtoselectservices1isEnabled() {
	WebElement Checkboxtoselectservices = PreparationOfReceipts.getCheckboxtoselectservices1();
	return Checkboxtoselectservices.isEnabled();
}
public boolean ValidateCheckboxtoselectservices1isSelected() {
	WebElement Checkboxtoselectservices = PreparationOfReceipts.getCheckboxtoselectservices1();
	return Checkboxtoselectservices.isSelected();
	
}
public void SelectCheckboxtoselectservices1() {
	PreparationOfReceipts.getCheckboxtoselectservices1().click();
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices2().click();
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices3().click();
}

///////////////////////////////////////////////AddToListButton///////////////////////////////////////////////
public boolean ValidateAddToListButtonisEnabled() {
	WebElement AddToListButton = PreparationOfReceipts.getAddToListButton();
	return AddToListButton.isEnabled();
}

public void ClickonAddToListButton() {
	delay();
	PreparationOfReceipts.getAddToListButton().click();
}

//////////////////////////CancelOptionForSelectedServices/////////////////////////////////////////
public boolean ValidateCancelOptionForSelectedServicesisEnabled() {
	WebElement CancelOptionForSelectedServices = PreparationOfReceipts.getCancelOptionForSelectedServices();
	return CancelOptionForSelectedServices.isEnabled();
}

public void SelectCancelOptionForSelectedServices() {
	PreparationOfReceipts.getCancelOptionForSelectedServices().click();
}
///////////////////////////////////IssuingDoctorNameDropdown//////////////////////////////////////
public boolean ValidateIssuingDoctorNameDropdownisDisplayed() {
	WebElement IssuingDoctorNameDropdown = PreparationOfReceipts.getIssuingDoctorNameDropdown();
	return IssuingDoctorNameDropdown.isDisplayed();
}
public void SelectValueFromIssuingDoctorNameDropdown() {
	delay();
	selectDropdownVisibleElementwithIndexValue(PreparationOfReceipts.getIssuingDoctorNameDropdown(),1);
}

public boolean ValidateIssuingDoctorNameDropdownisMultiple() {
	WebElement IssuingDoctorNameDropdown = PreparationOfReceipts.getIssuingDoctorNameDropdown();
	return ISDropdownisMultiple(IssuingDoctorNameDropdown);
	
}
///////////////////////////////////////////////////IsDoctorNameDisplayinTheReceiptCheckBox//////////////////
public boolean ValidateIsDoctorNameDisplayinTheReceiptCheckBoxisDisplayed() {
	WebElement IsDoctorNameDisplayinTheReceiptCheckBox = PreparationOfReceipts.getIsDoctorNameDisplayinTheReceiptCheckBox();
	return IsDoctorNameDisplayinTheReceiptCheckBox.isDisplayed();
}

public boolean ValidateIsDoctorNameDisplayinTheReceiptCheckBoxisSelected() {
	WebElement IsDoctorNameDisplayinTheReceiptCheckBox = PreparationOfReceipts.getIsDoctorNameDisplayinTheReceiptCheckBox();
	return IsDoctorNameDisplayinTheReceiptCheckBox.isEnabled();

}

public void SelectIsDoctorNameDisplayinTheReceiptCheckBox() {
	PreparationOfReceipts.getIsDoctorNameDisplayinTheReceiptCheckBox().click();
}
//////////////////////////////////////AddedServicesTable//////////////
public boolean ValidateAddedServicesTableisisplayed() {
	WebElement AddedServicesTable = PreparationOfReceipts.getAddedServicesTable();
	return AddedServicesTable.isDisplayed();
}

/////////////////////////////////////////PrepareReceiptbutton//////////////////////////////////////////////
public boolean ValidatePrepareReceiptbuttonisEnabled() {
	WebElement PrepareReceiptbutton = PreparationOfReceipts.getPrepareReceiptbutton();
	return PrepareReceiptbutton.isEnabled();
}
public void ClickonPrepareReceiptbutton() {
	delay();
	PreparationOfReceipts.getPrepareReceiptbutton().click();
}
////////////////////////////////ClickonPrepareRecepitbuttonWithoutSelectingProperBankDetails/////////
public void ClickonPrepareRecepitbuttonWithoutSelectingProperBankDetails(String ValidID,String AdvanceFor,String AdvanceAmount,String MobileNo) {
	delay();
	PreparationOfReceipts.getEnterPatientIDTextBox().sendKeys(ValidID);
	delay();
	PreparationOfReceipts.getSearchButton().click();
	delay();
	PreparationOfReceipts.getPayAdvanceCheckBox().click();
	delay();
	PreparationOfReceipts.getAddAdvanceForTextBox().sendKeys(AdvanceFor);
	delay();
	PreparationOfReceipts.getAddAdvanceAmountTextBox().sendKeys(AdvanceAmount);
	delay();
	PreparationOfReceipts.getAddAdvanceButton().click();
	delay();
	PreparationOfReceipts.getMobileNumberTextBox().sendKeys(MobileNo);
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getPaymentModeDropdown(),"Cheque");
	delay();
	delay();
    PreparationOfReceipts.getPrepareReceiptbutton().click();
}

////////////////////////////////CheckCancelOptionisWorkingforPayAdvanceServices/////////////////////////
public void CheckCancelOptionisWorkingforPayAdvanceServices(String ValidID,String AdvanceFor,String AdvanceAmount,String MobileNo,String ChequeNo) {
	delay();
	PreparationOfReceipts.getEnterPatientIDTextBox().sendKeys(ValidID);
	delay();
	PreparationOfReceipts.getSearchButton().click();
	delay();
	PreparationOfReceipts.getPayAdvanceCheckBox().click();
	delay();
	PreparationOfReceipts.getAddAdvanceForTextBox().sendKeys(AdvanceFor);
	delay();
	PreparationOfReceipts.getAddAdvanceAmountTextBox().sendKeys(AdvanceAmount);
	delay();
	PreparationOfReceipts.getAddAdvanceButton().click();
	delay();
	PreparationOfReceipts.getMobileNumberTextBox().sendKeys(MobileNo);
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getPaymentModeDropdown(),"Cheque");
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getBankNameDropdown(),"ALLAHABAD BANK");
    delay();
    PreparationOfReceipts.getChequeNoTextBox().sendKeys(ChequeNo);
    delay();
    PreparationOfReceipts.getCancelOptionForSelectedServices().click();
}

/////////////////////////////////PrepareRecepitForPayAdvanceOption////////////////////////////////
public void PrepareRecepitForPayAdvanceOption(String ValidID,String AdvanceFor,String AdvanceAmount,String MobileNo,String ChequeNo) {
	delay();
	PreparationOfReceipts.getEnterPatientIDTextBox().sendKeys(ValidID);
	delay();
	PreparationOfReceipts.getSearchButton().click();
	delay();
	PreparationOfReceipts.getPayAdvanceCheckBox().click();
	delay();
	PreparationOfReceipts.getAddAdvanceForTextBox().sendKeys(AdvanceFor);
	delay();
	PreparationOfReceipts.getAddAdvanceAmountTextBox().sendKeys(AdvanceAmount);
	delay();
	PreparationOfReceipts.getAddAdvanceButton().click();
	delay();
	PreparationOfReceipts.getMobileNumberTextBox().sendKeys(MobileNo);
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getPaymentModeDropdown(),"Cheque");
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getBankNameDropdown(),"ALLAHABAD BANK");
    delay();
    PreparationOfReceipts.getChequeNoTextBox().sendKeys(ChequeNo);
    delay();
    PreparationOfReceipts.getPrepareReceiptbutton().click();
    delay();
	
}
//////////////////////////////////////////ClickheretoprintMoneyReceiptbutton//////////////////////////////
public boolean ValidateClickheretoprintMoneyReceiptbuttonisEnabled() {
	WebElement ClickheretoprintMoneyReceiptbutton = PreparationOfReceipts.getClickheretoprintMoneyReceiptbutton();
return ClickheretoprintMoneyReceiptbutton.isEnabled();
}
public void ClickonClickheretoprintMoneyReceiptbutton() {
	
	PreparationOfReceipts.getClickheretoprintMoneyReceiptbutton().click();
}

//////////////////////////////////////////ClickheretoprintMoneyReceiptbutton//////////////////////////////
public boolean ValidateBackbuttoninRecepitisEnabled() {
WebElement BackbuttoninRecepit = PreparationOfReceipts.getBackbuttoninRecepit();
return BackbuttoninRecepit.isEnabled();
}
public void ClickonBackbuttoninRecepit() {
PreparationOfReceipts.getBackbuttoninRecepit().click();
}

//////////////////////////////////////////ClickonAddButtonofOtherServicesWithoutanyEntry///////////////////
public void ClickonAddButtonofOtherServicesWithoutanyEntry(String ValidID) {
	delay();
	PreparationOfReceipts.getEnterPatientIDTextBox().sendKeys(ValidID);
	delay();
	PreparationOfReceipts.getSearchButton().click();
	delay();
	PreparationOfReceipts.getOtherServicesCheckBox().click();
	delay();
	PreparationOfReceipts.getAddButtonofOtherServices().click();;	
}
//////////////////////////////////////////PrepareRecepitForOtherServices///////////////////
public void PrepareRecepitForOtherServices(String ItemName,String Quantity,String Rate,String CardHolderName,String CardNumber,String MobileNo) {
	delay();
	PreparationOfReceipts.getOtherServicesCheckBox().click();
	delay();
	PreparationOfReceipts.getItemNmeTextBoxofOtherServices().sendKeys(ItemName);
	delay();
	PreparationOfReceipts.getQuentityTextBoxofOtherServices().clear();
	delay();
	PreparationOfReceipts.getQuentityTextBoxofOtherServices().sendKeys(Quantity);
	delay();
	PreparationOfReceipts.getRateTextBoxofOtherServices().clear();
	delay();
	PreparationOfReceipts.getRateTextBoxofOtherServices().sendKeys(Rate);
	delay();
	PreparationOfReceipts.getCheckBoxofOtherServices().click();
	delay();
	PreparationOfReceipts.getAddButtonofOtherServices().click();
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getPaymentModeDropdown(),"Debit Card");
	delay();
	PreparationOfReceipts.getCardHolderNameTextBoxofDebitCard().sendKeys(CardHolderName);
	delay();
	PreparationOfReceipts.getCardNumberTextBoxofDebitCard().sendKeys(CardNumber);
	delay();
	PreparationOfReceipts.getMobileNumberTextBox().sendKeys(MobileNo);
	delay();
	PreparationOfReceipts.getPrepareReceiptbutton().click();
    delay();
	PreparationOfReceipts.getCloseOptiontoavoidprintReceit().click();


}
//////////////////////////////////////PrePareRecepitWithInValidMobileNumber//////////////////////////////
public void PrePareRecepitWithInValidMobileNumber(String ValidID,String InValidMobileNo) {
	delay();
	PreparationOfReceipts.getEnterPatientIDTextBox().sendKeys(ValidID);
	delay();
	PreparationOfReceipts.getSearchButton().click();
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getHeadOfAccountDropdown(),"Automation Head_Recepit");
	delay();
	selectDropdownVisibleElementWithCondition(PreparationOfReceipts.getCategoryDropdown(),"MICRO AUTOMATION TEST","AUTOMATION BILLING SERVICE");
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices1().click();
	delay();
	PreparationOfReceipts.getAddToListButton().click();
	delay();
	PreparationOfReceipts.getMobileNumberTextBox().sendKeys(InValidMobileNo);
	delay();
	PreparationOfReceipts.getPrepareReceiptbutton().click();
    delay();
   	PreparationOfReceipts.getCloseOptiontoavoidprintReceit().click();
}

//////////////////////////////////////PrePareRecepitWithValidMobileNumber//////////////////////////////
public void PrePareRecepitWithValidMobileNumber(String ValidID,String ValidMobileNo) {
	delay();
	PreparationOfReceipts.getEnterPatientIDTextBox().sendKeys(ValidID);
	delay();
	PreparationOfReceipts.getSearchButton().click();
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getHeadOfAccountDropdown(),"Automation Head_Recepit");
	delay();
	selectDropdownVisibleElementWithCondition(PreparationOfReceipts.getCategoryDropdown(),"MICRO AUTOMATION TEST","AUTOMATION BILLING SERVICE");
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices1().click();
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices2().click();
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices3().click();
	delay();
	PreparationOfReceipts.getAddToListButton().click();
	delay();
	PreparationOfReceipts.getMobileNumberTextBox().sendKeys(ValidMobileNo);
	delay();
	PreparationOfReceipts.getPrepareReceiptbutton().click();
    delay();
    PreparationOfReceipts.getClickheretoprintMoneyReceiptbutton().click();
    delay();
   // PreparationOfReceipts.getBackbuttoninRecepit().click();	
}
///////////////////////////////////////OutsideHospitalPatientRadioButton//////////////////////////
public boolean ValidateOutsideHospitalPatientRadioButtonisEnabled() {
	WebElement OutsideHospitalPatientRadioButton = PreparationOfReceipts.getOutsideHospitalPatientRadioButton();
	return OutsideHospitalPatientRadioButton.isEnabled();
}

public boolean ValidateOutsideHospitalPatientRadioButtonisSelected() {
	WebElement OutsideHospitalPatientRadioButton = PreparationOfReceipts.getOutsideHospitalPatientRadioButton();
	return OutsideHospitalPatientRadioButton.isSelected();
}

public void SelectOutsideHospitalPatientRadioButton() {
	PreparationOfReceipts.getOutsideHospitalPatientRadioButton().click();
}

////////////////////////////////////////////////UHIDTextBoxofOutsideHospitalPatient/////////////////////////
public boolean ValidateUHIDTextBoxofOutsideHospitalPatientisEnabled() {
	WebElement UHIDTextBoxofOutsideHospitalPatient = PreparationOfReceipts.getUHIDTextBoxofOutsideHospitalPatient();
	return UHIDTextBoxofOutsideHospitalPatient.isEnabled();
}

public void EnterDataintoUHIDTextBoxofOutsideHospitalPatient(String UHID) {
	PreparationOfReceipts.getUHIDTextBoxofOutsideHospitalPatient().sendKeys(UHID);
	delay();
	PreparationOfReceipts.getUHIDTextBoxofOutsideHospitalPatient().clear();
}

/////////////////////////////////////PrepareRecepitWithInvalidUHID//////////////////////////////////
public void PrepareRecepitWithInvalidUHID(String FirstName, String MiddleName , String LastName, String Age,String ValidMobileNo ) {
	PreparationOfReceipts.getFirstNameTextBox().sendKeys(FirstName);
	delay();
	PreparationOfReceipts.getMiddileNameTextBox().sendKeys(MiddleName);
	delay();
	PreparationOfReceipts.getLastNameTextBox().sendKeys(LastName);
	delay();
	PreparationOfReceipts.getAgeTextBox().sendKeys(Age);
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getHeadOfAccountDropdown(),"Automation Head_Recepit");
	delay();
	selectDropdownVisibleElementWithCondition(PreparationOfReceipts.getCategoryDropdown(),"MICRO AUTOMATION TEST","AUTOMATION BILLING SERVICE");
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices1().click();
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices2().click();
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices3().click();
	delay();
	PreparationOfReceipts.getAddToListButton().click();
	delay();
	PreparationOfReceipts.getMobileNumberTextBox().sendKeys(ValidMobileNo);
	delay();
	PreparationOfReceipts.getPrepareReceiptbuttonofOutsideHospitalPatient().click();
    delay();
    
}
///////////////////////////////////////////PrepareReceiptbuttonofOutsideHospitalPatient/////////////
public void ClickonPrepareReceiptbuttonofOutsideHospitalPatient() {
	PreparationOfReceipts.getPrepareReceiptbuttonofOutsideHospitalPatient().click();
}
/////////////////////////////////////////////CloseOptiontoavoidprintReceit///////////////////////////
public void ClickonCloseOptiontoavoidprintRecepit() {
	PreparationOfReceipts.getCloseOptiontoavoidprintReceit().click();
}

/////////////////////////////////////PrepareRecepitWithvalidUHID//////////////////////////////////
public void PrepareRecepitWithvalidUHID(String UHID,String FirstName, String MiddleName , String LastName, String Age,String ValidMobileNo) {
	delay();
	PreparationOfReceipts.getOutsideHospitalPatientRadioButton().click();
	delay();
	PreparationOfReceipts.getGetReceiptNoButton().click();
	delay();
	PreparationOfReceipts.getUHIDTextBoxofOutsideHospitalPatient().sendKeys(UHID);
	delay();
	PreparationOfReceipts.getFirstNameTextBox().sendKeys(FirstName);
	delay();
	PreparationOfReceipts.getMiddileNameTextBox().sendKeys(MiddleName);
	delay();
	PreparationOfReceipts.getLastNameTextBox().sendKeys(LastName);
	delay();
	PreparationOfReceipts.getAgeTextBox().sendKeys(Age);
	delay();
	selectDropdownVisibleElement(PreparationOfReceipts.getHeadOfAccountDropdown(),"Automation Head_Recepit");
	delay();
	selectDropdownVisibleElementWithCondition(PreparationOfReceipts.getCategoryDropdown(),"MICRO AUTOMATION TEST","AUTOMATION BILLING SERVICE");
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices1().click();
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices2().click();
	delay();
	PreparationOfReceipts.getCheckboxtoselectservices3().click();
	delay();
	PreparationOfReceipts.getAddToListButton().click();
	delay();
	PreparationOfReceipts.getMobileNumberTextBox().sendKeys(ValidMobileNo);
	delay();
	PreparationOfReceipts.getPrepareReceiptbuttonofOutsideHospitalPatient().click();
    delay();
    PreparationOfReceipts.getCloseOptiontoavoidprintReceit().click();
    delay();
	/*PreparationOfReceipts.getOutsideHospitalPatientRadioButton().click();
	delay();
	PreparationOfReceipts.getGetReceiptNoButton().click();*/


}







}
