package nic.ehospital.qa.testcases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import nic.ehospital.qa.base.TestBase;
import nic.ehospital.qa.excel.XLS_Reader;
import nic.ehospital.qa.pages.ConfigureHospitalInfraPage;
import nic.ehospital.qa.util.TestUtil;

public class ConfigureHospitalInfraPageTest extends TestBase {
		
	ConfigureHospitalInfraPage configureHospitalInfraPage;
	TestUtil testUtil;
	XLS_Reader xlsReader;
	
	public ConfigureHospitalInfraPageTest() throws IOException {
		//super();
	}
/**
 * @author Sonali Saxena
 * @throws IOException
 * @throws InterruptedException
 */
	
	@Test(priority=1, groups={"Functional","Smoke"})
	public void AdminLinkisDisplayed_TIDA001_EH203() throws IOException, InterruptedException{
		configureHospitalInfraPage = new ConfigureHospitalInfraPage();
		testUtil = new TestUtil();
		testUtil.LeftFrame();
		/**
		 * @author Sonali Saxena
		 */
		boolean flag = configureHospitalInfraPage.ValidateAdminLinkisDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Administration link is displayed");
		}
		else{
			System.out.println("Administration link not displayed");
		}
	}	
	
	@Test(priority=2, groups={"Functional"})
	public void AdminLinkisEnabled_TIDA002_EH203(){
	boolean flag = configureHospitalInfraPage.ValidateAdminLinkisEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Administration link is enabled");
	} else{
		System.out.println("Administration link not enabled");
	}
}
	
	@Test(priority=3, groups={"Functional","Smoke"})
	public void AdminLinkisClickable_TIDA003_EH203() throws IOException, InterruptedException{
	Thread.sleep(2000);	
	configureHospitalInfraPage.ValidateAdminLinkisClickable();
	}
	
	

	@Test(priority=4, groups={"Functional"})
	public void HospitalAdminLinkisDisplayed_TIDA004_EH204(){
	boolean flag = configureHospitalInfraPage.ValidateHospitalAdminisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
	System.out.println("Hospital Administration link is displayed");
	} else{
		System.out.println("Hospital Administration link not displayed");
	}
}
	
	@Test(priority=5, groups={"Functional"})
	public void HospitalAdminisEnabled_TIDA005_EH204(){
	boolean flag = configureHospitalInfraPage.ValidateHospitalAdminisEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Hospital Administration link is enabled");
	} else{
		System.out.println("Hospital Administration link not enabled");
	}	}

	@Test(priority=6, groups={"Functional","Smoke"})
	public void HospitalAdminisClickable_TIDA006_EH204(){
	configureHospitalInfraPage.ValidateHospitalAdminisClickable();
	} 
	
	
	//-------------------------------------------COMMENT
	
	
	
	
	@Test(priority=7, groups={"Functional"})
	public void ConfigureHospitalInfraLinkisDisplayed_TIDA007_EH205(){
	boolean flag = configureHospitalInfraPage.ValidateConfigureHospitalInfraLinkisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Configure Hospital Infra link is displayed");
	} else{
		System.out.println("Hospital Administration link not displayed");
	}
}
	
	@Test(priority=8, groups={"Functional"})
	public void ConfigureHospitalInfraLinkisEnabled_TIDA008_EH205(){
	boolean flag = configureHospitalInfraPage.ValidateConfigureHospitalInfraLinkisEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Configure Hospital Infra is enabled");
	} else{
		System.out.println("Configure Hospital Infra link not enabled");
	}	}

	@Test(priority=9, groups={"Functional","Smoke"})
	public void ConfigureHospitalInfraLinkisClickable_TIDA009_EH205() throws InterruptedException{
	configureHospitalInfraPage.ValidateConfigureHospitalInfraLinkisClickable();
	Thread.sleep(2000);
	testUtil.RightFrame();
	
	List<WebElement>elements = driver.findElements(By.tagName("body"));
    for(WebElement ob :elements ) {
    	String od = ob.getText();
    //	System.out.println(od);
    	
    //	Assert.assertEquals(od, "HOME MANAGE BUILDING MANAGE BUILDING-BLOCKS MANAGE FLOORS MANAGE HOSPITAL ROOMS HOSPITAL LOGO MANAGE HOSPITAL DETAILS LOG IN-OUT REGISTER HOSPITAL INFRASTRUCTURE CONFIGURATION");
    	}	
	}
	
	
	
	
	
		@Test(priority=10, groups={"Functional"})
	public void ManageBuildingisDisplayed_TIDA0012_EH206() throws InterruptedException{
	Thread.sleep(2000);
	boolean flag = configureHospitalInfraPage.ValidateManageBuildingisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Building link is displayed");
	}else{
		System.out.println("Manage Building link not displayed");
		}	
	}
	
	@Test(priority=11, groups={"Functional"})
	public void ManageBuildingisEnabled_TIDA0012_EH206(){
	boolean flag = configureHospitalInfraPage.ValidateManageBuildingisEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Building link is enabled");
	}else{
		System.out.println("Manage Building link not enabled");
		}	
	}
	
	@Test(priority=12, groups={"Functional","Smoke"})
	public void ValidateManageBuildingisClickable_TIDA0012_EH206() throws InterruptedException{
	testUtil.RightFrame();
	configureHospitalInfraPage.ValidateManageBuildingisClickable();
	Thread.sleep(2000);
	
	List<WebElement>elements = driver.findElements(By.tagName("table"));	
    for(WebElement ob :elements ) {
    	String od = ob.getText();
    //	System.out.println(od);
	}	
		
	}
	
	
	@Test(priority=13, groups={"Functional"})
	public void BuildingNameisDisplayed_TIDA0014_EH222(){
	boolean flag = configureHospitalInfraPage.ValidateBuildingNameisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true)
	{
		System.out.println("Building Name text box is displayed");
	}else{
		System.out.println("Building Name text box not displayed");
		}	
	}

	@Test(priority=14, groups={"Functional"})
	public void saveBuildingbtnisDisplayed_TIDA0013_EH223(){
	boolean flag = configureHospitalInfraPage.saveBuildingbtnisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
	System.out.println("Save building button is displayed");
	} else{
		System.out.println("Save building button not displayed");
	}
}
	
	@Test(priority=15, groups={"Functional"})
	public void saveBuildingbtnisEnabled_TIDA0013_EH223() throws InterruptedException{
	boolean flag = configureHospitalInfraPage.saveBuildingbtnisEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save building button is enabled ");
	} else{
		System.out.println("Save building button not enabled");
	}
}
	
	@Test(priority=16, groups={"Functional"})
	public void saveBuildingbtnisClickable_TIDA0013_EH223() throws InterruptedException{
	configureHospitalInfraPage.saveBuildingbtnisClickable();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	String expAlert = "Please enter a building name.";
	String actAlert = alertmsg;
	alert.accept();
	Assert.assertEquals(expAlert, actAlert);
	Reporter.log("Save button is cliakable", true);
	}

	
	@Test(priority=17, groups={"Functional","Smoke"})
	public void validBuildingNameEntered_TIDA0017_EH17() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String buildingName = xlsReader.getCellData("TestData", "BuidingName", 2);
	configureHospitalInfraPage.validateValidBuildingNameEntered(buildingName);
	Thread.sleep(2000);
	WebElement updateMsg = configureHospitalInfraPage.validBuildingAddedValidationMsg();
	Thread.sleep(2000);
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Successfully Added");
	System.out.println("Validation message BuildingName added :"+ validationMsg);
	} 
	
	
	
	
	 
	@Test(priority=18, groups={"Functional"})
	public void validatedInvalidBuildingNameEntered_TIDA0018_EH84() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidBuilding = xlsReader.getCellData("TestData", "InvalidBuidingName", 2);
	configureHospitalInfraPage.validatedInvalidBuildingNameEntered(invalidBuilding);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	Thread.sleep(2000);
	System.out.println(alertmsg);
	alert.accept();
