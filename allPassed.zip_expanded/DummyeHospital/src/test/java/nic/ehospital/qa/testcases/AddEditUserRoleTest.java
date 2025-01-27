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
import nic.ehospital.qa.pages.ConfigureServices;
import nic.ehospital.qa.pages.AddEditUserRole;
import nic.ehospital.qa.util.TestUtil;

public class AddEditUserRoleTest extends TestBase{
	
	AddEditUserRole userAdmin;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	

	public AddEditUserRoleTest() throws IOException {
		super();
	}

	
	@Test(priority=1, groups={"Functional","Smoke"})
	public void userAdministrationLinkIsDisplayed() throws IOException, InterruptedException{
		userAdmin = new AddEditUserRole();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = userAdmin.userAdministrationLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("User Administration Link Is Displayed");
		}
	}

	@Test(priority=2, groups={"Functional","Smoke"})
	public void userAdministrationLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = userAdmin.userAdministrationLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			userAdmin.userAdministrationLinkIsClickable();
		Reporter.log("User Administration Link is Enabled & Clickable", true);
		}
	}
	
	
	
	@Test(priority=3, groups={"Functional","Smoke"})
	public void addEditUserRoleLinkIsDisplayed() throws IOException, InterruptedException{
		Thread.sleep(2000);
		boolean flag = userAdmin.addEditUserRoleLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Add Edit User Role Link Is Displayed");
		}
	}

	@Test(priority=4, groups={"Functional","Smoke"})
	public void addEditUserRoleLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = userAdmin.addEditUserRoleLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			userAdmin.addEditUserRoleLinkIsClickable();
			Thread.sleep(2000);
			testUtil.RightFrame();
			Thread.sleep(2000);
			List<WebElement>elements = driver.findElements(By.tagName("table"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od); 	
		    }
		    Reporter.log("Add Edit User Role Link is Enabled & Clickable", true);
		}}
	
	
	@Test(priority=5, groups={"Functional"})
	public void empNameTxtboxIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = userAdmin.empNameTxtboxIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Employee Name Textbox is Displayed");
	}	
		}

	
	@Test(priority=6, groups={"Functional"})
	public void empNameTxtboxIsEnabled(){
	boolean flag = userAdmin.empNameTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Employee Name Textbox is Enabled");
	}	
		}
	
	
	
	@Test(priority=7, groups={"Functional"})
	public void searchBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = userAdmin.searchBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search Button is Displayed");
	}	
		}

	
	@Test(priority=8, groups={"Functional"})
	public void searchBtnIsEnabled() throws InterruptedException{
	boolean flag = userAdmin.searchBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		userAdmin.searchBtnIsClickable();
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
	
	
	
	@Test(priority=9, groups={"Functional"})
	public void selectEmployeeDropdownIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = userAdmin.selectEmployeeDropdownIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Displayed");
	}	
		}

	
	
	
	@Test(priority=10, groups={"Functional"})
	public void selectEmployeeDropdownIsEnabled(){
	boolean flag = userAdmin.selectEmployeeDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Enabled");
	}	
		}
	
	

	@Test(priority=11, groups= {"Functional"})
	public void selectEmployeeDropdownIsMultiple() throws InterruptedException{
	boolean flag = userAdmin.selectEmployeeDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Employee Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=12, groups={"Functional"})
	public void selectUsernameDropdownIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = userAdmin.selectUsernameDropdownIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Username Dropdown is Displayed");
	}	
		}

	
	
	
	@Test(priority=13, groups={"Functional"})
	public void selectUsernameDropdownIsEnabled(){
	boolean flag = userAdmin.selectUsernameDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Username Dropdown is Enabled");
	}	
		}
	
	

	@Test(priority=14, groups= {"Functional"})
	public void selectUsernameDropdownIsMultiple() throws InterruptedException{
	boolean flag = userAdmin.selectUsernameDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Username Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=15, groups={"Functional"})
	public void saveUserRoleBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = userAdmin.saveUserRoleBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Employee Name Textbox is Displayed");
	}	
		}

	
	@Test(priority=16, groups={"Functional"})
	public void saveUserRoleBtnIsEnabled() throws InterruptedException{
	boolean flag = userAdmin.saveUserRoleBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		userAdmin.saveUserRoleBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select Employee and User");
		Reporter.log("Alert handled :Save Button is Enabled & clickable", true);
	}	
		}
	
	
	
	@Test(priority=17, groups={"Functional"})
	public void enterInvalidEmpName() throws InterruptedException{
	 userAdmin.enterInvalidEmpName();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter a valid employee name.");
		Reporter.log("Alert handled :Invalid employee name entered", true);
	}	
	
	
	@Test(priority=18, groups={"Functional"})
	public void enterValidEmpName() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validEmp = xlsReader.getCellData("TestData", "EmployeeName", 2);
	userAdmin.enterValidEmpName(validEmp);
	 Thread.sleep(2000);
	 userAdmin.saveUserRoleBtnIsClickable();
	 Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select Employee and User");
		Reporter.log("Valid employee name searched & clicked on Save Button", true);
	}	
	
	
	
	
	
	@Test(priority=19, groups={"Functional"})
	public void selectEmployeeFromDrpdwnAsPerNameSearched() throws InterruptedException{
	userAdmin.selectEmployeeFromDrpdwnAsPerNameSearched();
	 Thread.sleep(2000);
	 userAdmin.saveUserRoleBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select User");
		Reporter.log("Employee selected from dropdown as per name searched", true);
	}	
	

	@Test(priority=20, groups={"Functional"})
	public void selectUsernameFromDrpdwnAsPerEmpSelected() throws InterruptedException{
	userAdmin.selectUsernameFromDrpdwnAsPerEmpSelected();
	Thread.sleep(2000);
	}	
	
	@Test(priority=21, groups={"Functional"})
	public void clinicChkboxIsDisplayed() throws InterruptedException{
		boolean flag = userAdmin.clinicChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Clinic checkbox is Displayed");
	}	
		}

	
	@Test(priority=22, groups={"Functional"})
	public void clinicChkboxIsEnabled(){
	boolean flag = userAdmin.clinicChkboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Clinic checkbox is Enabled");
	}	
		}
	
	@Test(priority=23, groups={"Functional"})
	public void clinicChkboxIsClickable() throws InterruptedException{
	userAdmin.clinicChkboxIsClickable();
	Thread.sleep(2000);
	userAdmin.saveUserRoleBtnIsClickable();
	Thread.sleep(2000);
	WebElement updateMsg = userAdmin.printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "User Role Saved Successfully!!!");
	System.out.println("Validation msg User Roled saved:"+ validationMsg);
	}
	
	
	@Test(priority=24, groups={"Functional","Smoke"})
	public void createRoleInOneGo() throws InterruptedException{
	Thread.sleep(2000);	
	testUtil.LeftFrame();
	userAdmin.addEditUserRoleLinkIsClickable();
	Thread.sleep(2000);
	testUtil.RightFrame();
	Thread.sleep(2000);
	
	
		
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String empName = xlsReader.getCellData("TestData", "EmployeeName", 2);
	userAdmin.createRoleInOneGo(empName);
	Thread.sleep(2000);
	
//	userAdmin.saveUserRoleBtnIsClickable();
	Thread.sleep(2000);
	WebElement updateMsg = userAdmin.printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "User Role Saved Successfully!!!");
	System.out.println("Validation msg User Roled saved:"+ validationMsg);
	
	}
	
		
	
	
	
	
	
	
	
	
}
