package nic.ehospital.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import nic.ehospital.qa.base.EhospitalListener;
import nic.ehospital.qa.base.TestBase;
import nic.ehospital.qa.pages.HomePage;
import nic.ehospital.qa.pages.LoginPage;
import nic.ehospital.qa.util.TestUtil;

@Listeners(EhospitalListener.class)
public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeSuite(groups= {"Functional","Smoke"})
	public void setUp() throws IOException{
		initialization();
		loginPage = new LoginPage();
		System.out.println("Initializing files and elements");
	}
	
	@Test(priority=1, groups= {"Functional","Smoke"})
	public void loginPageTitleTest() throws InterruptedException{
		String expTitle  = "e-Hospital"; 
		String actTitle = driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actTitle,expTitle);
		Reporter.log("LogIn page title verified", true);
		System.out.println(actTitle);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	
	
	
	
	
	
	@Test(priority=2, groups= {"Functional","Smoke"})
	public void eHospitalLogoTest() throws InterruptedException{
	boolean flag = loginPage.validateEhospitalLogo();
	Assert.assertTrue(flag);
	if(flag==true)
	{
		System.out.println("eHospital Logo is Displayed");
	}
	else{
		System.out.println("eHospital Logo not Displayed");
	}
}
	
	
	
	
	
	@Test(priority=3, groups= {"Functional","Smoke"})
	public void ClickOnPMCaresButton() throws InterruptedException{
	
	if(loginPage.PMCareButton()==true)
	{
	//	Thread.sleep(2000);
		loginPage.ClickOnPMCaresButton();
		System.out.println("PMCares btn is Displayed and clicked");
	}
	
	else if(loginPage.newLoginFeature()==true){
	//	Thread.sleep(2000);
		loginPage.clickOnSsoLoginBtn(prop.getProperty("username"));
		
		
	}
}
	
	
	
	
	
	
	@Test(priority=4, groups= {"Functional"})
	public void unTxtBoxDisplayTest() throws InterruptedException{
	boolean flag = loginPage.unTxBoxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("UserName TextBox is Displayed");
	}else{
		System.out.println("UserName Textbox not Displayed"); }
	}
	
	@Test(priority=5, groups= {"Functional"})
	public void unTxtBoxEnabldTest()throws InterruptedException{
	boolean flag = loginPage.unTxtBoxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("UserName TextBox is Enabled");
	}else{
		System.out.println("UserName Textbox not Enabled");}
	}
	
	@Test(priority=6, groups= {"Functional"})
	public void DropdwnDisplayTest()throws InterruptedException{
	boolean flag = loginPage.validateDropdwnDisplay();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Dropdown is Displayed");
	}else {
		System.out.println("Select Dropdown not Displayed");}
	}
	
	@Test(priority=7, groups= {"Functional"})
	public void DropdwnEnabledTest() throws InterruptedException{
	boolean flag = loginPage.validateDropdwnEnabled();	
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Dropdown is Enabled");
	}else{
		System.out.println("Select Dropdown not Enabled");}
	}
	
	@Test(priority=8, groups= {"Functional"})
	public void DropdwnMultiplTest() throws InterruptedException{
	boolean flag = loginPage.validateDropdwnIsMultipl();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("This Dropdown doesn't allow to select Multiple Values");
	}
		}

	
	
	
	
	
	
	
	/*
	@Test(priority=9, groups= {"Functional","Smoke"})
	public void selectLoginModulesDropdownValues() throws InterruptedException{
	loginPage.selectLoginModulesDropdownValues();
	}

	*/
	
	
	
	@Test(priority=10, groups= {"Functional"})
	public void LoginBtnDisplydTest() throws InterruptedException{
	boolean flag = loginPage.validateLoginBtnDisplyd();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("LogIn Button is Displayed");
	}else{
		System.out.println("LogIn Button not Displayed");}
	}
	
	@Test(priority=11, groups= {"Functional"})
	public void LoginBtnEnbldTest()throws InterruptedException{
	boolean flag = loginPage.validateLoginBtnEnbld();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("LogIn Button is Enabled");
	}else{
		System.out.println("LogIn Button not Enabled");}
	}

	@Test(priority=12, groups= {"Functional"})
	public void LoginWdoutDataTest()throws InterruptedException{
	loginPage.validateLoginWdoutData();
	Alert msg = driver.switchTo().alert();
	String AlertText = msg.getText();
	Thread.sleep(2000);
	System.out.println(AlertText);
	String expAlert = "Enter username";
	String actAlert = AlertText;
	Thread.sleep(2000);
	msg.accept();
	Thread.sleep(2000);
	Assert.assertEquals(expAlert, actAlert);
	Reporter.log("Alert Handled if Login without UN", true);
	}
	

	@Test(priority=13, groups= {"Functional"}, enabled=false)
	public void InvalidUnTest() throws InterruptedException{
	loginPage.validateInvalidUn(prop.getProperty("wrongUserName"));
	Alert msg = driver.switchTo().alert();
	Thread.sleep(3000);
	String AlertText = msg.getText();
	Thread.sleep(2000);
	System.out.println(AlertText);
	String expAlert = "Please select a module";
	String actAlert = AlertText;
	Thread.sleep(3000);
	msg.accept();
	Thread.sleep(3000);
	Assert.assertEquals(expAlert, actAlert);
	Reporter.log("Alert Handled for entering Invalid UN", true);
	}
	
	@Test(priority=14, groups= {"Functional"},enabled=false)
	public void InvalidUnWithDrpdwntTest() throws InterruptedException{
	loginPage.validateInvalidUnWithDrpdwn(prop.getProperty("wrongUserName"));
	Alert msg = driver.switchTo().alert();
	String AlertText = msg.getText();
	Thread.sleep(3000);
	System.out.println(AlertText);
	String expAlert = "Invalid access details.";
	String actAlert = AlertText;
	Thread.sleep(3000);
	msg.accept();
	Thread.sleep(3000);
	Assert.assertEquals(expAlert, actAlert);
	Reporter.log("Alert Handled", true);
	}


	
	
	
	
	
	
	
	@Test(priority=15, groups= {"Functional","Smoke"})
	public void validateValidLoginFirstPage() throws InterruptedException, IOException{
//	Thread.sleep(3000);
	loginPage.validateValidLoginFirstPage(prop.getProperty("username"));	
	}
	
	
	
	
	
	
	@Test(priority=16, groups= {"Functional"})
	public void PwdTxtboxDisplydTest() throws InterruptedException{
	boolean flag = loginPage.ValidatePwdTxtboxDisplyd();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("PwdTxtBox is Displayed");
	}else{
		System.out.println("PwdTxtBox not Displayed");
	}
}
	@Test(priority=17, groups= {"Functional"})
	public void PwdTxtboxEnabledTest() throws InterruptedException{
	boolean flag = loginPage.ValidatePwdTxtboxEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("PwdTxtBox is Enabled");
	}else{
		System.out.println("PwdTxtBox not Enabled");
	}
}

	@Test(priority=18, groups= {"Functional"})
	public void CaptchaTextboxDisplydTest() throws InterruptedException{
	boolean flag = loginPage.ValidateCaptchaTextboxDisplyd();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Captcha is Displayed");
	}else{
		System.out.println("Captcha not Displayed");
	}
}
	@Test(priority=19, groups= {"Functional"})
	public void CaptchaTxtboxEnabledTest() throws InterruptedException{
	boolean flag = loginPage.ValidateCaptchaTxtboxEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Captcha is Enabled");
	}else{
		System.out.println("Captcha not Enabled");
	}
}

	@Test(priority=20, groups= {"Functional"})
	public void SignInBtnDisplydTest() throws InterruptedException{
	boolean flag = loginPage.ValidateSignInBtnDisplyd();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("SignInBtn is Displayed");
	}else{
		System.out.println("SignInBtn is Displayed");
	}
}

	@Test(priority=21, groups= {"Functional"})
	public void SignInBtnEnabledTest() throws InterruptedException{
	boolean flag = loginPage.ValidateSignInBtnEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("SignInBtn is Enabled");
	}else{
		System.out.println("SignInBtn is Enabled");
	}
}

	@Test(priority=22, groups= {"Functional"})
	public void SignInWithBlankPwdTest() throws InterruptedException{
	Thread.sleep(2000);
	loginPage.ValidateSignInWithBlankPwd();
	Alert msg = driver.switchTo().alert();
	String AlertText = msg.getText();
	Thread.sleep(2000);
	msg.accept();
	String expAlert = "Please enter a password.";
	String actAlert  = AlertText; 
	Assert.assertEquals(actAlert,expAlert);
	Reporter.log("Alert Handled without Pwd SignBtn hit", true);
	}
	
	@Test(priority=23, groups= {"Functional"}, enabled=false)
	public void WrongPwdTest() throws InterruptedException{
	loginPage.ValidateWrongPwd(prop.getProperty("wrongPassword"));
	Thread.sleep(2000);
	String WrongPwdAlertMsg = loginPage.ValidateIncorrectPwdMsg();
	Assert.assertEquals(WrongPwdAlertMsg,"Wrong Username or Password..Try again with correct username and Password.");
	if(WrongPwdAlertMsg.equals("Wrong Username or Password..Try again with correct username and Password."))
	{ System.out.println("Got correct msg for entering wrong pwd");
	} else{
		{System.out.println("Got incorrect msg for entering wrong pwd");}
	}
	}
	
	
	
	

	
	
	@Test(priority=24, groups= {"Functional","Smoke"})
	public void ValidLoginScndPageTest() throws InterruptedException, IOException{
	loginPage.ValidateValidLoginScndPage(prop.getProperty("password"));
//	Thread.sleep(2000);
	}
	
	
	
	@Test(priority=25, groups= {"Functional","Smoke"})
	public void SelectParentwindow() throws InterruptedException, IOException{
	loginPage.SelectParentwindow();

	}
	
	@AfterSuite(groups= {"Functional","Smoke"})
	public void tearup() throws InterruptedException, IOException{
	testUtil = new TestUtil();
	testUtil.BannerFrame();
	Thread.sleep(2000);
	loginPage.logoutBtnIsClickable();
	Thread.sleep(2000);
	Alert confirm = driver.switchTo().alert();
	String alertMsg = confirm.getText();
	confirm.accept();
//	Assert.assertEquals(alertMsg, "Are you sure? This page is asking you to confirm that you want to leave - data you have entered may not be saved.");
	
	Reporter.log("Logout button alert handled", true);
	driver.quit();
	System.out.println("Browser closed");
}


	

	
}



