package ehospital.Billing_Module.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ehospital.Billing_Module.Locators.DuplicateReceiptLocators;
import ehospital.Billing_Module.Locators.ViewServiceChargeLocators;
import in.nic.ehospial.generic.BaseClass;

public class ViewServiceChargeHelper extends BaseClass {
public WebDriver driver;
	
ViewServiceChargeLocators ViewServiceCharge;
	
	
public ViewServiceChargeHelper(WebDriver driver) {
	this.driver = driver;
	ViewServiceCharge = new ViewServiceChargeLocators(driver);
	}

//Action
///////////////////////////////////////////////ViewServiceChargeLink/////////////////////////
public boolean ValidateViewServiceChargeLinkisDisplayed() {
	WebElement ViewServiceChargeLink = ViewServiceCharge.getViewServiceChargeLink();
	return ViewServiceChargeLink.isDisplayed();
}

public boolean ValidateViewServiceChargeLinkisEnabled() {
	WebElement ViewServiceChargeLink = ViewServiceCharge.getViewServiceChargeLink();
	return ViewServiceChargeLink.isEnabled();
}

public void ClickonViewServiceChargeLink() {
	ViewServiceCharge.getViewServiceChargeLink().click();
}

//////////////////////////////////////////SearchTestByGenericNameTextbox////////////////////////
public boolean validateSearchTestByGenericNameTextboxisEnabled() {
	WebElement SearchTestByGenericNameTextbox = ViewServiceCharge.getSearchTestByGenericNameTextbox();
	return SearchTestByGenericNameTextbox.isEnabled();
}

public void EnterInValidvalueintotheTextBox(String InvalidValue) {
	delay();
	ViewServiceCharge.getSearchTestByGenericNameTextbox().clear();
	delay();
	ViewServiceCharge.getSearchTestByGenericNameTextbox().sendKeys(InvalidValue);
}

public void EnterValidvalueintotheTextBox(String validValue) {
	delay();
	ViewServiceCharge.getSearchTestByGenericNameTextbox().clear();
	delay();
	ViewServiceCharge.getSearchTestByGenericNameTextbox().sendKeys(validValue);
	

}
////////////////////////CleartheSearchTestByGenericNameTextbox/////////////////
public void CleartheSearchTestByGenericNameTextbox() {
	delay();
	ViewServiceCharge.getSearchTestByGenericNameTextbox().clear();
}

///////////////////////////ServiceInformationTable///////////////////////////////////
public boolean ValidateServiceInformationTableisDisplayed() {
   WebElement ServiceInformationTable = ViewServiceCharge.getServiceInformationTable();
   return ServiceInformationTable.isDisplayed();
}

/////////////////////////////////////ServiceCategoryDropdown//////////////////////////
public boolean ValidateServiceCategoryDropdownisEnabled() {
	WebElement ServiceCategoryDropdown = ViewServiceCharge.getServiceCategoryDropdown();
	return ServiceCategoryDropdown.isEnabled();
}

public boolean ValidateServiceCategoryDropdownisMultiple() {
	WebElement ServiceCategoryDropdown = ViewServiceCharge.getServiceCategoryDropdown();
	return ISDropdownisMultiple(ServiceCategoryDropdown);
}

public void SelectValueFromthedropdown() {
	selectDropdownVisibleElement(ViewServiceCharge.getServiceCategoryDropdown(),"MICRO AUTOMATION TEST");
}

////////////////////////////////////////ViewChargelink/////////////////////////
public boolean ValidateViewChargelinkisEnabled() {
	WebElement ViewChargelink = ViewServiceCharge.getViewChargelink();
	return ViewChargelink.isEnabled();
}

public void CliconViewChargelink() {
	ViewServiceCharge.getViewChargelink().click();
}

//////////////////////////////////////////Cancel button//////////////////////////
public boolean ValidateCancelbuttonisEnabled() {
	WebElement Cancelbutton = ViewServiceCharge.getCancelbutton();
	return Cancelbutton.isEnabled();
}

public void ClickonCancelbutton() {
	ViewServiceCharge.getCancelbutton().click();
}





}

