package ehospital.Billing_Module.TestScripts;

import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import ehospital.Billing_Module.helper.RateConfigurationofServicesHelper;
import ehospital.Billing_Module.helper.ViewServiceChargeHelper;
import in.nic.ehospial.generic.BaseClass;

public class RateConfigurationofServicesTestScripts extends BaseClass{
	RateConfigurationofServicesHelper rcsh;
	RateConfigurationofServicesTestScripts rcst;
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void BillingAdminSubModuleisDispalyed() {
rcsh = new RateConfigurationofServicesHelper(driver);

rcst = new RateConfigurationofServicesTestScripts();
delay();

rcst.switchtoLeftFrame();
boolean BillingAdminSubModule = rcsh.ValidateBillingAdminSubModuleisDispalyed();
softAssert.assertTrue(BillingAdminSubModule, "Billing Admin Sub Module is not Displayed");
if(BillingAdminSubModule == true) {
	System.out.println("Billing Admin Sub Module is Displayed");
}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void BillingAdminSubModuleisEnabledandClickable() {
boolean BillingAdminSubModule = rcsh.ValidateBillingAdminSubModuleisEnabled();
softAssert.assertTrue(BillingAdminSubModule, "Billing Admin Sub Module is not Enabled");
if(BillingAdminSubModule == true) {
	System.out.println("Billing Admin Sub Module is Enabled");
	delay();
	rcsh.ClickonBillingAdminSubModule();
}
}

@Test(priority = 3,groups = {"Functional"})
public void RateConfigurationofServicesLinkisDispalyed() {
boolean RateConfigurationofServicesLink = rcsh.ValidateRateConfigurationofServicesLinkisDispalyed();
softAssert.assertTrue(RateConfigurationofServicesLink, "Rate Configuration of Services Link is not Displayed");
if(RateConfigurationofServicesLink == true) {
	System.out.println("Rate Configuration of Services Link is Displayed");
}
}

@Test(priority = 4,groups = {"Functional","Smoke"})
public void RateConfigurationofServicesLinkisEnabledandClickable() {
boolean RateConfigurationofServicesLink = rcsh.ValidateRateConfigurationofServicesLinkisEnabled();
softAssert.assertTrue(RateConfigurationofServicesLink, "Rate Configuration of Services Link is not Enabled");
if(RateConfigurationofServicesLink == true) {
	System.out.println("Rate Configuration of Services Link is Enabled");
	delay();
	rcsh.ClickonRateConfigurationofServicesLink();
}
}

@Test(priority = 5,groups = {"Functional","Smoke"})
public void ServiceCategoryDropdownisEnabledandSelectValue() {
	delay();

	rcst.switchtoinnerRightFrame();

boolean ServiceCategoryDropdown = rcsh.ValidateServiceCategoryDropdownisEnabled();
softAssert.assertTrue(ServiceCategoryDropdown, "Service Category Dropdown is not Enabled");
if(ServiceCategoryDropdown == true) {
	System.out.println("Service Category Dropdown is Enabled");
	rcsh.SelectValueFromthedropdown();
}
boolean ServiceInformationTable = rcsh.ValidateServiceInformationTableisDisplayed();
softAssert.assertTrue(ServiceInformationTable, "Service Information Table is not Displayed");
if(ServiceInformationTable == true) {
	 System.out.println("Service Information Table is displayed");
}
}

@Test(priority = 6,groups = {"Functional","Smoke"})
public void DetailslinkisEnabledandClickable() {
boolean Detailslink = rcsh.ValidateDetailslinkisEnabled();
softAssert.assertTrue(Detailslink, "Details link is not Enabled");
if(Detailslink == true) {
	System.out.println("Details link is Enabled");
	delay();
	rcsh.ClickonDetailslink();
}
boolean ServiceChargePopUpbox = rcsh.ValidateServiceChargePopUpboxisDisplayed();
softAssert.assertTrue(ServiceChargePopUpbox, "Service Charge Pop Up box is not Displayed");
if(ServiceChargePopUpbox == true) {
	 System.out.println("Service Charge Pop Up box is displayed");
}
}

@Test(priority = 7,groups = {"Functional"})
public void BasicRateTextBoxisEnabledandEnterInvalidRate() {
boolean BasicRate = rcsh.ValidateBasicRateTextBoxisEnabled();
softAssert.assertTrue(BasicRate, "Basic Rate Text Box is not Enabled");
if(BasicRate == true) {
	System.out.println("Basic Rate Text Box is Enabled");
	delay();
	rcsh.EnterInvalidDataintoBasicRateTextBox("%%TY");
}
}

@Test(priority = 8,groups = {"Functional","Smoke"})
public void BasicRateTextBoxisEnabledandEntervalidRate() {
boolean BasicRate = rcsh.ValidateBasicRateTextBoxisEnabled();
softAssert.assertTrue(BasicRate, "Basic Rate Text Box is not Enabled");
if(BasicRate == true) {
	System.out.println("Basic Rate Text Box is Enabled");
	delay();
	rcsh.EnterValidDataintoBasicRateTextBox("500");
}
}

@Test(priority = 9,groups = {"Functional","Smoke"})
public void ChangeForAlllinkisEnabledandClickable() {
boolean ChangeForAll = rcsh.ValidateChangeForAlllinkisEnabled();
softAssert.assertTrue(ChangeForAll, "Change For All link is not Enabled");
if(ChangeForAll == true) {
	System.out.println("Change For All link is Enabled");
	delay();
	rcsh.ClickonChangeForAlllink();
}
}

@Test(priority = 10,groups = {"Functional","Smoke"})
public void SavebuttonisEnabledandClickable() {
boolean Savebutton = rcsh.ValidateChangeForAlllinkisEnabled();
softAssert.assertTrue(Savebutton, "Save button is not Enabled");
if(Savebutton == true) {
	System.out.println("Save button is Enabled");
	delay();
	rcsh.ClickSavebuttonk();
softAssert.assertEquals(GetAlertText(), "Saved Successfully...", "Save Button Alert Message is not Matched");
	HandleAlert();
	delay();
	rcsh.VerifyTextBoxesvaluesafterClickonSavebutton();
}
}

@Test(priority = 11,groups = {"Functional"})
public void RateTextBoxisEnabledandEnterInvalidData() {
boolean RateTextBox = rcsh.ValidateRateTextBoxisEnabled();
softAssert.assertTrue(RateTextBox, "Rate Text Box is not Enabled");
if(RateTextBox == true) {
	System.out.println("Rate Text Box is Enabled");
	delay();
	rcsh.EnterInvalidDataintoRateTextBox("@#$%YUI");

}
}

@Test(priority = 12,groups = {"Functional","Smoke"})
public void RateTextBoxisEnabledandEnterValidData() {
boolean RateTextBox = rcsh.ValidateRateTextBoxisEnabled();
softAssert.assertTrue(RateTextBox, "Rate Text Box is not Enabled");
if(RateTextBox == true) {
	System.out.println("Rate Text Box is Enabled");
	delay();
	rcsh.EnterValidDataintoRateTextBox("200");
	softAssert.assertEquals(GetAlertText(), "Saved Successfully...", "Save Button Alert Message is not Matched");
	HandleAlert();

}
}

@Test(priority = 13,groups = {"Functional","Smoke"})
public void FreeCheckBoxisEnabledandSelectable() {
boolean FreeCheckBox = rcsh.ValidateFreeCheckBoxisEnabled();
softAssert.assertTrue(FreeCheckBox, "Free Check Box is Not Enabled");
if(FreeCheckBox == true) {
	System.out.println("Free Check Box is Enabled");
	delay();
	rcsh.SelectFreeCheckBox();
	softAssert.assertEquals(GetAlertText(), "Saved Successfully...", "Save Button Alert Message is not Matched");
	HandleAlert();
}
}

@Test(priority = 14,groups = {"Functional"})
public void FreeCheckBoxisSeleted() {
boolean FreeCheckBox = rcsh.ValidateFreeCheckBoxisSelected();
softAssert.assertTrue(FreeCheckBox, "Free Check Box is Not Selected");
if(FreeCheckBox == true) {
	System.out.println("Free Check Box is Selected");	
}
}

@Test(priority = 15,groups = {"Functional","Smoke"})
public void CancelbuttonisEnabledandClickable() {
boolean Cancelbutton = rcsh.ValidateCancelbuttonisEnabled();
softAssert.assertTrue(Cancelbutton, "Cancel button is not Enabled");
if(Cancelbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	rcsh.ClickonCancelbutton();
}
}

@Test(priority = 16,groups = {"Functional"})
public void SearchServiceByGenericNameTextBoxisEnabledandEnterValidServiceName() {
boolean SearchServiceByGenericName = rcsh.ValidateSearchServiceByGenericNameTextBoxisEnabled();
softAssert.assertTrue(SearchServiceByGenericName, "Search Service By Generic Name is not Enabled");
if(SearchServiceByGenericName == true) {
	System.out.println("Search Service By Generic Name is Enabled");
	delay();
	rcsh.EnterValidDataintoSearchServiceByGenericNameTextBox("M");
}
}




}
