package nic.ehospital.qa.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import nic.ehospital.qa.base.TestBase;
import nic.ehospital.qa.excel.XLS_Reader;
import nic.ehospital.qa.pages.ConfigureHospitalInfraPage;
import nic.ehospital.qa.pages.ConfigurePointOfTreatmentPage;
import nic.ehospital.qa.util.TestUtil;

public class ConfigurePointOfTreatmentPageTest extends TestBase{
	
	ConfigurePointOfTreatmentPage CPOT;
	TestUtil testUtil;
	XLS_Reader xlsReader;

	public ConfigurePointOfTreatmentPageTest() throws IOException {
		super();
	}
	
	
	
	
	@Test(priority=1, groups={"Functional","Smoke"})
	public void ConfigPointOfTreatmentIsDisplayed() throws IOException, InterruptedException{
		CPOT = new ConfigurePointOfTreatmentPage();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = CPOT.ConfigPointOfTreatmentIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ConfigPointOfTreatment link displayed");
		}
	}
	
	@Test(priority=2, groups={"Functional","Smoke"})
	public void ConfigPointOfTreatmentIsEnabled() throws IOException, InterruptedException{
		boolean flag = CPOT.ConfigPointOfTreatmentIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CPOT.ConfigPointOfTreatmentIsClickable();
			Thread.sleep(2000);
			testUtil.RightFrame();
			
			Thread.sleep(2000);
			List<WebElement>elements = driver.findElements(By.tagName("ul"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    	System.out.println(od); }
		Reporter.log("ConfigPointOfTreatment is Enabled & Clickable", true);
		}
			}
	
	
