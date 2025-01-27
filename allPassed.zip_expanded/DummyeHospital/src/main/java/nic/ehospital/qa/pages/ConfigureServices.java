package nic.ehospital.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import nic.ehospital.qa.base.TestBase;

public class ConfigureServices extends TestBase{

	@FindBy(xpath="//*[contains(@title,'Configure Services')]")
	WebElement configServiceLink;
	
	@FindBy(xpath="//*[contains(@value,'Add Service Category')]")
	WebElement addServiceCategoryBtn;
	
	@FindBy(xpath="//*[contains(@id,'ser_cat')]")
	WebElement serviceNameDrpdwn;
	
	@FindBy(xpath="//*[contains(@onclick,'saveDetails();')]")
	WebElement saveServiceBtn;
	
	@FindBy(xpath="//*[contains(@id,'txtservicecatname')]")
	WebElement serviceNameTxtbox;
	
	@FindBy(xpath="//input[@name='typecatcash' and @value='Y']")
	WebElement isCashRequiredCheckboxYes;
	
	@FindBy(xpath="//input[@name='typecatcash' and @value='N']")
	WebElement isCashRequiredCheckboxNo;

	@FindBy(xpath="//input[@onclick='hidecatdiv();']")
	WebElement closeServiceBtn;

	@FindBy(xpath="//select[@id='ddlsearchtest']")
	WebElement selectServiceCategoryDrpdwn;

	@FindBy(xpath="//input[@value='Add Service']")
	WebElement addServiceBtn;

@FindBy(css="#addservicepopup > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > select:nth-child(2)")
	WebElement addService_ServiceNameDrpdwn;
	
@FindBy(xpath="//input[@onclick='addservicedetails();']")
WebElement addService_SaveServiceBtn;

@FindBy(xpath="//input[@name='txtservicename']")
WebElement addService_ServiceNameTxtbox;

@FindBy(xpath="//input[@name='samplebased' and @value='Y']")
WebElement addService_SampleBasedYesChkbox;

@FindBy(xpath="//input[@name='samplebased' and @value='N']")
WebElement addService_SampleBasedNoChkbox;
	
@FindBy(xpath="//input[@name='type' and @value='I']")
WebElement addService_ServiceTypeBillingChkbox;
	
@FindBy(xpath="//input[@name='typecash' and @value='Y']")
WebElement addService_IsCashRequiredYesChkbox;
		
@FindBy(xpath="//input[@name='typecash' and @value='N']")
WebElement addService_IsCashRequiredNoChkbox;
	
@FindBy(xpath="//input[@onclick='hidediv();']")
WebElement addService_closeServiceBtn;
	
	
	public ConfigureServices() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	
	// Perform Actions
	
			//Validate: Configure Services Link is Displayed
			public boolean configureServicesLinkIsDisplayed(){
			WebElement link = configServiceLink;
			return link.isDisplayed();
			}

			//Validate: Configure Services link is Enabled
			public boolean configureServicesLinkIsEnabled(){
			WebElement btn = configServiceLink;
			return btn.isEnabled();
			}
			
			//Validate: Configure Services link is Clickable
			public void configureServicesLinkIsClickable() throws InterruptedException{
			configServiceLink.click();
			Thread.sleep(2000);
			}

			
			//Validate: Configure Services_Add Service Category is Displayed
			public boolean addServicCategoryBtnIsDisplayed(){
			WebElement link = addServiceCategoryBtn;
			return link.isDisplayed();
			}

			//Validate: Configure Services_Add Service Category is Enabled
			public boolean addServicCategoryBtnIsEnabled(){
			WebElement btn = addServiceCategoryBtn;
			return btn.isEnabled();
			}
			
			//Validate: Configure Services_Add Service Category is Clickable
			public void addServicCategoryBtnIsClickable() throws InterruptedException{
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(addServiceCategoryBtn)); 
		
		//	wait.until(ExpectedConditions.elementToBeClickable(addServiceBtn)) ;
			
