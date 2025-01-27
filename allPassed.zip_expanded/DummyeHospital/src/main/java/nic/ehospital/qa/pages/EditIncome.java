package nic.ehospital.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import nic.ehospital.qa.base.TestBase;

public class EditIncome extends TestBase{
	
	@FindBy(xpath="//*[contains(@title,'Edit Income')]")
	WebElement editIncomeLink;
	
	@FindBy(xpath="//*[contains(@id,'reg_noid')]")
	WebElement enterUhidTxtbox;

	@FindBy(xpath="//*[contains(@id,'btnsearch')]")
	WebElement searchBtn;

	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td")
	WebElement printValMsg;

	@FindBy(xpath="//*[contains(@id,'ddl_p_sub_cat')]")
	WebElement newBillingTypeDrpdwn;
	
	@FindBy(xpath="//*[contains(@id,'txt_billing_remarks')]")
	WebElement remarksTxtbox;
	
	@FindBy(xpath="//*[contains(@id,'save_other_data')]")
	WebElement updateBtn;
	
	@FindBy(xpath="//select[@id='card_varified_by' and @class='inputcombo']")
	WebElement verifiedByDrpdwn;
	
	@FindBy(xpath="//input[@id='card_details' and @name='card_details']")
	WebElement cardNoTxtbox;
	
	
	
	
	
	

	public EditIncome() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}


	// Perform Actions
	
	//Validate: Edit Income Link Is Displayed
	public boolean editIncomeLinkIsDisplayed(){
	WebElement link = editIncomeLink;
	return link.isDisplayed();
	}			

	//Validate: Edit Income Link is Enabled
	public boolean editIncomeLinkIsEnabled(){
	WebElement btn = editIncomeLink;
	return btn.isEnabled();
	}		
				
				
	//Validate: Edit Income Link is Clickable
	public void editIncomeLinkIsClickable() throws InterruptedException{
	editIncomeLink.click();
	Thread.sleep(2000);
	}

	
		//Validate: Enter UHID Textbox Is Displayed
		public boolean enterUhidTxtboxIsDisplayed(){
		WebElement link = enterUhidTxtbox;
		return link.isDisplayed();
		}			

		//Validate: Enter UHID Textbox is Enabled
		public boolean enterUhidTxtboxIsEnabled(){
		WebElement btn = enterUhidTxtbox;
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
	

	//Validate: Prints validation msg 
	public WebElement printValidationMsg(){
	WebElement msg = printValMsg;
	return msg;
	} 
	
	
	
		//Validate: Enter UHID to fetch biling type of the Patient
		public void enterUhidToFetchBillingType(String uhid) throws InterruptedException{
		enterUhidTxtbox.sendKeys(uhid);
		Thread.sleep(2000);	
		searchBtn.click();
		Thread.sleep(2000);
		}	
		
		
		
		//Validate: New Billing Type Dropdown is Displayed
		public boolean newBillingTypeDrpdwnIsDisplayed() throws InterruptedException{
		WebElement drpdwn = newBillingTypeDrpdwn;
		return drpdwn.isDisplayed();
		}
		
		//Validate: New Billing Type Dropdown is Enabled
		public boolean newBillingTypeDrpdwnIsEnabled(){
		WebElement drpdwn = newBillingTypeDrpdwn;
		return drpdwn.isEnabled();
		}
		
		//Validate: New Billing Type Dropdown is Multiple
		public boolean newBillingTypeDrpdwnIsMultiple() throws InterruptedException{
		Select ListBox = new Select(newBillingTypeDrpdwn);
		boolean value = ListBox.isMultiple() ;
		return value;
		}
	
	

		//Validate: Enter Remarks Textbox Is Displayed
		public boolean remarksTxtboxIsDisplayed(){
		WebElement link = remarksTxtbox;
		return link.isDisplayed();
		}			

		//Validate: Remarks Textbox is Enabled
		public boolean remarksTxtboxIsEnabled(){
		WebElement btn = remarksTxtbox;
		return btn.isEnabled();
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
			
		
		//Validate: Verified By Dropdown is Displayed
		public boolean verifiedByDrpdwnIsDisplayed() throws InterruptedException{
		WebElement drpdwn = verifiedByDrpdwn;
		return drpdwn.isDisplayed();
		}
		
		//Validate: Verified By Dropdown is Enabled
		public boolean verifiedByDrpdwnIsEnabled(){
		WebElement drpdwn = verifiedByDrpdwn;
		return drpdwn.isEnabled();
		}
		
		//Validate: Verified By Dropdown is Multiple
		public boolean verifiedByDrpdwnIsMultiple() throws InterruptedException{
		Select ListBox = new Select(verifiedByDrpdwn);
		boolean value = ListBox.isMultiple() ;
		return value;
		}
	
		
		//Validate: Card Number Textbox Is Displayed
		public boolean cardNoTxtboxIsDisplayed(){
		WebElement link = cardNoTxtbox;
		return link.isDisplayed();
		}			

		//Validate: Card Number Textbox is Enabled
		public boolean cardNoTxtboxIsEnabled(){
		WebElement btn = cardNoTxtbox;
		return btn.isEnabled();
		}	


		//Validate: Update button is Clickable
		public void updateBtnIsClickable() throws InterruptedException{
		remarksTxtbox.clear();
		Thread.sleep(2000);
		updateBtn.click();
		Thread.sleep(2000);
		}	
		
	
		//Validate: Enter invalid remarks in txtbox & click update button
		public void enterInvalidRemarksAndClickUpdtBtn() throws InterruptedException{
		remarksTxtbox.sendKeys("@@##$$%%");
		Thread.sleep(2000);
		updateBtn.click();
		Thread.sleep(2000);
		}	
		

		//Validate: Enter valid remarks in txtbox & click update button
		public void enterValidRemarksAndChngBillingType(String remarks) throws InterruptedException{
		remarksTxtbox.clear();
		Thread.sleep(2000);
		remarksTxtbox.sendKeys(remarks);
		Thread.sleep(2000);
		Select listBox = new Select(newBillingTypeDrpdwn);
		listBox.selectByVisibleText("BPL");
		Thread.sleep(2000);
		}
		
		
		
		//Validate: Enter valid remarks in txtbox & click update button
		public void selectVerifiedByandCardNo(String cardNo) throws InterruptedException{
		Select list = new Select(verifiedByDrpdwn);
		list.selectByVisibleText("Registration Clerk");
		Thread.sleep(2000);
		cardNoTxtbox.sendKeys(cardNo);
		Thread.sleep(2000);
		updateBtn.click();
		Thread.sleep(2000);
		}	
		
		
		
		//Validate: Update Billing Type In One Go
		public void updateBillingTypeInOneGo(String uhid,String remarks,String cardNo) throws InterruptedException{
			enterUhidTxtbox.sendKeys(uhid);
			Thread.sleep(2000);	
			searchBtn.click();
			Thread.sleep(2000);
			Select listBox = new Select(newBillingTypeDrpdwn);
			listBox.selectByVisibleText("BPL");
			Thread.sleep(2000);
			Select list = new Select(verifiedByDrpdwn);
			list.selectByVisibleText("Registration Clerk");
			Thread.sleep(2000);
			cardNoTxtbox.clear();
			Thread.sleep(2000);
			cardNoTxtbox.sendKeys(cardNo);
			Thread.sleep(2000);
			remarksTxtbox.clear();
			Thread.sleep(2000);
			remarksTxtbox.sendKeys(remarks);
			Thread.sleep(2000);
			updateBtn.click();
			Thread.sleep(2000);
			}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
