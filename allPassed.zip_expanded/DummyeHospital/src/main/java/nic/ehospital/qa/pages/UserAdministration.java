package nic.ehospital.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import nic.ehospital.qa.base.TestBase;

public class UserAdministration extends TestBase{

	@FindBy(partialLinkText="User Administration")
	WebElement UserAdministrationLink;

	@FindBy(xpath="//*[contains(@title,'Add Edit User Role')]")
	WebElement addEditUserRoleLink;
	
	@FindBy(xpath="//*[contains(@id,'txtEmpName')]")
	WebElement empNameTxtbox;
	
	@FindBy(xpath="//*[contains(@id,'bntSearch')]")
	WebElement searchBtn;
	
	@FindBy(xpath="//*[contains(@id,'ddlEmployee')]")
	WebElement selectEmployee;
	
	@FindBy(xpath="//*[contains(@id,'ddlUserName')]")
	WebElement selectUsername;
	
	@FindBy(xpath="//input[@class='inputsubmit' and @value='Save']")
	WebElement saveUserRoleBtn;
	
	/*@FindBy(xpath="//input[@id='chk_18' and @value='30']")
	WebElement clinicChkbox;*/

	@FindBy(xpath="//*[@id='chk_18']")
	WebElement clinicChkbox;
	
	@FindBy(xpath="//*[contains(@id,'messagediv')]")
	WebElement printValMsgUserRoleSaved;
	
	
	
	
	
	
	
	
	public UserAdministration() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	
	// Perform Actions
	
				//Validate: User Administration Link is Displayed
				public boolean userAdministrationLinkIsDisplayed(){
				WebElement link = UserAdministrationLink;
				return link.isDisplayed();
				}

				//Validate: User Administration link is Enabled
				public boolean userAdministrationLinkIsEnabled(){
				WebElement btn = UserAdministrationLink;
				return btn.isEnabled();
				}
				
				//Validate: User Administration link is Clickable
				public void userAdministrationLinkIsClickable() throws InterruptedException{
				UserAdministrationLink.click();
				Thread.sleep(2000);
				}


				//Validate: Add Edit User Role Link is Displayed
				public boolean addEditUserRoleLinkIsDisplayed(){
				WebElement link = addEditUserRoleLink;
				return link.isDisplayed();
				}

				//Validate: Add Edit User Role Link is Enabled
				public boolean addEditUserRoleLinkIsEnabled(){
				WebElement btn = addEditUserRoleLink;
				return btn.isEnabled();
				}
				
				//Validate: Add Edit User Role Link is Clickable
				public void addEditUserRoleLinkIsClickable() throws InterruptedException{
				addEditUserRoleLink.click();
				Thread.sleep(2000);
				}
		
				
				//Validate: Employee Name Textbox is Displayed
				public boolean empNameTxtboxIsDisplayed(){
				WebElement link = empNameTxtbox;
				return link.isDisplayed();
				}

				//Validate: Employee Name Textbox is Enabled
				public boolean empNameTxtboxIsEnabled(){
				WebElement btn = empNameTxtbox;
				return btn.isEnabled();
				}
				
				
				//Validate: Search Button is Displayed
				public boolean searchBtnIsDisplayed(){
				WebElement link = searchBtn;
				return link.isDisplayed();
				}

				//Validate: Search Button is Enabled
				public boolean searchBtnIsEnabled(){
				WebElement btn = searchBtn;
				return btn.isEnabled();
				}
				
