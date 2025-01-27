package nic.ehospital.qa.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import nic.ehospital.qa.base.TestBase;
import nic.ehospital.qa.excel.XLS_Reader;
import nic.ehospital.qa.pages.ResetUserPassword;
import nic.ehospital.qa.pages.AddEditUserRole;
import nic.ehospital.qa.util.TestUtil;

public class ResetUserPasswordTest extends TestBase{
	

	ResetUserPassword resetUserPwd ;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	
	public ResetUserPasswordTest() throws IOException {
		super();
	}
	
	
	@Test(priority=1, groups={"Functional","Smoke"})
	public void resetUserPasswordLinkIsDisplayed() throws IOException, InterruptedException{
		resetUserPwd = new ResetUserPassword();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = resetUserPwd.resetUserPasswordLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Reset User Password Link Is Displayed");
		}
	}

	@Test(priority=2, groups={"Functional","Smoke"})
	public void resetUserPasswordLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = resetUserPwd.resetUserPasswordLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			resetUserPwd.resetUserPasswordLinkIsClickable();
			Thread.sleep(2000);
			testUtil.RightFrame();
			List<WebElement>elements = driver.findElements(By.tagName("td"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od); 	
		    }
		Reporter.log("Reset User Password Link is Enabled & Clickable", true);
		Thread.sleep(2000);
		}
	}
	
	
	
	@Test(priority=3, groups={"Functional"})
	public void searchUserTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = resetUserPwd.searchUserTxtboxIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search User Textbox is Displayed");
	}	
		}

	
	@Test(priority=4, groups={"Functional"})
	public void searchUserTxtboxIsEnabled(){
	boolean flag = resetUserPwd.searchUserTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search User Textbox is Enabled");
	}	
		}
		
	
	
	
	@Test(priority=5, groups={"Functional"})
	public void searchBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = resetUserPwd.searchBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search Button is Displayed");
	}	
		}

	
	@Test(priority=6, groups={"Functional"})
	public void searchBtnIsEnabled() throws InterruptedException{
	boolean flag = resetUserPwd.searchBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		resetUserPwd.searchBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter employee name.");
		Reporter.log("Alert handled :Search Button is Enabled & clickable", true);
	}	
		}
		
	
	@Test(priority=7, groups={"Functional"})
	public void selectEmployeeDropdownIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = resetUserPwd.selectEmployeeDropdownIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Displayed");
	}	
		}

	
	@Test(priority=8, groups={"Functional"})
	public void selectEmployeeDropdownIsEnabled(){
	boolean flag = resetUserPwd.selectEmployeeDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Enabled");
	}	
		}
	
	@Test(priority=9, groups= {"Functional"})
	public void selectEmployeeDropdownIsMultiple() throws InterruptedException{
	boolean flag = resetUserPwd.selectEmployeeDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Employee Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=10, groups={"Functional"})
	public void selectUserDropdownIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = resetUserPwd.selectUserDropdownIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select User Dropdown is Displayed");
	}	
		}

	
	@Test(priority=8, groups={"Functional"})
	public void selectUserDropdownIsEnabled(){
	boolean flag = resetUserPwd.selectUserDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select User Dropdown is Enabled");
	}	
		}
	
	@Test(priority=9, groups= {"Functional"})
	public void selectUserDropdownIsMultiple() throws InterruptedException{
	boolean flag = resetUserPwd.selectUserDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Employee User doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=10, groups={"Functional"})
	public void enterInvalidUserAndClickSearchBtn() throws InterruptedException{
	resetUserPwd.enterInvalidUserAndClickSearchBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter a valid employee name.");
		Reporter.log("Alert handled :Search Button is Enabled & clickable", true);
	}	
	
	
@Test(priority=11, groups={"Functional"})
public void enterValidUserAndClickSearchBtn() throws InterruptedException{
xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
String User = xlsReader.getCellData("TestData", "EmployeeName", 2);	
Thread.sleep(2000);
resetUserPwd.enterValidUserAndClickSearchBtn(User);
Thread.sleep(2000);
Reporter.log("Valid user entered in serch user textbox then click search btn", true);
}	

	
@Test(priority=12, groups={"Functional"})
public void selectEmployeeFromDrpdwnAsPerNameSearched() throws InterruptedException{
Thread.sleep(2000);
resetUserPwd.selectEmployeeFromDrpdwnAsPerNameSearched();
Thread.sleep(2000);
Reporter.log("Employee selected from dropdown as per user searched", true);
}	
	

