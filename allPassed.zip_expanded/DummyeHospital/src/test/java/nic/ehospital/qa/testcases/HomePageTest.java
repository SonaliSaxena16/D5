package nic.ehospital.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import nic.ehospital.qa.base.TestBase;
import nic.ehospital.qa.pages.ConfigureHospitalInfraPage;
import nic.ehospital.qa.pages.HomePage;
import nic.ehospital.qa.pages.LoginPage;
import nic.ehospital.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	TestUtil testUtil;
	HomePage homePage;
	
	public HomePageTest() throws IOException {
		//super();
	}
	
	@Test(priority=1, groups= {"Functional","Smoke"})
	public void HomePageTitleTest() throws InterruptedException, IOException{
		testUtil = new TestUtil();
		Thread.sleep(2000);
		testUtil.BannerFrame();
		homePage = new HomePage();
	String Title = homePage.ValidateHomePageTitle();
	Assert.assertEquals(Title, "e-Hospital@NIC Govt. of India");
	if(Title.equals("e-Hospital@NIC Govt. of India")){
		System.out.println("Page title verified");
	}
		}
	
	@Test(priority=2, groups= {"Functional"})
	public void LogoIsDisplydTest() throws IOException, InterruptedException{
	boolean flag = homePage.ValidateLogoIsDisplyd();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("HomePage logo is displayed");
	}else{
		System.out.println("No HomePage logo displayed");
	}	}
	
	
	
	@Test(priority=3, groups= {"Functional"})
	public void HospitalNameIsDisplydTest() throws IOException, InterruptedException{
	boolean flag = homePage.ValidateHsptlNameIsDisplyd();	
	Assert.assertTrue(flag);
	if(flag==true){
		WebElement hsptlName = homePage.printHospitalName();
/*
		String displayName = hsptlName.getText();
		Assert.assertEquals(displayName, "UP NIC Test Hospital");
		System.out.println("HospitalName displayed is :"+displayName);
		
*/	
		
	}
		}
	
	
	@Test(priority=4, groups= {"Functional"})
	public void ToggleBtnIsDisplydTest() throws InterruptedException{
	boolean flag = homePage.ValidateToggleBtnIsDisplyd();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Toggle Button is displayed");
	}else{
		System.out.println("No Toggle Button displayed");
	}
	}
	
	@Test(priority=5, groups= {"Functional"})
	public void ToggleBtnIsEnabldTest() throws InterruptedException{
	boolean flag = homePage.ValidateToggleBtnIsEnabld();	
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Toggle Button is displayed");
	}else{
		System.out.println("No Toggle Button displayed");
	}
	}
	
	@Test(priority=6, groups= {"Functional"})
	public void ToggleBtnClikTest() throws InterruptedException, IOException{
	Thread.sleep(2000);
	homePage.ValidateToggleBtnClik();	
	}
	
	@Test(priority=7, groups= {"Functional"})
	public void UserNameIsDisplydTest() throws InterruptedException{
	boolean flag = homePage.ValidateUserNameIsDisplyd();
	Assert.assertTrue(flag);
	if(flag==true){
		WebElement userName = homePage.printUsername();
/*		
		String printUN = userName.getText();
		Assert.assertEquals(printUN, "Welcome Dr. Sonali Saxena (UPN_SU_0232)");
		System.out.println("UserName displayed is :"+printUN);
		
*/
		
	
}
		}
	
	
	
	@Test(priority=8, groups= {"Functional"})
	public void LogoutBtnIsDisplydTest() throws InterruptedException, IOException{
	boolean flag = homePage.ValidateLogoutBtnIsDisplyd();	
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("logout Button is displayed");
	}else{
		System.out.println("logout Button displayed");
	}
	}

	@Test(priority=9, groups= {"Functional"})
	public void LogoutBtnIsEnabld() throws InterruptedException{
	boolean flag = homePage.ValidateLogoutBtnIsEnabld();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("logout Button is enabled");
	}else{
		System.out.println("Logout Button enabled");
	}
	}
	
	

	
	
	@Test(priority=10, groups= {"Functional"})
	public void findframeno() throws InterruptedException{
		homePage.findframeno();
		System.out.println("Frame found as per home page");
	}

	
	@Test(priority=11, groups= {"Functional"})
	public void changePwdKeyBtnIsDisplyd() throws InterruptedException, IOException{
	boolean flag = homePage.changePwdKeyBtnIsDisplyd();	
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Change Pwd Button is displayed");
	}
		}

	@Test(priority=12, groups= {"Functional","Smoke"})
	public void changePwdKeyBtnIsEnabld() throws InterruptedException, IOException{
	boolean flag = homePage.changePwdKeyBtnIsEnabld();
	Assert.assertTrue(flag);
	if(flag==true){
		homePage.changePwdKeyBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("Change Pwd Button is Enabled & Clickable");
		testUtil.RightFrame();
		Thread.sleep(2000);
	}
		}
	

	@Test(priority=13, groups= {"Functional"})
	public void currentPwdTxboxIsDisplyd() throws InterruptedException, IOException{
	boolean flag = homePage.currentPwdTxboxIsDisplyd();	
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Current Pwd Textbox is displayed");
	}
		}

	@Test(priority=14, groups= {"Functional"})
	public void currentPwdTxboxIsEnabld() throws InterruptedException, IOException{
	boolean flag = homePage.currentPwdTxboxIsEnabld();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Current Pwd Textbox is Enabled");
	}
		}

	@Test(priority=15, groups= {"Functional"})
	public void newPwdTxtboxIsDisplyd() throws InterruptedException, IOException{
	boolean flag = homePage.newPwdTxtboxIsDisplyd();	
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("New Pwd Textbox is displayed");
	}
		}

	@Test(priority=16, groups= {"Functional"})
	public void newPwdTxtboxIsEnabld() throws InterruptedException, IOException{
	boolean flag = homePage.newPwdTxtboxIsEnabld();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("New Pwd Textbox is Enabled");
	}
		}
	
	@Test(priority=17, groups= {"Functional"})
	public void confirmPwdTxtboxIsDisplyd() throws InterruptedException, IOException{
	boolean flag = homePage.confirmPwdTxtboxIsDisplyd();	
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Confirm Pwd Textbox is displayed");
	}
		}

	@Test(priority=18, groups= {"Functional"})
	public void confirmPwdTxtboxIsEnabld() throws InterruptedException, IOException{
	boolean flag = homePage.confirmPwdTxtboxIsEnabld();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Confirm Pwd Textbox is Enabled");
	}
		}
	
	@Test(priority=19, groups= {"Functional"})
	public void savePwdBtnIsDisplyd() throws InterruptedException, IOException{
	boolean flag = homePage.savePwdBtnIsDisplyd();	
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save btn for change pwd is displayed");
	}
		}

	@Test(priority=20, groups= {"Functional"})
	public void savePwdBtnIsEnabld() throws InterruptedException, IOException{
	boolean flag = homePage.savePwdBtnIsEnabld();
	Assert.assertTrue(flag);
	if(flag==true){
		homePage.savePwdBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter old password");
		System.out.println("Alert handled: Directly clicked on save btn, for change pwd is Enabled & clickable");
	}
		}



