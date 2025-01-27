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
import nic.ehospital.qa.pages.UserPermissionForPatientUpdate;
import nic.ehospital.qa.util.TestUtil;

public class UserPermissionForPatientUpdateTest extends TestBase{

	public UserPermissionForPatientUpdateTest() throws IOException {
		super();
	}
	
	
	UserPermissionForPatientUpdate updatePermission ;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	
	
	@Test(priority=1, groups={"Functional","Smoke"})
	public void userPermissionForPatientUpdateLinkIsDisplayed() throws IOException, InterruptedException{
		updatePermission = new UserPermissionForPatientUpdate();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		Thread.sleep(2000);
		boolean flag = updatePermission.userPermissionForPatientUpdateLinkIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("User Permission For Patient Update Link Is Displayed");
		}
	}

	@Test(priority=2, groups={"Functional","Smoke"})
	public void userPermissionForPatientUpdateLinkIsEnabled() throws IOException, InterruptedException{
		boolean flag = updatePermission.userPermissionForPatientUpdateLinkIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			updatePermission.userPermissionForPatientUpdateLinkIsClickable();
			Thread.sleep(2000);
			testUtil.RightFrame();
			List<WebElement>elements = driver.findElements(By.tagName("div"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od); 	
		    }	
		    Reporter.log("User Permission For Patient Update Link is Enabled & Clickable", true);
		}
		    }
	
	
	
	@Test(priority=3, groups={"Functional"})
	public void saveBtnIsDisplayed() throws InterruptedException{
		Thread.sleep(2000);
		boolean flag = updatePermission.saveBtnIsDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Search Button is Displayed");
	}	
		}

	
	@Test(priority=4, groups={"Functional"})
	public void saveBtnIsEnabled() throws InterruptedException{
	boolean flag = updatePermission.saveBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		updatePermission.saveBtnIsClickable();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Select User !!");
		Reporter.log("Alert handled :Search Button is Enabled & clickable", true);
	}	
		}
	
	@Test(priority=5, groups={"Functional"})
	public void selectUserDrpdwnIsDisplayed() throws InterruptedException{
		boolean flag = updatePermission.selectUserDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select User Dropdown is Displayed");
	}	
		}

	
	@Test(priority=6, groups={"Functional"})
	public void selectUserDrpdwnIsEnabled(){
	boolean flag = updatePermission.selectUserDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select User Dropdown is Enabled");
	}	
		}
	
	@Test(priority=7, groups= {"Functional"})
	public void selectUserDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = updatePermission.selectUserDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select User Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	
	@Test(priority=8, groups={"Functional"})
	public void selectPermissionTypeDrpdwnIsDisplayed() throws InterruptedException{
		boolean flag = updatePermission.selectUserDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Permission Type Dropdown is Displayed");
	}	
		}

	
	@Test(priority=9, groups={"Functional"})
	public void selectPermissionTypeDrpdwnIsEnabled(){
	boolean flag = updatePermission.selectUserDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Permission Type Dropdown is Enabled");
	}	
		}
	
	@Test(priority=10, groups= {"Functional"})
	public void selectPermissionTypeDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = updatePermission.selectPermissionTypeDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Select Permission Type Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	
	
	@Test(priority=11, groups= {"Functional"})
	public void selectUserOnlyandClickSaveBtn() throws InterruptedException{
	updatePermission.selectUserOnlyandClickSaveBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please Select Permission type !!");
	Reporter.log("Alert handled:Only user selected & clicked on save btn", true);
	}
	
	
	
	@Test(priority=12, groups= {"Functional"})
	public void selectPermissionTypeOnlyandClickSaveBtn() throws InterruptedException{
	updatePermission.selectPermissionTypeOnlyandClickSaveBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	Assert.assertEquals(alertmsg, "Please Select User !!");
	Reporter.log("Alert handled:Only permission type selected & clicked on save btn", true);
	}
		
	
	@Test(priority=13, groups= {"Functional"})
	public void selectUserAndPermissionTypeBothClickSaveBtn() throws InterruptedException{
	updatePermission.selectUserAndPermissionTypeBothClickSaveBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
//	Assert.assertEquals(alertmsg, "Permission already assigned for this Employee If you want change permission please update from below!!");
	Reporter.log("Alert handled:Both user & permission type selected & clicked on save btn", true);
	}
			
	
	
	
	
	@Test(priority=14, groups={"Functional"})
	public void updateBtnIsDisplayed() throws InterruptedException{
		boolean flag = updatePermission.updateBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Select Permission Type Dropdown is Displayed");
	}	
		}

	
	@Test(priority=15, groups={"Functional"})
	public void updateBtnIsEnabled() throws InterruptedException{
	boolean flag = updatePermission.updateBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		updatePermission.updateBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please Select Permission type !!");
		Reporter.log("Alert handled:Update button is enabled & clickable", true);
	}	
		}
	
	
	
	
	@Test(priority=16, groups={"Functional"})
	public void updateNewPermissionDrpdwnIsDisplayed() throws InterruptedException{
		boolean flag = updatePermission.updateNewPermissionDrpdwnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update New Permission Dropdown is Displayed");
	}	
		}

	
	@Test(priority=17, groups={"Functional"})
	public void updateNewPermissionDrpdwnIsEnabled(){
	boolean flag = updatePermission.updateNewPermissionDrpdwnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update New Permission Dropdown is Enabled");
	}	
		}
	
	@Test(priority=18, groups= {"Functional"})
	public void updateNewPermissionDrpdwnIsMultiple() throws InterruptedException{
	boolean flag = updatePermission.updateNewPermissionDrpdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("Update New Permission Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	
	@Test(priority=19, groups= {"Functional"})
	public void updateNewPermissionFromDrpdwnAndClickUpdateBtn() throws InterruptedException{
	updatePermission.updateNewPermissionFromDrpdwnAndClickUpdateBtn();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
//	Assert.assertEquals(alertmsg, "Permission updated Successfully!");
	Reporter.log("Alert handled:Permission updated", true);
	}
	
	
	
	@Test(priority=20, groups= {"Functional","Smoke"})
	public void selectUserAndPermissonThenUpdatePermissonInOneGo() throws InterruptedException{
	updatePermission.selectUserAndPermissonThenUpdatePermissonInOneGo();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
//	Assert.assertEquals(alertmsg, "Permission already assigned for this Employee");
	Reporter.log("Alert handled:Permission provided", true);
	Thread.sleep(2000);
	updatePermission.updateNewPermissionFromDrpdwnAndClickUpdateBtn();
	Thread.sleep(2000);
	Alert alt = driver.switchTo().alert();
	String altmsg = alt.getText();
	System.out.println(altmsg);
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
//	Assert.assertEquals(alertmsg, "Permission already assigned for this Employee");
	Reporter.log("Alert handled:Permission updated", true);
	}
	


	
	
}
