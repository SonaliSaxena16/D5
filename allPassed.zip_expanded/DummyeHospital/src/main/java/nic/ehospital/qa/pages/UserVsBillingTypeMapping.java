package nic.ehospital.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import nic.ehospital.qa.base.TestBase;

public class UserVsBillingTypeMapping extends TestBase{

	@FindBy(xpath="//*[contains(@title,'User vs Billing Type Mapping')]")
	WebElement userVsBillingTypeMappingLink;
	
	@FindBy(xpath="//*[contains(@id,'txtEmpName')]")
	WebElement empNameTxtbox;

	@FindBy(xpath="//*[contains(@id,'bntSearch')]")
	WebElement searchBtn;

	@FindBy(xpath="//*[contains(@id,'ddlEmployee')]")
	WebElement selectEmployeeDrpdwn;

	@FindBy(xpath="//*[contains(@id,'ddlUserName')]")
	WebElement selectUserDrpdwn;

	@FindBy(xpath="//*[contains(@value,'Save')]")
	WebElement saveBtn;
	
	@FindBy(xpath="//*[contains(@id,'messagediv')]")
	WebElement printValMsg;

	
	@FindBy(xpath="//*[contains(@onclick,'{selectAllBillTypes();}')]")
	WebElement selectAllBillingTypesChkbox;
	
	/*@FindBy(xpath="//*[contains(text(),'saved Successfully!!!')]")
	WebElement printValMsg;
*/
	
