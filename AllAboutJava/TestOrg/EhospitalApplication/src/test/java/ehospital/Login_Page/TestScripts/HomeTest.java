package ehospital.Login_Page.TestScripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.Home;
import ehospital.Billing_Module.helper.Login;
import ehospital.Login_Page.Objects.HomePage;
import in.nic.ehospial.generic.BaseClass;

public class HomeTest extends BaseClass {
	Home hf;
	Login lf;
	HomeTest ht;
	@Test(priority = 1,groups = {"Functional","Smoke"})
	public void Adminlinkdisplayed() throws InterruptedException, IOException {
		 hf = new Home(driver);
		lf = new Login(driver);
		 ht = new HomeTest();
		//HomePage hp = new HomePage(driver);
		
		
		hf.ClickonAdministrationTab();
		
		delay();
		HandleAlert();
		delay();
		switchToNewWindow();
		//WindowHandle.SelectChildwindow();
		
		delay();
		
		
		ht.switchtoLeftFrame();

		/*driver.switchTo().frame(driver.findElement(By.id("ehosfrm")));
		driver.switchTo().frame(driver.findElement(By.xpath ("/html/frameset/frameset/frame[1]")));*/
		
		//switchtoLeftFrame();
		//selectframe.selectLeftframe();
		
		delay();
		boolean adminlink = hf.valiadateAdminlinkisdisplayed();
		Assert.assertTrue(adminlink);
		if(adminlink == true) {
			System.out.println("Admin module link is displayed");}
		else {System.out.println("Admin module link is not displayed");}
		}
	
	@Test(priority = 2,groups = {"Functional","Smoke"})
	public void ClickonAdminmoduleandcheckenabled() throws InterruptedException {
		delay();
		hf.selectadminmodule();
		
		boolean adminlink1 = hf.valiadateAdminlinkisenabled();
		Assert.assertTrue(adminlink1);
		if(adminlink1 == true) {
			System.out.println("Admin module link is enabled");}
		else {System.out.println("Admin module link is not enabled");}
	}
	@Test(priority = 3,groups = {"Functional","Smoke"})
	public void configurelinkdisplayed() {
	boolean Configlink = hf.validateconfigurelinkisdisplayed();
	Assert.assertTrue(Configlink);
	if(Configlink == true) {
		System.out.println("config link is displayed");}
	else {System.out.println("config link is not displayed");}	
		}
	
	@Test(priority = 4,groups = {"Functional","Smoke"})
	public void clickonconfiglinkandcheckenabled() throws InterruptedException {
	delay();
	hf.selectconfiglink();
	
	boolean Configlink1 = hf.validateconfigurelinkisenabled();
	Assert.assertTrue(Configlink1);
	if(Configlink1 == true) {
		System.out.println("config link is enabled");}
	else {System.out.println("config link is not enabled");}	
	}
	
	@Test(priority = 5,groups = {"Functional","Smoke"})
	public void configureOPDRegisterlinkisdisplayed() {
	boolean configureOPDRegister = hf.valiadteconfigureOPDRegisterlinkisdisplayed();
	Assert.assertTrue(configureOPDRegister);
	if(configureOPDRegister == true) {
		System.out.println("configure OPD Register link is displayed");}
	else{System.out.println("configure OPD Register link is not displayed");}
	}
	
