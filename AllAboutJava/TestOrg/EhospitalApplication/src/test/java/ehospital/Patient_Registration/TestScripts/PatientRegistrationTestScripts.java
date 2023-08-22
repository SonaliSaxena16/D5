package ehospital.Patient_Registration.TestScripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.nic.ehospial.generic.Xls_Reader;
import ehospital.Billing_Module.helper.Home;
import ehospital.Billing_Module.helper.Login;
import ehospital.Billing_Module.helper.PatientRegistrationHelper;
import in.nic.ehospial.generic.BaseClass;




public class PatientRegistrationTestScripts extends BaseClass {

	Home hf;
	Login lf;

	
	PatientRegistrationHelper prh;
	PatientRegistrationTestScripts prt;
	

@Test(priority = 1,groups = {"Functional","Smoke"})
public void Patientregistrationlinkisdisplayed() throws IOException, InterruptedException {
	hf = new Home(driver);
	lf = new Login(driver);
	
prh = new PatientRegistrationHelper(driver);

prt = new PatientRegistrationTestScripts();
//switchingmultiplewindow();
hf.clickonPatientregistrationTab();

delay();
HandleAlert();
delay();

switchToNewWindow();
//WindowHandle.SelectChildwindow();

delay();
prt.switchtoLeftFrame();
//selectframe.selectLeftframe();
delay();
boolean Patientregistrationlink = prh.ValidatePatientRegistrationlinkisdisplayed();
Assert.assertTrue(Patientregistrationlink, "link is not displayed");
if(Patientregistrationlink == true) {
System.out.println("Patient Registration link is displayed");
}else {System.out.println("Patient Registration link is not displayed");}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void clickonlinkandPatientregistrationlinkandisenabled() throws InterruptedException {

prh.Selectpatientregistrationlink();
delay();
boolean Patientregistrationlink = prh.ValidatePatientRegistrationlinkisenabled();
Assert.assertTrue(Patientregistrationlink, "link is not enabled");
if(Patientregistrationlink == true) {
System.out.println("Patient Registration link is enabled");
}else {System.out.println("Patient Registration link is not enabled");}
}

@Test(priority = 3,groups = {"Functional","Smoke"})
public void NewRegistrationlinkisdisplayed() {

boolean NewRegistrationlink = prh.validateNewRegistrationlinkisdispalyed();
Assert.assertTrue(NewRegistrationlink, "New Registration link is displayed");
if(NewRegistrationlink == true) {
System.out.println("New Registration link is displayed");
}else {System.out.println("New Registration link is not displayed");}	
}

@Test(priority = 4,groups = {"Functional","Smoke"})
public void clickonnewregistrationlinkandisenabled() throws InterruptedException {
	prh.selectnewregistrationlink();
	delay();
	
	boolean NewRegistrationlink = prh.validateNewRegistrationlinkisenabled();
	Assert.assertTrue(NewRegistrationlink, "New Registration link is enabled");
	if(NewRegistrationlink == true) {
	System.out.println("New Registration link is enabled");
	}else {System.out.println("New Registration link is not enabled");}	
}
@Test(priority = 5,groups = {"Functional","Smoke"})
public void skipbuttonisdispalyed() throws InterruptedException {
	
	prt.switchtoinnerRightFrame();
	//selectframe.selectRightframe();
	
	boolean Skipbutton = prh.validateskipbuttonisdisplayed();
	Assert.assertTrue(Skipbutton, "skip button is not displayed");
	if(Skipbutton == true) {
		System.out.println("skip button is displayed");
	}else {System.out.println("skip button is not displayed");}
}

@Test(priority = 6,groups = {"Functional","Smoke"})
public void clickonskipbuttonandisenabled() throws InterruptedException {
	
	boolean Skipbutton = prh.validateskipbuttonisenabled();
	Assert.assertTrue(Skipbutton, "skip button is not enabled");
	if(Skipbutton == true) {
		System.out.println("skip button is enabled");
	}else {System.out.println("skip button is not enabled");}
	
	prh.clickonskipbutton();
	
	delay();
}
@Test(priority = 7,groups = {"Functional","Smoke"})
public void GenerateUHIDandPasteintoexcelsheet() throws InterruptedException {
	//get data from excel
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");
	
	int rowCount = reader.getRowCount("OPD");
	//Parameterization
	for (int rowNum=2; rowNum <=rowCount; rowNum++) {
		prh.clearageboxdata();
		String Initials = reader.getCellData("OPD", "Initials", rowNum);
		String FirstName = reader.getCellData("OPD", "FirstName", rowNum);
		String MiddleName = reader.getCellData("OPD", "MiddleName", rowNum);
		String LastName = reader.getCellData("OPD", "LastName", rowNum);
		String Age = reader.getCellData("OPD", "Age", rowNum);
		String Guardianname = reader.getCellData("OPD", "Guardianname", rowNum);
		String Address = reader.getCellData("OPD", "Address", rowNum);
		
		prh.RegistrationData(Initials, FirstName, MiddleName, LastName, Age, Guardianname, Address);
		delay();
		prh.Selectdepartmentandclickonsavebutton();
		delay();
		prt.switchtoLeftFrame();
		//selectframe.selectLeftframe();
		
		prh.clickonDuplicateRegistrationSliplink();
		prt.switchtoinnerRightFrame();
		//selectframe.selectRightframe();
		
		prh.clickondatecheckbox();
		prh.clickongetresult();
		String UHIDValue = prh.getUHID();
		reader.setCellData("OPD", "UHID", rowNum, UHIDValue);
		delay();
		prt.switchtoLeftFrame();
		//selectframe.selectLeftframe();
		
		delay();
		prh.selectnewregistrationlink();
		Thread.sleep(5000);
		prt.switchtoinnerRightFrame();
		//selectframe.selectRightframe();
		
		prh.clickonskipbutton();
		
	}

}
@Test(priority = 8,groups = {"Functional","Smoke"})
public void logout() throws InterruptedException {
delay();
//  selectframe = new SelectFrame();
prt.switchtoHeaderFrame();

Thread.sleep(1000);
lf.dologout();
delay();
HandleAlert();
delay();
driver.close();
SwitchtoParentWindow();
//switchingmultiplewindow();
}


}
