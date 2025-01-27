package nic.ehospital.qa.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import lombok.Getter;
import nic.ehospital.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory/Object Repository(OR)
	
	@FindBy(xpath="//*[contains(@src,'images/logo.png')]")
	WebElement eHospitalLogo;
	
	@FindBy(xpath="//a[@id='login' and @class='nav-link']")
	WebElement ssoPageLoginBtn;
	
	@FindBy(xpath="//input[@id='txtuid' and @class='form-control ']") 
	WebElement username;
	
	@FindBy(name="ddl_mod")
	WebElement dropdown;
	
	@FindBy(xpath="//*[contains(@class,'btn btn-success btn-lg')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[contains(@type,'password')]")
	WebElement Password;
	
	@FindBy(xpath="//*[contains(@class,'btn btn-success btn-sm')]")
	WebElement signInBtn;
	
	@FindBy(xpath="//*[contains(@id,'alert_msg')]")
	WebElement IncrrctPwdAlertMsg;
	
	@FindBy(xpath="//*[contains(@id,'btnlogout')]")
	WebElement Logout;
	
	@FindBy(xpath="//input[@id='txt_captcha' and @class='form-control']")
	WebElement Captcha;
	
	@FindBy(xpath="//*[contains(@onclick,'closeMIBPopup();')]")
	WebElement PMCares_CrossButton;
	
	@FindBy(partialLinkText="Administration")
	WebElement adminModule;
	
	@FindBy(xpath = "//b[text()='Administration']")
	WebElement AdministrationTab;

//Initializing the Page Objects
		
	public LoginPage()throws IOException{
		PageFactory.initElements(driver, this);
	}
	
//Perform Actions :

	/*//Validation : To get Page Title
		public void validateLoginPageTitle() throws InterruptedException{
			driver.getTitle();
		}
		*/
	
		//Validation : eHospital Logo is Displayed
		public boolean validateEhospitalLogo() throws InterruptedException{
		return eHospitalLogo.isDisplayed();
		}
				
			
