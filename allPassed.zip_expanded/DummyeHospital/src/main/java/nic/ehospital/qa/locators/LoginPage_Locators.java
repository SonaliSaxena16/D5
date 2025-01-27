package nic.ehospital.qa.locators;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
import nic.ehospital.qa.base.TestBase;

public class LoginPage_Locators extends TestBase{

	// Object Repository OR Page Objects
	
	@FindBy(xpath="//*[contains(@src,'images/logo.png')]")
	@Getter
	public WebElement eHospitalLogo;
	
	@FindBy(id="txtuid")
	@Getter
	public WebElement username;
	
	@FindBy(name="ddl_mod")
	@Getter
	public WebElement dropdown;
	
	@FindBy(xpath="//*[contains(@onclick,'return verification();')]")
	@Getter
	public WebElement loginBtn;
	
	@FindBy(xpath="//*[contains(@type,'password')]")
	@Getter
	public WebElement Password;
	
	@FindBy(xpath="//*[contains(@class,'btn btn-success btn-sm')]")
	@Getter
	public WebElement signInBtn;
	
	@FindBy(xpath="//*[contains(@id,'alert_msg')]")
	@Getter
	public WebElement IncrrctPwdAlertMsg;
	
	@FindBy(xpath="//*[contains(@id,'btnlogout')]")
	@Getter
	public WebElement Logout;
	
	@FindBy(id="txt_captcha")
	@Getter
	public WebElement Captcha;

	@FindBy(xpath="//*[contains(@onclick,'closeMIBPopup();')]")
	@Getter
	public WebElement PMCares_CrossButton;
	

	
	public LoginPage_Locators() throws IOException {
		PageFactory.initElements(driver, this);
	}

}