@Test(priority=13, groups={"Functional"})
public void selectUserFromDrpdwnAsPerEmpSelected() throws InterruptedException{
Thread.sleep(2000);
resetUserPwd.selectUserFromDrpdwnAsPerEmpSelected();
Thread.sleep(2000);
Reporter.log("User selected from dropdown as per Employee selected", true);
}	
	

@Test(priority=14, groups={"Functional"})
public void createPwdBtnIsDisplayed(){
boolean flag = resetUserPwd.createPwdBtnIsDisplayed();
Assert.assertTrue(flag);
if(flag==true){
	System.out.println("Search User Textbox is Enabled");
}	
	}
	


@Test(priority=15, groups={"Functional"})
public void createPwdBtnIsEnabled() throws InterruptedException{
boolean flag = resetUserPwd.createPwdBtnIsEnabled();
Assert.assertTrue(flag);
if(flag==true){
	/*resetUserPwd.createPwdBtnIsClickable();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter employee name.");*/
	Reporter.log("Alert handled :Search Button is Enabled & clickable", true);
}	
	}

	
@Test(priority=16, groups={"Functional"},enabled=false)
public void removesUserAndClickCreatePwdBtn() throws InterruptedException{
Thread.sleep(2000);
resetUserPwd.removeUserAndClickCreatePwdBtn();
Thread.sleep(2000);
Reporter.log("User selected from dropdown as per Employee selected", true);
}		
	
	
@Test(priority=17, groups={"Functional"})
public void removeEmployeeAndClickCreatePwdBtn() throws InterruptedException{
resetUserPwd.removeEmployeeAndClickCreatePwdBtn();
Alert alert = driver.switchTo().alert();
String alertmsg = alert.getText();
System.out.println(alertmsg);
Thread.sleep(2000);
alert.accept();
Thread.sleep(2000);
Assert.assertEquals(alertmsg, "Select A Username");
Reporter.log("Alert handled:No Employee selected from dropdown and clicked on create pwd btn", true);
}	

@Test(priority=18, groups={"Functional"})
public void selectEmployeeOnlyFromDrpdwnClickCreatePwdBtn() throws InterruptedException{
resetUserPwd.selectEmployeeOnlyFromDrpdwnClickCreatePwdBtn();
Alert alert = driver.switchTo().alert();
String alertmsg = alert.getText();
System.out.println(alertmsg);
Thread.sleep(2000);
alert.accept();
Thread.sleep(2000);
Assert.assertEquals(alertmsg, "Select A Username");
Reporter.log("Alert handled:No Employee selected from dropdown and clicked on create pwd btn", true);
}	

@Test(priority=19, groups={"Functional"})
public void selectUserFromDrpdwnClickCreatePwdBtn() throws InterruptedException{
resetUserPwd.selectUserFromDrpdwnClickCreatePwdBtn();
Thread.sleep(2000);
WebElement updateMsg = resetUserPwd.printValidationMsg();
String validationMsg = updateMsg.getText();
Assert.assertEquals(validationMsg, "A link has been sent to the registered mobile & email address.");
System.out.println("Validation msg User Roled saved:"+ validationMsg);
Reporter.log("Alert handled:No Employee selected from dropdown and clicked on create pwd btn", true);
}	


@Test(priority=20, groups={"Functional","Smoke"})
public void resetPwdInOneGo() throws InterruptedException{
Thread.sleep(2000);
testUtil.LeftFrame();
resetUserPwd.resetUserPasswordLinkIsClickable();
Thread.sleep(2000);
testUtil.RightFrame();
xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
String User = xlsReader.getCellData("TestData", "EmployeeName", 2);	
resetUserPwd.resetPwdInOneGo(User);
Thread.sleep(2000);
WebElement updateMsg = resetUserPwd.printValidationMsg();
String validationMsg = updateMsg.getText();
Assert.assertEquals(validationMsg, "A link has been sent to the registered mobile & email address.");
System.out.println("Validation msg User Roled saved:"+ validationMsg);
}	














	
}