				//Validate: Search Button is Clickable
				public void searchBtnIsClickable() throws InterruptedException{
				searchBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: Select Employee Dropdown is Displayed
				public boolean selectEmployeeDropdownIsDisplayed() throws InterruptedException{
				WebElement drpdwn = selectEmployee;
				Thread.sleep(2000);
				return drpdwn.isDisplayed();
				}
				
				//Validate: Select Employee Dropdown is Enabled
				public boolean selectEmployeeDropdownIsEnabled(){
				WebElement drpdwn = selectEmployee;
				return drpdwn.isEnabled();
				}
				
				//Validate: Select Employee Dropdown is Multiple
				public boolean selectEmployeeDropdownIsMultiple() throws InterruptedException{
				Thread.sleep(3000);
				Select ListBox = new Select(selectEmployee);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				
				
				//Validate: Select Username Dropdown is Displayed
				public boolean selectUsernameDropdownIsDisplayed() throws InterruptedException{
				WebElement drpdwn = selectUsername;
				Thread.sleep(2000);
				return drpdwn.isDisplayed();
				}
				
				//Validate: Select Username Dropdown is Enabled
				public boolean selectUsernameDropdownIsEnabled(){
				WebElement drpdwn = selectUsername;
				return drpdwn.isEnabled();
				}
				
				//Validate: Select Username Dropdown is Multiple
				public boolean selectUsernameDropdownIsMultiple() throws InterruptedException{
				Thread.sleep(3000);
				Select ListBox = new Select(selectUsername);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				//Validate: Save User Role Button is Displayed
				public boolean saveUserRoleBtnIsDisplayed(){
				WebElement link = saveUserRoleBtn;
				return link.isDisplayed();
				}

				//Validate: Save User Role Button is Enabled
				public boolean saveUserRoleBtnIsEnabled(){
				WebElement btn = saveUserRoleBtn;
				return btn.isEnabled();
				}
				
				//Validate: Save User Role Button is Clickable
				public void saveUserRoleBtnIsClickable() throws InterruptedException{
				saveUserRoleBtn.click();
				Thread.sleep(2000);
				}

				//Validate: Enter invalid employee name & click save btn
				public void enterInvalidEmpName() throws InterruptedException{
				empNameTxtbox.sendKeys("##$$A12");
				Thread.sleep(2000);
				searchBtn.click();
				Thread.sleep(2000);
				}

				//Validate: Enter valid employee name & click save btn
				public void enterValidEmpName(String validEmp) throws InterruptedException{
				empNameTxtbox.clear();
				Thread.sleep(2000);
				empNameTxtbox.sendKeys(validEmp);
				Thread.sleep(2000);
				searchBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: Select employee name from Dropdown & click save button
				public void selectEmployeeFromDrpdwnAsPerNameSearched() throws InterruptedException{
				Select ListBox = new Select(selectEmployee);
				ListBox.selectByIndex(1);
				Thread.sleep(2000);
				}
				
				//Validate:  Select user name from Dropdown & click save button 
				public void selectUsernameFromDrpdwnAsPerEmpSelected() throws InterruptedException{
				Thread.sleep(2000);
				Select ListBox = new Select(selectUsername);
				ListBox.selectByIndex(1);
				Thread.sleep(6000);
				}
				
				
				//Validate: Clinic checkbox is Displayed
				public boolean clinicChkboxIsDisplayed() throws InterruptedException{
				WebElement drpdwn = clinicChkbox;
				Thread.sleep(2000);
				return drpdwn.isDisplayed();
				}
				
				//Validate: Clinic checkbox is Enabled
				public boolean clinicChkboxIsEnabled(){
				WebElement drpdwn = clinicChkbox;
				return drpdwn.isEnabled();
				}
				
				
				//Validate: Clinic checkbox is Clickable
				public void clinicChkboxIsClickable() throws InterruptedException{
				
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1000)");
				
				clinicChkbox.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: Prints validation msg:Filled existing dept, description and Units 
				public WebElement printValidationMsg(){
				WebElement msg = printValMsgUserRoleSaved;
				return msg;
				} 
				
			

				//Validate: Add User Role in one go
				public void createRoleInOneGo(String empName) throws InterruptedException{
				Thread.sleep(2000);
				empNameTxtbox.sendKeys(empName);
				Thread.sleep(2000);
				searchBtn.click();
				Select ListBox = new Select(selectEmployee);
				ListBox.selectByIndex(1);
				Thread.sleep(2000);
				Select drpdwn = new Select(selectUsername);
				drpdwn.selectByIndex(1);
				Thread.sleep(6000);
				clinicChkbox.click();
				Thread.sleep(2000);
				saveUserRoleBtn.click();
				Thread.sleep(2000);
				}
				
				
				
				
				
				
				
				
				
				
}
