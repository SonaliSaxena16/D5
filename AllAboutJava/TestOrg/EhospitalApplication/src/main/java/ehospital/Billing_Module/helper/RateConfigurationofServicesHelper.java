package ehospital.Billing_Module.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ehospital.Billing_Module.Locators.RateConfigurationofServicesLocators;
import in.nic.ehospial.generic.BaseClass;

public class RateConfigurationofServicesHelper extends BaseClass{
	public WebDriver driver;
			
	RateConfigurationofServicesLocators RateConfigurationofServices;
			
			
public RateConfigurationofServicesHelper(WebDriver driver) {
this.driver = driver;
RateConfigurationofServices = new RateConfigurationofServicesLocators(driver);
}

//Action
////////////////////////////////BillingAdminSubModule/////////////////////////////////
public boolean ValidateBillingAdminSubModuleisDispalyed() {
	WebElement BillingAdminSubModule = RateConfigurationofServices.getBillingAdminSubModule();
	return BillingAdminSubModule.isDisplayed();
}

public boolean ValidateBillingAdminSubModuleisEnabled() {
	WebElement BillingAdminSubModule = RateConfigurationofServices.getBillingAdminSubModule();
	return BillingAdminSubModule.isEnabled();
}

public void ClickonBillingAdminSubModule() {
	RateConfigurationofServices.getBillingAdminSubModule().click();
}

////////////////////////////////////RateConfigurationofServicesLink///////////////////////////////
public boolean ValidateRateConfigurationofServicesLinkisDispalyed() {
	WebElement RateConfigurationofServicesLink = RateConfigurationofServices.getRateConfigurationofServicesLink();
	return RateConfigurationofServicesLink.isDisplayed();
}

public boolean ValidateRateConfigurationofServicesLinkisEnabled() {
	WebElement RateConfigurationofServicesLink = RateConfigurationofServices.getRateConfigurationofServicesLink();
	return RateConfigurationofServicesLink.isEnabled();
}

public void ClickonRateConfigurationofServicesLink() {
	RateConfigurationofServices.getRateConfigurationofServicesLink().click();
}

/////////////////////////////////////ServiceCategoryDropdown////////////////////////////////
public boolean ValidateServiceCategoryDropdownisEnabled() {
WebElement ServiceCategoryDropdown = RateConfigurationofServices.getServiceCategoryDropdown();
return ServiceCategoryDropdown.isEnabled();
}

public boolean ValidateServiceCategoryDropdownisMultiple() {
WebElement ServiceCategoryDropdown = RateConfigurationofServices.getServiceCategoryDropdown();
return ISDropdownisMultiple(ServiceCategoryDropdown);
}

public void SelectValueFromthedropdown() {
selectDropdownVisibleElement(RateConfigurationofServices.getServiceCategoryDropdown(),"MICRO AUTOMATION TEST");
}

///////////////////////////ServiceInformationTable////////////////////////////////////////
public boolean ValidateServiceInformationTableisDisplayed() {
WebElement ServiceInformationTable = RateConfigurationofServices.getServiceInformationTable();
return ServiceInformationTable.isDisplayed();
}

/////////////////////////////////////////Detailslink///////////////////////////////////////////////
public boolean ValidateDetailslinkisEnabled() {
	WebElement Detailslink = RateConfigurationofServices.getDetailslink();
	return Detailslink.isEnabled();
}

public void ClickonDetailslink() {
	RateConfigurationofServices.getDetailslink().click();
}

///////////////////////////ServiceChargePopUpbox////////////////////////////////////////
public boolean ValidateServiceChargePopUpboxisDisplayed() {
WebElement ServiceChargePopUpbox = RateConfigurationofServices.getServiceChargePopUpbox();
return ServiceChargePopUpbox.isDisplayed();
}

////////////////////////////BasicRateTextBox/////////////////////////////////////////////
public boolean ValidateBasicRateTextBoxisEnabled() {
	WebElement BasicRateTextBox = RateConfigurationofServices.getBasicRateTextBox();
	return BasicRateTextBox.isEnabled();
	
}
public void EnterInvalidDataintoBasicRateTextBox(String InvalidRate) {
	RateConfigurationofServices.getBasicRateTextBox().clear();
	delay();
	RateConfigurationofServices.getBasicRateTextBox().sendKeys(InvalidRate);
}

public void EnterValidDataintoBasicRateTextBox(String ValidRate) {
	RateConfigurationofServices.getBasicRateTextBox().clear();
	delay();
	RateConfigurationofServices.getBasicRateTextBox().sendKeys(ValidRate);
}

/////////////////////////////////////ChangeForAlllink////////////////////////////////////////
public boolean ValidateChangeForAlllinkisEnabled() {
	WebElement ChangeForAlllink = RateConfigurationofServices.getChangeForAlllink();
	return ChangeForAlllink.isEnabled();
	
}

public void ClickonChangeForAlllink() {
	RateConfigurationofServices.getChangeForAlllink().click();
}

////////////////////////////////////Savebutton//////////////////////////////////////////
public boolean ValidateSavebuttonisEnabled() {
	WebElement Savebutton = RateConfigurationofServices.getSavebutton();
	return Savebutton.isEnabled();
	
}

public void ClickSavebuttonk() {
	RateConfigurationofServices.getSavebutton().click();
}
 
//////////////////////////VerifyTextBoxesvaluesafterClickonSavebutton///////////////////////////////
public String BasicRateTextBoxValue() {
	String BasicRateTextBoxValue = RateConfigurationofServices.getBasicRateTextBox().getText();
	return BasicRateTextBoxValue;
}

public String RateTextBoxValue() {
	String RateTextBoxValue = RateConfigurationofServices.getRateTextBox().getText();
	return RateTextBoxValue;
}

public void VerifyTextBoxesvaluesafterClickonSavebutton() {
	Assert.assertEquals(BasicRateTextBoxValue(), RateTextBoxValue(), "Text box values are not matched");
}

//////////////////////////////////////////////RateTextBox////////////////////////////////////////
public boolean ValidateRateTextBoxisEnabled() {
	WebElement RateTextBox = RateConfigurationofServices.getRateTextBox();
	return RateTextBox.isEnabled();
}

public void EnterInvalidDataintoRateTextBox(String InvalidRate) {
	RateConfigurationofServices.getRateTextBox().clear();
	delay();
	RateConfigurationofServices.getRateTextBox().sendKeys(InvalidRate);
}

public void EnterValidDataintoRateTextBox(String ValidRate) {
	RateConfigurationofServices.getRateTextBox().clear();
	delay();
	RateConfigurationofServices.getRateTextBox().sendKeys(ValidRate);
	delay();
	RateConfigurationofServices.getSavebutton().click();
}

////////////////////////////////FreeCheckBox///////////////////////////////////
public boolean ValidateFreeCheckBoxisEnabled(){
	WebElement FreeCheckBox = RateConfigurationofServices.getFreeCheckBox();
	return FreeCheckBox.isEnabled();
}

public boolean ValidateFreeCheckBoxisSelected(){
	WebElement FreeCheckBox = RateConfigurationofServices.getFreeCheckBox();
	return FreeCheckBox.isSelected();
}

public void SelectFreeCheckBox() {
	RateConfigurationofServices.getFreeCheckBox().click();
	delay();
	RateConfigurationofServices.getSavebutton().click();
}

/////////////////////////////////////////Cancelbutton//////////////////////////////////
public boolean ValidateCancelbuttonisEnabled() {
	WebElement Cancelbutton = RateConfigurationofServices.getCancelbutton();
	return Cancelbutton.isEnabled();
}

public void ClickonCancelbutton() {
	RateConfigurationofServices.getCancelbutton().click();
}

////////////////////////////////////////SearchServiceByGenericNameTextBox///////////////////////
public boolean ValidateSearchServiceByGenericNameTextBoxisEnabled() {
	WebElement SearchServiceByGenericName = RateConfigurationofServices.getSearchServiceByGenericNameTextBox();
	return SearchServiceByGenericName.isEnabled();
}

public void EnterValidDataintoSearchServiceByGenericNameTextBox(String ValidServiceFirstName) {
	RateConfigurationofServices.getSearchServiceByGenericNameTextBox().clear();
	delay();
	RateConfigurationofServices.getSearchServiceByGenericNameTextBox().sendKeys(ValidServiceFirstName);
}

}