	@Test(priority = 6,groups = {"Functional","Smoke"})
	public void clickonconfigureOPDRegisterlinkandcheckenabled() throws InterruptedException {
	delay();
	hf.selectconfigureOPDRegisterlink();
		
	boolean configureOPDRegister1 = hf.validateconfigureOPDRegisterlinkisenabled();
	Assert.assertTrue(configureOPDRegister1);
	if(configureOPDRegister1 == true) {
			System.out.println("configure OPD Register link is enabled");}
	else{System.out.println("configure OPD Register link is not enabled");}
		
	}
	@Test(priority = 7,groups = {"Functional","Smoke"})
	public void ValidateCONFIGUREREGISTRATIONTEMPLATETabisenabled() throws InterruptedException {
		
		ht.switchtoinnerRightFrame();
		//switchtoRightFrame();
		//selectframe.selectRightframe();
		boolean CONFIGUREREGISTRATIONTEMPLATETab = hf.ValidateCONFIGUREREGISTRATIONTEMPLATETabisenabled();
		Assert.assertTrue(CONFIGUREREGISTRATIONTEMPLATETab, "CONFIGURE REGISTRATION TEMPLATE Tab is Not enabled");
		if(CONFIGUREREGISTRATIONTEMPLATETab == true) {
			System.out.println("CONFIGURE REGISTRATION TEMPLATE Tab is enabled");
			Thread.sleep(5000);
			hf.clickonCONFIGUREREGISTRATIONTEMPLATETab();
		}
	}
	@Test(priority = 8,groups = {"Functional","Smoke"})
	public void NDMCTemplateCheckBoxisenabled() throws InterruptedException {
		boolean NDMCTemplateCheckBox = hf.validateNDMCTemplateCheckBoxisenabled();
		Assert.assertTrue(NDMCTemplateCheckBox, "NDMC Check box is not enabled");
		if(NDMCTemplateCheckBox == true) {
			System.out.println("NDMC Check box is enabled");
			delay();
			hf.SelectNDMCTemplateCheckBox();
		}
	}
	@Test(priority = 9,groups = {"Functional","Smoke"})
	public void Updatebuttonisenabled() throws InterruptedException {
		boolean Updatebutton = hf.ValidateUpdatebuttonisenabled();
		Assert.assertTrue(Updatebutton, "Update bitton is not enabled");
		if(Updatebutton == true) {
			System.out.println("Update bitton is enabled");
			delay();
			hf.clickonUpdateButton();
		}
		delay();
		Alert Conformation = driver.switchTo().alert();
		String alert = Conformation.getText();
		Assert.assertEquals(alert, "OPD Registration link Updated Successfully.Please Logout and Login again");
		if(alert.equals("OPD Registration link Updated Successfully.Please Logout and Login again")) {
		System.out.println("get conformation message NDMC TEMPLETE is selected ");}
		else {System.out.println("get conformation message NDMC TEMPLETE  is not selected ");}
		delay();
		Conformation.accept();
	}
	@Test(priority = 10,groups = {"Functional","Smoke"})
	public void CONFIGUREOPDREGISTRATIONSLIPtabisdisplayed() throws InterruptedException {
	//selectframe.selectRightframe();
	boolean CONFIGUREOPDREGISTRATIONSLIPtab = hf.validateCONFIGUREOPDREGISTRATIONSLIPtabisdisplayed();
	Assert.assertTrue(CONFIGUREOPDREGISTRATIONSLIPtab);
	if(CONFIGUREOPDREGISTRATIONSLIPtab == true) {
		System.out.println("CONFIGURE OPD REGISTRATION SLIP tab is displayed");}
	else {System.out.println("CONFIGURE OPD REGISTRATION SLIP tab is not displayed");}
	}
	
	@Test(priority = 11,groups = {"Functional","Smoke"})
	public void clickonCONFIGUREOPDREGISTRATIONSLIPtabandcheckisenabled() throws InterruptedException {
	delay();
	hf.selectCONFIGUREOPDREGISTRATIONSLIPtab();
		
	boolean CONFIGUREOPDREGISTRATIONSLIPtab1 = hf.validateCONFIGUREOPDREGISTRATIONSLIPtabisdisenabled();
	Assert.assertTrue(CONFIGUREOPDREGISTRATIONSLIPtab1);
	if(CONFIGUREOPDREGISTRATIONSLIPtab1 == true) {
		System.out.println("CONFIGURE OPD REGISTRATION SLIP tab is enabled");}
	else {System.out.println("CONFIGURE OPD REGISTRATION SLIP tab is not enabled");} 
	}
	
	@Test(priority = 12,groups = {"Functional","Smoke"})
	public void SelectOPDCardTemplateimageisdisplayed() {
	boolean SelectOPDCardTemplateimage = hf.SelectOPDCardTemplateimageisdisplayed();
	Assert.assertTrue(SelectOPDCardTemplateimage);
	if(SelectOPDCardTemplateimage == true) {
		System.out.println("SelectOPDCardTemplate image is displayed");}
	else {System.out.println("SelectOPDCardTemplate image is not displayed");}
	}
	
