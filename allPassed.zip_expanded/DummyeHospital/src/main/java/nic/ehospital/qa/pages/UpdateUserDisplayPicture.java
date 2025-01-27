package nic.ehospital.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import nic.ehospital.qa.base.TestBase;

public class UpdateUserDisplayPicture extends TestBase{
	
	@FindBy(xpath="//*[contains(@title,'Update User Display Picture')]")
	WebElement updateUserDisplayPicLink;

	@FindBy(xpath="//*[contains(@id,'txtEmpName')]")
	WebElement searchEmployeeTxtbox;

	@FindBy(xpath="//*[contains(@id,'bntSearch')]")
	WebElement searchBtn;

	@FindBy(xpath="//*[contains(@id,'ddlEmployee')]")
	WebElement selectEmployeeDrpdwn;

	@FindBy(xpath="//*[contains(@id,'ddlUser')]")
	WebElement selectUserDrpdwn;

	@FindBy(xpath="//*[contains(@id,'fuDocument')]")
	WebElement browseBtn;

	@FindBy(xpath="//*[contains(@id,'saveUserDp')]")
	WebElement updateBtn;
	
	@FindBy(xpath="//*[contains(text(),'Successfully Saved...')]")
	WebElement printValMsg;

	
	
	

	public UpdateUserDisplayPicture() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	// Perform Actions
	
		//Validate: Update User Display Picture Link Is Displayed
		public boolean updateUserDisplayPicLinkIsDisplayed(){
		WebElement link = updateUserDisplayPicLink;
		return link.isDisplayed();
		}

		//Validate: Update User Display Picture Link is Enabled
		public boolean updateUserDisplayPicLinkIsEnabled(){
		WebElement btn = updateUserDisplayPicLink;
		return btn.isEnabled();
		}
		
		//Validate: Update User Display Picture Link is Clickable
		public void updateUserDisplayPicLinkIsClickable() throws InterruptedException{
		updateUserDisplayPicLink.click();
		Thread.sleep(2000);
		}
		
	
		//Validate:Search Employee Texbox Is Displayed
		public boolean searchEmployeeTxtboxIsDisplayed(){
		WebElement link = searchEmployeeTxtbox;
		return link.isDisplayed();
		}

		//Validate: Search Employee Texbox is Enabled
		public boolean searchEmployeeTxtboxIsEnabled(){
		WebElement btn = searchEmployeeTxtbox;
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
	
				
				//Validate: Browse button Is Displayed
				public boolean browseBtnIsDisplayed(){
				WebElement link = browseBtn;
				return link.isDisplayed();
				}

				//Validate: Browse button is Enabled
				public boolean browseBtnIsEnabled(){
				WebElement btn = browseBtn;
				return btn.isEnabled();
				}
				
				//Validate: Browse button is Clickable
				public void browseBtnIsClickable() throws InterruptedException{
				browseBtn.click();
				Thread.sleep(2000);
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
	
	
				//Validate: Enter invalid Employee name & click search button
				public void enterInvalidEmpNameAndClickSaveBtn() throws InterruptedException{
				searchEmployeeTxtbox.sendKeys("@@##");
				Thread.sleep(2000);	
				searchBtn.click();
				Thread.sleep(2000);
				}
	
	
				//Validate: Enter Valid Employee name & click search button
				public void enterValidEmpNameAndClickUpdateBtn(String empName) throws InterruptedException{
				searchEmployeeTxtbox.clear();
				Thread.sleep(2000);
				searchEmployeeTxtbox.sendKeys(empName);
				Thread.sleep(2000);	
				searchBtn.click();
				Thread.sleep(2000);
				updateBtn.click();
				Thread.sleep(2000);
				}
	
	
				//Validate: Select employee from drpdwn,and click save btn
				public void selectEmpFmDrpdwnAndClikUpdateBtn() throws InterruptedException{
				Select listBox = new Select(selectEmployeeDrpdwn);
				listBox.selectByIndex(1);
				Thread.sleep(2000);	
				updateBtn.click();
				Thread.sleep(2000);
				}
	
	
				//Validate: Select user from drpdwn,and click save btn
				public void selectUserFmDrpdwnAndClikUpdateBtn() throws InterruptedException{
				Select listBox = new Select(selectUserDrpdwn);
				listBox.selectByIndex(1);
				Thread.sleep(2000);
				updateBtn.click();
				Thread.sleep(2000);
				}
	
	
				public void updateUserDisplayPic() throws InterruptedException {
					
					if(isPathVisible(browseBtn,"C:\\Users\\Sonali-pc\\Desktop\\download.jpg")==true){
						WebElement updtBtn = updateBtn;
						updtBtn.click();
					}
				
					else if(isPathVisible(browseBtn,"C:\\Users\\DELL\\Desktop\\HospitalLogo.jpg")==true){
						WebElement updtBtn = updateBtn;
						updtBtn.click();
					}
					
					/*
					browseBtn.sendKeys("C:\\Users\\Sonali-pc\\Desktop\\download.jpg");	
					browseBtn.sendKeys("C:\\Users\\DELL\\Desktop\\HospitalLogo.jpg");	
					Thread.sleep(2000);
					updateBtn.click();
					Thread.sleep(2000);
			*/	}
	
	
				//Validate: Prints validation msg:Display picture successfully updated
				public WebElement printValidationMsg(){
				WebElement msg = printValMsg;
				return msg;
				} 
					
				
				
	public void updateUserDisplayPicInOneGo(String empName) throws InterruptedException {
		searchEmployeeTxtbox.sendKeys(empName);
		Thread.sleep(2000);	
		searchBtn.click();
		Thread.sleep(2000);
		Select listBox = new Select(selectEmployeeDrpdwn);
		listBox.selectByIndex(1);
		Thread.sleep(2000);	
		Select user = new Select(selectUserDrpdwn);
		user.selectByIndex(1);
		Thread.sleep(2000);
		
		WebElement brwBtn = browseBtn;
		
		
		if(isPathVisible(browseBtn,"C:\\Users\\Sonali-pc\\Desktop\\download.jpg")==true){
			WebElement updtBtn = updateBtn;
			updtBtn.click();
		}
	
		else if(isPathVisible(browseBtn,"C:\\Users\\DELL\\Desktop\\HospitalLogo.jpg")==true){
			WebElement updtBtn = updateBtn;
			updtBtn.click();
		}
		
	}
	
	
	/*
		browseBtn.sendKeys("C:\\Users\\Sonali-pc\\Desktop\\download.jpg");	
		
	//	browseBtn.sendKeys("C:\\Users\\DELL\\Desktop\\HospitalLogo.jpg");	
		
		Thread.sleep(2000);
		updateBtn.click();
		Thread.sleep(2000);
		}
	
	*/			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
}
