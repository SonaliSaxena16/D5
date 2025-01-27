package nic.ehospital.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import nic.ehospital.qa.base.TestBase;

public class UserPermissionForPatientUpdate extends TestBase{

	
	@FindBy(xpath="//*[contains(@title,'User Permission for Patient Update')]")
	WebElement userPermissionForPatientUpdateLink;
	
	@FindBy(xpath="//*[contains(@id,'btnsave')]")
	WebElement saveBtn;

	@FindBy(xpath="//*[contains(@id,'ddlUser')]")
	WebElement selectUserDrpdwn;

	@FindBy(xpath="//select[@id='ddldept' and @class='form-control']")
	WebElement selectPermissionTypeDrpdwn;

	@FindBy(xpath="//select[@id='ddldeptupdate' and @class='form-control']")
	WebElement updateNewPermissionDrpdwn;

	@FindBy(xpath="//*[contains(@id,'btnupdate')]")
	WebElement updateBtn;

	
	
	
	
	
	
	
	public UserPermissionForPatientUpdate() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	
	// Perform Actions
	
		//Validate: User Permission For Patient Update Link Is Displayed
		public boolean userPermissionForPatientUpdateLinkIsDisplayed(){
		WebElement link = userPermissionForPatientUpdateLink;
		return link.isDisplayed();
		}			

		//Validate: User Permission For Patient Update Link is Enabled
		public boolean userPermissionForPatientUpdateLinkIsEnabled(){
		WebElement btn = userPermissionForPatientUpdateLink;
		return btn.isEnabled();
		}		
					
					
		//Validate: User Permission For Patient Update Link is Clickable
		public void userPermissionForPatientUpdateLinkIsClickable() throws InterruptedException{
		userPermissionForPatientUpdateLink.click();
		Thread.sleep(2000);
		}
	
	
		//Validate: Save button Is Displayed
		public boolean saveBtnIsDisplayed(){
		WebElement link = saveBtn;
		return link.isDisplayed();
		}					

						
		//Validate: Save button is Enabled
		public boolean saveBtnIsEnabled(){
		WebElement btn = saveBtn;
		return btn.isEnabled();
		}		
										
			
		//Validate: Save button is Clickable
		public void saveBtnIsClickable() throws InterruptedException{
		saveBtn.click();
		Thread.sleep(2000);
		}
		
		
		//Validate: Select User Dropdown is Displayed
		public boolean selectUserDrpdwnIsDisplayed() throws InterruptedException{
		WebElement drpdwn = selectUserDrpdwn;
		return drpdwn.isDisplayed();
		}
		
		//Validate: Select User Dropdown is Enabled
		public boolean selectUserDrpdwnIsEnabled(){
		WebElement drpdwn = selectUserDrpdwn;
		return drpdwn.isEnabled();
		}
		
		//Validate: Select User Dropdown is Multiple
		public boolean selectUserDrpdwnIsMultiple() throws InterruptedException{
		Select ListBox = new Select(selectUserDrpdwn);
		boolean value = ListBox.isMultiple() ;
		return value;
		}

	
		
		//Validate: Permission Type Dropdown is Displayed
		public boolean selectPermissionTypeDrpdwnIsDisplayed() throws InterruptedException{
		WebElement drpdwn = selectPermissionTypeDrpdwn;
		return drpdwn.isDisplayed();
		}
		
		
		//Validate: Permission Type Dropdown is Enabled
		public boolean selectPermissionTypeDrpdwnIsEnabled(){
		WebElement drpdwn = selectPermissionTypeDrpdwn;
		return drpdwn.isEnabled();
		}			
				
		//Validate: Permission Type Dropdown is Multiple
		public boolean selectPermissionTypeDrpdwnIsMultiple() throws InterruptedException{
		Select ListBox = new Select(selectPermissionTypeDrpdwn);
		boolean value = ListBox.isMultiple() ;
		return value;
		}
			
	
		//Validate: Select user only & click save btn
		public void selectUserOnlyandClickSaveBtn() throws InterruptedException{
		Select ListBox = new Select(selectUserDrpdwn);
		ListBox.selectByIndex(1);
		Thread.sleep(2000);
		saveBtn.click();
		}
		
		
		//Validate: Select user only & click save btn	
		public void selectPermissionTypeOnlyandClickSaveBtn() throws InterruptedException{
		Select ListBox = new Select(selectUserDrpdwn);
		ListBox.selectByIndex(0);
		Thread.sleep(2000);
	//	saveBtn.click();
	//	Thread.sleep(2000);
		Select type = new Select(selectPermissionTypeDrpdwn);
		type.selectByIndex(1);
		Thread.sleep(2000);
		saveBtn.click();
		}
		

		//Validate: Select user only & click save btn	
		public void selectUserAndPermissionTypeBothClickSaveBtn() throws InterruptedException{
		Select ListBox = new Select(selectUserDrpdwn);
		ListBox.selectByIndex(1);
		Thread.sleep(2000);
		saveBtn.click();
		}
		

	//Validate: Update button Is Displayed
	public boolean updateBtnIsDisplayed(){
	WebElement link = updateBtn;			
	return link.isDisplayed();
	}									

		
	//Validate: Update button is Enabled
	public boolean updateBtnIsEnabled(){
	WebElement btn = updateBtn;
	return btn.isEnabled();
	}		
											
					
	//Validate: Update button is Clickable
	public void updateBtnIsClickable() throws InterruptedException{
	updateBtn.click();
	Thread.sleep(2000);
	}
					
	
	//Validate: Update New Permission Dropdown is Displayed
	public boolean updateNewPermissionDrpdwnIsDisplayed() throws InterruptedException{
	WebElement drpdwn = updateNewPermissionDrpdwn;
	return drpdwn.isDisplayed();
	}
	
	//Validate: Update New Permission Dropdown is Enabled
	public boolean updateNewPermissionDrpdwnIsEnabled(){
	WebElement drpdwn = updateNewPermissionDrpdwn;
	return drpdwn.isEnabled();
	}
	
	//Validate: Update New Permission Dropdown is Multiple
	public boolean updateNewPermissionDrpdwnIsMultiple() throws InterruptedException{
	Select ListBox = new Select(updateNewPermissionDrpdwn);
	boolean value = ListBox.isMultiple() ;
	return value;
	}

	//Validate: Update new permission & click update btn	
	public void updateNewPermissionFromDrpdwnAndClickUpdateBtn() throws InterruptedException{			
	Select ListBox = new Select(updateNewPermissionDrpdwn);	
	ListBox.selectByIndex(1);
	Thread.sleep(2000);
	updateBtn.click();
	}					
			
	//Validate: Update new permission & click update btn	
	public void selectUserAndPermissonThenUpdatePermissonInOneGo() throws InterruptedException{			
		Select ListBox = new Select(selectUserDrpdwn);
		ListBox.selectByIndex(2);
		Thread.sleep(2000);
	//	saveBtn.click();
	//	Thread.sleep(2000);
		Select type = new Select(selectPermissionTypeDrpdwn);
		type.selectByIndex(2);
		Thread.sleep(2000);
		saveBtn.click();
		Thread.sleep(2000);
		
	/*	
		Select updateDrpdwn = new Select(updateNewPermissionDrpdwn);	
		updateDrpdwn.selectByIndex(1);
	Thread.sleep(2000);
	updateBtn.click();*/
	}	
	
	
}