			addServiceCategoryBtn.click();
			Thread.sleep(3000);
			}
	
	
			//Validate: Add Service Category_ServiceName dropdown is Displayed
			public boolean serviceNameDropdownIsDisplayed() throws InterruptedException{
			WebElement drpdwn = serviceNameDrpdwn;
			Thread.sleep(3000);
			return drpdwn.isDisplayed();
			}
			
			//Validate: Add Service Category_ServiceName dropdown is Enabled
			public boolean serviceNameDropdownIsEnabled(){
			WebElement drpdwn = serviceNameDrpdwn;
			return drpdwn.isEnabled();
			}
			
			//Validate: Add Service Category_ServiceName dropdown is Multiple
			public boolean serviceNameDropdownIsMultiple() throws InterruptedException{
			Thread.sleep(3000);
			Select ListBox = new Select(serviceNameDrpdwn);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
	
			
			//Validate: Save Service Btn is Displayed
			public boolean saveServiceBtnIsDisplayed(){
			WebElement link = saveServiceBtn;
			return link.isDisplayed();
			}

			//Validate: Save Service Btn is Enabled
			public boolean saveServiceBtnIsEnabled(){
			WebElement btn = saveServiceBtn;
			return btn.isEnabled();
			}
			
			//Validate: Save Service Btn is Clickable
			public void saveServiceBtnIsClickable() throws InterruptedException{
			saveServiceBtn.click();
			Thread.sleep(2000);
			}

			//Validate: Select NOT IN LIST option in service name & click save btn  
			public void selectNotInListThenClickSaveBtn() throws InterruptedException{
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1000)");
				
			Select box = new Select(serviceNameDrpdwn);
			box.selectByVisibleText("NOT IN LIST.. Other");
			Thread.sleep(2000);
			saveServiceBtn.click();
			Thread.sleep(2000);
			}

			
			//Validate: Add Service Name txtbox is Displayed
			public boolean addServiceNameTxtboxisDisplayed(){
			WebElement link = serviceNameTxtbox;
			return link.isDisplayed();
			}

			//Validate: Add Service Name txtbox is Enabled
			public boolean addServiceNameTxtboxIsEnabled(){
			WebElement btn = serviceNameTxtbox;
			return btn.isEnabled();
			}
			
			
			//Validate: Enter invalid service name and click save btn
			public void enterInvalidServiceNameClickSaveBtn() throws InterruptedException{
			serviceNameTxtbox.sendKeys("@@$$");
			Thread.sleep(2000);
			saveServiceBtn.click();
			Thread.sleep(2000);
			}
			
			
			//Validate: Is Cash Required Checkbox Yes is Displayed
			public boolean isCashRequiredCheckboxYesisDisplayed(){
			WebElement link = isCashRequiredCheckboxYes;
			return link.isDisplayed();
			}

			//Validate: Is Cash Required Checkbox Yes is Enabled
			public boolean isCashRequiredCheckboxYesIsEnabled(){
			WebElement btn = isCashRequiredCheckboxYes;
			return btn.isEnabled();
			}
			
			//Validate: Is Cash Required Checkbox No is Displayed
			public boolean isCashRequiredCheckboxNoisDisplayed(){
			WebElement link = isCashRequiredCheckboxNo;
			return link.isDisplayed();
			}

			//Validate: Is Cash Required Checkbox No is Enabled
			public boolean isCashRequiredCheckboxNoIsEnabled(){
			WebElement btn = isCashRequiredCheckboxNo;
			return btn.isEnabled();
			}
			
			
			//Validate: Enter invalid service name and click save btn
			public void selectYesIsCashRequiredChkbox() throws InterruptedException{
			isCashRequiredCheckboxYes.click();
			Thread.sleep(2000);
			saveServiceBtn.click();
			Thread.sleep(2000);
			}
			
			
			//Validate: Close Service Btn is Displayed
			public boolean closeServiceBtnIsDisplayed(){
			WebElement link = closeServiceBtn;
			return link.isDisplayed();
			}

			//Validate: Close Service Btn is Enabled
			public boolean closeServiceBtnIsEnabled(){
			WebElement btn = closeServiceBtn;
			return btn.isEnabled();
			}
			
			//Validate: Close Service Btn is Clickable
			public void closeServiceBtnIsClickable() throws InterruptedException{
			closeServiceBtn.click();
			Thread.sleep(2000);
			}


			//Validate: Create service category in one go
			public void createServiceCategoryInOneGO(String serviceName) throws InterruptedException{
				addServiceCategoryBtn.click();
				Thread.sleep(2000);
				Select box = new Select(serviceNameDrpdwn);
				box.selectByVisibleText("NOT IN LIST.. Other");
				Thread.sleep(2000);
				serviceNameTxtbox.sendKeys(serviceName);
				Thread.sleep(2000);
				isCashRequiredCheckboxYes.click();
				Thread.sleep(2000);
				saveServiceBtn.click();
				Thread.sleep(2000);
				}
			
			//Validate: Select Service Category dropdown is Displayed
			public boolean selectServiceCategoryDropdownIsDisplayed(){
			WebElement drpdwn = selectServiceCategoryDrpdwn;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Select Service Category dropdown is Enabled
			public boolean selectServiceCategoryDropdownIsEnabled(){
			WebElement drpdwn = selectServiceCategoryDrpdwn;
			return drpdwn.isEnabled();
			}
			
			//Validate: Select Service Category dropdown is Multiple
			public boolean selectServiceCategoryDropdownIsMultiple() throws InterruptedException{
			Thread.sleep(3000);
			Select ListBox = new Select(selectServiceCategoryDrpdwn);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			
			//Validate: Add Service Btn is Displayed
			public boolean addServiceBtnIsDisplayed(){
			WebElement link = addServiceBtn;
			return link.isDisplayed();
			}

			//Validate: Add Service Btn is Enabled
			public boolean addServiceBtnIsEnabled(){
			WebElement btn = addServiceBtn;
			return btn.isEnabled();
			}
			
			//Validate: Add Service Btn is Clickable
			public void addServiceBtnIsClickable() throws InterruptedException{
		//	Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(addServiceBtn)); 
		
		//	wait.until(ExpectedConditions.elementToBeClickable(addServiceBtn)) ;
			addServiceBtn.click();
			Thread.sleep(3000);
			}

			//Validate: Select Service Name from dropdown Select Servcie Category 
			public void selectServiceNameFromServiceCategoryDrpdwn() throws InterruptedException{
			Thread.sleep(2000);
			Select ListBox = new Select(selectServiceCategoryDrpdwn);
			ListBox.selectByVisibleText("AUTOMATEDSERVICE");
			Thread.sleep(3000);
			addServiceBtn.click();
			Thread.sleep(2000);
			}
			
			
			//Validate: Add Service_Service Name dropdown is Displayed
			public boolean addService_ServiceNameDropdownIsDisplayed(){
			WebElement drpdwn =addService_ServiceNameDrpdwn;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Add Service_Service Name  dropdown is Enabled
			public boolean addService_ServiceNameDropdownIsEnabled(){
			WebElement drpdwn = addService_ServiceNameDrpdwn;
			return drpdwn.isEnabled();
			}
			
			//Validate: Add Service_Service Name dropdown is Multiple
			public boolean addService_ServiceNameDropdownIsMultiple() throws InterruptedException{
			Thread.sleep(3000);
			Select ListBox = new Select(addService_ServiceNameDrpdwn);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			//Validate: Add Service_Save Service Btn is Displayed
			public boolean addService_SaveServiceBtnIsDisplayed(){
			WebElement link = addService_SaveServiceBtn;
			return link.isDisplayed();
			}

			//Validate: Add Service_Save Service Btn is Enabled
			public boolean addService_SaveServiceBtnIsEnabled(){
			WebElement btn = addService_SaveServiceBtn;
			return btn.isEnabled();
			}
			
			//Validate: Add Service_Save Service Btn is Clickable
			public void addService_SaveServiceBtnIsClickable() throws InterruptedException{
			addService_SaveServiceBtn.click();
			Thread.sleep(2000);
			}
			
			
			//Validate: Add Service_Select Service Name from dropdown & click save btn
			public void addService_SelectServiceNameFromDrpdwn() throws InterruptedException{
			Thread.sleep(2000);
			Select ListBox = new Select(addService_ServiceNameDrpdwn);
			ListBox.selectByVisibleText("NOT IN LIST.. Other");
			Thread.sleep(2000);
			addService_SaveServiceBtn.click();
			Thread.sleep(2000);
			}
			
			//Validate: Add Service_Service Name Txtbox is Displayed
			public boolean addService_ServiceNameTxtboxIsDisplayed(){
			WebElement link = addService_ServiceNameTxtbox;
			return link.isDisplayed();
			}

			//Validate: Add Service_Service Name Txtbox is Enabled
			public boolean addService_ServiceNameTxtboxIsEnabled() throws InterruptedException{
			WebElement btn = addService_ServiceNameTxtbox;
			Thread.sleep(2000);
			return btn.isEnabled();
			}
			
			//Validate: Add Service_Enter invalid service name and click save btn
			public void addService_EnterInvalidServiceNameClickSaveBtn() throws InterruptedException{
			Thread.sleep(3000);
			addService_ServiceNameTxtbox.sendKeys("@@$$");
			Thread.sleep(2000);
			addService_SaveServiceBtn.click();
			Thread.sleep(2000);
			}
			
			//Validate: Add Service_Sample Based Yes Checkbox is Displayed
			public boolean addService_SampleBasedYesChkboxIsDisplayed(){
			WebElement link = addService_SampleBasedYesChkbox;
			return link.isDisplayed();
			}

			//Validate: Add Service_Sample Based Yes Checkbox is Enabled
			public boolean addService_SampleBasedYesChkboxIsEnabled(){
			WebElement btn = addService_SampleBasedYesChkbox;
			return btn.isEnabled();
			}

			//Validate: Add Service_Sample Based No Checkbox is Displayed
			public boolean addService_SampleBasedNoChkboxIsDisplayed(){
			WebElement link = addService_SampleBasedNoChkbox;
			return link.isDisplayed();
			}

			//Validate: Add Service_Sample Based No Checkbox is Enabled
			public boolean addService_SampleBasedNoChkboxIsEnabled(){
			WebElement btn = addService_SampleBasedNoChkbox;
			return btn.isEnabled();
			}
			
			//Validate: Add Service_Enter invalid service name and click save btn
			public void addService_ClicksOnSampleBasedNoChkbox() throws InterruptedException{
			addService_SampleBasedNoChkbox.click();
			Thread.sleep(2000);
			}
			
			//Validate: Add Service_Sample Based No Checkbox is Selected
			public boolean addService_SampleBasedNoChkboxIsSelected(){
			WebElement btn = addService_SampleBasedNoChkbox;
			return btn.isSelected();
			}
			
			//Validate: Add Service_Service Type Billing Checkbox is Displayed
			public boolean addService_ServiceTypeBillingChkboxIsDisplayed(){
			WebElement link = addService_ServiceTypeBillingChkbox;
			return link.isDisplayed();
			}

			//Validate: Add Service_Service Type Billing Checkbox is Enabled
			public boolean addService_ServiceTypeBillingChkboxIsEnabled(){
			WebElement btn = addService_ServiceTypeBillingChkbox;
			return btn.isEnabled();
			}
			
			//Validate: Add Service_Selects Service Type as Billing and click save btn
			public void addService_SelectsServiceTypeBillingClickSaveBtn() throws InterruptedException{
			addService_ServiceTypeBillingChkbox.click();
			Thread.sleep(2000);
			

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(addService_IsCashRequiredYesChkbox)); 
			wait.until(ExpectedConditions.elementToBeClickable(addService_IsCashRequiredYesChkbox));
		//	addService_IsCashRequiredYesChkbox.click();
	
			
			
			
			}
			
			//Validate: Add Service_Select Is Cash Required YES Checkbox and click save btn
			public void addService_SelectIsCashRequiredYesChkboxClickSaveBtn() throws InterruptedException{
			Thread.sleep(2000);
			addService_IsCashRequiredYesChkbox.click();
			Thread.sleep(2000);
			}
			
			
			
			//Validate: Add Service_Service Type Billing Checkbox is Selected
			public boolean addService_ServiceTypeBillingChkboxIsSelected(){
			WebElement btn = addService_ServiceTypeBillingChkbox;
			return btn.isSelected();
			}
			
			
			//Validate: Add Service_Is Cash Required Chkbox is Displayed
			public boolean addService_IsCashRequiredYesChkboxIsDisplayed(){
			WebElement link = addService_IsCashRequiredYesChkbox;
			return link.isDisplayed();
			}

			//Validate: Add Service_Is Cash Required Checkbox is Enabled
			public boolean addService_IsCashRequiredYesChkboxIsEnabled(){
			WebElement btn = addService_IsCashRequiredYesChkbox;
			return btn.isEnabled();
			}
			
			
			//Validate: Add Service_Is Cash Required Chkbox is Displayed
			public boolean addService_IsCashRequiredNoChkboxIsDisplayed(){
			WebElement link = addService_IsCashRequiredNoChkbox;
			return link.isDisplayed();
			}

			//Validate: Add Service_Is Cash Required Checkbox is Enabled
			public boolean addService_IsCashRequiredNoChkboxIsEnabled(){
			WebElement btn = addService_IsCashRequiredNoChkbox;
			return btn.isEnabled();
			}
			
			
		/*	//Validate: Add Service_Select Is Cash Required YES Checkbox and click save btn
			public void addService_SelectIsCashRequiredYesChkboxClickSaveBtn() throws InterruptedException{
				
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOf(addService_IsCashRequiredYesChkbox)); 
				wait.until(ExpectedConditions.elementToBeClickable(addService_IsCashRequiredYesChkbox));
				addService_IsCashRequiredYesChkbox.click();
			Thread.sleep(2000);
			}
			*/

			//Validate: Add Service_Service Type Billing Checkbox is Selected
			public boolean addService_IsCashRequiredYesChkboxIsSelected(){
			WebElement btn = addService_IsCashRequiredYesChkbox;
			return btn.isSelected();
			}
			
			
			//Validate: addService_Close Service Btn is Displayed
			public boolean addService_closeServiceBtnIsDisplayed(){
			WebElement link = addService_closeServiceBtn;
			return link.isDisplayed();
			}

			//Validate: addService_Close Service Btn is Enabled
			public boolean addService_closeServiceBtnIsEnabled(){
			WebElement btn = addService_closeServiceBtn;
			return btn.isEnabled();
			}
			
			//Validate: addService_Close Service Btn is Clickable
			public void addService_closeServiceBtnIsClickable() throws InterruptedException{
			addService_closeServiceBtn.click();
			Thread.sleep(2000);
			}
			
			
			//Validate: Add Service in one go
			public void addServiceInOneGo(String serviceName) throws InterruptedException{
			/*Thread.sleep(2000);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].click();", addServiceBtn);
			Thread.sleep(2000);	
			addServiceBtn.click();*/
			
		//	Thread.sleep(2000);
			
			

			Select ListBox = new Select(selectServiceCategoryDrpdwn);
			ListBox.selectByVisibleText("AUTOMATEDSERVICE");
			Thread.sleep(2000);	
			
			
			addServiceBtn.click();
			Thread.sleep(2000);	
			
			
			
			
			Select list = new Select(addService_ServiceNameDrpdwn);
			list.selectByVisibleText("NOT IN LIST.. Other");
			Thread.sleep(2000);	
			
			
			
			addService_ServiceNameTxtbox.sendKeys(serviceName);
			Thread.sleep(2000);	
			addService_SampleBasedNoChkbox.click();
			Thread.sleep(2000);	
			addService_ServiceTypeBillingChkbox.click();
			Thread.sleep(2000);	
			addService_IsCashRequiredYesChkbox.click();
			Thread.sleep(2000);	
			addService_SaveServiceBtn.click();
			}

			
			
		
			
}

