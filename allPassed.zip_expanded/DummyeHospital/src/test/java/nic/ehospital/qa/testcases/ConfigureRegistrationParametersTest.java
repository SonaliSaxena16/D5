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
import nic.ehospital.qa.pages.ConfigureRegistrationParameters;
import nic.ehospital.qa.util.TestUtil;

public class ConfigureRegistrationParametersTest extends TestBase{
	
	ConfigureRegistrationParameters CRP;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	
	
	public ConfigureRegistrationParametersTest() throws IOException {
		super();
	}

	
	

	@Test(priority=1, groups={"Functional","Smoke"})
	public void ConfigPointOfTreatmentIsDisplayed() throws IOException, InterruptedException{
		CRP = new ConfigureRegistrationParameters();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = CRP.configureRegParaLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Configure Reg Para Link Is Displayed");
		}
	}

	
	
	
	@Test(priority=2, groups={"Functional","Smoke"})
	public void configureRegParaLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = CRP.configureRegParaLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CRP.configureRegParaLinkIsClickable();
			testUtil.RightFrame();
			Thread.sleep(2000);
			List<WebElement>elements = driver.findElements(By.tagName("body"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		   // 	System.out.println(od); 
		    	}
		Reporter.log("Configure Reg Para Link is Enabled & Clickable", true);
		}
	}

	
	
	

	@Test(priority=3, groups={"Functional"})
	public void regRoomCreation_ClinicDropdownIsDisplayed(){
	boolean flag = CRP.regRoomCreation_ClinicDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Clinic dropdown is displayed");
	}	
		}


	@Test(priority=4, groups={"Functional"})
	public void RegRoomCreation_ClinicDropdownIsEnabled(){
	boolean flag = CRP.RegRoomCreation_ClinicDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Clinic dropdown is enabled");
	}	
		}
	
	

	@Test(priority=5, groups= {"Functional"})
	public void RegRoomCreation_ClinicDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.RegRoomCreation_ClinicDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Reg Room Creation_Clinic dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=6, groups={"Functional"})
	public void mondayChkboxIsDisplayed() throws InterruptedException{
	boolean flag = CRP.mondayChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Monday Checkbox Is  Displayed");
	}
		}

	@Test(priority=7, groups={"Functional"})
	public void tuesdayChkboxIsDisplayed() throws InterruptedException{
	boolean flag = CRP.tuesdayChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Tuesday Checkbox Is  Displayed");
	}
		}

	@Test(priority=8, groups={"Functional"})
	public void regRoomCreation_DepartmentDropdownIsDisplayed(){
	boolean flag = CRP.regRoomCreation_DepartmentDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Department  dropdown is displayed");
	}	
		}

	@Test(priority=9, groups={"Functional"})
	public void RegRoomCreation_DepartmentDropdownIsEnabled(){
	boolean flag = CRP.RegRoomCreation_DepartmentDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Department dropdown is enabled");
	}	
		}

	@Test(priority=10, groups= {"Functional"})
	public void RegRoomCreation_DepartmentDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.RegRoomCreation_DepartmentDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Reg Room Creation_Department dropdown doesn't allow to select Multiple Values");
	}
		}


	@Test(priority=11, groups={"Functional"})
	public void regRoomCreation_UnitDropdownIsDisplayed(){
	boolean flag = CRP.regRoomCreation_UnitDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Unit  dropdown is displayed");
	}	
		}

	@Test(priority=12, groups={"Functional"})
	public void regRoomCreation_UnitDropdownIsEnabled(){
	boolean flag = CRP.regRoomCreation_UnitDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Unit dropdown is enabled");
	}	
		}

	@Test(priority=13, groups= {"Functional"})
	public void regRoomCreation_UnitDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.regRoomCreation_UnitDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Reg Room Creation_Unit dropdown doesn't allow to select Multiple Values");
	}
		}

	
	
	@Test(priority=14, groups={"Functional"})
	public void regRoomCreation_BuildingDropdownIsDisplayed(){
	boolean flag = CRP.regRoomCreation_BuildingDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Building dropdown is displayed");
	}	
		}

	@Test(priority=15, groups={"Functional"})
	public void regRoomCreation_BuildingDropdownIsEnabled(){
	boolean flag = CRP.regRoomCreation_BuildingDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Building dropdown is enabled");
	}	
		}

	@Test(priority=16, groups= {"Functional"})
	public void regRoomCreation_BuildingDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.regRoomCreation_BuildingDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Reg Room Creation_Building dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=17, groups={"Functional"})
	public void regRoomCreation_BlockDropdownIsDisplayed(){
	boolean flag = CRP.regRoomCreation_BlockDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Block dropdown is displayed");
	}	
		}

	@Test(priority=18, groups={"Functional"})
	public void regRoomCreation_BlockDropdownIsEnabled(){
	boolean flag = CRP.regRoomCreation_BlockDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Block dropdown is enabled");
	}	
		}

	@Test(priority=19, groups= {"Functional"})
	public void regRoomCreation_BlockDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.regRoomCreation_BlockDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Reg Room Creation_Block dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=20, groups={"Functional"})
	public void regRoomCreation_FloorDropdownIsDisplayed(){
	boolean flag = CRP.regRoomCreation_FloorDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Floor dropdown is displayed");
	}
		}

	@Test(priority=21, groups={"Functional"})
	public void regRoomCreation_FloorDropdownIsEnabled(){
	boolean flag = CRP.regRoomCreation_FloorDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Floor dropdown is enabled");
	}	
		}

	@Test(priority=22, groups= {"Functional"})
	public void regRoomCreation_FloorDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.regRoomCreation_FloorDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Reg Room Creation_Floor dropdown doesn't allow to select Multiple Values");
	}
		}
		
	@Test(priority=23, groups={"Functional"})
	public void regRoomCreation_RoomDropdownIsDisplayed(){
	boolean flag = CRP.regRoomCreation_RoomDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Room dropdown is displayed");
	}	
		}

	@Test(priority=24, groups={"Functional"})
	public void regRoomCreation_RoomDropdownIsEnabled(){
	boolean flag = CRP.regRoomCreation_RoomDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Room dropdown is enabled");
	}	
		}

	@Test(priority=25, groups= {"Functional"})
	public void regRoomCreation_RoomDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.regRoomCreation_RoomDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Reg Room Creation_Room dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=26, groups={"Functional"})
	public void regRoomCreation_SelectDoctorChkboxIsDisplayed(){
	boolean flag = CRP.regRoomCreation_SelectDoctorChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Select Doctor Checkbox is displayed");
	}	
		}
	
	
	@Test(priority=27, groups={"Functional"})
	public void regRoomCreation_SaveBtnIsDisplayed(){
	boolean flag = CRP.regRoomCreation_SaveBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Save Btn is displayed");
	}	
		}

	@Test(priority=28, groups={"Functional"})
	public void regRoomCreation_SaveBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.regRoomCreation_SaveBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.regRoomCreation_SaveBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Select Clinic.");
		Reporter.log("Alert handled", true);
		Thread.sleep(2000);
		System.out.println("Reg Room Creation_Save Btn is enabled & clickable");
	}	
		}

	@Test(priority=29, groups={"Functional"})
	public void selectClinicOnlyClickSaveBtn() throws InterruptedException{
	CRP.selectClinicOnlyClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Select Department.");
		Reporter.log("Alert handled : Only clinic selected", true);
		Thread.sleep(2000);
	}	
	
	@Test(priority=30, groups={"Functional"})
	public void selectClinicDeptThenClickSaveBtn() throws InterruptedException{
	CRP.selectClinicDeptThenClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Select Unit.");
		Reporter.log("Alert handled : Only clinic & department selected", true);
		Thread.sleep(2000);
	}	
	
	@Test(priority=31, groups={"Functional"})
	public void selectClinicDeptUnitThenClickSaveBtn() throws InterruptedException{
	CRP.selectClinicDeptUnitThenClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Select Building.");
		Reporter.log("Alert handled : Only clinic department & unit selected", true);
		Thread.sleep(2000);
	}	
	
	@Test(priority=32, groups={"Functional"})
	public void selectClinicDeptUnitBuildngThenClickSaveBtn() throws InterruptedException{
	CRP.selectClinicDeptUnitBuildngThenClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Select Block.");
		Reporter.log("Alert handled : Only clinic department unit & building selected", true);
		Thread.sleep(2000);
	}	
	
	@Test(priority=33, groups={"Functional"})
	public void selectClinicDeptUnitBuildngBlockThenClickSaveBtn() throws InterruptedException{
	CRP.selectClinicDeptUnitBuildngBlockThenClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Select Floor.");
		Reporter.log("Alert handled : Only clinic department unit & building selected", true);
		Thread.sleep(2000);
	}	
	
	@Test(priority=34, groups={"Functional"})
	public void selectClinicDeptUnitBuildngBlockFloorThenClickSaveBtn() throws InterruptedException{
	CRP.selectClinicDeptUnitBuildngBlockFloorThenClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Select Room.");
		Reporter.log("Alert handled : Only clinic department unit & building selected", true);
		Thread.sleep(2000);
	}	
	
	@Test(priority=35, groups={"Functional"})
	public void selectClinicDeptUnitBuildngBlockRoom() throws InterruptedException{
	CRP.selectClinicDeptUnitBuildngBlockRoom();
	Thread.sleep(2000);
	CRP.selectDoctorCheckbox();
	WebElement updateMsg = CRP.printValMsgRegRoomCreated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Save Successfully");
	System.out.println("Doctor selected & Registration Room Created successfully."+ validationMsg);
	}	
	
	
	
	
	@Test(priority=36, groups={"Functional","Smoke"})
	public void createRegRoomInOneGo() throws InterruptedException{
	CRP.createRegRoomInOneGo();
	Thread.sleep(2000);
//	CRP.selectDoctorCheckbox();
	WebElement updateMsg = CRP.printValMsgRegRoomCreated();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Save Successfully");
	System.out.println("Doctor selected & Registration Room Created in one go."+ validationMsg);
	}	
	
	
	@Test(priority=37, groups={"Functional"})
	public void regRoomCreation_FilterByDeptDropdownIsDisplayed(){
	boolean flag = CRP.regRoomCreation_FilterByDeptDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Filter by department is displayed");
	}	
		}

	@Test(priority=38, groups={"Functional"})
	public void regRoomCreation_FilterByDeptDropdownIsEnabled(){
	boolean flag = CRP.regRoomCreation_FilterByDeptDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Filter by department is Enable");
	}	
		}

	@Test(priority=39, groups= {"Functional"})
	public void regRoomCreation_FilterByDeptDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.regRoomCreation_FilterByDeptDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Reg Room Creation_Filter by deparment dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=40, groups={"Functional"})
	public void regRoomCreation_FilterByClinicDropdownIsDisplayed(){
	boolean flag = CRP.regRoomCreation_FilterByClinicDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Filter by clinic is displayed");
	}	
		}

	@Test(priority=41, groups={"Functional"})
	public void regRoomCreation_FilterByClinictDropdownIsEnabled(){
	boolean flag = CRP.regRoomCreation_FilterByClinictDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Filter by clinic is Enable");
	}	
		}

	@Test(priority=42, groups= {"Functional"})
	public void regRoomCreation_FilterByClinicDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.regRoomCreation_FilterByClinicDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Reg Room Creation_Filter by clinic dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=43, groups={"Functional"})
	public void regRoomCreation_RemoveEntryCheckboxIsDisplayed(){
	boolean flag = CRP.regRoomCreation_RemoveEntryCheckboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Remove entry checkbox is displayed");
	}	
		}

	
	@Test(priority=44, groups={"Functional"})
	public void regRoomCreation_UnallocateRoomBtnIsDisplayed(){
	boolean flag = CRP.regRoomCreation_UnallocateRoomBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Reg Room Creation_Unallocate Room btn is displayed");
	}	
		}

	@Test(priority=45, groups={"Functional"})
	public void regRoomCreation_UnallocateRoomBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.regRoomCreation_UnallocateRoomBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.regRoomCreation_UnallocateRoomBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please select atleast one registration rooom to unallocate");
		Reporter.log("Alert Handled:Clicked unallocate rooms btn without selecting any room", true);
	}	
		}
	
	
 	@Test(priority=46, groups={"Functional","Smoke"})
	public void regRoomCreation_SelectEntryAndDelete() throws InterruptedException{
 	CRP.regRoomCreation_SelectEntryAndDelete();
 	}
 	
 	
 	
 	
 	
 	
	
 	@Test(priority=47, groups={"Functional"})
	public void manageCounterLinkIsDisplayed(){
	boolean flag = CRP.manageCounterLinkIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Counter Link is displayed");
	}	
		}



	
	
	
	
	
	
	
	
	
	
	@Test(priority=48, groups={"Functional","Smoke"})
	public void manageCounterLinkIsEnabled() throws InterruptedException{
	boolean flag = CRP.manageCounterLinkIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.manageCounterLinkIsClickable();
		Thread.sleep(2000);
	
		
		List<WebElement>elements = driver.findElements(By.tagName("form"));
	    for(WebElement ob :elements ) {
	    	String od = ob.getText();
	   // 	System.out.println(od); 
	    	}
		System.out.println("Manage Counter Link is Enable & clickable");
	
	
	}	
		}
	
	
	
	
	
 	@Test(priority=49, groups={"Functional"})
	public void counterNameTxtboxIsDisplayed(){
	boolean flag = CRP.counterNameTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Name textbox is displayed");
	}	
		}



	@Test(priority=50, groups={"Functional"})
	public void counterNameTxtboxIsEnabled() throws InterruptedException{
	boolean flag = CRP.counterNameTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Name textbox is Enabled");
	}	
		}
	
	
 	@Test(priority=51, groups={"Functional"})
	public void counterDesciptionTxtboxIsDisplayed(){
	boolean flag = CRP.counterDesciptionTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Description textbox is displayed");
	}	
		}



	@Test(priority=52, groups={"Functional"})
	public void counterDesciptionTxtboxIsEnabled() throws InterruptedException{
	boolean flag = CRP.counterDesciptionTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Description textbox is Enabled");
	}	
		}
	
	@Test(priority=53, groups={"Functional"})
	public void counterTypeDropdownIsDisplayed(){
	boolean flag = CRP.counterTypeDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Type dropdown is displayed");
	}	
		}

	@Test(priority=54, groups={"Functional"})
	public void counterTypeDropdownIsEnabled(){
	boolean flag = CRP.counterTypeDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Type dropdown is enabled");
	}	
		}

	@Test(priority=55, groups= {"Functional"})
	public void counterTypeDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.counterTypeDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Counter Type dropdown doesn't allow to select Multiple Values");
	}
		}

	@Test(priority=56, groups={"Functional"})
	public void saveCounterBtnIsDisplayed(){
	boolean flag = CRP.saveCounterBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save Counter Button is displayed");
	}	
		}

	@Test(priority=57, groups={"Functional"})
	public void saveCounterBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.saveCounterBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.saveCounterBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a counter name.");
		Reporter.log("Alert Handled:Clicked Save Counter Button without entering counter name & description", true);
		System.out.println("Save Counter Button is Enabled & Clickable");
	}	
		}
		
	@Test(priority=58, groups={"Functional"})
	public void enterInvalidCounterNameClickSaveBtn() throws InterruptedException{
	CRP.enterInvalidCounterNameClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a valid counter name.");
		Reporter.log("Alert Handled:Invalid Counter Name entered and clicked save btn", true);
	}	
		
	@Test(priority=59, groups={"Functional"})
	public void enterValidCounterNameClickSaveBtn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validCountr = xlsReader.getCellData("TestData", "ValidCounterName", 2);
	CRP.enterValidCounterNameClickSaveBtn(validCountr);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter counter description.");
		Reporter.log("Alert Handled:Only valid Counter Name entered and clicked save btn", true);
	}
	
	@Test(priority=60, groups={"Functional"})
	public void enterInvalidCounterDescrptonClickSaveBtn() throws InterruptedException{
	CRP.enterInvalidCounterDescrptonClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter valid counter description.");
		Reporter.log("Alert Handled:Invalid Counter Name entered and clicked save btn", true);
	}	
		
	@Test(priority=61, groups={"Functional"})
	public void enterValidCounterDescrptonClickSaveBtn() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validCountr= xlsReader.getCellData("TestData", "ValidCounterDescription", 2);
	CRP.enterValidCounterDescrptonClickSaveBtn(validCountr);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Counter details saved Successfully.");
		Reporter.log("Alert Handled:Only valid Counter Name entered and clicked save btn", true);
	}
	
	
	@Test(priority=62, groups={"Functional","Smoke"})
	public void addCounter_AddInOneGo() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String validCountrName= xlsReader.getCellData("TestData", "ValidCounterName", 2);
	String validCountrDesc= xlsReader.getCellData("TestData", "ValidCounterDescription", 2);
	CRP.addCounter_AddInOneGo(validCountrName, validCountrDesc);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Counter details saved Successfully.");
		Reporter.log("Alert Handled:Only valid Counter Name entered and clicked save btn", true);
	}
	
	
	
	@Test(priority=63, groups={"Functional"})
	public void counterVsUserMapping_CounterDropdownIsDisplayed(){
	boolean flag = CRP.counterVsUserMapping_CounterDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Vs User Mapping _ Counter Dropdown Is Displayed");
	}	
		}

	
	@Test(priority=64, groups={"Functional"})
	public void counterVsUserMapping_CounterDropdownIsEnabled(){
	boolean flag = CRP.counterVsUserMapping_CounterDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Vs User Mapping _ Counter Dropdown is enabled");
	}	
		}

	@Test(priority=65, groups= {"Functional"})
	public void counterVsUserMapping_CounterDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.counterVsUserMapping_CounterDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Counter Vs User Mapping _ Counter Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=66, groups={"Functional"})
	public void counterVsUserMapping_UserDropdownIsDisplayed(){
	boolean flag = CRP.counterVsUserMapping_UserDropdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Vs User Mapping _ User Dropdown Is Displayed");
	}	
		}

	@Test(priority=67, groups={"Functional"})
	public void counterVsUserMapping_UserDropdownIsEnabled(){
	boolean flag = CRP.counterVsUserMapping_UserDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Vs User Mapping _ User Dropdown is enabled");
	}	
		}

	@Test(priority=68, groups= {"Functional"})
	public void counterVsUserMapping_UserDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.counterVsUserMapping_UserDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Counter Vs User Mapping _ User Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	
	@Test(priority=69, groups={"Functional"})
	public void addUserCounterMappingBtnIsDisplayed(){
	boolean flag = CRP.addUserCounterMappingBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Counter Mapping Button is displayed");
	}	
		}

	
	@Test(priority=70, groups={"Functional"})
	public void addUserCounterMappingBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.addUserCounterMappingBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.addUserCounterMappingBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please select a counter.");
		Reporter.log("Alert Handled:Save Counter Button is Enabled & Clickable, without values", true);
		System.out.println("");
	}	
		}
		
	
	@Test(priority=71, groups={"Functional"})
	public void selectCounterOnlyClickSaveBtn() throws InterruptedException{
	CRP.selectCounterOnlyClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please select a user.");
		Reporter.log("Alert Handled:Save Counter Button is Enabled & Clickable, without values", true);
		System.out.println("");
	}	
	
	
	@Test(priority=72, groups={"Functional"})
	public void selectUserOnlyClickSaveBtn() throws InterruptedException{
	CRP.selectUserOnlyClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select a counter.");
		Reporter.log("Alert Handled:Add Counter Mapping Button is Enabled & Clickable, without values", true);
	}		
	

	
	@Test(priority=73, groups={"Functional","Smoke"})
	public void selectCounterUser_AddMappingInOneGo() throws InterruptedException{
	CRP.selectCounterUser_AddMappingInOneGo();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Counter user mapping Saved Successfully.");
		Reporter.log("Alert Handled:Add Counter Mapping Button is Enabled & Clickable, without values", true);
	}		
	
	
	@Test(priority=74, groups={"Functional"})
	public void counterVsDeptMapping_CounterDropdownIsDisplayed(){
	boolean flag = CRP.counterVsDeptMapping_CounterDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Vs Department Mapping _ Counter Dropdown Is Displayed");
	}	
		}

	@Test(priority=75, groups={"Functional"})
	public void counterVsDeptMapping_CounterDropdownIsEnabled(){
	boolean flag = CRP.counterVsDeptMapping_CounterDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Vs Department Mapping _ Counter Dropdown is enabled");
	}	
		}

	@Test(priority=76, groups= {"Functional"})
	public void counterVsDeptMapping_CounterDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.counterVsDeptMapping_CounterDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Counter Vs Department Mapping _ Counter Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	
	@Test(priority=77, groups={"Functional"})
	public void counterVsDeptMapping_DeptDropdownIsDisplayed(){
	boolean flag = CRP.counterVsDeptMapping_DeptDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Vs Department Mapping _ Department Dropdown Is Displayed");
	}	
		}

	@Test(priority=78, groups={"Functional"})
	public void counterVsDeptMapping_DeptDropdownIsEnabled(){
	boolean flag = CRP.counterVsDeptMapping_DeptDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Vs Department Mapping _ Department Dropdown is enabled");
	}	
		}

	@Test(priority=79, groups= {"Functional"})
	public void counterVsDeptMapping_DeptDropdownIsMultiple() throws InterruptedException{
	boolean flag = CRP.counterVsDeptMapping_DeptDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Counter Vs Department Mapping _ Department Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=80, groups={"Functional"})
	public void counterVsDeptMapping_SaveBtnIsDisplayed(){
	boolean flag = CRP.counterVsDeptMapping_SaveBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Vs Department Mapping _ Save button Is Displayed");
	}	
		}

	


	
	
	@Test(priority=81, groups={"Functional"})
	public void counterVsDeptMapping_SaveBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.counterVsDeptMapping_SaveBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.counterVsDeptMapping_SaveBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select a counter.");
		System.out.println("Counter Vs Department Mapping _ Save button is enabled & clickable");
	}	
		}

	
	@Test(priority=82, groups={"Functional"})
	public void counterVsDeptMapping_ClearBtnIsDisplayed(){
	boolean flag = CRP.counterVsDeptMapping_ClearBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Counter Vs Department Mapping _ Clear button Is Displayed");
	}	
		}

	@Test(priority=83, groups={"Functional"})
	public void counterVsDeptMapping_ClearBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.counterVsDeptMapping_ClearBtnIsEnabled();
	Assert.assertTrue(flag);
	CRP.counterVsDeptMapping_ClearBtnIsClickable();
	if(flag==true){
		System.out.println("Counter Vs Department Mapping _ Clear button is enabled & clickable");
	}	
		}
	
	@Test(priority=84, groups={"Functional"})
	public void counterVsDeptMapping_SelectCounterClickSaveBtn() throws InterruptedException{
	CRP.counterVsDeptMapping_SelectCounterOnlyClickSaveBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please select a department.");
	System.out.println("Alert handled : Only counter selected");
	}	
	

	@Test(priority=85, groups={"Functional"})
	public void counterVsDeptMapping_SelectDeptOnlyClickSaveBtn() throws InterruptedException{
	CRP.counterVsDeptMapping_SelectDeptOnlyClickSaveBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please select a counter.");
	System.out.println("Alert handled : Only counter selected");
	}	


	@Test(priority=86, groups={"Functional","Smoke"})
	public void counterVsDeptMapping_AddMappingInOneGo() throws InterruptedException{
	CRP.counterVsDeptMapping_AddMappingInOneGo();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Counter department mapping Saved Successfully.");
	System.out.println("Alert handled : Only counter selected");
	}	

	
	
	
	

	@Test(priority=87, groups={"Functional"})
	public void listOfCountrDeptMappng_EditBtnIsDisplayed(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,500)");
        
	boolean flag = CRP.listOfCountrDeptMappng_EditBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("List of Counter-Department Mapping:Edit button Is Displayed");
	}
		}





	
	
	
	@Test(priority=88, groups={"Functional"})
	public void listOfCountrDeptMappng_EditBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.listOfCountrDeptMappng_EditBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
	CRP.listOfCountrDeptMappng_EditBtnIsClickable();
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("javascript:window.scrollBy(0,500)");
		System.out.println("List of Counter-Department Mapping:Edit button Is enabled & clickable");
	}	
		}

	
	
	
	@Test(priority=89, groups={"Functional"})
	public void listOfCountrDeptMappng_ClickUpdateBtnWithoutValues() throws InterruptedException{
	
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("javascript:window.scrollBy(0,500)");
    Thread.sleep(2000);
    
	CRP.listOfCountrDeptMappng_ClickUpdateBtnWithoutValues();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please select a counter.");
	System.out.println("List of Counter-Department Mapping:Click update btn without values");
	}	
	
	
	
	
	
	
	@Test(priority=90, groups={"Functional"})
	public void listOfCountrDeptMappng_SelectCounterOnlyClickUpdateBtn() throws InterruptedException{
	CRP.listOfCountrDeptMappng_SelectCounterOnlyClickUpdateBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please select a department.");
	System.out.println("List of Counter-Department Mapping: Trying to update with counter only");
	}	
	

	@Test(priority=91, groups={"Functional"})
	public void listOfCountrDeptMappng_SelectDeptOnlyClickUpdateBtn() throws InterruptedException{
	CRP.listOfCountrDeptMappng_SelectDeptOnlyClickUpdateBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please select a counter.");
	System.out.println("List of Counter-Department Mapping: Trying to update with department only");
	}	

	@Test(priority=92, groups={"Functional"})
	public void listOfCountrDeptMappng_SelectCounterClickUpdateBtn() throws InterruptedException{
	CRP.listOfCountrDeptMappng_SelectCounterClickUpdateBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Counter department mapping updated Successfully.");
	System.out.println("List of Counter-Department Mapping: Counter mapped department & saved");
	}	

	@Test(priority=93, groups={"Functional","Smoke"})
	public void listOfCountrDeptMappng_AddMappingInOneGo() throws InterruptedException{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("javascript:window.scrollBy(0,500)");
	    Thread.sleep(2000);
	CRP.listOfCountrDeptMappng_AddMappingInOneGo();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Counter department mapping updated Successfully.");
	System.out.println("List of Counter-Department Mapping done in one go");
	}	
	
	
	
	
 	@Test(priority=94, groups={"Functional"})
	public void manageBillingTypeLinkIsDisplayed(){
	boolean flag = CRP.manageBillingTypeLinkIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Link is displayed");
	}	
		}


	@Test(priority=95, groups={"Functional","Smoke"})
	public void manageBillingTypeLinkIsEnabled() throws InterruptedException{
	boolean flag = CRP.manageBillingTypeLinkIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.manageBillingTypeLinkIsClickable();
		Thread.sleep(2000);
		
		List<WebElement>elements = driver.findElements(By.tagName("tr"));
	    for(WebElement ob :elements ) {
	    	String od = ob.getText();
	   // 	System.out.println(od);
	    	}
		 		
		System.out.println("Manage Billing Link is Enable & clickable");
	}	
		}
	

	
	@Test(priority=96, groups={"Functional"})
	public void billingTypeTxtboxIsDisplayed(){
	boolean flag = CRP.billingTypeTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Billing Type Textbox is Displayed");
	}	
		}

	
	@Test(priority=97, groups={"Functional"})
	public void billingTypeTxtboxIsEnabled(){
	boolean flag = CRP.billingTypeTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Billing Type Textbox is Displayed is enabled");
	}	
		}

	
	@Test(priority=98, groups={"Functional"})
	public void billingDescriptionTxtboxIsDisplayed(){
	boolean flag = CRP.billingDescriptionTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Billing Description Textbox is Displayed");
	}	
		}

	
	@Test(priority=99, groups={"Functional"})
	public void billingDescriptionTxtboxIsEnabled(){
	boolean flag = CRP.billingDescriptionTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Billing Description Textbox is enabled");
	}	
		}
	
	
	@Test(priority=100, groups={"Functional"})
	public void billingRegFeeTxtboxIsDisplayed(){
	boolean flag = CRP.billingRegFeeTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Registration Fee Textbox is Displayed");
	}	
		}

	
	@Test(priority=101, groups={"Functional"})
	public void billingRegFeeTxtboxIsEnabled(){
	boolean flag = CRP.billingRegFeeTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Registration Fee Textbox is Displayed is enabled");
	}	
		}
	
	@Test(priority=102, groups={"Functional"})
	public void billingAppointmentFeeTxtboxIsDisplayed(){
	boolean flag = CRP.billingAppointmentFeeTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Appointment Fee Textbox is Displayed");
	}	
		}

	
	@Test(priority=103, groups={"Functional"})
	public void billingAppointmentFeeTxtboxIsEnabled(){
	boolean flag = CRP.billingAppointmentFeeTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Appointment Fee Textbox is Displayed is enabled");
	}	
		}
	
	@Test(priority=104, groups={"Functional"})
	public void billingCasualtyFeeTxtboxIsDisplayed(){
	boolean flag = CRP.billingCasualtyFeeTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Casualty Fee Textbox is Displayed");
	}	
		}

	
	@Test(priority=105, groups={"Functional"})
	public void billingCasualtyFeeTxtboxIsEnabled(){
	boolean flag = CRP.billingCasualtyFeeTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Casualty Fee Textbox is Displayed is enabled");
	}	
		}
	
	@Test(priority=106, groups={"Functional"})
	public void billingInPatientFeeTxtboxIsDisplayed(){
	boolean flag = CRP.billingInPatientFeeTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ InPatient Fee Textbox is Displayed");
	}	
		}

	
	@Test(priority=107, groups={"Functional"})
	public void billingInPatientFeeTxtboxIsEnabled(){
	boolean flag = CRP.billingInPatientFeeTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ InPatient Fee Textbox is Displayed is enabled");
	}	
		}
	
	@Test(priority=108, groups={"Functional"})
	public void billingRevisitFeeTxtboxIsDisplayed(){
	boolean flag = CRP.billingRevisitFeeTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Revisit Fee Textbox is Displayed");
	}	
		}

	
	@Test(priority=109, groups={"Functional"})
	public void billingRevisitFeeTxtboxIsEnabled(){
	boolean flag = CRP.billingRevisitFeeTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Billing Type _ Revisit Fee Textbox is Displayed is enabled");
	}	
		}
	
	@Test(priority=110, groups={"Functional"})
	public void verifiedByBtnIsDisplayed(){
	boolean flag = CRP.verifiedByBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Verified By Btn is displayed");
	}	
		}

	@Test(priority=111, groups={"Functional"})
	public void verifiedByBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.verifiedByBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.verifiedByBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("Verified By Btn is enabled & clickable");
	}	
		}
	
	@Test(priority=112, groups={"Functional"})
	public void manageBilling_SaveBtnIsDisplayed(){
	boolean flag = CRP.manageBilling_SaveBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save btn is displayed");
	}	
		}

	@Test(priority=113, groups={"Functional"})
	public void manageBilling_SaveBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.manageBilling_SaveBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.manageBilling_SaveBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Enter Billing Name");
		System.out.println("Save Btn is enabled & clickable");
	}	
		}
	
	
	@Test(priority=114, groups={"Functional"})
	public void manageBilling_ClearBtnIsDisplayed(){
	boolean flag = CRP.manageBilling_ClearBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Clear btn is displayed");
	}	
		}

	@Test(priority=115, groups={"Functional"})
	public void manageBilling_ClearBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.manageBilling_ClearBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.manageBilling_ClearBtnIsClickable();
		System.out.println("Clear Btn is enabled & clickable");
	}	
		}
	
	
	@Test(priority=116, groups={"Functional"})
	public void enterInvalidBillingTypeOnlyClickSaveBtn() throws InterruptedException{
	CRP.enterInvalidBillingTypeOnlyClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Enter a Valid Billing Name");
		System.out.println("Enter invalid billing name only and click save btn");
	}	
	
	
	@Test(priority=117, groups={"Functional"})
	public void enterValidBillingypeOnlyClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String billngName = xlsReader.getCellData("TestData", "ValidBillingType", 2);
		CRP.enterValidBillingTypeOnlyClickSaveBtn(billngName);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Enter Billing Description");
		System.out.println("Enter valid billing name only and click save btn");
	}	
	
	@Test(priority=118, groups={"Functional"})
	public void enterInvalidBillingDescrptonOnlyClickSaveBtn() throws InterruptedException{
	CRP.enterInvalidBillingDescrptonOnlyClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Enter a Valid Billing Description");
		System.out.println("Enter invalid billing description only and click save btn");
	}	
	
	
	@Test(priority=119, groups={"Functional"})
	public void enterValidBillingDescrptonOnlyClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String billngDesc  = xlsReader.getCellData("TestData", "ValidBillingDescription", 2);
		CRP.enterValidBillingDescrptonOnlyClickSaveBtn(billngDesc);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Enter Registration Fee");
		System.out.println("Enter valid billing description only and click save btn");
	}	
	
	@Test(priority=120, groups={"Functional"})
	public void enterInvalidRegFeeOnlyClickSaveBtn() throws InterruptedException{
	CRP.enterInvalidRegFeeOnlyClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Enter a Valid Registration Fee");
		System.out.println("Enter invalid Registration Fee only and click save btn");
	}	
	
	
	@Test(priority=121, groups={"Functional"})
	public void enterValidRegFeeOnlyClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String RegFee = xlsReader.getCellData("TestData", "RegistrationFee", 2);
		CRP.enterValidRegFeeOnlyClickSaveBtn(RegFee);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Enter Appointment Fee");
		System.out.println("Enter valid Registration Fee only and click save btn");
	}	
	
	@Test(priority=122, groups={"Functional"})
	public void enterInvalidAppointmentFeeOnlyClickSaveBtn() throws InterruptedException{
	CRP.enterInvalidAppointmentFeeOnlyClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Enter a Valid Appointment Fee");
		System.out.println("Enter invalid Appointment Fee only and click save btn");
	}	
	
	
	@Test(priority=123, groups={"Functional"})
	public void enterValidAppointmentFeeOnlyClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String appointmentFee = xlsReader.getCellData("TestData", "AppointmentFee", 2);
		CRP.enterValidAppointmentFeeOnlyClickSaveBtn(appointmentFee);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Enter Casualty registration Fee");
		System.out.println("Enter valid Appointment Fee only and click save btn");
	}	
	
	@Test(priority=124, groups={"Functional"})
	public void enterInvalidCasualtyFeeOnlyClickSaveBtn() throws InterruptedException{
	CRP.enterInvalidCasualtyFeeOnlyClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Enter a Valid Casualty registration Fee");
		System.out.println("Enter invalid Casualty Fee only and click save btn");
	}	
	
	
	@Test(priority=125, groups={"Functional"})
	public void enterValidCasualtyFeeOnlyClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String casualtyFee = xlsReader.getCellData("TestData", "CasualtyFee", 2);
		CRP.enterValidCasualtyFeeOnlyClickSaveBtn(casualtyFee);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Enter In-Patient Resiatration Fee");
		System.out.println("Enter valid Casualty Fee only and click save btn");
	}	
	
	@Test(priority=126, groups={"Functional"})
	public void enterInvalidInPatientFeeOnlyClickSaveBtn() throws InterruptedException{
	CRP.enterInvalidInPatientFeeOnlyClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Enter a Valid In-Patient Resiatration Fee");
		System.out.println("Enter invalid In-Patient Registration Fee only and click save btn");
	}	
	
	
	@Test(priority=127, groups={"Functional"})
	public void enterValidInPatientFeeOnlyClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String inPatientFee = xlsReader.getCellData("TestData", "InPatientFee", 2);
		CRP.enterValidInPatientFeeOnlyClickSaveBtn(inPatientFee);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Enter Revisit Fee");
		System.out.println("Enter valid In-Patient Registration Fee only and click save btn");
	}	
	
	@Test(priority=128, groups={"Functional"})
	public void enterInvalidRevisitFeeOnlyClickSaveBtn() throws InterruptedException{
	CRP.enterInvalidRevisitFeeOnlyClickSaveBtn();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Enter a Valid Revisit Fee");
		System.out.println("Enter invalid Revisit Fee only and click save btn");
	}	
	
	
	@Test(priority=129, groups={"Functional"})
	public void enterValidRevisitFeeOnlyClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String revisitFee = xlsReader.getCellData("TestData", "RevisitFee", 2);
		CRP.enterValidRevisitFeeOnlyClickSaveBtn(revisitFee);
		Thread.sleep(4000);
		WebElement updateMsg = CRP.manageBilling_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "Successfully Saved");
		System.out.println("New billing type added to the list successfully"+ validationMsg);
	
		
	}	
	
	
	
	
	@Test(priority=130, groups={"Functional","Smoke"})
	public void addNewBillingType_InOneGo() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String billngName = xlsReader.getCellData("TestData", "ValidBillingType", 2);
		String billngDesc  = xlsReader.getCellData("TestData", "ValidBillingDescription", 2);
		String RegFee = xlsReader.getCellData("TestData", "RegistrationFee", 2);
		String appointmentFee = xlsReader.getCellData("TestData", "AppointmentFee", 2);
		String casualtyFee = xlsReader.getCellData("TestData", "CasualtyFee", 2);
		String inPatientFee = xlsReader.getCellData("TestData", "InPatientFee", 2);
		String revisitFee = xlsReader.getCellData("TestData", "RevisitFee", 2);
		CRP.addNewBillingType_InOneGo(billngName, billngDesc, RegFee, appointmentFee, casualtyFee, inPatientFee, revisitFee);
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageBilling_PrintValMsg();
		String validationMsg = updateMsg.getText();
		Assert.assertEquals(validationMsg, "Successfully Saved");
		System.out.println("New billing type added to the list successfully in one go"+ validationMsg);
	}	
	
	
	
	

	@Test(priority=131, groups={"Functional"})
	public void manageBillingType_EditBtnIsDisplayed(){
	boolean flag = CRP.manageBillingType_EditBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage billing type_edit button is displayed");
	}	
		}

	@Test(priority=132, groups={"Functional"})
	public void manageBillingType_EditBtnIsEnabled() throws InterruptedException{
	boolean flag = CRP.manageBillingType_EditBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		CRP.manageBillingType_EditBtnIsClickable();
		Reporter.log("Manage Billing Types_Edit btn is enabled & clickable", true);
	}	
		}
		
	
	@Test(priority=133, groups={"Functional"})
	public void manageBilling_ClearAllDataAndUpdateInvalidDataInBillingTypeTxbox () throws InterruptedException{
	CRP.manageBilling_ClearAllDataAndUpdateInvalidDataInBillingTypeTxbox();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Enter a Valid Billing Name");
		System.out.println("Save Btn is enabled & clickable");
	}	
	
	
		@Test(priority=134, groups={"Functional"})
		public void edit_EnterValidBillingTypeOnlyClickUpdateBtn() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String billngName = xlsReader.getCellData("TestData", "ValidBillingType", 2);
			CRP.edit_EnterValidBillingTypeOnlyClickUpdateBtn(billngName);
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Please Enter Billing Description");
			System.out.println("Enter valid billing name only and click save btn");
		}	
		
		@Test(priority=135, groups={"Functional"})
		public void edit_EnterInvalidBillingDescrptonOnlyClickUpdateBtn() throws InterruptedException{
		CRP.edit_EnterInvalidBillingDescrptonOnlyClickUpdateBtn();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Please Enter a Valid Billing Description");
			System.out.println("Enter invalid billing description only and click save btn");
		}	
		
		
		@Test(priority=136, groups={"Functional"})
		public void edit_EnterValidBillingDescrptonOnlyClickUpdateBtn() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String billngDesc  = xlsReader.getCellData("TestData", "ValidBillingDescription", 2);
			CRP.edit_EnterValidBillingDescrptonOnlyClickUpdateBtn(billngDesc);
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Enter Registration Fee");
			System.out.println("Enter valid billing description only and click save btn");
		}	
		
		
		@Test(priority=137, groups={"Functional"})
		public void edit_EnterInvalidRegFeeOnlyClickUpdateBtn() throws InterruptedException{
		CRP.edit_EnterInvalidRegFeeOnlyClickUpdateBtn();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Enter a Valid Registration Fee");
			System.out.println("Enter invalid Registration Fee only and click save btn");
		}	
		
		
		@Test(priority=138, groups={"Functional"})
		public void edit_EnterValidRegFeeOnlyClickUpdateBtn() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String RegFee = xlsReader.getCellData("TestData", "RegistrationFee", 2);
			CRP.edit_EnterValidRegFeeOnlyClickUpdateBtn(RegFee);
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Enter Appointment Fee");
			System.out.println("Enter valid Registration Fee only and click save btn");
		}	
		
		@Test(priority=139, groups={"Functional"})
		public void edit_EnterInvalidAppointmentFeeOnlyClickUpdateBtn() throws InterruptedException{
		CRP.edit_EnterInvalidAppointmentFeeOnlyClickUpdateBtn();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Enter a Valid Appointment Fee");
			System.out.println("Enter invalid Appointment Fee only and click save btn");
		}	
		
		
		@Test(priority=140, groups={"Functional"})
		public void edit_EnterValidAppointmentFeeOnlyClickUpdateBtn() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String appointmentFee = xlsReader.getCellData("TestData", "AppointmentFee", 2);
			CRP.edit_EnterValidAppointmentFeeOnlyClickUpdateBtn(appointmentFee);
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Enter Casualty registration Fee");
			System.out.println("Enter valid Appointment Fee only and click save btn");
		}	
		
		@Test(priority=141, groups={"Functional"})
		public void edit_nterInvalidCasualtyFeeOnlyClickUpdateBtn() throws InterruptedException{
		CRP.edit_nterInvalidCasualtyFeeOnlyClickUpdateBtn();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Enter a Valid Casualty registration Fee");
			System.out.println("Enter invalid Casualty Fee only and click save btn");
		}	
		
		
		@Test(priority=142, groups={"Functional"})
		public void edit_EnterValidCasualtyFeeOnlyClickUpdateBtn() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String casualtyFee = xlsReader.getCellData("TestData", "CasualtyFee", 2);
			CRP.edit_EnterValidCasualtyFeeOnlyClickUpdateBtn(casualtyFee);
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Enter In-Patient Resiatration Fee");
			System.out.println("Enter valid Casualty Fee only and click save btn");
		}	
		
		@Test(priority=143, groups={"Functional"})
		public void edit_EnterInvalidInPatientFeeOnlyClickUpdateBtn() throws InterruptedException{
		CRP.edit_EnterInvalidInPatientFeeOnlyClickUpdateBtn();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Enter a Valid In-Patient Resiatration Fee");
			System.out.println("Enter invalid In-Patient Registration Fee only and click save btn");
		}	
		
		
		@Test(priority=144, groups={"Functional"})
		public void edit_EnterValidInPatientFeeOnlyClickUpdateBtn() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String inPatientFee = xlsReader.getCellData("TestData", "InPatientFee", 2);
			CRP.edit_EnterValidInPatientFeeOnlyClickUpdateBtn(inPatientFee);
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Enter Revisit Fee");
			System.out.println("Enter valid In-Patient Registration Fee only and click save btn");
		}	
		
		@Test(priority=145, groups={"Functional"})
		public void edit_EnterInvalidRevisitFeeOnlyClickUpdateBtn() throws InterruptedException{
		CRP.edit_EnterInvalidRevisitFeeOnlyClickUpdateBtn();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Enter a Valid Revisit Fee");
			System.out.println("Enter invalid Revisit Fee only and click save btn");
		}	
		
		
		@Test(priority=146, groups={"Functional"})
		public void edit_EnterValidRevisitFeeOnlyClickUpdateBtn() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String revisitFee = xlsReader.getCellData("TestData", "RevisitFee", 2);
			CRP.edit_EnterValidRevisitFeeOnlyClickUpdateBtn(revisitFee);
			Thread.sleep(2000);
		
			WebElement updateMsg = CRP.manageBilling_PrintValMsg();
			String validationMsg = updateMsg.getText();
			
			//Assert.assertEquals(validationMsg, "Successfully Saved");
			
			System.out.println("New billing type added to the list successfully"+ validationMsg);
			
		
		
		
	}	
		

		
		
		@Test(priority=147, groups={"Functional","Smoke"})
		public void editBillingType_InOneGo() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String billngName = xlsReader.getCellData("TestData", "ValidBillingType", 2);
			String billngDesc  = xlsReader.getCellData("TestData", "ValidBillingDescription", 2);
			String RegFee = xlsReader.getCellData("TestData", "RegistrationFee", 2);
			String appointmentFee = xlsReader.getCellData("TestData", "AppointmentFee", 2);
			String casualtyFee = xlsReader.getCellData("TestData", "CasualtyFee", 2);
			String inPatientFee = xlsReader.getCellData("TestData", "InPatientFee", 2);
			String revisitFee = xlsReader.getCellData("TestData", "RevisitFee", 2);
			CRP.editBillingType_InOneGo(billngName, billngDesc, RegFee, appointmentFee, casualtyFee, inPatientFee, revisitFee);
			Thread.sleep(2000);
			WebElement updateMsg = CRP.manageBilling_PrintValMsg();
			String validationMsg = updateMsg.getText();
			Assert.assertEquals(validationMsg, "Successfully Saved");
			System.out.println("New billing type added to the list successfully in one go"+ validationMsg);
		}	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		@Test(priority=148, groups={"Functional"})
		public void manageDeptClinicFeeIntrvlLinkIsDisplayed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvlLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval link is Displayed");
		}	
			}

		@Test(priority=149, groups={"Functional","Smoke"})
		public void manageDeptClinicFeeIntrvlLinkIsEnabled() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvlLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CRP.manageDeptClinicFeeIntrvlLinkIsClickable();
		
			Thread.sleep(2000);
			List<WebElement>elements = driver.findElements(By.tagName("table"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od);
		    	}
		    
			Reporter.log("Manage Department Clinic Fee Interval link is enabled & clickable", true);
		}	
			}
		
		

		
		
		
		@Test(priority=150, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_DeptDrpdwnIsDisplyed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_DeptDrpdwnIsDisplyed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_Department dropdown is displayed");
		}	
			}

		@Test(priority=151, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_DeptDrpdwnIsEnabled(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_DeptDrpdwnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_Department dropdown is enabled");
		}	
			}

		@Test(priority=152, groups= {"Functional"})
		public void manageDeptClinicFeeIntrvl_DeptDrpdwnIsMultiple() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvl_DeptDrpdwnIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("Manage Department Clinic Fee Interval_Department dropdown is multiple");
		}
			}
	
	
		@Test(priority=153, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_ClinicDrpdwnIsDisplyed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_ClinicDrpdwnIsDisplyed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_Clinic dropdown is displayed");
		}	
			}

		@Test(priority=154, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_ClinicDrpdwnIsEnabled(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_ClinicDrpdwnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_Clinic dropdown is enabled");
		}	
			}

		@Test(priority=155, groups= {"Functional"})
		public void manageDeptClinicFeeIntrvl_ClinicDrpdwnIsMultiple() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvl_ClinicDrpdwnIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("Manage Department Clinic Fee Interval_Clinic dropdown is multiple");
		}
			}
	
	
		
		@Test(priority=156, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_ClinicTypeDrpdwnIsDisplyed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_ClinicTypeDrpdwnIsDisplyed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_Clinic type dropdown is displayed");
		}	
			}

		@Test(priority=157, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_ClinicTypeDrpdwnIsEnabled(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_ClinicTypeDrpdwnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_Clinic type dropdown is enabled");
		}	
			}

		@Test(priority=158, groups= {"Functional"})
		public void manageDeptClinicFeeIntrvl_ClinicTypeDrpdwnIsMultiple() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvl_ClinicTypeDrpdwnIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("Manage Department Clinic Fee Interval_Clinic type dropdown is multiple");
		}
			}
			
		@Test(priority=159, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_FollowupFeeIntrvalDrpdwnIsDisplyed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_FollowupFeeIntrvalDrpdwnIsDisplyed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_Follow up interval dropdown is displayed");
		}	
			}

		@Test(priority=160, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_FollowupFeeIntrvalDrpdwnIsEnabled(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_FollowupFeeIntrvalDrpdwnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_Follow up interval dropdown is enabled");
		}	
			}
		
		@Test(priority=161, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_FollowupFeeTxboxIsDisplyed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_FollowupFeeTxboxIsDisplyed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_ Followup  Fee txtbox is Displayed");
		}	
			}

		@Test(priority=162, groups= {"Functional"})
		public void manageDeptClinicFeeIntrvl_FollowupFeeTxboxIsEnabled() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvl_FollowupFeeTxboxIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_ Followup  Fee txtbox is Enabled");
		}
			}
			
		@Test(priority=163, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_NoOfVisitsAllowdTxboxTxboxIsDisplyed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_NoOfVisitsAllowdTxboxTxboxIsDisplyed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_ Number of visits allowed txtbox is Displayed");
		}	
			}

		@Test(priority=164, groups= {"Functional"})
		public void manageDeptClinicFeeIntrvl_NoOfVisitsAllowdTxboxTxboxIsEnabled() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvl_NoOfVisitsAllowdTxboxTxboxIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_ Number of visits allowed txtbox is Enabled");
		}
			}		
		
		@Test(priority=165, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_SlipTemplateDrpdwnIsDisplyed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_SlipTemplateDrpdwnIsDisplyed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_ Slip template dropdown is displayed");
		}	
			}

		@Test(priority=166, groups= {"Functional"})
		public void manageDeptClinicFeeIntrvl_SlipTemplateDrpdwnIsEnabled() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvl_SlipTemplateDrpdwnIsEnabled();
		Assert.assertTrue(flag); 
		if(flag==true){
			System.out.println("Manage Department Clinic Fee Interval_ Slip template dropdown is enabled");
		}
			}		
		
		
		@Test(priority=167, groups= {"Functional"})
		public void manageDeptClinicFeeIntrvl_SlipTemplateDrpdwnIsMultiple() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvl_SlipTemplateDrpdwnIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("Manage Department Clinic Fee Interval_ Slip template dropdown is multiple");
		}
			}
		
		@Test(priority=168, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_SaveBtnIsDisplayed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_SaveBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage billing type_edit button is displayed");
		}	
			}

		
		
		
		
		@Test(priority=169, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_SaveBtnIsEnabled() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvl_SaveBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			Thread.sleep(2000);
			CRP.manageDeptClinicFeeIntrvl_SaveBtnIsClickable();
			Thread.sleep(2000);
			WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
			String validationMsg = updateMsg.getText();
		//	Assert.assertEquals(validationMsg, "");
			System.out.println("Manage department clinic fee interval:Save btn is enabled & clickable:" + " " +validationMsg);
			CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
			Thread.sleep(2000);
		}	
			}
		
		@Test(priority=170, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_SelectDeptOnly() throws InterruptedException{
		CRP.manageDeptClinicFeeIntrvl_SelectDeptOnly();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Manage department clinic fee interval:Selected department only" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}
		
		@Test(priority=171, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_SelectDeptClinicOnly() throws InterruptedException{
		CRP.manageDeptClinicFeeIntrvl_SelectDeptClinicOnly();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Manage department clinic fee interval:Selected department & clinic" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}
		
		@Test(priority=172, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_SelectDeptClinicClinicTypeOnly() throws InterruptedException{
		CRP.manageDeptClinicFeeIntrvl_SelectDeptClinicClinicTypeOnly();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Manage department clinic fee interval:Selected department clinic & clinic type" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}

		@Test(priority=173, groups={"Functional"})
		public void enterInvalidFollowupFeeIntrvlClickSaveBtn() throws InterruptedException{
		CRP.enterInvalidFollowupFeeIntrvlClickSaveBtn();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Enter invalid follow up interval in days" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		
		@Test(priority=174, groups={"Functional"})
		public void enterValidFollowupFeeIntrvlClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String followupFeeIntrvl = xlsReader.getCellData("TestData", "FollowupFeeIntervalDays", 2);
		CRP.enterValidFollowupFeeIntrvlClickSaveBtn(followupFeeIntrvl);
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Enter Valid follow up interval in days" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		@Test(priority=175, groups={"Functional"})
		public void enterInvalidFollowupFeeClickSaveBtn () throws InterruptedException{
		CRP.enterInvalidFollowupFeeClickSaveBtn();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Enter invalid follow up fee" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}		
		
		@Test(priority=176, groups={"Functional"})
		public void enterValidFollowupFeeClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String followupFee = xlsReader.getCellData("TestData", "FollowUpFee", 2);
		CRP.enterValidFollowupFeeClickSaveBtn(followupFee);
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Enter Valid follow up fee" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		@Test(priority=177, groups={"Functional"})
		public void  enterInvalidNoOfVisitsAllowdClickSaveBtn() throws InterruptedException{
		CRP.enterInvalidNoOfVisitsAllowdClickSaveBtn();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Enter invalid number of visits allowed" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}
		
		@Test(priority=178, groups={"Functional"})
		public void enterValidNoOfVisitsAllowdClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String noOfVisitsAllowd = xlsReader.getCellData("TestData", "NoOfVisitsAllowed", 2);
		CRP.enterValidNoOfVisitsAllowdClickSaveBtn(noOfVisitsAllowd);
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Enter Valid number of visits allowed" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		@Test(priority=179, groups={"Functional"})
		public void  selectSlipTemplateClickSaveBtn() throws InterruptedException{
		CRP.selectSlipTemplateClickSaveBtn();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Select slip template and save the data as department clinic fee/interval" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		@Test(priority=180, groups={"Functional","Smoke"})
		public void  cerateDeptClinicFeeIntrvlInOneGo() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String feeIntrvl = xlsReader.getCellData("TestData", "FollowupFeeIntervalDays", 2);
			String followupFee = xlsReader.getCellData("TestData", "FollowUpFee", 2);
			String visitsAllowd = xlsReader.getCellData("TestData", "NoOfVisitsAllowed", 2);
		CRP.cerateDeptClinicFeeIntrvlInOneGo(feeIntrvl, followupFee, visitsAllowd);
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Create data as department clinic fee/interval in one go" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(3000);			
		}	
		
	
		
		
		
		@Test(priority=181, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_EditBtnIsDisplayed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_EditBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Dept Clinic Fee Intrvl_Edit Btn is displayed");
		}	
			}

		@Test(priority=182, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_EditBtnIsEnabled() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvl_EditBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CRP.manageDeptClinicFeeIntrvl_EditBtnIsClickable();
			Reporter.log("Manage Dept Clinic Fee Intrvl_Edit Btn is enabled & clickable", true);
		}	
			}
		
		
		@Test(priority=183, groups={"Functional"})
		public void editDeptClinicFeeIntrvl_RemoveFollowupIntrvalFeeVisitsAndSlipTemplate() throws InterruptedException{
		CRP.editDeptClinicFeeIntrvl_RemoveFollowupIntrvalFeeVisitsAndSlipTemplate();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Edit_Manage department clinic fee interval:Selected department only" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}
		
		@Test(priority=184, groups={"Functional"})
		public void edit_EnterInvalidFollowupFeeIntrvlClickSaveBtn() throws InterruptedException{
		CRP.edit_EnterInvalidFollowupFeeIntrvlClickSaveBtn();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Edit_Enter invalid follow up interval in days" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		
		@Test(priority=185, groups={"Functional"})
		public void edit_EnterValidFollowupFeeIntrvlClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String followupFeeIntrvl = xlsReader.getCellData("TestData", "FollowupFeeIntervalDays", 2);
		CRP.edit_EnterValidFollowupFeeIntrvlClickSaveBtn(followupFeeIntrvl);
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Edit_Enter Valid follow up interval in days" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		@Test(priority=186, groups={"Functional"})
		public void  edit_EnterInvalidFollowupFeeClickSaveBtn() throws InterruptedException{
		CRP.edit_EnterInvalidFollowupFeeClickSaveBtn();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Edit_Enter invalid follow up fee" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}		
		
		@Test(priority=187, groups={"Functional"})
		public void edit_EnterValidFollowupFeeClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String followupFee = xlsReader.getCellData("TestData", "FollowUpFee", 2);
		CRP.edit_EnterValidFollowupFeeClickSaveBtn(followupFee);
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Edit_Enter Valid follow up fee" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		@Test(priority=188, groups={"Functional"})
		public void  edit_EnterInvalidNoOfVisitsAllowdClickSaveBtn() throws InterruptedException{
		CRP.edit_EnterInvalidNoOfVisitsAllowdClickSaveBtn();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Edit_Enter invalid number of visits allowed" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}
		
		@Test(priority=189, groups={"Functional"})
		public void edit_EnterValidNoOfVisitsAllowdClickSaveBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String noOfVisitsAllowd = xlsReader.getCellData("TestData", "NoOfVisitsAllowed", 2);
		CRP.edit_EnterValidNoOfVisitsAllowdClickSaveBtn(noOfVisitsAllowd);
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Edit_Enter Valid number of visits allowed" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		@Test(priority=190, groups={"Functional"})
		public void edit_SelectSlipTemplateClickSaveBtn() throws InterruptedException{
		CRP.edit_SelectSlipTemplateClickSaveBtn();
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Edit_Select slip template and save the data as department clinic fee/interval" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		@Test(priority=191, groups={"Functional","Smoke"})
		public void editDeptClinicFeeIntrvlInOneGo() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String feeIntrvl = xlsReader.getCellData("TestData", "FollowupFeeIntervalDays", 2);
			String followupFee = xlsReader.getCellData("TestData", "FollowUpFee", 2);
			String visitsAllowd = xlsReader.getCellData("TestData", "NoOfVisitsAllowed", 2);
		CRP.editDeptClinicFeeIntrvlInOneGo(feeIntrvl, followupFee, visitsAllowd);
		Thread.sleep(2000);
		WebElement updateMsg = CRP.manageDeptClinicFeeIntrvl_PrintValMsg();
		String validationMsg = updateMsg.getText();
	//	Assert.assertEquals(validationMsg, "");
		System.out.println("Edit_ data as department clinic fee/interval in one go" + " " +validationMsg);
		CRP.manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn();
		Thread.sleep(2000);			
		}	
		
		@Test(priority=192, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_SearchTextboxIsDisplayed(){
		boolean flag = CRP.manageDeptClinicFeeIntrvl_SearchTextboxIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Dept Clinic FeeIntrvl _ Search Textbox Is Enabled is displayed");
		}	
			}

		@Test(priority=193, groups={"Functional"})
		public void manageDeptClinicFeeIntrvl_SearchTextboxIsEnabled() throws InterruptedException{
		boolean flag = CRP.manageDeptClinicFeeIntrvl_SearchTextboxIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			Reporter.log("Manage Dept Clinic FeeIntrvl _ Search Textbox Is Enabled", true);
		}		
			}
		
		
		
		
		
		@Test(priority=194, groups={"Functional"})
		public void enterInvalidDataInSearchTxtoxToSearch() throws InterruptedException{
		CRP.enterInvalidDataInSearchTxtoxToSearch();
			Reporter.log("Manage Department Clinic Fee Interval_Enter invalid data in search box to search", true);
		}		
		
		
		@Test(priority=195, groups={"Functional"})
		public void enterValidDataInSearchTxtoxToSearch() throws InterruptedException{
		CRP.enterValidDataInSearchTxtoxToSearch();
	Reporter.log("Manage Department Clinic Fee Interval_Enter invalid data in search box to search", true);
		}		
		

		@Test(priority=196, groups={"Functional"})
		public void departmentUserMappingLinkIsDisplayed(){
		boolean flag = CRP.departmentUserMappingLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping is displayed");
		}	
			}

	@Test(priority=197, groups={"Functional","Smoke"})
		public void departmentUserMappingLinkIsEnabled() throws InterruptedException{
		boolean flag = CRP.departmentUserMappingLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CRP.departmentUserMappingLinkIsClickable();
			
			 	 Thread.sleep(2000);
			List<WebElement>elements = driver.findElements(By.tagName("table"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od);
		    	} 	
			
			Reporter.log("Department User Mapping link is enabled & clickable", true);
		}	
			}	
		
	
		
		
		@Test(priority=198, groups={"Functional","Smoke"})
		public void printTotalRowCols() throws InterruptedException{
				CRP.printTotalRowCols();
				System.out.println("Total number of rows and cols are printed");
		}
		
		
		@Test(priority=199, groups={"Functional","Smoke"})
		public void printsTextInsideFirstRowCol() throws InterruptedException{
				CRP.printsTextInsideFirstRowCol();
				System.out.println("Text printed of rows & clos");
			}
		
		
		@Test(priority=200, groups={"Functional","Smoke"})
		public void getValuesOfAllRowsAndCols() throws InterruptedException{
				CRP.getValuesOfAllRowsAndCols();
				System.out.println("Text isnide all rows & clos");
			}
		
		
		
		
		
		
		@Test(priority=201, groups={"Functional"})
		public void deptUserMapping_ClicksOnUserDropdwnContainer() throws InterruptedException{
			CRP.deptUserMapping_ClicksOnUserDropdwnContainer();
			Thread.sleep(2000);
		boolean flag = CRP.deptUserMapping_SelectUserDropdwnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Select User dropdown is displayed");
		}	
			}

		@Test(priority=202, groups={"Functional"})
		public void deptUserMapping_SelectUserDropdownIsEnabled(){
		boolean flag = CRP.deptUserMapping_SelectUserDropdownIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CRP.deptUserMapping_ClicksOnUserDropdwnContainer();
			System.out.println("Department User Mapping_Select User dropdown is enabled");
		}	
			}

		
		@Test(priority=203, groups= {"Functional"},enabled=false)
		public void deptUserMapping_SelectUserDropdownIsMultiple() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_SelectUserDropdownIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("Department User Mapping_Select User dropdown is multiple");
		}
			}	
		
		
		
		@Test(priority=204, groups={"Functional"})
		public void deptUserMapping_SelectDeptDropdwnContainerIsClickable() throws InterruptedException{
			CRP.deptUserMapping_SelectDeptDropdwnContainerIsClickable();
			Thread.sleep(2000);
		boolean flag = CRP.deptUserMapping_SelectDeptDropdownIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Select Department dropdown is displayed");
		}	
			}

		@Test(priority=205, groups={"Functional"})
		public void deptUserMapping_SelectDeptDropdownIsEnabled() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_SelectDeptDropdownIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CRP.deptUserMapping_SelectDeptDropdwnContainerIsClickable();
			Thread.sleep(2000);
			System.out.println("Department User Mapping_Select Department dropdown is enabled");
		}	
			}

		@Test(priority=206, groups= {"Functional"},enabled=false)
		public void deptUserMapping_SelectDeptDropdownIsMultiple() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_SelectDeptDropdownIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("Department User Mapping_Select Department dropdown is multiple");
		}
			}	
		
		
		
		@Test(priority=207, groups={"Functional"})
		public void deptUserMapping_AddMappingBtnIsDisplayed(){
		boolean flag = CRP.deptUserMapping_AddMappingBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Add Mapping btn is displayed");
		}	
			}

		@Test(priority=208, groups={"Functional"})
		public void deptUserMapping_AddMappingBtnIsEnabled() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_AddMappingBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CRP.deptUserMapping_AddMappingBtnIsClickable();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Please Select User First.");
			Reporter.log("Alert handled : Department User Mapping_Add Mapping btn is enabled & clickable", true);
		}	
			}	
		
		
		@Test(priority=209, groups= {"Functional"})
		public void deptUserMapping_RemoveChkboxIsDisplayed() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_RemoveChkboxIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Remove Chkbox is multiple");
		}
			}	
		
		@Test(priority=210, groups={"Functional"})
		public void deptUserMapping_RemoveChkboxIsEnabled(){
		boolean flag = CRP.deptUserMapping_RemoveChkboxIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Remove Chkbox is displayed");
		}	
			}
		
		
		@Test(priority=211, groups= {"Functional"})
		public void deptUserMapping_SelectAndRemoveBtnIsDisplayed() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_SelectAndRemoveBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Select And Remove Chkbox is multiple");
		}
			}	
		
		@Test(priority=212, groups={"Functional"})
		public void deptUserMapping_SelectAndRemoveBtnIsEnabled() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_SelectAndRemoveBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CRP.deptUserMapping_SelectAndRemoveBtnIsClickable();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Please Select Mapping to Delete!!!");
			Reporter.log("Alert handled : Department User Mapping_Select And Remove Btn is enabled & clickable", true);
		}	
			}
		

		@Test(priority=213, groups= {"Functional"})
		public void deptUserMapping_SearchTxtboxIsDisplayed() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_SearchTxtboxIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Search Txtbox is displayed");
		}
			}	
		
		@Test(priority=214, groups={"Functional"})
		public void deptUserMapping_SearchTxtboxIsEnabled() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_SearchTxtboxIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			Reporter.log("Alert handled : Department User Mapping_Search Txtbox is enabled", true);
		}	
			}
		
		
		
		
		
		
		
		@Test(priority=215, groups= {"Functional"})
		public void deptUserMapping_NextPageBtnIsDisplayed() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_NextPageBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Next Page Btn is displayed");
		}
			}	
		
		
		@Test(priority=216, groups={"Functional"})
		public void deptUserMapping_NextPageBtnIsEnabled() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_NextPageBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CRP.deptUserMapping_NextPageBtnIsClickable();
			Reporter.log("Alert handled : Department User Mapping_Next page btn is enabled & clickable", true);
		}	
			}
		
		
		
		
		
		@Test(priority=217, groups= {"Functional"})
		public void deptUserMapping_PreviousPageBtnIsDisplayed() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_PreviousPageBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Previous Page Btn is displayed");
		}
			}	
		
		@Test(priority=218, groups={"Functional"})
		public void deptUserMapping_PreviousPageBtnIsEnabled() throws InterruptedException{
		boolean flag = CRP.deptUserMapping_PreviousPageBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			CRP.deptUserMapping_PreviousPageBtnIsClickable();
			Reporter.log("Alert handled : Department User Mapping_Previous page btn is enabled & clickable", true);
		}	
			}
		
		
		
		@Test(priority=219, groups= {"Functional"})
		public void departmentUserMappingLink_SelectMaxEntryDrpdwnIsDisplayed() throws InterruptedException{
		boolean flag = CRP.departmentUserMappingLink_SelectMaxEntryDrpdwnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Select Max page shown dropdown is displayed");
		}
			}	
		
		@Test(priority=220, groups={"Functional"})
		public void departmentUserMappingLink_SelectMaxEntryDrpdwnIsEnabled(){
		boolean flag = CRP.departmentUserMappingLink_SelectMaxEntryDrpdwnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Department User Mapping_Select Max page shown dropdown is enabled");
		}	
			}
		
		
		@Test(priority=221, groups= {"Functional"})
		public void departmentUserMappingLink_SelectMaxEntryDrpdwnIsMultiple() throws InterruptedException{
		boolean flag = CRP.departmentUserMappingLink_SelectMaxEntryDrpdwnIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("Department User Mapping_Select Max page shown dropdown is multiple");
		}
			}	
		
		
		
		
		
		@Test(priority=222, groups={"Functional"})
		public void deptUserMapping_SelectUserOnlyAndClickSaveBtn() throws InterruptedException{
			CRP.deptUserMapping_SelectUserOnlyAndClickSaveBtn();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Please Select Department First.");
			Reporter.log("Alert handled : Selecting only user from dropdown & click save btn", true);
		}	
			
		
		
		
		
		@Test(priority=223, groups={"Functional"})
		public void deptUserMapping_SelectDeptOnlyAndClickSaveBtn() throws InterruptedException{
			CRP.deptUserMapping_SelectDeptOnlyAndClickSaveBtn();
			Thread.sleep(2000);
			String msg = CRP.departmentUserMappingLink_PrintValMsg();
			System.out.println("Both username & department selected" + msg);
		}	
			
		
	
		
		@Test(priority=224, groups={"Functional","Smoke"})
		public void deptUserMapping_CreateMappingInOneGo() throws InterruptedException{
			CRP.deptUserMapping_CreateMappingInOneGo();
			Thread.sleep(2000);
			String msg = CRP.departmentUserMappingLink_PrintValMsg();
			System.out.println("Create mapping in one go" + msg);
		}	
		

		@Test(priority=225, groups={"Functional","Smoke"})
		public void searchDeptClicksCheckboxClicksSelectRemoveBtn() throws InterruptedException{
			xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
			String searchDept = xlsReader.getCellData("TestData", "SearchDept_DeptUserMapping", 2);
			Thread.sleep(2000);
			CRP.searchDeptClicksCheckboxClicksSelectRemoveBtn(searchDept);
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Mapping Deleted Successfully!!!");
			Reporter.log("Alert handled : Departmeent searched and removed successfully", true);
			}	
		
		
		
		
		@Test(priority=226, groups={"Functional","Smoke"})
		public void selectEntryAndCompare10Pages() throws InterruptedException{
			Thread.sleep(2000);
		Object tenRows	= CRP.selectEntryAndCompare10Pages();
			Thread.sleep(2000);
			Object twentyFiveRows	= CRP.selectEntryAndCompare25Pages();
			Thread.sleep(2000);
			
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(tenRows, twentyFiveRows);
			
			
		//	Assert.assertEquals(alertmsg, "Mapping Deleted Successfully!!!");
			Reporter.log("Data printed with 10 & 25 enteries", true);
			}		
		
		
		
		
		@Test(priority=227, groups={"Functional","Smoke"})
		public void selectEntryAndCompare25Pages() throws InterruptedException{
			Reporter.log("Data printed with 10 & 25 enteries", true);
			}		
	
		
		
		
		
}
