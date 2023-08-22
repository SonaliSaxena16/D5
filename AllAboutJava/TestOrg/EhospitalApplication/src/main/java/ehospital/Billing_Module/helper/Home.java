package ehospital.Billing_Module.helper;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ehospital.Login_Page.Objects.HomePage;
import ehospital.Login_Page.Objects.LoginPage;

public class Home {

	public WebDriver driver;
	HomePage hp;
	LoginPage lp;
	public Home(WebDriver driver) {
		this.driver = driver;
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
	}

//Action
////////////////////////////////////////Modules Tab////////////////////////////////////	
//Click on  AdministrationTab
public void ClickonAdministrationTab() throws InterruptedException {
Thread.sleep(2000);
hp.getAdministrationTab().click();
}
//click on PatientregistrationTab
public void clickonPatientregistrationTab() throws InterruptedException {
Thread.sleep(2000);
hp.getPatientregistrationTab().click();
}

//click on LaboratoryTab
public void clickonLaboratoryTab() throws InterruptedException {
Thread.sleep(2000);
hp.getLaboratoryTab().click();
}

//click on BillingTab
public void clickonBillingTab() {
	hp.getBillingTab().click();
}
///////////////////////////////////////////////////////////////////////////////////////
//Validate Admin link is displayed
public boolean valiadateAdminlinkisdisplayed() {
WebElement Adminlink = hp.getAdminmodule();
return Adminlink.isDisplayed();}

//validate Admin link is Enabled
public boolean valiadateAdminlinkisenabled() {
WebElement Adminlink = hp.getAdminmodule();
return Adminlink.isEnabled();}

//Select Admin Module
public void selectadminmodule() {
hp.getAdminmodule().click();}

//validate Configure link is displayed
public boolean validateconfigurelinkisdisplayed() {
WebElement configlink = hp.getConfiguration();
return configlink.isDisplayed();}

//select configure link
public void selectconfiglink() {
hp.getConfiguration().click();
}
//validate Configure link is Enabled
public boolean validateconfigurelinkisenabled() {
WebElement configlink = hp.getConfiguration();
return configlink.isEnabled();}

//validate configureOPDRegister link is displayed
public boolean valiadteconfigureOPDRegisterlinkisdisplayed() {
WebElement configureOPDRegisterlink = hp.getConfigureOPDRegistration();
return configureOPDRegisterlink.isDisplayed();}

//select configureOPDRegister link
public void selectconfigureOPDRegisterlink() {
hp.getConfigureOPDRegistration().click();}

//validate configureOPDRegister link is enabled
public boolean validateconfigureOPDRegisterlinkisenabled() {
WebElement configureOPDRegisterlink = hp.getConfigureOPDRegistration();
return configureOPDRegisterlink.isEnabled();}

//validate CONFIGURE OPD REGISTRATION SLIP tab is displayed
public boolean validateCONFIGUREOPDREGISTRATIONSLIPtabisdisplayed() {
WebElement CONFIGUREOPDREGISTRATIONSLItab = hp.getRegistrationslip();
return CONFIGUREOPDREGISTRATIONSLItab.isDisplayed();}

//select CONFIGURE OPD REGISTRATION SLIP tab
public void selectCONFIGUREOPDREGISTRATIONSLIPtab() {
	hp.getRegistrationslip().click();}

//validate CONFIGURE OPD REGISTRATION SLIP tab is enabled
public boolean validateCONFIGUREOPDREGISTRATIONSLIPtabisdisenabled() {
WebElement CONFIGUREOPDREGISTRATIONSLItab = hp.getRegistrationslip();
return CONFIGUREOPDREGISTRATIONSLItab.isEnabled();}

//validate SelectOPDCardTemplate image is displayed
public boolean SelectOPDCardTemplateimageisdisplayed() {
WebElement SelectOPDCardTemplateimage = hp.getSelectOPDCardTemplate();
return SelectOPDCardTemplateimage.isDisplayed();}

//Select OPD card Template image
public void SelectOPDCardTemplate() {
hp.getSelectOPDCardTemplate().click();}

//validate SelectOPDCardTemplate image is enabled
public boolean SelectOPDCardTemplateimageisenabled() {
WebElement SelectOPDCardTemplateimage = hp.getSelectOPDCardTemplate();
return SelectOPDCardTemplateimage.isEnabled();}

//validate left click button is displayed
public boolean validateleftbuttontoselectslipisdisplayed() {
WebElement Lightbuttontoselectslip = hp.getLeftbuttontoselectslip();
return Lightbuttontoselectslip.isDisplayed();}

//click on right click button to select slip
public void clickonleftbuttontoselectslip() throws InterruptedException {
hp.getLeftbuttontoselectslip().click();
Thread.sleep(1000);
//leftbuttontoselectslip.click();
}

//validate left click button is enabled
public boolean validateleftbuttontoselectslipisenabled() {
WebElement Lightbuttontoselectslip = hp.getLeftbuttontoselectslip();
return Lightbuttontoselectslip.isEnabled();}

//Select Template 5
public void SelectTemplate5() throws InterruptedException {
Thread.sleep(2000);
hp.getSelectTemplate5().click();
}

//validate save button is displayed
public boolean validatesavebuttonisdisplayed() {
WebElement Savebutton = hp.getSavebutton();
return Savebutton.isDisplayed();
}
//click on save button
public void clickonsavebutton() {
hp.getSavebutton().click();
}
//validate save button is enabled
public boolean validatesavebuttonisenabled() {
WebElement Savebutton = hp.getSavebutton();
return Savebutton.isEnabled();
}
/*public void loginpage(String usname,String pass) throws InterruptedException {
lp.getUserid().sendKeys(usname);
Select 	dopdown = new Select (lp.getSsodropdown());
//dopdown.selectByVisibleText("Other Module");
//dopdown.selectByVisibleText("All Modules");
Thread.sleep(10000);

login.click();
Thread.sleep(2000);
password.sendKeys(pass);
Thread.sleep(2000);

signin.click();
}*/

//Validate CONFIGUREREGISTRATIONTEMPLATETab is enabled
public boolean ValidateCONFIGUREREGISTRATIONTEMPLATETabisenabled() {
WebElement CONFIGUREREGISTRATIONTEMPLATETabisenabled = hp.getCONFIGUREREGISTRATIONTEMPLATETab();
return CONFIGUREREGISTRATIONTEMPLATETabisenabled.isEnabled();
}
//click on 	CONFIGUREREGISTRATIONTEMPLATETab
public void clickonCONFIGUREREGISTRATIONTEMPLATETab() throws InterruptedException {
Thread.sleep(3000);
hp.getCONFIGUREREGISTRATIONTEMPLATETab().click();
}
//validate NDMCTemplateCheckBox is enabled
public boolean validateNDMCTemplateCheckBoxisenabled() {
WebElement NDMCTemplateCheckBoxisenabled = hp.getNDMCTemplateCheckBox();
return NDMCTemplateCheckBoxisenabled.isEnabled();	
}
//Select NDMCTemplateCheckBox
public void SelectNDMCTemplateCheckBox() throws InterruptedException {
Thread.sleep(5000);
hp.getNDMCTemplateCheckBox().click();
}
//Validate UpdateButton is enabled
public boolean ValidateUpdatebuttonisenabled() {
WebElement Updatebuttonisenabled = hp.getUpdateButton();
return Updatebuttonisenabled.isEnabled();
}
//click on UpdateButton
public void clickonUpdateButton() throws InterruptedException {
Thread.sleep(2000);
hp.getUpdateButton().click();
}

}
