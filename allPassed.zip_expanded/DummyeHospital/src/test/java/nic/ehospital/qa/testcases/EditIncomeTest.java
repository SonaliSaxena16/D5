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
import nic.ehospital.qa.pages.EditIncome;
import nic.ehospital.qa.pages.UpdatePatientData;
import nic.ehospital.qa.util.TestUtil;

public class EditIncomeTest extends TestBase{

	EditIncome editIncome ;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	
	public EditIncomeTest() throws IOException {
		super();
	}

	
	@Test(priority=1, groups={"Functional","Smoke"})
	public void editIncomeLinkIsDisplayed() throws IOException, InterruptedException{
		editIncome = new EditIncome();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = editIncome.editIncomeLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Edit Income Link Is Displayed");
		}
	}

	@Test(priority=2, groups={"Functional","Smoke"})
	public void editIncomeLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = editIncome.editIncomeLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			editIncome.editIncomeLinkIsClickable();
			Thread.sleep(2000);
			testUtil.RightFrame();
			List<WebElement>elements = driver.findElements(By.tagName("table"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od); 	
		    }	
		    Reporter.log("Edit Income Link is Enabled & Clickable", true);
		}
		    }
	
	
	
	@Test(priority=3, groups={"Functional"})
	public void enterUhidTxtboxIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = editIncome.enterUhidTxtboxIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Enter UHID textbox is Displayed");
	}	
		}


	
	
	@Test(priority=4, groups={"Functional"})
	public void enterUhidTxtboxIsEnabled(){
	boolean flag = editIncome.enterUhidTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Enter UHID textbox is Enabled");
	}	
		}
	
	
	
	@Test(priority=5, groups={"Functional"})
	public void searchBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = editIncome.searchBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search Button is Displayed");
	}	
		}

	
	@Test(priority=6, groups={"Functional"})
	public void searchBtnIsEnabled() throws InterruptedException{
	boolean flag = editIncome.searchBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		editIncome.searchBtnIsClickable();
		Thread.sleep(2000);
		WebElement updateMsg = editIncome.printValidationMsg();
		String validationMsg = updateMsg.getText();
		Assert.assertEquals(validationMsg, "Invalid Data Entered! Please try Again.");
		System.out.println("Clicked on search btn wihout entering UHID:"+ validationMsg);
	}	
		}
	
	
	
	@Test(priority=7, groups={"Functional"})
	public void enterUhidToFetchBillingType() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String uhid = xlsReader.getCellData("TestData", "UHID", 2);	
	editIncome.enterUhidToFetchBillingType(uhid);
	}	
	
	
	
	@Test(priority=8, groups={"Functional"})
	public void newBillingTypeDrpdwnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = editIncome.newBillingTypeDrpdwnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("New Billing Type Dropdown is Displayed");
	}	
		}

	
	@Test(priority=9, groups={"Functional"})
	public void newBillingTypeDrpdwnIsEnabled(){
	boolean flag = editIncome.newBillingTypeDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("New Billing Type Dropdown is Enabled");
	}	
		}
	
	@Test(priority=10, groups= {"Functional"})
	public void newBillingTypeDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = editIncome.newBillingTypeDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("New Billing Type Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	
	@Test(priority=11, groups={"Functional"})
	public void remarksTxtboxIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = editIncome.remarksTxtboxIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Remarks textbox is Displayed");
	}	
		}


	
	
	@Test(priority=12, groups={"Functional"})
	public void remarksTxtboxIsEnabled(){
	boolean flag = editIncome.remarksTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Remarks textbox is Enabled");
	}	
		}
	
	
	@Test(priority=13, groups={"Functional"})
	public void updateBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = editIncome.updateBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update Button is Displayed");
	}	
		}

	
	@Test(priority=14, groups={"Functional"})
	public void updateBtnIsEnabled() throws InterruptedException{
	boolean flag = editIncome.updateBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		editIncome.updateBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter remarks");
		Reporter.log("Alert handled:Update Button is Enabled & clickable", true);
	}	
		}
	
	
	
	
	@Test(priority=15, groups={"Functional"})
	public void enterInvalidRemarksandClickUpdtBtn() throws InterruptedException{
	editIncome.enterInvalidRemarksAndClickUpdtBtn();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter a valid remarks");
		Reporter.log("Alert handled:Update Button is Enabled & clickable", true);
	}	
	
	
	@Test(priority=16, groups={"Functional"})
	public void enterValidRemarksAndChngBillingType() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String remarks = xlsReader.getCellData("TestData", "Remarks", 2);	
	//	String cardNo = xlsReader.getCellData("TestData", "CardNumber", 2);	
		
		editIncome.enterValidRemarksAndChngBillingType(remarks);
		
		/*Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Updation of Other Data successful");
		Reporter.log("Alert handled:Billing type updated", true);
*/	
		}	
	
	
	
	@Test(priority=17, groups={"Functional"})
	public void verifiedByDrpdwnIsDisplayed() throws InterruptedException{
		boolean flag = editIncome.verifiedByDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Verified By Dropdown is Displayed");
	}	
		}

	
	@Test(priority=18, groups={"Functional"})
	public void verifiedByDrpdwnIsEnabled(){
	boolean flag = editIncome.verifiedByDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Verified By Dropdown is Enabled");
	}	
		}
	
	@Test(priority=19, groups= {"Functional"})
	public void verifiedByDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = editIncome.verifiedByDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Verified By Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	
	@Test(priority=20, groups={"Functional"})
	public void cardNoTxtboxIsDisplayed() throws InterruptedException{
		boolean flag = editIncome.cardNoTxtboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Card number textbox is Displayed");
	}	
		}


	
	
	@Test(priority=21, groups={"Functional"})
	public void cardNoTxtboxIsEnabled(){
	boolean flag = editIncome.cardNoTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Card number textbox is Enabled");
	}	
		}
	

	@Test(priority=22, groups={"Functional"})
	public void selectVerifiedByandCardNo() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String cardNo = xlsReader.getCellData("TestData", "CardNumber", 3);		
		editIncome.selectVerifiedByandCardNo(cardNo);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Updation of Other Data successful");
		Reporter.log("Alert handled:Billing type updated in one go", true);
	}	
	
	
	@Test(priority=23, groups={"Functional","Smoke"})
	public void updateBillingTypeInOneGo() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String uhid = xlsReader.getCellData("TestData", "UHID", 2);	
		String remarks = xlsReader.getCellData("TestData", "Remarks", 3);	
		String cardNo = xlsReader.getCellData("TestData", "CardNumber", 3);		
		editIncome.updateBillingTypeInOneGo(uhid, remarks, cardNo);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Updation of Other Data successful");
		Reporter.log("Alert handled:Billing type updated in one go", true);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
