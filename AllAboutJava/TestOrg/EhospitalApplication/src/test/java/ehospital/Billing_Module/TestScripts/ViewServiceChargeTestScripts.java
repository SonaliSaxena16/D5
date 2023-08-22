package ehospital.Billing_Module.TestScripts;

import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.DuplicateReceiptHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import ehospital.Billing_Module.helper.ViewServiceChargeHelper;
import in.nic.ehospial.generic.BaseClass;

public class ViewServiceChargeTestScripts extends BaseClass  {
	ViewServiceChargeHelper vsch;
	ViewServiceChargeTestScripts vsct;
	PreparationOfReceiptsHelper porh;
	
@Test(priority = 1,groups = {"Functional"})
public void ViewServiceChargeLinkisDisplayed() {
vsch = new ViewServiceChargeHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
vsct = new ViewServiceChargeTestScripts();
delay();

vsct.switchtoLeftFrame();
boolean ViewServiceChargeLink = vsch.ValidateViewServiceChargeLinkisDisplayed();
softAssert.assertTrue(ViewServiceChargeLink, "View Service Charge Link is not displayed");
if(ViewServiceChargeLink == true) {
	System.out.println("View Service Charge Link is displayed");
}
}

@Test(priority = 2,groups = {"Functional"})
public void ViewServiceChargeLinkisenabledandClickable() {
boolean ViewServiceChargeLink = vsch.ValidateViewServiceChargeLinkisEnabled();
softAssert.assertTrue(ViewServiceChargeLink, "View Service Charge Link is not Enabled");
if(ViewServiceChargeLink == true) {
	System.out.println("View Service Charge Link is Enabled");
	delay();
	vsch.ClickonViewServiceChargeLink();
	delay();
	vsct.switchtoinnerRightFrame();

}
}

@Test(priority = 3,groups = {"Functional"})
public void SearchTestByGenericNameTextboxisEnabledandEnterandInvalidvalues() {
boolean SearchTestByGenericNameTextbox = vsch.validateSearchTestByGenericNameTextboxisEnabled();
softAssert.assertTrue(SearchTestByGenericNameTextbox, "Search Test By Generic Name Textbox is not Enabled");
if(SearchTestByGenericNameTextbox == true) {
	System.out.println("Search Test By Generic Name Textbox is Enabled");
	delay();
	vsch.EnterInValidvalueintotheTextBox("#@$%&");
softAssert.assertEquals(GetAlertText(), "Enter Valid Generic or Service Name ");
}
}

@Test(priority = 4,groups = {"Functional"})
public void EnterValidvalueintotheTextBox() {
	delay();
    vsch.EnterValidvalueintotheTextBox("M");
 boolean EnterValidvalueintotheTextBox = vsch.ValidateServiceInformationTableisDisplayed();
 if(EnterValidvalueintotheTextBox == true) {
	 System.out.println("Service Information Table is displayed");
 }
vsch.CleartheSearchTestByGenericNameTextbox();
 
}

@Test(priority = 5,groups = {"Functional"})
public void ServiceCategoryDropdownisEnabledandSelectValue() {
boolean ServiceCategoryDropdown = vsch.ValidateServiceCategoryDropdownisEnabled();
softAssert.assertTrue(ServiceCategoryDropdown, "Service Category Dropdown is not Enabled");
if(ServiceCategoryDropdown == true) {
	System.out.println("Service Category Dropdown is Enabled");
	vsch.SelectValueFromthedropdown();
}
boolean EnterValidvalueintotheTextBox = vsch.ValidateServiceInformationTableisDisplayed();
if(EnterValidvalueintotheTextBox == true) {
	 System.out.println("Service Information Table is displayed");
}
}

@Test(priority = 6,groups = {"Functional"})
public void ServiceCategoryDropdownisMultiple() {
boolean ServiceCategoryDropdown = vsch.ValidateServiceCategoryDropdownisMultiple();
softAssert.assertTrue(ServiceCategoryDropdown, "Service Category Dropdown is not Multiple");
if(ServiceCategoryDropdown == true) {
	System.out.println("Service Category Dropdown is Multiple");
}
}

@Test(priority = 7,groups = {"Functional"})
public void ViewChargelinkisEnabledandClickable() {
boolean ViewChargelink = vsch.ValidateViewChargelinkisEnabled();
softAssert.assertTrue(ViewChargelink, "View Charge link is not Enabled");
if(ViewChargelink == true) {
	System.out.println("View Charge link is Enabled");
	delay();
	vsch.CliconViewChargelink();
}
}

@Test(priority = 8,groups = {"Functional"})
public void CancelbuttonisEnabledandClickable() {
boolean Cancelbutton = vsch.ValidateCancelbuttonisEnabled();
softAssert.assertTrue(Cancelbutton, "Cancel button is not Enabled");
if(Cancelbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	vsch.ClickonCancelbutton();
	}
	
}



}