	public UserVsBillingTypeMapping() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		}

		// Perform Actions
		
			//Validate: User Vs Billing Type Mapping Link Is Displayed
			public boolean userVsBillingTypeMappingLinkIsDisplayed(){
			WebElement link = userVsBillingTypeMappingLink;
			return link.isDisplayed();
			}

			//Validate: User Vs Billing Type Mapping Link is Enabled
			public boolean userVsBillingTypeMappingLinkIsEnabled(){
			WebElement btn = userVsBillingTypeMappingLink;
			return btn.isEnabled();
			}
			
			//Validate: User Vs Billing Type Mapping Link is Clickable
			public void userVsBillingTypeMappingLinkIsClickable() throws InterruptedException{
			userVsBillingTypeMappingLink.click();
			Thread.sleep(2000);
			}
			
			
			//Validate:Search Employee Texbox Is Displayed
			public boolean empNameTxtboxIsDisplayed(){
			WebElement link = empNameTxtbox;
			return link.isDisplayed();
			}

			//Validate: Search Employee Texbox is Enabled
			public boolean empNameTxtboxIsEnabled(){
			WebElement btn = empNameTxtbox;
			return btn.isEnabled();
			}
		
		
			//Validate: Search button Is Displayed
			public boolean searchBtnIsDisplayed(){
			WebElement link = searchBtn;
			return link.isDisplayed();
			}				

					
			//Validate: Search button is Enabled
			public boolean searchBtnIsEnabled(){
			WebElement btn = searchBtn;
			return btn.isEnabled();
			}				
					
		
			//Validate: Search button is Clickable
			public void searchBtnIsClickable() throws InterruptedException{
			searchBtn.click();
			Thread.sleep(2000);
			}	
			
			
			//Validate: Select Employee Dropdown is Displayed
			public boolean selectEmployeeDrpdwnIsDisplayed() throws InterruptedException{
			WebElement drpdwn = selectEmployeeDrpdwn;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Select Employee Dropdown is Enabled
			public boolean selectEmployeeDrpdwnIsEnabled(){
			WebElement drpdwn = selectEmployeeDrpdwn;
			return drpdwn.isEnabled();
			}
			
			//Validate: Select Employee Dropdown is Multiple
			public boolean selectEmployeeDrpdwnIsMultiple() throws InterruptedException{
			Select ListBox = new Select(selectEmployeeDrpdwn);
			boolean value = ListBox.isMultiple() ;
			return value;
			}

			
			//Validate: Select User Dropdown is Displayed
			public boolean UserNameDrpdwnIsDisplayed() throws InterruptedException{
			WebElement drpdwn = selectUserDrpdwn;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Select User Dropdown is Enabled
			public boolean UserNameDrpdwnIsEnabled(){
			WebElement drpdwn = selectUserDrpdwn;
			return drpdwn.isEnabled();
			}
			
			//Validate: Select User Dropdown is Multiple
			public boolean UserNameDrpdwnIsMultiple() throws InterruptedException{
			Select ListBox = new Select(selectUserDrpdwn);
			boolean value = ListBox.isMultiple() ;
			return value;
			}

			
			//Validate: save button Is Displayed
			public boolean saveBtnIsDisplayed(){
			WebElement link = saveBtn;
			return link.isDisplayed();
			}

			//Validate: save button is Enabled
			public boolean saveBtnIsEnabled(){
			WebElement btn = saveBtn;
			return btn.isEnabled();
			}
			
			//Validate: save button is Clickable
			public void saveBtnIsClickable() throws InterruptedException{
			saveBtn.click();
			Thread.sleep(2000);
			}

			//Validate: Enter invalid Employee name & click search button
			public void enterInvalidEmpNameAndClickSaveBtn() throws InterruptedException{
			empNameTxtbox.sendKeys("@@##");
			Thread.sleep(2000);	
			searchBtn.click();
			Thread.sleep(2000);
			}
			
			
			//Validate: Enter Valid Employee name & click search button
			public void enterValidEmpNameAndClickUpdateBtn(String empName) throws InterruptedException{
			empNameTxtbox.clear();
			Thread.sleep(2000);
			empNameTxtbox.sendKeys(empName);
			Thread.sleep(2000);	
			searchBtn.click();
			Thread.sleep(2000);
			saveBtn.click();
			Thread.sleep(2000);
			}

			//Validate: Select employee from drpdwn,and click save btn
			public void selectEmpFmDrpdwnAndClikUpdateBtn() throws InterruptedException{
			Select listBox = new Select(selectEmployeeDrpdwn);
			listBox.selectByIndex(1);
			Thread.sleep(2000);	
			saveBtn.click();
			Thread.sleep(2000);
			}

			//Validate: Select user from drpdwn,and click save btn
			public void selectUserFmDrpdwnAndClikUpdateBtn() throws InterruptedException{
			Select listBox = new Select(selectUserDrpdwn);
			listBox.selectByIndex(1);
			}
			
			

			//Validate: Select All Billing Types checkbox is Displayed
			public boolean selectAllBillingTypesChkboxIsDisplayed() throws InterruptedException{
			WebElement drpdwn = selectAllBillingTypesChkbox;
			Thread.sleep(2000);
			return drpdwn.isDisplayed();
			}
			
			//Validate: Select All Billing Types checkbox is Enabled
			public boolean selectAllBillingTypesChkboxIsEnabled(){
			WebElement drpdwn = selectAllBillingTypesChkbox;
			return drpdwn.isEnabled();
			}
			
			
			//Validate: Clinic checkbox is Clickable
			public void selectAllBillingTypesChkboxIsClickable() throws InterruptedException{
			Thread.sleep(2000);
			selectAllBillingTypesChkbox.click();
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			
			Thread.sleep(2000);
			saveBtn.click();
			Thread.sleep(2000);
			}
				
			//Validate: Prints validation msg:Filled existing dept, description and Units 
			public WebElement printValidationMsg(){
			WebElement msg = printValMsg;
			return msg;
			} 
			
			
			//Validate: Add User Vs Billing Type Mapping in one go
			public void addUsrVsBllngTypeMappngInOneGo(String empName) throws InterruptedException{
			Thread.sleep(2000);
			empNameTxtbox.sendKeys(empName);
			Thread.sleep(2000);
			searchBtn.click();
			Select ListBox = new Select(selectEmployeeDrpdwn);
			ListBox.selectByIndex(1);
			Thread.sleep(2000);
			Select drpdwn = new Select(selectUserDrpdwn);
			drpdwn.selectByIndex(1);
			Thread.sleep(3000);
			selectAllBillingTypesChkbox.click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			saveBtn.click();
			Thread.sleep(2000);
			}
			
			
			
			
			
			
			

}
