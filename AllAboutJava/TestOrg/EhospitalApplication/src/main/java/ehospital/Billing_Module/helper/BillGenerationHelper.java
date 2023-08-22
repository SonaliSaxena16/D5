package ehospital.Billing_Module.helper;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ehospital.Billing_Module.Locators.BillGenerationLocators;
import in.nic.ehospial.generic.BaseClass;


public class BillGenerationHelper extends BaseClass {
public WebDriver driver;
	
BillGenerationLocators BillGeneration;
								
								
public BillGenerationHelper(WebDriver driver) {
this.driver = driver;
BillGeneration = new BillGenerationLocators(driver);
}

//Action
////////////////////////////////BillGenerationlink//////////////////////////////////////////////
public boolean ValidateBillGenerationlinkisDisplayed() {
WebElement BillGenerationlink = BillGeneration.getBillGenerationlink();
return BillGenerationlink.isDisplayed();
}

public boolean ValidateBillGenerationlinkisEnabled() {
WebElement BillGenerationlink = BillGeneration.getBillGenerationlink();
return BillGenerationlink.isEnabled();
}

public void ClickonBillGenerationlink() {
	BillGeneration.getBillGenerationlink().click();
}

////////////////////////////////RegisteredPatientRadioButton//////////////////////////////////////////////
public boolean validateRegisteredPatientRadioButtonisEnabled() {
	WebElement RegisteredPatientRadioButton = BillGeneration.getRegisteredPatientRadioButton();
	return RegisteredPatientRadioButton.isEnabled();
}
public boolean validateRegisteredPatientRadioButtonisSelected() {
	WebElement RegisteredPatientRadioButton = BillGeneration.getRegisteredPatientRadioButton();
	return RegisteredPatientRadioButton.isSelected();

}
public void SelectRegisteredPatientRadioButton() {
	delay();
	BillGeneration.getRegisteredPatientRadioButton().click();
}

////////////////////////////////////////////PatientIDDropdown///////////////////////////////////////
public boolean validatePatientIDDropdownisEnabled() {
	WebElement getPatientIDDropdown = BillGeneration.getPatientIDDropdown();
	return getPatientIDDropdown.isEnabled();
}

public void SelectValuefromPatientIDDropdown() {
	delay();
	selectDropdownVisibleElement(BillGeneration.getPatientIDDropdown(), "UHID");
}
public boolean validatePatientIDDropdownisMultiple() {
	return ISDropdownisMultiple(BillGeneration.getPatientIDDropdown());
}


/////////////////////////////////////////EnterPatientIDTextBox///////////////////////////
public boolean validateEnterPatientIDTextBoxisEnabled() {
WebElement EnterPatientIDTextBox = BillGeneration.getEnterPatientIDTextBox();
return EnterPatientIDTextBox.isEnabled();
}

///////////////////////////////////////SearchButton///////////////////////
public boolean validateSearchButtonisDisplayed() {
WebElement SearchButton = BillGeneration.getSearchButton();
return SearchButton.isDisplayed();
}
public boolean validateSearchButtonisEnabled() {
WebElement SearchButton = BillGeneration.getSearchButton();
return SearchButton.isEnabled();
}
public void clickonSearchButton() {
delay();
BillGeneration.getSearchButton().click();
}

public void EnterInvalidIDintothePatientIDTextBox(String InvalidID) {
BillGeneration.getEnterPatientIDTextBox().sendKeys(InvalidID);
delay();
BillGeneration.getSearchButton().click();
}

public void EntervalidIDintothePatientIDTextBox(String ValidID) {
BillGeneration.getEnterPatientIDTextBox().sendKeys(ValidID);
delay();
BillGeneration.getSearchButton().click();
}

public List<String> PatientInformation() {
List<String> PatientInformation = getTextForElementfromList(BillGeneration.getPatientInformationBox());
return PatientInformation;
}

////////////////////////////////////PatientTypeDropdown////////////////////////////////////////////
public boolean ValidatePatientTypeDropdownisEnabled() {
WebElement PatientTypeDropdown = BillGeneration.getPatientTypeDropdown();
return PatientTypeDropdown.isEnabled();

}
public boolean validatePatientTypeDropdwonisMultiple() {
WebElement PatientTypeDropdown = BillGeneration.getPatientTypeDropdown();
return ISDropdownisMultiple(PatientTypeDropdown);
}

public void TryingtoSelectValueFromPatientTypeDropdown() {
delay();
selectDropdownVisibleElement(BillGeneration.getPatientTypeDropdown(),"Casualty Patient");

}

////////////////////////////////////BillingTypeDropdown////////////////////////////////////////////
public boolean ValidateBillingTypeDropdownisEnabled() {
WebElement PatientTypeDropdown = BillGeneration.getBillingTypeDropdown();
return PatientTypeDropdown.isEnabled();

}
public boolean validateBillingTypeDropdwonisMultiple() {
WebElement PatientTypeDropdown = BillGeneration.getBillingTypeDropdown();
return ISDropdownisMultiple(PatientTypeDropdown);
}

public void TryingtoSelectValueFromBillingTypeDropdown() {
delay();
selectDropdownVisibleElement(BillGeneration.getBillingTypeDropdown(),"General");
}

/////////////////////////////////////SchemeDropdown/////////////////////////////////////////////
public boolean ValidateSchemeDropdownisEnabled() {
WebElement SchemeDropdown = BillGeneration.getSchemeDropdown();
return SchemeDropdown.isEnabled();

}
public boolean validateSchemeDropdownisMultiple() {
WebElement SchemeDropdown = BillGeneration.getSchemeDropdown();
return ISDropdownisMultiple(SchemeDropdown);
}

public void SelectValueFromSchemeDropdown() {
delay();
selectDropdownVisibleElementwithIndexValue(BillGeneration.getSchemeDropdown(),0);
}

/////////////////////////////////OtherServicesCheckBox/////////////////////////////////////////////
public boolean ValidateOtherServicesCheckBoxisEnabled() {
WebElement OtherServicesCheckBox = BillGeneration.getOtherServicesCheckBox();
return OtherServicesCheckBox.isEnabled();
}

public boolean ValidateOtherServicesCheckBoxisSelected() {
WebElement OtherServicesCheckBox = BillGeneration.getOtherServicesCheckBox();
return OtherServicesCheckBox.isSelected();
}

public void SelectOtherServiceCheckBox() {
BillGeneration.getOtherServicesCheckBox().click();
}

/////////////////////////////////CancelButtonofOtherServices//////////////////////////////////////
public boolean ValidateCancelButtonofOtherServicesisEnabled() {
WebElement CancelButtonofOtherServices = BillGeneration.getCancelButtonofOtherServices();
return CancelButtonofOtherServices.isEnabled();
}

public void ClickonCancelButtonofOtherServices() {
BillGeneration.getCancelButtonofOtherServices().click();
}


//////////////////////////////////////////PrepareRecepitForOtherServices///////////////////
public void PrepareRecepitForOtherServices(String ItemName,String Quantity,String Rate) {
delay();
BillGeneration.getOtherServicesCheckBox().click();
delay();
BillGeneration.getItemNmeTextBoxofOtherServices().clear();
delay();
BillGeneration.getItemNmeTextBoxofOtherServices().sendKeys(ItemName);
delay();
BillGeneration.getQuentityTextBoxofOtherServices().clear();
delay();
BillGeneration.getQuentityTextBoxofOtherServices().sendKeys(Quantity);
delay();
BillGeneration.getRateTextBoxofOtherServices().clear();
delay();
BillGeneration.getRateTextBoxofOtherServices().sendKeys(Rate);
delay();
BillGeneration.getCheckBoxofOtherServices().click();
delay();
BillGeneration.getAddButtonofOtherServices().click();
delay();
}

//////////////////////////////////////Serviceinfotable//////////////////////////////////////
public boolean ServiceinfotableisDisplayed() {
WebElement Serviceinfotable = BillGeneration.getServiceinfotable();
return Serviceinfotable.isDisplayed();
}


///////////////////////////////////////RemoveServicesImgbutton//////////////////////////////
public boolean ValidateRemoveServicesImgbuttonisEnabled() {
WebElement RemoveServices = BillGeneration.getRemoveServicesImgbutton();
return RemoveServices.isEnabled();
}

public void ClickonRemoveServicesImgbutton() {
BillGeneration.getRemoveServicesImgbutton().click();

}

//////////////////////////////////////////AddButtonofOtherServices//////////////////////////
public void ClickonAddButtonofOtherServices() {
	BillGeneration.getAddButtonofOtherServices().click();
}

//////////////////////////////ViewStatementlink///////////////////////////////////////////////
public boolean ValidateViewStatementlinkisEnabled() {
WebElement ViewStatementlink = BillGeneration.getViewStatementlink();
return ViewStatementlink.isEnabled();
}

public void ClickonViewStatementlink() {
BillGeneration.getViewStatementlink().click();
}

////////////////////////////ViewStatementPopup/////////////////////////////////////////////////////////
public boolean ValidateViewStatementPopupisDisplayed() {
WebElement ViewStatementPopUp = BillGeneration.getViewStatementPopup();
return ViewStatementPopUp.isDisplayed();	
}

/////////////////////////////////////////CancelbuttonofViewStatementPopup//////////////////////////////
public void ClickonCancelbuttonofViewStatementPopup() {
	BillGeneration.getCancelbuttonofViewStatementPopup().click();
}

/////////////////////////////////////Nextbutton//////////////////////////////////////////////
public boolean ValidateNextbuttonisEnabled() {
WebElement Nextbutton = BillGeneration.getNextbutton();
return Nextbutton.isEnabled();
}

public void ClickonNextbutton() {
BillGeneration.getNextbutton().click();
}

/////////////////////////////////////////////////RegisterPatientandPrepareBillbutton////////////////////////////////////
public boolean ValidateRegisterPatientandPrepareBillbuttonisEnabled() {
WebElement RegisterPatientandPrepareBill = BillGeneration.getRegisterPatientandPrepareBillbutton();
return RegisterPatientandPrepareBill.isEnabled();
}

public void ClickonRegisterPatientandPrepareBillbutton() {
BillGeneration.getRegisterPatientandPrepareBillbutton().click();
}

///////////////////////////////////////////////BillPreparedSuccessfullyMessagePopup////////////////////////////////
public boolean ValidateBillPreparedPopupisdisplayed() {
WebElement BillPreparedPopup = BillGeneration.getBillPreparedSuccessfullyMessagePopup();
return BillPreparedPopup.isDisplayed();
}

//////////////////////////DetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup////////////////////////////
public boolean ValidateDetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisEnabled() {
WebElement DetailedReceipt = BillGeneration.getDetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup();
return DetailedReceipt.isEnabled();
}

public boolean ValidateDetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisSelected() {
WebElement DetailedReceipt = BillGeneration.getDetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup();
return DetailedReceipt.isSelected();
}

public void ClickonDetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup() {
	BillGeneration.getDetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup().click();
}

//////////////////////////////////////ClickheretoprintMoneyReceiptbutton/////////////////////////////////////////
public boolean ValidateClickheretoprintMoneyReceiptbuttonisEnabled() {
WebElement printMoneyReceipt = BillGeneration.getClickheretoprintMoneyReceiptbutton();
return printMoneyReceipt.isEnabled();
}

public void ClickonClickheretoprintMoneyReceiptbutton() {
	BillGeneration.getClickheretoprintMoneyReceiptbutton().click();
}

///////////////////////////////////HeadOfAccountDropdown///////////////////////////////////////
public boolean ValidateHeadOfAccountDropdownisEnabled() {
WebElement HeadOfAccountDropdown = BillGeneration.getHeadOfAccountDropdown();
return HeadOfAccountDropdown.isEnabled();
}
public boolean ValidateHeadOfAccountDropdownisMultiple() {
WebElement HeadOfAccountDropdown = BillGeneration.getHeadOfAccountDropdown();
return ISDropdownisMultiple(HeadOfAccountDropdown);

}
public void SelectValueFromHeadOfAccountDropdown() {
delay();
selectDropdownVisibleElement(BillGeneration.getHeadOfAccountDropdown(),"Automation Head_Recepit");
}

///////////////////////////////////CategoryDropdown///////////////////////////////////////
public boolean ValidateCategoryDropdownDropdownisEnabled() {
WebElement CategoryDropdown = BillGeneration.getCategoryDropdown();
return CategoryDropdown.isEnabled();
}
public boolean ValidateCategoryDropdownDropdownisMultiple() {
WebElement CategoryDropdown = BillGeneration.getCategoryDropdown();
return ISDropdownisMultiple(CategoryDropdown);

}
public void SelectValueFromCategoryDropdown() {
delay();
selectDropdownVisibleElementWithCondition(BillGeneration.getCategoryDropdown(),"MICRO AUTOMATION TEST","AUTOMATION BILLING SERVICE");
}

/////////////////////////////////////Checkboxtoselectservices1////////////////////////////////////////
public boolean ValidateCheckboxtoselectservices1isEnabled() {
WebElement Checkboxtoselectservices = BillGeneration.getCheckboxtoselectservices1();
return Checkboxtoselectservices.isEnabled();
}
public boolean ValidateCheckboxtoselectservices1isSelected() {
WebElement Checkboxtoselectservices = BillGeneration.getCheckboxtoselectservices1();
return Checkboxtoselectservices.isSelected();

}
public void SelectCheckboxtoselectservices1() {
BillGeneration.getCheckboxtoselectservices1().click();
delay();
BillGeneration.getCheckboxtoselectservices2().click();
delay();
BillGeneration.getCheckboxtoselectservices3().click();
}

///////////////////////////////////////////////AddToListButton///////////////////////////////////////////////
public boolean ValidateAddToListButtonisEnabled() {
WebElement AddToListButton = BillGeneration.getAddToListButton();
return AddToListButton.isEnabled();
}

public void ClickonAddToListButton() {
delay();
BillGeneration.getAddToListButton().click();
}

////////////////////////////////////ConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup///////////////////////
public boolean ValidateConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisEnabled() {
WebElement ConsolidatedReceipt = BillGeneration.getConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup();
return ConsolidatedReceipt.isEnabled();
}

public boolean ValidateConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopupisSelecetd() {
WebElement ConsolidatedReceipt = BillGeneration.getConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup();
return ConsolidatedReceipt.isSelected();
}

public void ClickonConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup() {
	BillGeneration.getConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup().click();
}
















}
