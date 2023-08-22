package ehospital.LAB_Module.TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import ehospital.Billing_Module.helper.Home;
import ehospital.Billing_Module.helper.Login;
import ehospital.LAB_Module.helper.SampleCollectionHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;

public class SampleCollectionTestScripts extends BaseClass {
	SampleCollectionHelper sch;
	SampleCollectionTestScripts sct;
	Home hf;
	Login lf;

@Test(priority = 1,groups = {"Functional","Smoke"})
public void LabModuleisdisplayed_TIDL001_EH127() throws IOException, InterruptedException {	
	hf = new Home(driver);
	lf = new Login(driver);
sch = new SampleCollectionHelper(driver);
sct = new SampleCollectionTestScripts();
hf.clickonLaboratoryTab();

delay();
HandleAlert();
delay();

switchToNewWindow();
//WindowHandle.SelectChildwindow();

delay();
sct.switchtoLeftFrame();
//selectframe.selectLeftframe();
delay();

boolean LabModule = sch.ValidateLabmoduleisdispalyed();
Assert.assertTrue(LabModule);
if(LabModule == true) {
System.out.println("Labrotory Module is displayed");	
}else {System.out.println("Labrotory Module is not displayed");}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void clickonlabmoduleandisenabled_TIDL001_EH127() {
boolean LabModule = sch.ValidateLabmoduleisenabled();
Assert.assertTrue(LabModule);
if(LabModule == true) {
System.out.println("Labrotory Module is enabled");	
}else {System.out.println("Labrotory Module is not enabled");}

sch.selectlabmodule();
}	

@Test(priority = 3,groups = {"Functional","Smoke"})
public void samplecollectionlinkisdispalyed_TIDL002_EH128() {
boolean samplecollectionlink = sch.validatesamplecollectionlnkisdisplayed();
Assert.assertTrue(samplecollectionlink);
if(samplecollectionlink == true) {
System.out.println("Sample collection link is displayed");
}else {System.out.println("Sample collection link is not displayed");}
}

@Test(priority = 4,groups = {"Functional","Smoke"})
public void clickonsamplecollectionandisenabled_TIDL002_EH128() {
boolean samplecollectionlink = sch.validatesamplecollectionlnkisenabled();
Assert.assertTrue(samplecollectionlink);
if(samplecollectionlink == true) {
System.out.println("Sample collection link is enabled");
}else {System.out.println("Sample collection link is not enabled");}

sch.selectsamplecollectionlink();
}

@Test(priority = 5,groups = {"Functional","Smoke"})
public void dropdownboxisdisplayed_TIDL003_EH58() throws InterruptedException {
delay();
sct.switchtoinnerRightFrame();
boolean Samplecollectioncentredropdown = sch.Validatedropdownboxisdisplayed();
Assert.assertTrue(Samplecollectioncentredropdown);
if(Samplecollectioncentredropdown == true) {
	System.out.println("dropdown box is displayed");
}else {System.out.println("dropdown box is not displayed");}
}

@Test(priority = 6,groups = {"Functional","Smoke"})
public void  selectvalueandcheckenabledstatus_TIDL003_EH58() throws InterruptedException {
delay();
boolean Samplecollectioncentredropdown = sch.Valiadtedropdownlistisenabled();
Assert.assertTrue(Samplecollectioncentredropdown);
if(Samplecollectioncentredropdown == true) {
	System.out.println("dropdown box is enabled");
}else {System.out.println("dropdown box is not enabled");}

sch.selectvaluefromdropdown();
delay();
}

@Test(priority = 7,groups = {"Functional","Smoke"})
public void ContinueWithSelectedisdisplayed_TIDL004_EH72() {
boolean ContinueWithSelectedbutton = sch.ValidateContinueWithSelectedisdisplayed();
Assert.assertTrue(ContinueWithSelectedbutton);
if(ContinueWithSelectedbutton == true) {
	System.out.println("Continue With Selected button is displayed");
}else {System.out.println("Continue With Selected button is not displayed");}
}

@Test(priority = 8,groups = {"Functional","Smoke"})
public void ClickonContinueWithSelectedisdisenabled_TIDL004_EH72() throws InterruptedException {
boolean ContinueWithSelectedbutton = sch.ValidateContinueWithSelectedisenabled();
Assert.assertTrue(ContinueWithSelectedbutton);
if(ContinueWithSelectedbutton == true) {
	System.out.println("Continue With Selected button is enabled");
}else {System.out.println("Continue With Selected button is not enabled");}

delay();
sch.selectContinueWithSelectedbutton();
delay();
//get all web element list present in a web page
List<WebElement> elements = driver.findElements(By.tagName("body"));
for(WebElement ob :elements ) {
	String od = ob.getText();
	System.out.println(od);
/*String exc = "Laboratory Sample Collection,Press Esc to hide Popup,Sample Collection Centre Name:,Blood Vessls (Block:Emergency building-1/Building:Emergency building/Floor:1st Floor/Room:101),Change Collection Centre,UHID,Receipt No,*,Patient Information,Collected Sample(s) Details,Observation Entry Done,Recommended Test Details";
	Assert.assertEquals(od, exc);
	if(od.equals(exc)) {
		System.out.println("all web element list present in a web page(actual matched with expected)");
	}else {System.out.println("all web element list present in a web page(actual not matched with expected)");}*/
}
}

@Test(priority = 9,groups = {"Functional","Smoke"})
public void changecollectioncentrelinkisdisplayed_TIDL005_EH130() throws InterruptedException {
delay();
boolean changecollectioncentrelink = sch.ValidateChangeCollectionCentreisdispalyed();
Assert.assertTrue(changecollectioncentrelink);
if(changecollectioncentrelink == true) {
	System.out.println("change collection centre link is displayed");
}else {System.out.println("change collection centre link is not displayed");}
}

@Test(priority = 10,groups = {"Functional","Smoke"})
public void clickonchangecollectioncenterandisenabled_TIDL005_EH130() throws InterruptedException {
delay();
boolean changecollectioncentrelink = sch.ValidateChangeCollectionCentreisenabled();
Assert.assertTrue(changecollectioncentrelink);
if(changecollectioncentrelink == true) {
	System.out.println("change collection centre link is enabled");
}else {System.out.println("change collection centre link is not enabled");}
delay();
sch.selectChangeCollectionCentrelink();
}

@Test(priority = 11,groups = {"Functional"})
public void UHIDTextBoxisdisplayed_TIDL006_EH131() throws InterruptedException {
delay();
boolean UHIDTextbox = sch.validateUHIDTextboxisdisplayed();
Assert.assertTrue(UHIDTextbox);
if(UHIDTextbox == true) {
System.out.println("UHID Text Box is displayed");	
}else {System.out.println("UHID Text Box is not displayed");}
}

@Test(priority = 12,groups = {"Functional"})
public void UHIDTextBoxisdisenabled_TIDL006_EH131() throws InterruptedException {
delay();
boolean UHIDTextbox = sch.validateUHIDTextboxisdisplayed();
Assert.assertTrue(UHIDTextbox);
if(UHIDTextbox == true) {
System.out.println("UHID Text Box is enabled");	
}else {System.out.println("UHID Text Box is not enabled");}
}

@Test(priority = 13,groups = {"Functional"})
public void GObuttonisdispalyed_TIDL007_EH133() throws InterruptedException {
delay();
boolean GObutton = sch.validateGObuttonisdispalyed();
Assert.assertTrue(GObutton);
if(GObutton == true) {
System.out.println("Go button is displayed");	
}else {System.out.println("Go button is not displayed");}
}

@Test(priority = 14,groups = {"Functional"})
public void GObuttonisenabled_TIDL007_EH133() throws InterruptedException {
delay();
boolean GObutton = sch.validateGObuttonisenabled();
Assert.assertTrue(GObutton);
if(GObutton == true) {
System.out.println("Go button is enabled");	
}else {System.out.println("Go button is not enabled");}
}

@Test(priority = 15,groups = {"Functional"})
public void clickongobuttonwithoutenterUHID_TIDL008_EH134() throws InterruptedException {
delay();
sch.ClickonGobuttonwithoutenterUHID();
Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter  No.");
if(alert.equals("Please Enter  No.")) {
	System.out.println("alert Message get successfully");
}else {System.out.println("alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 16,groups = {"Functional"})
public void clickongobuttonwithinvalidUHID_TIDL009_EH135() throws InterruptedException {
delay();	
sch.ClickonGobuttonwithInvalidUHID("123@#TYac");
Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter valid  No.","alert Message not get successfully");
if(alert.equals("Please Enter valid  No.")) {
	System.out.println("alert Message get successfully");
}else {System.out.println("alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 17,groups = {"Functional","Smoke"})
public void clickongobuttonwithvalidUHID_TIDL0010_EH136() throws InterruptedException {
delay();	
sch.ClickonGobuttonwithvalidUHID("20200000035");
//get all web element list present in a web page
	List<WebElement> elements = driver.findElements(By.id("patientInfoDiv"));
    for(WebElement ob :elements ) {
    	String od = ob.getText();
    	System.out.println(od);
}
}

@Test(priority = 18,groups = {"Functional"})
public void PatientinformationImagebuttonisdisplayed_TIDL0011_EH137() throws InterruptedException {
delay();
boolean PatientinformationImagebutton = sch.validatePatientinformationImagebuttonisdisplayed();
Assert.assertTrue(PatientinformationImagebutton);
if(PatientinformationImagebutton == true) {
System.out.println("Patient information Image button is displayed");	
}else {System.out.println("Patient information Image button is not displayed");}
}

@Test(priority = 19,groups = {"Functional"})
public void clickonPatientinformationImagebuttonandisenabled_TIDL0011_EH137() throws InterruptedException {
delay();
boolean PatientinformationImagebutton = sch.validatePatientinformationImagebuttonisdisplayed();
Assert.assertTrue(PatientinformationImagebutton);
if(PatientinformationImagebutton == true) {
System.out.println("Patient information Image button is enabled");	
}else {System.out.println("Patient information Image button is not enabled");}
delay();
sch.clickonPatientinformationImagebutton();
}

@Test(priority = 20,groups = {"Functional","Smoke"})
public void AddNewInvestigationlinkisdisplayed_TIDL0015_EH141() throws InterruptedException {
delay();	
boolean AddNewInvestigationlink = sch.validateAddNewInvestigationlinkisdisplayed();
Assert.assertTrue(AddNewInvestigationlink, "Add New Investigation link is not displayed");
if(AddNewInvestigationlink == true) {
System.out.println("Add New Investigation link is displayed");}
}

@Test(priority = 21,groups = {"Functional","Smoke"})
public void clickonAddNewInvestigationlinkandisenabled_TIDL0015_EH141() throws InterruptedException {
delay();	
boolean AddNewInvestigationlink = sch.validateAddNewInvestigationlinkisenabled();
Assert.assertTrue(AddNewInvestigationlink, "Add New Investigation link is not enabled");
if(AddNewInvestigationlink == true) {
System.out.println("Add New Investigation link is enabled");
}

sch.clickonaddnewinvestigationlink();
Thread.sleep(10000);
if (sch.isAlertPresent()) {
	 driver.switchTo().alert();
	    driver.switchTo().alert().accept();
}
}
/////////////////////////////Lab Consolidated Report Tab//////////////////////////////////

@Test(priority = 22,groups = {"Functional"})
public void LabConsolidatedReportbuttonisdisplayed_TIDL0016_EH142() throws InterruptedException {
delay();
sct.switchtoOrderEntryFrame();
delay();
boolean LabConsolidatedReportbutton = sch.validateLabConsolidatedReportbuttonisdisplayed();
Assert.assertTrue(LabConsolidatedReportbutton, "Lab Consolidated Report button is not displayed");
if(LabConsolidatedReportbutton == true) {
	System.out.println("Lab Consolidated Report button is displayed");
}
}

@Test(priority = 23,groups = {"Functional"})
public void clickonLabConsolidatedReportbuttonandisenabled_TIDL0016_EH142() throws InterruptedException {
delay();
boolean LabConsolidatedReportbutton = sch.validateLabConsolidatedReportbuttonisenabled();
Assert.assertTrue(LabConsolidatedReportbutton, "Lab Consolidated Report button is not enabled");
if(LabConsolidatedReportbutton == true) {
	System.out.println("Lab Consolidated Report button is enabled");
}
sch.clickonLabConsolidatedReportbutton();
}

@Test(priority = 24,groups = {"Functional"})
public void viewtemplateoptionisdisplayed_TIDL0017_EH143() throws InterruptedException {
delay();
sct.switchtoLabConsoildatedReportOrderEntryFrame();
delay();
boolean viewtemplateoption = sch.validateviewtemplateoptionisdisplayed();
Assert.assertTrue(viewtemplateoption, "View Template option is not available");
if(viewtemplateoption == true) {
	System.out.println("View Template option is available");	
}
}

@Test(priority = 25,groups = {"Functional"})
public void clickonviewtemplateoptionandisenabled_TIDL0017_EH143() throws InterruptedException {
delay();
boolean viewtemplateoption = sch.validateviewtemplateoptionisenabled();
Assert.assertTrue(viewtemplateoption, "View Template option is not available");
if(viewtemplateoption == true) {
	System.out.println("View Template option is available");	
}delay();
sch.clickonviewTemplateoption();
}

@Test(priority = 26,groups = {"Functional"})
public void closeoptionisdisplayed_TIDL0018_EH144() throws InterruptedException {
delay();	
boolean Closeoption = sch.validatecloseoptionisdisplayed();
Assert.assertTrue(Closeoption, "close option of view Template popup is not displayed");
if(Closeoption == true) {
	System.out.println("close option of view Template popup is displayed");
}
}

@Test(priority = 27,groups = {"Functional"})
public void clickoncloseoptionandisenabled_TIDL0018_EH144() throws InterruptedException {
delay();	
boolean Closeoption = sch.validatecloseoptionisenabled();
Assert.assertTrue(Closeoption, "close option of view Template popup is not enabled");
if(Closeoption == true) {
	System.out.println("close option of view Template popup is enabled");
}delay();	
sch.clickoncloseoption();
}

@Test(priority = 28,groups = {"Functional"})
public void ConsolidatedReportLabGObuttonisdisplayed_TIDL0019_EH145() throws InterruptedException {
delay();
boolean ConsolidatedReportLabGObutton = sch.validateConsolidatedReportLabGObuttonisdisplayed();
Assert.assertTrue(ConsolidatedReportLabGObutton, "Consolidated Report Lab GO button is not displayed");
if(ConsolidatedReportLabGObutton == true) {
System.out.println("Consolidated Report Lab GO button is displayed");
}
}

@Test(priority = 29,groups = {"Functional"})
public void clickonConsolidatedReportLabGObuttonandisenabled_TIDL0019_EH145() throws InterruptedException {
delay();
boolean ConsolidatedReportLabGObutton = sch.validateConsolidatedReportLabGObuttonisenabled();
Assert.assertTrue(ConsolidatedReportLabGObutton, "Consolidated Report Lab GO button is not enabled");
if(ConsolidatedReportLabGObutton == true) {
System.out.println("Consolidated Report Lab GO button is enabled");
}delay();
sch.clickonGobuttonwithoutselectDate();
delay();

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter Start Date","alert Message not get successfully");
if(alert.equals("Please Enter Start Date")) {
System.out.println("alert Message get successfully");}
delay();
conformation.accept();

}

@Test(priority = 30,groups = {"Functional"})
public void DateWiseCalendarImageisdispalyed_TIDL0020_EH146() throws InterruptedException {
delay();
boolean DateWiseCalendarImage = sch.ValiadteDateWiseCalendarImageisdispalyed();
Assert.assertTrue(DateWiseCalendarImage, "Date Wise Calendar Image is not dispalyed");
if(DateWiseCalendarImage == true) {
System.out.println("Date Wise Calendar Image is dispalyed");
}
}

@Test(priority = 31,groups = {"Functional"})
public void DateWiseCalendarImageisenabled_TIDL0020_EH146() throws InterruptedException {
delay();
boolean DateWiseCalendarImage = sch.ValiadteDateWiseCalendarImageisenabled();
Assert.assertTrue(DateWiseCalendarImage, "Date Wise Calendar Image is not enabled");
if(DateWiseCalendarImage == true) {
System.out.println("Date Wise Calendar Image is enabled");}
}

@Test(priority = 32,groups = {"Functional"},enabled = false)
public void ClickonGobuttonwithStartDate_TIDL0021_EH147() throws InterruptedException {
delay();
sch.clickonDatewisecalendarimageandselectstartdateandclickonGobutton();

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter End Date","alert Message not get successfully");
if(alert.equals("Please Enter End Date")) {
	System.out.println("alert Message get successfully");}
	delay();
	conformation.accept();
	delay();
	sch.clickonDatewisecalendarimageandselectenddateandclickonGobutton();
}

@Test(priority = 33,groups = {"Functional"},enabled = false)
public void clickonobservationsearchBoxandisenabled_TIDL0022_EH148() throws InterruptedException {
boolean observationsearchBox = sch.ValidateobservationsearchBoxisenabled();
Assert.assertTrue(observationsearchBox, "observation search box is not enabled");
if(observationsearchBox == true) {
	System.out.println("observation search box is enabled");	
}
delay();
String TestName = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td/div/table/tbody/tr[2]/td[1]")).getText();
delay();
sch.enterdataintosearchbox(TestName);
}

@Test(priority = 34,groups = {"Functional"})
public void clickonconsolidatedReportclosebuttonandisenabled_TIDL0023_EH149() throws InterruptedException {
sct.switchtoOrderEntryFrame();
boolean closebutton = sch.consolidatedReportclosebuttonisenabled();
Assert.assertTrue(closebutton, "close button is not enabled");
if(closebutton == true) {
	System.out.println("close button is enabled");	
}delay();
sch.clickonConsolidatedReportcloseoption();
}

///////////////////////////////Search New Patient Tab//////////////////////////////////////////

@Test(priority = 35,groups = {"Functional","Smoke"})
public void SearchNewPatientTabisdisplayed_TIDL0024_EH150() throws InterruptedException {
sct.switchtoOrderEntryFrame();
delay();
boolean SearchNewPatientTab = sch.validateSearchNewPatientTabisdisplayed();
Assert.assertTrue(SearchNewPatientTab, "Search New Patient Tab is not displayed");
if(SearchNewPatientTab == true) {
	System.out.println("Search New Patient Tab is displayed");
}
}

@Test(priority = 36,groups = {"Functional","Smoke"})
public void ClickonSearchNewPatientTabandisenabled_TIDL0024_EH150() throws InterruptedException {
delay();
boolean SearchNewPatientTab = sch.validateSearchNewPatientTabisenabled();
Assert.assertTrue(SearchNewPatientTab, "Search New Patient Tab is not enabled");
if(SearchNewPatientTab == true) {
	System.out.println("Search New Patient Tab is enabled");
}
sch.clickonSearchNewPatientTab();
List<WebElement> elements = driver.findElements(By.id("table2"));
for(WebElement ob :elements ) {
	String od = ob.getText();
	System.out.println(od);}
}

@Test(priority = 37,groups = {"Functional","Smoke"})
public void  AnyPartofNameRadiobuttonisdisplayed_TIDL0025_EH151() throws InterruptedException {
delay();
boolean AnyPartofNameRadiobutton = sch.validateAnyPartofNameRadiobuttonisdisplayed();
Assert.assertTrue(AnyPartofNameRadiobutton, "Any Part of Name Radio button is not displayed");
if(AnyPartofNameRadiobutton == true) {
	System.out.println("Any Part of Name Radio button is displayed");
}
}

@Test(priority = 38,groups = {"Functional","Smoke"})
public void  clickonAnyPartofNameRadiobuttonandisenabled_TIDL0025_EH151() throws InterruptedException {
delay();
boolean AnyPartofNameRadiobutton = sch.validateAnyPartofNameRadiobuttonisenabled();
Assert.assertTrue(AnyPartofNameRadiobutton, "Any Part of Name Radio button is not enabled");
if(AnyPartofNameRadiobutton == true) {
	System.out.println("Any Part of Name Radio button is enabled");
}delay();
sch.selectAnyPartofNameRadiobutton();
}

@Test(priority = 39,groups = {"Functional"})
public void AnyPartofNameTextBoxisdisplayed_TIDL0026_EH152() throws InterruptedException {
delay();
boolean AnyPartofNameTextBox = sch.validateAnyPartofNameTextBoxisdisplayed();
Assert.assertTrue(AnyPartofNameTextBox, "Any Part of Name TextBox is not displayed");
if(AnyPartofNameTextBox == true) {
	System.out.println("Any Part of Name TextBox is displayed");	
}
}

@Test(priority = 40,groups = {"Functional"})
public void AnyPartofNameTextBoxisenabled_TIDL0026_EH152() throws InterruptedException {
delay();
boolean AnyPartofNameTextBoxisenabled = sch.validateAnyPartofNameTextBoxisenabled();
Assert.assertTrue(AnyPartofNameTextBoxisenabled, "Any Part of Name TextBox is not enabled");
if(AnyPartofNameTextBoxisenabled == true) {
	System.out.println("Any Part of Name TextBox is enabled");	
}
}

@Test(priority = 41,groups = {"Functional"})
public void AnyPartofNameSubmitbuttonisdisplayed_TIDL0027_EH153() throws InterruptedException {
delay();
boolean AnyPartofNameSubmitbutton = sch.validateAnyPartofNameSubmitbuttonisdisplayed();
Assert.assertTrue(AnyPartofNameSubmitbutton, "Any Part of Name Submit button is not displayed");
if(AnyPartofNameSubmitbutton == true) {
	System.out.println("Any Part of Name Submit button is displayed");
}
}

@Test(priority = 42,groups = {"Functional"})
public void AnyPartofNameSubmitbuttonisenabled_TIDL0027_EH153() throws InterruptedException {
delay();
boolean AnyPartofNameSubmitbutton = sch.validateAnyPartofNameSubmitbuttonisenabled();
Assert.assertTrue(AnyPartofNameSubmitbutton, "Any Part of Name Submit button is not enabled");
if(AnyPartofNameSubmitbutton == true) {
	System.out.println("Any Part of Name Submit button is enabled");
}
}

@Test(priority = 43,groups = {"Functional"})
public void clickonsubmitbuttonwithoutenterdata_TIDL0027_EH153() throws InterruptedException {
delay();
sch.clickonsubmitbutton();
Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter Part Name");
if(alert.equals("Please Enter Part Name")) {
	System.out.println("alert Message get successfully");
}else {System.out.println("alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 44,groups = {"Functional"})
public void Clickonsubmitbuttonwithinvalidanypartnamedata_TIDL0028_EH154() throws InterruptedException {
delay();
sch.clickonsubmitbuttonwithinvaliddata("123@#$");
Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter Valid Part Name");
if(alert.equals("Please Enter Valid Part Name")) {
	System.out.println("alert Message get successfully");
}else {System.out.println("alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 45,groups = {"Functional","Smoke"})
public void Clickonsubmitbuttonwithvaliddata_TIDL0029_EH155() throws InterruptedException {
delay();
sch.clickonsubmitbuttonwithvaliddata("Test");
delay();
List<WebElement> elements = driver.findElements(By.cssSelector("#table5 > tbody:nth-child(1) > tr:nth-child(2)"));
for(WebElement ob :elements ) {
	String od = ob.getText();
	System.out.println(od);
}
}

@Test(priority = 46,groups = {"Functional"})
public void Selectbuttonisdisplayed_TIDL0030_EH156() throws InterruptedException {
delay();	
boolean Selectbutton = sch.validateSelectbuttonisdisplayed();
Assert.assertTrue(Selectbutton, "Select button is not displayed");
if(Selectbutton == true) {
	System.out.println("Select button is displayed");
}
}

@Test(priority = 47,groups = {"Functional","Smoke"})
public void clickonSelectbuttonandisenabled_TIDL0030_EH156() throws InterruptedException {
delay();	
boolean Selectbutton = sch.validateSelectbuttonisenabled();
Assert.assertTrue(Selectbutton, "Select button is not enabled");
if(Selectbutton == true) {
	System.out.println("Select button is enabled");
}Thread.sleep(7000);
sch.clickonselectbutton();
Thread.sleep(7000);

if (sch.isAlertPresent()) {
	 driver.switchTo().alert();
	    driver.switchTo().alert().accept();
}

longDelay();
sch.clickonSearchNewPatientTab();
}

@Test(priority = 48,groups = {"Functional"})
public void Datewiseradiobuttonisdisplayed_TIDL0031_EH157() throws InterruptedException {
delay();
boolean Datewiseradiobutton = sch.validateDatewiseradiobuttonisdisplayed();
Assert.assertTrue(Datewiseradiobutton, "Date wise radio button is not displayed");
if(Datewiseradiobutton == true) {
System.out.println("Date wise radio button is displayed");	
}
}

@Test(priority = 49,groups = {"Functional"})
public void clickonDatewiseradiobuttonandisenabled_TIDL0031_EH157() throws InterruptedException {
delay();
boolean Datewiseradiobutton = sch.validateDatewiseradiobuttonisenabled();
Assert.assertTrue(Datewiseradiobutton, "Date wise radio button is not enabled");
if(Datewiseradiobutton == true) {
System.out.println("Date wise radio button is enabled");	
}delay();
sch.selectdatewiseradiobutton();
}

@Test(priority = 50,groups = {"Functional"})
public void datewisecalendarimageisdisplayed_TIDL0032_EH158() throws InterruptedException {
delay();
boolean	datewisecalendarimage = sch.validatedatewisecalendarimageisdisplayed();
Assert.assertTrue(datewisecalendarimage, "date wise calendar image is not displayed");
if(datewisecalendarimage == true) {
	System.out.println("date wise calendar image is displayed");
}
}

@Test(priority = 51,groups = {"Functional"})
public void datewisecalendarimageisenabled_TIDL0032_EH158() throws InterruptedException {
delay();
boolean	datewisecalendarimage = sch.validatedatewisecalendarimageisenabled();
Assert.assertTrue(datewisecalendarimage, "date wise calendar image is not enabled");
if(datewisecalendarimage == true) {
	System.out.println("date wise calendar image is enabled");
}
}

@Test(priority = 52,groups = {"Functional"})
public void clickonsubmitbuttonwithoutselectdate_TIDL0033_EH159() throws InterruptedException {
delay();
sch.clickondatawisefiltersubmitbutton();
Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter From Date");
if(alert.equals("Please Enter From Date")) {
	System.out.println("Dtaewise filter alert Message get successfully");
}else {System.out.println("Dtaewise filter alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 53,groups = {"Functional"})
public void Selectdatefromfirstcalendar_TIDL0034_EH160() throws InterruptedException {
delay();
sch.selectdatefromfirstcalendar();	
Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter To Date");
if(alert.equals("Please Enter To Date")) {
	System.out.println("Dtaewise filter alert Message get successfully");
}else {System.out.println("Dtaewise filter alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 54,groups = {"Functional"})
public void Selectdatefromlastcalendarandclickonselectbutton_TIDL0035_EH161() throws InterruptedException {
delay();
sch.selectdatefromlastcalendar();
Thread.sleep(7000);
sch.clickonselectbutton();
Thread.sleep(7000);
if (sch.isAlertPresent()) {
	 driver.switchTo().alert();
	    driver.switchTo().alert().accept();
}
longDelay();
sch.clickonSearchNewPatientTab();
}

@Test(priority = 55,groups = {"Functional"})
public void Contactnumberradiobuttonisdisplayed_TIDL0036_EH162() throws InterruptedException {
delay();
boolean Contactnumberradiobutton = sch.validateContactnumberradiobuttonisdisplayed();
Assert.assertTrue(Contactnumberradiobutton, "Contact number radio button is not displayed");
if(Contactnumberradiobutton == true) {
	System.out.println("Contact number radio button is displayed");
}
}
@Test(priority = 56,groups = {"Functional"})
public void clickonContactnumberradiobuttonisenabled_TIDL0036_EH162() throws InterruptedException {
delay();
boolean Contactnumberradiobutton = sch.validateContactnumberradiobuttonisenabled();
Assert.assertTrue(Contactnumberradiobutton, "Contact number radio button is not enabled");
if(Contactnumberradiobutton == true) {
	System.out.println("Contact number radio button is enabled");
}delay();
sch.SelectContactnoradiobutton();
delay();
sch.clickonsubmitbutton();
	
Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter Contact No");
if(alert.equals("Please Enter Contact No")) {
	System.out.println("Contact No alert Message get successfully");
}else {System.out.println("Contact No alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 57,groups = {"Functional"})
public void Enterinvalidcontactnodataandclickonsubmitbutton_TIDL0037_EH163() throws InterruptedException {
delay();
sch.enterinvalidcontactnodataandclickonsubmitbutton("78ghj%^&");

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
System.out.println(alert);
Assert.assertEquals(alert, "Please Enter Valid Contact No");
if(alert.equals("Please Enter Valid Contact No")) {
	System.out.println("Contact No alert Message get successfully");
}else {System.out.println("Contact No alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 58,groups = {"Functional"})
public void Entervalidcontactnodataandclickonsubmitbutton_TIDL0038_EH164() throws InterruptedException {
Thread.sleep(7000);
sch.entervalidcontactnodataandclickonsubmitbutton("9773524962");
Thread.sleep(7000);

if (sch.isAlertPresent()) {
	 driver.switchTo().alert();
	    driver.switchTo().alert().accept();
}

longDelay();
sch.clickonSearchNewPatientTab();
}

@Test(priority = 59,groups = {"Functional"})
public void UHIDradiobuttonisdisplayed_TIDL0039_EH165() throws InterruptedException {
delay();
boolean UHIDradiobutton = sch.validateUHIDradiobuttonisdisplayed();
Assert.assertTrue(UHIDradiobutton, "UHID radio button is not displayed");
if(UHIDradiobutton == true) {
 System.out.println("UHID radio button is displayed");
}
}

@Test(priority = 60,groups = {"Functional","Smoke"})
public void clickUHIDradiobuttonisenabled_TIDL0039_EH165() throws InterruptedException {
delay();
boolean UHIDradiobutton = sch.validateUHIDradiobuttonisenabled();
Assert.assertTrue(UHIDradiobutton, "UHID radio button is not enabled");
if(UHIDradiobutton == true) {
 System.out.println("UHID radio button is enabled");
}delay();
sch.SelectUHIDRadiobutton();
delay();
sch.clickonsubmitbutton();

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter UHID");
if(alert.equals("Please Enter UHID")){
	System.out.println("UHID alert Message get successfully");
}else {System.out.println("UHID alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 61,groups = {"Functional"})
public void EnterinvalidUHIDdataandclickonsubmitbutton_TIDL0040_EH166() throws InterruptedException {
delay();
sch.enterinvalidUHIDdataandclickonsubmitbutton("2020abc@#");

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter Valid UHID");
if(alert.equals("Please Enter Valid UHID")){
	System.out.println("UHID alert Message get successfully");
}else {System.out.println("UHID alert Message not get successfully");}
delay();
conformation.accept();
}
@Test(priority = 62,groups = {"Functional","Smoke"})
public void entervalidUHIDdataandclickonsubmitbutton_TIDL0041_EH167() throws InterruptedException {
delay();
sch.entervalidUHIDdataandclickonsubmitbutton("20200000035");
delay();

if (sch.isAlertPresent()) {
	 driver.switchTo().alert();
	    driver.switchTo().alert().accept();
}

longDelay();
}
///////////////////////////Main Order Entry(Advance) Page///////////////////////////////

@Test(priority = 63,groups = {"Functional"})
public void clickonOrdentryPatientinformationImagebutton_TIDL0042_EH168() throws InterruptedException {
sch.clickonPatientinformationImagebutton();
delay();
List<WebElement> elements = driver.findElements(By.id("patientInfoDiv"));
for(WebElement ob :elements ) {
	String od = ob.getText();
	System.out.println(od);
}
}

@Test(priority = 64,groups = {"Functional"})
public void VerifyObservationMedicinebuttonisdisplayed_TIDL0065_EH191() {
boolean VerifyObservationMedicinebutton = sch.validateVerifyObservationMedicinebuttonisdisplayed();
Assert.assertTrue(VerifyObservationMedicinebutton, "Verify Observation Medicine button is not displayed");
if(VerifyObservationMedicinebutton == true) {
System.out.println("Verify Observation Medicine button is displayed");	
}
}

@Test(priority = 65,groups = {"Functional"})
public void ClickoVerifyObservationMedicinebuttonisenabled_TIDL0065_EH191() throws InterruptedException {
boolean VerifyObservationMedicinebutton = sch.validateVerifyObservationMedicinebuttonisenabled();
Assert.assertTrue(VerifyObservationMedicinebutton, "Verify Observation Medicine button is not enabled");
if(VerifyObservationMedicinebutton == true) {
System.out.println("Verify Observation Medicine button is enabled");
delay();
}
}

@Test(priority = 66,groups = {"Functional"})
public void clickonVerifyObservationMedicinebutton_TIDL0066_EH192() throws InterruptedException {
delay();
sch.clickonVerifyObservationMedicinebutton();

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "No Observation found for Verification...");
if(alert.equals("No Observation found for Verification...")) {
	System.out.println("(No Observation found for Verification...)alert Message get successfully");
}else {System.out.println("(No Observation found for Verification...)alert Message not get successfully");}
delay();
conformation.accept();

}

@Test(priority = 67,groups = {"Functional"})
public void AllCategoryRadiobuttonisdisplayed_TIDL0043_EH169() {
boolean AllCategoryRadiobutton = sch.validateAllCategoryRadiobuttonisdisplayed();
Assert.assertTrue(AllCategoryRadiobutton, "All Category Radio button is not displayed");
if(AllCategoryRadiobutton == true) {
	System.out.println("All Category Radio button is displayed");
}
}

@Test(priority = 68,groups = {"Functional"})
public void ClickonAllCategoryRadiobuttonandisenabled_TIDL0043_EH169() throws InterruptedException {
boolean AllCategoryRadiobutton = sch.validateAllCategoryRadiobuttonisenabled();
Assert.assertTrue(AllCategoryRadiobutton, "All Category Radio button is not enabled");
if(AllCategoryRadiobutton == true) {
	System.out.println("All Category Radio button is enabled");
}delay();
sch.SelectAllCategoryRadiobutton();
}

@Test(priority = 69,groups = {"Functional"})
public void SelectvaluefromAllcategorydropdownandcheckenabled_TIDL0044_EH170() throws InterruptedException {
delay();
boolean AllCategoryDropdownbox = sch.validateAllCategoryDropdownboxisenabled();
Assert.assertTrue(AllCategoryDropdownbox, "All Category Drop down box is not enabled");
if(AllCategoryDropdownbox == true) {
	System.out.println("All Category Drop down box is enabled");
}delay();
sch.selectvaluefromAllcategorydropdown();
}

@Test(priority = 70,groups = {"Functional"})
public void Addservicebuttonisdisplayed_TIDL0045_EH171() throws InterruptedException {
delay();
boolean Addservicebutton = sch.validateAddservicebuttonisdisplayed();
Assert.assertTrue(Addservicebutton, "Add service button is not displayed");
if(Addservicebutton == true) {
System.out.println("Add service button is displayed");	
}
}

@Test(priority = 71,groups = {"Functional"})
public void clickonAddservicebuttonandisenabled_TIDL0045_EH171() throws InterruptedException {
delay();
boolean Addservicebutton = sch.validateAddservicebuttonisenabled();
Assert.assertTrue(Addservicebutton, "Add service button is not enabled");
if(Addservicebutton == true) {
System.out.println("Add service button is enabled");	
}delay();
sch.clickonAddservicebutton();
}

@Test(priority = 72,groups = {"Functional"})
public void cancelservicebuttonisdisplayed_TIDL0046_EH172() throws InterruptedException {
delay();	
boolean cancelservicebutton = sch.validatecancelservicebuttonisdisplayed();
Assert.assertTrue(cancelservicebutton, "cancel service button is not displayed");
if(cancelservicebutton == true) {
System.out.println("cancel service button is displayed");	
}
}

@Test(priority = 73,groups = {"Functional"})
public void clickoncancelservicebuttonandisenabled_TIDL0046_EH172() throws InterruptedException {
delay();	
boolean cancelservicebutton = sch.validatecancelservicebuttonisenabled();
Assert.assertTrue(cancelservicebutton, "cancel service button is not enabled");
if(cancelservicebutton == true) {
System.out.println("cancel service button is enabled");	
delay();
sch.clickoncancelservicebutton();
}
}

@Test(priority = 74,groups = {"Functional"})
public void FilterObservationTableSearchboxisdisplayed_TIDL0047_EH173() throws InterruptedException {
delay();
boolean FilterObservationTableSearchbox = sch.validateFilterObservationTableSearchboxisdisplayed();
Assert.assertTrue(FilterObservationTableSearchbox, "Filter ObservationT able Search box is not displayed");
if(FilterObservationTableSearchbox == true) {
System.out.println("Filter ObservationT able Search box is displayed");	
}
}

@Test(priority = 75,groups = {"Functional"})
public void enterdataFilterObservationTableSearchboxandisenabled_TIDL0047_EH173() throws InterruptedException {
delay();
boolean FilterObservationTableSearchbox = sch.validateFilterObservationTableSearchboxisenabled();
Assert.assertTrue(FilterObservationTableSearchbox, "Filter ObservationT able Search box is not enabled");
if(FilterObservationTableSearchbox == true) {
System.out.println("Filter ObservationT able Search box is enabled");
delay();
sch.enterdataintoFilterObservationTableSearchbox("c");
}
}

@Test(priority = 76,groups = {"Functional"})
public void ProcedureRadiobuttonisdisplayed_TIDL0048_EH174() throws InterruptedException {
delay();
boolean ProcedureRadiobutton = sch.validateProcedureRadiobuttonisdisplayed();
Assert.assertTrue(ProcedureRadiobutton, "Procedure Radio button is not displayed");
if(ProcedureRadiobutton == true) {
System.out.println("Procedure Radio button is displayed");	
}
}

@Test(priority = 77,groups = {"Functional"})
public void clickonProcedureRadiobuttonandisenabled_TIDL0048_EH174() throws InterruptedException {
delay();
boolean ProcedureRadiobutton = sch.validateProcedureRadiobuttonisenabled();
Assert.assertTrue(ProcedureRadiobutton, "Procedure Radio button is not enabled");
if(ProcedureRadiobutton == true) {
System.out.println("Procedure Radio button is enabled");
delay();
sch.clickonProcedureRadiobutton();
}
}

@Test(priority = 78,groups = {"Functional"})
public void clickonProcedureDropdownandSelectvalue_TIDL0049_EH175() throws InterruptedException {
delay();
boolean ProcedureDropdownan = sch.validateProcedureDropdownisenabled();
Assert.assertTrue(ProcedureDropdownan, "Procedure Dropdownan is not enabled");
if(ProcedureDropdownan == true) {
System.out.println("Procedure Dropdownan is enabled");
delay();
sch.selectvaluefromProcedureDropdown();
}
}

@Test(priority = 79,groups = {"Functional"})
public void ImmunizationRadiobuttonisdisplayed_TIDL0050_EH176() throws InterruptedException {
delay();
boolean ImmunizationRadiobutton = sch.validateImmunizationRadiobuttonisdisplayed();
Assert.assertTrue(ImmunizationRadiobutton, "Immunization Radio button is not displayed");
if(ImmunizationRadiobutton == true) {
	System.out.println("Immunization Radio button is displayed");
}
}

@Test(priority = 80,groups = {"Functional"})
public void clickonImmunizationRadiobuttonandisenabled_TIDL0050_EH176() throws InterruptedException {
delay();
boolean ImmunizationRadiobutton = sch.validateImmunizationRadiobuttonisenabled();
Assert.assertTrue(ImmunizationRadiobutton, "Immunization Radio button is not enabled");
if(ImmunizationRadiobutton == true) {
System.out.println("Immunization Radio button is enabled");
delay();
sch.clickonImmunizationRadiobutton();
}
}

@Test(priority = 81,groups = {"Functional"})
public void clickonImmunizationDropdownandSelectvalue_TIDL0051_EH177() throws InterruptedException {
delay();
boolean ImmunizationDropdown = sch.validateImmunizationDropdownisenabled();
Assert.assertTrue(ImmunizationDropdown, "Immunization Dropdownan is not enabled");
if(ImmunizationDropdown == true) {
System.out.println("Immunization Dropdownan is enabled");
delay();
sch.selectvaluefromImmunizationDropdown();
}
}

@Test(priority = 82,groups = {"Functional"})
public void OtherServicesRadiobuttonisdisplayed_TIDL0052_EH178() throws InterruptedException {
delay();
boolean OtherServicesRadiobutton = sch.validateOtherServicesRadiobuttonisdisplayed();
Assert.assertTrue(OtherServicesRadiobutton, "Other Services Radio button is not displayed");
if(OtherServicesRadiobutton == true) {
System.out.println("Other Services Radio button is displayed");
}
}

@Test(priority = 83,groups = {"Functional"})
public void ClickonOtherServicesRadiobuttonandisenabled_TIDL0052_EH178() throws InterruptedException {
delay();
boolean OtherServicesRadiobutton = sch.validateOtherServicesRadiobuttonisenabled();
Assert.assertTrue(OtherServicesRadiobutton, "Other Services Radio button is not enabled");
if(OtherServicesRadiobutton == true) {
System.out.println("Other Services Radio button is enabled");
delay();
sch.clickonOtherServicesRadiobutton();
}
}

@Test(priority = 84,groups = {"Functional"})
public void clickonOtherServicesdropdownandSelectvalue_TIDL0053_EH179() throws InterruptedException {
delay();
boolean ImmunizationDropdown = sch.validateOtherServicesDropdownisenabled();
Assert.assertTrue(ImmunizationDropdown, "Other Services Dropdownan is not enabled");
if(ImmunizationDropdown == true) {
System.out.println("Other Services Dropdownan is enabled");
delay();
sch.selectvaluefromOtherServicesDropdown();
}
}

@Test(priority = 85,groups = {"Functional"})
public void Medicineradiobuttonisdisplayed_TIDL0054_EH180() throws InterruptedException {
delay();
boolean Medicineradiobutton = sch.validateMedicineradiobuttonisdisplayed();
Assert.assertTrue(Medicineradiobutton, "Medicine radio button is not displayed");
if(Medicineradiobutton == true) {
System.out.println("Medicine radio button is displayed");	
}
}

@Test(priority = 86,groups = {"Functional"})
public void clickonMedicineradiobuttonandisenabled_TIDL0054_EH180() throws InterruptedException {
delay();
boolean Medicineradiobutton = sch.validateMedicineradiobuttonisenabled();
Assert.assertTrue(Medicineradiobutton, "Medicine radio button is not enabled");
if(Medicineradiobutton == true) {
System.out.println("Medicine radio button is enabled");
delay();
sch.clickonMedicineradiobutton();
}
}

@Test(priority = 87,groups = {"Functional"})
public void MedicineGroupTabisdisplayed_TIDL0055_EH181(){
boolean MedicineGroupTab = sch.ValidateMedicineGroupTabisdisplayed();
Assert.assertTrue(MedicineGroupTab, "Medicine Group Tab is not displayed");
if(MedicineGroupTab == true) {
System.out.println("Medicine Group Tab is displayed");	
}
}

@Test(priority = 88,groups = {"Functional"})
public void MedicineGroupTabisenabled_TIDL0055_EH181() throws InterruptedException{
boolean MedicineGroupTab = sch.ValidateMedicineGroupTabisenabled();
Assert.assertTrue(MedicineGroupTab, "Medicine Group Tab is not enabled");
if(MedicineGroupTab == true) {
System.out.println("Medicine Group Tab is enabled");	
delay();	
sch.clickonMedicineGroupTab();	
}
}

@Test(priority = 89,groups = {"Functional"})
public void MedicineDropdownisenabled_TIDL0056_EH182() throws InterruptedException {
delay();	
boolean MedicineDropdown = sch.validateMedicineDropdownisenabled();
Assert.assertTrue(MedicineDropdown, "Medicine Dropdown is not enabled");
if(MedicineDropdown == true) {
	System.out.println("Medicine Dropdown is enabled");	
	delay();	
	sch.SelectvaluefromMedicineDropdown();
}
}

@Test(priority = 90,groups = {"Functional"})
public void MedicineQuantityTextBoxisdisplayed_TIDL0057_EH183() throws InterruptedException {
delay();
boolean MedicineQuantityTextBox = sch.validateMedicineQuantityTextBoxisdisplayed();
Assert.assertTrue(MedicineQuantityTextBox, "Medicine Quantity Text Box is not displayed");
if(MedicineQuantityTextBox == true) {
	System.out.println("Medicine Quantity Text Box is displayed");	
}
}

@Test(priority = 91,groups = {"Functional"})
public void MedicineQuantityTextBoxisenabled_TIDL0057_EH183() throws InterruptedException {
delay();
boolean MedicineQuantityTextBox = sch.validateMedicineQuantityTextBoxisenabled();
Assert.assertTrue(MedicineQuantityTextBox, "Medicine Quantity Text Box is not enabled");
if(MedicineQuantityTextBox == true) {
	System.out.println("Medicine Quantity Text Box is enabled");
}	
}

@Test(priority = 92,groups = {"Functional"})
public void MedicineAdviceTextboxisdisplayed_TIDL0058_EH184() throws InterruptedException {
delay();
boolean MedicineAdviceTextbox = sch.validateMedicineAdviceTextboxisdisplayed();
Assert.assertTrue(MedicineAdviceTextbox, "Medicine Advice Text box is not displayed");
if(MedicineAdviceTextbox == true) {
System.out.println("Medicine Advice Text box is displayed"); 
}
}

@Test(priority = 93,groups = {"Functional"})
public void MedicineAdviceTextboxisenabled_TIDL0058_EH184() throws InterruptedException {
delay();
boolean MedicineAdviceTextbox = sch.validateMedicineAdviceTextboxisenabled();
Assert.assertTrue(MedicineAdviceTextbox, "Medicine Advice Text box is not enabled");
if(MedicineAdviceTextbox == true) {
System.out.println("Medicine Advice Text box is enabled"); 
}
}

@Test(priority = 94,groups = {"Functional"})
public void enterinValidQuantityandAdvice_TIDL0059_EH185() throws InterruptedException {
delay();
sch.EnterInValidquantityintoMedicineQuantityTextBox("#$%FTR");	

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please enter advice for medicine.");
if(alert.equals("Please enter advice for medicine.")) {
System.out.println("(Please enter advice for medicine.)alert Message get successfully");
}else {System.out.println("(Please enter advice for medicine.)alert Message not get successfully");}
delay();
conformation.accept();
delay();
sch.EnterInValidAdviceintoMedicineAdviceTextbox("@#$%^&*");

Alert conformation1 = driver.switchTo().alert();
String alert1 = conformation1.getText();
Assert.assertEquals(alert1, "Please enter Valid quantity and advice for medicine.");
if(alert1.equals("Please enter Valid quantity and advice for medicine.")) {
System.out.println("(Please enter Valid quantity and advice for medicine.)alert Message get successfully");
}else {System.out.println("(Please enter Valid quantity and advice for medicine.)alert Message not get successfully");}
delay();
conformation1.accept();
}

@Test(priority = 95,groups = {"Functional"})
public void enterValidQuantityandAdvice_TIDL0060_EH186() throws InterruptedException {
delay();
sch.EnterValidquantityintoMedicineQuantityTextBox("2");

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please enter advice for medicine.");
if(alert.equals("Please enter advice for medicine.")) {
System.out.println("(Please enter advice for medicine.)alert Message get successfully");
}else {System.out.println("(Please enter advice for medicine.)alert Message not get successfully");}
delay();
conformation.accept();
delay();
sch.EnterValidAdviceintoMedicineAdviceTextBox("2 dose in a day");
}

@Test(priority = 96,groups = {"Functional"})
public void SearchMedicinewithNameStarttabisdisplayed_TIDL0061_EH187() {
boolean SearchMedicinewithNameStarttab = sch.validateSearchMedicinewithNameStarttabisdisplayed();
Assert.assertTrue(SearchMedicinewithNameStarttab, "Search Medicine with Name Start tab is not displayed");
if(SearchMedicinewithNameStarttab == true) {
System.out.println("Search Medicine with Name Start tab is displayed");
}
}

@Test(priority = 97,groups = {"Functional"})
public void ClickonSearchMedicinewithNameStarttabandisenabled_TIDL0061_EH187() throws InterruptedException {
boolean SearchMedicinewithNameStarttab = sch.validateSearchMedicinewithNameStarttabisenabled();
Assert.assertTrue(SearchMedicinewithNameStarttab, "Search Medicine with Name Start tab is not enabled");
if(SearchMedicinewithNameStarttab == true) {
System.out.println("Search Medicine with Name Start tab is enabled");
delay();
sch.clickonSearchMedicinewithNameStarttab();
}
}

@Test(priority = 98,groups = {"Functional"})
public void MedicineFirstletteroptionisdisplayed_TIDL0062_EH188() {
boolean MedicineFirstletteroption = sch.validateMedicineFirstletteroptionisdisplayed();
Assert.assertTrue(MedicineFirstletteroption, "Medicine First letter option is not displayed");
if(MedicineFirstletteroption == true) {
System.out.println("Medicine First letter option is displayed");
}
}

@Test(priority = 99,groups = {"Functional"})
public void ClickonMedicineFirstletteroptionandisenabled_TIDL0062_EH188() throws InterruptedException {
boolean MedicineFirstletteroption = sch.validateMedicineFirstletteroptionisenabled();
Assert.assertTrue(MedicineFirstletteroption, "Medicine First letter option is not enabled");
if(MedicineFirstletteroption == true) {
System.out.println("Medicine First letter option is enabled");
delay();
sch.clickonMedicineFirstletteroption("2", "Take 2 dose in a day");
}
}

@Test(priority = 100,groups = {"Functional"})
public void SearchoptiontabofMedicinepartisdisplayed_TIDL0063_EH189() {
boolean SearchoptiontabofMedicinepart = sch.validateSearchoptiontabofMedicinepartisdisplayed();
Assert.assertTrue(SearchoptiontabofMedicinepart, "Search option tab of Medicine part is not  displayed");
if(SearchoptiontabofMedicinepart == true) {
System.out.println("Search option tab of Medicine part is displayed");	
}
}

@Test(priority = 101,groups = {"Functional"})
public void SearchoptiontabofMedicinepartisenabled_TIDL0063_EH189() throws InterruptedException {
boolean SearchoptiontabofMedicinepart = sch.validateSearchoptiontabofMedicinepartisenabled();
Assert.assertTrue(SearchoptiontabofMedicinepart, "Search option tab of Medicine part is not enabled");
if(SearchoptiontabofMedicinepart == true) {
System.out.println("Search option tab of Medicine part is enabled");
delay();
sch.clickonSearchoptiontab();
}
}

@Test(priority = 102,groups = {"Functional"})
public void AnycharacterofMedicineNameTextBoxisdisplayed_TIDL0064_EH190() {
boolean AnycharacterofMedicineNameTextBox = sch.validateAnycharacterofMedicineNameTextBoxisdisplayed();
Assert.assertTrue(AnycharacterofMedicineNameTextBox, "Any character of Medicine Name Text Box is not displayed");
if(AnycharacterofMedicineNameTextBox == true) {
System.out.println("Any character of Medicine Name Text Box is displayed");	
}
}

@Test(priority = 103,groups = {"Functional"})
public void ClickonAnycharacterofMedicineNameTextBoxandisenabled_TIDL0064_EH190() throws InterruptedException {
boolean AnycharacterofMedicineNameTextBox = sch.validateAnycharacterofMedicineNameTextBoxisdisplayed();
Assert.assertTrue(AnycharacterofMedicineNameTextBox, "Any character of Medicine Name Text Box is not enabled");
if(AnycharacterofMedicineNameTextBox == true) {
System.out.println("Any character of Medicine Name Text Box is enabled");	
delay();
sch.EnterdataintoAnycharacterofMedicineNameTextBox("c");
}
}

@Test(priority = 104,groups = {"Functional"})
public void SearchoptionforAnycharacterofMedicineNameisdisplayed_TIDL0067_EH194() {
boolean SearchoptionforAnycharacterofMedicineName = sch.validateSearchoptionforAnycharacterofMedicineNameisdisplayed();
Assert.assertTrue(SearchoptionforAnycharacterofMedicineName, "Search option for Any character of MedicineName is not displayed");
if(SearchoptionforAnycharacterofMedicineName == true) {
System.out.println("Search option for Any character of MedicineName is displayed");	
}
}

@Test(priority = 105,groups = {"Functional"})
public void SearchoptionforAnycharacterofMedicineNameisenabled_TIDL0067_EH194() {
boolean SearchoptionforAnycharacterofMedicineName = sch.validateSearchoptionforAnycharacterofMedicineNameisenabled();
Assert.assertTrue(SearchoptionforAnycharacterofMedicineName, "Search option for Any character of MedicineName is not enabled");
if(SearchoptionforAnycharacterofMedicineName == true) {
System.out.println("Search option for Any character of MedicineName is enabled");
}
}

@Test(priority = 106,groups = {"Functional"})
public void clickonSearchoptionforAnycharacterofMedicineNamebeforeentervalue_TIDL0068_EH195() throws InterruptedException {
delay();
sch.clickonSearchoptionforAnycharacterofMedicineNamebeforeentervalue();

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please enter Any character of Medicine Name.");
if(alert.equals("Please enter Any character of Medicine Name.")) {
System.out.println("alert Message get successfully");
}else {System.out.println("alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 107,groups = {"Functional"})
public void clickonSearchoptionforAnycharacterofMedicineNameafterentervalue_TIDL0069_EH196() throws InterruptedException {
delay();
sch.clickonSearchoptionforAnycharacterofMedicineNameafterentervalue("C", "3", "3 dose in a day ");
}

@Test(priority = 108,groups = {"Functional"})
public void DepartMentDropdownonOforderEntryPageisenabled_TIDL0070_EH197() {
boolean DepartMentDropdownonOforderEntryPage = sch.validateDepartMentDropdownonOforderEntryPageisenabled();
Assert.assertTrue(DepartMentDropdownonOforderEntryPage, "DepartMent Dropdownon Of order Entry Page is not enabled");
if(DepartMentDropdownonOforderEntryPage == true) {
System.out.println("DepartMent Dropdownon Of order Entry Page is enabled");
}
}

@Test(priority = 109,groups = {"Functional"})
public void UnitDropdownonOforderEntryPageisenabled_TIDL0071_EH198() {
boolean UnitDropdownonOforderEntryPage = sch.validateUnitDropdownonOforderEntryPageisenabled();
Assert.assertTrue(UnitDropdownonOforderEntryPage, "Unit Dropdownon Of order Entry Page is not enabled");
if(UnitDropdownonOforderEntryPage == true) {
System.out.println("Unit Dropdownon Of order Entry Page is enabled");
}
}

@Test(priority = 110,groups = {"Functional"})
public void ContactnumberTextboxOforderEntryPageisdisplayed_TIDL0072_EH199() {
boolean ContactnumberTextboxOforderEntryPage = sch.validateContactnumberTextboxOforderEntryPageisdisplayed();
Assert.assertTrue(ContactnumberTextboxOforderEntryPage, "Contact number Text box Of order Entry Page is not displayed");
if(ContactnumberTextboxOforderEntryPage == true) {
System.out.println("Contact number Text box Of order Entry Page is displayed");	
}
}

@Test(priority = 111,groups = {"Functional"})
public void ContactnumberTextboxOforderEntryPageisenabled_TIDL0072_EH199() {
boolean ContactnumberTextboxOforderEntryPage = sch.validateContactnumberTextboxOforderEntryPageisenabled();
Assert.assertTrue(ContactnumberTextboxOforderEntryPage, "Contact number Text box Of order Entry Page is not enabled");
if(ContactnumberTextboxOforderEntryPage == true) {
System.out.println("Contact number Text box Of order Entry Page is enabled");	
}
}

@Test(priority = 112,groups = {"Functional"})
public void enterinvalidDataintoContactnumberTextboxOforderEntryPage_TIDL0073_EH200() throws InterruptedException {
delay();
sch.enterinvalidDataintoContactnumberTextboxOforderEntryPage("123456789123");

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please Enter Valid Contact No.");
if(alert.equals("Please Enter Valid Contact No.")) {
System.out.println("alert Message get successfully");
}else {System.out.println("alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 113,groups = {"Functional"})
public void entervalidDataintoContactnumberTextboxOforderEntryPage_TIDL0074_EH201() throws InterruptedException {
delay();
sch.entervalidDataintoContactnumberTextboxOforderEntryPage("8234933653");
}

@Test(priority = 114,groups = {"Functional"})
public void Investigationradiobuttonisdisplayed_TIDL0075_EH202() {
boolean Investigationradiobutton = sch.validateInvestigationradiobuttonisdisplayed();
Assert.assertTrue(Investigationradiobutton, "Investigation radio button is not displayed");
if(Investigationradiobutton == true) {
System.out.println("Investigation radio button is displayed");	
}
}

@Test(priority = 115,groups = {"Functional","Smoke"})
public void clickonInvestigationradiobuttonisdisenabled_TIDL0075_EH202() throws InterruptedException {
boolean Investigationradiobutton = sch.validateInvestigationradiobuttonisenabled();
Assert.assertTrue(Investigationradiobutton, "Investigation radio button is not enabled");
if(Investigationradiobutton == true) {
System.out.println("Investigation radio button is enabled");
delay();
sch.clickonInvestigationradiobutton();
}
}

@Test(priority = 116,groups = {"Functional","Smoke"})
public void SelectvalueInvestigationDropdownandisenabled_TIDL0076_EH207() throws InterruptedException {
boolean InvestigationDropdown = sch.validateInvestigationDropdownisenabled();
Assert.assertTrue(InvestigationDropdown, "Investigation Dropdown is not enabled");
if(InvestigationDropdown == true) {
System.out.println("Investigation Dropdown is enabled");
delay();

sch.SelectvaluefromInvestigationDropdown();
delay();

if (sch.isAlertPresent()) {
 driver.switchTo().alert();
    driver.switchTo().alert().accept();
}
delay();
sch.Selectsecondservice();
delay();
if (sch.isAlertPresent()) {
 driver.switchTo().alert();
    driver.switchTo().alert().accept();
}
delay();
sch.clickonVerifyObservationMedicinebutton();
}
}

@Test(priority = 117,groups = {"Functional"})
public void PrePostInstructionCommentRemarkspopupClosebuttonisdisplayed_TIDL0077_EH208() {
boolean PrePostInstructionCommentRemarkspopupClosebutton = sch.ValidatePrePostInstructionCommentRemarkspopupClosebuttonisdisplayed();
Assert.assertTrue(PrePostInstructionCommentRemarkspopupClosebutton, "Pre Post Instruction Comment Remarks popup Close button is not displayed");
if(PrePostInstructionCommentRemarkspopupClosebutton == true) {
System.out.println("Pre Post Instruction Comment Remarks popup Close button is displayed");
}
}

@Test(priority = 118,groups = {"Functional"})
public void PrePostInstructionCommentRemarkspopupClosebuttonisenabled_TIDL0077_EH208() throws InterruptedException {
boolean PrePostInstructionCommentRemarkspopupClosebutton = sch.ValidatePrePostInstructionCommentRemarkspopupClosebuttonisenabled();
Assert.assertTrue(PrePostInstructionCommentRemarkspopupClosebutton, "Pre Post Instruction Comment Remarks popup Close button is not enabled");
if(PrePostInstructionCommentRemarkspopupClosebutton == true) {
System.out.println("Pre Post Instruction Comment Remarks popup Close button is enabled");
delay();

String ActualDrName = sch.VerifyActualDoctornameonorderentrypage();
String expectedDrName = sch.VerifyexpectedDoctornameonoPrePostInstructionCommentRemarkspage();

Assert.assertEquals(ActualDrName, expectedDrName, "Dr.Name not matched Successfully");
if(ActualDrName.equals(expectedDrName)) {
System.out.println("Dr.Name matched Successfully");	
}

sch.clickonPrePostInstructionCommentRemarkspopupClosebutton();
}

delay();
String ActualContactNo = sch.VerifyActualContactnumberonorderentrypage();
String expectedContactNo = sch.VerifyexcpectedContactnumberonPrePostInstructionCommentRemarkspage();

Assert.assertEquals(ActualContactNo, expectedContactNo, "Contact Number not matched Successfully");
if(ActualContactNo.equals(expectedContactNo)) {
System.out.println("Contact Numbe rmatched Successfully");
}
sch.clickonVerifyObservationMedicinebutton();
}

@Test(priority = 119,groups = {"Functional"})
public void PrePostInstructionCommentRemarkspopup1stcommentboxisdisplayed_TIDL0078_EH209() {
boolean PrePostInstructionCommentRemarkspopup1stcommentbox = sch.validatePrePostInstructionCommentRemarkspopup1stcommentboxisdisplayed();
Assert.assertTrue(PrePostInstructionCommentRemarkspopup1stcommentbox, "Pre Post Instruction Comment Remarks popup 1st comment box is not displayed");
if(PrePostInstructionCommentRemarkspopup1stcommentbox == true) {
System.out.println("Pre Post Instruction Comment Remarks popup 1st comment box is displayed");
}
}

@Test(priority = 120,groups = {"Functional"})
public void enterTextPrePostInstructionCommentRemarkspopup1stcommentboxisenabled_TIDL0078_EH209() throws InterruptedException {
boolean PrePostInstructionCommentRemarkspopup1stcommentbox = sch.validatePrePostInstructionCommentRemarkspopup1stcommentboxisenabled();
Assert.assertTrue(PrePostInstructionCommentRemarkspopup1stcommentbox, "Pre Post Instruction Comment Remarks popup 1st comment box is not enabled");
if(PrePostInstructionCommentRemarkspopup1stcommentbox == true) {
System.out.println("Pre Post Instruction Comment Remarks popup 1st comment box is enabled");
delay();
sch.enterDataintoPrePostInstructionCommentRemarkspopup1stcommentbox("Test reflected");
}
}

@Test(priority = 121,groups = {"Functional"})
public void PrePostInstructionCommentRemarkspopup2ndcommentboxisdisplayed_TIDL0079_EH210() {
boolean PrePostInstructionCommentRemarkspopup2ndcommentbox = sch.validatePrePostInstructionCommentRemarkspopup2ndcommentboxisdisplayed();
Assert.assertTrue(PrePostInstructionCommentRemarkspopup2ndcommentbox, "Pre Post Instruction Comment Remark spopup 2ndcomment box is not displayed");
if(PrePostInstructionCommentRemarkspopup2ndcommentbox == true)
System.out.println("Pre Post Instruction Comment Remark spopup 2ndcomment box is displayed");
}

@Test(priority = 122,groups = {"Functional"})
public void EntertextintoPrePostInstructionCommentRemarkspopup2ndcommentboxisenabled_TIDL0079_EH210() throws InterruptedException {
boolean PrePostInstructionCommentRemarkspopup2ndcommentbox = sch.validatePrePostInstructionCommentRemarkspopup2ndcommentboxisenabled();
Assert.assertTrue(PrePostInstructionCommentRemarkspopup2ndcommentbox, "Pre Post Instruction Comment Remark spopup 2ndcomment box is not enabled");
if(PrePostInstructionCommentRemarkspopup2ndcommentbox == true)
System.out.println("Pre Post Instruction Comment Remark spopup 2ndcomment box is enabled");
delay();
sch.EntertextintoPrePostInstructionCommentRemarkspopup2ndcommentbox("Service added successfully");
}

@Test(priority = 123,groups = {"Functional"})
public void PrePostInstructionCommentRemarkspopupSavebuttonisdisplayed_TIDL0080_EH211() {
boolean PrePostInstructionCommentRemarkspopupSavebutton = sch.validatePrePostInstructionCommentRemarkspopupSavebuttonisdisplayed();
Assert.assertTrue(PrePostInstructionCommentRemarkspopupSavebutton, "Pre Post Instruction Comment Remarks popup Save button is not displayed");
System.out.println("Pre Post Instruction Comment Remarks popup Save button is displayed");
}

@Test(priority = 124,groups = {"Functional","Smoke"})
public void ClickonPrePostInstructionCommentRemarkspopupSavebuttonandisenabled_TIDL0080_EH211() throws InterruptedException {
boolean PrePostInstructionCommentRemarkspopupSavebutton = sch.validatePrePostInstructionCommentRemarkspopupSavebuttonisenabled();
Assert.assertTrue(PrePostInstructionCommentRemarkspopupSavebutton, "Pre Post Instruction Comment Remarks popup Save button is not enabled");
System.out.println("Pre Post Instruction Comment Remarks popup Save button is enabled");
delay();
sch.clickonPrePostInstructionCommentRemarkspopupSavebutton();
}

@Test(priority = 125,groups = {"Functional"})
public void Popupcloseoptionisdisplayed_TIDL0084_EH215() {
boolean Popupcloseoption = sch.validatePopupcloseoptionisdisplayed();
Assert.assertTrue(Popupcloseoption, "Pop up close option is not displayed");
if(Popupcloseoption == true) {
System.out.println("Pop up close option is displayed");
}
}

@Test(priority = 126,groups = {"Functional","Smoke"})
public void clickonPopupcloseoptionandisenabled_TIDL0084_EH215() throws InterruptedException {
boolean Popupcloseoption = sch.validatePopupcloseoptionisenabled();
Assert.assertTrue(Popupcloseoption, "Pop up close option is not enabled");
if(Popupcloseoption == true) {
System.out.println("Pop up close option is enabled");
longDelay();
sch.clickonPopupcloseoption();
}
}

@Test(priority = 127,groups = {"Functional"})
public void Closeoptionfororderentrypageisdisplayed_TIDL0085_EH216() throws InterruptedException {
sct.switchtoinnerRightFrame();
delay();
boolean Closeoptionfororderentrypage = sch.validateCloseoptionfororderentrypageisdisplayed();
Assert.assertTrue(Closeoptionfororderentrypage, "Close option for order entry page is not displayed");
if(Closeoptionfororderentrypage == true) {
System.out.println("Close option for order entry page is displayed");	
}
}

@Test(priority = 128,groups = {"Functional","Smoke"})
public void clickonCloseoptionfororderentrypageandisenabled_TIDL0085_EH216() throws InterruptedException {
sct.switchtoinnerRightFrame();
boolean Closeoptionfororderentrypage = sch.validateCloseoptionfororderentrypageisenabled();
Assert.assertTrue(Closeoptionfororderentrypage, "Close option for order entry page is not enabled");
if(Closeoptionfororderentrypage == true) {
System.out.println("Close option for order entry page is enabled");	
delay();
sch.clickonCloseoptionfororderentrypage();
}
}

@Test(priority = 129,groups = {"Functional"} )
public void RecommendedDetailsimageisdisplayed_TIDL0014_EH140() throws InterruptedException {
delay();	
boolean RecommendedDetails = sch.validateRecommendedDetailsimageisdisplayed();
Assert.assertTrue(RecommendedDetails);
if(RecommendedDetails == true) {
System.out.println("Recommended Details image button is displayed");	
}else {System.out.println("Recommended Details image button is not displayed");}
}

@Test(priority = 130,groups = {"Functional"})
public void clickonRecommendedDetailsimageandisenabled_TIDL0014_EH140() throws InterruptedException {
delay();	
boolean RecommendedDetails = sch.validateRecommendedDetailsimageisenabled();
Assert.assertTrue(RecommendedDetails);
if(RecommendedDetails == true) {
System.out.println("Recommended Details image button is enabled");	
}else {System.out.println("Recommended Details image button is not enabled");}
sch.clickonRecommendedDetailsImagebutton();

List<WebElement> elements = driver.findElements(By.id("testSubtestDiv"));
for(WebElement ob :elements ) {
	String od = ob.getText();
	System.out.println(od);
}	
}

@Test(priority = 131,groups = {"Functional"})
public void SpecimenSiteTextBoxisdisplayed_TIDL0086_EH217() {
boolean SpecimenSiteTextBox = sch.validateSpecimenSiteTextBoxisdisplayed();
Assert.assertTrue(SpecimenSiteTextBox, "Specimen Site Text Box is not displayed");
if(SpecimenSiteTextBox == true) {
System.out.println("Specimen Site Text Box is displayed");
}
}

@Test(priority = 132,groups = {"Functional"})
public void SpecimenSiteTextBoxisenabled_TIDL0086_EH217() {
boolean SpecimenSiteTextBox = sch.validateSpecimenSiteTextBoxisenabled();
Assert.assertTrue(SpecimenSiteTextBox, "Specimen Site Text Box is not enabled");
if(SpecimenSiteTextBox == true) {
System.out.println("Specimen Site Text Box is enabled");
}
}

@Test(priority = 133,groups = {"Functional"})
public void SelectAllCheckboxisdisplayed_TIDL0087_EH218() {
boolean SelectAllCheckbox = sch.validateSelectAllCheckboxisdisplayed();
Assert.assertTrue(SelectAllCheckbox, "Select All Check box is not displayed");
if(SelectAllCheckbox == true) {
System.out.println("Select All Check box is displayed");	
}
}

@Test(priority = 134,groups = {"Functional"})
public void SelectAllCheckboxisenabled_TIDL0087_EH218() {
boolean SelectAllCheckbox = sch.validateSelectAllCheckboxisenabled();
Assert.assertTrue(SelectAllCheckbox, "Select All Check box is not enabled");
if(SelectAllCheckbox == true) {
System.out.println("Select All Check box is enabled");	
}
}

@Test(priority = 135,groups = {"Functional"})
public void Select1stCheckboxisdisplayed_TIDL0088_EH219() {
boolean Select1stCheckbox = sch.ValidateSelect1stCheckboxisdisplayed();
Assert.assertTrue(Select1stCheckbox, "Select 1st Check box is not displayed");
if(Select1stCheckbox == true) {
System.out.println("Select 1st Check box is displayed");	
}
}

@Test(priority = 136,groups = {"Functional"})
public void Select1stCheckboxisenabled_TIDL0088_EH219() {
boolean Select1stCheckbox = sch.ValidateSelect1stCheckboxisenabled();
Assert.assertTrue(Select1stCheckbox, "Select 1st Check box is not enabled");
if(Select1stCheckbox == true) {
System.out.println("Select 1st Check box is enabled");	
}
}

@Test(priority = 137,groups = {"Functional"})
public void SampleCollectionSavebuttonisdisplayed_TIDL0089_EH220() {
boolean SampleCollectionSavebutton = sch.validateSampleCollectionSavebuttonisdisplayed();
Assert.assertTrue(SampleCollectionSavebutton, "Sample Collection Save button is not displayed");
if(SampleCollectionSavebutton == true) {
System.out.println("Sample Collection Save button is displayed");	
}
}

@Test(priority = 138,groups = {"Functional"})
public void SampleCollectionSavebuttonisenabled_TIDL0089_EH220() {
boolean SampleCollectionSavebutton = sch.validateSampleCollectionSavebuttonisenabled();
Assert.assertTrue(SampleCollectionSavebutton, "Sample Collection Save button is not enabled");
if(SampleCollectionSavebutton == true) {
System.out.println("Sample Collection Save button is enabled");	
}
}

@Test(priority = 139,groups = {"Functional"})
public void Select1stCheckboxandclickonsavebuttonafterenterinvalidspecimensite_TIDL0090_EH221() throws InterruptedException {
delay();	
sch.Select1stCheckboxandclickonsavebuttonafterenterinvalidspecimensite("#$%^&");

Alert conformation = driver.switchTo().alert();
String alert = conformation.getText();
Assert.assertEquals(alert, "Please enter Valid Specimen Site");
if(alert.equals("Please enter Valid Specimen Site")) {
System.out.println("alert Message get successfully");
}else {System.out.println("alert Message not get successfully");}
delay();
conformation.accept();
}

@Test(priority = 140,groups = {"Functional","Smoke"})
public void SelectAllCheckboxandclickonsavebuttonafterenterinvalidspecimensite_TIDL0091_EH232() throws InterruptedException {
delay();	
sch.SelectAllCheckboxandclickonsavebuttonafterenterinvalidspecimensite("Sample taken from hand");
}

@Test(priority = 141,groups = {"Functional"})
public void CollectedSampledetailsImagebuttonisdisplayed_TIDL0012_EH138() throws InterruptedException {
delay();
boolean CollectedSampledetailsImagebutton = sch.validateCollectedSampledetailsImagebuttonisdisplayed();
Assert.assertTrue(CollectedSampledetailsImagebutton);
if(CollectedSampledetailsImagebutton == true) {
System.out.println("Collected Sample details Image button is displayed");	
}else {System.out.println("Collected Sample details Image button is not displayed");}	
}

@Test(priority = 142,groups = {"Functional"})
public void clickonCollectedSampledetailsImagebuttonandisenabeld_TIDL0012_EH138() throws InterruptedException {
delay();
boolean CollectedSampledetailsImagebutton = sch.validateCollectedSampledetailsImagebuttonisenabled();
Assert.assertTrue(CollectedSampledetailsImagebutton);
if(CollectedSampledetailsImagebutton == true) {
System.out.println("Collected Sample details Image button is enabled");	
}else {System.out.println("Collected Sample details Image button is not enabled");}	
sch.clickonCollectedSampledetailsImagebutton();

List<WebElement> elements = driver.findElements(By.id("sampleDiv"));
for(WebElement ob :elements ) {
	String od = ob.getText();
	System.out.println(od);
}
}

@Test(priority = 143,groups = {"Functional","Smoke"})
public void GetUHIDandcollectSampleintoSubCenter() throws InterruptedException {
	sct.switchtoinnerRightFrame();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");
	
int rowCount = reader.getRowCount("OPD");
//Parameterization
for (int rowNum=2; rowNum <=rowCount; rowNum++) {
	String UHID = reader.getCellData("OPD", "UHID", rowNum);
	sch.TakeExcelUHID(UHID);
	delay();
	sch.ClickonInvestigationlink();
	longDelay();
	
	/*try{   
		driver.switchTo().alert().accept();
		  }catch(Exception e){ 
		   System.out.println("unexpected alert not present");   
		  }*/
	
	if (sch.isAlertPresent()) {
		 driver.switchTo().alert();
		    driver.switchTo().alert().accept();
	}
	longDelay();
	sct.switchtoOrderEntryFrame();
	longDelay();
	
	
	sch.AddServicesfromorderentrypage();
	delay();
	sct.switchtoinnerRightFrame();
	sch.SendServicestothrLabSubCenter();
	longDelay();		
	sch.clickonCollectedSampledetailsImagebutton();
	delay();
	String SamplenumberValue = sch.GetSampleNo();
	longDelay();
	reader.setCellData("OPD", "BarCodeNumber", rowNum, SamplenumberValue);
	}
}

/*


@Test(priority = )
public void ObservationEntryDoneisdisplayed_TIDL0013_EH139() throws InterruptedException{
delay();
boolean ObservationEntryDone = samplecollection.validateObservationEntryDoneisdisplayed();
Assert.assertTrue(ObservationEntryDone);
if(ObservationEntryDone == true) {
System.out.println("Observation Entry Done Image button is displayed");
}else {System.out.println("Observation Entry Done Image button is not displayed");}
}
@Test(priority = ,enabled = false)
public void clickonObservationEntryDoneandisenabled_TIDL0013_EH139() throws InterruptedException{
delay();
boolean ObservationEntryDone = samplecollection.validateObservationEntryDoneisenabled();
Assert.assertTrue(ObservationEntryDone);
if(ObservationEntryDone == true) {
System.out.println("Observation Entry Done Image button is enabled");
}else {System.out.println("Observation Entry Done Image button is not enabled");}
samplecollection.clickonObservationEntryDoneImagebutton();
}
*/

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

