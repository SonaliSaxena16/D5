package nic.ehospital.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import nic.ehospital.qa.base.TestBase;

public class HomePage extends TestBase {

	//Page Factory/Object Repository(OR)

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td/span[1]/b/img")
	WebElement HomePageLogo;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td/span[2]/font")
	WebElement HospitalName;
	
	@FindBy(xpath="//*[contains(@id,'btnlogout')]")
	WebElement Logout;
	
	@FindBy(id="img_id")
	WebElement Togglebtn;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/b/font")
	WebElement UserName;
	
	@FindBy(xpath="//img[@alt='Change Password']")
	WebElement ChangePwdKey;
	
	@FindBy(xpath="//*[contains(@placeholder,'Current Password')]")
	WebElement ChangePwdKey_CurrentPwdTxbox;
	
	@FindBy(xpath="//*[contains(@placeholder,'New Password')]")
	WebElement ChangePwdKey_NewPwdTxbox;

	@FindBy(xpath="//*[contains(@placeholder,'Re-Enter Password')]")
	WebElement ChangePwdKey_ConfirmPwdTxbox;
	
	@FindBy(xpath="//*[contains(@class,'btn icon-btn-save btn-success')]")
	WebElement ChangePwdKey_SaveBtn; 
	
	@FindBy(xpath="//span[@id='errorMsg']")
	WebElement printValMsgForChngPwdFunctionality; 
	
	
	
	public HomePage()throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	//Perform Actions :
	
	//Validation : To get Page Title
	public String ValidateHomePageTitle() throws InterruptedException{
	return driver.getTitle();
	}
	
	//Validation : If HomePage Logo Displayed
	public boolean ValidateLogoIsDisplyd(){
		WebElement logobanner = HomePageLogo;
		return logobanner.isDisplayed();
	}
	
	//Validate: Find total no of frames
	public void findframeno(){
		List<WebElement> frameList=driver.findElements(By.tagName("iframe"));
		System.out.println("Found total frame numbers:"+" "+frameList.size());
	}
	
	
	//Validation : If HospitalName Logo Displayed
	public boolean ValidateHsptlNameIsDisplyd(){
	WebElement hospitalName = HospitalName;
	return hospitalName.isDisplayed();
	}
	
	public WebElement printHospitalName(){
	WebElement hsptlName = HospitalName;
	return hsptlName;
	}
	
	//Validation : If ToggleBtn Displayed
	public boolean ValidateToggleBtnIsDisplyd(){
	WebElement toggleBtnDisplay = Togglebtn;
	return toggleBtnDisplay.isDisplayed();
	}
	
	//Validation : If ToggleBtn Enabled
	public boolean ValidateToggleBtnIsEnabld(){
	WebElement toggleBtnEnable = Togglebtn;
	return toggleBtnEnable.isEnabled();
	}
	
	//Validation : Clicks on  ToggleBtn
	public void ValidateToggleBtnClik() throws InterruptedException{
	WebElement toggleBtnClick = Togglebtn;
	toggleBtnClick.click();
	Thread.sleep(2000);
	toggleBtnClick.click();
	}
	
	//Validation : If UserName Displayed
	public boolean ValidateUserNameIsDisplyd(){
	WebElement userNameDisplay = UserName;
	return userNameDisplay.isDisplayed();
	}

	public WebElement printUsername(){
	WebElement userName = UserName;
	return userName;
	
	}
	
	//Validation : If LogoutBtn Displayed
	public boolean ValidateLogoutBtnIsDisplyd(){
	WebElement logoutBtnDisplay = Logout;
	return logoutBtnDisplay.isDisplayed();
	}

	//Validation : If LogoutBtn Enabled
	public boolean ValidateLogoutBtnIsEnabld(){
	WebElement logoutBtnEnable = Logout;
	return logoutBtnEnable.isEnabled();
	}
	
		//Validation : If ChangePwdKey Displayed
		public boolean changePwdKeyBtnIsDisplyd(){
		WebElement key = ChangePwdKey;
		return key.isDisplayed();
		}

		//Validation : If ChangePwdKey Enabled
		public boolean changePwdKeyBtnIsEnabld(){
		WebElement key = ChangePwdKey;
		return key.isEnabled();
		}
		
		//Validate: Change pwd btn is clickable 
		public void changePwdKeyBtnIsClickable() throws InterruptedException{
		ChangePwdKey.click();
		Thread.sleep(2000);
		}
		
		
			//Validation : Current Pwd Txtbox is Displayed
				public boolean currentPwdTxboxIsDisplyd(){
				WebElement key = ChangePwdKey_CurrentPwdTxbox;
				return key.isDisplayed();
				}