//	Thread.sleep(3000);
	Assert.assertEquals(alertmsg, "Please enter a valid building name.");
	//Thread.sleep(3000);
	Reporter.log("Alert handled for entering Invalid Building Name", true);
//	Thread.sleep(3000);
	}
		
	@Test(priority=19, groups={"Functional"})
	public void editBuildingNameisDisplayedTest_TIDA0016_EH224(){
	boolean flag = configureHospitalInfraPage.editBuildingNameBtnisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Edit building button is displayed");
	}else{
		System.out.println("Edit building button not displayed");
		}	
	}
	
	@Test(priority=20, groups={"Functional"})
	public void editBuildingNameBtnisEnabledTest_TIDA0016_EH224() throws InterruptedException{
	boolean flag = configureHospitalInfraPage.editBuildingNameBtnisEnabled() ;
	Assert.assertTrue(flag);
	if(flag==true){
	configureHospitalInfraPage.editBuildingNameBtnisClickable();
	Thread.sleep(2000);
		System.out.println("Edit building button is enabled");
	}else{
		System.out.println("Edit building button not enabled");
		}	
	}
	
	@Test(priority=21, groups={"Functional"})
	public void updateBuildingBtnisDisplayed_TIDA0019_EH225(){
	boolean flag = configureHospitalInfraPage.updateBuildingBtnisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update building button is displayed");
	}else{
		System.out.println("Update building button not displayed");
		}	
	}
	
	@Test(priority=22, groups={"Functional"})
	public void updateBuildingBtnisEnabled_TIDA0019_EH225() throws InterruptedException{
	boolean flag = configureHospitalInfraPage.updateBuildingBtnisEnabled() ;
	Assert.assertTrue(flag);
	if(flag==true){
	configureHospitalInfraPage.updateBuildingBtnisClickable();
	Thread.sleep(3000);
		System.out.println("Update building button is enabled");
	}else{
		System.out.println("Update building button not enabled");
		}	
	}
	
	@Test(priority=23, groups={"Functional","Smoke"})
	public void editBuildingNameAndUpdateValidData_TIDA0020_EH17() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String updatedBuilding = xlsReader.getCellData("TestData", "BuidingName", 3);
	configureHospitalInfraPage.editBuildingNameAndUpdateValidData(updatedBuilding);	
	Thread.sleep(2000);
	WebElement updatedMsg = configureHospitalInfraPage.validBuildingUpdateValidationMsg();
	String validationMsg = updatedMsg.getText();
	Assert.assertEquals(validationMsg, "Successfully Updated");
	System.out.println(validationMsg);
	}
	
	@Test(priority=24, groups={"Functional"})
	public void editBuildingNameAndUpdateInvalidData_TIDA0021_EH84() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String updatedInvalidBuilding = xlsReader.getCellData("TestData", "InvalidBuidingName", 3);
	configureHospitalInfraPage.editBuildingNameAndUpdateInvalidData(updatedInvalidBuilding);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	String expAlert = "Please enter a valid building name.";
	String actAlert = alertmsg;
	Thread.sleep(3000);
	alert.accept();
	Assert.assertEquals(expAlert, actAlert);
	Reporter.log("Alert handled for updating Invalid Building Name", true);
	}
	
	@Test(priority=25, groups={"Functional"})
	public void manageBuildingBlockDisplayedTest_TIDA0022_EH226(){
	boolean flag = configureHospitalInfraPage.validateManageBuildingBlockDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("ManageBuildingBlock text box is displayed");
	}else{
		System.out.println("ManageBuildingBlock Name text box not displayed");
		}	
	}
	
	@Test(priority=26, groups={"Functional"})
	public void manageBuildingBlockEnabledTest_TIDA0022_EH226(){
	boolean flag = configureHospitalInfraPage.validateManageBuildingBlockEnabled() ;
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("ManageBuildingBlock text box is enabled");
	}else{
		System.out.println("ManageBuildingBlock Name text box not enabled");
		}	
	}
	
	@Test(priority=27, groups={"Functional","Smoke"})
	public void manageBuildingBlockClickableTest_TIDA0022_EH226(){
	configureHospitalInfraPage.validateManageBuildingBlockClickable();
	
	List<WebElement>elements = driver.findElements(By.xpath("//*[contains(@cellspacing,'1')]"));
    for(WebElement ob :elements ) {
    	String od = ob.getText();
    //	System.out.println(od);
	}
		}
	
	
	@Test(priority=28, groups={"Functional"})
	public void selectBuildingDropdownDisplayed_TIDA0023_EH227(){
	boolean flag = configureHospitalInfraPage.validateSelectBuildingDropdownDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("SelectBuilding dropdown  is displayed");
	}else{
		System.out.println("SelectBuilding dropdown not displayed");
		}	
	}

	@Test(priority=29, groups={"Functional"})
	public void validateSelectBuildingDropdownEnabled_TIDA0023_EH227(){
	boolean flag = configureHospitalInfraPage.validateSelectBuildingDropdownEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("SelectBuilding dropdown  is enabled");
	}else{
		System.out.println("SelectBuilding dropdown not enabled");
		}	
	}

	@Test(priority=30, groups= {"Functional"})
	public void validateSelectBuildingDropdwnIsMultiple_TIDA0023_EH227() throws InterruptedException{
	boolean flag = configureHospitalInfraPage.validateSelectBuildingDropdwnIsMultiple();
	Assert.assertFalse(flag);
	if(flag==false){
		System.out.println("This Dropdown doesn't allow to select Multiple Values");
	}
		}
	
	@Test(priority=31, groups={"Functional"})
	public void enterBlockNameTextboxDisplayed_TIDA0024_EH228(){
	boolean flag = configureHospitalInfraPage.enterBlockNameTextboxDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Enter BlockName textbox  is displayed");
	}else{
		System.out.println("Enter BlockName textbox not displayed");
		}	
	}

	@Test(priority=32, groups={"Functional"})
	public void saveBlockNameBtnDisplayed_TIDA0026_EH229(){
	boolean flag = configureHospitalInfraPage.saveBlockNameBtnDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save BuildingBlock Btn  is displayed");
	}else{
		System.out.println("Save BuildingBlock Btn not displayed");
		}	
	}

	@Test(priority=33, groups={"Functional"})
	public void saveBlockNameBtnEnabled_TIDA0026_EH229(){
	boolean flag = configureHospitalInfraPage.saveBlockNameBtnEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save BuildingBlock Btn  is enabled");
	}else{
		System.out.println("Save BuildingBlock Btn not enabled");
		}	
	}	
	
	@Test(priority=34, groups={"Functional"})
	public void saveBlockNameBtnClickable_TIDA0026_EH229() throws InterruptedException{
	configureHospitalInfraPage.saveBlockNameBtnClickable();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	String expAlert = "Please select a building.";
	String actAlert = alertmsg;
	alert.accept();
	Assert.assertEquals(expAlert, actAlert);
	Reporter.log("Alert handled for clicking save button populating Building Name", true);
	}
	
	@Test(priority=35, groups={"Functional","Smoke"})
	public void selectBuidingAndBlockNameTest_TIDA0028_EH60() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String blockName = xlsReader.getCellData("TestData", "BlockName", 2);
	configureHospitalInfraPage.selectBuidingAndBlockName(blockName);
	Thread.sleep(2000);
	WebElement addedMsg = configureHospitalInfraPage.validBuildingBlocknameAddedValidationMsg();
	String msg = addedMsg.getText();
	Assert.assertEquals(msg, "Block Successfully Added");
	Thread.sleep(4000);
	System.out.println(msg);
	} 
	
	@Test(priority=36, groups={"Functional"})
	public void invalidBuidingAndBlockNameAdded_TIDA0030_EH60() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String blockName = xlsReader.getCellData("TestData", "InvalidBlockName", 2);
	configureHospitalInfraPage.selectBuidingAndBlockName(blockName);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	String expAlert = "Please enter a valid block name.";
	String actAlert = alertmsg;
	alert.accept();
	Assert.assertEquals(expAlert, actAlert);
	Reporter.log("Alert handled for updating Invalid Block Name", true);
	}
	
	@Test(priority=37, groups={"Functional"})
	public void manageBuildingBlockEditBtnisDisplayedTest_TIDA0029_EH230(){
	boolean flag = configureHospitalInfraPage.manageBuildingBlockEditBtnisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("ManageBuildingBlock Edit Btn is displayed");
	}else{
		System.out.println("ManageBuildingBlock Edit Btn not displayed");
		}	
	}
	
	@Test(priority=38, groups={"Functional"})
	public void manageBuildingBlockEditBtnisEnabledTest_TIDA0029_EH230(){
	boolean flag = configureHospitalInfraPage.manageBuildingBlockEditBtnisEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("ManageBuildingBlock Edit Btn is enabled");
	}else{
		System.out.println("ManageBuildingBlock Edit Btn not enabled");
		}	
	}
	 
	@Test(priority=39, groups={"Functional"})
	public void manageBuildingBlockEditBtnisClickable_TIDA0029_EH230() throws InterruptedException{
	configureHospitalInfraPage.manageBuildingBlockEditBtnisClickable();
	Thread.sleep(2000);
	}
	
	@Test(priority=40, groups={"Functional"})
	public void updateBuildingBlockBtnisDisplayed_TIDA0030_EH231(){
	boolean flag = configureHospitalInfraPage.manageBuildingBlockEditBtnisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("ManageBuildingBlock Edit Btn is displayed");
	}else{
		System.out.println("ManageBuildingBlock Edit Btn not displayed");
		}	
	}
	
	@Test(priority=41, groups={"Functional"})
	public void updateBuildongBlockBtnisEnabled_TIDA0030_EH231(){
	boolean flag = configureHospitalInfraPage.updateBuildongBlockBtnisEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		configureHospitalInfraPage.updateBuildongBlockBtnisClickable();
		System.out.println("ManageBuildingBlock Edit Btn is enabled and clickable");
	}else{
		System.out.println("ManageBuildingBlock Edit Btn not enabled");
		}	
	}
		
	@Test(priority=42, groups={"Functional","Smoke"})
	public void editBuildingBlockNameAndUpdateTest_TIDA0033_EH60() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String updatedBlock = xlsReader.getCellData("TestData", "BlockName", 4);
	configureHospitalInfraPage.editBuildingBlockNameAndUpdate(updatedBlock);
	Thread.sleep(3000);
	WebElement updateMsg = configureHospitalInfraPage.buildingBlockUpdateValidationMsg();
	String msg = updateMsg.getText();
	Assert.assertEquals(msg, "Block Successfully Updated");
	System.out.println(msg);
	Thread.sleep(2000);
	}
	
	 @Test(priority=43, groups={"Functional"})
	public void invalidBuildingBlockNameAndUpdateTest_TIDA0035_EH86() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String updatedBlock = xlsReader.getCellData("TestData", "InvalidBlockName", 4);
	configureHospitalInfraPage.invalidBuildingBlockNameAndUpdate(updatedBlock);	
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	String expAlert = "Please enter a valid block name.";
	String actAlert = alertmsg;
	alert.accept();
	Assert.assertEquals(expAlert, actAlert);
	Reporter.log("Alert handled for updating Invalid Building Name", true);
	}	
	 
	@Test(priority=44, groups={"Functional"})
	public void ValidateManageFloorisDisplayedTest() throws InterruptedException{
	Thread.sleep(2000);
	boolean flag = configureHospitalInfraPage.ValidateManageFloorisDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Floors link is displayed");
	}else{
		System.out.println("Manage Floors link not displayed");
		}	
	}
	
	@Test(priority=45, groups={"Functional"})
	public void ValidateManageFloorisEnabledTest(){
	boolean flag = configureHospitalInfraPage.ValidateManageFloorisEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Manage Floors link is enabled");
	}else{
		System.out.println("Manage Floors link not enabled");
		}	
	}	
	
	
	@Test(priority=46, groups={"Functional","Smoke"})
	public void ValidateManageFloorisClickableTest() throws InterruptedException{
	configureHospitalInfraPage.ValidateManageFloorisClickable();
	Thread.sleep(2000);
	
	List<WebElement>elements = driver.findElements(By.tagName("table"));
    for(WebElement ob :elements ) {
    	String od = ob.getText();
    //	System.out.println(od);
	}
		}
	
	
	@Test(priority=47, groups={"Functional"})
	public void addFloorTextboxIsDisplayed(){
	boolean flag = configureHospitalInfraPage.addFloorTextboxIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Floor Textbox is displayed");
	}else{
		System.out.println("Add Floor Textbox not displayed");
		}	
	}
	
	@Test(priority=48, groups={"Functional"})
	public void addFloorTextboxIsEnabled() throws InterruptedException{
	boolean flag = configureHospitalInfraPage.addFloorTextboxIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Add Floor Textbox is enabled");
	}else{
		System.out.println("Add Floor Textbox not enabled");
		}	
	}
	
	@Test(priority=49, groups={"Functional"})
	public void saveFloorBtnIsDisplayed(){
	boolean flag = configureHospitalInfraPage.saveFloorBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Save Floor Button is displayed");
	}else{
		System.out.println("Save Floor Button not displayed");
		}	
	}
	
	@Test(priority=50, groups={"Functional"})
	public void saveFloorBtnIsEnabled() throws InterruptedException{
	boolean flag = configureHospitalInfraPage.saveFloorBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		configureHospitalInfraPage.saveFloorBtnIsClickable();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(alertmsg, "Please enter a floor name.");
		Reporter.log("Save button is enabled and cliakable", true);
	}else{
		System.out.println("Save Floor Button neither enabled nor clickable");
		}	
	}

	@Test(priority=51, groups={"Functional"})
	public void editFloorBtnIsDisplayed(){
	boolean flag = configureHospitalInfraPage.editFloorBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Edit Floor Button is displayed");
	}else{
		System.out.println("Edit Floor Button not displayed");
		}	
	}
	
	@Test(priority=52, groups={"Functional"})
	public void editFloorBtnIsEnabled() throws InterruptedException{
	boolean flag = configureHospitalInfraPage.editFloorBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		configureHospitalInfraPage.editFloorBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("Edit Floor Button enabled and clickable");
	}else{
		System.out.println("Edit Floor Button neither enabled nor clickable");
		}	
	}

	@Test(priority=53, groups={"Functional"})
	public void updateFloorBtnIsDisplayed(){
	boolean flag = configureHospitalInfraPage.updateFloorBtnIsDisplayed();
	Assert.assertTrue(flag);
	if(flag==true){
		System.out.println("Update Floor Button is displayed");
	}else{
		System.out.println("Update Floor Button not displayed");
		}	
	}
	
	@Test(priority=54, groups={"Functional"})
	public void updateFloorBtnIsEnabled() throws InterruptedException{
	boolean flag = configureHospitalInfraPage.updateFloorBtnIsEnabled();
	Assert.assertTrue(flag);
	if(flag==true){
		configureHospitalInfraPage.updateFloorBtnIsClickable();
		Thread.sleep(2000);
		System.out.println("Update Floor Button enabled and clickable");
	}else{
		System.out.println("Update Floor Button neither enabled nor clickable");
		}	
	}
	
	
	@Test(priority=55, groups={"Functional","Smoke"})
	public void validFloorAdded() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String floorName = xlsReader.getCellData("TestData", "FloorName", 2);
	configureHospitalInfraPage.validFloorAdded(floorName);
	Thread.sleep(2000);
	WebElement updateMsg = configureHospitalInfraPage.duplicateFloorAddedValidationMsg();
	Thread.sleep(2000);
	String validationMsg = updateMsg.getText();
	Assert.assertEquals(validationMsg, "Floor name is already available.  ");
	System.out.println("Validation message FloorName added :"+ validationMsg);
	}

	
	@Test(priority=56, groups={"Functional"})
	public void invalidFloorAdded() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String invalidFloor = xlsReader.getCellData("TestData", "InvalidFloorName", 4);
	configureHospitalInfraPage.invalidFloorAdded(invalidFloor);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	String expAlert = "Please enter a valid floor name.";
	String actAlert = alertmsg;
	Thread.sleep(2000);
	alert.accept();
	//Thread.sleep(2000);
	Assert.assertEquals(expAlert, actAlert);
	Reporter.log("Alert handled for updating Invalid Floor Name", true);
	}
	
	
	@Test(priority=57, groups={"Functional","Smoke"})
	public void editFloor_UpdateValidData() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String updatedFloor = xlsReader.getCellData("TestData", "FloorName", 3);
	configureHospitalInfraPage.editFloor_UpdateValidData(updatedFloor);
	Thread.sleep(3000);
	WebElement updateMsg = configureHospitalInfraPage.validFloorUpdatedValidationMsg();
	String msgs = updateMsg.getText();
	Assert.assertEquals(msgs, "Floor name is already available.  ");
	System.out.println(msgs);

	}
	
	
	 @Test(priority=58, groups={"Functional"})
	public void editFloor_UpdateInvalidData() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String updateInvalidFloor = xlsReader.getCellData("TestData", "InvalidFloorName", 2);
	configureHospitalInfraPage.editFloor_UpdateInvalidData(updateInvalidFloor);
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid floor name.");
	Reporter.log("Alert handled for updating Invalid Floor Name", true);
	}	

	 @Test(priority=59, groups={"Functional"})
		public void manageHospitalRoomsIsDisplayed(){
		boolean flag = configureHospitalInfraPage.manageHospitalRoomsIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms link is displayed");
		}else{
			System.out.println("Manage Hospital Rooms link not displayed");
			}	
		}

	 @Test(priority=60, groups={"Functional"})
		public void manageHospitalRoomsIsEnabled() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.manageHospitalRoomsIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms link enabled");
			
		}else{
			System.out.println("Manage Hospital Rooms link not enabled");
			}	
		}
		
		@Test(priority=61, groups={"Functional","Smoke"})
		public void manageHospitalRoomsIsClikabl() throws InterruptedException{
		configureHospitalInfraPage.manageHospitalRoomsIsClickable();
		
		List<WebElement>elements = driver.findElements(By.tagName("table"));
	    for(WebElement ob :elements ) {
	    	String od = ob.getText();
	    //	System.out.println(od);
	    	//Assert.assertEquals(od,"");
	    } 
	}

		@Test(priority=62, groups={"Functional"})
		public void buildingDropdownDisplayed(){
		boolean flag = configureHospitalInfraPage.buildingDropdownDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_SelectBuilding dropdown  is displayed");
		}else{
			System.out.println("Manage Hospital Rooms_SelectBuilding dropdown not displayed");
			}	
		}

		@Test(priority=63, groups={"Functional"})
		public void buildingDropdownEnabled(){
		boolean flag = configureHospitalInfraPage.buildingDropdownEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_SelectBuilding dropdown  is enabled");
		}else{
			System.out.println("Manage Hospital Rooms_SelectBuilding dropdown not enabled");
			}	
		}

		@Test(priority=64, groups= {"Functional"})
		public void buildingDropdwnIsMultiple() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.validateSelectBuildingDropdwnIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("Manage Hospital Rooms_Select building dropdown doesn't allow to select multiple values");
		}
			}

		@Test(priority=65, groups={"Functional"})
		public void blockDropdownDisplayed(){
		boolean flag = configureHospitalInfraPage.blockDropdownDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_Select block dropdown  is displayed");
		}else{
			System.out.println("Manage Hospital Rooms_Select block dropdown not displayed");
			}	
		}

		@Test(priority=66, groups={"Functional"})
		public void blockDropdownEnabled(){
		boolean flag = configureHospitalInfraPage.blockDropdownEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_Select block dropdown  is enabled");
		}else{
			System.out.println("Manage Hospital Rooms_Select block dropdown not enabled");
			}	
		}

		@Test(priority=67, groups= {"Functional"})
		public void blockDropdwnIsMultiple() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.blockDropdwnIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("Manage Hospital Rooms_Select block dropdown doesn't allow to select multiple values");
		}
			}
		
		@Test(priority=68, groups={"Functional"})
		public void floorDropdownDisplayed(){
		boolean flag = configureHospitalInfraPage.floorDropdownDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_Select floor dropdown  is displayed");
		}else{
			System.out.println("Manage Hospital Rooms_Select floor dropdown not displayed");
			}	
		}

		@Test(priority=69, groups={"Functional"})
		public void floorDropdownEnabled(){
		boolean flag = configureHospitalInfraPage.floorDropdownEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_Select floor dropdown  is enabled");
		}else{
			System.out.println("Manage Hospital Rooms_Select floor dropdown not enabled");
			}	
		}

		@Test(priority=70, groups= {"Functional"})
		public void floorDropdwnIsMultiple() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.floorDropdwnIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("Manage Hospital Rooms_Select floor dropdown doesn't allow to select multiple values");
		}
			}
		
		@Test(priority=71, groups={"Functional"})
		public void roomNumbeTxtboxDisplayed(){
		boolean flag = configureHospitalInfraPage.roomNumbeTxtboxDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_RoomNo. textbox  is displayed");
		}else{
			System.out.println("Manage Hospital Rooms_RoomNo. textbox not displayed");
			}	
		}

		@Test(priority=72, groups={"Functional"})
		public void roomNumbeTxtboxEnabled(){
		boolean flag = configureHospitalInfraPage.roomNumbeTxtboxEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_RoomNo. textbox  is enabled");
		}else{
			System.out.println("Manage Hospital Rooms_RoomNo. textbox not enabled");
			}	
		}
		
		@Test(priority=73, groups={"Functional"})
		public void remarksTxtboxDisplayed(){
		boolean flag = configureHospitalInfraPage.remarksTxtboxDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_Remarks textbox  is displayed");
		}else{
			System.out.println("Manage Hospital Rooms_Remarks. textbox not displayed");
			}	
		}

		@Test(priority=74, groups={"Functional"})
		public void remarksTxtboxEnabled(){
		boolean flag = configureHospitalInfraPage.remarksTxtboxEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_Remarks. textbox  is enabled");
		}else{
			System.out.println("Manage Hospital Rooms_Remarks textbox not enabled");
			}	
		}
		
		@Test(priority=75, groups={"Functional"})
		public void saveHsptlRoomsBtnisDisplayed(){
		boolean flag = configureHospitalInfraPage.saveHsptlRoomsBtnisDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_Save btn is displayed");
		}else{
			System.out.println("Manage Hospital Rooms_Save Btn not displayed");
			}	
		}

		@Test(priority=76, groups={"Functional"})
		public void saveHsptlRoomsBtnisEnabled() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.saveHsptlRoomsBtnisEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			configureHospitalInfraPage.saveHsptlRoomsBtnisClickable();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			Thread.sleep(2000);
			alert.accept();
			Assert.assertEquals(alertmsg, "Please select a building.");
			Reporter.log("Alert handled_Manage Hospital Rooms_Sacve Btn is enabled", true);
			}
			else{
			System.out.println("Manage Hospital Rooms_Save Btn not enabled");
			}	
		}
		
		@Test(priority=77, groups={"Functional"})
		public void editHsptlRoomsBtnisDisplayed(){
		boolean flag = configureHospitalInfraPage.editHsptlRoomsBtnisDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_Edit btn is displayed");
		}else{
			System.out.println("Manage Hospital Rooms_Edit Btn not displayed");
			}	
		}

		@Test(priority=78, groups={"Functional"})
		public void editHsptlRoomsBtnisEnabled() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.editHsptlRoomsBtnisEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			configureHospitalInfraPage.editHsptlRoomsBtnisClickable();
			Reporter.log("Manage Hospital Rooms_Edit Btn is enabled & clickable", true);
			}
			else{
			System.out.println("Manage Hospital Rooms_Edit Btn neither enabled nor clickable");
			}	
		}
		
		@Test(priority=79, groups={"Functional"})
		public void updateHsptlRoomsBtnisDisplayed(){
		boolean flag = configureHospitalInfraPage.updateHsptlRoomsBtnisDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Manage Hospital Rooms_Update btn is displayed");
		}else{
			System.out.println("Manage Hospital Rooms_Update Btn not displayed");
			}	
		}

		@Test(priority=80, groups={"Functional"})
		public void updateHsptlRoomsBtnisEnabled() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.updateHsptlRoomsBtnisEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			configureHospitalInfraPage.updateHsptlRoomsBtnisClickable();
			WebElement updatedMsg = configureHospitalInfraPage.hsptlRoomsUpdatedValidationMsg();
			String msg = updatedMsg.getText();
			Thread.sleep(2000);
			Assert.assertEquals(msg, "Successfully Updated");
			Reporter.log("Manage Hospital Rooms_Update Btn is enabled & clickable", true);
			}
			else{
			System.out.println("Manage Hospital Rooms_Update Btn neither enabled nor clickable");
			}	
		}


		@Test(priority=81, groups={"Functional","Smoke"}, enabled=false)
		public void enteringValidDataForHospitalRooms() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String RoomNumber = xlsReader.getCellData("TestData", "RoomNo", 2);
		String Remarks = xlsReader.getCellData("TestData", "Remarks", 2);
		configureHospitalInfraPage.enteringValidDataForHospitalRooms(RoomNumber, Remarks);
		WebElement detailsAddedMsg = configureHospitalInfraPage.validHospitalzDetailsAddedValidationMsg();
		String validationMsg = detailsAddedMsg.getText();
		Assert.assertEquals(validationMsg, "Successfully Added");
		System.out.println("Validation message for Add Hospital Rooms :"+ validationMsg);
		} 
		
		@Test(priority=82, groups={"Functional"})
		public void manageHospitalRooms_SelectBuildingOnly() throws InterruptedException{
		configureHospitalInfraPage.manageHospitalRooms_SelectBuildingOnly();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please select a block.");
		Reporter.log("Alert handled_Only Building selected", true);
		} 

		@Test(priority=83, groups={"Functional"})
		public void manageHospitalRooms_SelectBuildingAndBlock() throws InterruptedException{
		configureHospitalInfraPage.manageHospitalRooms_SelectBuildingAndBlock();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please select a floor.");
		Reporter.log("Alert handled_only Building&Block selected", true);
		} 

		@Test(priority=84, groups={"Functional"})
		public void manageHospitalRooms_SelectBuildingBlockFloor() throws InterruptedException{
		configureHospitalInfraPage.manageHospitalRooms_SelectBuildingBlockFloor();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a room number.");
		Reporter.log("Alert handled_only BuildingBlockFloor selected", true);
		} 

		@Test(priority=85, groups={"Functional"})
		public void manageHospitalRooms_EnteringBuildingBlockFloorRoomNo() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String RoomNumber = xlsReader.getCellData("TestData", "RoomNo", 2);
		configureHospitalInfraPage.manageHospitalRooms_EnteringBuildingBlockFloorRoomNo(RoomNumber);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a remark.");
		Reporter.log("Alert handled_BuildingBlockFloorRoomNo selected", true);
		} 

		@Test(priority=86, groups={"Functional"})
		public void manageHospitalRooms_EnteringBuildingBlockFloorRemarks() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String Remarks = xlsReader.getCellData("TestData", "Remarks", 2);
		configureHospitalInfraPage.manageHospitalRooms_EnteringBuildingBlockFloorRemarks(Remarks);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a room number.");
		Reporter.log("Alert handled_BuildingBlockFloorRemarks selected", true);
		} 
	
		@Test(priority=87, groups={"Functional"})
		public void enteringInvalidData_ManageHospitalRooms() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String InvalidRoomNumber = xlsReader.getCellData("TestData", "InvalidRoomNo", 2);
		String InvalidRemarks = xlsReader.getCellData("TestData", "InvalidRemarks", 2);
		configureHospitalInfraPage.enteringInvalidData_ManageHospitalRooms(InvalidRoomNumber, InvalidRemarks);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a valid room number.");
		Reporter.log("Alert handled_for entring invalid data", true);
		} 
	
		@Test(priority=87, groups={"Functional"})
		public void enteringInvalidRoomNoBlankRemarks_ManageHospitalRooms() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String InvalidRoomNumber = xlsReader.getCellData("TestData", "InvalidRoomNo", 2);
		configureHospitalInfraPage.enterInvalidRoomNoBlankRemarks_ManageHospitalRooms(InvalidRoomNumber);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a valid room number.");
		Reporter.log("Alert handled_for entring invalid RoomNo. and remarks blank", true);
		} 

		@Test(priority=88, groups={"Functional"})
		public void enteringInvalidRoomValidRemarks_ManageHospitalRooms() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String InvalidRoomNumber = xlsReader.getCellData("TestData", "InvalidRoomNo", 2);
		String ValidRemarks = xlsReader.getCellData("TestData", "Remarks", 2);
		configureHospitalInfraPage.enteringInvalidRoomValidRemarks_ManageHospitalRooms(InvalidRoomNumber, ValidRemarks);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a valid room number.");
		Reporter.log("Alert handled_for entring invalid RoomNo. with valid remarks", true);
		} 
		
		@Test(priority=89, groups={"Functional"})
		public void roomNoBlankEnterInvalidRemarks_ManageHospitalRooms() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String InvalidRemarks = xlsReader.getCellData("TestData", "InvalidRemarks", 2);
		configureHospitalInfraPage.roomNoBlankEnterInvalidRemarks_ManageHospitalRooms(InvalidRemarks);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a room number.");
		Reporter.log("Alert handled_for Blank RoomNo. and Invalid remarks blank", true);
		} 

		@Test(priority=90, groups={"Functional"})
		public void enterValidRoomNoInvalidRemarks_ManageHospitalRooms() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String ValidRoomNumber = xlsReader.getCellData("TestData", "RoomNo", 2);
		String InvalidRemarks = xlsReader.getCellData("TestData", "InvalidRemarks", 2);
		configureHospitalInfraPage.enterValidRoomNoInvalidRemarks_ManageHospitalRooms(ValidRoomNumber, InvalidRemarks);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(alertmsg, "Please enter a valid remark.");
		Reporter.log("Alert handled_for entring valid RoomNo. with invalid remarks", true);
		} 

		@Test(priority=91, groups={"Functional","Smoke"},enabled=false)
		public void editHsptlRoomsInOneGo() throws InterruptedException{
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String RoomNumber = xlsReader.getCellData("TestData", "RoomNo", 3);
		String Remarks = xlsReader.getCellData("TestData", "Remarks", 3);
		configureHospitalInfraPage.editHsptlRoomsInOneGo(RoomNumber, Remarks);
		WebElement detailsAddedMsg = configureHospitalInfraPage.validHospitalzDetailsAddedValidationMsg();
		String validationMsg = detailsAddedMsg.getText();
		Assert.assertEquals(validationMsg, "Successfully Updated");
		System.out.println("Validation message for Add Hospital Rooms :"+ validationMsg);
		} 
	
	@Test(priority=92, groups={"Functional"})
	public void editHsptlRooms_SelectBuildingOnly() throws InterruptedException{
	configureHospitalInfraPage.editHsptlRooms_SelectBuildingOnly();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please select a block.");
	Reporter.log("Alert handled_Only Building selected", true);
	} 

	@Test(priority=93, groups={"Functional"})
	public void editHsptlRooms_SelectBuildingBlockOnly() throws InterruptedException{
	configureHospitalInfraPage.editHsptlRooms_SelectBuildingBlockOnly();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please select a floor.");
	Reporter.log("Alert handled_Only Building selected", true);
	} 
	
	@Test(priority=94, groups={"Functional"})
	public void editHsptlRooms_SelectBuildingBlockFloor() throws InterruptedException{
	configureHospitalInfraPage.editHsptlRooms_SelectBuildingBlockFloor();
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a room number.");
	Reporter.log("Alert handled_only BuildingBlockFloor selected", true);
	} 
	
	@Test(priority=95, groups={"Functional"})
	public void editHsptlRooms_EnteringBuildingBlockFloorRoomNo() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String RoomNumber = xlsReader.getCellData("TestData", "RoomNo", 2);
	configureHospitalInfraPage.editHsptlRooms_EnteringBuildingBlockFloorRoomNo(RoomNumber);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a remark.");
	Reporter.log("Alert handled_BuildingBlockFloorRoomNo selected", true);
	} 	
	
	@Test(priority=96, groups={"Functional"})
	public void editHsptlRooms_EnteringBuildingBlockFloorRemarks() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String RoomNumber = xlsReader.getCellData("TestData", "RoomNo", 2);
	configureHospitalInfraPage.editHsptlRooms_EnteringBuildingBlockFloorRemarks(RoomNumber);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a room number.");
	Reporter.log("Alert handled_BuildingBlockFloorRoomNo selected", true);
	} 

	@Test(priority=97, groups={"Functional"})
	public void enteringInvalidRoomRemarks_editHsptlRooms() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String InvalidRoomNumber = xlsReader.getCellData("TestData", "InvalidRoomNo", 2);
	String InvalidRemarks = xlsReader.getCellData("TestData", "InvalidRemarks", 2);
	configureHospitalInfraPage.enteringInvalidRoomRemarks_editHsptlRooms(InvalidRoomNumber, InvalidRemarks);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid room number.");
	Reporter.log("Alert handled_for entring invalid data", true);
	} 
	
	@Test(priority=98, groups={"Functional"})
	public void enterInvalidRoomNoBlankRemarks_editHsptlRooms() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String InvalidRoomNumber = xlsReader.getCellData("TestData", "InvalidRoomNo", 2);
	configureHospitalInfraPage.enterInvalidRoomNoBlankRemarks_editHsptlRooms(InvalidRoomNumber);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid room number.");
	Reporter.log("Alert handled_for entring invalid RoomNo. and remarks blank", true);
	} 	
	
	@Test(priority=99, groups={"Functional"})
	public void enteringInvalidRoomValidRemarks_editHsptlRoom() throws InterruptedException{
	String ValidRemarks = xlsReader.getCellData("TestData", "Remarks", 2);
	configureHospitalInfraPage.enteringInvalidRoomValidRemarks_editHsptlRoom(ValidRemarks);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid room number.");
	Reporter.log("Alert handled_for entring invalid RoomNo. with valid remarks", true);
	}
	
	@Test(priority=100, groups={"Functional"})
	public void roomNoBlankEnterInvalidRemarks_editHsptlRooms() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String InvalidRemarks = xlsReader.getCellData("TestData", "InvalidRemarks", 2);
	configureHospitalInfraPage.roomNoBlankEnterInvalidRemarks_editHsptlRooms(InvalidRemarks);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a room number.");
	Reporter.log("Alert handled_for Blank RoomNo. and Invalid remarks blank", true);
	} 	
	
	@Test(priority=101, groups={"Functional"})
	public void enterValidRoomNoInvalidRemarks_editHsptlRooms() throws InterruptedException{
	xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
	String ValidRoomNumber = xlsReader.getCellData("TestData", "RoomNo", 2);
	String InvalidRemarks = xlsReader.getCellData("TestData", "InvalidRemarks", 2);
	configureHospitalInfraPage.enterValidRoomNoInvalidRemarks_editHsptlRooms(ValidRoomNumber, InvalidRemarks);
	Alert alert = driver.switchTo().alert();
	String alertmsg = alert.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	alert.accept();
	Assert.assertEquals(alertmsg, "Please enter a valid remark.");
	Reporter.log("Alert handled_for entring valid RoomNo. with invalid remarks", true);
	} 
	
	
	
	

	
	
	

		@Test(priority=102, groups={"Functional"})
		public void hospitalLogoisDisplayed(){
		boolean flag = configureHospitalInfraPage.hospitalLogoisDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Hospital logo link is displayed");
		}else{
			System.out.println("hospitalLogo link not displayed");
			}	
		}
		
		@Test(priority=103, groups={"Functional","Smoke"})
		public void hospitalLogoisEnabled(){
		boolean flag = configureHospitalInfraPage.hospitalLogoisEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			configureHospitalInfraPage.hospitalLogoisClickable();
			System.out.println("Hospital logo link is enabled and clickable");
			
			List<WebElement>elements = driver.findElements(By.tagName("body"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od);	
		    	}
		}
			}
		

		@Test(priority=104, groups={"Functional"})
		public void hospitalLogo_BrowseBtnisDisplayed(){
		boolean flag = configureHospitalInfraPage.hospitalLogo_BrowseBtnisDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Hospital logo_Browse Button is displayed");
		}else{
			System.out.println("hospitalLogo not_Browse Button displayed");
			}	
		}
		
		@Test(priority=105, groups={"Functional"})
		public void hospitalLogo_BrowseBtnisEnabled(){
		boolean flag = configureHospitalInfraPage.hospitalLogo_BrowseBtnisEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Hospital logo_Browse Button is enabled");
		}else{
			System.out.println("Hospital logo_Browse Button not enabled");
			}	
		}

		@Test(priority=106, groups={"Functional","Smoke"})
		public void hospitalLogo_UploadLogo() throws InterruptedException{
		configureHospitalInfraPage.hospitalLogo_UploadLogo();
		Thread.sleep(2000);
		}
			
		
		@Test(priority=107, groups={"Functional"})
		public void hospitalLogo_UpdateBtnIsDisplayed(){
		boolean flag = configureHospitalInfraPage.hospitalLogo_UpdateBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("Hospital logo_Update Button is displayed");
		}else{
			System.out.println("hospitalLogo_Update Button not displayed");
			}	
		}
		
		@Test(priority=108, groups={"Functional"})
		public void hospitalLogo_UpdateBtnIsEnabled() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.hospitalLogo_UpdateBtnIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			configureHospitalInfraPage.hospitalLogo_UpdateBtnIsClickable();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println(alertmsg);
			Thread.sleep(2000);
			alert.accept();
			Thread.sleep(2000);
			Assert.assertEquals(alertmsg, "Please upload file having extensions .jpeg/.jpg only.");
			Reporter.log("Hospital Logo_Update Button is enabled and clickable", true);
		}else{
			System.out.println("Hospital logo_Update Button neither enabled nor clickable");
			}	
		}
		
		

		@Test(priority=109, groups={"Functional"})
		public void ManageHospitalDetails_IsDisplayed(){
		boolean flag = configureHospitalInfraPage.ManageHospitalDetails_IsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHospitalDetails link is displayed");
		}else{
			System.out.println("ManageHospitalDetails link not displayed");
			}	
		}
		
		@Test(priority=110, groups={"Functional","Smoke"})
		public void ManageHospitalDetailsLink_IsEnabled(){
		boolean flag = configureHospitalInfraPage.ManageHospitalDetailsLink_IsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			configureHospitalInfraPage.ManageHospitalDetailsLink_IsClickabled();
			System.out.println("ManageHospitalDetails link is enabled and clickable");
			
			List<WebElement>elements = driver.findElements(By.tagName("div"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od);
		    	}
		}
			}
		
		@Test(priority=111, groups={"Functional"})
		public void ManageHospitalDetailsLink_HsptlAbbrevatonTextboxIsDisplayed(){
		boolean flag = configureHospitalInfraPage.ManageHospitalDetailsLink_HsptlAbbrevatonTextboxIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHospitalDetailsLink_HsptlAbbrevatonTextboxIsDisplayed isDisplayed");
		}else{
			System.out.println("ManageHospitalDetailsLink_HsptlAbbrevatonTextboxIsDisplayed not Displayed");
			}	
		}
		
		@Test(priority=112, groups={"Functional"})
		public void ManageHospitalDetailsLink_HsptlAbbrevatonTextboxIsEnabled(){
		boolean flag = configureHospitalInfraPage.ManageHospitalDetailsLink_HsptlAbbrevatonTextboxIsEnabled() ;
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHospitalDetailsLink_HsptlAbbrevatonTextboxIsDisplayed isEnabled");
		}else{
			System.out.println("ManageHospitalDetailsLink_HsptlAbbrevatonTextboxIsDisplayed not Enabled");
			}	
		}
		
		@Test(priority=113, groups={"Functional"})
		public void ManageHsptlDetailLink_Add1TextboxIsDisplayed(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_Add1TextboxIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_Add1Textbox IsDisplayed");
		}else{
			System.out.println("ManageHsptlDetailLink_Add1Textbox not Displayed");
			}	
		}
		
		@Test(priority=114, groups={"Functional"})
		public void ManageHsptlDetailLink_Add1TextboxIsEnabled(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_Add1TextboxIsEnabled() ;
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_Add1Textbox IsEnabled");
		}else{
			System.out.println("ManageHsptlDetailLink_Add1Textbox not Enabled");
			}	
		}

		@Test(priority=115, groups={"Functional"})
		public void ManageHsptlDetailLink_Add2TextboxIsDisplayed(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_Add2TextboxIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_Add2Textbox IsDisplayed");
		}else{
			System.out.println("ManageHsptlDetailLink_Add2Textbox not Displayed");
			}	
		}
		
		@Test(priority=116, groups={"Functional"})
		public void ManageHsptlDetailLink_Add2TextboxIsEnabled(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_Add2TextboxIsEnabled() ;
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_Add2Textbox IsEnabled");
		}else{
			System.out.println("ManageHsptlDetailLink_Add2Textbox not Enabled");
			}	
		}

		@Test(priority=117, groups={"Functional"})
		public void ManageHsptlDetailLink_PincodeIsDisplayed(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_PincodeIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_Pincode IsDisplayed");
		}else{
			System.out.println("ManageHsptlDetailLink_Pincode not Displayed");
			}	
		}
		
		@Test(priority=118, groups={"Functional"})
		public void ManageHsptlDetailLink_PincodeIsEnabled(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_PincodeIsEnabled() ;
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_Pincode IsEnabled");
		}else{
			System.out.println("ManageHsptlDetailLink_Pincode not Enabled");
			}	
		}

		@Test(priority=119, groups={"Functional"})
		public void ManageHsptlDetailLink_PhnNoIsDisplayed(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_PhnNoIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_PhnNo IsDisplayed");
		}else{
			System.out.println("ManageHsptlDetailLink_PhnNo not Displayed");
			}	
		}
		
		@Test(priority=120, groups={"Functional"})
		public void ManageHsptlDetailLink_PhnNoIsEnabled(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_PhnNoIsEnabled() ;
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_PhnNo IsEnabled");
		}else{
			System.out.println("ManageHsptlDetailLink_PhnNo not Enabled");
			}	
		}
		
		@Test(priority=121, groups={"Functional"})
		public void ManageHsptlDetailLink_FaxIsDisplayed(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_FaxIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_Fax IsDisplayed");
		}else{
			System.out.println("ManageHsptlDetailLink_Fax not Displayed");
			}	
		}
		
		@Test(priority=122, groups={"Functional"})
		public void ManageHsptlDetailLink_FaxIsEnabled(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_FaxIsEnabled() ;
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_Fax IsEnabled");
		}else{
			System.out.println("ManageHsptlDetailLink_Fax not Enabled");
			}	
		}
		
		@Test(priority=123, groups={"Functional"})
		public void ManageHsptlDetailLink_HsptlEmailIsDisplayed(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_HsptlEmailIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_HsptlEmail IsDisplayed");
		}else{
			System.out.println("ManageHsptlDetailLink_HsptlEmail not Displayed");
			}	
		}
		
		@Test(priority=124, groups={"Functional"})
		public void ManageHsptlDetailLink_HsptlEmailIsEnabled(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_HsptlEmailIsEnabled() ;
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_HsptlEmail IsEnabled");
		}else{
			System.out.println("ManageHsptlDetailLink_HsptlEmail not Enabled");
			}	
		}
		
		@Test(priority=125, groups={"Functional"})
		public void ManageHsptlDetailLink_SaveBtnIsDisplayed(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_SaveBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("ManageHsptlDetailLink_SaveBtn IsDisplayed");
		}else{
			System.out.println("ManageHsptlDetailLink_SaveBtn not Displayed");
			}	
		}
		
		@Test(priority=126, groups={"Functional"})
		public void ManageHsptlDetailLink_SaveBtnIsEnabled(){
		boolean flag = configureHospitalInfraPage.ManageHsptlDetailLink_SaveBtnIsEnabled() ;
		Assert.assertTrue(flag);
		if(flag==true){
			configureHospitalInfraPage.ManageHsptlDetailLink_SaveBtnIsClickable();
			WebElement validationMsg = configureHospitalInfraPage.ManageHospitalDetail_SaveBtnValidatonMsg();
			String text = validationMsg.getText();
			Assert.assertEquals(text, "Hospital details updated successfully.");
			Reporter.log("ManageHsptlDetailLink_SaveBtn IsEnabled", true);
		}else{
			System.out.println("ManageHsptlDetailLink_SaveBtn not Enabled");
			}	
		}
		
		@Test(priority=127, groups={"Functional"})
		public void ManageHospitalDetail_InputHospitalAbbreviationOnly() throws InterruptedException{
		Thread.sleep(2000);
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String HsptlAbbreviation = xlsReader.getCellData("TestData", "HospitalAbbreviation", 2);
		configureHospitalInfraPage.ManageHospitalDetail_InputHospitalAbbreviationOnly(HsptlAbbreviation);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		String expAlert = "Enter Hospital Address Line1";
		String actAlert = alertmsg;
		alert.accept();
		Assert.assertEquals(expAlert, actAlert);
		Reporter.log("Alert handled only Hospital Abbreviation updated", true);
		}
		
		@Test(priority=128, groups={"Functional"})
		public void ManageHospitalDetail_InputHsptlAbbAndAdd1() throws InterruptedException{
		Thread.sleep(2000);
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String Add1 = xlsReader.getCellData("TestData", "AddressLine1", 2);
		configureHospitalInfraPage.ManageHospitalDetail_InputHsptlAbbAndAdd1(Add1);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		String expAlert = "Enter Hospital Address Line2";
		String actAlert = alertmsg;
		alert.accept();
		Assert.assertEquals(expAlert, actAlert);
		Reporter.log("Alert handled HospitalAbbreviation & Address1 updated", true);
		}
		
		@Test(priority=129, groups={"Functional"})
		public void ManageHospitalDetail_InputHsptlAbbAdd1Add2() throws InterruptedException{
		Thread.sleep(2000);
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String Add2 = xlsReader.getCellData("TestData", "AddressLine2", 2);
		configureHospitalInfraPage.ManageHospitalDetail_InputHsptlAbbAdd1Add2(Add2);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		String expAlert = "Enter Hospital Pin";
		String actAlert = alertmsg;
		alert.accept();
		Assert.assertEquals(expAlert, actAlert);
		Reporter.log("Alert handled HospitalAbbreviation,Address1 & Address2 updated", true);
		}
		
		@Test(priority=130, groups={"Functional"})
		public void ManageHospitalDetail_InputHsptlAbbAdd1Add2Pin() throws InterruptedException{
		Thread.sleep(2000);
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String pin = xlsReader.getCellData("TestData", "Pincode", 2);
		configureHospitalInfraPage.ManageHospitalDetail_InputHsptlAbbAdd1Add2Pin(pin);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		String expAlert = "Enter Data in any one field";
		String actAlert = alertmsg;
		alert.accept();
		Assert.assertEquals(expAlert, actAlert);
		Reporter.log("Alert handled HospitalAbbreviation,Address1,Address2 & Pin updated", true);
		}
		
		
		@Test(priority=131, groups={"Functional","Smoke"})
		public void updateAllFiedsInOneGo() throws InterruptedException{
		Thread.sleep(2000);
		xlsReader = new XLS_Reader("./testData/AdminTestData.xlsx");
		String hsptlAbb = xlsReader.getCellData("TestData", "HospitalAbbreviation", 2);
		String add1 = xlsReader.getCellData("TestData", "AddressLine1", 2);
		String add2 = xlsReader.getCellData("TestData", "AddressLine2", 2);
		String pn = xlsReader.getCellData("TestData", "Pincode", 2);
		String phn = xlsReader.getCellData("TestData", "PhoneNo", 2);
		String fx = xlsReader.getCellData("TestData", "Fax", 2);
		String mail = xlsReader.getCellData("TestData", "Email", 2);
		configureHospitalInfraPage.updateAllFiedsInOneGo(hsptlAbb, add1, add2, pn, phn, fx, mail) ;
		Thread.sleep(2000);
		WebElement updatedMsg = configureHospitalInfraPage.printValMsgDetailsUpdatedInOneGo();
		String validationMsg = updatedMsg.getText();
		Assert.assertEquals(validationMsg, "Hospital details updated successfully.");
		System.out.println(validationMsg);
		}
	
	@Test(priority=132, groups={"Functional"})
		public void LoginLogoutRegisterIsDisplayed(){
		boolean flag = configureHospitalInfraPage.LoginLogoutRegisterIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("LoginLogoutRegister link is displayed");
		}else{
			System.out.println("LoginLogoutRegister link not displayed");
			}	
		}
		
		@Test(priority=133, groups={"Functional","Smoke"})
		public void LoginLogoutRegisterIsEnabled(){
		boolean flag = configureHospitalInfraPage.LoginLogoutRegisterIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			configureHospitalInfraPage.LoginLogoutRegisterIsClickable();
			System.out.println("LoginLogoutRegister link is enabled and clickable");
			
			List<WebElement>elements = driver.findElements(By.className("col-md-6"));
		    for(WebElement ob :elements ) {
		    	String od = ob.getText();
		    //	System.out.println(od);
		    	}
		}
			}
		
		@Test(priority=134, groups={"Functional"})
		public void LoginLogoutRegister_SeletuserIsDisplayed(){
		boolean flag = configureHospitalInfraPage.LoginLogoutRegister_SeletuserIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("LoginLogoutRegister Select user dropdown is displayed");
		}else{
			System.out.println("LoginLogoutRegister Select user dropdown not displayed");
			}	
		}

		@Test(priority=135, groups={"Functional"})
		public void LoginLogoutRegister_SeletuserIsEnabled(){
		boolean flag = configureHospitalInfraPage.LoginLogoutRegister_SeletuserIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("LoginLogoutRegister Select user dropdown  is enabled");
		}else{
			System.out.println("LoginLogoutRegister Select user dropdown not enabled");
			}	
		}

		@Test(priority=136, groups= {"Functional"})
		public void LoginLogoutRegister_SeletuserIsMultiple() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.LoginLogoutRegister_SeletuserIsMultiple();
		Assert.assertFalse(flag);
		if(flag==false){
			System.out.println("This Dropdown doesn't allow to select Multiple Values");
		}
			}

		@Test(priority=137, groups={"Functional"})
		public void LoginLogoutRegister_SelectFromDateIsDisplayed(){
		boolean flag = configureHospitalInfraPage.LoginLogoutRegister_SelectFromDateIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("LoginLogoutRegister Calender displayed");
		}else{
			System.out.println("LoginLogoutRegister Calender not displayed");
			}	
		}

		@Test(priority=138, groups={"Functional"})
		public void LoginLogoutRegister_SelectFromDateIsEnabled() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.LoginLogoutRegister_SelectFromDateIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("LoginLogoutRegister Calender is Enabled");
		}else{
			System.out.println("LoginLogoutRegister calender not Enabled");
			}	
		}
		
		@Test(priority=139, groups={"Functional"})
		public void LoginLogoutRegister_ClickingShowBtnWithoutDate() throws InterruptedException{
		configureHospitalInfraPage.LoginLogoutRegister_ClickingShowBtnWithoutDate();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		String expAlert = "Please Select From Date";
		String actAlert = alertmsg;
		alert.dismiss();
		Assert.assertEquals(expAlert, actAlert);
		Reporter.log("Alert handled for not selecting date", true);
		}		
		
		
		@Test(priority=140, groups={"Functional"})
		public void LoginLogoutRegister_TodayIsDisplayed() throws InterruptedException{
		configureHospitalInfraPage.LoginLogoutRegister_SelectFromDateIsClickable();
		boolean flag = configureHospitalInfraPage.LoginLogoutRegister_TodayIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("LoginLogoutRegister Today's date displayed");
		}else{
			System.out.println("LoginLogoutRegister Today's date not displayed");
			}	
		}

		@Test(priority=141, groups={"Functional"})
		public void LoginLogoutRegister_TodayIsEnabled() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.LoginLogoutRegister_TodayIsEnabled();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("LoginLogoutRegister Today's date enabled");
		}else{
			System.out.println("LoginLogoutRegister Today's date not enabled");
			}	
		}
		
		@Test(priority=142, groups={"Functional","Smoke"})
		public void LoginLogoutRegister_ClickLoginOutReport() throws InterruptedException{
		configureHospitalInfraPage.LoginLogoutRegister_ClickLoginOutReport();
		Thread.sleep(2000);
		System.out.println("Report Printed");
		}
		
			
		@Test(priority=143, groups={"Functional"})
		public void LoginLogoutRegister_ShowBtnIsDisplayed(){
		boolean flag = configureHospitalInfraPage.LoginLogoutRegister_ShowBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("LoginLogoutRegister Show details btn displayed");
		}else{
			System.out.println("LoginLogoutRegister Show details btn not displayed");
			}	
		}

		@Test(priority=144, groups={"Functional"})
		public void LoginLogoutRegister_ShowBtnIsEnabled() throws InterruptedException{
		boolean flag = configureHospitalInfraPage.LoginLogoutRegister_ShowBtnIsDisplayed();
		Assert.assertTrue(flag);
		if(flag==true){
			System.out.println("LoginLogoutRegister Show details btn enabled");
		}else{
			System.out.println("LoginLogoutRegister Show details btn enabled");
			}	
		}







} 
	