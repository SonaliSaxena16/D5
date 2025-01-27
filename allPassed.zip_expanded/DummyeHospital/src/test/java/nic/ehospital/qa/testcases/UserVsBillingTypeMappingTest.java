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
import nic.ehospital.qa.pages.UserVsBillingTypeMapping;
import nic.ehospital.qa.util.TestUtil;

public class UserVsBillingTypeMappingTest extends TestBase{

	UserVsBillingTypeMapping usrVsBllngTypeMappng ;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	
	public UserVsBillingTypeMappingTest() throws IOException {
		super();
	}

	
	@Test(priority=1, groups={"Functional","Smoke"})
	public void userVsBillingTypeMappingLinkIsDisplayed() throws IOException, InterruptedException{
		usrVsBllngTypeMappng = new UserVsBillingTypeMapping();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = usrVsBllngTypeMappng.userVsBillingTypeMappingLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("User Vs Billing Type Mapping Link Is Displayed");
		}
	}

	@Test(priority=2, groups={"Functional","Smoke"})
	public void userVsBillingTypeMappingLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = usrVsBllngTypeMappng.userVsBillingTypeMappingLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			usrVsBllngTypeMappng.userVsBillingTypeMappingLinkIsClickable();
			Thread.sleep(2000);
			testUtil.RightFrame();
			List<WebElement>elements = driver.findElements(By.tagName("table"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od); 	
		    }
		Reporter.log("User Vs Billing Type Mapping Link is Enabled & Clickable", true);
		}
	}
	
	@Test(priority=3, groups={"Functional"})
	public void empNameTxtboxIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = usrVsBllngTypeMappng.empNameTxtboxIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Employee Name Textbox is Displayed");
	}	
		}

	
	@Test(priority=4, groups={"Functional"})
	public void searchEmployeeTxtboxIsEnabled(){
	boolean flag = usrVsBllngTypeMappng.empNameTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Employee Name Textbox is Enabled");
	}	
		}
	
	
	@Test(priority=5, groups={"Functional"})
	public void searchBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = usrVsBllngTypeMappng.searchBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search Button is Displayed");
	}	
		}

	
	@Test(priority=6, groups={"Functional"})
	public void searchBtnIsEnabled() throws InterruptedException{
	boolean flag = usrVsBllngTypeMappng.searchBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		usrVsBllngTypeMappng.searchBtnIsClickable();
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
	public void selectEmployeeDrpdwnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = usrVsBllngTypeMappng.selectEmployeeDrpdwnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Displayed");
	}	
		}

	
	@Test(priority=8, groups={"Functional"})
	public void selectEmployeeDrpdwnIsEnabled(){
	boolean flag = usrVsBllngTypeMappng.selectEmployeeDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Enabled");
	}	
		}
	
	@Test(priority=9, groups= {"Functional"})
	public void selectEmployeeDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = usrVsBllngTypeMappng.selectEmployeeDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Employee Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=10, groups={"Functional"})
	public void UserNameDrpdwnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = usrVsBllngTypeMappng.UserNameDrpdwnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Displayed");
	}	
		}

	
	@Test(priority=11, groups={"Functional"})
	public void UserNameDrpdwnIsEnabled(){
	boolean flag = usrVsBllngTypeMappng.UserNameDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Enabled");
	}	
		}
	
	@Test(priority=12, groups= {"Functional"})
	public void UserNameDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = usrVsBllngTypeMappng.UserNameDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Employee Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=13, groups={"Functional"})
	public void saveBtnIsDisplayed() throws InterruptedException{
	boolean flag = usrVsBllngTypeMappng.saveBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update Button is Displayed");
	}	
		}

	
	@Test(priority=14, groups={"Functional"})
	public void saveBtnIsEnabled() throws InterruptedException{
	boolean flag = usrVsBllngTypeMappng.saveBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		usrVsBllngTypeMappng.saveBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select Employee and User");
		Reporter.log("Alert handled:Save Button is Enabled & clickable", true);
	}	
		}
	
	
	@Test(priority=15, groups={"Functional"})
	public void enterInvalidEmpNameAndClickSaveBtn() throws InterruptedException{
		usrVsBllngTypeMappng.enterInvalidEmpNameAndClickSaveBtn();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter a valid employee name.");
		Reporter.log("Alert handled:Invalid employee name entered in textbox", true);
	}	
	
	
	@Test(priority=16, groups={"Functional"})
	public void enterValidEmpNameAndClickUpdateBtn() throws InterruptedException{

		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String empName = xlsReader.getCellData("TestData", "EmployeeName", 2);	
		
		usrVsBllngTypeMappng.enterValidEmpNameAndClickUpdateBtn(empName);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select Employee and User");
		Reporter.log("Alert handled:Valid employee name entered in textbox", true);
	}	
			
	
	@Test(priority=17, groups={"Functional"})
	public void selectEmpFmDrpdwnAndClikUpdateBtn() throws InterruptedException{
		usrVsBllngTypeMappng.selectEmpFmDrpdwnAndClikUpdateBtn();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select User");
		Reporter.log("Alert handled:Only employee name selected", true);
	}	
		
	@Test(priority=18, groups={"Functional"})
	public void selectUserFmDrpdwnAndClikUpdateBtn() throws InterruptedException{
		usrVsBllngTypeMappng.selectUserFmDrpdwnAndClikUpdateBtn();
		Thread.sleep(2000);
		}	
		
	@Test(priority=19, groups={"Functional"})
	public void selectAllBillingTypesChkboxIsDisplayed() throws InterruptedException{
		boolean flag = usrVsBllngTypeMappng.selectAllBillingTypesChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select All Billing Types checkbox is Displayed");
	}	
		}

	
	@Test(priority=20, groups={"Functional"})
	public void selectAllBillingTypesChkboxIsEnabled(){
	boolean flag = usrVsBllngTypeMappng.selectAllBillingTypesChkboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select All Billing Types checkbox is Enabled");
	}	
		}
	
	
	
	@Test(priority=21, groups={"Functional"})
	public void selectAllBillingTypesChkboxIsClickable() throws InterruptedException{
	usrVsBllngTypeMappng.selectAllBillingTypesChkboxIsClickable();
	Thread.sleep(2000);
	WebElement updateMsg = usrVsBllngTypeMappng.printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Updated Successfully!!!");
	System.out.println("Validation msg Mapping Updated Successfully:"+ validationMsg);
	}	
	
	
	@Test(priority=22, groups={"Functional","Smoke"})
	public void addUsrVsBllngTypeMappngInOneGo() throws InterruptedException{
		Thread.sleep(2000);	
		testUtil.LeftFrame();
		usrVsBllngTypeMappng.userVsBillingTypeMappingLinkIsClickable();
		Thread.sleep(2000);
		testUtil.RightFrame();
		Thread.sleep(2000);
		
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String empName = xlsReader.getCellData("TestData", "EmployeeName", 2);
	
	usrVsBllngTypeMappng.addUsrVsBllngTypeMappngInOneGo(empName);
	Thread.sleep(2000);
	WebElement updateMsg = usrVsBllngTypeMappng.printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Updated Successfully!!!");
	System.out.println("Validation msg Mapping Updated Successfully:"+ validationMsg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