//Validation:If PMCaresBtn is Displayed,return true else throw exception catch will handle return false and proceed with program
				public boolean PMCareButton() {
				   
					try {
				    	WebElement PMCares_Button = PMCares_CrossButton;
				    	PMCares_Button.isDisplayed();
				        return  true;
				      
				    } 
				    catch (Exception e) {
				        return false;                
				    }
				}	
				
				//Validation : If only PMCaresBtn is displayed then,Click on PMCares cross btn 
				public void ClickOnPMCaresButton() throws InterruptedException{
				WebElement btn = PMCares_CrossButton;
				btn.click();
				}
				
				public boolean newLoginFeature() {
					try {
				    	WebElement loginBtn = ssoPageLoginBtn;
				    	loginBtn.isDisplayed();
				        return  true;
				      
				    } 
				    catch (Exception e) {
				        return false;                
				    }
			        }
				
			
		//Validation : If new SSO found click on Login btn 
		public void clickOnSsoLoginBtn(String un) throws InterruptedException{
		Actions act = new Actions(driver);
		act.moveToElement(ssoPageLoginBtn).perform(); 
	//	Thread.sleep(2000);
		/*username.sendKeys(un);
		Thread.sleep(2000);
		loginBtn.click();*/
		System.out.println("Mouse hovered on login btn");
		}
		
		
				
				
		//Validation : UserName TextBox is Displayed
		public boolean unTxBoxIsDisplayed() throws InterruptedException{
		WebElement unTxtBox = username;
		return unTxtBox.isDisplayed();
		}
		
		//Validation : UserName TextBox is Enable
		public boolean unTxtBoxIsEnabled() throws InterruptedException{
		WebElement unTxtBox = username;
		return unTxtBox.isEnabled();
		}
		
		//Validation : select Module DropDown is Displayed
		public boolean validateDropdwnDisplay() throws InterruptedException{
		WebElement slctModule = dropdown;
		return slctModule.isDisplayed();
		}
		
		//Validation : select Module DropDown is Enable
		public boolean validateDropdwnEnabled() throws InterruptedException{
		WebElement slctModule = dropdown;
		return slctModule.isEnabled() ;
		}
			
		//Validation : select Module DropDown has Multiple values
		public boolean validateDropdwnIsMultipl() throws InterruptedException{
		Select ListBox = new Select(dropdown);
		boolean value = ListBox.isMultiple() ;
		return value;
		}
		
		//Validation : select Module DropDown has Multiple values
		public void selectLoginModulesDropdownValues() throws InterruptedException{
		Select sel = new Select(dropdown);
		sel.selectByIndex(0);
		List<WebElement> value = sel.getOptions();
		for(WebElement ob : value){
		String loginModulesDropdownValues = ob.getText();
		System.out.println(loginModulesDropdownValues);
			}
		}
		
		//Validation : LogIn Btn is displayed
		public boolean validateLoginBtnDisplyd() throws InterruptedException{
		WebElement logInButton = loginBtn;
		return logInButton.isDisplayed();
		}
		
		//Validation : LogIn Btn is Enabled
		public boolean validateLoginBtnEnbld() throws InterruptedException{
		WebElement logInButton = loginBtn;
		return logInButton.isEnabled();
		}
		
		//Validation : Login Without Entering Data neither in UnTxtNox nor Dropdown
		public void validateLoginWdoutData() throws InterruptedException{
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		}
		
		//Validation : Login with Invalid UserName 
		public void validateInvalidUn(String InvalidUn) throws InterruptedException{
		username.clear();
		username.sendKeys(InvalidUn);
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		}
		
		//Validation : Entering Invalid UserName, selecting dropdown and hits LoginBtn
		public void validateInvalidUnWithDrpdwn(String InvalidUn) throws InterruptedException{
		username.clear();
		username.sendKeys(InvalidUn);
		Thread.sleep(2000);
		Select list = new Select(dropdown);
		list.selectByIndex(1);
		Thread.sleep(2000);
		loginBtn.click();
		}
		
		
		//Validation : Successful Login with valid credentials and Dropdown value on 1st SSO page
		public void validateValidLoginFirstPage(String un) throws InterruptedException, IOException{
		username.clear();
		username.sendKeys(un);
		Thread.sleep(2000);
		/*Select list = new Select(dropdown);
		list.selectByIndex(0);*/
		loginBtn.click(); 
		}
						
		//Validating Pwd Textbox is Displayed 
		public boolean ValidatePwdTxtboxDisplyd(){
		WebElement PwdTextbox = Password;
		return PwdTextbox.isDisplayed();
		}
		
		//Validating Pwd Textbox is Enabled 
		public boolean ValidatePwdTxtboxEnabled(){
		WebElement PwdTextbox = Password;
		return PwdTextbox.isEnabled();
		}
		
		//Validating Captcha Textbox is Displayed 
		public boolean ValidateCaptchaTextboxDisplyd(){
		WebElement captcha = Captcha;
		return captcha.isDisplayed();
		}
				
		//Validating Captcha Textbox is Enabled 
		public boolean ValidateCaptchaTxtboxEnabled(){
		WebElement captcha = Captcha;
		return captcha.isEnabled();
		}	

		//Validating SignIn Btn is Displayed 
		public boolean ValidateSignInBtnDisplyd(){
		WebElement SignInBttn = signInBtn;
		return SignInBttn.isDisplayed();
		}	
			
		//Validating SignIn Btn is Enabled
		public boolean ValidateSignInBtnEnabled(){
		WebElement SignInBttn = signInBtn;
		return SignInBttn.isEnabled();
		}	
		
		//Clicking SignInBtn without entering Pwd
		public void ValidateSignInWithBlankPwd() throws InterruptedException{
		Thread.sleep(2000);
		signInBtn.click();
		}
			
		//Validating Pwd Textbox with Incorrect Pwd
		public void ValidateWrongPwd(String WrongPwd) throws InterruptedException{
		Password.sendKeys("WrongPwd");
		Thread.sleep(10000);
		signInBtn.click();
		Thread.sleep(3000);
		}
		
		//Validation Incorrect Pwd Alert Msg
		public String ValidateIncorrectPwdMsg(){
		WebElement IncrrctPwdMsg = IncrrctPwdAlertMsg;
		return IncrrctPwdMsg.getText();
		 }
		
					
		//Validating Successful Login with Correct Pwd
		public void ValidateValidLoginScndPage(String CorrectPwd) throws InterruptedException, IOException{
		//Thread.sleep(2000);
		Password.sendKeys(CorrectPwd);	
		Password.sendKeys(Keys.TAB);
		Thread.sleep(10000);
		signInBtn.click();
		Thread.sleep(2000);
	//	return new HomePage(); //Just for reference that landing page would be home page or we can simply close the method after click function.
		}
		
		//Validating Logout Button is clickable
		public void logoutBtnIsClickable(){
		WebElement logoutBtn = Logout;
		logoutBtn.click();
		}
		
		
		//;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
		
		public void SelectParentwindow() throws InterruptedException {
		//	Thread.sleep(2000);
			String parentWindow;
	parentWindow = driver.getWindowHandles().toArray()[0].toString();
			driver.switchTo().window(parentWindow);

			//Methods for focus on Child window
				Thread.sleep(2000);
				String childWindow;
				AdministrationTab.click();
				Thread.sleep(2000);
				Alert confirm = driver.switchTo().alert();
				String alertMsg = confirm.getText();
				confirm.accept();
				Thread.sleep(2000);
				childWindow = driver.getWindowHandles().toArray()[1].toString();
				driver.switchTo().defaultContent();
				 driver.switchTo().window(childWindow);
				}
		




}
		
		
		
		
		

		
	
	
	
	
	
	
	
	




