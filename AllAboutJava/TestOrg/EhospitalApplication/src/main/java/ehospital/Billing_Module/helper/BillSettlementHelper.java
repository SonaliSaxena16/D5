package ehospital.Billing_Module.helper;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ehospital.Billing_Module.Locators.BillSettlementLocators;
import ehospital.Billing_Module.Locators.RegistrationFeeCancellationLocators;
import in.nic.ehospial.generic.BaseClass;

public class BillSettlementHelper extends BaseClass {
public WebDriver driver;
	
BillSettlementLocators BillSettlement;
						
						
public BillSettlementHelper(WebDriver driver) {
this.driver = driver;
BillSettlement = new BillSettlementLocators(driver);
}

//Action
//////////////////////////////////////////////Billsettlementlink///////////////////////////////
public boolean ValidateBillsettlementlinkisDisplayed() {
WebElement Billsettlement = BillSettlement.getBillsettlementlink();
return Billsettlement.isDisplayed();
}

public boolean ValidateBillsettlementlinkisEnabled() {
WebElement Billsettlement = BillSettlement.getBillsettlementlink();
return Billsettlement.isEnabled();
}

public void ClickonBillsettlementlink() {
	BillSettlement.getBillsettlementlink().click();
}
/////////////////////////////////SearchButton////////////////////////////////////
public boolean ValidateSearchButtonisEnabled() {
WebElement SearchButton = BillSettlement.getSearchButton();
return SearchButton.isEnabled();
}

public void ClickonSearchButton() {
	BillSettlement.getSearchButton().click();
}

//////////////////////////////////UHIDTextBox//////////////////////////////////////
public boolean ValidateUHIDTextBoxisEnabled() {
WebElement UHIDTextBox = BillSettlement.getUHIDTextBox();
return UHIDTextBox.isEnabled();
}

public void EnterinvalidIDintoUHIDTextboxandClickonSearchbutton(String InvalidID) {
delay();
BillSettlement.getUHIDTextBox().clear();
delay();
BillSettlement.getUHIDTextBox().sendKeys(InvalidID);
delay();
BillSettlement.getSearchButton().click();
}

public void CheckUHIDTextBoxlength(String length) {
delay();
BillSettlement.getUHIDTextBox().clear();
delay();
BillSettlement.getUHIDTextBox().sendKeys(length);
delay();
BillSettlement.getSearchButton().click();
}

public void EntervalidIDintoUHIDTextboxandClickonSearchbutton(String ValidID) {
delay();
BillSettlement.getUHIDTextBox().clear();
delay();
BillSettlement.getUHIDTextBox().sendKeys(ValidID);
delay();
BillSettlement.getBlankspaceforClick().click();
delay();
BillSettlement.getSearchButton().click();
}

////////////////////////////////////////PatientinfoDetail////////////////////////////////////
public boolean ValidatePatientinfoDetailisDisplayed() {
WebElement PatientinfoDetail = BillSettlement.getPatientinfoDetail();
return PatientinfoDetail.isDisplayed();
}

/////////////////////////////////AdmissionChargeCheckBox///////////////////////////
public boolean ValidateAdmissionChargeCheckBoxisEnabled() {
WebElement AdmissionCharge = BillSettlement.getAdmissionChargeCheckBox();
return AdmissionCharge.isEnabled();
}

public boolean ValidateAdmissionChargeCheckBoxisSelecetd() {
WebElement AdmissionCharge = BillSettlement.getAdmissionChargeCheckBox();
return AdmissionCharge.isSelected();
}

public void SelectAdmissionChargeCheckBox() {
	BillSettlement.getAdmissionChargeCheckBox().click();
}

///////////////////////////////////////AdmissionChargePopUp///////////////////////////////
public boolean ValidateAdmissionChargePopUpisDisplayed() {
WebElement AdmissionCharge = BillSettlement.getAdmissionChargePopUp();
return AdmissionCharge.isDisplayed();
}

/////////////////////////////////////CancelbuttonofAdmissionChargePopUp/////////////////////////////
public boolean ValidateCancelbuttonofAdmissionChargePopUpisEnabled() {
WebElement Cancelbutton = BillSettlement.getCancelbuttonofAdmissionChargePopUp();
return Cancelbutton.isEnabled();
}

public void ClickonCancelbuttonofAdmissionChargePopUp() {
	BillSettlement.getCancelbuttonofAdmissionChargePopUp().click();
	delay();
	BillSettlement.getAdmissionChargeCheckBox().click();
}

////////////////////////////////////////ServiceDropdownUnderAdmissionChargePopUp////////////////////////
public boolean ValidateServiceDropdownUnderAdmissionChargePopUpisEnabled() {
WebElement ServiceDropdown = BillSettlement.getServiceDropdownUnderAdmissionChargePopUp();
return ServiceDropdown.isEnabled();
}

public boolean ValidateServiceDropdownUnderAdmissionChargePopUpisMultiple() {
WebElement ServiceDropdown = BillSettlement.getServiceDropdownUnderAdmissionChargePopUp();
return ISDropdownisMultiple(ServiceDropdown);

}

public void SelectValuefromServiceDropdownUnderAdmissionChargePopUp() {
	delay();
	selectDropdownVisibleElement(BillSettlement.getServiceDropdownUnderAdmissionChargePopUp(),"PER DAY CHARGE");
}

/////////////////////////////////////////////////////AddbuttonofAdmissionChargePopUp///////////////////
public boolean ValidateAddbuttonofAdmissionChargePopUpisEnabled() {
WebElement Addbutton = BillSettlement.getAddbuttonofAdmissionChargePopUp();
return Addbutton.isEnabled();
}

public void ClickonAddbuttonofAdmissionChargePopUp() {
	BillSettlement.getAddbuttonofAdmissionChargePopUp().click();
}

/////////////////////////////////////////////RoomRentEntryCheckbox////////////////////////
public boolean ValidateRoomRentEntryCheckboxisEnabled() {
WebElement RoomRentEntry = BillSettlement.getRoomRentEntryCheckbox();
return RoomRentEntry.isEnabled();
}

public boolean ValidateRoomRentEntryCheckboxisSelecetd() {
WebElement RoomRentEntry = BillSettlement.getRoomRentEntryCheckbox();
return RoomRentEntry.isSelected();
}

public void SelectRoomRentEntryCheckbox() {
	BillSettlement.getRoomRentEntryCheckbox().click();
}

///////////////////////////////////////RoomRentEntryPopUp///////////////////////////////
public boolean ValidateRoomRentEntryPopUpisDisplayed() {
WebElement RoomRent = BillSettlement.getRoomRentEntryPopUp();
return RoomRent.isDisplayed();
}

//////////////////////////////////CancelbuttonofRoomRentEntryPopUp///////////////////////////////
public boolean ValidateCancelbuttonofRoomRentEntryPopUpisEnabled() {
WebElement Addbutton = BillSettlement.getCancelbuttonofRoomRentEntryPopUp();
return Addbutton.isEnabled();
}

public void ClickonCancelbuttonofRoomRentEntryPopUp() {
	BillSettlement.getCancelbuttonofRoomRentEntryPopUp().click();
	delay();
	BillSettlement.getRoomRentEntryCheckbox().click();

}

////////////////////////////////////////////////SelectCheckboxofRoomRentEntryPopUp///////////////
public boolean ValidateSelectCheckboxofRoomRentEntryPopUpisEnabled() {
WebElement RoomRentEntry = BillSettlement.getSelectCheckboxofRoomRentEntryPopUp();
return RoomRentEntry.isEnabled();
}

public boolean ValidateSelectCheckboxofRoomRentEntryPopUpisSelecetd() {
WebElement RoomRentEntry = BillSettlement.getSelectCheckboxofRoomRentEntryPopUp();
return RoomRentEntry.isSelected();
}

public void SelectCheckboxofRoomRentEntryPopUp() {
	BillSettlement.getSelectCheckboxofRoomRentEntryPopUp().click();
	delay();
	BillSettlement.getSelectCheckboxofRoomRentEntryPopUp().click();

}

///////////////////////////////RateTextBoxofRoomRentEntryPopUp/////////////////////////
public boolean ValidateRateTextBoxofRoomRentEntryPopUpisEnabled() {
WebElement RateTextBox = BillSettlement.getRateTextBoxofRoomRentEntryPopUp();
return RateTextBox.isEnabled();
}

public void EnterRateintoRateTextBoxofRoomRentEntryPopUp(String Rate) {
	BillSettlement.getRateTextBoxofRoomRentEntryPopUp().clear();
	delay();
	BillSettlement.getRateTextBoxofRoomRentEntryPopUp().sendKeys(Rate);
}

////////////////////////////////ServiceDropdownofRoomRentEntryPopUp///////////////////////////////////
public boolean ValidateServiceDropdownofRoomRentEntryPopUpisEnabled() {
WebElement ServiceDropdown = BillSettlement.getServiceDropdownofRoomRentEntryPopUp();
return ServiceDropdown.isEnabled();
}

public boolean ValidateServiceDropdownofRoomRentEntryPopUpisMultiple() {
WebElement ServiceDropdown = BillSettlement.getServiceDropdownofRoomRentEntryPopUp();
return ISDropdownisMultiple(ServiceDropdown);

}

public void SelectValuefromServiceDropdownofRoomRentEntryPopUp() {
	delay();
	selectDropdownVisibleElement(BillSettlement.getServiceDropdownofRoomRentEntryPopUp(),"BAD");
}
//////////////////////////AddButtonofRoomRentEntryPopUp//////////////////////////////////////
public boolean ValidateAddButtonofRoomRentEntryPopUpisEnabled() {
WebElement Addbutton = BillSettlement.getAddButtonofRoomRentEntryPopUp();
return Addbutton.isEnabled();
}

public void ClickonAddButtonofRoomRentEntryPopUp() {
	BillSettlement.getAddButtonofRoomRentEntryPopUp().click();
}

/////////////////////////////////DietChargeEntryCheckBox///////////////////////////////////////////
public boolean ValidateDietChargeEntryCheckBoxisEnabled() {
WebElement DietChargeEntry = BillSettlement.getDietChargeEntryCheckBox();
return DietChargeEntry.isEnabled();
}

public boolean ValidateDietChargeEntryCheckBoxisSelecetd() {
WebElement DietChargeEntry = BillSettlement.getDietChargeEntryCheckBox();
return DietChargeEntry.isSelected();
}

public void SelectDietChargeEntryCheckBox() {
	BillSettlement.getDietChargeEntryCheckBox().click();
}

///////////////////////////////////////DietChargeEntryPopup///////////////////////////////////////
public boolean ValidateDietChargeEntryPopupisDisplayed() {
WebElement DietChargeEntry = BillSettlement.getDietChargeEntryPopup();
return DietChargeEntry.isDisplayed();
}

//////////////////////////////////CancelbuttonofDietChargeEntryPopup///////////////////////////////
public boolean ValidateCancelbuttonofDietChargeEntryPopupisEnabled() {
WebElement Cancelbutton = BillSettlement.getCancelbuttonofDietChargeEntryPopup();
return Cancelbutton.isEnabled();
}

public void ClickonCancelbuttonofDietChargeEntryPopup() {
BillSettlement.getCancelbuttonofDietChargeEntryPopup().click();
delay();
BillSettlement.getDietChargeEntryCheckBox().click();

}
////////////////////////////////////////SelectCheckboxfDietChargeEntryPopup////////////////////////////////////
public boolean ValidateSelectCheckboxfDietChargeEntryPopupisEnabled() {
WebElement DietCharge = BillSettlement.getSelectCheckboxfDietChargeEntryPopup();
return DietCharge.isEnabled();
}

public boolean ValidateSelectCheckboxfDietChargeEntryPopupisSelected() {
WebElement DietCharge = BillSettlement.getSelectCheckboxfDietChargeEntryPopup();
return DietCharge.isSelected();
}

public void SelectCheckboxfDietChargeEntryPopup() {
	BillSettlement.getSelectCheckboxfDietChargeEntryPopup().click();
	delay();
	BillSettlement.getSelectCheckboxfDietChargeEntryPopup().click();

}

///////////////////////////////////RateTextboxoffDietChargeEntryPopup/////////////////////////////////
public boolean ValidateRateTextboxoffDietChargeEntryPopupisEnabled() {
WebElement RateTextBox = BillSettlement.getRateTextboxoffDietChargeEntryPopup();
return RateTextBox.isEnabled();
}

public void EnterRateintoRateTextboxoffDietChargeEntryPopup(String Rate) {
	BillSettlement.getRateTextboxoffDietChargeEntryPopup().clear();
	delay();
	BillSettlement.getRateTextboxoffDietChargeEntryPopup().sendKeys(Rate);
}

//////////////////////////////////////ServiceDropdownoffDietChargeEntryPopup/////////////////////////////////
public boolean ValidateServiceDropdownoffDietChargeEntryPopupisEnabled() {
WebElement ServiceDropdown = BillSettlement.getServiceDropdownoffDietChargeEntryPopup();
return ServiceDropdown.isEnabled();
}

public boolean ValidateServiceDropdownoffDietChargeEntryPopupisMultiple() {
WebElement ServiceDropdown = BillSettlement.getServiceDropdownoffDietChargeEntryPopup();
return ISDropdownisMultiple(ServiceDropdown);

}

public void SelectValuefromServiceDropdownoffDietChargeEntryPopup() {
	delay();
	selectDropdownVisibleElement(BillSettlement.getServiceDropdownoffDietChargeEntryPopup(),"DIET");
}

/////////////////////////////////////AddbuttonoffDietChargeEntryPopup////////////////////////
public boolean ValidateAddbuttonoffDietChargeEntryPopupisEnabled() {
WebElement Addbutton = BillSettlement.getAddbuttonoffDietChargeEntryPopup();
return Addbutton.isEnabled();
}

public void ClickonAddbuttonoffDietChargeEntryPopup() {
	BillSettlement.getAddbuttonoffDietChargeEntryPopup().click();
}

////////////////////////////////////////////BillingServiceEntryCheckbox////////////////////////////////
public boolean ValidateBillingServiceEntryCheckboxisEnabled() {
WebElement BillingServiceEntry = BillSettlement.getBillingServiceEntryCheckbox();
return BillingServiceEntry.isEnabled();
}

public boolean ValidateBillingServiceEntryCheckboxisSelecetd() {
WebElement BillingServiceEntry = BillSettlement.getBillingServiceEntryCheckbox();
return BillingServiceEntry.isSelected();
}

public void SelectBillingServiceEntryCheckbox() {
	BillSettlement.getBillingServiceEntryCheckbox().click();
}

///////////////////////////////////////BillingServiceEntryPopUp///////////////////////////////////////
public boolean ValidateBillingServiceEntryPopUpisDisplayed() {
WebElement BillingServiceEntry = BillSettlement.getBillingServiceEntryPopUp();
return BillingServiceEntry.isDisplayed();
}

//////////////////////////////////CancelimgofBillingServiceEntryPopUp///////////////////////////////
public boolean ValidateCancelimgofBillingServiceEntryPopUpisEnabled() {
WebElement Cancelbutton = BillSettlement.getCancelimgofBillingServiceEntryPopUp();
return Cancelbutton.isEnabled();
}

public void ClickonCancelimgofBillingServiceEntryPopUp() {
BillSettlement.getCancelimgofBillingServiceEntryPopUp().click();
delay();
BillSettlement.getBillingServiceEntryCheckbox().click();
}

/////////////////////////////////SelectCheckbocofBillingServiceEntryPopUp////////////////////////
public boolean ValidateSelectCheckbocofBillingServiceEntryPopUpisEnabled() {
WebElement BillingService = BillSettlement.getSelectCheckbocofBillingServiceEntryPopUp();
return BillingService.isEnabled();
}

public boolean ValidateSelectCheckbocofBillingServiceEntryPopUpisSelected() {
WebElement BillingService = BillSettlement.getSelectCheckbocofBillingServiceEntryPopUp();
return BillingService.isSelected();
}

public void SelectCheckbocofBillingServiceEntryPopUp() {
	BillSettlement.getSelectCheckbocofBillingServiceEntryPopUp().click();
}

///////////////////////////////CategoryDropdownofBillingServiceEntryPopUp/////////////////////////////
public boolean ValidateCategoryDropdownofBillingServiceEntryPopUpisEnabled() {
WebElement CategoryDropdown = BillSettlement.getCategoryDropdownofBillingServiceEntryPopUp();
return CategoryDropdown.isEnabled();
}

public boolean ValidateCategoryDropdownofBillingServiceEntryPopUpisMultiple() {
WebElement CategoryDropdown = BillSettlement.getCategoryDropdownofBillingServiceEntryPopUp();
return ISDropdownisMultiple(CategoryDropdown);

}

public void SelectValuefromCategoryDropdownofBillingServiceEntryPopUp() {
	delay();
selectDropdownVisibleElement(BillSettlement.getCategoryDropdownofBillingServiceEntryPopUp(),"MICRO AUTOMATION TEST");
}

/////////////////////////////////////////ServiceDropdownofBillingServiceEntryPopUp//////////////////////////
public boolean ValidateServiceDropdownofBillingServiceEntryPopUpisEnabled() {
WebElement ServiceDropdown = BillSettlement.getServiceDropdownofBillingServiceEntryPopUp();
return ServiceDropdown.isEnabled();
}

public boolean ValidateServiceDropdownofBillingServiceEntryPopUpisMultiple() {
WebElement ServiceDropdown = BillSettlement.getServiceDropdownofBillingServiceEntryPopUp();
return ISDropdownisMultiple(ServiceDropdown);

}

public void SelectValuefromServiceDropdownofBillingServiceEntryPopUp() {
	delay();
selectDropdownVisibleElement(BillSettlement.getServiceDropdownofBillingServiceEntryPopUp(),"ABG");
}

/////////////////////////////////////////////QuantityTextBoxofBillingServiceEntryPopUp///////////////////////
public boolean ValidateQuantityTextBoxofBillingServiceEntryPopUpisEnabled() {
WebElement QuantityTextBox = BillSettlement.getQuantityTextBoxofBillingServiceEntryPopUp();
return QuantityTextBox.isEnabled();
}

public void EnterInvalidRateintoQuantityTextBoxofBillingServiceEntryPopUp(String InvalidQuantity) {
	BillSettlement.getQuantityTextBoxofBillingServiceEntryPopUp().clear();
	delay();
	BillSettlement.getQuantityTextBoxofBillingServiceEntryPopUp().sendKeys(InvalidQuantity);

}

public void EnterValidRateintoQuantityTextBoxofBillingServiceEntryPopUp(String ValidQuantity) {
	BillSettlement.getQuantityTextBoxofBillingServiceEntryPopUp().clear();
	delay();
	BillSettlement.getQuantityTextBoxofBillingServiceEntryPopUp().sendKeys(ValidQuantity);

}

/////////////////////////////////RateTextBoxofBillingServiceEntryPopUp////////////////////////////////
public boolean ValidateRateTextBoxofBillingServiceEntryPopUpisEnabled() {
WebElement RateTextBox = BillSettlement.getRateTextBoxofBillingServiceEntryPopUp();
return RateTextBox.isEnabled();
}

public void EnterInvalidRateintoRateTextBoxofBillingServiceEntryPopUp(String InvalidRate) {
	BillSettlement.getRateTextBoxofBillingServiceEntryPopUp().clear();
	delay();
	BillSettlement.getRateTextBoxofBillingServiceEntryPopUp().sendKeys(InvalidRate);

}
public void EnterValidRateintoRateTextBoxofBillingServiceEntryPopUp(String ValidRate) {
	BillSettlement.getRateTextBoxofBillingServiceEntryPopUp().clear();
	delay();
	BillSettlement.getRateTextBoxofBillingServiceEntryPopUp().sendKeys(ValidRate);

}

////////////////////////////////AddButtonofBillingServiceEntryPopUp///////////////////////
public boolean ValidateAddButtonofBillingServiceEntryPopUpisEnabled() {
WebElement Addbutton = BillSettlement.getAddButtonofBillingServiceEntryPopUp();
return Addbutton.isEnabled();
}

public void ClickonAddButtonofBillingServiceEntryPopUp() {
	BillSettlement.getAddButtonofBillingServiceEntryPopUp().click();
}

////////////////////////////////////////////OtherServiceEntryCheckbox////////////////////////////////
public boolean ValidateOtherServiceEntryCheckboxisEnabled() {
WebElement OtherServiceEntry = BillSettlement.getOtherServiceEntryCheckbox();
return OtherServiceEntry.isEnabled();
}

public boolean ValidateOtherServiceEntryCheckboxisSelecetd() {
WebElement OtherServiceEntry = BillSettlement.getOtherServiceEntryCheckbox();
return OtherServiceEntry.isSelected();
}

public void SelectOtherServiceEntryCheckbox() {
BillSettlement.getOtherServiceEntryCheckbox().click();
}

///////////////////////////////////////OtherServiceEntryPopUp///////////////////////////////////////
public boolean ValidateOtherServiceEntryPopUpisDisplayed() {
WebElement OtherServiceEntry = BillSettlement.getOtherServiceEntryPopUp();
return OtherServiceEntry.isDisplayed();
}

///////////////////////////////CancelimgofOtherServiceEntryPopUp////////////////////////////////
public boolean ValidateCancelimgofOtherServiceEntryPopUpisEnabled() {
WebElement Cancelbutton = BillSettlement.getCancelimgofOtherServiceEntryPopUp();
return Cancelbutton.isEnabled();
}

public void ClickonCancelimgofOtherServiceEntryPopUp() {
BillSettlement.getCancelimgofOtherServiceEntryPopUp().click();
delay();
BillSettlement.getOtherServiceEntryCheckbox().click();
}

//////////////////////////////SelectCheckboxofOtherServiceEntryPopUp////////////////////////////////
public boolean ValidateSelectCheckboxofOtherServiceEntryPopUpisEnabled() {
WebElement SelectCheckbox = BillSettlement.getSelectCheckboxofOtherServiceEntryPopUp();
return SelectCheckbox.isEnabled();
}

public boolean ValidateSelectCheckboxofOtherServiceEntryPopUpisSelected() {
WebElement SelectCheckbox = BillSettlement.getSelectCheckboxofOtherServiceEntryPopUp();
return SelectCheckbox.isSelected();
}

public void SelectCheckboxofOtherServiceEntryPopUp() {
	BillSettlement.getSelectCheckboxofOtherServiceEntryPopUp().click();
}

/////////////////////////CategorytextBoxofOtherServiceEntryPopUp/////////////////////////////////////
public boolean ValidateCategorytextBoxofOtherServiceEntryPopUpisEnabled() {
WebElement CategoryTextBox = BillSettlement.getCategorytextBoxofOtherServiceEntryPopUp();
return CategoryTextBox.isEnabled();
}

public void EnterInvalidCategoryintotheCategoryTextBox(String InvalidCategory) {
BillSettlement.getCategorytextBoxofOtherServiceEntryPopUp().clear();
delay();
BillSettlement.getCategorytextBoxofOtherServiceEntryPopUp().sendKeys(InvalidCategory);

}

public void EnterValidCategoryintotheCategoryTextBox(String ValidCategory) {
BillSettlement.getCategorytextBoxofOtherServiceEntryPopUp().clear();
delay();
BillSettlement.getCategorytextBoxofOtherServiceEntryPopUp().sendKeys(ValidCategory);

}
	
///////////////////////////////ServicetextBoxofOtherServiceEntryPopUp/////////////////////////
public boolean ValidateServicetextBoxofOtherServiceEntryPopUpisEnabled() {
WebElement ServiceTextBox = BillSettlement.getServicetextBoxofOtherServiceEntryPopUp();
return ServiceTextBox.isEnabled();
}

public void EnterInvalidServiceintotheServiceTextBox(String InvalidService) {
BillSettlement.getServicetextBoxofOtherServiceEntryPopUp().clear();
delay();
BillSettlement.getServicetextBoxofOtherServiceEntryPopUp().sendKeys(InvalidService);

}

public void EnterValidServiceintotheServiceTextBox(String ValidService) {
BillSettlement.getServicetextBoxofOtherServiceEntryPopUp().clear();
delay();
BillSettlement.getServicetextBoxofOtherServiceEntryPopUp().sendKeys(ValidService);

}

/////////////////////////QuantitytextBoxofOtherServiceEntryPopUp////////////////////
public boolean ValidateQuantitytextBoxofOtherServiceEntryPopUpisEnabled() {
WebElement QuantityTextBox = BillSettlement.getQuantitytextBoxofOtherServiceEntryPopUp();
return QuantityTextBox.isEnabled();
}

public void EnterValidQuantityintotheQuantityTextBox(String ValidQuantity) {
BillSettlement.getQuantitytextBoxofOtherServiceEntryPopUp().clear();
delay();
BillSettlement.getQuantitytextBoxofOtherServiceEntryPopUp().sendKeys(ValidQuantity);
}

/////////////////////////////////////RatetextBoxofOtherServiceEntryPopUp/////////////////////////
public boolean ValidateRatetextBoxofOtherServiceEntryPopUpisEnabled() {
WebElement RateTextBox = BillSettlement.getRatetextBoxofOtherServiceEntryPopUp();
return RateTextBox.isEnabled();
}

public void EnterValidRateintotheRateTextBox(String ValidQuantity) {
BillSettlement.getRatetextBoxofOtherServiceEntryPopUp().clear();
delay();
BillSettlement.getRatetextBoxofOtherServiceEntryPopUp().sendKeys(ValidQuantity);
}

//////////////////////////////////AddbuttonofOtherServiceEntryPopUp////////////////////////////////
public boolean ValidateAddbuttonofOtherServiceEntryPopUpisEnabled() {
WebElement Addbutton = BillSettlement.getAddbuttonofOtherServiceEntryPopUp();
return Addbutton.isEnabled();
}

public void ClickonAddbuttonofOtherServiceEntryPopUp() {
	BillSettlement.getAddbuttonofOtherServiceEntryPopUp().click();
}

//////////////////////////TestDoneorNotDropdown///////////////////////////////////////////////////////////
public boolean ValidateTestDoneorNotDropdownisEnabled() {
WebElement TestDoneorNotDropdown = BillSettlement.getTestDoneorNotDropdown();
return TestDoneorNotDropdown.isEnabled();
}

public boolean ValidateTestDoneorNotDropdownisMultiple() {
WebElement TestDoneorNotDropdown = BillSettlement.getTestDoneorNotDropdown();
return ISDropdownisMultiple(TestDoneorNotDropdown);

}

public void SelectValuefromTestDoneorNotDropdown() {
	delay();
	selectDropdownVisibleElement(BillSettlement.getTestDoneorNotDropdown(),"Test Not Done");
}

///////////////////////////////FirstCheckboxofRecommendedTestDetails/////////////////////////////////////////////
public boolean ValidateFirstCheckboxofRecommendedTestDetailsisEnabled() {
WebElement FirstCheckBox = BillSettlement.getFirstCheckboxofRecommendedTestDetails();
return FirstCheckBox.isEnabled();
}

public boolean ValidateFirstCheckboxofRecommendedTestDetailsisSelecetd() {
WebElement FirstCheckBox = BillSettlement.getFirstCheckboxofRecommendedTestDetails();
return FirstCheckBox.isSelected();
}

public void SelectCheckboxofRecommendedTestDetails() {
	BillSettlement.getFirstCheckboxofRecommendedTestDetails().click();
	delay();
	BillSettlement.getSecondCheckboxofRecommendedTestDetails().click();
	delay();
	BillSettlement.getThirdCheckboxofRecommendedTestDetails().click();
}

/////////////////////////StoretheRecommendedTestDetailsForVerification////////////////////

public List<String> RecommendedTestDetailsForVerification() {
List<WebElement> RecommendedTest = BillSettlement.getRecommendedTestDetailsForVerification();


List<String> TextofRecommendedTest= new ArrayList<String>();

TextofRecommendedTest.add(RecommendedTest.get(1).getText());//Category Name
TextofRecommendedTest.add(RecommendedTest.get(4).getText());//Quantity
return TextofRecommendedTest;
}

////////////////////////////ConcessionCalculatorImgbutton//////////////////////////////////////
public boolean ValidateConcessionCalculatorImgbuttonisEnabled() {
WebElement ConcessionCalculator = BillSettlement.getConcessionCalculatorImgbutton();
return ConcessionCalculator.isEnabled();
}

public void ClickonConcessionCalculatorImgbutton() {
	BillSettlement.getConcessionCalculatorImgbutton().click();
}

//////////////////////////////////ConcessionCalculatorPopUp/////////////////////////////
public boolean ValidateConcessionCalculatorPopUpisDisplayed() {
WebElement ConcessionCalculator = BillSettlement.getConcessionCalculatorPopUp();
return ConcessionCalculator.isDisplayed();
}

///////////////////////////////////CancelImgofConcessionCalculatorPopUp//////////////////////
public boolean ValidateCancelImgofConcessionCalculatorPopUpisEnabled() {
WebElement Cancelbutton = BillSettlement.getCancelImgofConcessionCalculatorPopUp();
return Cancelbutton.isEnabled();
}

public void ClickonCancelImgofConcessionCalculatorPopUp() {
	BillSettlement.getCancelImgofConcessionCalculatorPopUp().click();
	delay();
	BillSettlement.getConcessionCalculatorImgbutton().click();
}

//////////////////////////AmountTextBoxofConcessionCalculatorPopUp////////////////////////////
public boolean ValidateAmountTextBoxofConcessionCalculatorPopUpisEnabled() {
WebElement AmountTextBox = BillSettlement.getAmountTextBoxofConcessionCalculatorPopUp();
return AmountTextBox.isEnabled();
}

public void EnterValidAmountintotheAmountTextBox(String ValidAmount) {
BillSettlement.getAmountTextBoxofConcessionCalculatorPopUp().clear();
delay();
BillSettlement.getAmountTextBoxofConcessionCalculatorPopUp().sendKeys(ValidAmount);

}

////////////////////////////DisscountTypeDropdownofConcessionCalculatorPopUp////////////////////
public boolean ValidateDisscountTypeDropdownofConcessionCalculatorPopUpisEnabled() {
WebElement DisscountType = BillSettlement.getDisscountTypeDropdownofConcessionCalculatorPopUp();
return DisscountType.isEnabled();
}

public boolean ValidateDisscountTypeDropdownofConcessionCalculatorPopUpisMultiple() {
WebElement DisscountType = BillSettlement.getDisscountTypeDropdownofConcessionCalculatorPopUp();
return ISDropdownisMultiple(DisscountType);

}

public void SelectValuefromDisscountTypeDropdownofConcessionCalculatorPopUp() {
	delay();
	selectDropdownVisibleElement(BillSettlement.getDisscountTypeDropdownofConcessionCalculatorPopUp(),"Percent(%)");
}

//////////////////////////////DisscountAmountTextboxofConcessionCalculatorPopUp////////////////////////////
public boolean ValidateDisscountAmountTextboxofConcessionCalculatorPopUpisEnabled() {
WebElement DisscountAmountTextBox = BillSettlement.getDisscountAmountTextboxofConcessionCalculatorPopUp();
return DisscountAmountTextBox.isEnabled();
}

public void EnterInValidAmountintotheDisscountAmountTextBox(String InValidAmount) {
BillSettlement.getDisscountAmountTextboxofConcessionCalculatorPopUp().clear();
delay();
BillSettlement.getDisscountAmountTextboxofConcessionCalculatorPopUp().sendKeys(InValidAmount);
delay();
BillSettlement.getNetDisscountTextboxofConcessionCalculatorPopUp().click();;

}

public void EnterValidAmountintotheDisscountAmountTextBox(String ValidAmount) {
BillSettlement.getDisscountAmountTextboxofConcessionCalculatorPopUp().clear();
delay();
BillSettlement.getDisscountAmountTextboxofConcessionCalculatorPopUp().sendKeys(ValidAmount);
}

/////////////////////////////////NetDisscountTextboxofConcessionCalculatorPopUp//////////////////////
public boolean ValidateNetDisscountTextboxofConcessionCalculatorPopUpisEnabled() {
WebElement NetDisscountTextBox = BillSettlement.getNetDisscountTextboxofConcessionCalculatorPopUp();
return NetDisscountTextBox.isEnabled();
}

public void EnterInValidAmountintotheNetDisscountTextBox(String InValidAmount) {
BillSettlement.getNetDisscountTextboxofConcessionCalculatorPopUp().clear();
delay();
BillSettlement.getNetDisscountTextboxofConcessionCalculatorPopUp().sendKeys(InValidAmount);
}

public void EnterValidAmountintotheNetDisscountTextBox(String ValidAmount) {
BillSettlement.getNetDisscountTextboxofConcessionCalculatorPopUp().clear();
delay();
BillSettlement.getNetDisscountTextboxofConcessionCalculatorPopUp().sendKeys(ValidAmount);
}

/////////////////SelcetAnotherDisscountTypeFromtheDropdown/////////////////////////////
public void SelcetAnotherDisscountTypeFromtheDropdownandEnterAmount(String ValidAmount ) {
delay();
selectDropdownVisibleElement(BillSettlement.getFlatDisscountTypeofConcessionCalculatorPopUp(),"Flat");
delay();
BillSettlement.getSecondDisscountAmountTextBoxofConcessionCalculatorPopUp().clear();
delay();
BillSettlement.getSecondDisscountAmountTextBoxofConcessionCalculatorPopUp().sendKeys(ValidAmount);
}
////////////////////////////////////TotalAmountTextBoxofConcessionCalculatorPopUp////////////////////
public boolean ValidateTotalAmountTextBoxofConcessionCalculatorPopUpisEnabled() {
WebElement TotalAmountTextBox = BillSettlement.getTotalAmountTextBoxofConcessionCalculatorPopUp();
return TotalAmountTextBox.isEnabled();
}

/////////////////////////DiscountAmountTextBoxofConcessionCalculatorPopUp///////////////////////////////
public boolean ValidateDiscountAmountTextBoxofConcessionCalculatorPopUpisEnabled() {
WebElement DiscountAmountTextBox = BillSettlement.getDiscountAmountTextBoxofConcessionCalculatorPopUp();
return DiscountAmountTextBox.isEnabled();
}

/////////////////////////StoretheRecommendedTestDetailsForVerificationinConcessionPopUp////////////////////

public List<String> RecommendedTestDetailsForVerificationinConcessionPopUp() {
List<WebElement> RecommendedTest = BillSettlement.getRecommendedTestDetailsForVerificationinConcessionPopUp();


List<String> TextofRecommendedTest= new ArrayList<String>();

TextofRecommendedTest.add(RecommendedTest.get(1).getText());//Category Name
TextofRecommendedTest.add(RecommendedTest.get(2).getText());//Quantity
return TextofRecommendedTest;
}

public void VerifyRecommendedTestDetails() {
Assert.assertEquals(RecommendedTestDetailsForVerification(), RecommendedTestDetailsForVerificationinConcessionPopUp(),"Data Validation Not matched");

}

/////////////////CalculateConcessionbuttonofConcessionCalculatorPopUp////////////////////////////////////
public boolean ValidateCalculateConcessionbuttonofConcessionCalculatorPopUpisEnabled() {
WebElement CalculateConcession = BillSettlement.getCalculateConcessionbuttonofConcessionCalculatorPopUp();
return CalculateConcession.isEnabled();
}

public void ClickonCalculateConcessionbuttonofConcessionCalculatorPopUp() {
	BillSettlement.getCalculateConcessionbuttonofConcessionCalculatorPopUp().click();
}

//////////////////////////////////NextButton/////////////////////////////////////////////////
public boolean ValidateNextButtonisEnabled() {
WebElement NextButton = BillSettlement.getNextButton();
return NextButton.isEnabled();
}

public void ClickonNextButton() {
	BillSettlement.getNextButton().click();
}

///////////////////////RemarksTextArea///////////////////////////////////////////////////////
public boolean ValidateRemarksTextAreaisEnabled() {
WebElement NextButton = BillSettlement.getRemarksTextArea();
return NextButton.isEnabled();
}

public void EnterRemarksintoRemarksTextArea(String Remarks) {
	BillSettlement.getRemarksTextArea().clear();
	delay();
	BillSettlement.getRemarksTextArea().sendKeys(Remarks);
}

////////////////////////////////////SettleBillWithoutDischargeButton///////////////////////////////
public boolean ValidateSettleBillWithoutDischargeButtonisEnabled() {
WebElement NextButton = BillSettlement.getSettleBillWithoutDischargeButton();
return NextButton.isEnabled();
}

public void ClickonSettleBillWithoutDischargeButton() {
	BillSettlement.getSettleBillWithoutDischargeButton().click();
}

//////////////////////////////////GoForApprovallink///////////////////////////////////////////////////
public boolean ValidateGoForApprovallinkisdisplayed() {
WebElement GoForApprovallink = BillSettlement.getGoForApprovallink();
return GoForApprovallink.isDisplayed();
}

public boolean ValidateGoForApprovallinkisEnabled() {
WebElement GoForApprovallink = BillSettlement.getGoForApprovallink();
return GoForApprovallink.isEnabled();
}

public void ClickonGoForApprovallink() {
	BillSettlement.getGoForApprovallink().click();
}

/////////////////////////////////UHIDRadiobutton///////////////////////////
public boolean ValidateUHIDRadiobuttonisEnabled() {
WebElement UHIDRadiobutton = BillSettlement.getUHIDRadiobutton();
return UHIDRadiobutton.isEnabled();
}

public boolean ValidateUHIDRadiobuttonisSelecetd() {
WebElement UHIDRadiobutton = BillSettlement.getUHIDRadiobutton();
return UHIDRadiobutton.isSelected();
}

public void SelectUHIDRadiobutton() {
BillSettlement.getUHIDRadiobutton().click();
}

///////////////////////////Searchbutton/////////////////////////////////
public boolean ValidateSearchbuttonisEnabled() {
WebElement Searchbutton = BillSettlement.getSearchButtonofSETTLEMENTAPPROVAL();
return Searchbutton.isEnabled();
}

public void SelectSearchbutton() {
BillSettlement.getSearchButtonofSETTLEMENTAPPROVAL().click();
}

//////////////////////////////EnterUHIDTextBox////////////////////////////////////////////
public boolean ValidateEnterUHIDTextBoxisEnabled() {
WebElement UHID = BillSettlement.getEnterUHIDTextBox();
return UHID.isEnabled();
}

public void EnterInvalidUHIDintotheTextBox(String InvalidUHID) {
	BillSettlement.getEnterUHIDTextBox().clear();
	delay();
	BillSettlement.getEnterUHIDTextBox().sendKeys(InvalidUHID);
	delay();
	BillSettlement.getSearchButtonofSETTLEMENTAPPROVAL().click();
}

public void EnterValidUHIDintotheTextBox(String ValidUHID) {
	BillSettlement.getEnterUHIDTextBox().clear();
	delay();
	BillSettlement.getEnterUHIDTextBox().sendKeys(ValidUHID);
	delay();
	BillSettlement.getSearchButtonofSETTLEMENTAPPROVAL().click();
}

public void EnterInvalidlengthofUHIDintotheTextBox(String InvalidlengthofID) {
	BillSettlement.getEnterUHIDTextBox().clear();
	delay();
	BillSettlement.getEnterUHIDTextBox().sendKeys(InvalidlengthofID);
    delay();
	BillSettlement.getSearchButtonofSETTLEMENTAPPROVAL().click();
}

///////////////////////////////////PaymentModeDropdown//////////////////////////////////////////////
public boolean ValidatePaymentModeDropdownisEnabled() {
WebElement PaymentMode = BillSettlement.getPaymentModeDropdown();
return PaymentMode.isEnabled();
}

public boolean ValidatePaymentModeDropdownisMultiple() {
WebElement PaymentMode = BillSettlement.getPaymentModeDropdown();
return ISDropdownisMultiple(PaymentMode);
}

public void SelectValuefromPaymentModeDropdown() {
	delay();
	selectDropdownVisibleElement(BillSettlement.getPaymentModeDropdown(),"Cash");
	delay();
	BillSettlement.getSearchButtonofSETTLEMENTAPPROVAL().click();
}

//////////////////////////////////DetailsReportTable////////////////////////////
public boolean ValidateDetailsReportTableisDisplayed() {
WebElement DetailsReport = BillSettlement.getPaymentModeDropdown();
return DetailsReport.isDisplayed();
}

/////////////////////////////////////AdmissionIDRadiobutton////////////////////////////
public boolean ValidateAdmissionIDRadiobuttonisEnabled() {
WebElement AdmissionIDRadiobutton = BillSettlement.getAdmissionIDRadiobutton();
return AdmissionIDRadiobutton.isEnabled();
}

public boolean ValidateAdmissionIDRadiobuttonisSelecetd() {
WebElement AdmissionIDRadiobutton = BillSettlement.getAdmissionIDRadiobutton();
return AdmissionIDRadiobutton.isSelected();
}

public void SelectAdmissionIDRadiobutton() {
BillSettlement.getAdmissionIDRadiobutton().click();
}

/////////////////////////////////////AdmissionIDTextBox//////////////////////////
public boolean ValidateAdmissionIDTextBoxisEnabled() {
WebElement AdmissionID = BillSettlement.getAdmissionIDTextBox();
return AdmissionID.isEnabled();
}

public void EnterInvalidAdmissionIDintotheTextBox(String InvalidAdmissionID) {
	BillSettlement.getAdmissionIDTextBox().clear();
	delay();
	BillSettlement.getAdmissionIDTextBox().sendKeys(InvalidAdmissionID);
	delay();
	BillSettlement.getSearchButtonofSETTLEMENTAPPROVAL().click();
}

public void EnterValidAdmissionIDintotheTextBox(String ValidAdmissionID) {
	BillSettlement.getAdmissionIDTextBox().clear();
	delay();
	BillSettlement.getAdmissionIDTextBox().sendKeys(ValidAdmissionID);
	delay();
	BillSettlement.getSearchButtonofSETTLEMENTAPPROVAL().click();
}

////////////////////////////DateRadiobutton///////////////////////////////
public boolean ValidateDateRadiobuttonisEnabled() {
WebElement DateRadiobutton = BillSettlement.getDateRadiobutton();
return DateRadiobutton.isEnabled();
}

public boolean ValidateDateRadiobuttonisSelecetd() {
WebElement DateRadiobutton = BillSettlement.getDateRadiobutton();
return DateRadiobutton.isSelected();
}

public void SelectDateRadiobutton() {
BillSettlement.getDateRadiobutton().click();
delay();
selectDropdownVisibleElement(BillSettlement.getPaymentModeDropdown(),"Cash");
delay();
BillSettlement.getSearchButtonofSETTLEMENTAPPROVAL().click();

}
/////////////////////////Openbutton////////////////////////////////
public boolean ValidateOpenbuttonisEnabled() {
WebElement Openbutton = BillSettlement.getOpenbutton();
return Openbutton.isEnabled();
}

public void ClickonOpenbutton() {
BillSettlement.getOpenbutton().click();
}

////////////////////////////Cancelbutton////////////////////////////////
public boolean ValidateCancelbuttonisEnabled() {
WebElement Cancelbutton = BillSettlement.getCancelbutton();
return Cancelbutton.isEnabled();
}

public void ClickonCancelbutton() {
BillSettlement.getCancelbutton().click();
}

////////////////////////////////Selectbutton//////////////////////////////
public boolean ValidateSelectbuttonisEnabled() {
WebElement Selectbutton = BillSettlement.getSelectbutton();
return Selectbutton.isEnabled();
}

public void ClickonSelectbutton() {
BillSettlement.getSelectbutton().click();
delay();
BillSettlement.getCancelbutton().click();
delay();
BillSettlement.getSelectbutton().click();

}
////////////////////////////////PatientDetailsDuringSettlement/////////////////////////////
public List<String> PatientDetailsDuringSettlementForVerification() {
List<WebElement> PatientDetails = BillSettlement.getPatientDetailsDuringSettlement();


List<String> TextofPatientDetails= new ArrayList<String>();

TextofPatientDetails.add(PatientDetails.get(1).getText());//Patient Name
TextofPatientDetails.add(PatientDetails.get(2).getText());//Age
TextofPatientDetails.add(PatientDetails.get(3).getText());//Sex
TextofPatientDetails.add(PatientDetails.get(4).getText());//AdmissionID
return TextofPatientDetails;
}

/////////////////////////////////////PatientDetailsDuringSettlementApproval/////////////////
public List<String> PatientDetailsDuringSettlementApprovalForVerification() {
List<WebElement> PatientDetails = BillSettlement.getPatientDetailsDuringSettlementApproval();


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
WebElement Generatebutton = BillSettlement.getGeneratebutton();
return Generatebutton.isEnabled();
}

public void ClickonGeneratebutton() {
BillSettlement.getGeneratebutton().click();
delay();
BillSettlement.getPrintMoneyReceiptbutton().click();
}

////////////////////////////////////PatientDetailsonBillSettleMentPage//////////////////////////////
public List<String> PatientDetailsonBillSettleMentPageForVerification() {
List<WebElement> PatientDetails = BillSettlement.getPatientDetailsonBillSettleMentPage();


List<String> TextofPatientDetails= new ArrayList<String>();

TextofPatientDetails.add(PatientDetails.get(17).getText());//Patient Name
TextofPatientDetails.add(PatientDetails.get(19).getText());//Sex
return TextofPatientDetails;
}

////////////////////////////////////PatientDetailsonBillSettleMentPrintPage////////////////////
public List<String> PatientDetailsonBillSettleMentPrintPageForVerification() {
List<WebElement> PatientDetails = BillSettlement.getPatientDetailsonBillSettleMentPrintPage();


List<String> TextofPatientDetails= new ArrayList<String>();

TextofPatientDetails.add(PatientDetails.get(0).getText());//Patient Name
TextofPatientDetails.add(PatientDetails.get(2).getText());//Sex
return TextofPatientDetails;
}

public void VerifyPatientDetailsonReceipt() {
Assert.assertEquals(PatientDetailsonBillSettleMentPageForVerification(), PatientDetailsonBillSettleMentPrintPageForVerification(),"Data Validation Not matched");
}

///////////////////////////Backbutton////////////////////////////////
public void ClickonBackbutton() {
	BillSettlement.getBackbutton().click();
}

/////////////////////////////////SettleBillWithDischargebutton////////////////////////////
public boolean ValidateSettleBillWithDischargebuttonisEnabled() {
WebElement Settlebutton = BillSettlement.getSettleBillWithDischargebutton();
return Settlebutton.isEnabled();
}

public void EnterUHIDandClickonNextButton(String ValidID) {
	delay();
	BillSettlement.getUHIDTextBox().clear();
	delay();
	BillSettlement.getUHIDTextBox().sendKeys(ValidID);
	delay();
	BillSettlement.getBlankspaceforClick().click();
	delay();
	BillSettlement.getSearchButton().click();
delay();
BillSettlement.getNextButton().click();
}

public void ClickonSettleBillWithDischargebutton() {

BillSettlement.getSettleBillWithDischargebutton().click();


}











}