	@Test(priority = 13,groups = {"Functional","Smoke"})
	public void clickonSelectOPDCardTemplateimageandcheckisenabled() throws InterruptedException {
	delay();
	hf.SelectOPDCardTemplate();
	
	boolean SelectOPDCardTemplateimage1 = hf.SelectOPDCardTemplateimageisdisplayed();
	Assert.assertTrue(SelectOPDCardTemplateimage1);
	if(SelectOPDCardTemplateimage1 == true) {
		System.out.println("SelectOPDCardTemplate image is enabled");}
	else {System.out.println("SelectOPDCardTemplate image is not enabled");}
	}
	
	@Test(priority = 14,groups = {"Functional"})
	public void leftbuttontoselectslipisdisplayed() {
	boolean leftbuttontoselectslip = hf.validateleftbuttontoselectslipisdisplayed();
	Assert.assertTrue(leftbuttontoselectslip);
	if(leftbuttontoselectslip == true) {
		System.out.println("left click button is displayed");}
	else {System.out.println("left click button is not displayed");}
	}
	
	@Test(priority = 15,groups = {"Functional","Smoke"})
	public void clickonleftbuttontoselectslipandcheckenabled() throws InterruptedException {
	delay();
	hf.clickonleftbuttontoselectslip();
	
	boolean leftbuttontoselectslip1 = hf.validateleftbuttontoselectslipisenabled();
	Assert.assertTrue(leftbuttontoselectslip1);
	if(leftbuttontoselectslip1 == true) {
		System.out.println("left click button is enabled");}
	else {System.out.println("left click button is not enabled");}
		}
	
	@Test(priority = 16,groups = {"Functional","Smoke"})
	public void Selecttemplate5() throws InterruptedException {
	delay();
	hf.SelectTemplate5();
	
	Alert Conformation = driver.switchTo().alert();
	String alert = Conformation.getText();
	Assert.assertEquals(alert, "TEMPLETE 5 is selected. Please Click on Save Button.");
	if(alert.equals("TEMPLETE 5 is selected. Please Click on Save Button.")) {
	System.out.println("get conformation message TEMPLETE 5 is selected ");}
	else {System.out.println("get conformation message TEMPLETE 5 is not selected ");}
	delay();
	Conformation.accept();
	}
	@Test(priority = 17,groups = {"Functional"})
	public void savebuttonisdisplayed() {
	boolean Templatesavebutton = hf.validatesavebuttonisdisplayed();
	Assert.assertTrue(Templatesavebutton);
	if(Templatesavebutton == true) {
		System.out.println("Template save button is dispalyed");
	}else {System.out.println("Template save button is not dispalyed");}
		}
	
	@Test(priority = 18,groups = {"Functional","Smoke"})
	public void clickonsavebuttonandcheckenabled() throws InterruptedException {
		hf.clickonsavebutton();
	delay();
	
	Alert Conformation = driver.switchTo().alert();
	String alert = Conformation.getText();
	Assert.assertEquals(alert, "OPD Registration Slip Updated Successfully.Please Logout and Login again");
	if(alert.equals("OPD Registration Slip Updated Successfully.Please Logout and Login again")) {
	System.out.println("OPD Registration Slip Updated Successfully ");}
	else {System.out.println("OPD Registration Slip is not Updated Successfully ");}
	delay();
	Conformation.accept();
	
	boolean Templatesavebutton1 = hf.validatesavebuttonisenabled();
	Assert.assertTrue(Templatesavebutton1);
	if(Templatesavebutton1 == true) {
		System.out.println("Template save button is enabled");
	}else {System.out.println("Template save button is not enabled");}
	
	}
	
  @Test(priority = 19,groups = {"Functional","Smoke"})
  public void logout() throws InterruptedException {
  delay();
  //  selectframe = new SelectFrame();
  
  ht.switchtoHeaderFrame();
  //selectframe.selectupperframe();
  Thread.sleep(1000);
  lf.dologout();
  delay();
  HandleAlert();
  delay();
  driver.close();
 // switchingmultiplewindow();
  SwitchtoParentWindow();
  //WindowHandle.SelectParentwindow();
  }

	
	
	
}