// 	COMMENT ......................................
	
	
	
	@Test(priority=3, groups={"Functional"})
	public void ConfigPointOfTrtment_ManageUserIsDisplayed(){
	boolean flag = CPOT.ConfigPointOfTrtment_ManageUserIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Users link Displayed");
	}else{
		System.out.println("Manage Users link not Displayed");
		}	
	}
	
	
	
	@Test(priority=4, groups={"Functional","Smoke"})
	public void ConfigPointOfTrtment_ManageUserIsEnabled() throws InterruptedException{
	boolean flag = CPOT.ConfigPointOfTrtment_ManageUserIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.ConfigPointOfTrtment_ManageUserIsClickable();
	
		List<WebElement>elements = driver.findElements(By.tagName("div"));
	    for(WebElement ob :elements ) {
	    	String od = ob.getText();
	 //  	System.out.println(od);
	   	}
	Reporter.log("ConfigPointOfTreatment is Enabled & Clickable", true);
	}
		}
	
	@Test(priority=5, groups={"Functional"})
	public void ManageUser_InitalsDrpdwnIsDisplayed(){
	boolean flag = CPOT.ManageUser_InitalsDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Initials dropdown displayed");
	}else{
		System.out.println("Manage User Initials dropdown not displayed");
		}	
	}

	@Test(priority=6, groups={"Functional"})
	public void ManageUser_InitalsDrpdwnIsEnabled(){
	boolean flag = CPOT.ManageUser_InitalsDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Initials dropdown enabled");
	}else{
		System.out.println("Manage User Initials dropdown not enabled");
		}	
	}

	@Test(priority=7, groups= {"Functional"})
	public void ManageUser_InitalsDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.ManageUser_InitalsDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Manage User Initials Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=8, groups={"Functional"})
	public void ManageUser_FirstNameTxBoxIsDisplayed(){
	boolean flag = CPOT.ManageUser_FirstNameTxBoxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User First Name Textbox displayed");
	}else{
		System.out.println("Manage User First Name Textbox not displayed");
		}	
	}

	@Test(priority=9, groups={"Functional"})
	public void ManageUser_FirstNameTxBoxIsEnabled(){
	boolean flag = CPOT.ManageUser_FirstNameTxBoxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User First Name Textbox enabled");
	}else{
		System.out.println("Manage User First Name Textbox not enabled");
		}	
	}
	
	@Test(priority=10, groups={"Functional"})
	public void ManageUser_LastNameTxBoxIsDisplayed(){
	boolean flag = CPOT.ManageUser_LastNameTxBoxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Last Name Textbox displayed");
	}else{
		System.out.println("Manage User Last Name Textbox not displayed");
		}	
	}

	@Test(priority=11, groups={"Functional"})
	public void ManageUser_LastNameTxBoxIsEnabled(){
	boolean flag = CPOT.ManageUser_LastNameTxBoxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Last Name Textbox enabled");
	}else{
		System.out.println("Manage User Last Name Textbox not enabled");
		}	
	}
	
	@Test(priority=12, groups={"Functional"})
	public void ManageUser_DesignatonDrpdwnIsDisplayed(){
	boolean flag = CPOT.ManageUser_DesignatonDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Designation dropdown displayed");
	}else{
		System.out.println("Manage User Designation dropdown not displayed");
		}	
	}

	@Test(priority=13, groups={"Functional"})
	public void ManageUser_DesignatonDrpdwnIsEnabled(){
	boolean flag = CPOT.ManageUser_DesignatonDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Designation dropdown enabled");
	}else{
		System.out.println("Manage User Designation dropdown not enabled");
		}	
	}

	@Test(priority=14, groups= {"Functional"})
	public void ManageUser_DesignatonDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.ManageUser_DesignatonDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Manage User Designation Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=15, groups={"Functional"})
	public void ManageUser_MobileTxBoxIsDisplayed(){
	boolean flag = CPOT.ManageUser_MobileTxBoxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Mobile Textbox displayed");
	}else{
		System.out.println("Manage User Mobile Textbox not displayed");
		}	
	}

	@Test(priority=16, groups={"Functional"})
	public void ManageUser_MobileTxBoxIsEnabled(){
	boolean flag = CPOT.ManageUser_MobileTxBoxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Mobile Textbox enabled");
	}else{
		System.out.println("Manage User Mobile Textbox not enabled");
		}	
	}
	
	@Test(priority=17, groups={"Functional"})
	public void ManageUser_EmailTxBoxIsDisplayed(){
	boolean flag = CPOT.ManageUser_EmailTxBoxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Email Textbox displayed");
	}else{
		System.out.println("Manage User Email Textbox not displayed");
		}	
	}

	@Test(priority=18, groups={"Functional"})
	public void ManageUser_EmailTxBoxIsEnabled(){
	boolean flag = CPOT.ManageUser_EmailTxBoxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Email Textbox enabled");
	}else{
		System.out.println("Manage User Email Textbox not enabled");
		}	
	}
	
	@Test(priority=19, groups={"Functional"})
	public void ManageUser_GenrateUsrNameBtnIsDisplayed(){
	boolean flag = CPOT.ManageUser_GenrateUsrNameBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User GenrerateUserName Btn displayed");
	}else{
		System.out.println("Manage User GenrerateUserName Btn not displayed");
		}	
	}
	
	@Test(priority=20, groups={"Functional"})
	public void ManageUser_GenrateUsrNameBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.ManageUser_GenrateUsrNameBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.ManageUser_GenrateUsrNameBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Enter First name!");
		Reporter.log("Alert handled", true);
		System.out.println("Manage User GenrerateUserName Btn enabled & Clickable");
	}else{
		System.out.println("Manage User GenrerateUserName Btn not enabled");
		}	
	}
	
	@Test(priority=21, groups={"Functional"})
	public void ManageUser_ValidUptoBtnIsDisplayed(){
	boolean flag = CPOT.ManageUser_ValidUptoBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Email Textbox displayed");
	}else{
		System.out.println("Manage User Email Textbox not displayed");
		}	
	}

	@Test(priority=22, groups={"Functional"})
	public void ManageUser_ValidUptoBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.ManageUser_ValidUptoBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.ManageUser_ValidUptoBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("Manage User Valid Upto Btn enabled & Clickable");
	}else{
		System.out.println("Manage User Valid Upto Btn not enabled");
		}	
	}
	
	@Test(priority=21, groups={"Functional"})
	public void ManageUser_SaveBtnIsDisplayed(){
	boolean flag = CPOT.ManageUser_SaveBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Save displayed");
	}else{
		System.out.println("Manage User Save not displayed");
		}	
	}

	@Test(priority=24, groups={"Functional"})
	public void ManageUser_SaveBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.ManageUser_SaveBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.ManageUser_SaveBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please Enter Employee First Name!");
		Reporter.log("Alert handled :Manage User Save Btn enabled & Clickable ", true);
	}else{
		System.out.println("Manage User Save Btn not enabled");
		}	
	}	
	
	@Test(priority=25, groups={"Functional"})
	public void ManageUser_SelectInitialAndClickSaveBtn() throws InterruptedException{
		Thread.sleep(2000);
		CPOT.ManageUser_SelectInitialAndClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please Enter Employee First Name!");
		Reporter.log("Alert handled", true);
	}
	
	
	@Test(priority=26, groups={"Functional"})
	public void ManageUser_SelectInitialFstNameAndClickSaveBtn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String fn = xlsReader.getCellData("TestData", "FirstName", 2);
	
	CPOT.ManageUser_SelectInitialFstNameAndClickSaveBtn(fn);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please Enter Last Name!!");
	Reporter.log("Alert handled", true);
	} 
	
	
	@Test(priority=27, groups={"Functional"})
	public void ManageUser_SelectInitialFstLstNameAndClickSaveBtn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String ln = xlsReader.getCellData("TestData", "LastName", 2);
	CPOT.ManageUser_SelectInitialFstLstNameAndClickSaveBtn(ln);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please Select Designation");
	Reporter.log("Alert handled", true);
	} 
	
	@Test(priority=28, groups={"Functional"})
	public void ManageUser_SelectInitialFstLstNameDesigAndClickSaveBtn() throws InterruptedException{
		Thread.sleep(2000);
		CPOT.ManageUser_SelectInitialFstLstNameDesigAndClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Employee must have on of the either mobile No  or email address!!");
		Reporter.log("Alert handled", true);
	}
	
	@Test(priority=29, groups={"Functional"})
	public void ManageUser_SelectInitialFstLstNameDesigMobAndClickSaveBtn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String mn = xlsReader.getCellData("TestData", "MobileNo", 2);
	CPOT.ManageUser_SelectInitialFstLstNameDesigMobAndClickSaveBtn(mn);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please Generate a username for this employee");
	Reporter.log("Alert handled", true);
	} 
	
	@Test(priority=30, groups={"Functional"})
	public void ManageUser_SelectInitialFstLstNameDesigMobGenUsrClickSaveBtn() throws InterruptedException{
		Thread.sleep(2000);
		CPOT.ManageUser_SelectInitialFstLstNameDesigMobGenUsrClickSaveBtn();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please Select Valid Upto from calender");
		Reporter.log("Alert handled", true);
	}
	
	@Test(priority=31, groups={"Functional"})
	public void ManageUser_ClickTodayBtnFromCalndr() throws InterruptedException{
		Thread.sleep(5000);
		CPOT.ManageUser_ClickTodayBtnFromCalndr();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Reporter.log("Alert handled", true);
	}
	
	@Test(priority=31, groups={"Functional","Smoke"})
	public void ManageUser_FillRequiredDetails() throws InterruptedException{
		
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		
	//	int rowCount = xlsReader.getRowCount("TestData");

//		for(int rowNum=2; rowNum<=rowCount; rowNum++){
			System.out.println("..................");
			
			String Initials = xlsReader.getCellData("TestData", "Initials", 4);
			System.out.println(Initials);
			
			String firstName = 	xlsReader.getCellData("TestData", "FirstName", 3);
			System.out.println(firstName);
			
			String lastName = xlsReader.getCellData("TestData", "LastName", 3);
			System.out.println(lastName);
			
			String mobileNo = xlsReader.getCellData("TestData", "MobileNo", 2);
			System.out.println(mobileNo);
			
			CPOT.ManageUser_FillRequiredDetails(Initials, firstName, lastName, mobileNo);
			Thread.sleep(2000);
	
			CPOT.GenerateUserNameSelectDateAndClickSaveBtn();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			Thread.sleep(2000);
			alert.accept();
			Thread.sleep(2000);
		}
	
	
	@Test(priority=32, groups={"Functional"})
	public void RefreshBtnIsDisplayed() throws InterruptedException{
		boolean flag = CPOT.RefreshBtnIsDisplayed();	
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Refresh Btn displayed");
		}else{
			System.out.println("Refreshed Btn not displayed");
			}	
		}
	
	@Test(priority=33, groups={"Functional","Smoke"})
	public void RefreshBtnIsEnabled() throws InterruptedException{
		boolean flag = CPOT.RefreshBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CPOT.ClickRefreshBtn();
			System.out.println("Refresh Btn enabled & clickable");
		}else{
			System.out.println("Refresh Btn neither enabled nor clickable");
			}	
		}
		
	@Test(priority=34, groups={"Functional"})
	public void EditBtnIsDisplayed() throws InterruptedException{
		boolean flag = CPOT.EditBtnIsDisplayed();	
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Edit Btn displayed");
		}else{
			System.out.println("Edit Btn not displayed");
			}	
		}
	
	@Test(priority=35, groups={"Functional","Smoke"})
	public void EditBtnIsEnabled() throws InterruptedException{
		Thread.sleep(4000);
		boolean flag = CPOT.EditBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			Thread.sleep(4000);
			CPOT.clickEditBtn();
			Thread.sleep(2000);
			System.out.println("Edit Btn enabled & clickable");
		}else{
			System.out.println("Edit Btn neither enabled nor clickable");
			}	
		}
		
	@Test(priority=36, groups={"Functional","Smoke"})
	public void ManageUser_EditUser() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String Email = xlsReader.getCellData("TestData", "Email", 2);
		CPOT.ManageUser_EditUser(Email);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
	}
	
	@Test(priority=37, groups={"Functional"})
	public void manageDepartmentIsDisplayed(){
	boolean flag = CPOT.manageDepartmentIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Department link Displayed");
	}else{
		System.out.println("Manage Department link not Displayed");
		}	
	}
	
	
	
	
	
	@Test(priority=38, groups={"Functional","Smoke"})
	public void manageDepartmentIsEnabled() throws InterruptedException{
	boolean flag = CPOT.manageDepartmentIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.manageDepartmentIsClickable();
		Thread.sleep(2000);
		
		List<WebElement>elements = driver.findElements(By.tagName("table"));	
	    for(WebElement ob :elements ) {
	    	String od = ob.getText();
	    //	System.out.println(od); 
	    	}
	Reporter.log("Department is Enabled & Clickable", true);
	}
		}
	
	@Test(priority=39, groups={"Functional"})
	public void ManageDepartment_AddNewDepartmentIsDisplayed(){
	boolean flag = CPOT.ManageDepartment_AddNewDepartmentIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add New Department link Displayed");
	}else{
		System.out.println("Add New Department link not Displayed");
		}	
	}
	
	@Test(priority=40, groups={"Functional"})
	public void ManageDepartment_AddNewDepartmentIsEnabled() throws InterruptedException{
	boolean flag = CPOT.ManageDepartment_AddNewDepartmentIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.ManageDepartment_AddNewDepartmentIsClickable();
		Reporter.log("Add New Department is Enabled & Clickable", true);
	}else{
		System.out.println("Add New Department link neither Enabled nor Clickable");
		}	
	}
	
	@Test(priority=41, groups={"Functional"})
	public void AddNewDepartment_AddDepartmentIsDisplayed(){
	boolean flag = CPOT.AddNewDepartment_AddDepartmentIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Department link Displayed");
	}else{
		System.out.println("Add Department link not Displayed");
		}	
	}
	
	@Test(priority=42, groups={"Functional"})
	public void AddNewDepartment_AddDepartmentIsEnabled() throws InterruptedException{
	boolean flag = CPOT.AddNewDepartment_AddDepartmentIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.AddNewDepartment_AddDepartmentIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		String alertmsg1 = alert1.getText();
		System.out.println(alertmsg1);
		Thread.sleep(2000);
		alert1.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "0");
		Reporter.log("Alert handled: Add Department is Enabled & Clickable", true);
	}else{
		System.out.println("Add Department link neither Enabled nor Clickable");
		}	
	}

	
	
	@Test(priority=43, groups={"Functional"})
	public void AddNewDepartment_DepartmentDrpdwnIsDisplayed(){
	boolean flag = CPOT.AddNewDepartment_DepartmentDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Department dropdown displayed");
	}else{
		System.out.println("Select Department dropdown not displayed");
		}	
	}

	@Test(priority=44, groups={"Functional"})
	public void AddNewDepartment_DepartmentDrpdwnIsEnabled(){
	boolean flag = CPOT.AddNewDepartment_DepartmentDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Department dropdown enabled");
	}else{
		System.out.println("Select Department dropdown not enabled");
		}	
	}

	@Test(priority=45, groups= {"Functional"})
	public void AddNewDepartment_DepartmentDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.AddNewDepartment_DepartmentDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Department Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=46, groups={"Functional"})
	public void onlySelectExistingDept() throws InterruptedException{
		CPOT.onlySelectExistingDept();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter department description.");
		Reporter.log("Alert handled: Only existing department selected", true);
		}	
			
	@Test(priority=47, groups={"Functional"})
	public void enteringInvalidDescription() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidDes = xlsReader.getCellData("TestData", "InvalidDescription", 2);
	CPOT.enteringInvalidDescription(invalidDes);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter valid department description.");
	Reporter.log("Alert handled", true);
	} 

	@Test(priority=48, groups={"Functional"})
	public void enteringValidDescription() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validDes = xlsReader.getCellData("TestData", "ValidDescription", 2);
	CPOT.enteringValidDescription(validDes);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid number of units.");
	Reporter.log("Alert handled", true);
	} 
	
	@Test(priority=49, groups={"Functional"})
	public void AddNewDepartment_NoOfUnitsTxBoxIsDisplayed(){
	boolean flag = CPOT.AddNewDepartment_NoOfUnitsTxBoxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Number of Units Textbox displayed");
	}else{
		System.out.println("Number of Units Textbox not displayed");
		}	
	}

	@Test(priority=50, groups={"Functional"})
	public void AddNewDepartment_NoOfUnitsTxBoxIsEnabled(){
	boolean flag = CPOT.AddNewDepartment_NoOfUnitsTxBoxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Number of Units Textbox enabled");
	}else{
		System.out.println("Number of Units Textbox not enabled");
		}	
	}
	
	@Test(priority=51, groups={"Functional"})
	public void enteringNoOfUnits() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String unit = xlsReader.getCellData("TestData", "Units", 2);
	CPOT.enteringNoOfUnits(unit);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Department already exisit. Please Contact Administrator");
	System.out.println("Validation msg  for selecting existing dept,desc & units only :"+ validationMsg);
	} 
	
	@Test(priority=52, groups={"Functional"})
	public void selectOtherDepartment() throws InterruptedException{
		CPOT.selectOtherDepartment();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter department description.");
		Reporter.log("Alert handled: Only Others department selected", true);
		}	
	
	@Test(priority=53, groups={"Functional"})
	public void enteringInvalidDeptDescription() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidDes = xlsReader.getCellData("TestData", "InvalidDescription", 2);
	CPOT.enteringInvalidDeptDescription(invalidDes);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter valid department description.");
	Reporter.log("Alert handled", true);
	} 
	
	@Test(priority=54, groups={"Functional"})
	public void enteringValidDeptDescription() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validDes = xlsReader.getCellData("TestData", "ValidDescription", 2);
	CPOT.enteringValidDeptDescription(validDes);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid number of units.");
	Reporter.log("Alert handled", true);
	} 
	
	@Test(priority=55, groups={"Functional"})
	public void enteringNoOfUnitsCrestingOtherDept() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String unit = xlsReader.getCellData("TestData", "Units", 2);
	CPOT.enteringNoOfUnitsCrestingOtherDept(unit);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please Enter Department Name");
	Reporter.log("Alert handled", true);
	}
	
	@Test(priority=56, groups={"Functional"})
	public void AddNewDepartment_DeptNameTxBoxIsDisplayed(){
	boolean flag = CPOT.AddNewDepartment_DeptNameTxBoxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Enter Department Name Textbox displayed");
	}else{
		System.out.println("Enter Department Name Textbox not displayed");
		}	
	}

	@Test(priority=57, groups={"Functional"})
	public void AddNewDepartment_DeptNameTxBoxIsEnabled(){
	boolean flag = CPOT.AddNewDepartment_DeptNameTxBoxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Enter Department Name Textbox enabled");
	}else{
		System.out.println("Enter Department Name Textbox not enabled");
		}	
	}
	
	@Test(priority=58, groups={"Functional"})
	public void enteringInvalidDeptName() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidDept = xlsReader.getCellData("TestData", "InvalidDeptName", 2);
	CPOT.enteringInvalidDeptName(invalidDept);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please Enter a valid Department Name");
	Reporter.log("Alert handled", true);
	} 
	
	@Test(priority=59, groups={"Functional"})
	public void enteringValidDeptName() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validDept = xlsReader.getCellData("TestData", "ValidDeptName", 2);
	CPOT.enteringValidDeptName(validDept);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgDeptAdded();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Department is inserted successfully.");
	System.out.println("Validation msg  for selecting existing dept,desc & units only :"+ validationMsg);
	Thread.sleep(3000);
	}

	@Test(priority=60, groups={"Functional","Smoke"})
	public void createDeptWithAllDetailsInOneGo() throws InterruptedException{
	Thread.sleep(9000);
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String validDeptName = xlsReader.getCellData("TestData", "ValidDeptName", 2);
		String validDesc = 	xlsReader.getCellData("TestData", "ValidDescription", 2);
		String unit = xlsReader.getCellData("TestData", "Units", 2);
		Thread.sleep(3000);
		CPOT.createDeptWithAllDetailsInOneGo(validDeptName, validDesc, unit);
		Thread.sleep(4000);
	}
	
	@Test(priority=61, groups={"Functional"},enabled=false)
	public void genderSpecificCheckboxIsDisplayed(){
	boolean flag = CPOT.genderSpecificCheckboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Gender Specific Checkbox IsDisplayed");
	}else{
		System.out.println("Gender Specific Checkbox not Displayed");
		}	
	}

	@Test(priority=62, groups={"Functional"},enabled=false)
	public void genderSpecificCheckboxIsSelected() throws InterruptedException{
	boolean flag = CPOT.genderSpecificCheckboxIsSelected();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Gender Specific Checkbox IsSelected");
	}else{
		System.out.println("Gender Specific Checkbox Not Selected");
		}	
	Thread.sleep(2000);
	CPOT.AddNewDepartment_AddDepartmentIsClickable();
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgDeptAdded();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Department is inserted successfully.");
	System.out.println("Validation msg  for selecting existing dept,desc & units only :"+ validationMsg);
	}


	@Test(priority=63, groups={"Functional"})
	public void addValidDuplicateDept() throws InterruptedException{
	Thread.sleep(4000);
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String validDesc = 	xlsReader.getCellData("TestData", "ValidDescription", 2);
		String unit = xlsReader.getCellData("TestData", "Units", 2);
		CPOT.addValidDuplicateDept(validDesc, unit);
		Thread.sleep(4000);
	WebElement updateMsg = CPOT.printValMsgDeptAdded();
	Thread.sleep(4000);
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Department already exisit. Please Contact Administrator");
	System.out.println("Validation msg  for selecting existing dept,desc & units only :"+ validationMsg);
	}
	
	@Test(priority=64, groups={"Functional"})
	public void manageDept_EditBtnIsDisplayed(){
	boolean flag = CPOT.manageDept_EditBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("ManageDept_EditBtnIsDisplayed displayed");
	}else{
		System.out.println("ManageDept_EditBtnIsDisplayed not displayed");
		}	
	}

	@Test(priority=65, groups={"Functional"})
	public void manageDept_EditBtnIsEnabled() throws InterruptedException{
	Thread.sleep(4000);
	boolean flag = CPOT.manageDept_EditBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(4000);
		CPOT.manageDept_EditBtnIsClkickable();
		Thread.sleep(3000);
		System.out.println("ManageDept_EditBtnIsClkickable Enabled & Clickable");
	}else{
		System.out.println("ManageDept_EditBtnIsClkickable Enabled nor Clickable");
		}	
	}

	@Test(priority=66, groups={"Functional"})
	public void editDeptAllFieldsBlankClickSaveBtn() throws InterruptedException{
	CPOT.editDeptAllFieldsBlankClickSaveBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter department description.");
	Reporter.log("Alert handled", true);
	} 
	

	
	@Test(priority=67, groups={"Functional"})
	public void enterInvalidDescriptonOnly() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidDescription = xlsReader.getCellData("TestData", "InvalidDescription", 2);
	CPOT.enterInvalidDescriptonOnly(invalidDescription);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter valid department description.");
	Reporter.log("Alert handled", true);
	}
	
	@Test(priority=68, groups={"Functional"})
	public void enterValidDescriptonOnly() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String ValidDescription = xlsReader.getCellData("TestData", "ValidDescription", 2);
	CPOT.enterInvalidDescriptonOnly(ValidDescription);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid number of units.");
	Reporter.log("Alert handled", true);
	}
	
	@Test(priority=69, groups={"Functional"})
	public void enterValidDescriptonAndUnitOnly() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String validDescription = 	xlsReader.getCellData("TestData", "ValidDescription", 2);
		String unit = xlsReader.getCellData("TestData", "Units", 2);
		CPOT.enterValidDescriptonAndUnitOnly(validDescription, unit);
	WebElement updateMsg = CPOT.printValMsgDeptUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Department is updated successfully.");
	System.out.println("Validation msg  for selecting existing dept,desc & units only :"+ validationMsg);
	Thread.sleep(2000);
	}
	
	
	@Test(priority=70, groups={"Functional","Smoke"})
	public void editDeptWithValidDataInOneGO() throws InterruptedException{
	Thread.sleep(3000);
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	Thread.sleep(3000);
		String validDesc = 	xlsReader.getCellData("TestData", "ValidDescription", 2);
		Thread.sleep(3000);
		String unit = xlsReader.getCellData("TestData", "Units", 2);
		Thread.sleep(3000);
		String age = xlsReader.getCellData("TestData", "Age", 2);
		Thread.sleep(2000);
		CPOT.editDeptWithValidDataInOneGO(validDesc, unit, age);
		Thread.sleep(4000);
	}
	
	@Test(priority=71, groups={"Functional"})
	public void medicalDeptChkboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.medicalDeptChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Medical Dept Checkbox IsDisplayed");
	}else{
		System.out.println("Medical Dept Checkbox Not Displayed");
		}	
	}
	
	@Test(priority=72, groups={"Functional"})
	public void ipdDeptChkboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.ipdDeptChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("IPD Dept Checkbox IsDisplayed");
	}else{
		System.out.println("IPD Dept Checkbox IsDisplayed");
		}	
	}
	
	@Test(priority=73, groups={"Functional"})
	public void labDeptChkboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.labDeptChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Lab Dept Checkbox IsDisplayed");
	}else{
		System.out.println("Lab Dept Checkbox not Displayed");
		}	
	}
	
	@Test(priority=74, groups={"Functional"})
	public void operationDeptChkboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.operationDeptChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Operation Dept Checkbox IsDisplayed");
	}else{
		System.out.println("Operation Dept Checkbox Not Displayed");
		}	
	}
	
	@Test(priority=75, groups={"Functional"})
	public void outsideInvesDeptChkboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.outsideInvesDeptChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Outside Investigation Dept Checkbox IsDisplayed");
	}else{
		System.out.println("Outside Investigation Dept Checkbox Not Displayed");
		}	
	}
	
	
	@Test(priority=76, groups={"Functional"})
	public void clinicalChkboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.clinicalChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Clinical Dept Checkbox IsDisplayed");
	}else{
		System.out.println("Clinical Dept Checkbox Not Displayed");
		}
	}
	
	
	@Test(priority=77, groups={"Functional","Smoke"})
	public void pediatericChkboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.pediatericChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
	System.out.println("Pediatric Dept Checkbox Is Displayed");}
	Thread.sleep(2000);
	CPOT.AddNewDepartment_AddDepartmentIsClickable();
	WebElement updateMsg = CPOT.printValMsgDeptUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Department is updated successfully.");
	System.out.println("Validation msg  for selecting existing dept,desc & units only:"+ validationMsg);
	Thread.sleep(5000);
	}	

	 





	
	@Test(priority=78, groups={"Functional"})
	public void manageUnitsLinkisDisplayed() throws InterruptedException{
	boolean flag = CPOT.manageUnitsLinkisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Units Link displayed");
	}else{
		System.out.println("Manage Units Link not displayed");
		}	
	}

	
	
	
	@Test(priority=79, groups={"Functional","Smoke"})
	public void manageUnitsLinkisEnabled() throws InterruptedException{
	Thread.sleep(5000);
	boolean flag = CPOT.manageUnitsLinkisEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		CPOT.manageUnitsLinkisClkickable();
		Thread.sleep(2000);
		
		List<WebElement>elements = driver.findElements(By.tagName("td"));
	    for(WebElement ob :elements ) {
	    	String od = ob.getText();
	 //   	System.out.println(od); 
	    	}
		System.out.println("Manage Units Link Enabled & Clickable");
	}
		}

	
	@Test(priority=80, groups={"Functional"})
	public void addNewUnitIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.addNewUnitIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Units_Add New Unit Link displayed");
	}else{
		System.out.println("Manage Units_Add New Unit Link not displayed");
		}	
	}

	@Test(priority=81, groups={"Functional"})
	public void addNewUnitIsEnabled() throws InterruptedException{
	Thread.sleep(4000);
	boolean flag = CPOT.addNewUnitIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		CPOT.addNewUnitIsDisplayedIsClickable();
		System.out.println("Manage Units_Add New Unit Link Enabled & Clickable");
	}else{
		System.out.println("Manage Units_Add New Unit Link neither Enabled nor Clickable");
		}	
	}
	
	@Test(priority=82, groups={"Functional"})
	public void addNewUnit_SaveBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.addNewUnit_SaveBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Unit Btn Isdisplayed");
	}else{
		System.out.println("Add Unit Btn not displayed");
		}	
	}

	@Test(priority=83, groups={"Functional"})
	public void addNewUnit_SaveBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.addNewUnit_SaveBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.addNewUnit_SaveBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please select a department.");
		Reporter.log("Alert handled", true);
		System.out.println("Add Unit Btn Enabled & Clickable");
	}else{
		System.out.println("Add Unit Btn neither Enabled nor Clickable");
		}	
	}

	@Test(priority=84, groups={"Functional"})
	public void addNewUnit_DeptNameDrpdwnIsDisplayed(){
	boolean flag = CPOT.addNewUnit_DeptNameDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage User Initials dropdown IsDisplayed");
	}else{
		System.out.println("Manage User Initials dropdown not Displayed");
		}	
	}

	@Test(priority=85, groups= {"Functional"})
	public void addNewUnit_DeptNameDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.addNewUnit_DeptNameDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Manage User Initials Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=86, groups= {"Functional"})
	public void selectDeptAndClickSaveBtn() throws InterruptedException{
	CPOT.selectDeptAndClickSaveBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a unit name.");
	Reporter.log("Alert handled:Only department selected and clicked save button", true);
	}
	
	@Test(priority=87, groups= {"Functional"})
	public void enterDeptInvalidUnitNameAndClickSaveBtn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidUnit = 	xlsReader.getCellData("TestData", "InvalidUnitName", 2);
	CPOT.enterDeptInvalidUnitNameAndClickSaveBtn(invalidUnit);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid unit name.");
	Reporter.log("Alert handled: Enter Department,Invalid Unit Name and clicked save button", true);
	}
	
	@Test(priority=88, groups= {"Functional"})
	public void enterDeptValidUnitNameAndClickSaveBtn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validUnit = 	xlsReader.getCellData("TestData", "ValidUnitName", 2);
	CPOT.enterDeptValidUnitNameAndClickSaveBtn(validUnit);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please select a unit in charge.");
	Reporter.log("Alert handled:Enter Department,Valid Unit Name and clicked save button", true);
	}
	
	@Test(priority=89, groups= {"Functional"})
	public void selectDeptUnitNameInChargeAndDay() throws InterruptedException{
	CPOT.selectDeptUnitNameInChargeAndDay();
	WebElement updateMsg = CPOT.printValMsgUnitAdded();
	Thread.sleep(2000);
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "The unit is inserted successfully.");
	System.out.println("Validation msg for adding Unit:"+ validationMsg);
	}

	@Test(priority=90, groups= {"Functional","Smoke"})
	public void addValidUnitInOneGo() throws InterruptedException{
	Thread.sleep(3000);
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validUnit = 	xlsReader.getCellData("TestData", "ValidUnitName", 2);
	Thread.sleep(2000);
	CPOT.addValidUnitInOneGo(validUnit);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgDeptUpdated();
	Thread.sleep(2000);
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "The unit is inserted successfully.");
	System.out.println("Validation msg  for selecting existing dept,desc & units only:"+ validationMsg);
	Thread.sleep(5000);
	}
	
	@Test(priority=91, groups={"Functional"})
	public void manageUnit_EditBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.manageUnit_EditBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Units_Edit Button IsDisplayed");
	}else{
		System.out.println("Manage Units_Edit Button not Displayed");
		}	
	}
	
	@Test(priority=92, groups={"Functional"})
	public void manageUnit_EditBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.manageUnit_EditBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		CPOT.manageUnit_EditBtnIsClickable();
		System.out.println("Manage Units_Edit Button is enabled & clickable");
	}else{
		System.out.println("Manage Units_Edit Button neither enabled nor clickable");
		}	
	}

	
	@Test(priority=93, groups={"Functional"})
	public void manageUnit_EditUnitBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.manageUnit_EditUnitBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Units_Edit Unit Button IsDisplayed");
	}else{
		System.out.println("Manage Units_Edit Unit Button not Displayed");
		}	
	}
	
	@Test(priority=94, groups={"Functional"})
	public void manageUnit_EditUnitBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.manageUnit_EditUnitBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		CPOT.manageUnit_EditUnitBtnIsClickable();
		WebElement updateMsg = CPOT.printValMsgDeptUpdated();
		String validationMsg = updateMsg.getText();
		Assert.assertEquals(validationMsg, "The unit is updated successfully.");
		System.out.println("Validation msg  for selecting existing dept,desc & units only:"+ validationMsg);
		Thread.sleep(3000);
		System.out.println("Manage Units_Edit Unit Button is enabled & clickable");
	}else{
		System.out.println("Manage Units_Edit Unit Button neither enabled nor clickable");
		}	
	}

	@Test(priority=95, groups= {"Functional"})
	public void editUnitEnterInvalidUnitName() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidUnit = xlsReader.getCellData("TestData", "InvalidUnitName", 2);
	CPOT.editUnitEnterInvalidUnitName(invalidUnit);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid unit name.");
	Reporter.log("Alert handled: Enter Department,Invalid Unit Name and clicked save button", true);
	}	

	@Test(priority=96, groups= {"Functional"})
	public void editUnitEnterValidUnitName() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validUnit = 	xlsReader.getCellData("TestData", "ValidUnitName", 2);
	CPOT.editUnitEnterValidUnitName(validUnit);
	WebElement updateMsg = CPOT.printValMsgDeptUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "The unit is updated successfully.");
	System.out.println("Validation msg  for selecting existing dept,desc & units only:"+ validationMsg);
	Thread.sleep(3000);
	System.out.println("Manage Units_Edit Unit Button is enabled & clickable");
	}	

	@Test(priority=97, groups= {"Functional","Smoke"})
	public void editValidUnitInOneGo() throws InterruptedException{
	Thread.sleep(3000);
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validUnit = 	xlsReader.getCellData("TestData", "ValidUnitName", 2);
	Thread.sleep(3000);
	CPOT.editValidUnitInOneGo(validUnit);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgDeptUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "The unit is updated successfully.");
	System.out.println("Validation msg  for selecting existing dept,desc & units only:"+ validationMsg);
	Thread.sleep(5000);
	}

	
	
	
	
	
	
	
	
	@Test(priority=98, groups={"Functional"})
	public void manageShiftsLinkIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.manageShiftsLinkIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Shifts link Displayed");
	}else{
		System.out.println("Manage Shifts link not Displayed");
		}	
	}

	@Test(priority=99, groups={"Functional","Smoke"})
	public void manageShiftsLinkIsEnabled() throws InterruptedException{
	boolean flag = CPOT.manageShiftsLinkIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(3000);
		CPOT.manageShiftsLinkIsClickable();
		Thread.sleep(3000);
		
		List<WebElement>elements = driver.findElements(By.tagName("tbody"));
	    for(WebElement ob :elements ) {
	    	String od = ob.getText();
	   // 	System.out.println(od); 
	    	}
	Reporter.log("Manage Shifts is Enabled & Clickable", true);
	}	
		}
	
	@Test(priority=100, groups={"Functional"})
	public void shiftNameTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.shiftNameTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Shifts Name TextBoxlink Displayed");
	}else{
		System.out.println("Shifts Name TextBox not Displayed");
		}	
	}

	@Test(priority=101, groups={"Functional"})
	public void shiftNameTxtboxIsEnabled() throws InterruptedException{
	boolean flag = CPOT.shiftNameTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Shift Name TextBoxlink enabled");
	}else{
		System.out.println("Shift Name TextBox not enabled");
		}	
	}

	@Test(priority=102, groups={"Functional"})
	public void shiftTmingsFromTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.shiftTmingsFromTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Shift Timings From TextBox Displayed");
	}else{
		System.out.println("Shift Name TextBox not Displayed");
		}	
	}

	@Test(priority=103, groups={"Functional"})
	public void shiftTmingsFromTxtboxIsEnabled() throws InterruptedException{
	boolean flag = CPOT.shiftTmingsFromTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Shift Timings From TextBox TextBox enabled");
	}else{
		System.out.println("Shift Timings From TextBox TextBox not enabled");
		}	
	}

	@Test(priority=104, groups={"Functional"})
	public void shiftTmingsToTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.shiftTmingsToTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Shift Timings To TextBox Displayed");
	}else{
		System.out.println("Shift Timings To TextBox not Displayed");
		}	
	}

	@Test(priority=105, groups={"Functional"})
	public void shiftTmingsToTxtboxIsEnabled() throws InterruptedException{
	boolean flag = CPOT.shiftTmingsToTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Shift Timings To TextBox TextBox enabled");
	}else{
		System.out.println("Shift Timings To TextBox TextBox not enabled");
		}	
	}

	@Test(priority=106, groups={"Functional"})
	public void selectShiftTypeDrpdwnIsDisplayed(){
	boolean flag = CPOT.selectShiftTypeDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Shifts Type dropdown displayed");
	}else{
		System.out.println("Select Shifts Type dropdown not displayed");
		}	
	}

	@Test(priority=107, groups={"Functional"})
	public void selectShiftTypeDrpdwnIsEnabled(){
	boolean flag = CPOT.selectShiftTypeDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Shifts Type dropdown enabled");
	}else{
		System.out.println("Select Shifts Type dropdown not enabled");
		}	
	}

	@Test(priority=108, groups= {"Functional"})
	public void selectShiftTypeDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.selectShiftTypeDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Manage User Initials Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=109, groups={"Functional"})
	public void shiftsSaveBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.shiftsSaveBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save Btn Displayed");
	}else{
		System.out.println("Save Btn not Displayed");
		}	
	}

	@Test(priority=110, groups={"Functional"})
	public void shiftsSaveBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.shiftsSaveBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.shiftsSaveBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a shift name.");
		Reporter.log("Alert handled:Save shifts btn enabled & clickable", true);
	}else{
		System.out.println("Save shifts btn neither enabled nor clickable");
		}	
	}	
	
	@Test(priority=111, groups={"Functional"})
	public void shiftsEditBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.shiftsEditBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Edit Btn Displayed");
	}else{
		System.out.println("Edit Btn not Displayed");
		}	
	}

	@Test(priority=112, groups={"Functional"})
	public void shiftsEditBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.shiftsEditBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.shiftsEditeBtnIsClickable();
		Thread.sleep(3000);
		System.out.println("Edit shifts btn enabled & clickable");
	}else{
		System.out.println("Edit shifts btn neither enabled nor clickable");
		}	
	}
		
	@Test(priority=113, groups={"Functional"})
	public void shiftsUpdateBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.shiftsUpdateBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update Btn Displayed");
	}else{
		System.out.println("Update Btn not Displayed");
		}	
	}

	@Test(priority=114, groups={"Functional"})
	public void shiftsUpdateBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.shiftsUpdateBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.shiftsUpdateBtnIsClickable();
		Thread.sleep(2000);
		WebElement updateMsg = CPOT.printValMsgShiftsUpdated();
		String validationMsg = updateMsg.getText();
		Assert.assertEquals(validationMsg, "Successfully Updated");
		System.out.println("Validation msg:"+ validationMsg);
		Thread.sleep(2000);
		Reporter.log("Edit shifts btn enabled & clickable", true);
	}else{
		System.out.println("Edit shifts btn neither enabled nor clickable");
		}	
	}
		
	@Test(priority=115, groups={"Functional"})
	public void manageShifts_AllFieldsBlank() throws InterruptedException{
	CPOT.manageShifts_AllFieldsBlank();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a shift name.");
		Reporter.log("Alert handled: No data entered in Add/Edit Shifts", true);
	}
		
	@Test(priority=116, groups={"Functional"})
	public void enterInvalidShiftNameOnly() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidShift = 	xlsReader.getCellData("TestData", "InvalidShift", 2);
	String invalidTimeFrom = 	xlsReader.getCellData("TestData", "InvalidShiftTimeFrom", 2);
	String invalidTimeTo = 	xlsReader.getCellData("TestData", "InvalidShiftTimeTo", 2);
	CPOT.enterInvalidShiftDetailsInAllFields(invalidShift, invalidTimeFrom, invalidTimeTo);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a valid shift name.");
		Reporter.log("Alert handled: Entering invalid Shift Name", true);
	}
			
	@Test(priority=117, groups={"Functional"})
	public void enterValidShiftNameInvalidTimingAndBlankShiftTypeDrpdwn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validShift = 	xlsReader.getCellData("TestData", "ValidShift", 2);
	CPOT.enterValidShiftNameInvalidTimingAndBlankShiftTypeDrpdwn(validShift);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please select a shift type.");
		Reporter.log("Alert handled: Entering invalid Shift Name", true);
	}		

	@Test(priority=118, groups={"Functional"})
	public void enterValidShiftNameInvalidTimingSelectShiftTypeDrpdwn() throws InterruptedException{
	CPOT.enterValidShiftNameInvalidTimingSelectShiftTypeDrpdwn();
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgShiftsUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Invalid Data Entered! Please Try Again.  ");
	System.out.println("Validation msg:"+ validationMsg);
	Thread.sleep(2000);
	Reporter.log("Invalid data entered in Shift Timings", true);
	}	
		
	@Test(priority=119, groups={"Functional"})
	public void validShiftNameAndFromTimeInvalidToTimeDrpdwnSelected() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validTimeFrom = xlsReader.getCellData("TestData", "ValidShiftTimeFrom", 2);
	CPOT.validShiftNameAndFromTimeInvalidToTimeDrpdwnSelected(validTimeFrom);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgShiftsUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Invalid Data Entered! Please Try Again.  ");
	System.out.println("Validation msg:"+ validationMsg);
	Thread.sleep(2000);
	Reporter.log("Invalid data entered in Shift Timings", true);
	}
	
	
	
	
		
	@Test(priority=120, groups={"Functional"})
	public void validShiftNameTimingShiftTypeSelectedClickSaveBtn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validTimeTo = xlsReader.getCellData("TestData", "ValidShiftTimeTo", 2);
	CPOT.validShiftNameTimingShiftTypeSelectedClickSaveBtn(validTimeTo);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgShiftsUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Successfully Added");
	System.out.println("Validation msg:"+ validationMsg);
	Thread.sleep(2000);
	Reporter.log("Invalid data entered in Shift Timings", true);
	}	
		
	@Test(priority=121, groups={"Functional","Smoke"})
	public void createShiftInOneGo() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validShift = xlsReader.getCellData("TestData", "ValidShift", 2);
	String validTimeFrom = xlsReader.getCellData("TestData", "ValidShiftTimeFrom", 2);
	String validTimeTo = xlsReader.getCellData("TestData", "ValidShiftTimeTo", 2);
	CPOT.createShiftInOneGo(validShift, validTimeFrom, validTimeTo);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgShiftsUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Successfully Added");
	System.out.println("Validation msg:"+ validationMsg);
	Thread.sleep(2000);
	Reporter.log("Invalid data entered in Shift Timings", true);
	}	
		
	
	
	
	
	
	@Test(priority=122, groups={"Functional"})
	public void editShifts_AllFieldsBlank() throws InterruptedException{
	CPOT.editShifts_AllFieldsBlank();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a shift name.");
		Reporter.log("Alert handled: No data entered in Add/Edit Shifts", true);
	}
		
	
	
	
	@Test(priority=123, groups={"Functional"})
	public void edit_EnterInvalidShiftDetailsInAllFields() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidShift = 	xlsReader.getCellData("TestData", "InvalidShift", 2);
	String invalidTimeFrom = 	xlsReader.getCellData("TestData", "InvalidShiftTimeFrom", 2);
	String invalidTimeTo = 	xlsReader.getCellData("TestData", "InvalidShiftTimeTo", 2);
	CPOT.edit_EnterInvalidShiftDetailsInAllFields(invalidShift, invalidTimeFrom, invalidTimeTo);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a valid shift name.");
		Reporter.log("Alert handled: Entering invalid Shift Name", true);
	}
			
	@Test(priority=124, groups={"Functional"})
	public void edit_EnterValidShiftNameInvalidTimingAndBlankShiftTypeDrpdwn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validShift = 	xlsReader.getCellData("TestData", "ValidShift", 2);
	CPOT.edit_EnterValidShiftNameInvalidTimingAndBlankShiftTypeDrpdwn(validShift);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please select a shift type.");
		Reporter.log("Alert handled: Entering invalid Shift Name", true);
	}		

	@Test(priority=125, groups={"Functional"})
	public void edit_EnterValidShiftNameInvalidTimingSelectShiftTypeDrpdwn() throws InterruptedException{
	CPOT.edit_EnterValidShiftNameInvalidTimingSelectShiftTypeDrpdwn();
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgShiftsUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Invalid Data Entered! Please Try Again.  ");
	System.out.println("Validation msg:"+ validationMsg);
	Thread.sleep(2000);
	Reporter.log("Invalid data entered in Shift Timings", true);
	}	
		
	@Test(priority=126, groups={"Functional"})
	public void edit_ValidShiftNameAndFromTimeInvalidToTimeDrpdwnSelected() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validTimeFrom = 	xlsReader.getCellData("TestData", "ValidShiftTimeTo", 2);
	String invalidTimeTo = 	xlsReader.getCellData("TestData", "InvalidShiftTimeTo", 2);
	CPOT.edit_ValidShiftNameAndFromTimeInvalidToTimeDrpdwnSelected(validTimeFrom, invalidTimeTo);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgShiftsUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Invalid Data Entered! Please Try Again.  ");
	System.out.println("Validation msg:"+ validationMsg);
	Thread.sleep(2000);
	Reporter.log("Invalid data entered in Shift Timings", true);
	}
		
	@Test(priority=127, groups={"Functional"})
	public void edit_ValidShiftNameTimingShiftTypeSelectedClickSaveBtn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validTimeTo = xlsReader.getCellData("TestData", "ValidShiftTimeTo", 2);
	CPOT.edit_ValidShiftNameTimingShiftTypeSelectedClickSaveBtn(validTimeTo);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgShiftsUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Successfully Updated");
	System.out.println("Validation msg:"+ validationMsg);
	Thread.sleep(2000);
	Reporter.log("All fields updated with valid data", true);
	}	
		
	@Test(priority=128, groups={"Functional","Smoke"})
	public void editShiftInOneGo() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validShift = xlsReader.getCellData("TestData", "ValidShift", 2);
	String validTimeFrom = xlsReader.getCellData("TestData", "ValidShiftTimeFrom", 2);
	String validTimeTo = xlsReader.getCellData("TestData", "ValidShiftTimeTo", 2);
	CPOT.editShiftInOneGo(validShift, validTimeFrom, validTimeTo);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.printValMsgShiftsUpdated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Successfully Updated");
	System.out.println("Validation msg:"+ validationMsg);
	Thread.sleep(2000);
	Reporter.log("Shifts details updated", true);
	}	
	
			
	
	@Test(priority=129, groups={"Functional"})
	public void manageClinicLinkIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.manageClinicLinkIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Clinics link Displayed");
	}else{
		System.out.println("Manage Clinics link not Displayed");
		}	
	}
	
	
	
	
	
	

	@Test(priority=130, groups={"Functional","Smoke"})
	public void manageClinicLinkIsEnabled() throws InterruptedException{
	boolean flag = CPOT.manageClinicLinkIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(3000);
		CPOT.manageClinicLinkIsClickable();
		Thread.sleep(3000);
		
		List<WebElement>elements = driver.findElements(By.tagName("tbody"));
	    for(WebElement ob :elements ) {
	    	String od = ob.getText();
	    //	System.out.println(od); 
	    	}
	Reporter.log("Manage Clinics is Enabled & Clickable", true);
	}
		}		
	
	
	@Test(priority=131, groups={"Functional"})
	public void clinicNameTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.clinicNameTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Clinic Name Textbox Displayed");
	}else{
		System.out.println("Clinic Name Textbox not Displayed");
		}	
	}

	@Test(priority=132, groups={"Functional"})
	public void clinicNameTxtboxIsEnabled() throws InterruptedException{
	boolean flag = CPOT.clinicNameTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
	Reporter.log("Clinic Name Textbox Enabled & Clickable", true);
	}else{
		System.out.println("Clinic Name Textbox neither Enabled nor Clickable");
		}	
	}		
		
	@Test(priority=133, groups={"Functional"})
	public void clinicTypeDrpdwnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.clinicTypeDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Clinic Type dropdown  Displayed");
	}else{
		System.out.println("Clinic Type dropdown not Displayed");
		}	
	}

	@Test(priority=134, groups={"Functional"})
	public void clinicTypeDrpdwnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.clinicTypeDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
	Reporter.log("Clinic Type dropdown Enabled", true);
	}else{
		System.out.println("Clinic Type dropdown not Enabled");
		}	
	}		
		
	@Test(priority=135, groups= {"Functional"})
	public void clinicTypeDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.clinicTypeDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Clinic Type dropdown doesn't allow to select Multiple Values");
	}
		}		
	
	@Test(priority=136, groups={"Functional"})
	public void saveClinicBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.saveClinicBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save Clinic Btn Displayed");
	}else{
		System.out.println("Save Clinic Btn not Displayed");
		}	
	}

	@Test(priority=137, groups={"Functional"})
	public void saveClinicBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.saveClinicBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.saveClinicBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Clinic Name field is mandatory.");
		Reporter.log("Save Clinic Btn Enabled & Clickable & alert handled", true);
	}else{
		System.out.println("Save Clinic Btn neither Enabled nor Clickable");
		}	
	}	
	
	@Test(priority=138, groups={"Functional"})
	public void editClinicBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.editClinicBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Edit Clinic Btn Displayed");
	}else{
		System.out.println("Edit Clinic Btn not Displayed");
		}	
	}

	@Test(priority=139, groups={"Functional"})
	public void editClinicBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.editClinicBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.editClinicBtnIsClickable();
		Thread.sleep(2000);
	Reporter.log("Edit Clinic Btn Enabled & Clickable", true);
	}else{
		System.out.println("Edit Clinic Btn neither Enabled nor Clickable");
		}	
	}		
	
	
	
	@Test(priority=140, groups={"Functional"})
	public void updateClinicBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.updateClinicBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update Clinic Btn Displayed");
	}else{
		System.out.println("Update Clinic Btn not Displayed");
		}	
	}

	@Test(priority=141, groups={"Functional"})
	public void updateClinicBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.updateClinicBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.updateClinicBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Clinic With Same Name Already Exists.Continue Anyway?");
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		String alertmsg1 = alert.getText();
		System.out.println(alertmsg1);
		Thread.sleep(2000);
		alert1.accept();
		Assert.assertEquals(alertmsg1, "Updated Successfully");
		Thread.sleep(2000);
	Reporter.log("Update Clinic Btn Enabled & Clickable also clinic updated successfully", true);
	}else{
		System.out.println("Update Clinic Btn neither Enabled nor Clickable");
		}	
	}		
	
	
	
	@Test(priority=142, groups={"Functional"})
	public void blankClinicNameTypeSelected() throws InterruptedException{
	CPOT.blankClinicNameTypeSelected();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Clinic Name field is mandatory.");
	}	
	
	@Test(priority=143, groups={"Functional"})
	public void enterInvalidClinicNameBlankDropdown() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidClinic = xlsReader.getCellData("TestData", "InvalidClinicName", 2);
	CPOT.enterInvalidClinicNameBlankDropdown(invalidClinic);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid clinic name.");
	}	
	
	@Test(priority=144, groups={"Functional"})
	public void enterValidClinicNameBlankDropdown() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validClinic = xlsReader.getCellData("TestData", "ValidClinicName", 2);
	CPOT.enterValidClinicNameBlankDropdown(validClinic);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Clinic Type field is mandatory.");
	}
	
	@Test(priority=145, groups={"Functional"})
	public void enterValidClinicNameAndDropdown() throws InterruptedException{
	CPOT.enterValidClinicNameAndDropdown();
	Thread.sleep(2000);
	Alert alert1 = driver.switchTo().alert();
	String alertmsg1 = alert1.getText();
	System.out.println(alertmsg1);
	Thread.sleep(2000);
	alert1.accept();
	Assert.assertEquals(alertmsg1, "Clinic With Same Name Already Exists.Continue Anyway?");
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Saved Successfully");
	Thread.sleep(2000);
	}
	
	@Test(priority=146, groups={"Functional","Smoke"})
	public void addClinicInOneGo() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validClinic = xlsReader.getCellData("TestData", "ValidClinicName", 2);
	Thread.sleep(3000);
	CPOT.addClinicInOneGo(validClinic);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Clinic With Same Name Already Exists.Continue Anyway?");
	Thread.sleep(2000);
	Alert alert1 = driver.switchTo().alert();
	String alertmsg1 = alert1.getText();
	System.out.println(alertmsg1);
	Thread.sleep(2000);
	alert1.accept();
	Assert.assertEquals(alertmsg1, "Saved Successfully");
	}
	
	
	@Test(priority=147, groups={"Functional"})
	public void edit_AllFieldsBlankClickingUpdateBtn() throws InterruptedException{
	CPOT.edit_AllFieldsBlankClickingUpdateBtn();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Clinic Name field is mandatory.");
	}	
	
	@Test(priority=148, groups={"Functional"})
	public void edit_blankClinicNameTypeSelected() throws InterruptedException{
	CPOT.edit_blankClinicNameTypeSelected();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Clinic Name field is mandatory.");
	}	
	
	@Test(priority=149, groups={"Functional"})
	public void edit_enterInvalidClinicNameBlankDropdown() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidClinic = xlsReader.getCellData("TestData", "InvalidClinicName", 2);
	CPOT.edit_enterInvalidClinicNameBlankDropdown(invalidClinic);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid clinic name.");
	}	
	
	@Test(priority=150, groups={"Functional"})
	public void edit_enterValidClinicNameBlankDropdown() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validClinic = xlsReader.getCellData("TestData", "ValidClinicName", 2);
	CPOT.edit_enterValidClinicNameBlankDropdown(validClinic);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Clinic Type field is mandatory.");
	}
	
	@Test(priority=151, groups={"Functional"})
	public void edit_enterValidClinicNameAndDropdown() throws InterruptedException{
	CPOT.edit_enterValidClinicNameAndDropdown();
	Thread.sleep(2000);
	Alert alert1 = driver.switchTo().alert();
	String alertmsg1 = alert1.getText();
	System.out.println(alertmsg1);
	Thread.sleep(2000);
	alert1.accept();
	Assert.assertEquals(alertmsg1, "Clinic With Same Name Already Exists.Continue Anyway?");
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Updated Successfully");
	Thread.sleep(2000);
	}
	
	@Test(priority=152, groups={"Functional","Smoke"})
	public void edit_ClinicInOneGo() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validClinic = xlsReader.getCellData("TestData", "ValidClinicName", 2);
	Thread.sleep(3000);
	CPOT.edit_ClinicInOneGo(validClinic);
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Clinic With Same Name Already Exists.Continue Anyway?");
	Thread.sleep(2000);
	Alert alert1 = driver.switchTo().alert();
	String alertmsg1 = alert1.getText();
	System.out.println(alertmsg1);
	Thread.sleep(2000);
	alert1.accept();
	Assert.assertEquals(alertmsg1, "Updated Successfully");
	}
	
	
	

	@Test(priority=153, groups={"Functional"})
	public void manageWardsIsDisplayed(){
	boolean flag = CPOT.manageWardsIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Wards link Displayed");
	}else{
		System.out.println("Manage Wards link not Displayed");
		}	
	}
	
	
	
	
	
	
	
	@Test(priority=154, groups={"Functional","Smoke"})
	public void manageWardsIsEnabled() throws InterruptedException{
	Thread.sleep(2000);
	boolean flag = CPOT.manageWardsIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		CPOT.manageWardsIsClickable();
		Thread.sleep(2000);
		CPOT.add_EditWardLinkIsDisplayed();
		CPOT.add_EditWardLinkIsEnabled();
		CPOT.add_EditWardLinkIsClickable();
		
		List<WebElement>elements = driver.findElements(By.tagName("table"));
	    for(WebElement ob :elements ) {
	    	String od = ob.getText();
	   // 	System.out.println(od);
	    	}
	    
	System.out.println("Manage Wards with Add/Edit Wards link Displayed,Enabled & Clickable");
	}
		}
	
	
	
	
	
	@Test(priority=155, groups={"Functional"})
	public void saveWardBtnIsDisplayed(){
	boolean flag = CPOT.saveWardBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save Wards Button Displayed");
	}else{
		System.out.println("Save Wards Button not Displayed");
		}	
	}
	
	@Test(priority=156, groups={"Functional"})
	public void saveWardBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.saveWardBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.saveWardBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a ward name.");
	System.out.println("Save Wards Button Enabled & Clickable");
	}else{
		System.out.println("Save Wards Button neither Enabled nor Clickable");
		}	
	}
	
	@Test(priority=157, groups={"Functional"})
	public void wardNameTxtboxIsDisplayed(){
	boolean flag = CPOT.wardNameTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Name Txtbox Displayed");
	}else{
		System.out.println("Ward Name Txtbox not Displayed");
		}	
	}
	
	@Test(priority=158, groups={"Functional"})
	public void wardNameTxtboxIsEnabled(){
	boolean flag = CPOT.wardNameTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Name Txtbox Enabled");
	}else{
		System.out.println("Ward Name Txtbox not Enabled");
		}	
	}
	
	@Test(priority=159, groups={"Functional"})
	public void selectGenderDrpdwnIsDisplayed(){
	boolean flag = CPOT.selectGenderDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Gender dropdown displayed");
	}else{
		System.out.println("Select Gender dropdown not displayed");
		}	
	}

	@Test(priority=160, groups={"Functional"})
	public void selectGenderDrpdwnIsEnabled(){
	boolean flag = CPOT.selectGenderDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Gender dropdown enabled");
	}else{
		System.out.println("Select Gender dropdown not enabled");
		}	
	}

	@Test(priority=161, groups= {"Functional"})
	public void selectGenderDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.selectGenderDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Gender Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=162, groups={"Functional"})
	public void casualtyWardRadioBtnYesIsDisplayed(){
	boolean flag = CPOT.casualtyWardRadioBtnYesIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Casualty Ward Radio Btn Yes is displayed");
	}else{
		System.out.println("Casualty Ward Radio Btn Yes not displayed");
		}	
	}
	
	@Test(priority=163, groups={"Functional"})
	public void casualtyWardRadioBtnNoIsDisplayed(){
	boolean flag = CPOT.casualtyWardRadioBtnNoIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Casualty Ward Radio Btn No is displayed");
	}else{
		System.out.println("Casualty Ward Radio Btn No not displayed");
		}	
	}
	
	
	@Test(priority=164, groups={"Functional"})
	public void bedAllocationMandatoryRadioBtnYesIsDisplayed(){
	boolean flag = CPOT.bedAllocationMandatoryRadioBtnYesIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Bed Alioction Mandatory Radio Btn Yes is displayed");
	}else{
		System.out.println("Bed Alioction Mandatory Radio Btn Yes not displayed");
		}	
	}
	
	@Test(priority=165, groups={"Functional"})
	public void bedAllocationMandatoryRadioBtnNoIsDisplayed(){
	boolean flag = CPOT.bedAllocationMandatoryRadioBtnNoIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Bed Alioction Mandatory Radio Btn No is displayed");
	}else{
		System.out.println("Bed Alioction Mandatory Radio Btn No not displayed");
		}	
	}
	
	
	
	@Test(priority=166, groups={"Functional"})
	public void totalNoOfBedsTxtboxIsDisplayed(){
	boolean flag = CPOT.totalNoOfBedsTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Total no Of Beds Txtbox displayed");
	}else{
		System.out.println("Total no Of Beds Txtbox not displayed");
		}	
	}

	@Test(priority=167, groups={"Functional"})
	public void totalNoOfBedsTxtboxIsEnabled(){
	boolean flag = CPOT.totalNoOfBedsTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Total no Of Beds Txtbox enabled");
	}else{
		System.out.println("Total no Of Beds Txtbox not enabled");
		}	
	}

	
	
	
	@Test(priority=168, groups={"Functional"})
	public void enterWardNameAndClickSaveBtn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidWard = xlsReader.getCellData("TestData", "InvalidWardName", 2);
	CPOT.enterWardNameAndClickSaveBtn(invalidWard);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please select gender.");
	System.out.println("Alert handled for entering Invalid Ward Name");
	}
	
	@Test(priority=169, groups={"Functional"})
	public void enterWardNameAndGenderClickSaveBtn() throws InterruptedException{
	CPOT.enterWardNameAndGenderClickSaveBtn();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please mention if it is casualty department or not");
	System.out.println("Alert handled for entering Ward & Selecting Gender only");
	}
	
	@Test(priority=170, groups={"Functional"})
	public void selectIsCasualtyRadioBtn() throws InterruptedException{
	CPOT.selectIsCasualtyRadioBtn();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please mention if bed is mandatory or not");
	System.out.println("Alert handled for entering  Ward, Selecting Gender and clicking casualty btn as no");
	}
	
	@Test(priority=171, groups={"Functional"})
	public void notACasualtyWardCheckboxIsSelected() throws InterruptedException{
	boolean flag = CPOT.notACasualtyWardCheckboxIsSelected();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Not a casualty ward Checkbox IsSelected");
	}else{
		System.out.println("Not a casualty ward Checkbox Not Selected");
		}	
	}
	
	@Test(priority=172, groups={"Functional"})
	public void selectBedAllocationMandatoryYes() throws InterruptedException{
	CPOT.selectBedAllocationMandatoryYes();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid number of bed field(not less than 1).");
	System.out.println("Alert handled for entering  Ward, Selecting Gender and clicking casualty btn as no");
	}
	
	@Test(priority=173, groups={"Functional"})
	public void bedAllocationmandatoryYesCheckboxIsSelected() throws InterruptedException{
	boolean flag = CPOT.bedAllocationmandatoryYesCheckboxIsSelected();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Bed Allocation Mandatory Yes Checkbox IsSelected");
	}else{
		System.out.println("Bed Allocation Mandatory Yes Checkbox Not Selected");
		}	
	}
	
	
	@Test(priority=174, groups={"Functional"})
	public void enterInvalidNoOfBed() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidBed = xlsReader.getCellData("TestData", "InvalidBed", 2);
	Thread.sleep(2000);
	CPOT.enterInvalidNoOfBed(invalidBed);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid number of bed field(not less than 1).");
	System.out.println("Alert handled for entering  Ward, Selecting Gender and clicking casualty btn as no");
	}
	
	@Test(priority=175, groups={"Functional"})
	public void enterValidNoOfBed() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validBed = xlsReader.getCellData("Sheet2", "ValidBed", 2);
	Thread.sleep(2000);
	CPOT.enterValidNoOfBed(validBed);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.wardAdded_printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "The ward is inserted successfully.");
	System.out.println("Validation msg:"+ validationMsg);
	}
	
	
	
	@Test(priority=176, groups={"Functional"})
	public void wardAbbreviationTxtboxIsDisplayed(){
	boolean flag = CPOT.wardAbbreviationTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Abbreviation Txtbox is Displayed");
	}else{
		System.out.println("Ward Abbreviation Txtbox is Displayed");
		}	
	}

	@Test(priority=177, groups={"Functional"})
	public void wardAbbreviationTxtboxIsEnabled(){
	boolean flag = CPOT.wardAbbreviationTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Abbreviation Txtbox is enabled");
	}	
		}

	@Test(priority=178, groups={"Functional","Smoke"})
	public void addWardInOneGo() throws InterruptedException{
	Thread.sleep(2000);
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validWard = xlsReader.getCellData("TestData", "ValidWardName", 2);
	String validAbb = xlsReader.getCellData("Sheet2", "ValidWardAbb", 2);
	String validBed = xlsReader.getCellData("Sheet2", "ValidBed", 2);
	Thread.sleep(10000);
	CPOT.addWardInOneGo(validWard, validAbb, validBed);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.wardAdded_printValidationMsg();
	Thread.sleep(2000);
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "The ward is inserted successfully.");
	System.out.println("Validation msg:"+ validationMsg);
	}
	
	
		
	

	@Test(priority=179, groups={"Functional"})
	public void editWardBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.editWardBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		System.out.println("Edit ward btn is displayed");
	}else{
		System.out.println("Edit ward btn not displayed");
		}	
	}

	
	
	@Test(priority=180, groups={"Functional","Smoke"})
	public void editWardBtnIsEnabled() throws InterruptedException{
		Thread.sleep(2000);
	boolean flag = CPOT.editWardBtnIsEnabled();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		CPOT.editWardBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("Edit ward btn is enabled & clickable");
	}
		}
	
	
	
	
	@Test(priority=181, groups={"Functional"})
	public void updateWardBtnIsDisplayed(){
	boolean flag = CPOT.updateWardBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update ward btn is displayed");
	}else{
		System.out.println("Update ward btn not displayed");
		}	
	}

	@Test(priority=182, groups={"Functional"})
	public void updateWardBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.updateWardBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.updateWardBtnIsClickable();
		Thread.sleep(2000);
		WebElement updateMsg = CPOT.wardAdded_printValidationMsg();
		String validationMsg = updateMsg.getText();
		Assert.assertEquals(validationMsg, "Ward Edited Sucessfully");
		System.out.println("Validation msg:"+ validationMsg);
	}else{
		System.out.println("Update ward btn not neither enabled nor clickable");
		}	
	}
	
	
	
	
	@Test(priority=183, groups={"Functional"})
	public void editWard_AllFIeldsBlank() throws InterruptedException{
	CPOT.editWard_AllFIeldsBlank();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a ward name.");
	System.out.println("Alert handled for not entering any detail");
	}
	
	@Test(priority=184, groups={"Functional"})
	public void editWard_EnterInvalidWardNameOnly() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidWard = xlsReader.getCellData("TestData", "InvalidWardName", 2);
	CPOT.editWard_EnterInvalidWardNameOnly(invalidWard);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please select gender.");
	System.out.println("Alert handled for entering Invalid Ward Name");
	}	
	
	@Test(priority=185, groups={"Functional"})
	public void enterWardNameAndGenderClickUpdateBtn() throws InterruptedException{
	CPOT.enterWardNameAndGenderClickUpdateBtn();
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.wardEdited_printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Ward Edited Sucessfully");
	System.out.println("Validation msg:"+ validationMsg);
	}
	
	@Test(priority=186, groups={"Functional"})
	public void casualtyWardNoRadioBtnIsSelected() throws InterruptedException{
	boolean flag = CPOT.casualtyWardNoRadioBtnIsSelected();
	Thread.sleep(2000);
	if(flag==true){
		System.out.println("Not a casualty ward Checkbox IsSelected");
	}else{
		System.out.println("Not a casualty ward Checkbox Not Selected");
		}
	}
	
	@Test(priority=187, groups={"Functional"})
	public void bedAllocationMandatoryNoRadioBtnIsSelected() throws InterruptedException{
	boolean flag = CPOT.bedAllocationMandatoryNoRadioBtnIsSelected();
	Thread.sleep(2000);
	Thread.sleep(2000);
	if(flag==true){
		System.out.println("Not a casualty ward Checkbox IsSelected");
	}else{
		System.out.println("Not a casualty ward Checkbox Not Selected");
		}
	}
	
	@Test(priority=188, groups={"Functional"})
	public void enterInvalidWardAbbreviation() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidWardAbb = xlsReader.getCellData("TestData", "InvalidWardAbbre", 2);
	CPOT.enterInvalidWardAbbreviation(invalidWardAbb);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid ward abbreviation.");
	System.out.println("Alert handled for entering Invalid Ward Name");
	}	
	
	@Test(priority=189, groups={"Functional"})
	public void enterValidWardAbbreviation() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validWardAbb = xlsReader.getCellData("TestData", "ValidWardAbbre", 2);
	Thread.sleep(2000);
	CPOT.enterValidWardAbbreviation(validWardAbb);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.wardEdited_printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Ward Edited Sucessfully");
	System.out.println("Validation msg:"+ validationMsg);
	}
	
	
	
	@Test(priority=190, groups={"Functional","Smoke"})
	public void editWardInOneGo() throws InterruptedException{
	Thread.sleep(2000);
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validWard = xlsReader.getCellData("TestData", "ValidWardName", 2);
	String validAbb = xlsReader.getCellData("TestData", "ValidWardAbbre", 2);
	String validBed = xlsReader.getCellData("TestData", "ValidBed", 2);
	Thread.sleep(2000);
	CPOT.editWardInOneGo(validWard, validAbb, validBed);
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.wardEdited_printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Ward Edited Sucessfully");
	System.out.println("Validation msg:"+ validationMsg);
	}
	
	
	
	@Test(priority=191, groups={"Functional"})
	public void showBedListBtnIsDisplayed(){
	boolean flag = CPOT.showBedListBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Show bed list Btn is displayed");
	}else{
		System.out.println("Show bed list Btn is not displayed");
		}	
	}

	@Test(priority=192, groups={"Functional","Smoke"})
	public void showBedListBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.showBedListBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.showBedListBtnIsClickable();
		System.out.println("Show bed list Btn is enabled & clickable");
	}else{
		System.out.println("Show bed list Btn neither enabled nor clickable");
		}	
	}
	
	@Test(priority=193, groups={"Functional"})
	public void closeBedListBtnIsDisplayed(){
	boolean flag = CPOT.closeBedListBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Show bed list Btn is displayed");
	}else{
		System.out.println("Show bed list Btn is not displayed");
		}	
	}

	@Test(priority=194, groups={"Functional","Smoke"})
	public void closeBedListBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.closeBedListBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.closeBedListBtnIsClickable();
		System.out.println("Close bed list Btn is enabled & clickable");
	}else{
		System.out.println("Close bed list Btn neither enabled nor clickable");
		}	
	}
	
	
	
	
	
	@Test(priority=195, groups={"Functional"})
	public void addBedBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.addBedBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Bed Radio Btn is displayed");
	}else{
		System.out.println("Add Bed Radio Btn is not displayed");
		Thread.sleep(2000);
		}	
	}

	@Test(priority=196, groups={"Functional","Smoke"})
	public void addBedBtnIsEnabled() throws InterruptedException{
	Thread.sleep(2000);
	boolean flag = CPOT.addBedBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		CPOT.addBedBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("Add Bed Radio Btn is enabled & clickable");
	}else{
		System.out.println("Add Bed Radio Btn neither enabled nor clickable");
		}	
	}
	
	@Test(priority=197, groups={"Functional"})
	public void bedsToBeAddedTxtboxIsDisplayed(){
	boolean flag = CPOT.bedsToBeAddedTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Number of beds to be added textbox is displayed");
	}else{
		System.out.println("Number of beds to be added textbox is not displayed");
		}	
	}

	@Test(priority=198, groups={"Functional"})
	public void bedsToBeAddedTxtboxIsEnabled() throws InterruptedException{
	boolean flag = CPOT.bedsToBeAddedTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Number of beds to be added textbox is enabled");
	}else{
		System.out.println("Number of beds to be added textbox not enabled");
		}	
	}
	
	@Test(priority=199, groups={"Functional"})
	public void saveBtnForBedIsDisplayed(){
	boolean flag = CPOT.saveBtnForBedIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save added beds btn is displayed");
	}else{
		System.out.println("Save added beds btn is not displayed");
		}	
	}
	
	@Test(priority=200, groups={"Functional"})
	public void saveBtnForBedIsEnabled() throws InterruptedException{
	boolean flag = CPOT.saveBtnForBedIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.saveBtnForBedIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a valid number of bed field(not less than 1).");
		System.out.println("Alert handled:Save added beds btn is enabled & clickable");
	}else{
		System.out.println("Save added beds btn neither enabled nor clickable");
		}	
	}


	@Test(priority=201, groups={"Functional"})
	public void totalNoOfBedsAvailableTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.totalNoOfBedsAvailableTxtboxIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		System.out.println("Total Number Of Beds Availaible in the list textbox is displayed");
	}
		}
	

	@Test(priority=202, groups={"Functional","Smoke"})
	public void fetchesTotallNoOfBedsThenAdd1Bed() throws InterruptedException{
	Thread.sleep(2000);
	String oldBeds = CPOT.fetchesTotallNoOfBedsAvailableInTheTxtbox();
	Thread.sleep(2000);
	System.out.println("Already available number of beds are :"+oldBeds);
	Thread.sleep(2000);
	CPOT.adds1BedToBedList();
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.oneBedAdded_printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Bed Successfully Added.");
	System.out.println("Validation msg is:"+ validationMsg);
	Thread.sleep(2000);
	String updatedBeds = CPOT.fetchesTotallNoOfBedsAvailableInTheTxtbox();
	System.out.println("Updated number of beds shown in list are :"+updatedBeds);
	
	Assert.assertNotEquals(oldBeds, updatedBeds);
	/*
	SoftAssert sa = new SoftAssert();
	sa.assertNotEquals(oldBeds, updatedBeds);
	*/
	if(oldBeds != updatedBeds){
		System.out.println("One Bed Added_Bed List Updated");
	}
	}
	
	@Test(priority=203, groups={"Functional"})
	public void removeBedBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.removeBedBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		System.out.println("Remove bed radio Btn is displayed");
	}
	}
	
	
	@Test(priority=204, groups={"Functional","Smoke"})
	public void removeBedBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.removeBedBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		CPOT.removeBedBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("Remove bed radio Btn is enabled & clickable");
	}else{
		System.out.println("Remove bed radio Btn neither enabled nor clickable");
		}	
	}
	
	@Test(priority=205, groups={"Functional"})
	public void clickingSaveBtnWithoutRemovingBed() throws InterruptedException{
	Thread.sleep(2000);
	CPOT.clickingSaveBtnWithoutRemovingBed();
	}
	
	
	
	
	@Test(priority=206, groups={"Functional"})
	public void removeBedChkboxIsDisplayed(){
	boolean flag = CPOT.removeBedChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Remove bed chechkbox is displayed");
	}else{
		System.out.println("Remove bed radio Btn not displayed");
		}	
	}
	
	@Test(priority=207, groups={"Functional"})
	public void removeBedChkboxIsEnabled() throws InterruptedException{
	boolean flag = CPOT.removeBedChkboxIsEnabled();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		System.out.println("Remove bed chechkbox is enabled");
	}else{
		System.out.println("Remove bed chechkbox not enabled");
		}	
	}
	
	@Test(priority=208, groups={"Functional","Smoke"})
	public void removeOneBedFromTable() throws InterruptedException{
	Thread.sleep(2000);	
	String oldBeds = CPOT.fetchesTotallNoOfBedsAvailableInTheTxtbox();
	Thread.sleep(2000);
	System.out.println("Already available number of beds are :"+oldBeds);
	Thread.sleep(2000);
	
	CPOT.removeOneBedFromTable();
	Thread.sleep(2000);
	WebElement updateMsg = CPOT.oneBedRemoved_printValidationMsg();
	Thread.sleep(2000);
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Bed Successfully Removed.");
	System.out.println("Validation msg is:"+ validationMsg);
	Thread.sleep(2000);
	
	String updatedBeds = CPOT.fetchesTotallNoOfBedsAvailableInTheTxtbox();
	Thread.sleep(2000);
	System.out.println("Updated number of beds shown in list are :"+updatedBeds);
	
	Assert.assertNotEquals(oldBeds, updatedBeds);
	/*SoftAssert sa = new SoftAssert();
	sa.assertNotEquals(oldBeds, updatedBeds);*/
	
	if(oldBeds != updatedBeds){
		System.out.println("One Bed Removed_Bed List Updated");
	}
	}
	
	
	
	
	
	
	
	

	
	
	
	@Test(priority=209, groups={"Functional"})
	public void changeBedNoRadioBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.changeBedNoRadioBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		System.out.println("Change bed number radio btn is displayed");
	}else{
		System.out.println("Change bed number radio btn not displayed");
		}	
	}
	
	
	
	
	
	
	@Test(priority=210, groups={"Functional","Smoke"})
	public void changeBedNoRadioBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.changeBedNoRadioBtnIsEnabled();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		CPOT.changeBedNoRadioBtnIsClickable();
		Thread.sleep(2000);
	System.out.println("Change bed number radio btn is enabled & clickable");
	}
		}
	
	
	
	

	@Test(priority=211, groups={"Functional"})
	public void selectOldBedNoToChngDrpdwnIsDisplayed(){
	boolean flag = CPOT.selectOldBedNoToChngDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Old Bed No dropdown Is Displayed");
	}else{
		System.out.println("Select Old Bed No dropdown not Displayeds");
		}	
	}

	@Test(priority=212, groups={"Functional"})
	public void selectOldBedNoToChngDrpdwnIsEnabled(){
	boolean flag = CPOT.selectOldBedNoToChngDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Old Bed No dropdown Is Enabled");
	}else{
		System.out.println("Select Old Bed No dropdown not Enabled");
		}	
	}
	
	@Test(priority=213, groups= {"Functional"})
	public void selectOldBedNoToChngDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.selectOldBedNoToChngDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Old Bed No Dropdown doesn't allow to select Multiple Values");
	}
		}	
	
	@Test(priority=214, groups={"Functional"})
	public void prefixTxtboxIsDisplayed(){
	boolean flag = CPOT.prefixTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Prefix textbox is displayed");
	}else{
		System.out.println("Prefix textbox is not displayed");
		}	
	}

	@Test(priority=215, groups={"Functional"})
	public void prefixTxtboxIsEnabled() throws InterruptedException{
	boolean flag = CPOT.prefixTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Prefix textbox is enabled");
	}else{
		System.out.println("Prefix textbox not enabled");
		}	
	}
		
	@Test(priority=216, groups={"Functional"})
	public void bedNoTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.bedNoTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Bed No textbox is enabled");
	}else{
		System.out.println("Bed No textbox not enabled");
		}	
	}
	
	@Test(priority=217, groups={"Functional"})
	public void bedNoTxtboxIsEnabled(){
	boolean flag = CPOT.bedNoTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Bed No textbox is displayed");
	}else{
		System.out.println("Bed No textbox is not displayed");
		}	
	}

	@Test(priority=218, groups={"Functional"})
	public void postfixTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.postfixTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Postfix textbox is displayed");
	}else{
		System.out.println("Postfix textbox not displayed");
		}	
	}
	
	
	@Test(priority=219, groups={"Functional"})
	public void postfixTxtboxIsEnabled() throws InterruptedException{
	boolean flag = CPOT.postfixTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Postfix textbox is enabled");
	}else{
		System.out.println("Postfix textbox not enabled");
		}	
	}
		
	@Test(priority=220, groups={"Functional"},enabled=false)
	public void clickingSaveBtnWithoutPrePostfix() throws InterruptedException{
	CPOT.clickingSaveBtnWithoutPrePostfix();
	}	
	
	@Test(priority=221, groups={"Functional"},enabled=false)
	public void selectBedNoAndClickSaveBtn() throws InterruptedException{
	CPOT.selectBedNoAndClickSaveBtn();
	}
	
	@Test(priority=222, groups={"Functional"},enabled=false)
	public void oldBedSelectedEnterInvalidPrefix() throws InterruptedException{
	CPOT.oldBedSelectedEnterInvalidPrefix();
	}
	
	@Test(priority=223, groups={"Functional"},enabled=false)
	public void oldBedSelectedEnterValidPrefix() throws InterruptedException{
	CPOT.oldBedSelectedEnterValidPrefix();
	Thread.sleep(2000);	
	}
	
	@Test(priority=224, groups={"Functional"},enabled=false)
	public void enterBedNoOldBedPrefixSelected() throws InterruptedException{
	CPOT.enterBedNoOldBedPrefixSelected();
	}
	
	@Test(priority=225, groups={"Functional"},enabled=false)
	public void oldBedPrefixNewBedSelectedEnterInvalidPostfix() throws InterruptedException{
	CPOT.oldBedPrefixNewBedSelectedEnterInvalidPostfix();
	}
	
	@Test(priority=226, groups={"Functional"},enabled=false)
	public void oldBedPrefixNewBedSelectedEnterValidPostfix() throws InterruptedException{
	CPOT.oldBedPrefixNewBedSelectedEnterValidPostfix();
	WebElement updateMsg = CPOT.bedNoChanged_printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Bed No. Successfully Changed.");
	System.out.println("Validation msg:"+ validationMsg);
	}
	
	
	@Test(priority=227, groups={"Functional","Smoke"})
	public void changeBedNoInOneGo() throws InterruptedException{
	Object oldBedName = CPOT.validatesOldBedNo();
	Thread.sleep(2000);	
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String prefix = xlsReader.getCellData("TestData", "InvalidBed", 2);
	String bedNo = xlsReader.getCellData("TestData", "ValidBed", 2);
	String postfix = xlsReader.getCellData("TestData", "InvalidBed", 2);
	CPOT.changeBedNoInOneGo(prefix, bedNo, postfix);
	Thread.sleep(2000);	
	WebElement updateMsg = CPOT.bedNoChanged_printValidationMsg();
	Thread.sleep(2000);	
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Bed No. Successfully Changed.");
	System.out.println("Validation msg:"+ validationMsg);
	Object updatedBedName = CPOT.validatesChangedBedNo();
	Thread.sleep(2000);	
//	Assert.assertEquals(oldBedName, updatedBedName, "Bed name updated & validated");
	Assert.assertNotEquals(oldBedName, updatedBedName, "Bed name updated & validated");
	}
	
	


	
	
	
	
	
	
	
	@Test(priority=228, groups={"Functional","Smoke"})
	public void clickManageWardsToReachWardUnitMappingLink() throws InterruptedException{
	CPOT.clickManageWardsToReachWardUnitMappingLink();
	Thread.sleep(2000);
	}
	
	
	@Test(priority=229, groups={"Functional"})
	public void wardUnitMappingLinkIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.wardUnitMappingLinkIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Unit Mapping Link Is Displayed");
	}else{
		System.out.println("Ward Unit Mapping Link Not Displayed");
		}	
	}
	
	
	
	@Test(priority=230, groups={"Functional","Smoke"})
	public void wardUnitMappingLinkIsEnabled() throws InterruptedException{
	boolean flag = CPOT.wardUnitMappingLinkIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.wardUnitMappingLinkIsClickable();
		Thread.sleep(2000);
		System.out.println("Ward Unit Mapping Link Is Enabled & clickable");
	}
		}
	
	
	@Test(priority=231, groups={"Functional"})
	public void wardUnitMapping_WardNameDrpdwnIsDisplayed(){
	boolean flag = CPOT.wardUnitMapping_WardNameDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Name dropdown displayed");
	}else{
		System.out.println("Ward Name dropdown not displayed");
		}	
	}

	@Test(priority=232, groups={"Functional"})
	public void wardUnitMapping_WardNameDrpdwnIsEnabled(){
	boolean flag = CPOT.wardUnitMapping_WardNameDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Name dropdown enabled");
	}else{
		System.out.println("Ward Name dropdown not enabled");
		}	
	}

	@Test(priority=233, groups= {"Functional"})
	public void wardUnitMapping_WardNameDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.wardUnitMapping_WardNameDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Ward Name Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=234, groups={"Functional"})
	public void wardUnitMapping_UnitNameDrpdwnIsDisplayed(){
	boolean flag = CPOT.wardUnitMapping_UnitNameDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Name dropdown displayed");
	}else{
		System.out.println("Ward Name dropdown not displayed");
		}	
	}

	@Test(priority=235, groups={"Functional"})
	public void wardUnitMapping_UnitNameDrpdwnIsEnabled(){
	boolean flag = CPOT.wardUnitMapping_UnitNameDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Name dropdown enabled");
	}else{
		System.out.println("Ward Name dropdown not enabled");
		}	
	}

	@Test(priority=236, groups= {"Functional"})
	public void wardUnitMapping_UnitNameDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.wardUnitMapping_UnitNameDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Ward Name Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=237, groups={"Functional"})
	public void wardUnitMapping_SaveBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.wardUnitMapping_SaveBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Unit Mapping_Save Button Is Displayed");
	}else{
		System.out.println("Ward Unit Mapping_Save Button Not Displayed");
		}	
	}
	
	
	@Test(priority=238, groups={"Functional"})
	public void wardUnitMapping_SaveBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.wardUnitMapping_SaveBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.wardUnitMapping_SaveBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please Select a ward.");
		Thread.sleep(2000);
		System.out.println("Alert handled:Ward Unit Mapping_Save Button Is Enabled & Clickable");
	}
		}
	
	@Test(priority=239, groups={"Functional"})
	public void wardUnitMapping_EditBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.wardUnitMapping_EditBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Unit Mapping_Edit Button Is Displayed");
	}else{
		System.out.println("Ward Unit Mapping_Edit Button Not Displayed");
		}	
	}
	
	
	@Test(priority=240, groups={"Functional"})
	public void wardUnitMapping_EditBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.wardUnitMapping_EditBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		CPOT.wardUnitMapping_EditBtnIsClickable();
		System.out.println("Edit Ward unit Mapping button is enabled and clickable");
	}
		}	


	@Test(priority=241, groups={"Functional"})
	public void wardUnitMapping_UpdateBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.wardUnitMapping_UpdateBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward Unit Mapping_Update Button Is Displayed");
	}else{
		System.out.println("Ward Unit Mapping_Update Button Not Displayed");
		}	
	}
	
	
	@Test(priority=242, groups={"Functional"})
	public void wardUnitMapping_UpdateBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.wardUnitMapping_UpdateBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.wardUnitMapping_UpdateBtnIsClickable();
		Thread.sleep(2000);
		WebElement updateMsg = CPOT.wardUnitMapping_printValidationMsg();
		String validationMsg = updateMsg.getText();
		Assert.assertEquals(validationMsg, "Mapping Updated Successfully");
		System.out.println("Update Ward unit Mapping button is enabled and clicable:"+validationMsg);
	}
		}	

	@Test(priority=243, groups={"Functional"})
	public void wardUnitMapping_DeleteBtnIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.wardUnitMapping_DeleteBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Delete Unit Mapping_Edit Button Is Displayed");
	}else{
		System.out.println("Delete Unit Mapping_Edit Button Not Displayed");
		}	
	}
	
	
	@Test(priority=244, groups={"Functional"})
	public void wardUnitMapping_DeleteBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.wardUnitMapping_DeleteBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.wardUnitMapping_DeleteBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.dismiss();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Are you sure you want to delete this mapping?");
		System.out.println("Alert handled:Delete Ward unit Mapping button is enabled and clicable");
	}
		}	

	@Test(priority=245, groups={"Functional"})
	public void onlyWardNameSelectedClickSaveBtn() throws InterruptedException{
	CPOT.onlyWardNameSelectedClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select a unit.");
		System.out.println("Alert handled for selecting ward name only:"+alertmsg);
		Thread.sleep(2000);
	}
		

	@Test(priority=246, groups={"Functional"})
	public void selectingUnitNameOnlyAndClickSaveBtn() throws InterruptedException{
	CPOT.selectingUnitNameOnlyAndClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Select a ward.");
		System.out.println("Alert handled for selecting ward name only:"+alertmsg);
	}
		
	@Test(priority=247, groups={"Functional"})
	public void selectBothWardUnitNameAndClickSaveBtn() throws InterruptedException{
	CPOT.selectBothWardUnitNameAndClickSaveBtn();
		Thread.sleep(2000);
		WebElement updateMsg = CPOT.wardUnitMapping_printValidationMsg();
		String validationMsg = updateMsg.getText();
		Assert.assertEquals(validationMsg, "Mapping Added Successfully", "If get failed error  msg will be printed");
		System.out.println("Ward and Unit name both selected:"+validationMsg);
	}

	@Test(priority=248, groups={"Functional","Smoke"})
	public void addWardUnitMappingInOneGo() throws InterruptedException{
	CPOT.addWardUnitMappingInOneGo();
		Thread.sleep(2000);
		WebElement updateMsg = CPOT.wardUnitMapping_printValidationMsg();
		Thread.sleep(2000);
		String validationMsg = updateMsg.getText();
		Thread.sleep(2000);
		Assert.assertEquals(validationMsg, "Mapping Added Successfully", "If get failed error  msg will be printed");
		System.out.println("Ward and unit mapped:"+validationMsg);
	}

	
	@Test(priority=249, groups={"Functional"})
	public void clickEditBtnAndUpdateWithoutValues() throws InterruptedException{
	CPOT.clickEditBtnAndUpdateWithoutValues();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select a unit.");
		System.out.println("Alert handled for selecting ward name only:"+alertmsg);
	}

	@Test(priority=250, groups={"Functional"})
	public void onlyWardNameAlreadySelectedClickUpdateBtn() throws InterruptedException{
	CPOT.onlyWardNameAlreadySelectedClickUpdateBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select a unit.");
		System.out.println("Alert handled for selecting ward name only:"+alertmsg);
	}
		
	@Test(priority=251, groups={"Functional"})
	public void selectingUnitNameOnlyAndClickUpdateBtn() throws InterruptedException{
	CPOT.selectingUnitNameOnlyAndClickUpdateBtn();
	Thread.sleep(2000);
	/*	Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Select a ward.");
		System.out.println(alertmsg); 
		System.out.println("Alert handled for selecting ward name only:");   
		*/
	}
	
		
	@Test(priority=252, groups={"Functional"})
	public void selectBothWardUnitNameAndClickUpdateBtn() throws InterruptedException{
		Thread.sleep(2000);
	CPOT.selectBothWardUnitNameAndClickUpdateBtn();
		Thread.sleep(2000);
		WebElement updateMsg = CPOT.wardUnitMapping_printValidationMsg();
		String validationMsg = updateMsg.getText();
		Assert.assertEquals(validationMsg, "Mapping Updated Successfully", "If get failed error msg will be printed");
		System.out.println("Ward and Unit name both Updated :"+validationMsg);
	}

	@Test(priority=253, groups={"Functional","Smoke"})
	public void editWardUnitMappingInOneGo() throws InterruptedException{
	Thread.sleep(2000);
	CPOT.editWardUnitMappingInOneGo();
		Thread.sleep(2000);
		WebElement updateMsg = CPOT.wardUnitMapping_printValidationMsg();
		Thread.sleep(2000);
		String validationMsg = updateMsg.getText();
		Thread.sleep(2000);
		Assert.assertEquals(validationMsg, "Mapping Updated Successfully", "If get failed error  msg will be printed");
		Thread.sleep(2000);
		System.out.println("Ward and unit mapped:"+validationMsg);
	}

	@Test(priority=254, groups={"Functional"})
	public void deletesFirstMappingInTheRow() throws InterruptedException{
	CPOT.deletesFirstMappingInTheRow();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Are you sure you want to delete this mapping?");
		System.out.println(alertmsg+"Alert handled_Mapping deleted:");
	}

	
	
	
	@Test(priority=255, groups={"Functional","Smoke"})
	public void clickManageWardsToReachMapWardVsIcuIsolationLink() throws InterruptedException{
	CPOT.clickManageWardsToReachMapWardVsIcuIsolationLink();
	}
	

	@Test(priority=256, groups={"Functional"})
	public void mapWardVsIcuIsolationLinkIsDisplayed() throws InterruptedException{
	boolean flag = CPOT.mapWardVsIcuIsolationLinkIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Map Ward Vs ICU ISOLATION Ward Link Is Displayed");
	}	}
	
	
	@Test(priority=257, groups={"Functional","Smoke"})
	public void mapWardVsIcuIsolationLinkIsEnabled() throws InterruptedException{
	boolean flag = CPOT.mapWardVsIcuIsolationLinkIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.mapWardVsIcuIsolationLinkIsClickable();
		Thread.sleep(2000);
		System.out.println("Map Ward Vs ICU ISOLATION Ward Link Is Enabled & Clickable");
	}
		}


	
	
	@Test(priority=258, groups={"Functional"})
	public void wardListDrpdwnIsDisplayed(){
	boolean flag = CPOT.wardListDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward List dropdown Is Displayed");
	}else{
		System.out.println("Ward List dropdown not Displayeds");
		}	
	}

	@Test(priority=259, groups={"Functional"})
	public void wardListDrpdwnIsEnabled(){
	boolean flag = CPOT.wardListDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward List dropdown Is Enabled");
	}else{
		System.out.println("Ward List dropdown not Enabled");
		}	
	}
	
	@Test(priority=260, groups= {"Functional"})
	public void wardListDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.wardListDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Ward List Dropdown doesn't allow to select Multiple Values");
	}
		}	


	@Test(priority=261, groups={"Functional"})
	public void icuIsolationWardDrpdwnIsDisplayed(){
	boolean flag = CPOT.icuIsolationWardDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward List dropdown Is Displayed");
	}else{
		System.out.println("Ward List dropdown not Displayeds");
		}	
	}

	@Test(priority=262, groups={"Functional"})
	public void icuIsolationWardDrpdwnIsEnabled(){
	boolean flag = CPOT.icuIsolationWardDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Ward List dropdown Is Enabled");
	}else{
		System.out.println("Ward List dropdown not Enabled");
		}	
	}
	
	@Test(priority=263, groups= {"Functional"})
	public void icuIsolationWardDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = CPOT.icuIsolationWardDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Ward List Dropdown doesn't allow to select Multiple Values");
	}
		}	

	
	@Test(priority=264, groups={"Functional"})
	public void showConfigurationBtnIsDisplayed(){
	boolean flag = CPOT.saveConfigurationBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save Configuration btn is displayed");
	}else{
		System.out.println("Save Configuration btn not displayed");
		}	
	}
	
	
	
	
	@Test(priority=265, groups={"Functional"})
	public void showConfigurationBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.saveConfigurationBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.saveConfigurationBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Saved Successfully", "If failed pass msg: Save Configuration btn neither enabled nor clickable");
		System.out.println(alertmsg+"Alert handled");
		}	
	}
	
	@Test(priority=266, groups={"Functional"})
	public void showIcuWardListBtnIsDisplayed(){
	boolean flag = CPOT.showIcuWardListBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Show ICU Ward List btn is displayed");
	}else{
		System.out.println("Show ICU Ward List btn not displayed");
		}	
	}
	
	@Test(priority=267, groups={"Functional"})
	public void showIcuWardListBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.showIcuWardListBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.showIcuWardListBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("If failed pass msg: Show ICU Ward List btn neither enabled nor clickable");
		}	
	}
	
	
	@Test(priority=268, groups={"Functional"})
	public void showIsolationWardListBtnIsDisplayed(){
	boolean flag = CPOT.showIsolationWardListBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Show ISOLATION Ward List btn is displayed");
	}else{
		System.out.println("Show ISOLATION Ward List btn not displayed");
		}	
	}
	
	@Test(priority=269, groups={"Functional"})
	public void showIsolationWardListBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.showIsolationWardListBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.showIsolationWardListBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("If failed pass msg: Show ISOLATION Ward List btn neither enabled nor clickable");
		}	
	}
	
	@Test(priority=270, groups={"Functional"})
	public void editIcuWardListBtnIsDisplayed(){
	boolean flag = CPOT.editIcuWardListBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Edit ICU Ward List btn is displayed");
	}else{
		System.out.println("Edit ICU Ward List btn not displayed");
		}	
	}
	
	@Test(priority=271, groups={"Functional"})
	public void editIcuWardListBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.editIcuWardListBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.editIcuWardListBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("If failed pass msg: Edit ICU Ward List btn neither enabled nor clickable");
		}	
	}
		
	@Test(priority=272, groups={"Functional"})
	public void editIsolationWardListBtnIsDisplayed(){
	boolean flag = CPOT.editIsolationWardListBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Edit ISOLATION Ward List btn is displayed");
	}	
	}
	
	@Test(priority=273, groups={"Functional"})
	public void editIsolationWardListBtnIsEnabled() throws InterruptedException{
	boolean flag = CPOT.editIsolationWardListBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CPOT.editIsolationWardListBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("Edit ISOLATION Ward List btn is enabled & clickable");
		}	
	}
		
	
	
	@Test(priority=274, groups={"Functional","Smoke"})
	public void addIcuWardInOneGo() throws InterruptedException{
	CPOT.addIcuWardInOneGo();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Saved Successfully", "Ward not changed to ICU from ISOLATION");
		System.out.println(alertmsg+"Alert handled");
		}
	
	

	@Test(priority=275, groups={"Functional","Smoke"})
	public void addIsolationWardInOneGo() throws InterruptedException{
	CPOT.addIsolationWardInOneGo();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Saved Successfully", "Ward not changed to ISOLATION from ICU");
		System.out.println(alertmsg+"Alert handled");
		}
	

	@Test(priority=276, groups={"Functional","Smoke"})
	public void editIsolationWardInOneGo() throws InterruptedException{
	CPOT.editIsolationWardInOneGo();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Saved Successfully", "Ward not changed to ICU from ISOLATION");
		System.out.println(alertmsg+"Alert handled");
		}
	
	

	@Test(priority=277, groups={"Functional","Smoke"})
	public void editIcuWardInOneGo() throws InterruptedException{
	CPOT.editIcuWardInOneGo();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Saved Successfully", "Ward not changed to ISOLATION from ICU");
		System.out.println(alertmsg+"Alert handled");
		}







}	





