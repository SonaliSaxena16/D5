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
import nic.ehospital.qa.pages.UpdateUserDisplayPicture;
import nic.ehospital.qa.util.TestUtil;

public class UpdateUserDisplayPictureTest extends TestBase{

	
	UpdateUserDisplayPicture updateUserDisplayPic ;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	
	
	public UpdateUserDisplayPictureTest() throws IOException {
		super();
	}

	@Test(priority=1, groups={"Functional","Smoke"})
	public void updateUserDisplayPicLinkIsDisplayed() throws IOException, InterruptedException{
		updateUserDisplayPic = new UpdateUserDisplayPicture();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = updateUserDisplayPic.updateUserDisplayPicLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Update User Display Picture Link Is Displayed");
		}
	}

	@Test(priority=2, groups={"Functional","Smoke"})
	public void updateUserDisplayPicLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = updateUserDisplayPic.updateUserDisplayPicLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			updateUserDisplayPic.updateUserDisplayPicLinkIsClickable();
			Thread.sleep(2000);
			testUtil.RightFrame();
			List<WebElement>elements = driver.findElements(By.tagName("html"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od); 	
		    }
		Reporter.log("Update User Display Picture Link is Enabled & Clickable", true);
		}
	}
	
	
	@Test(priority=3, groups={"Functional"})
	public void searchEmployeeTxtboxIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = updateUserDisplayPic.searchEmployeeTxtboxIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search Employee Textbox is Displayed");
	}	
		}

	
	@Test(priority=4, groups={"Functional"})
	public void searchEmployeeTxtboxIsEnabled(){
	boolean flag = updateUserDisplayPic.searchEmployeeTxtboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search Employee Textbox is Enabled");
	}	
		}
	
	
	
	@Test(priority=5, groups={"Functional"})
	public void searchBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = updateUserDisplayPic.searchBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search Button is Displayed");
	}	
		}

	
	@Test(priority=6, groups={"Functional"})
	public void searchBtnIsEnabled() throws InterruptedException{
	boolean flag = updateUserDisplayPic.searchBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		updateUserDisplayPic.searchBtnIsClickable();
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
		boolean flag = updateUserDisplayPic.selectEmployeeDrpdwnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Displayed");
	}	
		}

	
	@Test(priority=8, groups={"Functional"})
	public void selectEmployeeDrpdwnIsEnabled(){
	boolean flag = updateUserDisplayPic.selectEmployeeDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Enabled");
	}	
		}
	
	@Test(priority=9, groups= {"Functional"})
	public void selectEmployeeDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = updateUserDisplayPic.selectEmployeeDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Employee Dropdown doesn't allow to select Multiple Values");
	}
		}
	

	@Test(priority=10, groups={"Functional"})
	public void selectUserDrpdwnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = updateUserDisplayPic.selectUserDrpdwnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Displayed");
	}	
		}

	
	@Test(priority=11, groups={"Functional"})
	public void selectUserDrpdwnIsEnabled(){
	boolean flag = updateUserDisplayPic.selectUserDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Employee Dropdown is Enabled");
	}	
		}
	
	@Test(priority=12, groups= {"Functional"})
	public void selectUserDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = updateUserDisplayPic.selectUserDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Employee Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=13, groups={"Functional"})
	public void browseBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = updateUserDisplayPic.browseBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Browse Button is Displayed");
	}	
		}

	
	@Test(priority=14, groups={"Functional"})
	public void browseBtnIsEnabled() throws InterruptedException{
	boolean flag = updateUserDisplayPic.browseBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		Reporter.log("Browse Button is Enabled", true);
	}	
		}
	

	@Test(priority=15, groups={"Functional"})
	public void updateBtnIsDisplayed() throws InterruptedException{
	boolean flag = updateUserDisplayPic.updateBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update Button is Displayed");
	}	
		}

	
	@Test(priority=16, groups={"Functional"})
	public void updateBtnIsEnabled() throws InterruptedException{
	boolean flag = updateUserDisplayPic.updateBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		updateUserDisplayPic.updateBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please select employee.");
		Reporter.log("Alert handled:Update Button is Enabled & clickable", true);
	}	
		}
	
	
	@Test(priority=17, groups={"Functional"})
	public void enterInvalidEmpNameAndClickSaveBtn() throws InterruptedException{
	updateUserDisplayPic.enterInvalidEmpNameAndClickSaveBtn();
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
	
	
	
@Test(priority=18, groups={"Functional"})
public void enterValidEmpNameAndClickUpdateBtn() throws InterruptedException{

	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String empName = xlsReader.getCellData("TestData", "EmployeeName", 2);	
	
	updateUserDisplayPic.enterValidEmpNameAndClickUpdateBtn(empName);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please select employee.");
	Reporter.log("Alert handled:Valid employee name entered in textbox", true);
}	
	
	
@Test(priority=19, groups={"Functional"})
public void selectEmpFmDrpdwnAndClikUpdateBtn() throws InterruptedException{
	updateUserDisplayPic.selectEmpFmDrpdwnAndClikUpdateBtn();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please select user.");
	Reporter.log("Alert handled:Only employee name selected", true);
}	
	
	
@Test(priority=20, groups={"Functional"})
public void selectUserFmDrpdwnAndClikUpdateBtn() throws InterruptedException{
	updateUserDisplayPic.selectUserFmDrpdwnAndClikUpdateBtn();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please upload file having extensions .jpeg/.jpg/.png only.");
	Reporter.log("Alert handled:User selected without uploading image", true);
}	
	

@Test(priority=21, groups={"Functional"})
public void updateUserDisplayPic() throws InterruptedException{
	updateUserDisplayPic.updateUserDisplayPic();
	Thread.sleep(2000);
	WebElement updateMsg = updateUserDisplayPic.printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, " Successfully Saved...");
	System.out.println("Validation msg User Roled saved:"+ validationMsg);
	Reporter.log("User display picture successfully updated", true);
}	
	

@Test(priority=22, groups={"Functional","Smoke"})
public void updateUserDisplayPicInOneGo() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String empName = xlsReader.getCellData("TestData", "EmployeeName", 2);	
	updateUserDisplayPic.updateUserDisplayPicInOneGo(empName);
	Thread.sleep(2000);
	WebElement updateMsg = updateUserDisplayPic.printValidationMsg();
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Successfully Saved...");
	System.out.println("Validation msg User Roled saved:"+ validationMsg);
	Reporter.log("User display picture successfully updated in one go", true);

	}	




























	
	
}
