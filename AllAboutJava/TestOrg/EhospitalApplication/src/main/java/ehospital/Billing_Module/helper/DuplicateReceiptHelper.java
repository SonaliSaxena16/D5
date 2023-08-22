package ehospital.Billing_Module.helper;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ehospital.Billing_Module.Locators.DuplicateReceiptLocators;
import in.nic.ehospial.generic.BaseClass;

public class DuplicateReceiptHelper extends BaseClass {
	public WebDriver driver;
	
	DuplicateReceiptLocators DuplicateReceipt;
	
	
	public DuplicateReceiptHelper(WebDriver driver) {
		this.driver = driver;
		DuplicateReceipt = new DuplicateReceiptLocators(driver);
	}
	//Action
//////////////////////////////////////// Duplicate Receipts ////////////////////////////////////	
public boolean ValidateDuplicateRecepitlinkisDisplayed() {
	WebElement DuplicateRecepitlink = DuplicateReceipt.getDuplicateReceiptLink();
	return DuplicateRecepitlink.isDisplayed();
}
	
public boolean ValidateDuplicateRecepitlinkisEnabled() {
	WebElement DuplicateRecepitlink = DuplicateReceipt.getDuplicateReceiptLink();
	return DuplicateRecepitlink.isEnabled();
}
	
public void clickonDuplicateRecepitlink() {
	DuplicateReceipt.getDuplicateReceiptLink().click();
}

//////////////////////////////////////DateRadiobutton////////////////////////////////////////////////
public boolean ValidateDateRadiobuttonisEnabled() {
	WebElement DateRadiobutton = DuplicateReceipt.getDateRadiobutton();
	return DateRadiobutton.isEnabled();
}

public boolean ValidateDateRadiobuttonisSelected() {
	WebElement DateRadiobutton = DuplicateReceipt.getDateRadiobutton();
	return DateRadiobutton.isSelected();
}

public void ClickonDateRadiobutton() {
	delay();
	DuplicateReceipt.getDateRadiobutton().click();
}

///////////////////////////////CalenderImage/////////////////////////////////////
public boolean ValidateCalenderImageisDisplayed() {
	WebElement CalenderImage = DuplicateReceipt.getCalenderImage();
	return CalenderImage.isDisplayed();
}

public void ClickonCalenderImage() {
	DuplicateReceipt.getCalenderImage().click();
}

//////////////////////////////////TodayoptioninCalenderImage//////////////////////////
public boolean ValidateTodayoptioninCalenderImageisEnabled() {
	WebElement TodayoptioninCalenderImage =  DuplicateReceipt.getTodayoptioninCalenderImage();
	return TodayoptioninCalenderImage.isEnabled();
}

public void ClickonTodayoptioninCalenderImage() {
	delay();
	DuplicateReceipt.getTodayoptioninCalenderImage().click();
}

////////////////////////////GetSearchresultbutton//////////////////////////////////////////
public boolean ValidateGetSearchresultbuttonisEnabled() {
	WebElement GetSearchresultbutton = DuplicateReceipt.getGetSearchresultbutton();
	return GetSearchresultbutton.isEnabled();
}

public void ClickonGetSearchresultbutton() {
	delay();
	DuplicateReceipt.getGetSearchresultbutton().click();
}

//////////////////////////////////////////UHIDRadiobutton////////////////////////////////////////
public boolean ValidateUHIDRadiobuttonisEnabled() {
	WebElement UHIDRadiobutton = DuplicateReceipt.getUHIDRadiobutton();
	return UHIDRadiobutton.isEnabled();
}

public boolean ValidateUHIDRadiobuttonisSelected() {
	WebElement UHIDRadiobutton = DuplicateReceipt.getUHIDRadiobutton();
	return UHIDRadiobutton.isSelected();
}

public void SelectUHIDRadiobutton() {
	DuplicateReceipt.getUHIDRadiobutton().click();
}

////////////////////////////////////CashbookDropdown///////////////////////////////////////////
public boolean ValidateCashbookDropdownisEnabled() {
	WebElement CashbookDropdown = DuplicateReceipt.getCashbookDropdown();
	return CashbookDropdown.isEnabled();
}

public boolean ValidateCashbookDropdownisMultiple() {
	WebElement CashbookDropdown = DuplicateReceipt.getCashbookDropdown();
	return ISDropdownisMultiple(CashbookDropdown);
}

public void SelectValueFromCashbookDropdown() {
	delay();
	selectDropdownVisibleElement(DuplicateReceipt.getCashbookDropdown(),"COLLECTION");
}

///////////////////////////////////GetSearchresultbuttonofUHIDateRecepitNoFilter/////////////////
public boolean ValidateGetSearchresultbuttonofUHIDateRecepitNoFilterisEnabled() {
	WebElement GetSearchresultbutton = DuplicateReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter();
	return GetSearchresultbutton.isEnabled();
}

public void ClickonGetSearchresultbuttonofUHIDateRecepitNoFilter() {
	DuplicateReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
}

//////////////////////////////////EnterIDTextbox////////////////////////////////////////
public boolean ValidateEnterIDTextboxisEnabled() {
	WebElement EnterIDTextbox = DuplicateReceipt.getEnterIDTextbox();
	return EnterIDTextbox.isEnabled();
}

///////////////////////ClickonSerchbuttonWithInvalidUHID/////////////////////////
public void ClickonSerchbuttonWithInvalidUHID(String InvalidUHID) {
	delay();
	selectDropdownVisibleElement(DuplicateReceipt.getCashbookDropdown(),"COLLECTION");
	delay();
	DuplicateReceipt.getEnterIDTextbox().sendKeys(InvalidUHID);
	delay();
	DuplicateReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
	
}

/////////////////////////////////CheckPatientIDMaxlength/////////////////////
public void CheckPatientIDMaxlength(String InvalidUHID) {
	delay();
	selectDropdownVisibleElement(DuplicateReceipt.getCashbookDropdown(),"COLLECTION");
	delay();
	DuplicateReceipt.getEnterIDTextbox().clear();
	delay();
	DuplicateReceipt.getEnterIDTextbox().sendKeys(InvalidUHID);
	delay();
	DuplicateReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
	
}

////////////////////////////////////clickonGetSearchResultbuttonwithvalidUHID///////
public void clickonGetSearchResultbuttonwithvalidUHID(String validUHID ) {
	delay();
	selectDropdownVisibleElement(DuplicateReceipt.getCashbookDropdown(),"COLLECTION");
	delay();
	DuplicateReceipt.getEnterIDTextbox().clear();
	delay();
	DuplicateReceipt.getEnterIDTextbox().sendKeys(validUHID);
	delay();
	DuplicateReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
	
}

/////////////////////PatientinfoTable//////////////////////////////////////////////
public boolean PatientinfoTableisDisplayed() {
	WebElement PatientinfoTable = DuplicateReceipt.getPatientinfoTable();
	return PatientinfoTable.isDisplayed();
}

//////////////////////SelectbuttontoPrintReport/////////////////////////////////
public void ClickonSelectbuttontoPrintReport() {
	delay();
	DuplicateReceipt.getSelectbuttontoPrintReport().click();
}

/////////////////////////////getRecepitNo.////////////////////////////
public String getRecepitNo() {
	String RecepitNo = DuplicateReceipt.getGetReceiptNumber().getText();
	return RecepitNo;
}

/////////////////////////////RecepitNoRadiobutton//////////////////////
public boolean ValidateRecepitNoRadiobuttonisEnabled() {
	WebElement RecepitNo = DuplicateReceipt.getRecepitNoRadiobutton();
	return RecepitNo.isEnabled();
}

public boolean ValidateRecepitNoRadiobuttonisSelected() {
	WebElement RecepitNo = DuplicateReceipt.getRecepitNoRadiobutton();
	return RecepitNo.isSelected();
}

public void SelectRecepitNoRadiobutton() {
	delay();
	DuplicateReceipt.getRecepitNoRadiobutton().click();
}

///////////////////////////ClickonSerchbuttonWithInvalidRecepitNo/////////////////////////
public void ClickonSerchbuttonWithInvalidRecepitNo(String InvalidRecepitNo) {
	delay();
	selectDropdownVisibleElement(DuplicateReceipt.getCashbookDropdown(),"COLLECTION");
	delay();
	DuplicateReceipt.getEnterIDTextbox().clear();
	delay();
	DuplicateReceipt.getEnterIDTextbox().sendKeys(InvalidRecepitNo);
	delay();
	DuplicateReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
}

////////////////////////////////////ClickonSerchbuttonWithvalidRecepitNo///////
public void ClickonSerchbuttonWithvalidRecepitNo(String validRecepitNo ) {
delay();
selectDropdownVisibleElement(DuplicateReceipt.getCashbookDropdown(),"COLLECTION");
delay();
DuplicateReceipt.getEnterIDTextbox().clear();
delay();
DuplicateReceipt.getEnterIDTextbox().sendKeys(validRecepitNo);
delay();
 Actions action = new Actions(driver);
action.moveByOffset(0,0).perform();
delay();
for(int i = 0; i<11;i++) {
DuplicateReceipt.getEnterIDTextbox().sendKeys(Keys.chord(Keys.SHIFT,Keys.ARROW_LEFT,Keys.DELETE));
//DuplicateReceipt.getEnterIDTextbox().sendKeys(Keys.DELETE);
}
delay();
DuplicateReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
delay();

}








}
