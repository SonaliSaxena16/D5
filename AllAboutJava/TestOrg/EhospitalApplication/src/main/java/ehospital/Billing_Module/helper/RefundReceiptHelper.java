package ehospital.Billing_Module.helper;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ehospital.Billing_Module.Locators.RateConfigurationofServicesLocators;
import ehospital.Billing_Module.Locators.RefundReceiptLocators;
import in.nic.ehospial.generic.BaseClass;
//import junit.framework.Assert;
import org.testng.Assert;


public class RefundReceiptHelper extends BaseClass {
public WebDriver driver;
	
RefundReceiptLocators RefundReceipt;
			
			
public RefundReceiptHelper(WebDriver driver) {
this.driver = driver;
RefundReceipt = new RefundReceiptLocators(driver);
}

//Action
//////////////////////////////////////////RefundReceiptlink//////////////////////////
public boolean ValidateRefundReceiptlinkisDisplayed() {
	WebElement RefundReceiptlink = RefundReceipt.getRefundReceiptlink();
	return RefundReceiptlink.isDisplayed();
}

public boolean ValidateRefundReceiptlinkisEnabled() {
	WebElement RefundReceiptlink = RefundReceipt.getRefundReceiptlink();
	return RefundReceiptlink.isEnabled();
}

public void ClickonRefundReceiptlink() {
	RefundReceipt.getRefundReceiptlink().click();
}

//////////////////////////////////HeadofAccountDropdown///////////////////////////////////
public boolean ValidateHeadofAccountDropdownisEnabled() {
	WebElement HeadofAccountDropdown = RefundReceipt.getHeadofAccountDropdown();
	return HeadofAccountDropdown.isEnabled();
}

public boolean ValidateHeadofAccountDropdownisMultiple() {
	WebElement HeadofAccountDropdown = RefundReceipt.getHeadofAccountDropdown();
	return ISDropdownisMultiple(HeadofAccountDropdown);
}

public void SelectValueFromtheDropdown() {
delay();
selectDropdownVisibleElement(RefundReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
}

///////////////////////////////////DateRadioButton//////////////////////////////////////////
public boolean ValidateDateRadioButtonisEnabled() {
	WebElement DateRadioButton = RefundReceipt.getDateRadioButton();
	return DateRadioButton.isEnabled();
}

public boolean ValidateDateRadioButtonisSelected() {
	WebElement DateRadioButton = RefundReceipt.getDateRadioButton();
	return DateRadioButton.isSelected();
}

public void SelectDateRadioButton() {
	RefundReceipt.getDateRadioButton().click();
	delay();
	WebElement DateWiseSearchElementInfo = RefundReceipt.getDateWiseSearchElementInfo();
	isElementVisible(DateWiseSearchElementInfo);
	
}

///////////////////////////////CalenderImage/////////////////////////////////////
public boolean ValidateCalenderImageisDisplayed() {
WebElement CalenderImage = RefundReceipt.getCalenderImage();
return CalenderImage.isDisplayed();
}

public void ClickonCalenderImage() {
RefundReceipt.getCalenderImage().click();
}

//////////////////////////////////TodayoptioninCalenderImage//////////////////////////
public boolean ValidateTodayoptioninCalenderImageisEnabled() {
WebElement TodayoptioninCalenderImage =  RefundReceipt.getTodayoptioninCalenderImage();
return TodayoptioninCalenderImage.isEnabled();
}

public void ClickonTodayoptioninCalenderImage() {
delay();
RefundReceipt.getTodayoptioninCalenderImage().click();
}

////////////////////////////GetSearchresultbutton//////////////////////////////////////////
public boolean ValidateGetSearchresultbuttonisEnabled() {
WebElement GetSearchresultbutton = RefundReceipt.getGetSearchresultbutton();
return GetSearchresultbutton.isEnabled();
}

public void ClickonGetSearchresultbutton() {
delay();
RefundReceipt.getGetSearchresultbutton().click();
}

/////////////////////////////Selectbutton////////////////////////////////
public boolean ValidateSelectbuttonisEnabled() {
	WebElement Selectbutton = RefundReceipt.getSelectbutton();
	return Selectbutton.isEnabled();
}

public void ClickonSelectbutton() {
	RefundReceipt.getSelectbutton().click();
	delay();
	WebElement ReceiptDetail = RefundReceipt.getReceiptDetailinfoBox();
	isElementVisible(ReceiptDetail);
}

///////////////////////////////////////Cancelbutton//////////////////////
public boolean ValidateCancelbuttonisEnabled() {
	WebElement Cancelbutton = RefundReceipt.getCancelbutton();
	return Cancelbutton.isEnabled();
}

public void ClickonCancelbutton() {
	RefundReceipt.getCancelbutton().click();
}

//////////////////////////////////////////UHIDRadiobutton////////////////////////////////////////
public boolean ValidateUHIDRadiobuttonisEnabled() {
WebElement UHIDRadiobutton = RefundReceipt.getUHIDRadiobutton();
return UHIDRadiobutton.isEnabled();
}

public boolean ValidateUHIDRadiobuttonisSelected() {
WebElement UHIDRadiobutton = RefundReceipt.getUHIDRadiobutton();
return UHIDRadiobutton.isSelected();
}

public void SelectUHIDRadiobutton() {
RefundReceipt.getUHIDRadiobutton().click();
}

////////////////////////////////////CashbookDropdown///////////////////////////////////////////
public boolean ValidateCashbookDropdownisEnabled() {
WebElement CashbookDropdown = RefundReceipt.getCashbookDropdown();
return CashbookDropdown.isEnabled();
}

public boolean ValidateCashbookDropdownisMultiple() {
WebElement CashbookDropdown = RefundReceipt.getCashbookDropdown();
return ISDropdownisMultiple(CashbookDropdown);
}

public void SelectValueFromCashbookDropdown() {
delay();
selectDropdownVisibleElement(RefundReceipt.getCashbookDropdown(),"COLLECTION");
}

///////////////////////////////////GetSearchresultbuttonofUHIDateRecepitNoFilter/////////////////
public boolean ValidateGetSearchresultbuttonofUHIDateRecepitNoFilterisEnabled() {
WebElement GetSearchresultbutton = RefundReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter();
return GetSearchresultbutton.isEnabled();
}

public void ClickonGetSearchresultbuttonofUHIDateRecepitNoFilter() {
RefundReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
}




//////////////////////////////////EnterIDTextbox////////////////////////////////////////
public boolean ValidateEnterIDTextboxisEnabled() {
WebElement EnterIDTextbox = RefundReceipt.getEnterIDTextbox();
return EnterIDTextbox.isEnabled();
}

///////////////////////ClickonSerchbuttonWithInvalidUHID/////////////////////////
public void ClickonSerchbuttonWithInvalidUHID(String InvalidUHID) {
delay();
selectDropdownVisibleElement(RefundReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
delay();
selectDropdownVisibleElement(RefundReceipt.getCashbookDropdown(),"COLLECTION");
delay();
RefundReceipt.getEnterIDTextbox().sendKeys(InvalidUHID);
delay();
RefundReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();

}

/////////////////////////////////CheckPatientIDMaxlength/////////////////////
public void CheckPatientIDMaxlength(String InvalidUHID) {
delay();
selectDropdownVisibleElement(RefundReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
delay();
selectDropdownVisibleElement(RefundReceipt.getCashbookDropdown(),"COLLECTION");
delay();
RefundReceipt.getEnterIDTextbox().clear();
delay();
RefundReceipt.getEnterIDTextbox().sendKeys(InvalidUHID);
delay();
RefundReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();

}

////////////////////////////////////clickonGetSearchResultbuttonwithvalidUHID///////
public void clickonGetSearchResultbuttonwithvalidUHID(String validUHID ) {
delay();
selectDropdownVisibleElement(RefundReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
delay();
selectDropdownVisibleElement(RefundReceipt.getCashbookDropdown(),"COLLECTION");
delay();
RefundReceipt.getEnterIDTextbox().clear();
delay();
RefundReceipt.getEnterIDTextbox().sendKeys(validUHID);
delay();
RefundReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();

}

/////////////////////PatientinfoTable//////////////////////////////////////////////
public boolean PatientinfoTableisDisplayed() {
WebElement PatientinfoTable = RefundReceipt.getPatientinfoTable();
return PatientinfoTable.isDisplayed();
}

//////////////////////////////////////FirstCheckboxtoSelectService/////////////////////////
public boolean ValidateFirstCheckboxtoSelectServiceisEnabled() {
WebElement CheckboxtoSelectService = RefundReceipt.getFirstCheckboxtoSelectService();
return CheckboxtoSelectService.isEnabled();
}

public boolean ValidateFirstCheckboxtoSelectServiceisSelected() {
WebElement CheckboxtoSelectService = RefundReceipt.getFirstCheckboxtoSelectService();
return CheckboxtoSelectService.isSelected();
}

public void SelectFirstCheckboxtoSelectService() {
	RefundReceipt.getFirstCheckboxtoSelectService().click();
	HandleAlert();
	RefundReceipt.getFirstCheckboxtoSelectService().click();
	
}

////////////////////////////////////GrossAmountTextBox/////////////////////////////////
public boolean ValidateGrossAmountTextBoxisEnabled() {
WebElement GrossAmount = RefundReceipt.getGrossAmountTextBox();
return GrossAmount.isEnabled();
}

public void EnterAmountintoGrossAmountTextBox(String GrossAmount) {

RefundReceipt.getGrossAmountTextBox().sendKeys(GrossAmount);
}

//////////////////////////////////////DisscountAmountTextBox///////////////////////////////////
public boolean ValidateDisscountAmountTextBoxisEnabled() {
WebElement DisscountAmount = RefundReceipt.getDisscountAmountTextBox();
return DisscountAmount.isEnabled();
}

public void EnterAmountintoDisscountAmountTextBox(String DisscountAmount) {

RefundReceipt.getDisscountAmountTextBox().sendKeys(DisscountAmount);
}

////////////////////////////////////////NetAmountTextBox////////////////////////////////////////////
public boolean ValidateNetAmountTextBoxisEnabled() {
WebElement NetAmount = RefundReceipt.getNetAmountTextBox();
return NetAmount.isEnabled();
}

public void EnterAmountintoNetAmountTextBox(String NetAmount) {

RefundReceipt.getNetAmountTextBox().sendKeys(NetAmount);
}

//////////////////////////////////////////////////TotalRefundAmountTextBox////////////////////////
public boolean ValidateTotalRefundAmountisEnabled() {
WebElement TotalRefundAmount = RefundReceipt.getTotalRefundAmountTextBox();
return TotalRefundAmount.isEnabled();
}

public void EnterAmountintoTotalRefundAmount(String TotalRefundAmount) {

RefundReceipt.getTotalRefundAmountTextBox().sendKeys(TotalRefundAmount);
}

////////////////////////////RefundAmountTextBox///////////////////////////
public boolean ValidateRefundAmountTextBoxisEnabled() {
WebElement RefundAmount = RefundReceipt.getRefundAmountTextBox();
return RefundAmount.isEnabled();
}

/////////////////////////////////EnterInValidAmountintotheRefundAmountTextBox////////////////////
public void EnterInValidAmountintotheRefundAmountTextBox(String InvalidAmount) {
/*RefundReceipt.getSecondCheckboxtoSelectService().click();
delay();
RefundReceipt.getThirdCheckboxtoSelectService().click();
delay();
softAssert.assertEquals(GetAlertText(), "Please check at least one item to Generate bill", "Alert Message is not matched.");
HandleAlert();
delay();
RefundReceipt.getFirstCheckboxtoSelectService().click();*/
delay();
RefundReceipt.getRefundAmountTextBox().clear();
delay();
RefundReceipt.getRefundAmountTextBox().sendKeys(InvalidAmount);
delay();
RefundReceipt.getTotalRefundAmountTextBox().click();
}

//////////////////////////////////////EnterValidAmountintotheRefundAmountTextBox//////////////////
public void EnterValidAmountintotheRefundAmountTextBox(String ValidAmount) {
RefundReceipt.getRefundAmountTextBox().clear();
delay();
RefundReceipt.getRefundAmountTextBox().sendKeys(ValidAmount);
delay();
RefundReceipt.getTotalRefundAmountTextBox().click();
}

/////////////////////////////////////////RemarksTextBox///////////////////////////
public boolean ValidateRemarksTextBoxisEnabled() {
WebElement RemarksTextBox = RefundReceipt.getRemarksTextBox();
return RemarksTextBox.isEnabled();
}

public void EnterRemarksintoRemarksTextBox(String Remarks) {
RefundReceipt.getRemarksTextBox().sendKeys(Remarks);
delay();
RefundReceipt.getTotalRefundAmountTextBox().click();

}

/////////////////////////StoretheRefundRecepitEntryformDataintoListforVerification////////////////////

public List<String> RefundRecepitEntryforminfoforVerification() {
//to catch all web elements into list
List<WebElement> RefundRecepitEntryform = RefundReceipt.getReceiptDetailinfoBoxForVerification();
//List<WebElement> PatientinfoTable = RefundReceipt.getPatientinfoTableForVerification();


//RefundRecepitEntryform contains all the web elements
//if you want to get all elements text into array list
List<String> TextofRefundRecepitEntryform = new ArrayList<String>();
System.out.println("Size of ArrayList at creation: " + TextofRefundRecepitEntryform.size()); 
//TextofRefundRecepitEntryform.add(PatientinfoTable.get(5).getText());//Patient Name
TextofRefundRecepitEntryform.add(RefundRecepitEntryform.get(3).getText());//Quantity
TextofRefundRecepitEntryform.add(RefundRecepitEntryform.get(4).getText());//Rate Amount
TextofRefundRecepitEntryform.add(RefundRecepitEntryform.get(5).getText());//Gross Amount
TextofRefundRecepitEntryform.add(RefundRecepitEntryform.get(7).getText());//Net Amount
//TextofRefundRecepitEntryform.add(RefundReceipt.getRemarksTextBox().getText());//remarks Amount
return TextofRefundRecepitEntryform;
}

//////////////////////////////////////////RefundBillButton//////////////////////////
public boolean ValidateRefundBillButtonisEnabled() {
WebElement RefundBillButton = RefundReceipt.getRefundBillButton();
return RefundBillButton.isEnabled();
}

public void ClickonRefundBillButton() {
	RefundReceipt.getRefundBillButton().click();
}

/////////////////////////StoretheRefundRecepitPrintoutDataintoListforVerification////////////////////
public List<String> RefundRecepitPrintoutinfoforVerification() {
List<WebElement> ServiceDetail = RefundReceipt.getServiceinfoinRefundrecepit();
//List<WebElement> PatientDetails = RefundReceipt.getPtientinfoinRefundrecepit();

List<String> TextofRefundRecepitEntryform = new ArrayList<String>();

//TextofRefundRecepitEntryform.add(PatientDetails.get(1).getText());//Patient Name
TextofRefundRecepitEntryform.add(ServiceDetail.get(3).getText());//Quantity
TextofRefundRecepitEntryform.add(ServiceDetail.get(4).getText());//Rate Amount
TextofRefundRecepitEntryform.add(ServiceDetail.get(5).getText());//Gross Amount
TextofRefundRecepitEntryform.add(ServiceDetail.get(2).getText());//Net Amount
//TextofRefundRecepitEntryform.add(RefundReceipt.getRemarksTextBox().getText());//remarks Amount
return TextofRefundRecepitEntryform;
}

public void VerifyRefundRecepitData() {
Assert.assertEquals(RefundRecepitEntryforminfoforVerification(), RefundRecepitPrintoutinfoforVerification(),"Data Validation Not matched");
}

/////////////////////////////RecepitNoRadiobutton//////////////////////
public boolean ValidateRecepitNoRadiobuttonisEnabled() {
WebElement RecepitNo = RefundReceipt.getRecepitNoRadiobutton();
return RecepitNo.isEnabled();
}

public boolean ValidateRecepitNoRadiobuttonisSelected() {
WebElement RecepitNo = RefundReceipt.getRecepitNoRadiobutton();
return RecepitNo.isSelected();
}

public void SelectRecepitNoRadiobutton() {
delay();
RefundReceipt.getRecepitNoRadiobutton().click();
}

///////////////////////////ClickonSerchbuttonWithInvalidRecepitNo/////////////////////////
public void ClickonSerchbuttonWithInvalidRecepitNo(String InvalidRecepitNo) {
delay();
selectDropdownVisibleElement(RefundReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
delay();
selectDropdownVisibleElement(RefundReceipt.getCashbookDropdown(),"COLLECTION");
delay();
RefundReceipt.getEnterIDTextbox().clear();
delay();
RefundReceipt.getEnterIDTextbox().sendKeys(InvalidRecepitNo);
delay();
RefundReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
}

////////////////////////////////////ClickonSerchbuttonWithvalidRecepitNo///////
public void ClickonSerchbuttonWithvalidRecepitNo(String validRecepitNo ) {
delay();
selectDropdownVisibleElement(RefundReceipt.getHeadofAccountDropdown(),"Automation Head_Recepit");
delay();
selectDropdownVisibleElement(RefundReceipt.getCashbookDropdown(),"COLLECTION");
delay();
RefundReceipt.getEnterIDTextbox().clear();
delay();
RefundReceipt.getEnterIDTextbox().sendKeys(validRecepitNo);
delay();
Actions action = new Actions(driver);
action.moveByOffset(0,0).perform();
delay();
for(int i = 0; i<11;i++) {
RefundReceipt.getEnterIDTextbox().sendKeys(Keys.chord(Keys.SHIFT,Keys.ARROW_LEFT,Keys.DELETE));
//DuplicateReceipt.getEnterIDTextbox().sendKeys(Keys.DELETE);
}
delay();
RefundReceipt.getGetSearchresultbuttonofUHIDateRecepitNoFilter().click();
delay();

}









}
