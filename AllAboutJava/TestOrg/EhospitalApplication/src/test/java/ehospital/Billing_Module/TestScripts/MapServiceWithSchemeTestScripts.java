package ehospital.Billing_Module.TestScripts;

import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.MapServiceWithSchemeHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import in.nic.ehospial.generic.BaseClass;

public class MapServiceWithSchemeTestScripts extends BaseClass {
	MapServiceWithSchemeHelper mswsh;
	MapServiceWithSchemeTestScripts mswst;
	PreparationOfReceiptsHelper porh;
	
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void SchemeSubModuleisEnabledandClickable() {
mswsh = new MapServiceWithSchemeHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
mswst = new MapServiceWithSchemeTestScripts();
delay();

mswst.switchtoLeftFrame();
boolean SchemeSubModule = mswsh.ValidateSchemeSubModuleisEnabled();
softAssert.assertTrue(SchemeSubModule, "Scheme Sub Module is Not Enabled");
if(SchemeSubModule == true) {
	System.out.println("Scheme Sub Module is Enabled");
	delay();
	mswsh.ClickonSchemeSubModule();
}
}

@Test(priority = 2,groups = {"Functional"})
public void MapServiceWithSchemelinkisDisplayed() {
boolean MapServiceWithSchemelink = mswsh.ValidateSchemeSubModuleisEnabled();
softAssert.assertTrue(MapServiceWithSchemelink, "MapService With Scheme link is Not Displayed");
if(MapServiceWithSchemelink == true) {
	System.out.println("Map Service With Scheme link is Displayed");
}	
}

@Test(priority = 3,groups = {"Functional","Smoke"})
public void MapServiceWithSchemelinkisEnabledandClickable() {
boolean MapServiceWithSchemelink = mswsh.ValidateMapServiceWithSchemelinkisEnabled();
softAssert.assertTrue(MapServiceWithSchemelink, "MapService With Scheme link is Not Enabled");
if(MapServiceWithSchemelink == true) {
	System.out.println("Map Service With Scheme link is Enabled");
	delay();
	mswsh.ClickonMapServiceWithSchemelink();
	delay();
	mswst.switchtoinnerRightFrame();
}	
}

@Test(priority = 4,groups = {"Functional","Smoke"})
public void SchemeNameDropdownisEnabledandSelectValuefromtheDropdwon() {
boolean SchemeName = mswsh.ValidateSchemeNameDropdownisEnabled();
softAssert.assertTrue(SchemeName, "Scheme Name drop down is Not Enabled");
if(SchemeName == true) {
	System.out.println("Scheme Name drop down is  Enabled");
delay();
mswsh.SelectvaluefromDropdown();
}
}

@Test(priority = 5,groups = {"Functional"})
public void SchemeNameDropdownisMultiple() {
boolean SchemeName = mswsh.ValidateSchemeNameDropdownisEnabled();
softAssert.assertFalse(SchemeName, "Scheme Name drop down is Multiple");
if(SchemeName == false) {
	System.out.println("Scheme Name drop down is not Multiple");
}	
}

@Test(priority = 6,groups = {"Functional","Smoke"})
public void ServiceCategoryDropdownisEnabledandSelectValuefromtheDropdwon() {
boolean ServiceCategory = mswsh.ValidateServiceCategoryDropdownisEnabled();
softAssert.assertTrue(ServiceCategory, "Service Category drop down is Not Enabled");
if(ServiceCategory == true) {
	System.out.println("Service Category drop down is  Enabled");
delay();
mswsh.SelectvaluefromServiceCategoryDropdown();
delay();
boolean ServiceTable = mswsh.ValidateServiceTableisDisplayed();
softAssert.assertFalse(ServiceTable, "Service Table is Not displayed");

}
}

@Test(priority = 7,groups = {"Functional"})
public void ServiceCategoryDropdownisMultiple() {
boolean ServiceCategory = mswsh.ValidateServiceCategoryDropdownisMultiple();
softAssert.assertFalse(ServiceCategory, "Service Category drop down is Not Multiple");
if(ServiceCategory == false) {
	System.out.println("Service Category drop down is Multiple");
delay();
}
}

@Test(priority = 8,groups = {"Functional"})
public void FilterServiceTextBoxisEnabledandEnterText() {
boolean FilterService = mswsh.ValidateFilterServiceTextBoxisEnabled();
softAssert.assertTrue(FilterService, "Filter Service Text box is not Enabled");
if(FilterService == true) {
	System.out.println("Filter Service Text box is Enabled");
	delay();
	mswsh.EnterTextintoFilterServiceTextBox("A");
}
}

@Test(priority = 9,groups = {"Functional"})
public void FirstServiceRateTextBoxisEnabledandEnterInvalidRate() {
boolean ServiceRate = mswsh.ValidateFirstServiceRateTextBoxisEnabled();
softAssert.assertTrue(ServiceRate, "Service Rate Text box is Not Enabled");
if(ServiceRate == true) {
	System.out.println("Service Rate Text box is Enabled");
	delay();
	mswsh.EnterInvalidRateintoFirstServiceRateTextBox("#$%^&");
	delay();
softAssert.assertEquals(GetAlertText(), "Please Enter Valid Service Rate", "Alert PopUp Message is not coming");
delay();
HandleAlert();
}
}

@Test(priority = 10,groups = {"Functional","Smoke"})
public void FirstServiceRateTextBoxisEnabledandEnterValidRate() {
boolean ServiceRate = mswsh.ValidateFirstServiceRateTextBoxisEnabled();
softAssert.assertTrue(ServiceRate, "Service Rate Text box is Not Enabled");
if(ServiceRate == true) {
	System.out.println("Service Rate Text box is Enabled");
	delay();
	mswsh.EnterValidRateintoFirstServiceRateTextBox("300");
	delay();
}
}

@Test(priority = 11,groups = {"Functional","Smoke"})
public void PreauthorizationCheckboxisEnabledandClickable() {
boolean Preauthorization = mswsh.ValidatePreauthorizationCheckboxisEnabled();
softAssert.assertTrue(Preauthorization, "Preauthorization check box is Not Enabled");
if(Preauthorization == true) {
	System.out.println("Preauthorization check box is Enabled");
	delay();
	mswsh.SelectPreauthorizationCheckbox();
}
}

@Test(priority = 12,groups = {"Functional"})
public void PreauthorizationCheckboxisSelected() {
boolean Preauthorization = mswsh.ValidatePreauthorizationCheckboxisSelected();
softAssert.assertTrue(Preauthorization, "Preauthorization check box is Not Selected");
if(Preauthorization == true) {
	System.out.println("Preauthorization check box is Selected");
}
}

@Test(priority = 13,groups = {"Functional","Smoke"})
public void SelectCheckboxisEnabledandClickable() {
boolean SelectCheckbox = mswsh.ValidateSelectCheckboxisEnabled();
softAssert.assertTrue(SelectCheckbox, "Select check box is Not Enabled");
if(SelectCheckbox == true) {
	System.out.println("Select Check box is Enabled");
	delay();
	mswsh.ClickonSelectCheckbox();
}
}

@Test(priority = 14,groups = {"Functional"})
public void SelectCheckboxisSelected() {
boolean SelectCheckbox = mswsh.ValidateSelectCheckboxisSelected();
softAssert.assertTrue(SelectCheckbox, "Select check box is Not Selected");
if(SelectCheckbox == true) {
	System.out.println("Select Check box is Selected");
}
}

@Test(priority = 15,groups = {"Functional","Smoke"})
public void MapServicebuttonisEnabledandClickable() throws Exception {
boolean MapServicebutton = mswsh.ValidateMapServicebuttonisEnabled();
softAssert.assertTrue(MapServicebutton, "Map Service button is not Enabled");
if(MapServicebutton == true) {
	System.out.println("Map Service button is Enabled");
	delay();
mswsh.ClickonMapServicebutton();
delay();
boolean MapServiceMessage = mswsh.ValidateMapServiceMessageisDisplayed();
softAssert.assertFalse(MapServiceMessage, "Map Service Message is Not displayed");
delay();
}
boolean TextfromList = mswsh.VerifyServiceMapListText();
if(TextfromList == true) {
	System.out.println("Mapped text is Present in the list");
}else if(TextfromList == false) {
	System.out.println("Mapped text is Not Present in the list");
	delay();
	throw new Exception("Mapped list is not Displayed");
}
}



















}
