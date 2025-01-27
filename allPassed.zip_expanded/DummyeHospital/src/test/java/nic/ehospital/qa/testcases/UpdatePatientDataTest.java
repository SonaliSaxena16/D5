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
import nic.ehospital.qa.pages.UpdatePatientData;
import nic.ehospital.qa.pages.UserVsBillingTypeMapping;
import nic.ehospital.qa.util.TestUtil;

public class UpdatePatientDataTest extends TestBase{
	
	UpdatePatientData patDataAdmin ;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	

	public UpdatePatientDataTest() throws IOException {
		super();
	}

	
	@Test(priority=1, groups={"Functional","Smoke"})
	public void patientDataAdministrationLinkIsDisplayed() throws IOException, InterruptedException{
		patDataAdmin = new UpdatePatientData();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = patDataAdmin.patientDataAdministrationLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Patient Data Administration Link Is Displayed");
		}
	}

	@Test(priority=2, groups={"Functional","Smoke"})
	public void patientDataAdministrationLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = patDataAdmin.patientDataAdministrationLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			patDataAdmin.patientDataAdministrationLinkIsClickable();
		 }
		Reporter.log("Patient Data Administration Link is Enabled & Clickable", true);
		}
	
	
	
	
	@Test(priority=3, groups={"Functional","Smoke"})
	public void updatePatientDataLinkIsDisplayed() throws IOException, InterruptedException{
		Thread.sleep(2000);
		boolean flag = patDataAdmin.updatePatientDataLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Update Patient Data Link Is Displayed");
		}
	}

	@Test(priority=4, groups={"Functional","Smoke"})
	public void updatePatientDataLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = patDataAdmin.updatePatientDataLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			patDataAdmin.updatePatientDataLinkIsClickable();
			Thread.sleep(2000);
			testUtil.RightFrame();
			Thread.sleep(2000);
			List<WebElement>elements = driver.findElements(By.tagName("center"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od); 	
		    }
		    Reporter.log("Update Patient Data Link is Enabled & Clickable", true);
		}}
	
	
	
	
	@Test(priority=5, groups={"Functional"})
	public void registratinNoTxtboxIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = patDataAdmin.registratinNoTxtboxIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Registration number textbox is Displayed");
	}	
		}


	
	
	@Test(priority=6, groups={"Functional"})
	public void registratinNoTxtboxIsEnabled(){
	boolean flag = patDataAdmin.registratinNoTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Registration number textbox is Enabled");
	}	
		}
	
	
	@Test(priority=7, groups={"Functional"})
	public void searchPatientBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = patDataAdmin.searchPatientBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search Button is Displayed");
	}	
		}

	
	@Test(priority=8, groups={"Functional"})
	public void searchPatientBtnIsEnabled() throws InterruptedException{
	boolean flag = patDataAdmin.searchPatientBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		patDataAdmin.searchPatientBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Provide At Least One Search Criteria");
		Reporter.log("Alert handled :Search Button is Enabled & clickable", true);
	}	
		}
	
	
	@Test(priority=9, groups={"Functional"})
	public void initialsDrpdwnIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.initialsDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Initials dropdown displayed");
	}}

	@Test(priority=10, groups={"Functional"})
	public void initialsDrpdwnIsEnabled(){
	boolean flag = patDataAdmin.initialsDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Initials dropdown enabled");
	}	
	}

	@Test(priority=11, groups= {"Functional"})
	public void initialsDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = patDataAdmin.initialsDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Initials Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	
	@Test(priority=12, groups={"Functional"})
	public void firstNameTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.firstNameTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("First Name textbox is displayed");
	}}

	@Test(priority=13, groups={"Functional"})
	public void firstNameTxtboxIsEnabled(){
	boolean flag = patDataAdmin.firstNameTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("First Name textbox is enabled");
	}	
	}
	
	
	@Test(priority=14, groups={"Functional"})
	public void middleNameTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.middleNameTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Middle Name textbox is displayed");
	}}

	@Test(priority=15, groups={"Functional"})
	public void middleNameTxtboxIsEnabled(){
	boolean flag = patDataAdmin.middleNameTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Middle Name textbox is enabled");
	}	
	}
	
	
	@Test(priority=16, groups={"Functional"})
	public void lastNameTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.lastNameTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Last Name textbox is displayed");
	}}

	@Test(priority=17, groups={"Functional"})
	public void lastNameTxtboxIsEnabled(){
	boolean flag = patDataAdmin.lastNameTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Last Name textbox is enabled");
	}	}
	
	
	
	@Test(priority=18, groups={"Functional"})
	public void ageInYrsTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.ageInYrsTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Age in years textbox is displayed");
	}}

	@Test(priority=19, groups={"Functional"})
	public void ageInYrsTxtboxIsEnabled(){
	boolean flag = patDataAdmin.ageInYrsTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Age in years textbox is enabled");
	}	}	
	
	
	
	@Test(priority=20, groups={"Functional"})
	public void ageInMonthTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.ageInMonthTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Age in months textbox is displayed");
	}}

	@Test(priority=21, groups={"Functional"})
	public void ageInMonthTxtboxIsEnabled(){
	boolean flag = patDataAdmin.ageInMonthTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Age in months textbox is enabled");
	}	}	
	
	
	@Test(priority=22, groups={"Functional"})
	public void ageInDaysTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.ageInDaysTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Age in days textbox is displayed");
	}}

	@Test(priority=23, groups={"Functional"})
	public void ageInDaysTxtboxIsEnabled(){
	boolean flag = patDataAdmin.ageInDaysTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Age in days textbox is enabled");
	}	}	
	
	
	
	@Test(priority=24, groups={"Functional"})
	public void mobileNoTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.mobileNoTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Mobile number textbox is displayed");
	}}

	@Test(priority=25, groups={"Functional"})
	public void mobileNoTxtboxIsEnabled(){
	boolean flag = patDataAdmin.mobileNoTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Mobile number textbox is enabled");
	}	}	
	
	
	
	@Test(priority=26, groups={"Functional"})
	public void mlcDrpdwnIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.mlcDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("MLC dropdown is displayed");
	}}

	@Test(priority=27, groups={"Functional"})
	public void mlcDrpdwnIsEnabled(){
	boolean flag = patDataAdmin.mlcDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("MLC dropdown is enabled");
	}	}	
	

	@Test(priority=28, groups= {"Functional"})
	public void mlcDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = patDataAdmin.mlcDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("MLC Dropdown doesn't allow to select Multiple Values");
	}
		}	
	
	
	@Test(priority=29, groups={"Functional"})
	public void addressLine1TxtboxIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.addressLine1TxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Address line 1 textbox is displayed");
	}}

	@Test(priority=30, groups={"Functional"})
	public void addressLine1TxtboxIsEnabled(){
	boolean flag = patDataAdmin.addressLine1TxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Address line 1 textbox is enabled");
	}	}	
	
	
	@Test(priority=31, groups={"Functional"})
	public void addressLine2TxtboxIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.addressLine2TxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Address line 2 textbox is displayed");
	}}
	

	@Test(priority=32, groups={"Functional"})
	public void addressLine2TxtboxIsEnabled(){
	boolean flag = patDataAdmin.addressLine2TxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Address line 2 textbox is enabled");
	}	}	
	
	
	@Test(priority=33, groups={"Functional"})
	public void fathersNameTxtboxIsDisplayed() throws InterruptedException{
	boolean flag = patDataAdmin.fathersNameTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Father's Name textbox is displayed");
	}}
	

	@Test(priority=34, groups={"Functional"})
	public void fathersNameTxtboxIsEnabled(){
	boolean flag = patDataAdmin.fathersNameTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Father's Name textbox is enabled");
	}	}	
	
	
	@Test(priority=35, groups={"Functional"})
	public void enterUhidToReflectUpdatePatDetailsBtn() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String uhid = xlsReader.getCellData("TestData", "UHID", 2);
		patDataAdmin.enterUhidToReflectUpdatePatDetailsBtn(uhid);
		System.out.println("Address line 2 textbox is enabled");
	}		
	
	
	@Test(priority=36, groups={"Functional"})
	public void updatePatientDetailsBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = patDataAdmin.updatePatientDetailsBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update Patient Details Button is Displayed");
	}	
		}

	
	
	@Test(priority=37, groups={"Functional"})
	public void updatePatientDetailsBtnIsEnabled() throws InterruptedException{
	boolean flag = patDataAdmin.updatePatientDetailsBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		patDataAdmin.updatePatientDetailsBtnIsClickable();
		/*Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter patient first name.");
	
		Reporter.log("Alert handled :Update Patient Details Button is Enabled", true);
	*/
		}	
		}
	
	
	@Test(priority=38, groups={"Functional"})
	public void clearAllMandatoryFieldsThenClickUpdatePatientDetailsBtn() throws InterruptedException{
	patDataAdmin.clearAllMandatoryFieldsThenClickUpdatePatientDetailsBtn();
	Thread.sleep(2000);
	patDataAdmin.updatePatientDetailsBtnIsClickable();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter patient first name.");
	Reporter.log("Alert handled :Update Patient Details Button is Enabled", true);
	}	
	
	
	@Test(priority=39, groups={"Functional"})
	public void enterInvalidFstMiddleLastName() throws InterruptedException{
	patDataAdmin.enterInvalidFstMiddleLastName();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter a valid patient first name.");
	Reporter.log("Alert handled:Invalid first, middle & last name", true);
	}	 
	
	
	@Test(priority=40, groups={"Functional"})
	public void enterValidFirstName() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String fstName = xlsReader.getCellData("TestData", "FirstName", 2);	
	patDataAdmin.enterValidFirstName(fstName);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter a valid patient middle name.");
	Reporter.log("Alert handled:Valid First name entered with invalid middlee & last name", true);
	}	 
	
	
	@Test(priority=41, groups={"Functional"})
	public void enterValidMiddleName() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String middlName = xlsReader.getCellData("TestData", "MiddleName", 2);	
	patDataAdmin.enterValidMiddleName(middlName);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter a valid patient last name.");
	Reporter.log("Alert handled:Valid First & middle name entered with invalid last name", true);
	}	 
	
	
	@Test(priority=42, groups={"Functional"})
	public void enterValidLastName() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String lastName = xlsReader.getCellData("TestData", "LastName", 2);	
	patDataAdmin.enterValidLastName(lastName);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter patient age in year.");
	Reporter.log("Alert handled:Valid First, middle & last name", true);
	}	 
	
	
	@Test(priority=43, groups={"Functional"})
	public void enterAgeInYrsOnly() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String age = xlsReader.getCellData("TestData", "Age", 2);	
	patDataAdmin.enterAgeInYrsOnly(age);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter patient age in month.");
	Reporter.log("Alert handled:Age in Years entered", true);
	}	 
	
	
	@Test(priority=44, groups={"Functional"})
	public void enterAgeInMonths() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String age = xlsReader.getCellData("TestData", "Age", 2);	
	patDataAdmin.enterAgeInMonths(age);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter patient age in day.");
	Reporter.log("Alert handled:Age in Months entered", true);
	}	
	
	
	@Test(priority=45, groups={"Functional"})
	public void enterAgeInDays() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String age = xlsReader.getCellData("TestData", "Age", 2);	
	patDataAdmin.enterAgeInDays(age);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter address line1.");
	Reporter.log("Alert handled:Age in days entered", true);
	}	
	
	
	@Test(priority=46, groups={"Functional"})
	public void enterInvalidAddLine1() throws InterruptedException{
	patDataAdmin.enterInvalidAddLine1();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter a valid address line1.");
	Reporter.log("Alert handled:Age in days entered", true);
	}	
	
	
	@Test(priority=47, groups={"Functional"})
	public void enterValidAddLine1AndInvalidAddLine2() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String address1 = xlsReader.getCellData("TestData", "AddressLine1", 2);
	patDataAdmin.enterValidAddLine1AndInvalidAddLine2(address1);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter a valid address line2.");
	Reporter.log("Alert handled:Age in days entered", true);
	}	
	

	@Test(priority=48, groups={"Functional"})
	public void enterValidAddLine1AndAddLine2() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String address2 = xlsReader.getCellData("TestData", "AddressLine2", 2);
	patDataAdmin.enterValidAddLine1AndAddLine2(address2);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please enter father's name.");
	Reporter.log("Alert handled:Age in days entered", true);
	}	
	
	
	
	@Test(priority=49, groups={"Functional"})
	public void enterFatherNameAndMobile() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String fathrName = xlsReader.getCellData("TestData", "FathersName", 2);
		String mobile = xlsReader.getCellData("TestData", "MobileNo", 2);
	patDataAdmin.enterFatherNameAndMobile(fathrName, mobile);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Patient Record Updated Successfully!!!");
	Reporter.log("Alert handled:Age in days entered", true);
	}	
		
	
	@Test(priority=50, groups={"Functional","Smoke"})
	public void updatePatDetailsInOneGo() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String uhid = xlsReader.getCellData("TestData", "UHID", 2);
		String fstName = xlsReader.getCellData("TestData", "FirstName", 2);
		String middlName = xlsReader.getCellData("TestData", "MiddleName", 2);
		String lastName = xlsReader.getCellData("TestData", "LastName", 2);
		
		String ageY = xlsReader.getCellData("TestData", "Age", 2);
		String ageM = xlsReader.getCellData("TestData", "Age", 2);
		String ageD = xlsReader.getCellData("TestData", "Age", 2);
		
		
		String address1 = xlsReader.getCellData("TestData", "AddressLine1", 2);
		String address2 = xlsReader.getCellData("TestData", "AddressLine2", 2);
		
		String fathrName = xlsReader.getCellData("TestData", "FathersName", 2);
		
		String mobile = xlsReader.getCellData("TestData", "MobileNo", 2);
		patDataAdmin.enterUhidToReflectUpdatePatDetailsBtn(uhid);
		Thread.sleep(2000);
		patDataAdmin.clearAllMandatoryFieldsThenClickUpdatePatientDetailsBtn();
		Thread.sleep(2000);
		patDataAdmin.updatePatDetailsInOneGo(fstName, middlName, lastName, ageY, ageM, ageD, mobile, address1, address2, fathrName);
		Thread.sleep(2000);
	
	/*Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Patient Record Updated Successfully!!!");*/
		
	Reporter.log("Alert handled:Age in days entered", true);
	}	
		
	
	
	
	
	
	
	
	
	
}
