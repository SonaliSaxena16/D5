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

import nic.ehospital.qa.base.TestBase;
import nic.ehospital.qa.excel.XLS_Reader;
import nic.ehospital.qa.pages.AuditTrail;
import nic.ehospital.qa.pages.ConfigureServices;
import nic.ehospital.qa.util.TestUtil;

public class ConfigureServicesTest extends TestBase{

	ConfigureServices configServices;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	
	public ConfigureServicesTest() throws IOException {
		super();
	}

	
	@Test(priority=1, groups={"Functional","Smoke"})
	public void configureServicesLinkIsDisplayed() throws IOException, InterruptedException{
		configServices = new ConfigureServices();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = configServices.configureServicesLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Configure Services Link Is Displayed");
		}
	}

	@Test(priority=2, groups={"Functional","Smoke"})
	public void configureServicesLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = configServices.configureServicesLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			Thread.sleep(2000);
			configServices.configureServicesLinkIsClickable();
			Thread.sleep(2000);
			testUtil.RightFrame();
			Thread.sleep(3000);
			List<WebElement>elements = driver.findElements(By.tagName("table"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		   // 	System.out.println(od); 
		    	}
		Reporter.log("Configure Services Link is Enabled & Clickable", true);
		}
	}
	
	
	
	@Test(priority=3, groups={"Functional"})
	public void addServicCategoryBtnIsDisplayed() throws IOException, InterruptedException{
		boolean flag = configServices.addServicCategoryBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Add Service Category Button Is Displayed");
		}
	}

	@Test(priority=4, groups={"Functional"})
	public void addServicCategoryBtnIsEnabled() throws IOException, InterruptedException{
		boolean flag = configServices.addServicCategoryBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			Thread.sleep(2000);
			configServices.addServicCategoryBtnIsClickable();
			Thread.sleep(3000);
			Reporter.log("Add Service Category Button is Enabled & Clickable", true);
		}
	}
	
	
	
	
	
	@Test(priority=5, groups={"Functional"})
	public void serviceNameDropdownIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = configServices.serviceNameDropdownIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service Category_ServiceName dropdown is Displayed");
	}	
		}

	
	
	
	@Test(priority=6, groups={"Functional"})
	public void serviceNameDropdownIsEnabled(){
	boolean flag = configServices.serviceNameDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service Category_ServiceName dropdown is Enabled");
	}	
		}
	
	

	@Test(priority=7, groups= {"Functional"})
	public void serviceNameDropdownIsMultiple() throws InterruptedException{
	boolean flag = configServices.serviceNameDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Add Service Category_ServiceName dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	
	
	
	@Test(priority=8, groups={"Functional"})
	public void saveServiceBtnIsDisplayed(){
	boolean flag = configServices.saveServiceBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save service button is Displayed");
	}	
		}

	
	
	@Test(priority=9, groups={"Functional"})
	public void saveServiceBtnIsEnabled() throws InterruptedException{
	boolean flag = configServices.saveServiceBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Thread.sleep(2000);
		configServices.saveServiceBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Select Service Category");
		Reporter.log("Alert handled : Save service button is Enabled & clickable", true);
	}	
		}
	
	
	
	
	
	@Test(priority=10, groups={"Functional"})
	public void selectNotInListThenClickSaveBtn() throws InterruptedException{
	configServices.selectNotInListThenClickSaveBtn();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Enter Service Category Name");
		Reporter.log("Alert handled:Only NOT IN LIST option selected", true);
	}	
	
	
	
	
	
	
	@Test(priority=11, groups={"Functional"})
	public void addServiceNameTxtboxisDisplayed() throws IOException, InterruptedException{
		boolean flag = configServices.addServiceNameTxtboxisDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Service Name Textbox Is Displayed");
		}
	}

	@Test(priority=12, groups={"Functional"})
	public void addServiceNameTxtboxIsEnabled() throws IOException, InterruptedException{
		boolean flag = configServices.addServiceNameTxtboxIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			Reporter.log("Service Name Textbox is Enabled", true);
		}
	}
	
	
	
	
	@Test(priority=13, groups={"Functional"})
	public void enterInvalidServiceNameClickSaveBtn() throws InterruptedException{
	configServices.enterInvalidServiceNameClickSaveBtn();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Select Cash Required or Not");
		Reporter.log("Alert handled:Invalid service name entered", true);
	}	
	
	@Test(priority=14, groups={"Functional"})
	public void isCashRequiredCheckboxYesisDisplayed() throws IOException, InterruptedException{
		boolean flag = configServices.isCashRequiredCheckboxYesisDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Is cash required YES checkbox Is Displayed");
		}
	}

	@Test(priority=15, groups={"Functional"})
	public void isCashRequiredCheckboxYesIsEnabled() throws IOException, InterruptedException{
		boolean flag = configServices.isCashRequiredCheckboxYesIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			Reporter.log("Is cash required YES checkbox is Enabled", true);
		}
	}
	
	
	
	
	@Test(priority=16, groups={"Functional"})
	public void isCashRequiredCheckboxNoisDisplayed() throws IOException, InterruptedException{
		boolean flag = configServices.isCashRequiredCheckboxNoisDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Is cash required NO checkbox Is Displayed");
		}
	}

	@Test(priority=17, groups={"Functional"})
	public void isCashRequiredCheckboxNoIsEnabled() throws IOException, InterruptedException{
		boolean flag = configServices.isCashRequiredCheckboxNoIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			Reporter.log("Is cash required NO checkbox is Enabled", true);
		}
	}
	
	@Test(priority=18, groups={"Functional"})
	public void selectYesIsCashRequiredChkbox() throws IOException, InterruptedException{
		configServices.selectYesIsCashRequiredChkbox();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Updated Successfully");
		Reporter.log("Alert handled:Service saved", true);
		}
	
	
	
	@Test(priority=19, groups={"Functional"})
	public void closeServiceBtnIsDisplayed() throws IOException, InterruptedException{
		boolean flag = configServices.closeServiceBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Is cash required YES checkbox Is Selected");
		}
	}
	
	
	@Test(priority=20, groups={"Functional"})
	public void closeServiceBtnIsEnabled() throws IOException, InterruptedException{
		boolean flag = configServices.closeServiceBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			configServices.closeServiceBtnIsClickable();
			System.out.println("Is cash required YES checkbox Is Selected");
		}
	}
	
	
	
	
	//-------------------------------------
	
	
	@Test(priority=21, groups={"Functional","Smoke"})
	public void createServiceCategoryInOneGO() throws IOException, InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String serviceName = xlsReader.getCellData("TestData", "ServiceCategoryName", 2);
		configServices.createServiceCategoryInOneGO(serviceName);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Updated Successfully");
		configServices.closeServiceBtnIsClickable();
		Thread.sleep(2000);
		Reporter.log("Alert handled:Service created in one go", true);
		}
	
	
	
	

	@Test(priority=22, groups={"Functional"})
	public void selectServiceCategoryDropdownIsDisplayed(){
	boolean flag = configServices.selectServiceCategoryDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Service Category dropdown is Displayed");
	}	
		}

	
	
	@Test(priority=23, groups={"Functional"})
	public void selectServiceCategoryDropdownIsEnabled(){
	boolean flag = configServices.selectServiceCategoryDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Service Category dropdown is Enabled");
	}	
		}
	
	

	@Test(priority=24, groups= {"Functional"})
	public void selectServiceCategoryDropdownIsMultiple() throws InterruptedException{
	boolean flag = configServices.selectServiceCategoryDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Service Category dropdown doesn't allow to select Multiple Values");
	}
		}
		
		
	
	
	@Test(priority=25, groups={"Functional"})
	public void addServiceBtnIsDisplayed(){
	boolean flag = configServices.addServiceBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Servie Button is Displayed");
	}	
		}

	
	
	
	
	@Test(priority=26, groups={"Functional"})
	public void addServiceBtnIsEnabled() throws InterruptedException{
	Thread.sleep(2000);
	boolean flag = configServices.addServiceBtnIsEnabled();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		Reporter.log("Alert handled:Add Service button is Enabled", true);
	}	
		}
	
	
	@Test(priority=27, groups={"Functional"})
	public void addServiceBtnIsClickable() throws InterruptedException{
	Thread.sleep(2000);
	configServices.addServiceBtnIsClickable();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please Select a Service Category first");
	Reporter.log("Alert handled:Add Service button is clickable", true);
	}	
	
	
	
	@Test(priority=28, groups={"Functional"})
	public void selectServiceNameFromServiceCategoryDrpdwn() throws InterruptedException{
	configServices.selectServiceNameFromServiceCategoryDrpdwn();
	}	
	

	
	@Test(priority=29, groups={"Functional"})
	public void addService_ServiceNameDropdownIsDisplayed(){
	boolean flag = configServices.addService_ServiceNameDropdownIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Service Name dropdown is Displayed");
	}	
		}

	
	
	@Test(priority=30, groups={"Functional"})
	public void addService_ServiceNameDropdownIsEnabled(){
	boolean flag = configServices.addService_ServiceNameDropdownIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Service Name dropdown is Enabled");
	}	
		}
	
	

	@Test(priority=31, groups= {"Functional"})
	public void addService_ServiceNameDropdownIsMultiple() throws InterruptedException{
	boolean flag = configServices.addService_ServiceNameDropdownIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Add Service_Service Name dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=32, groups={"Functional"})
	public void addService_SaveServiceBtnIsDisplayed(){
	boolean flag = configServices.addService_SaveServiceBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Save Service Btn is Displayed");
	}	
		}

	
	
	@Test(priority=33, groups={"Functional"})
	public void addService_SaveServiceBtnIsEnabled() throws InterruptedException{
	boolean flag = configServices.addService_SaveServiceBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		configServices.addService_SaveServiceBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select Service Name");
		Thread.sleep(2000);
		Reporter.log("Alert handled:Save Service button clicked without selecting service name", true);
		System.out.println("Add Service_Save Service Btn is Enable & Clickable");
	}	
		}
	
	
	@Test(priority=34, groups={"Functional"})
	public void addService_SelectServiceNameFromDrpdwn() throws InterruptedException{
	Thread.sleep(2000);
	configServices.addService_SelectServiceNameFromDrpdwn();
	 Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Enter Service Name");
		Reporter.log("Alert handled:Save Service button clicked without selecting service name", true);
		Thread.sleep(3000);
		}
	
	
	
	
	
	
	@Test(priority=35, groups={"Functional"})
	public void addService_EnterInvalidServiceNameClickSaveBtn() throws InterruptedException{
	Thread.sleep(2000);
	configServices.addService_EnterInvalidServiceNameClickSaveBtn();
	 Thread.sleep(2000);
	 Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Select Sample Based or Not");
		Reporter.log("Alert handled:Save Service button clicked without selecting service name", true);
		Thread.sleep(3000);
		}
	
	
	
	
	@Test(priority=36, groups={"Functional"})
	public void addService_SampleBasedYesChkboxIsDisplayed(){
	boolean flag = configServices.addService_SampleBasedYesChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Sample Based Yes checkbox is Displayed");
	}	
		}

	
	
	@Test(priority=37, groups={"Functional"})
	public void addService_SampleBasedYesChkboxIsEnabled(){
	boolean flag = configServices.addService_SampleBasedYesChkboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Sample Based Yes checkbox is Enabled");
	}	
		}
	
	
	@Test(priority=38, groups={"Functional"})
	public void addService_SampleBasedNoChkboxIsDisplayed(){
	boolean flag = configServices.addService_SampleBasedNoChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Sample Based No checkbox is Displayed");
	}	
		}

	
	
	@Test(priority=39, groups={"Functional"})
	public void addService_SampleBasedNoChkboxIsEnabled(){
	boolean flag = configServices.addService_SampleBasedNoChkboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Sample Based No checkbox is Enabled");
	}	
		}
	
	
	
	@Test(priority=40, groups={"Functional"})
	public void addService_ClicksOnSampleBasedNoChkbox() throws InterruptedException{
	 configServices.addService_ClicksOnSampleBasedNoChkbox();
	 Thread.sleep(2000);
	 boolean flag = configServices.addService_SampleBasedNoChkboxIsSelected();
		Assert.assertTrue(flag);
		if(flag==true){
			Reporter.log("Sample Based NO checkbox is Selected", true);
		//	System.out.println("Sample Based is selected");
			configServices.addService_SaveServiceBtnIsClickable();
			 Thread.sleep(2000);
			 Alert alert = driver.switchTo().alert();
				String alertmsg = alert.getText();
				System.out.println(alertmsg);
				Thread.sleep(2000);
				alert.accept();
				Thread.sleep(2000);
				Assert.assertEquals(alertmsg, "Please Select Service Type");
				Reporter.log("Alert handled:Save Service button clicked without selecting service name", true);
		}	
	}
	
	
	@Test(priority=41, groups={"Functional"})
	public void addService_ServiceTypeBillingChkboxIsDisplayed(){
	boolean flag = configServices.addService_ServiceTypeBillingChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Service Type Billing checkbox is Displayed");
	}	
		}

	
	
	@Test(priority=42, groups={"Functional"})
	public void addService_ServiceTypeBillingChkboxIsEnabled(){
	boolean flag = configServices.addService_ServiceTypeBillingChkboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Service Type Billing checkbox is Enabled");
	}	
		}
	
	
	
	@Test(priority=43, groups={"Functional"})
	public void addService_SelectsServiceTypeBillingClickSaveBtn() throws InterruptedException{
	 configServices.addService_SelectsServiceTypeBillingClickSaveBtn();
	 Thread.sleep(2000);
	 configServices.addService_SaveServiceBtnIsClickable();
	 Thread.sleep(2000);
	 Alert alert = driver.switchTo().alert();
	 String alertmsg = alert.getText();
	 System.out.println(alertmsg);	
	 Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please Select Cash Required or Not");
	Reporter.log("Alert handled:Service Type Billing Selected", true);
	
	 
		 
		 /*boolean flag = configServices.addService_ServiceTypeBillingChkboxIsSelected();
			Assert.assertTrue(flag);
			if(flag==true){
			//	Reporter.log("Service Type Billing Checkbox is Selected", true);
					System.out.println("Sample Based is selected");
					configServices.addService_SaveServiceBtnIsClickable();
		 Thread.sleep(2000);}
		 Alert alert = driver.switchTo().alert();
		 String alertmsg = alert.getText();
		 System.out.println(alertmsg);	
		 Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Select Cash Required or Not");
		Reporter.log("Alert handled:Service Type Billing Selected", true);
		*/
		 
	}
	
	
	
	
	
	
	
	@Test(priority=44, groups={"Functional"})
	public void addService_IsCashRequiredYesChkboxIsDisplayed(){
	boolean flag = configServices.addService_IsCashRequiredYesChkboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Is Cash Required Yes checkbox is Displayed");
	}	
		}

	
	@Test(priority=45, groups={"Functional"})
	public void addService_IsCashRequiredYesChkboxIsEnabled(){
	boolean flag = configServices.addService_IsCashRequiredYesChkboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Service_Is Cash Reuired Yes checkbox is Enabled");
	}	
		}
	
	
	
	@Test(priority=46, groups={"Functional"})
	public void addService_SelectIsCashRequiredYesChkboxClickSaveBtn() throws InterruptedException{
		
		Thread.sleep(2000);
		configServices.addService_SelectIsCashRequiredYesChkboxClickSaveBtn();
		Thread.sleep(2000);
		configServices.addService_SaveServiceBtnIsClickable();
		Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		 String alertmsg = alert.getText();
		 System.out.println(alertmsg);	
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Service Already in List.. Try Again");
		Reporter.log("Alert handled:Service Type Billing Selected", true);
	}
	
	
	
	@Test(priority=47, groups={"Functional"})
	public void addService_closeServiceBtnIsDisplayed() throws IOException, InterruptedException{
		boolean flag = configServices.addService_closeServiceBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Add Service_Close Button Is Displayed");
		}
	}

	@Test(priority=48, groups={"Functional"})
	public void addService_closeServiceBtnIsEnabled() throws IOException, InterruptedException{
		boolean flag = configServices.addService_closeServiceBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			configServices.addService_closeServiceBtnIsClickable();
			Thread.sleep(3000);
			Reporter.log("Add Service_Close Button is Enabled & Clickable", true);
		}
	}
	
	
	@Test(priority=49, groups={"Functional","Smoke"})
	public void addServiceInOneGo() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String serviceName = xlsReader.getCellData("TestData", "ServiceName", 2);
//	configServices.addServiceBtnIsClickable();
//	Thread.sleep(2000);
	configServices.addServiceInOneGo(serviceName);
	 Thread.sleep(2000);
	 Alert alert = driver.switchTo().alert();
	 String alertmsg = alert.getText();
	 System.out.println(alertmsg);	
	 Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Service Already in List.. Try Again");
	Reporter.log("Alert handled:Service Type Billing Selected", true);
	Thread.sleep(2000);
	configServices.addService_closeServiceBtnIsClickable();
	Thread.sleep(2000);
	}

	


	

}