@Test(priority=21, groups= {"Functional"})
public void enterInvalidOldPwdAndClickSaveBtn() throws InterruptedException, IOException{
 homePage.enterInvalidOldPwdAndClickSaveBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter new password");
	System.out.println("Alert handled: Invalid current password entered and clicked save btn");
}


@Test(priority=22, groups= {"Functional"})
public void enterNewPwdAndClickSaveBtn() throws InterruptedException, IOException{
 homePage.enterNewPwdAndClickSaveBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please retype  password");
	System.out.println("Alert handled: Invalid new password entered and clicked save btn");
}

@Test(priority=23, groups= {"Functional"})
public void enterDifferentPwdFromNewPwdInConfirmPwdTxboxAndClickSaveBtn() throws InterruptedException, IOException{
 homePage.enterDifferentPwdFromNewPwdInConfirmPwdTxboxAndClickSaveBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "New passwords don't match.");
	System.out.println("Alert handled: Invalid password retyped and clicked save btn");
}

@Test(priority=24, groups= {"Functional"})
public void enterSamePwdInNewAndCurrentPwdAndClickSaveBtn() throws InterruptedException, IOException{
 homePage.enterSamePwdInNewAndCurrentPwdAndClickSaveBtn();
	Thread.sleep(2000);
	String updateMsg = homePage.printValMsgForChngPwdFunctionality();
	Assert.assertEquals(updateMsg, "Authentication failed. Enter correct old password.");
	System.out.println("Same pwd Entered in New Pwd and Retype Pwd Textbox"+ updateMsg);
	}


	@Test(priority=25, groups= {"Functional","Smoke"})
	public void changePwdInOneGo() throws InterruptedException, IOException{
		homePage.changePwdInOneGo();
		Thread.sleep(2000);
		if (homePage.isAlertPresent()) {
			    driver.switchTo().alert().accept();
		}
		else{
			String updateMsg = homePage.printValMsgForChngPwdFunctionality();	
			System.out.println(updateMsg);
		}
		}





















}
