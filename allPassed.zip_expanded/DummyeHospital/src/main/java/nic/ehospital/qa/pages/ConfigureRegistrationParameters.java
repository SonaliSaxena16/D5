package nic.ehospital.qa.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import nic.ehospital.qa.base.TestBase;
import nic.ehospital.qa.util.TestUtil;

public class ConfigureRegistrationParameters extends TestBase{
	
	@FindBy(partialLinkText="Configure Registration Parameters")
	WebElement ConfigureRegParaLink;

	@FindBy(partialLinkText="REGISTRATION ROOM CREATION")
	WebElement RegRoomCreationLink;
	
	@FindBy(xpath="//*[contains(@name,'ddlclinic')]")
	WebElement RegRoomCreation_ClinicDropdown;
	
	@FindBy(xpath="//*[contains(@name,'chkday1')]")
	WebElement RegRoomCreation_MonChkbox;	

	@FindBy(xpath="//*[contains(@name,'chkday2')]")
	WebElement RegRoomCreation_TueChkbox;
	
	@FindBy(xpath="//*[contains(@name,'ddldepartment')]")
	WebElement RegRoomCreation_DepartmentDropdown;

	@FindBy(xpath="//*[contains(@name,'ddlunit')]")
	WebElement RegRoomCreation_UnitDropdown;
	
	@FindBy(xpath="//*[contains(@name,'ddlbuilding')]")
	WebElement RegRoomCreation_BuildingDropdown;
	
	@FindBy(xpath="//*[contains(@name,'ddlblock')]")
	WebElement RegRoomCreation_BlockDropdown;
	
	@FindBy(xpath="//*[contains(@name,'ddlfloor')]")
	WebElement RegRoomCreation_FloorDropdown;

	@FindBy(xpath="//*[contains(@name,'ddlroom')]")
	WebElement RegRoomCreation_RoomDropdown;
	
	@FindBy(xpath="//*[contains(@name,'chkDoctor')]")
	WebElement RegRoomCreation_SelectDoctorChkbox;

	@FindBy(xpath="//*[contains(@value,'Save')]")
	WebElement RegRoomCreation_SaveBtn;
	
	@FindBy(xpath="//*[contains(@name,'ddldept')]")
	WebElement RegRoomCreation_FilterByDeptDrpdwn;
	
	@FindBy(xpath="//*[contains(@name,'ddlcln')]")
	WebElement RegRoomCreation_FilterByClinicDrpdwn;
	
	@FindBy(xpath="//*[contains(@value,'Unallocate Room')]")
	WebElement RegRoomCreation_UnallocateRoomBtn ;
	
	@FindBy(xpath="//input[@id='hdnremove_id1' and @name='hdnremove_id1']")
	WebElement RegRoomCreation_RemoveFirstEntryCheckbox;

	@FindBy(xpath="//input[@id='hdnremove_id2' and @name='hdnremove_id2']")
	WebElement RegRoomCreation_RemoveSecondEntryCheckbox;
	
	@FindBy(xpath="//*[contains(text(),'Save Successfully')]")
	WebElement PrintValMsgRegRoomCreated;
	
	@FindBy(xpath="//*[contains(text(),'Delete Successfully')]")
	WebElement PrintValMsgRegRoomDeleted;

	@FindBy(partialLinkText="MANAGE COUNTER")
	WebElement ManageCounterLink;
	
	@FindBy(xpath="//*[contains(@name,'txtCounterName')]")
	WebElement AddCounter_CounterNameTxbox;
	
	@FindBy(xpath="//*[contains(@name,'txtCounterDesc')]")
	WebElement AddCounter_CounterDescrptonTxbox;
	
	@FindBy(xpath="//*[contains(@name,'ddlCounterType')]")
	WebElement AddCounter_CounterTypeDrpdwn;
	
	@FindBy(xpath="//*[contains(@value,'Save Counter')]")
	WebElement AddCounter_SaveCounterBtn;
	
	@FindBy(xpath="//*[contains(@name,'ddlCounterName')]")
	WebElement CounterVsUsrMappng_CounterDrpdwn;
	
	@FindBy(xpath="//*[contains(@name,'ddlUserName')]")
	WebElement CounterVsUsrMappng_UserDrpdwn;
	
	@FindBy(xpath="//*[contains(@value,'Add User Counter Mapping')]")
	WebElement CounterVsUsrMappng_AddUserCountrMappngBtn;
	
	@FindBy(xpath="//*[contains(@name,'ddlcentre')]")
	WebElement CounterVsDeptMappng_CountrDrpdwn;
	
	@FindBy(xpath="//*[contains(@name,'ddldepartment')]")
	WebElement CounterVsDeptMappng_DeptDrpdwn;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement CounterVsDeptMappng_SaveBtn; 
	
	@FindBy(xpath="//*[contains(@value,'Clear')]")
	WebElement CounterVsDeptMappng_ClearBtn;
	
	@FindBy(xpath="//*[contains(text(),' < Edit >')]")
	WebElement ListOfCountrDeptMappng_EditBtn;
	
	@FindBy(partialLinkText="MANAGE BILLING TYPE/FEE")
	WebElement ManageBillingTypeLink;
	
	@FindBy(xpath="//input[@id='ddlbilling_name' and @name='ddlbilling_name']")
	WebElement ManageBilling_BillingTypeTxbox;
	
	@FindBy(xpath="//input[@id='ddlbilling_desc' and @name='ddlbilling_desc']")
	WebElement ManageBilling_BillingDescrptonTxbox;
	
	@FindBy(xpath="//input[@id='ddlreg_fee' and @name='ddlreg_fee']")
	WebElement ManageBilling_RegFeeTxbox;
	
	@FindBy(xpath="//input[@id='ddlappnt_fee' and @name='ddlappnt_fee']")
	WebElement ManageBilling_AppointmntFeeTxbox;
	
	@FindBy(xpath="//input[@id='cas_fee' and @name='cas_fee']")
	WebElement ManageBilling_CasualtyFeeTxbox;
	
	@FindBy(xpath="//input[@id='ipd_fee' and @name='ipd_fee']")
	WebElement ManageBilling_InPatientFeeTxbox;
	
	@FindBy(xpath="//input[@id='revisit_fee' and @name='revisit_fee']")
	WebElement ManageBilling_RevisitFeeTxbox;
	
	@FindBy(xpath="//span[@class='switch-label']")
	WebElement ManageBilling_VerifiedByBtn;

	@FindBy(xpath="//*[contains(@name,'btnSave')]")
	WebElement ManageBilling_SaveBtn;

	@FindBy(xpath="//*[contains(@value,'Clear')]")
	WebElement ManageBilling_ClearBtn;
	
	@FindBy(xpath="//a[@class='bluelink']")
	WebElement ManageBilling_EditBtn;
	
	/*@FindBy(xpath="//*[contains(text(),'Successfully Saved ')]")
	WebElement ManageBilling_PrintValMsg;
	*/
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/span")
	WebElement ManageBilling_PrintValMsg;
	
	@FindBy(partialLinkText="MANAGE DEPARTMENT CLINIC FEE/INTERVAL")
	WebElement ManageDeptClinicFeeIntrvl;
	
	@FindBy(xpath="//select[@id='ddlDept' and @name='ddlDept']")
	WebElement ManageDeptClinicFeeIntrvl_DeptDrpdwn;
	
	@FindBy(xpath="//select[@id='ddlClinic' and @name='ddlClinic']")
	WebElement ManageDeptClinicFeeIntrvl_ClinicDrpdwn;
	
	@FindBy(xpath="//select[@id='ddlClinicType' and @name='ddlClinicType']")
	WebElement ManageDeptClinicFeeIntrvl_ClinicTypeDrpdwn;	
	
	@FindBy(xpath="//input[@id='txtFollowupFeeInterval' and @name='txtFollowupFeeInterval']")
	WebElement ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox;	
	
	@FindBy(xpath="//input[@id='txtFollowupFee' and @name='txtFollowupFee']")
	WebElement ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox;	
	
	@FindBy(xpath="//input[@id='txtVisitAllowedNo' and @name='txtVisitAllowedNo']")
	WebElement ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox;	
	
	@FindBy(xpath="//select[@id='ddlSlip' and @name='ddlSlip']")
	WebElement ManageDeptClinicFeeIntrvl_SlipTemplateDrpdwn; 
	
	@FindBy(xpath="//input[@id='btnSaveChanges' and @name='btnSaveChanges']")
	WebElement ManageDeptClinicFeeIntrvl_SaveBtn;  
	
	@FindBy(xpath="//input[@type='search' and @aria-controls='tblEncounterLogic']")
	WebElement ManageDeptClinicFeeIntrvl_SearchTxbox;  
	
	@FindBy(xpath="//i[@class='fa fa-edit']")
	WebElement ManageDeptClinicFeeIntrvl_EditBtn;  
	
	@FindBy(xpath="//*[contains(@class,'btn btn-info')]")
	WebElement CounterVsDeptMappng_AlertCloseBtn;
	
	@FindBy(xpath="//*[contains(@id,'lblMessage')]")
	WebElement manageDeptClinicFeeIntrval_PrintValMsg;
	
	@FindBy(partialLinkText="DEPARTMENT USER MAPPING")
	WebElement DepartmentUserMappingLink;
	
	
	

	@FindBy(xpath="//*[contains(@id,'select2-ddluser-container')]")
	WebElement DepartmentUserMappingLink_SelectUserContainer;
	
	
	@FindBy(xpath="//ul[@class='select2-results__options']")
	WebElement DepartmentUserMapping_FindsUserDrpdwn;
	
	@FindBy(xpath="//li[@class='select2-results__option'][1]")
	WebElement DepartmentUserMapping_SelectsFirstRowOfUserDrpdwn;
	
	
	
//--------------------User drpdwn story ends	
	
	

	@FindBy(xpath="//*[contains(@id,'select2-ddlDept-container')]")
	WebElement DepartmentUserMapping_SelectDeptContainer;

	@FindBy(xpath="//*[contains(@id,'select2-ddlDept-results')]")
	WebElement DepartmentUserMapping_SelectDeptDrpdwn;
	

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--highlighted'][1]")
	WebElement DepartmentUserMapping_SelectsFirstRowOfDeptDrpdwn;
	
	@FindBy(xpath="//*[contains(@name,'btnAddDepartment')]")
	WebElement DepartmentUserMappingLink_AddMappingBtn;
	
	@FindBy(xpath="//*[contains(@class,'call-checkbox')]")
	WebElement DepartmentUserMappingLink_RemoveChkbox;
	
	@FindBy(xpath="//*[contains(@value,'Select & Remove')]")
	WebElement DepartmentUserMappingLink_SelectAndRemoveRemoveBtn;
	
	@FindBy(xpath="//*[contains(@type,'search')]")
	WebElement DepartmentUserMappingLink_SearchTxtbox;
	
	@FindBy(xpath="//*[contains(@class,'paginate_button next')]")
	WebElement DepartmentUserMappingLink_NextPageBtn;
	
	@FindBy(xpath="//*[contains(@id,'tblUsrDept_previous')]")
	WebElement DepartmentUserMappingLink_PreviousPageBtn;
	
	@FindBy(xpath="//select[@name='tblUsrDept_length' and @aria-controls='tblUsrDept']")
	WebElement DepartmentUserMappingLink_SelectMaxEntryDrpdwn;
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr[5]/td")
	WebElement DepartmentUserMappingLink_PrintValMsg;
	
	
	
	public ConfigureRegistrationParameters() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
			//Validate: Configure Reg Para Link is Displayed
			public boolean configureRegParaLinkIsDisplayed(){
			WebElement link = ConfigureRegParaLink;
			return link.isDisplayed();
			}

