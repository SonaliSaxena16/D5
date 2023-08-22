package ehospital.Billing_Module.helper;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ehospital.Billing_Module.Locators.CancelReceiptLocators;
//import ehospital.Billing_Module.Locators.RefundReceiptLocators;
import in.nic.ehospial.generic.BaseClass;

public class CancelReceiptHelper extends BaseClass{
public WebDriver driver;
	
CancelReceiptLocators CancelReceipt;
				
				
public CancelReceiptHelper(WebDriver driver) {
this.driver = driver;
CancelReceipt = new CancelReceiptLocators(driver);
}

//Action
//////////////////////////////////////////CancelReceiptlink//////////////////////////
public boolean ValidateCancelReceiptlinkisDisplayed() {
WebElement CancelReceiptlink = CancelReceipt.getCancelReceiptlink();
return CancelReceiptlink.isDisplayed();
}

public boolean ValidateCancelReceiptlinkisEnabled() {
WebElement CancelReceiptlink = CancelReceipt.getCancelReceiptlink();
return CancelReceiptlink.isEnabled();
}

public void ClickonCancelReceiptlink() {
	CancelReceipt.getCancelReceiptlink().click();
}

//////////////////////////////////HeadofAccountDropdown///////////////////////////////////
public boolean ValidateHeadofAccountDropdownisEnabled() {
WebElement HeadofAccountDropdown = CancelReceipt.getHeadofAccountDropdown();
return HeadofAccountDropdown.isEnabled();
}

public boolean ValidateHeadofAccountDropdownisMultiple() {
WebElement HeadofAccountDropdown = CancelReceipt.getHeadofAccountDropdown();
return ISDropdownisMultiple(HeadofAccountDropdown);
}

public void SelectValueFromtheDropdown() {
delay();
selectDropdownVisibleElement(CancelReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
}

///////////////////////////////////DateRadioButton//////////////////////////////////////////
public boolean ValidateDateRadioButtonisEnabled() {
WebElement DateRadioButton = CancelReceipt.getDateRadioButton();
return DateRadioButton.isEnabled();
}

public boolean ValidateDateRadioButtonisSelected() {
WebElement DateRadioButton = CancelReceipt.getDateRadioButton();
return DateRadioButton.isSelected();
}

public void SelectDateRadioButton() {
CancelReceipt.getDateRadioButton().click();
delay();
WebElement DateWiseSearchElementInfo = CancelReceipt.getDateWiseSearchElementInfo();
isElementVisible(DateWiseSearchElementInfo);
}

///////////////////////////////CalenderImage/////////////////////////////////////
public boolean ValidateCalenderImageisDisplayed() {
WebElement CalenderImage = CancelReceipt.getCalenderImage();
return CalenderImage.isDisplayed();
}

public void ClickonCalenderImage() {
CancelReceipt.getCalenderImage().click();
}

//////////////////////////////////TodayoptioninCalenderImage//////////////////////////
public boolean ValidateTodayoptioninCalenderImageisEnabled() {
WebElement TodayoptioninCalenderImage =  CancelReceipt.getTodayoptioninCalenderImage();
return TodayoptioninCalenderImage.isEnabled();
}

public void ClickonTodayoptioninCalenderImage() {
delay();
CancelReceipt.getTodayoptioninCalenderImage().click();
}

////////////////////////////GetSearchresultbutton//////////////////////////////////////////
public boolean ValidateGetSearchresultbuttonisEnabled() {
WebElement GetSearchresultbutton = CancelReceipt.getGetSearchresultbutton();
return GetSearchresultbutton.isEnabled();
}

public void ClickonGetSearchresultbutton() {
delay();
CancelReceipt.getGetSearchresultbutton().click();
}

//////////////////////////////////////////UHIDRadiobutton////////////////////////////////////////
public boolean ValidateUHIDRadiobuttonisEnabled() {
WebElement UHIDRadiobutton = CancelReceipt.getUHIDRadiobutton();
return UHIDRadiobutton.isEnabled();
}

public boolean ValidateUHIDRadiobuttonisSelected() {
WebElement UHIDRadiobutton = CancelReceipt.getUHIDRadiobutton();
return UHIDRadiobutton.isSelected();
}

public void SelectUHIDRadiobutton() {
CancelReceipt.getUHIDRadiobutton().click();
}

////////////////////////////////////CashbookDropdown///////////////////////////////////////////
public boolean ValidateCashbookDropdownisEnabled() {
WebElement CashbookDropdown = CancelReceipt.getCashbookDropdown();
return CashbookDropdown.isEnabled();
}

public boolean ValidateCashbookDropdownisMultiple() {
WebElement CashbookDropdown = CancelReceipt.getCashbookDropdown();
return ISDropdownisMultiple(CashbookDropdown);
}

public void SelectValueFromCashbookDropdown() {
delay();
selectDropdownVisibleElement(CancelReceipt.getCashbookDropdown(),"COLLECTION");
}

///////////////////////////////////GetSearchresultbuttonofUHIDateRecepitNoFilter/////////////////
public boolean ValidateGetSearchresultbuttonofUHIDateRecepitNoFilterisEnabled() {
WebElement GetSearchresultbutton = CancelReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter();
return GetSearchresultbutton.isEnabled();
}

public void ClickonGetSearchresultbuttonofUHIDateRecepitNoFilter() {
CancelReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
}




//////////////////////////////////EnterIDTextbox////////////////////////////////////////
public boolean ValidateEnterIDTextboxisEnabled() {
WebElement EnterIDTextbox = CancelReceipt.getEnterIDTextbox();
return EnterIDTextbox.isEnabled();
}

///////////////////////ClickonSerchbuttonWithInvalidUHID/////////////////////////
public void ClickonSerchbuttonWithInvalidUHID(String InvalidUHID) {
delay();
selectDropdownVisibleElement(CancelReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
delay();
selectDropdownVisibleElement(CancelReceipt.getCashbookDropdown(),"COLLECTION");
delay();
CancelReceipt.getEnterIDTextbox().sendKeys(InvalidUHID);
delay();
CancelReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();

}

/////////////////////////////////CheckPatientIDMaxlength/////////////////////
public void CheckPatientIDMaxlength(String InvalidUHID) {
delay();
selectDropdownVisibleElement(CancelReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
delay();
selectDropdownVisibleElement(CancelReceipt.getCashbookDropdown(),"COLLECTION");
delay();
CancelReceipt.getEnterIDTextbox().clear();
delay();
CancelReceipt.getEnterIDTextbox().sendKeys(InvalidUHID);
delay();
CancelReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();

}

////////////////////////////////////clickonGetSearchResultbuttonwithvalidUHID///////
public void clickonGetSearchResultbuttonwithvalidUHID(String validUHID ) {
delay();
selectDropdownVisibleElement(CancelReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
delay();
selectDropdownVisibleElement(CancelReceipt.getCashbookDropdown(),"COLLECTION");
delay();
CancelReceipt.getEnterIDTextbox().clear();
delay();
CancelReceipt.getEnterIDTextbox().sendKeys(validUHID);
delay();
CancelReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();

}

/////////////////////PatientinfoTable//////////////////////////////////////////////
public boolean PatientinfoTableisDisplayed() {
WebElement PatientinfoTable = CancelReceipt.getPatientinfoTable();
return PatientinfoTable.isDisplayed();
}

/////////////////////////////////////////////Selectbutton////////////////////////////////
public boolean ValidateSelectbuttonisEnabled() {
WebElement Selectbutton = CancelReceipt.getSelectbutton();
return Selectbutton.isEnabled();
}

public void ClickonSelectbutton() {
	CancelReceipt.getSelectbutton().click();
}

///////////////////////////////////ReasonForCancellationTextBox//////////////////////////////
public boolean ValidateReasonForCancellationTextBoxisEnabled() {
WebElement ReasonForCancellationTextBox = CancelReceipt.getReasonForCancellationTextBox();
return ReasonForCancellationTextBox.isEnabled();
}

public void EnterReasonIntotheReasonForCancellationTextBox(String Reason) {
	CancelReceipt.getReasonForCancellationTextBox().clear();
	delay();
	CancelReceipt.getReasonForCancellationTextBox().sendKeys(Reason);
}

///////////////////////////////////////CancelReceiptButton//////////////////////////////////
public boolean ValidateCancelReceiptButtonisenabled() {
WebElement CancelReceiptButton = CancelReceipt.getCancelReceiptButton();
return CancelReceiptButton.isEnabled();
}

public void ClickonCancelReceiptButton() {
	CancelReceipt.getCancelReceiptButton().click();
}

/////////////////////////////RecepitNoRadiobutton//////////////////////
public boolean ValidateRecepitNoRadiobuttonisEnabled() {
WebElement RecepitNo = CancelReceipt.getRecepitNoRadiobutton();
return RecepitNo.isEnabled();
}

public boolean ValidateRecepitNoRadiobuttonisSelected() {
WebElement RecepitNo = CancelReceipt.getRecepitNoRadiobutton();
return RecepitNo.isSelected();
}

public void SelectRecepitNoRadiobutton() {
delay();
CancelReceipt.getRecepitNoRadiobutton().click();
}

///////////////////////////ClickonSerchbuttonWithInvalidRecepitNo/////////////////////////
public void ClickonSerchbuttonWithInvalidRecepitNo(String InvalidRecepitNo) {
delay();
selectDropdownVisibleElement(CancelReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
delay();
selectDropdownVisibleElement(CancelReceipt.getCashbookDropdown(),"COLLECTION");
delay();
CancelReceipt.getEnterIDTextbox().clear();
delay();
CancelReceipt.getEnterIDTextbox().sendKeys(InvalidRecepitNo);
delay();
CancelReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
}

////////////////////////////////////ClickonSerchbuttonWithvalidRecepitNo///////
public void ClickonSerchbuttonWithvalidRecepitNo(String validRecepitNo ) {
delay();
selectDropdownVisibleElement(CancelReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
delay();
selectDropdownVisibleElement(CancelReceipt.getCashbookDropdown(),"COLLECTION");
delay();
CancelReceipt.getEnterIDTextbox().clear();
delay();
CancelReceipt.getEnterIDTextbox().sendKeys(validRecepitNo);
delay();
Actions action = new Actions(driver);
action.moveByOffset(0,0).perform();
delay();
for(int i = 0; i<11;i++) {
	CancelReceipt.getEnterIDTextbox().sendKeys(Keys.chord(Keys.SHIFT,Keys.ARROW_LEFT,Keys.DELETE));
//DuplicateReceipt.getEnterIDTextbox().sendKeys(Keys.DELETE);
}
delay();
CancelReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
delay();

}








}