				//Validation : Current Pwd Txtbox is Enabled
				public boolean currentPwdTxboxIsEnabld(){
				WebElement key = ChangePwdKey_CurrentPwdTxbox;
				return key.isEnabled();
				}
				
				//Validation : New Pwd Txtbox is Displayed
				public boolean  newPwdTxtboxIsDisplyd(){
				WebElement key = ChangePwdKey_NewPwdTxbox;
				return key.isDisplayed();
				}

				//Validation : New Pwd Txtbox is Enabled
				public boolean  newPwdTxtboxIsEnabld(){
				WebElement key = ChangePwdKey_NewPwdTxbox;
				return key.isEnabled();
				}
				
				//Validation : Confirm Pwd Txtbox is Displayed
				public boolean confirmPwdTxtboxIsDisplyd(){
				WebElement key = ChangePwdKey_ConfirmPwdTxbox;
				return key.isDisplayed();
				}

				//Validation : Confirm Pwd Txtbox is Enabled
				public boolean confirmPwdTxtboxIsEnabld(){
				WebElement btn = ChangePwdKey_ConfirmPwdTxbox;
				return btn.isEnabled();
				}
				
				//Validation : Save Pwd Btn is Displayed
				public boolean savePwdBtnIsDisplyd(){
				WebElement btn = ChangePwdKey_SaveBtn;
				return btn.isDisplayed();
				}

				//Validation : Save Pwd Btn is Enabled
				public boolean savePwdBtnIsEnabld(){
				WebElement key = ChangePwdKey_SaveBtn;
				return key.isEnabled();
				}
				
		
				//Validate: Save Pwd Btn is clickable 
				public void savePwdBtnIsClickable() throws InterruptedException{
				ChangePwdKey_SaveBtn.click();
				Thread.sleep(2000);
				}
		
				
				//Validate: Enter invalid old pwd & click Save btn 
				public void enterInvalidOldPwdAndClickSaveBtn() throws InterruptedException{
				ChangePwdKey_CurrentPwdTxbox.sendKeys("@@123Aadd#WW");
				Thread.sleep(2000);
				ChangePwdKey_SaveBtn.click();
				Thread.sleep(2000);
				}
		
				//Validate: Enter invalid new pwd & click Save btn 
				public void enterNewPwdAndClickSaveBtn() throws InterruptedException{
				ChangePwdKey_NewPwdTxbox.sendKeys("@@qWr34ASD");
				Thread.sleep(2000);
				ChangePwdKey_SaveBtn.click();
				Thread.sleep(2000);
				}
		
				//Validate: Enter invalid confirrm pwd & click Save btn 
				public void enterDifferentPwdFromNewPwdInConfirmPwdTxboxAndClickSaveBtn() throws InterruptedException{
				ChangePwdKey_ConfirmPwdTxbox.sendKeys("@@12WWeeQQ");
				Thread.sleep(2000);
				ChangePwdKey_SaveBtn.click();
				Thread.sleep(2000);
				}
		
		
				//Validate: Enter same pwd in retype pwd txtbox, as that of a pwd entered in New pwd txtbox
				public void enterSamePwdInNewAndCurrentPwdAndClickSaveBtn() throws InterruptedException{
				ChangePwdKey_ConfirmPwdTxbox.clear();
				Thread.sleep(2000);
				ChangePwdKey_ConfirmPwdTxbox.sendKeys("@@qWr34ASD");
				Thread.sleep(2000);
				ChangePwdKey_SaveBtn.click();
				Thread.sleep(2000);
				}
		
				
				//Validate: Prints validation msg : For Change Pwd functionality
				public String printValMsgForChngPwdFunctionality(){
				WebElement msg = printValMsgForChngPwdFunctionality;
				String validationMsg = msg.getText();
				return validationMsg;
				} 
		
		
				//Validate: Change pwd for a user in one go
				public void changePwdInOneGo() throws InterruptedException{
						ChangePwdKey_CurrentPwdTxbox.sendKeys("Password@4");	
						Thread.sleep(2000);
						ChangePwdKey_NewPwdTxbox.sendKeys("Password@5");	
						Thread.sleep(2000);
						ChangePwdKey_ConfirmPwdTxbox.sendKeys("Password@5");
						Thread.sleep(2000);
						ChangePwdKey_SaveBtn.click();
						Thread.sleep(2000);
						}
		           
				public boolean isAlertPresent() {
				    try {
				        driver.switchTo().alert();
				        return true;
				    } // try
				    catch (Exception e) {
				        return false;
				    }
			}
				
				
				
		
		
		
		
		
		
}

