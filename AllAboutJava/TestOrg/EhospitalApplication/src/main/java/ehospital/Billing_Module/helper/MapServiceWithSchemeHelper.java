package ehospital.Billing_Module.helper;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ehospital.Billing_Module.Locators.MapServiceWithSchemeLocators;
import in.nic.ehospial.generic.BaseClass;

public class MapServiceWithSchemeHelper extends BaseClass{
public WebDriver driver;
	
MapServiceWithSchemeLocators MapServiceWithScheme;
							
							
public MapServiceWithSchemeHelper(WebDriver driver) {
this.driver = driver;
MapServiceWithScheme = new MapServiceWithSchemeLocators(driver);
}

//Action
////////////////////////////SchemeSubModule/////////////////////////
public boolean ValidateSchemeSubModuleisEnabled() {
WebElement SchemeSubModule = MapServiceWithScheme.getSchemeSubModule();
return SchemeSubModule.isEnabled();
}

public void ClickonSchemeSubModule() {
	MapServiceWithScheme.getSchemeSubModule().click();
}

///////////////////////////////////MapServiceWithSchemelink/////////////////////////
public boolean ValidateMapServiceWithSchemelinkisDisplayed() {
WebElement MapServiceWithSchemelink = MapServiceWithScheme.getMapServiceWithSchemelink();
return MapServiceWithSchemelink.isDisplayed();
}

public boolean ValidateMapServiceWithSchemelinkisEnabled() {
WebElement MapServiceWithSchemelink = MapServiceWithScheme.getMapServiceWithSchemelink();
return MapServiceWithSchemelink.isEnabled();
}


public void ClickonMapServiceWithSchemelink() {
	MapServiceWithScheme.getMapServiceWithSchemelink().click();
}

//////////////////////////////SchemeNameDropdown/////////////////////////////////////////////
public boolean ValidateSchemeNameDropdownisEnabled() {
WebElement SchemeName = MapServiceWithScheme.getSchemeNameDropdown();
return SchemeName.isEnabled();
}

public boolean ValidateSchemeNameDropdownisMultiple() {
WebElement SchemeName = MapServiceWithScheme.getSchemeNameDropdown();
return ISDropdownisMultiple(SchemeName);
}

public void SelectvaluefromDropdown() {
	selectDropdownVisibleElement(MapServiceWithScheme.getSchemeNameDropdown(),"Automation Ayush");
}

//////////////////////////////////ServiceCategoryDropdown////////////////////////////////////////
public boolean ValidateServiceCategoryDropdownisEnabled() {
WebElement ServiceCategory = MapServiceWithScheme.getServiceCategoryDropdown();
return ServiceCategory.isEnabled();
}

public boolean ValidateServiceCategoryDropdownisMultiple() {
WebElement ServiceCategory = MapServiceWithScheme.getServiceCategoryDropdown();
return ISDropdownisMultiple(ServiceCategory);
}

public void SelectvaluefromServiceCategoryDropdown() {
	selectDropdownVisibleElement(MapServiceWithScheme.getServiceCategoryDropdown(),"MICRO AUTOMATION TEST");
}

/////////////////////////////////ServiceTable////////////////////////////////////
public boolean ValidateServiceTableisDisplayed() {
WebElement ServiceTable = MapServiceWithScheme.getServiceTable();
return ServiceTable.isDisplayed();
}

///////////////////////////FilterServiceTextBox//////////////////////////////////////
public boolean ValidateFilterServiceTextBoxisEnabled() {
WebElement FilterServiceTextBox = MapServiceWithScheme.getFilterServiceTextBox();
return FilterServiceTextBox.isEnabled();
}

public void EnterTextintoFilterServiceTextBox(String Text) {
	MapServiceWithScheme.getFilterServiceTextBox().clear();
	delay();
	MapServiceWithScheme.getFilterServiceTextBox().sendKeys(Text);
	delay();
	MapServiceWithScheme.getFilterServiceTextBox().clear();
}

///////////////////////////////////FirstServiceRateTextBox////////////////////////////////////
public boolean ValidateFirstServiceRateTextBoxisEnabled() {
WebElement FirstServiceRateTextBox = MapServiceWithScheme.getFirstServiceRateTextBox();
return FirstServiceRateTextBox.isEnabled();
}

public void EnterInvalidRateintoFirstServiceRateTextBox(String Rate) {
	MapServiceWithScheme.getFirstServiceRateTextBox().clear();
	delay();
	MapServiceWithScheme.getFirstServiceRateTextBox().sendKeys(Rate);
}

public void EnterValidRateintoFirstServiceRateTextBox(String Rate) {
	MapServiceWithScheme.getFirstServiceRateTextBox().clear();
	delay();
	MapServiceWithScheme.getFirstServiceRateTextBox().sendKeys(Rate);
}

/////////////////////////////////////PreauthorizationCheckbox//////////////////////////

public boolean ValidatePreauthorizationCheckboxisEnabled() {
WebElement Preauthorization = MapServiceWithScheme.getPreauthorizationCheckbox();
return Preauthorization.isEnabled();
}

public boolean ValidatePreauthorizationCheckboxisSelected() {
WebElement Preauthorization = MapServiceWithScheme.getPreauthorizationCheckbox();
return Preauthorization.isSelected();
}

public void SelectPreauthorizationCheckbox() {
	delay();
	MapServiceWithScheme.getPreauthorizationCheckbox().click();
}

////////////////////////////////////////SelectCheckbox/////////////////////

public boolean ValidateSelectCheckboxisEnabled() {
WebElement SelectCheckbox = MapServiceWithScheme.getSelectCheckbox();
return SelectCheckbox.isEnabled();
}

public boolean ValidateSelectCheckboxisSelected() {
WebElement SelectCheckbox = MapServiceWithScheme.getSelectCheckbox();
return SelectCheckbox.isSelected();
}

public void ClickonSelectCheckbox() {
	delay();
	MapServiceWithScheme.getSelectCheckbox().click();
}

////////////////////////////////////MapServicebutton/////////////////////////////////

public boolean ValidateMapServicebuttonisEnabled() {
WebElement MapServicebutton = MapServiceWithScheme.getMapServicebutton();
return MapServicebutton.isEnabled();
}

public void ClickonMapServicebutton() {
	delay();
	MapServiceWithScheme.getSelectCheckbox().click();
	delay();
	MapServiceWithScheme.getSelectFirstCheckbox().click();
	delay();
	MapServiceWithScheme.getMapServicebutton().click();
	
}

////////////////////////////////////MapServiceMessage////////////////////////////////

public boolean ValidateMapServiceMessageisDisplayed() {
WebElement MapServiceMessage = MapServiceWithScheme.getMapServiceMessage();
return MapServiceMessage.isDisplayed();
}

//////////////////////ServiceMapList///////////////////////////////////////////////
public boolean VerifyServiceMapListText() {
List<WebElement> ServiceMapList = MapServiceWithScheme.getServiceMapList();
 verifyTextForElementfromList(ServiceMapList,"ABG");
return false;
}













}
