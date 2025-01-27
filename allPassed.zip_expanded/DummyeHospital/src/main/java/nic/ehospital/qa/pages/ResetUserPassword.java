package nic.ehospital.qa.pages;

import java.io.IOException;import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import nic.ehospital.qa.base.TestBase;

public class ResetUserPassword extends TestBase{
	

	@FindBy(xpath="//*[contains(@title,'Reset User Password')]")
	WebElement resetUserPasswordLink;

	@FindBy(xpath="//*[contains(@id,'txtEmpName')]")
	WebElement searchUserTxtbox;

	@FindBy(xpath="//*[contains(@id,'bntSearch')]")
	WebElement searchBtn;

	@FindBy(xpath="//*[contains(@id,'ddlEmployee')]")
	WebElement selectEmployee;

	@FindBy(xpath="//*[contains(@id,'ddlUser')]")
	WebElement selectUser;

	@FindBy(xpath="//*[contains(@id,'btnCreatePwd')]")
	WebElement createPwdBtn;

	@FindBy(xpath="//*[contains(text(),'A link has been sent to the registered mobile & email address.')]")
	WebElement printValMsg;

	
	
	
	
	public ResetUserPassword() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		}

	// Perform Actions
	
	//Validate: Reset User Password Link is Displayed
	public boolean resetUserPasswordLinkIsDisplayed(){
	WebElement link = resetUserPasswordLink;
	return link.isDisplayed();
	}

	//Validate: Reset User Password link is Enabled
	public boolean resetUserPasswordLinkIsEnabled(){
	WebElement btn = resetUserPasswordLink;
	return btn.isEnabled();
	}
	
	//Validate: Reset User Password link is Clickable
	public void resetUserPasswordLinkIsClickable() throws InterruptedException{
	resetUserPasswordLink.click();
	Thread.sleep(2000);
	}
	

	//Validate: Search User Textbox is Displayed
		public boolean searchUserTxtboxIsDisplayed(){
			
			WebDriverWait wc = new WebDriverWait(driver,20);
			wc.until(ExpectedConditions.visibilityOf(searchUserTxtbox));
			
		WebElement link = searchUserTxtbox;
		return link.isDisplayed();
		}

		//Validate: Search User Textbox is Enabled
		public boolean searchUserTxtboxIsEnabled(){
		WebElement btn = searchUserTxtbox;
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
		
		//Validate: Select User Dropdown is Displayed
		public boolean selectUserDropdownIsDisplayed() throws InterruptedException{
		WebElement drpdwn = selectUser;
		Thread.sleep(2000);
		return drpdwn.isDisplayed();
		}
		
		//Validate: Select User Dropdown is Enabled
		public boolean selectUserDropdownIsEnabled(){
		WebElement drpdwn = selectUser;
		return drpdwn.isEnabled();
		}
		
		//Validate: Select User Dropdown is Multiple
		public boolean selectUserDropdownIsMultiple() throws InterruptedException{
		Thread.sleep(3000);
		Select ListBox = new Select(selectUser);
		boolean value = ListBox.isMultiple() ;
		return value;
		}
	
	
		//Validate: Create Password Button is Displayed
		public boolean createPwdBtnIsDisplayed(){
		WebElement link = createPwdBtn;
		return link.isDisplayed();
		}

		//Validate: Create Password  Button is Enabled
		public boolean createPwdBtnIsEnabled(){
		WebElement btn = createPwdBtn;
		return btn.isEnabled();
		}
		
		//Validate: Create Password Button is Clickable
		public void createPwdBtnIsClickable() throws InterruptedException{
		createPwdBtn.click();
		Thread.sleep(2000);
		}
		
		//Validate: Enter Invalid User in Search User Textbox and click Search Btn
		public void enterInvalidUserAndClickSearchBtn() throws InterruptedException{
		searchUserTxtbox.sendKeys("##%%");
		Thread.sleep(2000);	
		searchBtn.click();
		Thread.sleep(2000);
		}
				
		
		//Validate: Enter Invalid User in Search User Textbox and click Search Btn 
		public void enterValidUserAndClickSearchBtn(String User) throws InterruptedException{		
		searchUserTxtbox.clear();
		Thread.sleep(2000);	
		searchUserTxtbox.sendKeys(User);
		Thread.sleep(2000);	
		searchBtn.click();
		Thread.sleep(2000);
		}
		
		
		//Validate: Select employee name from Dropdown 
		public void selectEmployeeFromDrpdwnAsPerNameSearched() throws InterruptedException{
		Select ListBox = new Select(selectEmployee);
		ListBox.selectByIndex(1);
		Thread.sleep(2000);
		}
		
		//Validate:  Select user from Dropdown 
		public void selectUserFromDrpdwnAsPerEmpSelected() throws InterruptedException{
		Thread.sleep(2000);
		Select ListBox = new Select(selectUser);
		ListBox.selectByIndex(1);
		Thread.sleep(2000);
		}
		
		
		//Validate: Removes user from search user textbox and click create pwd btn
		public void removeUserAndClickCreatePwdBtn() throws InterruptedException{		
		searchUserTxtbox.clear();
		Thread.sleep(2000);	
		createPwdBtn.click();
		Thread.sleep(2000);
		}
		
		
		//Validate: Removes Employee from dropdown and click create pwd btn 
		public void removeEmployeeAndClickCreatePwdBtn() throws InterruptedException{
		Select ListBox = new Select(selectEmployee);
		ListBox.selectByIndex(0);
		Thread.sleep(2000);
		createPwdBtn.click();
		Thread.sleep(2000);
		}
		
		//Validate: Select employee name only from Dropdown & click create pwd btn
		public void selectEmployeeOnlyFromDrpdwnClickCreatePwdBtn() throws InterruptedException{
		Select ListBox = new Select(selectEmployee);
		ListBox.selectByIndex(1);
		Thread.sleep(2000);
		createPwdBtn.click();
		Thread.sleep(2000);
		}
		
		
		//Validate: Prints validation msg:Link successfully sent to registered mobile & email 
		public WebElement printValidationMsg(){
		WebElement msg = printValMsg;
		return msg;
		} 
				
				
		//Validate: Select user from Dropdown & click create pwd btn
		public void selectUserFromDrpdwnClickCreatePwdBtn() throws InterruptedException{
		Thread.sleep(2000);
		Select ListBox = new Select(selectUser);
		ListBox.selectByIndex(1);
		Thread.sleep(2000);
		createPwdBtn.click();
		Thread.sleep(2000);
		}
				
		
		//Validate: Reset pwd in one go
		public void resetPwdInOneGo(String User) throws InterruptedException{
		searchUserTxtbox.sendKeys(User);
		Thread.sleep(2000);
		searchBtn.click();
		Thread.sleep(2000);
		Select ListBox = new Select(selectEmployee);
		ListBox.selectByIndex(1);
		Thread.sleep(2000);
		Select drpdwn = new Select(selectUser);
		drpdwn.selectByIndex(1);
		Thread.sleep(2000);
		createPwdBtn.click();
		Thread.sleep(2000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