			//Validate: Configure Reg Para link is Enabled
			public boolean configureRegParaLinkIsEnabled(){
			WebElement btn = ConfigureRegParaLink;
			return btn.isEnabled();
			}
			
			//Validate: Configure Reg Para link is Clickable
			public void configureRegParaLinkIsClickable() throws InterruptedException{
			ConfigureRegParaLink.click();
			Thread.sleep(5000);
			}

			//Validate: Reg Room Creation link is Displayed
			public boolean regRoomCreationLinkIsDisplayed(){
			WebElement link = RegRoomCreationLink;
			return link.isDisplayed();
			}

			//Validate: Reg Room Creation link is Enabled
			public boolean regRoomCreationLinkIsEnabled(){
			WebElement btn = RegRoomCreationLink;
			return btn.isEnabled();
			}
			
			//Validate: Reg Room Creation link is Clickable
			public void regRoomCreationLinkIsClickable() throws InterruptedException{
			RegRoomCreationLink.click();
			Thread.sleep(5000);
			}
			
			//Validate: Reg Room Creation_Clinic Dropdown dropdown is Displayed
			public boolean regRoomCreation_ClinicDropdownIsDisplayed(){
			WebElement drpdwn = RegRoomCreation_ClinicDropdown;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Reg Room Creation_Clinic dropdown is Enabled
			public boolean RegRoomCreation_ClinicDropdownIsEnabled(){
			WebElement drpdwn = RegRoomCreation_ClinicDropdown;
			return drpdwn.isEnabled();
			}
			
			//Validate: Reg Room Creation_Clinic dropdown is Multiple
			public boolean RegRoomCreation_ClinicDropdownIsMultiple() throws InterruptedException{
			Thread.sleep(3000);
			Select ListBox = new Select(RegRoomCreation_ClinicDropdown);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			//Validate: Monday Checkbox Is Displayed
			public boolean mondayChkboxIsDisplayed (){
			WebElement chkbox = RegRoomCreation_MonChkbox;
			return chkbox.isDisplayed();
			}
			
			//Validate: Tuesday Checkbox Is Displayed
			public boolean tuesdayChkboxIsDisplayed (){
			WebElement chkbox = RegRoomCreation_TueChkbox;
			return chkbox.isDisplayed();
			}
			
			
			//Validate: Reg Room Creation_Department Dropdown dropdown is Displayed
			public boolean regRoomCreation_DepartmentDropdownIsDisplayed(){
			WebElement drpdwn = RegRoomCreation_DepartmentDropdown;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Reg Room Creation_Department dropdown is Enabled
			public boolean RegRoomCreation_DepartmentDropdownIsEnabled(){
			WebElement drpdwn = RegRoomCreation_DepartmentDropdown;
			return drpdwn.isEnabled();
			}
			
			//Validate: Reg Room Creation_Department dropdown is Multiple
			public boolean RegRoomCreation_DepartmentDropdownIsMultiple() throws InterruptedException{
			Select ListBox = new Select(RegRoomCreation_DepartmentDropdown);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			//Validate: Reg Room Creation_Unit Dropdown dropdown is Displayed
			public boolean regRoomCreation_UnitDropdownIsDisplayed(){
			WebElement drpdwn = RegRoomCreation_UnitDropdown;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Reg Room Creation_Unit dropdown is Enabled
			public boolean regRoomCreation_UnitDropdownIsEnabled(){
			WebElement drpdwn = RegRoomCreation_UnitDropdown;
			return drpdwn.isEnabled();
			}
			
			//Validate: Reg Room Creation_Unit dropdown is Multiple
			public boolean regRoomCreation_UnitDropdownIsMultiple() throws InterruptedException{
			Select ListBox = new Select(RegRoomCreation_UnitDropdown);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			//Validate: Reg Room Creation_Building Dropdown dropdown is Displayed
			public boolean regRoomCreation_BuildingDropdownIsDisplayed(){
			WebElement drpdwn = RegRoomCreation_BuildingDropdown;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Reg Room Creation_Building dropdown is Enabled
			public boolean regRoomCreation_BuildingDropdownIsEnabled(){
			WebElement drpdwn = RegRoomCreation_BuildingDropdown;
			return drpdwn.isEnabled();
			}
			
			//Validate: Reg Room Creation_Building  dropdown is Multiple
			public boolean regRoomCreation_BuildingDropdownIsMultiple() throws InterruptedException{
			Select ListBox = new Select(RegRoomCreation_BuildingDropdown);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			//Validate: Reg Room Creation_Block Dropdown dropdown is Displayed
			public boolean regRoomCreation_BlockDropdownIsDisplayed(){
			WebElement drpdwn = RegRoomCreation_BlockDropdown;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Reg Room Creation_Block dropdown is Enabled
			public boolean regRoomCreation_BlockDropdownIsEnabled(){
			WebElement drpdwn = RegRoomCreation_BlockDropdown;
			return drpdwn.isEnabled();
			}
			
			//Validate: Reg Room Creation_Block dropdown is Multiple
			public boolean regRoomCreation_BlockDropdownIsMultiple() throws InterruptedException{
			Select ListBox = new Select(RegRoomCreation_BlockDropdown);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			//Validate: Reg Room Creation_Floor Dropdown dropdown is Displayed
			public boolean regRoomCreation_FloorDropdownIsDisplayed(){
			WebElement drpdwn = RegRoomCreation_FloorDropdown;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Reg Room Creation_Floor  dropdown is Enabled
			public boolean regRoomCreation_FloorDropdownIsEnabled(){
			WebElement drpdwn = RegRoomCreation_FloorDropdown;
			return drpdwn.isEnabled();
			}
			
			//Validate: Reg Room Creation_Block dropdown is Multiple
			public boolean regRoomCreation_FloorDropdownIsMultiple() throws InterruptedException{
			Select ListBox = new Select(RegRoomCreation_FloorDropdown);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			//Validate: Reg Room Creation_Room Dropdown dropdown is Displayed
			public boolean regRoomCreation_RoomDropdownIsDisplayed(){
			WebElement drpdwn = RegRoomCreation_RoomDropdown;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Reg Room Creation_Room  dropdown is Enabled
			public boolean regRoomCreation_RoomDropdownIsEnabled(){
			WebElement drpdwn = RegRoomCreation_RoomDropdown;
			return drpdwn.isEnabled();
			}
			
			//Validate: Reg Room Creation_Room dropdown is Multiple
			public boolean regRoomCreation_RoomDropdownIsMultiple() throws InterruptedException{
			Select ListBox = new Select(RegRoomCreation_RoomDropdown);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			//Validate: Reg Room Creation_Room Chkbox dropdown is Displayed
			public boolean regRoomCreation_SelectDoctorChkboxIsDisplayed(){
			WebElement chkbox = RegRoomCreation_SelectDoctorChkbox;
			return chkbox.isDisplayed();
			}
			
			
			//Validate: Save Registration Room Details btn is Displayed
			public boolean regRoomCreation_SaveBtnIsDisplayed(){
			WebElement link = RegRoomCreation_SaveBtn;
			return link.isDisplayed();
			}

			//Validate: Save Registration Room Details btn is Enabled
			public boolean regRoomCreation_SaveBtnIsEnabled(){
			WebElement btn = RegRoomCreation_SaveBtn;
			return btn.isEnabled();
			}
			
			//Validate: Save Registration Room Details btn is Clickable
			public void regRoomCreation_SaveBtnIsClickable() throws InterruptedException{
			RegRoomCreation_SaveBtn.click();
			Thread.sleep(2000);
			}

			//Validate:  select Clinic only & click save btn
			public void selectClinicOnlyClickSaveBtn() throws InterruptedException{
			Select box = new Select(RegRoomCreation_ClinicDropdown);
			box.selectByVisibleText("ENT Clinic");
			Thread.sleep(2000);
			RegRoomCreation_SaveBtn.click();
			Thread.sleep(2000);
			}
			
			//Validate:  select Clinic & Dept & click save btn
			public void selectClinicDeptThenClickSaveBtn() throws InterruptedException{
			Select box = new Select(RegRoomCreation_DepartmentDropdown);
			box.selectByIndex(1);
			Thread.sleep(2000);
			RegRoomCreation_SaveBtn.click();
			Thread.sleep(2000);
			}
			
			//Validate:  select Clinic Dept & Unit & click save btn  
			public void selectClinicDeptUnitThenClickSaveBtn() throws InterruptedException{
			Select box = new Select(RegRoomCreation_UnitDropdown);
			box.selectByIndex(1);
			Thread.sleep(2000);
			RegRoomCreation_SaveBtn.click();
			Thread.sleep(2000);
			}
			
			//Validate: select Clinic Dept Unit & Buildng & click save btn
			public void selectClinicDeptUnitBuildngThenClickSaveBtn() throws InterruptedException{
			Select box = new Select(RegRoomCreation_BuildingDropdown);
			box.selectByIndex(1);
			Thread.sleep(2000);
			RegRoomCreation_SaveBtn.click();
			Thread.sleep(2000);
			}
			
			//Validate: select Clinic Dept Unit Buildng & Block & click save btn
			public void selectClinicDeptUnitBuildngBlockThenClickSaveBtn() throws InterruptedException{
			Select box = new Select(RegRoomCreation_BlockDropdown);
			box.selectByIndex(1);
			Thread.sleep(2000);
			RegRoomCreation_SaveBtn.click();
			Thread.sleep(2000);
			}
			
			//Validate: select Clinic Dept Unit Buildng Block & Floor & click save btn
			public void selectClinicDeptUnitBuildngBlockFloorThenClickSaveBtn() throws InterruptedException{
			Select box = new Select(RegRoomCreation_FloorDropdown);
			box.selectByVisibleText("1st floor");
			Thread.sleep(2000);
			RegRoomCreation_SaveBtn.click();
			Thread.sleep(2000);
			}
			
			
			//Validate: select Clinic Dept Unit Buildng Block & Room
			public void selectClinicDeptUnitBuildngBlockRoom() throws InterruptedException{
			Select box = new Select(RegRoomCreation_RoomDropdown);
			box.selectByIndex(1);
			Thread.sleep(2000);
			}
			
			//Validate: Select doctor by clicking on checkbox & click save btn
			public void selectDoctorCheckbox() throws InterruptedException{
			RegRoomCreation_SelectDoctorChkbox.click();
			Thread.sleep(2000);
			RegRoomCreation_SaveBtn.click();
			Thread.sleep(2000);
			}
			
			//Validate: Prints validation msg:Department successfully added 
			public WebElement printValMsgRegRoomCreated(){
			WebElement msg = PrintValMsgRegRoomCreated;
			return msg;
			} 
			
			
			//Validate: Create Registration Room in one go
			public void createRegRoomInOneGo() throws InterruptedException{
				Select clinic = new Select(RegRoomCreation_ClinicDropdown);
				clinic.selectByVisibleText("ENT Clinic");
				Thread.sleep(2000);	
				RegRoomCreation_MonChkbox.click();
				Thread.sleep(2000);	
				RegRoomCreation_TueChkbox.click();
				Thread.sleep(2000);	
				Select dept = new Select(RegRoomCreation_DepartmentDropdown);
				dept.selectByIndex(1);
				Thread.sleep(2000);		
				Select unit = new Select(RegRoomCreation_UnitDropdown);
				unit.selectByIndex(1);
				Thread.sleep(2000);		
				Select building = new Select(RegRoomCreation_BuildingDropdown);
				building.selectByIndex(1);
				Thread.sleep(2000);		
				Select block = new Select(RegRoomCreation_BlockDropdown);
				block.selectByIndex(1);
				Thread.sleep(2000);	
				Select floor = new Select(RegRoomCreation_FloorDropdown);
				floor.selectByVisibleText("1st floor");
				Thread.sleep(2000);	
				Select room = new Select(RegRoomCreation_RoomDropdown);
				room.selectByIndex(1);
				Thread.sleep(2000);	
				RegRoomCreation_SelectDoctorChkbox.click();
				Thread.sleep(4000);
				RegRoomCreation_SaveBtn.click();
				Thread.sleep(2000);
				}
			
			
			//Validate: Filter by Department dropdown is Displayed
			public boolean regRoomCreation_FilterByDeptDropdownIsDisplayed(){
			WebElement drpdwn = RegRoomCreation_FilterByDeptDrpdwn;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Filter by Department dropdown is Enabled
			public boolean regRoomCreation_FilterByDeptDropdownIsEnabled(){
			WebElement drpdwn = RegRoomCreation_FilterByDeptDrpdwn;
			return drpdwn.isEnabled();
			}
			
			//Validate: Filter by Department dropdown is Multiple
			public boolean regRoomCreation_FilterByDeptDropdownIsMultiple() throws InterruptedException{
			Select ListBox = new Select(RegRoomCreation_FilterByDeptDrpdwn);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			
			//Validate: Filter by Clinic dropdown is Displayed
			public boolean regRoomCreation_FilterByClinicDropdownIsDisplayed(){
			WebElement drpdwn = RegRoomCreation_FilterByClinicDrpdwn;
			return drpdwn.isDisplayed();
			}
			
			//Validate: Filter by Clinic dropdown is Enabled
			public boolean regRoomCreation_FilterByClinictDropdownIsEnabled(){
			WebElement drpdwn = RegRoomCreation_FilterByClinicDrpdwn;
			return drpdwn.isEnabled();
			}
			
			//Validate: Filter by Clinic dropdown is Multiple
			public boolean regRoomCreation_FilterByClinicDropdownIsMultiple() throws InterruptedException{
			Select ListBox = new Select(RegRoomCreation_FilterByClinicDrpdwn);
			boolean value = ListBox.isMultiple() ;
			return value;
			}
			
			
			
			//Validate: Remove entry Checkbox Is Displayed
			public boolean regRoomCreation_RemoveEntryCheckboxIsDisplayed (){
			WebElement chkbox = RegRoomCreation_RemoveFirstEntryCheckbox;
			return chkbox.isDisplayed();
			}
			
			//Validate: Unallocate Room btn is Displayed
			public boolean regRoomCreation_UnallocateRoomBtnIsDisplayed(){
			WebElement link = RegRoomCreation_UnallocateRoomBtn;
			return link.isDisplayed();
			}

			//Validate: Unallocate Room btn is Enabled
			public boolean regRoomCreation_UnallocateRoomBtnIsEnabled(){
			WebElement btn = RegRoomCreation_UnallocateRoomBtn;
			return btn.isEnabled();
			}
			
			//Validate: Unallocate Room btn is Clickable
			public void regRoomCreation_UnallocateRoomBtnIsClickable() throws InterruptedException{
			RegRoomCreation_UnallocateRoomBtn.click();
			Thread.sleep(2000);
			}

			//Validate: select any department through filter by department dropdown,select days and click unallocate room btn
			public void selectDeptToRemove() throws InterruptedException{
			Select box = new Select(RegRoomCreation_FilterByDeptDrpdwn);
			box.selectByIndex(1);
			Thread.sleep(2000);
			RegRoomCreation_RemoveFirstEntryCheckbox.click();
			Thread.sleep(2000);
			RegRoomCreation_RemoveSecondEntryCheckbox.click();
			Thread.sleep(2000);
			RegRoomCreation_UnallocateRoomBtn.click();
			Thread.sleep(2000);
			}

			
			//Validate: Prints validation msg:Department successfully deleted 
			public WebElement printValMsgRegRoomDeleted(){
			WebElement msg = PrintValMsgRegRoomDeleted;
			return msg;
			} 

          
		public void regRoomCreation_SelectEntryAndDelete() throws InterruptedException{
			for(int i=1; i<=3; i++){
				RegRoomCreation_RemoveFirstEntryCheckbox.click();
				Thread.sleep(3000);
				RegRoomCreation_UnallocateRoomBtn.click();
				Thread.sleep(3000);
				WebElement msg = PrintValMsgRegRoomDeleted;
				String stringMsg = msg.getText();
				System.out.print(i+":");
				System.out.println(stringMsg);
				Thread.sleep(3000);
				
				
				
		/*	WebElement checkbox = RegRoomCreation_RemoveFirstEntryCheckbox;
			Thread.sleep(2000);
			checkbox.click();
			Thread.sleep(2000);
			RegRoomCreation_UnallocateRoomBtn.click();*/
			
			}
		}

		//Validate: Manage Counter Link is Displayed
		public boolean manageCounterLinkIsDisplayed(){
		WebElement link = ManageCounterLink;
		return link.isDisplayed();
		}

		//Validate: Manage Counter Link is Enabled
		public boolean manageCounterLinkIsEnabled(){
		WebElement btn = ManageCounterLink;
		return btn.isEnabled();
		}
		
		//Validate: Manage Counter Link is Clickable
		public void manageCounterLinkIsClickable() throws InterruptedException{
		ManageCounterLink.click();
		Thread.sleep(2000);
		}
		
		//Validate: Add Counter _ Counter Name Txtbox is Displayed
		public boolean counterNameTxtboxIsDisplayed(){
		WebElement link = AddCounter_CounterNameTxbox;
		return link.isDisplayed();
		}

		//Validate: Add Counter _ Counter Name Txtbox is Enabled
		public boolean counterNameTxtboxIsEnabled(){
		WebElement btn = AddCounter_CounterNameTxbox;
		return btn.isEnabled();
		}
		
		//Validate: Add Counter _ Counter Desciption Txtbox is Displayed
		public boolean counterDesciptionTxtboxIsDisplayed(){
		WebElement link = AddCounter_CounterDescrptonTxbox;
		return link.isDisplayed();
		}

		//Validate: Add Counter _ Counter Desciption Txtbox is Enabled
		public boolean counterDesciptionTxtboxIsEnabled(){
		WebElement btn = AddCounter_CounterDescrptonTxbox;
		return btn.isEnabled();
		}
		
		//Validate: Add Counter _ Counter Type dropdown is Displayed
		public boolean counterTypeDropdownIsDisplayed(){
		WebElement drpdwn = AddCounter_CounterTypeDrpdwn;
		return drpdwn.isDisplayed();
		}
		
		//Validate: Add Counter _ Counter Type dropdown is Enabled
		public boolean counterTypeDropdownIsEnabled(){
		WebElement drpdwn = AddCounter_CounterTypeDrpdwn;
		return drpdwn.isEnabled();
		}
		
		//Validate: Add Counter _ Counter Type dropdown is Multiple
		public boolean counterTypeDropdownIsMultiple() throws InterruptedException{
		Thread.sleep(3000);
		Select ListBox = new Select(AddCounter_CounterTypeDrpdwn);
		boolean value = ListBox.isMultiple() ;
		return value;
		}
		
		//Validate: Add Counter _ Save Counter Btn is Displayed
		public boolean saveCounterBtnIsDisplayed(){
		WebElement link = AddCounter_SaveCounterBtn;
		return link.isDisplayed();
		}

		//Validate: Add Counter _ Save Counter Btn is Enabled
		public boolean saveCounterBtnIsEnabled(){
		WebElement btn = AddCounter_SaveCounterBtn;
		return btn.isEnabled();
		}
		
		//Validate: Add Counter _ Save Counter Btn is Clickable
		public void saveCounterBtnIsClickable() throws InterruptedException{
		AddCounter_SaveCounterBtn.click();
		Thread.sleep(2000);
		}
		
		//Validate: Enter invalid Counter name and click save btn
		public void enterInvalidCounterNameClickSaveBtn() throws InterruptedException{
		AddCounter_CounterNameTxbox.sendKeys("@@$$");
		Thread.sleep(2000);
		AddCounter_SaveCounterBtn.click();
		Thread.sleep(2000);
		}
	
		//Validate: Enter Valid Counter name and click save btn
		public void enterValidCounterNameClickSaveBtn(String validCountr) throws InterruptedException{
		AddCounter_CounterNameTxbox.clear();
		Thread.sleep(2000);
		AddCounter_CounterNameTxbox.sendKeys(validCountr);
		Thread.sleep(2000);
		AddCounter_SaveCounterBtn.click();
		Thread.sleep(2000);
		}
		
		//Validate: Enter invalid Counter description and click save btn
			public void enterInvalidCounterDescrptonClickSaveBtn() throws InterruptedException{
				AddCounter_CounterDescrptonTxbox.sendKeys("@@$$");
				Thread.sleep(2000);
				AddCounter_SaveCounterBtn.click();
				Thread.sleep(2000);
				}
		
		//Validate: Enter Valid Counter Description and click save btn
		public void enterValidCounterDescrptonClickSaveBtn(String validCountr) throws InterruptedException{
			AddCounter_CounterDescrptonTxbox.clear();
			Thread.sleep(2000);
			AddCounter_CounterDescrptonTxbox.sendKeys(validCountr);
			Thread.sleep(2000);
			Select sel = new Select(AddCounter_CounterTypeDrpdwn);
			Thread.sleep(2000);
			sel.selectByVisibleText("OPD");
			Thread.sleep(2000);
			AddCounter_SaveCounterBtn.click();	
		}				
		

		//Validate: Enter Valid Counter Description and click save btn
		public void addCounter_AddInOneGo(String validCountrName, String validCountrDesc) throws InterruptedException{
			Thread.sleep(2000);
			AddCounter_CounterNameTxbox.sendKeys(validCountrName);
			Thread.sleep(2000);
			AddCounter_CounterDescrptonTxbox.sendKeys(validCountrDesc);
			Thread.sleep(2000);
			Select sel = new Select(AddCounter_CounterTypeDrpdwn);
			sel.selectByVisibleText("OPD");
			Thread.sleep(2000);
			AddCounter_SaveCounterBtn.click();	
			Thread.sleep(2000);
			}	
		
		
		//Validate: Conuter vs Department Mapping dropdown is Displayed
		public boolean counterVsUserMapping_CounterDropdownIsDisplayed(){
		WebElement drpdwn = CounterVsUsrMappng_CounterDrpdwn;
		return drpdwn.isDisplayed();
		}
		
		//Validate: Conuter vs Department Mapping dropdown is Enabled
		public boolean counterVsUserMapping_CounterDropdownIsEnabled(){
		WebElement drpdwn = CounterVsUsrMappng_CounterDrpdwn;
		return drpdwn.isEnabled();
		}
		
		//Validate: Conuter vs Department Mapping dropdown is Multiple
		public boolean counterVsUserMapping_CounterDropdownIsMultiple() throws InterruptedException{
		Select ListBox = new Select(CounterVsUsrMappng_CounterDrpdwn);
		boolean value = ListBox.isMultiple() ;
		return value;
		}
		
				
				//Validate: Conuter vs User Mapping dropdown is Displayed
				public boolean counterVsUserMapping_UserDropdwnIsDisplayed(){
				WebElement drpdwn = CounterVsUsrMappng_UserDrpdwn;
				return drpdwn.isDisplayed();
				}
				
				//Validate: Conuter vs User Mapping dropdown is Enabled
				public boolean counterVsUserMapping_UserDropdownIsEnabled(){
				WebElement drpdwn = CounterVsUsrMappng_UserDrpdwn;
				return drpdwn.isEnabled();
				}
				
				//Validate: Conuter vs User Mapping dropdown is Multiple
				public boolean counterVsUserMapping_UserDropdownIsMultiple() throws InterruptedException{
				Select ListBox = new Select(CounterVsUsrMappng_UserDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				//Validate: Conuter vs User Mapping_Add user Counter Mapping btn is Displayed
				public boolean addUserCounterMappingBtnIsDisplayed(){
				WebElement link = CounterVsUsrMappng_AddUserCountrMappngBtn;
				return link.isDisplayed();
				}

				//Validate: Conuter vs User Mapping_Add user Counter Mapping btn is Enabled
				public boolean addUserCounterMappingBtnIsEnabled(){
				WebElement btn = CounterVsUsrMappng_AddUserCountrMappngBtn;
				return btn.isEnabled();
				}
				
				//Validate: Conuter vs User Mapping_Add user Counter Mapping btn is Enabled
				public void addUserCounterMappingBtnIsClickable() throws InterruptedException{
				CounterVsUsrMappng_AddUserCountrMappngBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Conuter vs User Mapping_Select Counter from dropdown
				public void selectCounterOnlyClickSaveBtn() throws InterruptedException{
				Select sel = new Select (CounterVsUsrMappng_CounterDrpdwn);
				sel.selectByVisibleText("AutomateCounter - OPD");
				CounterVsUsrMappng_AddUserCountrMappngBtn.click();
				Thread.sleep(2000);
				}
		
				//Validate: Conuter vs User Mapping_Select user from dropdown
				public void selectUserOnlyClickSaveBtn() throws InterruptedException{
				Select selct = new Select (CounterVsUsrMappng_CounterDrpdwn);
				selct.selectByIndex(0);
				Thread.sleep(2000);
				Select sel = new Select (CounterVsUsrMappng_UserDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);	
				CounterVsUsrMappng_AddUserCountrMappngBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Conuter vs User Mapping_Select counter and user both from dropdown
				public void selectCounterUser_AddMappingInOneGo() throws InterruptedException{
				Select selct = new Select (CounterVsUsrMappng_CounterDrpdwn);
				selct.selectByIndex(1);
				Thread.sleep(2000);
				Select sel = new Select (CounterVsUsrMappng_UserDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);	
				CounterVsUsrMappng_AddUserCountrMappngBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: Conuter vs Department Mapping _ Counter dropdown is Displayed
				public boolean counterVsDeptMapping_CounterDropdownIsDisplayed(){
				WebElement drpdwn = CounterVsDeptMappng_CountrDrpdwn;
				return drpdwn.isDisplayed();
				}
				
				//Validate: Conuter vs Department Mapping_ Counter dropdown is Enabled
				public boolean counterVsDeptMapping_CounterDropdownIsEnabled(){
				WebElement drpdwn = CounterVsDeptMappng_CountrDrpdwn;
				return drpdwn.isEnabled();
				}
				
				//Validate: Conuter vs Department Mapping_ Counter dropdown is Multiple
				public boolean counterVsDeptMapping_CounterDropdownIsMultiple() throws InterruptedException{
				Select ListBox = new Select(CounterVsDeptMappng_CountrDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				public boolean counterVsDeptMapping_DeptDropdownIsDisplayed(){
				WebElement drpdwn = CounterVsDeptMappng_DeptDrpdwn;
				return drpdwn.isDisplayed();
				}
				
				//Validate: Conuter vs Department Mapping_ Department dropdown is Enabled
				public boolean counterVsDeptMapping_DeptDropdownIsEnabled(){
				WebElement drpdwn = CounterVsDeptMappng_DeptDrpdwn;
				return drpdwn.isEnabled();
				}
				
				//Validate: Conuter vs Department Mapping _ Department dropdown is Multiple
				public boolean counterVsDeptMapping_DeptDropdownIsMultiple() throws InterruptedException{
				Select ListBox = new Select(CounterVsDeptMappng_DeptDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				
				//Validate: Conuter vs Department Mapping _ Save Btn is Displayed
				public boolean counterVsDeptMapping_SaveBtnIsDisplayed(){
				WebElement link = CounterVsDeptMappng_SaveBtn;
				return link.isDisplayed();
				}

				//Validate: Conuter vs Department Mapping _ Save Btn is Enabled
				public boolean counterVsDeptMapping_SaveBtnIsEnabled(){
				WebElement btn = CounterVsDeptMappng_SaveBtn;
				return btn.isEnabled();
				}
				
				//Validate: Conuter vs Department Mapping _ Save Btn is Clickable
				public void counterVsDeptMapping_SaveBtnIsClickable() throws InterruptedException{
				CounterVsDeptMappng_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Conuter vs Department Mapping _ Clear Btn is Displayed
				public boolean counterVsDeptMapping_ClearBtnIsDisplayed(){
				WebElement link = CounterVsDeptMappng_ClearBtn;
				return link.isDisplayed();
				}

				//Validate: Conuter vs Department Mapping _ Clear Btn is Enabled
				public boolean counterVsDeptMapping_ClearBtnIsEnabled(){
				WebElement btn = CounterVsDeptMappng_ClearBtn;
				return btn.isEnabled();
				}
				
				//Validate: Conuter vs Department Mapping_Clear Btn is Clickable, by selecting values then clicking clear btn
				public void counterVsDeptMapping_ClearBtnIsClickable() throws InterruptedException{
				Select sel = new Select(CounterVsDeptMappng_CountrDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);
				Select selct = new Select(CounterVsDeptMappng_DeptDrpdwn);
				selct.selectByIndex(1);
				Thread.sleep(2000);
				CounterVsDeptMappng_ClearBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Conuter vs Department Mapping_Select counter only & click save btn 
				public void counterVsDeptMapping_SelectCounterOnlyClickSaveBtn() throws InterruptedException{
				Select sel = new Select(CounterVsDeptMappng_CountrDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);
				CounterVsDeptMappng_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Conuter vs Department Mapping_Select department only & click save btn 
				public void counterVsDeptMapping_SelectDeptOnlyClickSaveBtn() throws InterruptedException{
				Select sel = new Select(CounterVsDeptMappng_CountrDrpdwn);
				sel.selectByIndex(0);
				Thread.sleep(2000);
				Select selct = new Select(CounterVsDeptMappng_DeptDrpdwn);
				selct.selectByIndex(1);
				CounterVsDeptMappng_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Conuter vs Department Mapping_Add mapping in one go s 
				public void counterVsDeptMapping_AddMappingInOneGo() throws InterruptedException{
				Select sel = new Select(CounterVsDeptMappng_CountrDrpdwn);
				sel.selectByVisibleText("AutomateCounter");
				Thread.sleep(2000);
				Select selct = new Select(CounterVsDeptMappng_DeptDrpdwn);
				selct.selectByIndex(1);
				CounterVsDeptMappng_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: List of Conuter Department Mappings_Edit btn is displayed
				public boolean listOfCountrDeptMappng_EditBtnIsDisplayed(){
				WebElement link = ListOfCountrDeptMappng_EditBtn;
				return link.isDisplayed();
				}

				//Validate: List of Conuter Department Mappings_Edit btn is Enabled
				public boolean listOfCountrDeptMappng_EditBtnIsEnabled(){
				WebElement btn = ListOfCountrDeptMappng_EditBtn;
				return btn.isEnabled();
				}
				
				//Validate: List of Conuter Department Mappings_Edit btn is Clickable
				public void listOfCountrDeptMappng_EditBtnIsClickable() throws InterruptedException{
				ListOfCountrDeptMappng_EditBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: List of Counter Department Mappings, click edit btn then update without values 
				public void listOfCountrDeptMappng_ClickUpdateBtnWithoutValues() throws InterruptedException{
				Select sel = new Select(CounterVsDeptMappng_CountrDrpdwn);
				sel.selectByIndex(0);
				Thread.sleep(2000);
				Select selct = new Select(CounterVsDeptMappng_DeptDrpdwn);
				selct.selectByIndex(0);
				Thread.sleep(2000);
				CounterVsDeptMappng_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: List of Counter Department Mappings, click edit btn then update with Counter only 
				public void listOfCountrDeptMappng_SelectCounterOnlyClickUpdateBtn() throws InterruptedException{
				Select sel = new Select(CounterVsDeptMappng_CountrDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);
				CounterVsDeptMappng_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: List of Counter Department Mappings, click edit btn then update with department only 
				public void listOfCountrDeptMappng_SelectDeptOnlyClickUpdateBtn() throws InterruptedException{
				Select sel = new Select(CounterVsDeptMappng_CountrDrpdwn);
				sel.selectByIndex(0);
				Thread.sleep(2000);
				Select selct = new Select(CounterVsDeptMappng_DeptDrpdwn);
				selct.selectByIndex(1);
				Thread.sleep(2000);
				Actions act = new Actions(driver);
				act.sendKeys(Keys.TAB);
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				WebDriverWait wc = new WebDriverWait(driver,2);
				wc.until(ExpectedConditions.visibilityOf(CounterVsDeptMappng_SaveBtn));
				CounterVsDeptMappng_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				
			//Validate: List of Counter Department Mappings, click edit btn then update with counter as dept already selected 
				public void listOfCountrDeptMappng_SelectCounterClickUpdateBtn() throws InterruptedException{
				Select sel = new Select(CounterVsDeptMappng_CountrDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);
				CounterVsDeptMappng_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				
				
				//Validate: List of Counter Department Mappings, Add mapping in one go
				public void listOfCountrDeptMappng_AddMappingInOneGo() throws InterruptedException{
				ListOfCountrDeptMappng_EditBtn.click();
				Select sel = new Select(CounterVsDeptMappng_CountrDrpdwn);
				sel.selectByVisibleText("AutomateCounter");
				Thread.sleep(2000);
				Select selct = new Select(CounterVsDeptMappng_DeptDrpdwn);
				selct.selectByIndex(5);
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("javascript:window.scrollBy(0,500)");
			    Thread.sleep(2000);
				CounterVsDeptMappng_SaveBtn.click();
				Thread.sleep(2000);
				}

				//Validate: Manage Billing Type link is Displayed
				public boolean manageBillingTypeLinkIsDisplayed(){
				WebElement link = ManageBillingTypeLink;
				return link.isDisplayed();
				}

				//Validate: Manage Billing Type link is Enabled
				public boolean manageBillingTypeLinkIsEnabled(){
				WebElement btn = ManageBillingTypeLink;
				return btn.isEnabled();
				}
				
				//Validate: Manage Billing Type link is Clickable
				public void manageBillingTypeLinkIsClickable() throws InterruptedException{
				ManageBillingTypeLink.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Billing Type Textbox is Displayed
				public boolean billingTypeTxtboxIsDisplayed(){
				WebElement txbox = ManageBilling_BillingTypeTxbox;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _ Billing Type Textbox is Enabled
				public boolean billingTypeTxtboxIsEnabled(){
				WebElement txbox = ManageBilling_BillingTypeTxbox;
				return txbox.isEnabled();
				}
				
				//Validate: Manage Billing Type _ Billing Description Textbox is Displayed
				public boolean billingDescriptionTxtboxIsDisplayed(){
				WebElement txbox = ManageBilling_BillingDescrptonTxbox;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _ Billing Description Textbox is Enabled
				public boolean billingDescriptionTxtboxIsEnabled(){
				WebElement txbox = ManageBilling_BillingDescrptonTxbox;
				return txbox.isEnabled();
				}
				
				//Validate: Manage Billing Type _ Registeration Fee Textbox is Displayed
				public boolean billingRegFeeTxtboxIsDisplayed(){
				WebElement txbox = ManageBilling_RegFeeTxbox;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _ Registeration Fee Textbox is Enabled
				public boolean billingRegFeeTxtboxIsEnabled(){
				WebElement txbox = ManageBilling_RegFeeTxbox;
				return txbox.isEnabled();
				}
				
				//Validate: Manage Billing Type _  Appointment Fee Textbox is Displayed
				public boolean billingAppointmentFeeTxtboxIsDisplayed(){
				WebElement txbox = ManageBilling_AppointmntFeeTxbox;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _  Appointment Fee  Textbox is Enabled
				public boolean billingAppointmentFeeTxtboxIsEnabled(){
				WebElement txbox = ManageBilling_AppointmntFeeTxbox;
				return txbox.isEnabled();
				}
				
				//Validate: Manage Billing Type _ Casualty Fee Textbox is Displayed
				public boolean billingCasualtyFeeTxtboxIsDisplayed(){
				WebElement txbox = ManageBilling_CasualtyFeeTxbox;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _ Casualty Fee Textbox is Enabled
				public boolean billingCasualtyFeeTxtboxIsEnabled(){
				WebElement txbox = ManageBilling_CasualtyFeeTxbox;
				return txbox.isEnabled();
				}
				
				//Validate: Manage Billing Type _  InPatient Fee Textbox is Displayed
				public boolean billingInPatientFeeTxtboxIsDisplayed(){
				WebElement txbox = ManageBilling_InPatientFeeTxbox;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _  Inpatient Fee  Textbox is Enabled
				public boolean billingInPatientFeeTxtboxIsEnabled(){
				WebElement txbox = ManageBilling_InPatientFeeTxbox;
				return txbox.isEnabled();
				}
				
				//Validate: Manage Billing Type _ Revisit Fee Textbox is Displayed
				public boolean billingRevisitFeeTxtboxIsDisplayed(){
				WebElement txbox = ManageBilling_RevisitFeeTxbox;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _ Revisit Fee Textbox is Enabled
				public boolean billingRevisitFeeTxtboxIsEnabled(){
				WebElement txbox = ManageBilling_RevisitFeeTxbox;
				return txbox.isEnabled();
				}
				
				//Validate: Manage Billing Type _  Verified By Btn is Displayed
				public boolean verifiedByBtnIsDisplayed(){
				WebElement txbox = ManageBilling_VerifiedByBtn;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _  Verified By Btn is Enabled
				public boolean verifiedByBtnIsEnabled(){
				WebElement txbox = ManageBilling_VerifiedByBtn;
				return txbox.isEnabled();
				}
				

				//Validate: Manage Billing Type _  Verified By Btn is  Clickable
				public void verifiedByBtnIsClickable() throws InterruptedException{
				ManageBilling_VerifiedByBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _  Save/Update Btn is Displayed
				public boolean manageBilling_SaveBtnIsDisplayed(){
				WebElement txbox = ManageBilling_SaveBtn;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _  Save/Update Btn is Enabled
				public boolean manageBilling_SaveBtnIsEnabled(){
				WebElement txbox = ManageBilling_SaveBtn;
				return txbox.isEnabled();
				}
				

				//Validate: Manage Billing Type _  Save/Update Btn is  Clickable
				public void manageBilling_SaveBtnIsClickable() throws InterruptedException{
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _  clear Btn is Displayed
				public boolean manageBilling_ClearBtnIsDisplayed(){
				WebElement txbox = ManageBilling_ClearBtn;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _  clear Btn is Enabled
				public boolean manageBilling_ClearBtnIsEnabled(){
				WebElement txbox = ManageBilling_ClearBtn;
				return txbox.isEnabled();
				}
				

				//Validate: Manage Billing Type _  clear Btn is  Clickable
				public void manageBilling_ClearBtnIsClickable() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_BillingTypeTxbox.sendKeys("@@$$");
				Thread.sleep(2000);
				ManageBilling_ClearBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Invalid billing type only and click save btn
				public void enterInvalidBillingTypeOnlyClickSaveBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_BillingTypeTxbox.sendKeys("@@$$");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Valid billing type only and click save btn
				public void enterValidBillingTypeOnlyClickSaveBtn(String billngName) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_BillingTypeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_BillingTypeTxbox.sendKeys(billngName);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Invalid billing description only and click save btn
				public void enterInvalidBillingDescrptonOnlyClickSaveBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_BillingDescrptonTxbox.sendKeys("@@$$");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Valid billing description only and click save btn
				public void enterValidBillingDescrptonOnlyClickSaveBtn(String  billngDesc) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_BillingDescrptonTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_BillingDescrptonTxbox.sendKeys(billngDesc);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Invalid Registration Fee only and click save btn
				public void enterInvalidRegFeeOnlyClickSaveBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_RegFeeTxbox.sendKeys("@@$$EF12");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Valid Registration Fee only and click save btn
				public void enterValidRegFeeOnlyClickSaveBtn(String RegFee) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_RegFeeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_RegFeeTxbox.sendKeys(RegFee);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Invalid Appointment Fee only and click save btn
				public void enterInvalidAppointmentFeeOnlyClickSaveBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_AppointmntFeeTxbox.sendKeys("@@$$EF12");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Valid Appointment Fee only and click save btn
				public void enterValidAppointmentFeeOnlyClickSaveBtn(String appointmentFee) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_AppointmntFeeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_AppointmntFeeTxbox.sendKeys(appointmentFee);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Invalid Casualty Fee only and click save btn
				public void enterInvalidCasualtyFeeOnlyClickSaveBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_CasualtyFeeTxbox.sendKeys("@@$$EF12");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Valid Casualty Fee only and click save btn
				public void enterValidCasualtyFeeOnlyClickSaveBtn(String casualtyFee) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_CasualtyFeeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_CasualtyFeeTxbox.sendKeys(casualtyFee);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Invalid In Patinet Fee only and click save btn
				public void enterInvalidInPatientFeeOnlyClickSaveBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_InPatientFeeTxbox.sendKeys("@@$$EF12");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Valid In Patinet Fee only and click save btn
				public void enterValidInPatientFeeOnlyClickSaveBtn(String inPatientFee) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_InPatientFeeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_InPatientFeeTxbox.sendKeys(inPatientFee);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Invalid Revisit Fee only and click save btn
				public void enterInvalidRevisitFeeOnlyClickSaveBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_RevisitFeeTxbox.sendKeys("@@$$EF12");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Enter Valid Revisit Fee only and click save btn
				public void enterValidRevisitFeeOnlyClickSaveBtn(String revisitFee) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_RevisitFeeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_RevisitFeeTxbox.sendKeys(revisitFee);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				

				//Validate: Manage Billing _ Prints validation msg:Billing type added successfully
				public WebElement manageBilling_PrintValMsg(){
				WebElement msg = ManageBilling_PrintValMsg;
				return msg;
				} 
				
				//Validate: Manage Billing Type _ Add new Billing type in one go
				public void addNewBillingType_InOneGo(String billngName,String billngDesc,String RegFee,String appointmentFee,String casualtyFee,String inPatientFee,String revisitFee) throws InterruptedException{
					ManageBilling_BillingTypeTxbox.sendKeys(billngName);
					Thread.sleep(2000);
					ManageBilling_BillingDescrptonTxbox.sendKeys(billngDesc);
					Thread.sleep(2000);
					ManageBilling_RegFeeTxbox.sendKeys(RegFee);
					Thread.sleep(2000);
					ManageBilling_AppointmntFeeTxbox.sendKeys(appointmentFee);
					Thread.sleep(2000);
					ManageBilling_CasualtyFeeTxbox.sendKeys(casualtyFee);
					Thread.sleep(2000);
					ManageBilling_InPatientFeeTxbox.sendKeys(inPatientFee);
					Thread.sleep(2000);
					ManageBilling_RevisitFeeTxbox.sendKeys(revisitFee);
					Thread.sleep(2000);
					ManageBilling_SaveBtn.click();
					Thread.sleep(2000);
				}
				

				//Validate: Manage Billing Type _  Edit Btn is Displayed
				public boolean manageBillingType_EditBtnIsDisplayed(){
				WebElement txbox = ManageBilling_EditBtn;
				return txbox.isDisplayed();
				}

				//Validate: Manage Billing Type _  Edit Btn is Enabled
				public boolean manageBillingType_EditBtnIsEnabled(){
				WebElement txbox = ManageBilling_EditBtn;
				return txbox.isEnabled();
				}
				

				//Validate: Manage Billing Type _  Edit Btn is  Clickable
				public void manageBillingType_EditBtnIsClickable() throws InterruptedException{
				ManageBilling_EditBtn.click();
				Thread.sleep(4000);
				}

				
				//Validate: Manage Billing Type _  clears Billing Type txtbox
				public void manageBilling_ClearAllDataAndUpdateInvalidDataInBillingTypeTxbox() throws InterruptedException{
				ManageBilling_ClearBtn.click();
				Thread.sleep(2000);
				ManageBilling_BillingTypeTxbox.sendKeys("@@$$");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Valid billing type only and click update btn
				public void edit_EnterValidBillingTypeOnlyClickUpdateBtn(String billngName) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_BillingTypeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_BillingTypeTxbox.sendKeys(billngName);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Invalid billing description only and click update btn
				public void edit_EnterInvalidBillingDescrptonOnlyClickUpdateBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_BillingDescrptonTxbox.sendKeys("@@$$");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}

				
				//Validate: Manage Billing Type _ Edit:Enter Valid billing description only and click update btn
				public void edit_EnterValidBillingDescrptonOnlyClickUpdateBtn(String  billngDesc) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_BillingDescrptonTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_BillingDescrptonTxbox.sendKeys(billngDesc);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				
				
				
				//Validate: Manage Billing Type _ Edit:Enter Invalid Registration Fee only and click update btn
				public void edit_EnterInvalidRegFeeOnlyClickUpdateBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_RegFeeTxbox.sendKeys("@@$$EF12");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Valid Registration Fee only and click update btn
				public void edit_EnterValidRegFeeOnlyClickUpdateBtn(String RegFee) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_RegFeeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_RegFeeTxbox.sendKeys(RegFee);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Invalid Appointment Fee only and click update btn
				public void edit_EnterInvalidAppointmentFeeOnlyClickUpdateBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_AppointmntFeeTxbox.sendKeys("@@$$EF12");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Valid Appointment Fee only and click update btn
				public void edit_EnterValidAppointmentFeeOnlyClickUpdateBtn(String appointmentFee) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_AppointmntFeeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_AppointmntFeeTxbox.sendKeys(appointmentFee);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Invalid Casualty Fee only and click update btn
				public void edit_nterInvalidCasualtyFeeOnlyClickUpdateBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_CasualtyFeeTxbox.sendKeys("@@$$EF12");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Valid Casualty Fee only and click update btn
				public void edit_EnterValidCasualtyFeeOnlyClickUpdateBtn(String casualtyFee) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_CasualtyFeeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_CasualtyFeeTxbox.sendKeys(casualtyFee);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Invalid In Patinet Fee only and click update btn
				public void edit_EnterInvalidInPatientFeeOnlyClickUpdateBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_InPatientFeeTxbox.sendKeys("@@$$EF12");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Valid In Patinet Fee only and click update btn
				public void edit_EnterValidInPatientFeeOnlyClickUpdateBtn(String inPatientFee) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_InPatientFeeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_InPatientFeeTxbox.sendKeys(inPatientFee);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Invalid Revisit Fee only and click update btn
				public void edit_EnterInvalidRevisitFeeOnlyClickUpdateBtn() throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_RevisitFeeTxbox.sendKeys("@@$$EF12");
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Billing Type _ Edit:Enter Valid Revisit Fee only and click update btn
				public void edit_EnterValidRevisitFeeOnlyClickUpdateBtn(String revisitFee) throws InterruptedException{
				Thread.sleep(2000);
				ManageBilling_RevisitFeeTxbox.clear();
				Thread.sleep(2000);
				ManageBilling_RevisitFeeTxbox.sendKeys(revisitFee);
				Thread.sleep(2000);
				ManageBilling_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: Manage Billing Type _ Edit Billing type in one go
				public void editBillingType_InOneGo(String billngName,String billngDesc,String RegFee,String appointmentFee,String casualtyFee,String inPatientFee,String revisitFee) throws InterruptedException{
					ManageBilling_BillingTypeTxbox.sendKeys(billngName);
					Thread.sleep(2000);
					ManageBilling_BillingDescrptonTxbox.sendKeys(billngDesc);
					Thread.sleep(2000);
					ManageBilling_RegFeeTxbox.sendKeys(RegFee);
					Thread.sleep(2000);
					ManageBilling_AppointmntFeeTxbox.sendKeys(appointmentFee);
					Thread.sleep(2000);
					ManageBilling_CasualtyFeeTxbox.sendKeys(casualtyFee);
					Thread.sleep(2000);
					ManageBilling_InPatientFeeTxbox.sendKeys(inPatientFee);
					Thread.sleep(2000);
					ManageBilling_RevisitFeeTxbox.sendKeys(revisitFee);
					Thread.sleep(2000);
					ManageBilling_SaveBtn.click();
					Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval link is Displayed
				public boolean manageDeptClinicFeeIntrvlLinkIsDisplayed(){
				WebElement link = ManageDeptClinicFeeIntrvl;
				return link.isDisplayed();
				}

				//Validate: Manage Department Clinic Fee Interval link is Enabled
				public boolean manageDeptClinicFeeIntrvlLinkIsEnabled(){
				WebElement btn = ManageDeptClinicFeeIntrvl;
				return btn.isEnabled();
				}
				
				//Validate: Manage Department Clinic Fee Interval link is Clickable
				public void manageDeptClinicFeeIntrvlLinkIsClickable() throws InterruptedException{
				ManageDeptClinicFeeIntrvl.click();
				Thread.sleep(4000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Department dropdown is displayed
				public boolean manageDeptClinicFeeIntrvl_DeptDrpdwnIsDisplyed(){
				WebElement drpdwn = ManageDeptClinicFeeIntrvl_DeptDrpdwn;
				return drpdwn.isDisplayed();
				}
				
				//Validate: Manage Department Clinic Fee Interval_Department dropdown is enabled
				public boolean manageDeptClinicFeeIntrvl_DeptDrpdwnIsEnabled(){
				WebElement drpdwn = ManageDeptClinicFeeIntrvl_DeptDrpdwn;
				return drpdwn.isEnabled();
				}
				
				//Validate: Manage Department Clinic Fee Interval_Department dropdown is Multiple
				public boolean manageDeptClinicFeeIntrvl_DeptDrpdwnIsMultiple() throws InterruptedException{
				Thread.sleep(3000);
				Select ListBox = new Select(ManageDeptClinicFeeIntrvl_DeptDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Clinic dropdown is displayed
				public boolean manageDeptClinicFeeIntrvl_ClinicDrpdwnIsDisplyed(){
				WebElement drpdwn = ManageDeptClinicFeeIntrvl_ClinicDrpdwn;
				return drpdwn.isDisplayed();
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Clinic dropdown is enabled
				public boolean manageDeptClinicFeeIntrvl_ClinicDrpdwnIsEnabled(){
				WebElement drpdwn = ManageDeptClinicFeeIntrvl_ClinicDrpdwn;
				return drpdwn.isEnabled();
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Clinic dropdown is Multiple
				public boolean manageDeptClinicFeeIntrvl_ClinicDrpdwnIsMultiple() throws InterruptedException{
				Thread.sleep(3000);
				Select ListBox = new Select(ManageDeptClinicFeeIntrvl_ClinicDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Clinic Type dropdown is displayed
				public boolean manageDeptClinicFeeIntrvl_ClinicTypeDrpdwnIsDisplyed(){
				WebElement drpdwn = ManageDeptClinicFeeIntrvl_ClinicTypeDrpdwn;
				return drpdwn.isDisplayed();
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Clinic Type dropdown is enabled
				public boolean manageDeptClinicFeeIntrvl_ClinicTypeDrpdwnIsEnabled(){
				WebElement drpdwn = ManageDeptClinicFeeIntrvl_ClinicTypeDrpdwn;
				return drpdwn.isEnabled();
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Clinic Type dropdown is Multiple
				public boolean manageDeptClinicFeeIntrvl_ClinicTypeDrpdwnIsMultiple() throws InterruptedException{
				Thread.sleep(3000);
				Select ListBox = new Select(ManageDeptClinicFeeIntrvl_ClinicTypeDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Followup  Fee txtbox is displayed
				public boolean manageDeptClinicFeeIntrvl_FollowupFeeIntrvalDrpdwnIsDisplyed(){
				WebElement drpdwn = ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox;
				return drpdwn.isDisplayed();
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Followup  Fee txtbox is enabled
				public boolean manageDeptClinicFeeIntrvl_FollowupFeeIntrvalDrpdwnIsEnabled(){
				WebElement drpdwn = ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox;
				return drpdwn.isEnabled();
				}
				
			
				//Validate: Manage Department Clinic Fee Interval_ Followup  Fee txtbox is Displayed
				public boolean manageDeptClinicFeeIntrvl_FollowupFeeTxboxIsDisplyed(){
				WebElement link = ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox;
				return link.isDisplayed();
				}

				//Validate: Manage Department Clinic Fee Interval_ Followup  Fee txtbox is enabled 
				public boolean manageDeptClinicFeeIntrvl_FollowupFeeTxboxIsEnabled(){
				WebElement btn = ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox;
				return btn.isEnabled();
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Number of visits allowed txtbox is Displayed
				public boolean manageDeptClinicFeeIntrvl_NoOfVisitsAllowdTxboxTxboxIsDisplyed(){
				WebElement link = ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox;
				return link.isDisplayed();
				}

				//Validate: Manage Department Clinic Fee Interval_ Number of visits allowed txtbox is enabled 
				public boolean manageDeptClinicFeeIntrvl_NoOfVisitsAllowdTxboxTxboxIsEnabled(){
				WebElement btn = ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox;
				return btn.isEnabled();
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Slip template dropdown is displayed
				public boolean manageDeptClinicFeeIntrvl_SlipTemplateDrpdwnIsDisplyed(){
				WebElement drpdwn = ManageDeptClinicFeeIntrvl_SlipTemplateDrpdwn;
				return drpdwn.isDisplayed();
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Slip template dropdown is enabled
				public boolean manageDeptClinicFeeIntrvl_SlipTemplateDrpdwnIsEnabled(){
				WebElement drpdwn = ManageDeptClinicFeeIntrvl_SlipTemplateDrpdwn;
				return drpdwn.isEnabled();
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Slip template dropdown is Multiple
				public boolean manageDeptClinicFeeIntrvl_SlipTemplateDrpdwnIsMultiple() throws InterruptedException{
				Thread.sleep(2000);
				Select ListBox = new Select(ManageDeptClinicFeeIntrvl_SlipTemplateDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Save btn is Displayed
				public boolean manageDeptClinicFeeIntrvl_SaveBtnIsDisplayed(){
				WebElement link = ManageDeptClinicFeeIntrvl_SaveBtn;
				return link.isDisplayed();
				}

				//Validate: Manage Department Clinic Fee Interval_ Save btn is Enabled
				public boolean manageDeptClinicFeeIntrvl_SaveBtnIsEnabled(){
				WebElement btn = ManageDeptClinicFeeIntrvl_SaveBtn;
				return btn.isEnabled();
				}
				
				//Validate: Manage Department Clinic Fee Interval_ Save btn is Clickable
				public void manageDeptClinicFeeIntrvl_SaveBtnIsClickable() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				
				
			/*	
				String msg = manageDeptClinicFeeIntrval_PrintValMsg.getText();
			//	Assert.assertEquals(msg, "");
				System.out.println(msg);
				Thread.sleep(2000);
				CounterVsDeptMappng_AlertCloseBtn.click();
			*/
				
				}
				
				//Validate: Manage Department Clinic Fee Interval_Prints validation msg
				public WebElement manageDeptClinicFeeIntrvl_PrintValMsg(){
				WebElement msg = manageDeptClinicFeeIntrval_PrintValMsg;
				return msg;
				} 
				
				//Validate: Manage Department Clinic Fee Interval_ Clicks on Alert close btn
				public void manageDeptClinicFeeIntrvl_ClicksOnALertCloseBtn() throws InterruptedException{
				CounterVsDeptMappng_AlertCloseBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: Manage Department Clinic Fee Interval_Select department and click Save btn
				public void manageDeptClinicFeeIntrvl_SelectDeptOnly() throws InterruptedException{
				Select sel = new Select(ManageDeptClinicFeeIntrvl_DeptDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Select department clinic and click Save btn
				public void manageDeptClinicFeeIntrvl_SelectDeptClinicOnly() throws InterruptedException{
				Select sel = new Select(ManageDeptClinicFeeIntrvl_ClinicDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Select department,clinic,clinic type and click Save btn
				public void manageDeptClinicFeeIntrvl_SelectDeptClinicClinicTypeOnly() throws InterruptedException{
				Select sel = new Select(ManageDeptClinicFeeIntrvl_ClinicTypeDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Enter invalid follow fee interval in days
				public void enterInvalidFollowupFeeIntrvlClickSaveBtn() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.sendKeys("A$@Z");
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Enter valid follow fee interval in days 
				public void enterValidFollowupFeeIntrvlClickSaveBtn(String followupFeeIntrvl) throws InterruptedException{
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.clear();
				Thread.sleep(2000);	
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.sendKeys(followupFeeIntrvl);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Enter invalid follow fee interval in days
				public void enterInvalidFollowupFeeClickSaveBtn() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.sendKeys("A$@Z");
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Enter valid follow fee interval in days
				public void enterValidFollowupFeeClickSaveBtn(String followupFee) throws InterruptedException{
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.sendKeys(followupFee);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Enter invalid number of visits allowed
				public void enterInvalidNoOfVisitsAllowdClickSaveBtn() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.sendKeys("A$@Z");
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Enter valid number of visits allowed
				public void enterValidNoOfVisitsAllowdClickSaveBtn(String noOfVisitsAllowd) throws InterruptedException{
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.sendKeys(noOfVisitsAllowd);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Select department and click Save btn
				public void selectSlipTemplateClickSaveBtn() throws InterruptedException{
				Select sel = new Select(ManageDeptClinicFeeIntrvl_SlipTemplateDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Cerate Department Clinic Fee Interval in one go
				public void cerateDeptClinicFeeIntrvlInOneGo(String feeIntrvl,String followupFee,String visitsAllowd) throws InterruptedException{
				Select dept = new Select(ManageDeptClinicFeeIntrvl_DeptDrpdwn);
				dept.selectByIndex(2);
				Thread.sleep(2000);
				Select clinic = new Select(ManageDeptClinicFeeIntrvl_ClinicDrpdwn);
				clinic.selectByIndex(2);
				Thread.sleep(2000);
				Select clinicType = new Select(ManageDeptClinicFeeIntrvl_ClinicTypeDrpdwn);
				clinicType.selectByIndex(1);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.sendKeys(feeIntrvl);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.sendKeys(followupFee);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.sendKeys(visitsAllowd);
				Thread.sleep(2000);
				Select slipTemplt = new Select(ManageDeptClinicFeeIntrvl_SlipTemplateDrpdwn);
				slipTemplt.selectByIndex(2);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: Manage Department Clinic Fee Interval_Edit btn is Displayed
				public boolean manageDeptClinicFeeIntrvl_EditBtnIsDisplayed(){
				WebElement link = ManageDeptClinicFeeIntrvl_EditBtn;
				return link.isDisplayed();
				}

				//Validate: Manage Department Clinic Fee Interval_Edit btn is Enabled
				public boolean manageDeptClinicFeeIntrvl_EditBtnIsEnabled(){
				WebElement btn = ManageDeptClinicFeeIntrvl_EditBtn;
				return btn.isEnabled();
				}
				
				//Validate: Manage Department Clinic Fee Interval_Edit btn is Clickable
				public void manageDeptClinicFeeIntrvl_EditBtnIsClickable() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_EditBtn.click();
				Thread.sleep(2000);
				}
				
				
				
				//Validate: Manage Department Clinic Fee Interval_Edit department and click Save btn
				public void editDeptClinicFeeIntrvl_RemoveFollowupIntrvalFeeVisitsAndSlipTemplate() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.clear();
				Thread.sleep(2000);
				Select slipTemplt = new Select(ManageDeptClinicFeeIntrvl_SlipTemplateDrpdwn);
				slipTemplt.selectByIndex(0);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Edit and enter invalid follow fee interval in days
				public void edit_EnterInvalidFollowupFeeIntrvlClickSaveBtn() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.sendKeys("A$@Z");
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Edit & enter valid follow fee interval in days 
				public void edit_EnterValidFollowupFeeIntrvlClickSaveBtn(String followupFeeIntrvl) throws InterruptedException{
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.clear();
				Thread.sleep(2000);	
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.sendKeys(followupFeeIntrvl);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Edit & enter invalid follow fee interval in days
				public void edit_EnterInvalidFollowupFeeClickSaveBtn() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.sendKeys("A$@Z");
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Edit & enter valid follow fee interval in days
				public void edit_EnterValidFollowupFeeClickSaveBtn(String followupFee) throws InterruptedException{
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.sendKeys(followupFee);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Edit & enter invalid number of visits allowed
				public void edit_EnterInvalidNoOfVisitsAllowdClickSaveBtn() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.sendKeys("A$@Z");
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Edit & enter valid number of visits allowed
				public void edit_EnterValidNoOfVisitsAllowdClickSaveBtn(String noOfVisitsAllowd) throws InterruptedException{
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.sendKeys(noOfVisitsAllowd);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_edit & select department and click Save btn
				public void edit_SelectSlipTemplateClickSaveBtn() throws InterruptedException{
				Select sel = new Select(ManageDeptClinicFeeIntrvl_SlipTemplateDrpdwn);
				sel.selectByIndex(1);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				//Validate: Cerate Department Clinic Fee Interval in one go
				public void editDeptClinicFeeIntrvlInOneGo(String feeIntrvl,String followupFee,String visitsAllowd) throws InterruptedException{
				ManageDeptClinicFeeIntrvl_EditBtn.click();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeIntrvlTxbox.sendKeys(feeIntrvl);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_FollowupFeeTxtbox.sendKeys(followupFee);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.clear();
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_NoVisitAllowedTxbox.sendKeys(visitsAllowd);
				Thread.sleep(2000);
				Select slipTemplt = new Select(ManageDeptClinicFeeIntrvl_SlipTemplateDrpdwn);
				slipTemplt.selectByIndex(2);
				Thread.sleep(2000);
				ManageDeptClinicFeeIntrvl_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: ManageDeptClinicFeeIntrvl_Search textbox is Displayed
				public boolean manageDeptClinicFeeIntrvl_SearchTextboxIsDisplayed(){
				WebElement search = ManageDeptClinicFeeIntrvl_SearchTxbox;
				return search.isDisplayed();
				}

				//Validate: ManageDeptClinicFeeIntrvl_Search textbox is Enabled
				public boolean manageDeptClinicFeeIntrvl_SearchTextboxIsEnabled(){
				WebElement search = ManageDeptClinicFeeIntrvl_SearchTxbox;
				return search.isEnabled();
				}
			
				//Validate: Manage Department Clinic Fee Interval_Enter invalid data in search box to search
				public void enterInvalidDataInSearchTxtoxToSearch() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_SearchTxbox.sendKeys("A$@Z");
				Thread.sleep(2000);
				}
				
				//Validate: Manage Department Clinic Fee Interval_Enter valid data in search box to search
				public void enterValidDataInSearchTxtoxToSearch() throws InterruptedException{
				ManageDeptClinicFeeIntrvl_SearchTxbox.clear();
				Thread.sleep(2000);	
				ManageDeptClinicFeeIntrvl_SearchTxbox.sendKeys("apollo");
				Thread.sleep(2000);
				}
				
				//Validate: Department User Mapping Link is Displayed
				public boolean departmentUserMappingLinkIsDisplayed(){
				WebElement link = DepartmentUserMappingLink;
				return link.isDisplayed();
				}

				//Validate: Department User Mapping Link is Enabled
				public boolean departmentUserMappingLinkIsEnabled(){
				WebElement btn = DepartmentUserMappingLink;
				return btn.isEnabled();
				}
				
				//Validate: Department User Mapping Link is Clickable
				public void departmentUserMappingLinkIsClickable() throws InterruptedException{
				DepartmentUserMappingLink.click();
				Thread.sleep(2000);
				}
				

				//Validate: Find total no of frames
				public void findframeno(){
					List<WebElement> frameList=driver.findElements(By.tagName("iframe"));
					System.out.println("Found total frame numbers:"+" "+frameList.size());
				}
				
				
			/*	//Validate: Chk if table is present in the page then click on next btn
				public boolean checkIfTableDisplayed(){
					try {
						
						WebElement table = DepartmentUserMappingLink_Table;
						table.isDisplayed();
						return true;
					}
					
					catch(Exception e){
						return false;
					}
				}*/
				
				
			/*	//Validate: Click on next btn
				public void clickOnNextPageBtn() throws InterruptedException{
				DepartmentUserMappingLink_NextPageBtn.click();
				Thread.sleep(5000);
				}
				*/
				
				
	//	1. Validate: Fetch number of rows and columns from dynamic webtable 
				
				public void printTotalRowCols() throws InterruptedException{
				
					// No. of rows
			WebElement ToGetrows = driver.findElement(By.xpath("//table[@id='tblUsrDept']/tbody"));		
			List <WebElement> rows = ToGetrows.findElements(By.tagName("tr"));
			System.out.println("Number of rows :"+ rows.size());
					
					
					// No. of columns
	WebElement ToGetColumns = driver.findElement(By.xpath("//table[@id='tblUsrDept']/tbody/tr"));			
	List<WebElement> col = ToGetColumns.findElements(By.tagName("td"));
			System.out.println("Number of cols :"+ col.size());
	
		}
				
				
		// 2.Validate: Fetch values of a row which has different cols and print specific col value
				public void printsTextInsideFirstRowCol() throws InterruptedException{
					
//WebElement htmltable = driver.findElement(By.xpath("//*[@id='tblUsrDept']"));
					WebElement htmltable = driver.findElement(By.xpath("/html/body/div/form/div/div/table/thead"));


					WebElement rows = htmltable.findElement(By.tagName("tr"));
				
			String textInRows = rows.getText();
			
			System.out.println("Rows values are :"+ textInRows);
			
			WebElement cell = rows.findElement(By.xpath("/html/body/div/form/div/div/table/thead/tr/th[2]"));
			
			String textInCell = cell.getText();
			
			System.out.println("Col value is :"+ textInCell);	}
		
			
//	3. Validate: Get all the values of a dynamic table from all rows col(cells)
				public void getValuesOfAllRowsAndCols() throws InterruptedException{
					
					// Locate table
					WebElement table = driver.findElement(By.xpath("//*[@id='tblUsrDept']/tbody"));
				
					// Locate rows
					List<WebElement> tableRows = table.findElements(By.tagName("tr"));
					
					// To calculate no. of rows in a table
					int rowCount = tableRows.size();
					
					// Loop will execute till the last row of the table
					for(int row=0; row<rowCount; row++){
						// To locate col(cell) of that specific row
						List<WebElement> colRow = tableRows.get(row).findElements(By.tagName("td"));

					// To calculate no of column(cells) in that specific row
					int colCount = colRow.size();	
					System.out.println("Number of cells in a row"+ row + "-----" + colCount);
					
					// Loop will execute till last row of the cell
						for(int col=0; col<colCount; col++){
							// To retrieve text from specific cell
							String celText = colRow.get(col).getText();
							
System.out.println("Cell value of row number :"+" "+ row + " and col number :"+" " + col +" "+"Is"+" "+celText);	}
						System.out.println("*************************");
					}}
				
				
				//Validate: Dept User Mapping_Select Dept dropdown is clickable
				public void deptUserMapping_ClicksOnUserDropdwnContainer(){
				WebElement drpdwn = DepartmentUserMappingLink_SelectUserContainer;
				drpdwn.click();
				}
				

				//Validate: Dept User Mapping_Select User dropdown is Displayed
				public boolean deptUserMapping_SelectUserDropdwnIsDisplayed(){
				WebElement drpdwn = DepartmentUserMapping_FindsUserDrpdwn;
				return drpdwn.isDisplayed();
				}
				
				//Validate: Dept User Mapping_Select User dropdown is Enabled
				public boolean deptUserMapping_SelectUserDropdownIsEnabled(){
				WebElement drpdwn = DepartmentUserMapping_FindsUserDrpdwn;
				return drpdwn.isEnabled();
				}
				
				//Validate: Dept User Mapping_Select User dropdown is Multiple
				public boolean deptUserMapping_SelectUserDropdownIsMultiple() throws InterruptedException{
				Select ListBox = new Select(DepartmentUserMapping_FindsUserDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}

			

				//Validate: Dept User Mapping_Clicks on Dept container
				public void deptUserMapping_SelectDeptDropdwnContainerIsClickable(){
				WebElement drpdwn = DepartmentUserMapping_SelectDeptContainer;
				drpdwn.click();
				}

				
				//Validate: Dept User Mapping_Select Dept dropdown is Displayed
				public boolean deptUserMapping_SelectDeptDropdownIsDisplayed(){
				WebElement drpdwn1 = DepartmentUserMapping_SelectDeptDrpdwn;
				return drpdwn1.isDisplayed();
				}
				
				
				//Validate: Dept User Mapping_Select Dept dropdown is Enabled
				public boolean deptUserMapping_SelectDeptDropdownIsEnabled(){
				WebElement drpdwn2 = DepartmentUserMapping_SelectDeptDrpdwn;
				return drpdwn2.isEnabled();
				}
				
			
				
				//Validate: Dept User Mapping_Select Dept dropdown is Multiple
				public boolean deptUserMapping_SelectDeptDropdownIsMultiple() throws InterruptedException{
				Select ListBox = new Select(DepartmentUserMapping_SelectDeptDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}

				
				/*
				public void selectValueFromDeptDrpdwn() throws InterruptedException{
				WebElement drpdwn = DepartmentUserMappingLink_SelectDeptDrpdwnContainer;
				Thread.sleep(2000);
				drpdwn.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
				List<WebElement> options = drpdwn.findElements(By.tagName("li"));
				int s = options.size();
				for( int j = 0; j< options.size();j++){
			         // if the option is By Subject click that option
			         if( options.get(j).getText().equals("DeoDept")){
			        	 options.get(j).click();
			            break;}}
				
				 // options.get(options.size()).click();
				}
				
				*/
				
				
				//Validate: Dept User Mapping_Select Add Mapping btn is Displayed
				public boolean deptUserMapping_AddMappingBtnIsDisplayed(){
				WebElement link = DepartmentUserMappingLink_AddMappingBtn;
				return link.isDisplayed();
				}

				//Validate: Dept User Mapping_Select Add Mapping btn is Enabled
				public boolean deptUserMapping_AddMappingBtnIsEnabled(){
				WebElement btn = DepartmentUserMappingLink_AddMappingBtn;
				return btn.isEnabled();
				}
				
				//Validate: Dept User Mapping_Select Add Mapping btn is Clickable
				public void deptUserMapping_AddMappingBtnIsClickable() throws InterruptedException{
				DepartmentUserMappingLink_AddMappingBtn.click();
				Thread.sleep(5000);
				}
				
				//Validate: Dept User Mapping_Select & Remove Chkbox is Displayed
				public boolean deptUserMapping_RemoveChkboxIsDisplayed(){
				WebElement link = DepartmentUserMappingLink_RemoveChkbox;
				return link.isDisplayed();
				}

				//Validate: Dept User Mapping_Select & Remove Chkbox is Enabled
				public boolean deptUserMapping_RemoveChkboxIsEnabled(){
				WebElement btn = DepartmentUserMappingLink_RemoveChkbox;
				return btn.isEnabled();
				}
				
				
				//Validate: Dept User Mapping_Select And Remove btn is Displayed
				public boolean deptUserMapping_SelectAndRemoveBtnIsDisplayed(){
				WebElement link = DepartmentUserMappingLink_SelectAndRemoveRemoveBtn;
				return link.isDisplayed();
				}

				//Validate: Dept User Mapping_Select And Remove btn is Enabled
				public boolean deptUserMapping_SelectAndRemoveBtnIsEnabled(){
				WebElement btn = DepartmentUserMappingLink_SelectAndRemoveRemoveBtn;
				return btn.isEnabled();
				}
				
				//Validate: Dept User Mapping_Select And Remove btn is Clickable
				public void deptUserMapping_SelectAndRemoveBtnIsClickable() throws InterruptedException{
				DepartmentUserMappingLink_SelectAndRemoveRemoveBtn.click();
				Thread.sleep(5000);
				}
				

				//Validate: Dept User Mapping_Search Txtbox is Displayed
				public boolean deptUserMapping_SearchTxtboxIsDisplayed(){
				WebElement link = DepartmentUserMappingLink_SearchTxtbox;
				return link.isDisplayed();
				}

				//Validate: Dept User Mapping_Search Txtbox is Enabled
				public boolean deptUserMapping_SearchTxtboxIsEnabled(){
				WebElement btn = DepartmentUserMappingLink_SearchTxtbox;
				return btn.isEnabled();
				}
				
				
				//Validate: Dept User Mapping_Next Page btn is Displayed
				public boolean deptUserMapping_NextPageBtnIsDisplayed(){
				WebElement link = DepartmentUserMappingLink_NextPageBtn;
				return link.isDisplayed();
				}

				//Validate: Dept User Mapping_Next Page btn is Enabled
				public boolean deptUserMapping_NextPageBtnIsEnabled(){
				WebElement btn = DepartmentUserMappingLink_NextPageBtn;
				return btn.isEnabled();
				}
				
				//Validate: Dept User Mapping_Next Page Btn is Clickable
				public void deptUserMapping_NextPageBtnIsClickable() throws InterruptedException{
				DepartmentUserMappingLink_NextPageBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: Dept User Mapping_Previous Page btn is Displayed
				public boolean deptUserMapping_PreviousPageBtnIsDisplayed(){
				WebElement link = DepartmentUserMappingLink_PreviousPageBtn;
				return link.isDisplayed();
				}

				//Validate: Dept User Mapping_Previous Page btn is Enabled
				public boolean deptUserMapping_PreviousPageBtnIsEnabled(){
				WebElement btn = DepartmentUserMappingLink_PreviousPageBtn;
				return btn.isEnabled();
				}
				
				//Validate: Dept User Mapping_Previous Page btn is Clickable
				public void deptUserMapping_PreviousPageBtnIsClickable() throws InterruptedException{
				DepartmentUserMappingLink_PreviousPageBtn.click();
				Thread.sleep(2000);
				}
				

				//Validate: Dept User Mapping_Select Max entries shown on a page dropdown is Displayed
				public boolean departmentUserMappingLink_SelectMaxEntryDrpdwnIsDisplayed(){
				WebElement drpdwn = DepartmentUserMappingLink_SelectMaxEntryDrpdwn;
				return drpdwn.isDisplayed();
				}
				
				//Validate: Dept User Mapping_Select Max entries shown on a page dropdown is Enabled
				public boolean departmentUserMappingLink_SelectMaxEntryDrpdwnIsEnabled(){
				WebElement drpdwn = DepartmentUserMappingLink_SelectMaxEntryDrpdwn;
				return drpdwn.isEnabled();
				}
				
				//Validate: Dept User Mapping_Select Max entries shown on a page dropdown is Multiple
				public boolean departmentUserMappingLink_SelectMaxEntryDrpdwnIsMultiple() throws InterruptedException{
				Select ListBox = new Select(DepartmentUserMappingLink_SelectMaxEntryDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				

				//Validate: Select user Only & click save btn
				public void deptUserMapping_SelectUserOnlyAndClickSaveBtn() throws InterruptedException{
					
					DepartmentUserMappingLink_SelectUserContainer.click();
					Thread.sleep(2000);
					WebElement userDropdown = DepartmentUserMapping_FindsUserDrpdwn;
					
					List<WebElement> listDrpdwnValues = userDropdown.findElements(By.tagName("li"));
					int printDrpdwnSize = listDrpdwnValues.size();
					System.out.println("Size of List" + printDrpdwnSize);
					
					Thread.sleep(2000);
					WebElement User = DepartmentUserMapping_SelectsFirstRowOfUserDrpdwn;
					User.click();
					
					/*for(WebElement option : listDrpdwnValues) {
					    if (option.getText().equals("UPN_SU_0232")) {
					        option.click();
					        System.out.println(option);
					    }
					    else{
					    	userDropdown.sendKeys(Keys.ARROW_DOWN);
					    	userDropdown.sendKeys(Keys.ARROW_DOWN);
					    	userDropdown.sendKeys(Keys.ENTER);
					    }
					}

*/
					
					DepartmentUserMappingLink_AddMappingBtn.click();
					Thread.sleep(2000);
					}
				
				
				//Validate: Select dept Only & click save btn
				public void deptUserMapping_SelectDeptOnlyAndClickSaveBtn() throws InterruptedException{
				DepartmentUserMapping_SelectDeptContainer.click();
				Thread.sleep(2000);
				DepartmentUserMapping_SelectsFirstRowOfUserDrpdwn.click();
				Thread.sleep(2000);
				DepartmentUserMappingLink_AddMappingBtn.click();
				Thread.sleep(2000);
				}
				
				
				//Validate: Add User Department mapping in one go
				public void deptUserMapping_CreateMappingInOneGo() throws InterruptedException{
					DepartmentUserMappingLink_SelectUserContainer.click();
					Thread.sleep(2000);
					DepartmentUserMapping_SelectsFirstRowOfUserDrpdwn.click();
					Thread.sleep(2000);
					DepartmentUserMapping_SelectDeptContainer.click();
					Thread.sleep(2000);
					DepartmentUserMapping_SelectsFirstRowOfUserDrpdwn.click();
					Thread.sleep(2000);
					DepartmentUserMappingLink_AddMappingBtn.click();
					Thread.sleep(2000);
				}
				
				
				//Validate: Prints validation msg : For Change Pwd functionality
				public String departmentUserMappingLink_PrintValMsg(){
				WebElement msg = DepartmentUserMappingLink_PrintValMsg;
				String validationMsg = msg.getText();
				return validationMsg;
				} 
		
				
			//Validate: Seach department name in search txtbox then clicks on checkbox and hits Select & Remove button 
					public void searchDeptClicksCheckboxClicksSelectRemoveBtn(String searchDept) throws InterruptedException{
					DepartmentUserMappingLink_SearchTxtbox.sendKeys(searchDept);
					Thread.sleep(2000);
					DepartmentUserMappingLink_RemoveChkbox.click();
					Thread.sleep(2000);
					DepartmentUserMappingLink_SelectAndRemoveRemoveBtn.click();
					Thread.sleep(2000);
					}

					
					
					//Validate: Seach department name in search txtbox then clicks on checkbox and hits Select & Remove button 
					public Object selectEntryAndCompare10Pages() throws InterruptedException{
					
					Select Tenentry = new Select(DepartmentUserMappingLink_SelectMaxEntryDrpdwn);	
					Tenentry.selectByVisibleText("10");
					Thread.sleep(2000);


		/*	WebElement htmltable = driver.findElement(By.xpath("//*[@id='tblUsrDept']"));
			//	WebElement htmltable = driver.findElement(By.xpath("/html/body/div/form/div/div/table/thead"));

			WebElement rows = htmltable.findElement(By.xpath("/html/body/div/form/div/div/table/tbody/tr[1]"));
					
			String textInRows = rows.getText();
				
			System.out.println("Cells in rows 1 contains value is :"+ textInRows);
			
			Thread.sleep(2000);
			
			Select TwentyFiveEntry = new Select(DepartmentUserMappingLink_SelectMaxEntryDrpdwn);	
			TwentyFiveEntry.selectByVisibleText("25");
			
			WebElement table = driver.findElement(By.xpath("//*[@id='tblUsrDept']"));
			//	WebElement htmltable = driver.findElement(By.xpath("/html/body/div/form/div/div/table/thead"));

			WebElement row = table.findElement(By.xpath(""));
					
			String textInRow = row.getText();
				
			System.out.println("Cells in rows 1 contains value is :"+ textInRow);
			
			Thread.sleep(2000);*/

					/*Select TenEntry = new Select(DepartmentUserMappingLink_SelectMaxEntryDrpdwn);	
					TenEntry.selectByVisibleText("10");
					*/
						
					WebElement table = driver.findElement(By.xpath("//*[@id='tblUsrDept']/tbody"));
						List<WebElement> tableRows = table.findElements(By.tagName("tr"));
						int rowCount = tableRows.size();
						System.out.println(rowCount);
						
						/*for(int row=0; row<rowCount; row++){
						List<WebElement> colRow = tableRows.get(row).findElements(By.tagName("td"));
						int colCount = colRow.size();	
						System.out.println("Number of cells in a row"+ row + "-----" + colCount);
							for(int col=0; col<colCount; col++){
								// To retrieve text from specific cell
								String celText = colRow.get(col).getText();
System.out.println("Cell value of row number:"+" "+ row + "and col number :"+" " + col +" "+"Is"+" "+celText);}}*/
					Thread.sleep(2000);
					return rowCount;

					}
					
					
					
					
					//Validate: Seach department name in search txtbox then clicks on checkbox and hits Select & Remove button 
					public Object selectEntryAndCompare25Pages() throws InterruptedException{
					Select TwentyFiveEntry = new Select(DepartmentUserMappingLink_SelectMaxEntryDrpdwn);	
					TwentyFiveEntry.selectByVisibleText("25");
					
					WebElement htmlTable = driver.findElement(By.xpath("//*[@id='tblUsrDept']/tbody"));
					List<WebElement> tableRow = htmlTable.findElements(By.tagName("tr"));
					int rowsCount = tableRow.size();
					System.out.println(rowsCount);
					
					/*for(int rows=0; rows<rowsCount; rows++){
					List<WebElement> colRows = tableRow.get(rows).findElements(By.tagName("td"));
					int colsCount = colRows.size();	
					System.out.println("Number of cells in a row"+ rows + "-----" + colsCount);
						for(int col=0; col<colsCount; col++){
						String celText = colRows.get(col).getText();
System.out.println("Cell value of row number:"+" "+ rows + "and col number :"+" " + col +" "+"Is"+" "+celText);}}*/
	Thread.sleep(2000);
	return rowsCount;
			}				
					
					
}				
					
					
					
					
					
					

					
					
					
					
					
					
					
					


				
				
