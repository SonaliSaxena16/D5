package nic.ehospital.qa.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import nic.ehospital.qa.base.TestBase;
import nic.ehospital.qa.util.TestUtil;

public class ConfigurePointOfTreatmentPage extends TestBase {
	
	@FindBy(xpath="//*[contains(@title,'Configure Point of Treatment')]")
	WebElement ConfigPointOfTrtment;

	@FindBy(partialLinkText="MANAGE USERS")
	WebElement ManageUserLink;
	
	@FindBy(id="subscript")
	WebElement ManageUser_InitalsDrpdwn;
	
	@FindBy(id="fname")
	WebElement ManageUser_FirstNameTxbox;

	@FindBy(id="lname")
	WebElement ManageUser_LastNameTxbox;  
	
	@FindBy(id="ddlDesignation")
	WebElement ManageUser_DesignationDrpdwn;	

	@FindBy(id="mobile")
	WebElement ManageUser_MobileTxBox;	 

	@FindBy(id="txtemail")
	WebElement ManageUser_EmailTxBox;	
	
	@FindBy(id="btnGenUname")
	WebElement ManageUser_GenrateUsrNameBtn;
	
	@FindBy(id="v_date")
	WebElement ManageUser_ValidUptoBtn;
	
	@FindBy(xpath="//*[contains(@class,'btn icon-btn-save btn-success')]")
	WebElement ManageUser_SaveBtn;
	
	@FindBy(xpath="//*[contains(@class,'today')]")
	WebElement ManageUser_TodayBtnCalender;

	@FindBy(xpath="//*[contains(@class,'btn btn-default btn-sm')]")
	WebElement ManageUser_RefreshEmpListBtn;

	@FindBy(xpath="//*[contains(@class,'fa fa-pencil-square-o')]")
	WebElement ManageUser_EditPencil;
	
	@FindBy(id="ddlDepartment")
	WebElement ManageUser_DepartmentDrpdwn;

	@FindBy(partialLinkText="MANAGE DEPARTMENTS")
	WebElement ManageDepartmentLink;

	@FindBy(id="btnAdd")
	WebElement ManageDepartment_AddNewDepartment;

	@FindBy(id="btnAddEditSave")
	WebElement AddNewDepartment_AddDepartmentBtn;
	
	@FindBy(id="dvDeptName")
	WebElement AddNewDepartment_DepartmentDrpdwn;
	
	@FindBy(id="dvDeptDesc")
	WebElement AddNewDepartment_DescriptionTxBox;

	@FindBy(id="dvNoUnits")
	WebElement AddNewDepartment_NoOfUnitsTxBox;
	
	@FindBy(id="tStatMsg")
	WebElement printValMsgOnlyDeptDesUnitFilled;
	
	@FindBy(xpath="//*[contains(@placeholder,'Enter Department Name')]")
	WebElement AddNewDepartment_DeptNameTxBox;
	
	@FindBy(xpath="//*[contains(@value,' edit ')]")
	WebElement ManageDept_EditBtn;

	@FindBy(xpath="//*[contains(@onclick,'enableGenderField();')]")
	WebElement AddNewDepartment_GenderSpecificChkbox;
	
	@FindBy(id="selGender")
	WebElement AddNewDepartment_SelectGenderDrpdwn;

	@FindBy(id="dvChkMed")
	WebElement AddNewDepartment_MedDeptChkbox;

	@FindBy(id="dvChkIpDep")
	WebElement AddNewDepartment_IPDDeptChkbox;

	@FindBy(id="dvChkLabDep")
	WebElement AddNewDepartment_LabDeptChkbox;

	@FindBy(id="dvChkOtDep")
	WebElement AddNewDepartment_OperatonDeptChkbox;

	@FindBy(id="dvChkOiDep")
	WebElement AddNewDepartment_OutsideInvestigatonDeptChkbox;

	@FindBy(id="dvChkClncDep")
	WebElement AddNewDepartment_ClinicalChkbox;

	@FindBy(id="dvChkPediDep")
	WebElement AddNewDepartment_PediatricChkbbox;

	@FindBy(partialLinkText="MANAGE UNITS")
	WebElement ManageUnitsLink;
	
	@FindBy(xpath="//*[contains(@value,' Add New Unit ')]")
	WebElement ManageUnit_AddNewUnit;
	
	@FindBy(id="ddlDeptId")
	WebElement AdddNewUnit_DeptNameDrpdwn;
	
	@FindBy(xpath="//*[contains(@value,'Add Unit')]")
	WebElement AdddNewUnit_AddUnitBtn;
	
	@FindBy(id="txtUnitNameId")
	WebElement AdddNewUnit_UnitNameTxBox;
	
	@FindBy(id="ddlUnitInchargeId")
	WebElement AdddNewUnit_UnitInChargeDrpdwn;
	
	@FindBy(id="tStatMsg")
	WebElement AdddNewUnit_PrintValMsgUnitAdded;
	
	@FindBy(id="ddlSundayId")
	WebElement AdddNewUnit_SundayDrpdwn;
	
	@FindBy(id="ddlMondayId")
	WebElement AdddNewUnit_MondayDrpdwn;
	
	@FindBy(id="ddlTuesdayId")
	WebElement AdddNewUnit_TuesdayDrpdwn;
	
	@FindBy(id="ddlWednesdayId")
	WebElement AdddNewUnit_WednesdayDrpdwn;
	
	@FindBy(id="ddlThusdayId")
	WebElement AdddNewUnit_ThursdayDrpdwn;
	
	@FindBy(id="ddlFridayId")
	WebElement AdddNewUnit_FridayDrpdwn;
	
	@FindBy(id="ddlSaturdayId")
	WebElement AdddNewUnit_SaturdayDrpdwn;
	
	@FindBy(xpath="//*[contains(@value,' edit ')]")
	WebElement manageUnit_EditBtn;
	
	@FindBy(xpath="//*[contains(@value,'Edit Unit')]")
	WebElement EditUnit_EditUnitBtn;
	
	@FindBy(partialLinkText="MANAGE SHIFTS")
	WebElement ManageShiftsLink;
	
	@FindBy(name="txtShiftName")
	WebElement ShiftNameTxtbox;	

	@FindBy(name="txtTimingFrom")
	WebElement shiftTmingsFromTxtbox;

	@FindBy(name="txtTimingTo")
	WebElement shiftTmingsToTxtbox;	
	
	@FindBy(name="ddlShiftType")
	WebElement ShiftTypeDrpdwn;	

	@FindBy(xpath="//*[contains(@value,'Save')]")
	WebElement ManageShifts_SaveBtn;	
	
	@FindBy(xpath="//*[contains(@class,'button_link')]")
	WebElement ManageShifts_EditBtn;
	
	@FindBy(xpath="//*[contains(@value,'Update')]")
	WebElement ManageShifts_UpdateBtn;	
	
	@FindBy(id="tStatMsg")
	WebElement ManageShifts_PrintValidationmsg;		
	
	@FindBy(partialLinkText="MANAGE CLINICS")
	WebElement ManageClinicsLink;
	
	@FindBy(name="txtclinicname")
	WebElement ClinicNameTxtbox;
	
	@FindBy(name="ddlClinicType")
	WebElement ClinicTypeDrpdwn;
	
	@FindBy(xpath="//*[contains(@value,'Save')]")
	WebElement SaveClinicBtn;
	
	@FindBy(xpath="//*[contains(@value,'edit')]")
	WebElement EditClinicBtn;
	
	@FindBy(xpath="//*[contains(@value,'Update')]")
	WebElement UpdateClinicBtn;
	
	@FindBy(id="tStatMsg")
	WebElement ManageClinic_PrintValidationMsg;
	
	@FindBy(xpath="//*[contains(@class,'caret')]")
	WebElement ManageWardsLink;
	
	@FindBy(xpath="//*[contains(text(),'ADD - EDIT WARD')]")
	WebElement Add_EditWardLink;
	
	@FindBy(xpath="//*[contains(@value,'Add Ward')]")
	WebElement SaveWardBtn;
	
	@FindBy(xpath="//*[contains(@name,'txtWardname')]")
	WebElement WardNameTxtbox;
	
	@FindBy(xpath="//*[contains(@name,'txtWardAbbr')]")
	WebElement WardAbbreviationTxtbox;

	@FindBy(xpath="//*[contains(@name,'ddlGender')]")
	WebElement AddEditWard_SelectGenderDrpdwn;
	
	@FindBy(xpath="//input[@name='rbIsCas' and @value='1']")
	WebElement CasualityWardRadioBtnYes;

	@FindBy(xpath="//input[@name='rbIsCas' and @value='0']")
	WebElement CasualityWardRadioBtnNo;
	
	@FindBy(xpath="//input[@name='rbIsMand' and @value='1']")
	WebElement BedAllocatonMandatoryRadioBtnYes;

	@FindBy(xpath="//input[@name='rbIsMand' and @value='0']")
	WebElement BedAllocatonMandatoryRadioBtnNo;
	
	@FindBy(xpath="//*[contains(@name,'txtTotnobed')]")
	WebElement TotalNoBedsTxtbox;

	@FindBy(xpath="//*[@id='btnEditWard1']")
	WebElement EditWardBtn;
	
	@FindBy(xpath="//*[contains(@value,'Edit Ward')]")
	WebElement UpdateWardEditBtn;
	
	@FindBy(id="tStatMsg")
	WebElement AddEditWard_PrintValMsg;
	
	@FindBy(xpath="//input[@name='rbSelectBy' and @value='1']")
	WebElement AddBedRadioBtn;

	@FindBy(xpath="//input[@name='rbSelectBy' and @value='2']")
	WebElement RemoveBedRadioBtn;
	
	@FindBy(xpath="//input[@name='rbSelectBy' and @value='3']")
	WebElement ChangeBedNoRadioBtn;
	
	@FindBy(xpath="//*[contains(@value,'show bed list')]")
	WebElement ShowBedListBtn;
	
	@FindBy(xpath="//*[contains(@src,'/ehospital/images/close-popup.png')]")
	WebElement CloseBtnBedListTable;
	
	@FindBy(xpath = "//*[@id=\"dgBeds\"]")
	List<WebElement> Tablesize;	
	
	@FindBy(xpath="//*[contains(@id,'txtEditBednoId')]")
	WebElement AddEditWard_AddBedTextbox;

	@FindBy(xpath="//*[contains(@value,'Save')]")
	WebElement SaveBtnForBed;
	
	@FindBy(xpath="//*[contains(@name,'txtTotnobed')]")
	WebElement TotalBedsDisplayedInTxtbox;
	
	@FindBy(xpath="//*[contains(@name,'chkSelect')]")
	WebElement RemoveBed_AvailaibleBedChkbox;
	
	@FindBy(xpath="//*[contains(@name,'ddlBed')]")
	WebElement SelectOldBedNoDrpdwn;
	
	@FindBy(xpath="//*[contains(@name,'txtEditpreBedindex')]")
	WebElement PrefixTextbox;	

	@FindBy(xpath="//*[contains(@name,'txtEditBedno')]")
	WebElement BedNoTextbox;	

	@FindBy(xpath="//*[contains(@name,'txtEditBedindex')]")
	WebElement PostfixTextbox;	
	
	@FindBy(xpath="//table[@id='dgBeds']")
	WebElement ShowBedStatusTable;

	
			
	@FindBy(xpath="/html/body/form/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]")
	WebElement bedRow;
	
	@FindBy(xpath="//*[contains(text(),'WARD-UNIT MAPPING')]")
	WebElement WardUnitMappingLink;
	
	@FindBy(xpath="//*[contains(@name,'ddlWard')]")
	WebElement WardUnitMapping_WardNameDrpdwn;
	
	@FindBy(xpath="//*[contains(@name,'ddlUnit')]")
	WebElement WardUnitMapping_UnitNameDrpdwn;

	@FindBy(xpath="//*[contains(@value,'Save')]")
	WebElement WardUnitMapping_SaveBtn;

	@FindBy(xpath="//a[text()='edit']")
	WebElement WardUnitMapping_EditBtn;
	
	@FindBy(xpath="//*[contains(@value,'Update')]")
	WebElement WardUnitMapping_UpdateBtn;
	
	@FindBy(xpath="//*[contains(@value,'delete')]")
	WebElement WardUnitMapping_DeleteBtn;
	
	@FindBy(xpath="//*[contains(@id,'tStatMsg')]")
	WebElement WardUnitMapping_PrintValMsg;
	
	@FindBy(xpath="//*[contains(text(),'MAP WARD VS ICU/ISOLATION WARD')]")
	WebElement MapWardVsIcuIsolation;
	
	@FindBy(xpath="//*[contains(@name,'ward_id')]")
	WebElement MapWardVsIcuIsolation_WardListDrpdwn;
	
	@FindBy(xpath="//*[contains(@name,'ddlicu')]")
	WebElement MapWardVsIcuIsolation_IcuIsolationWardDrpdwn;
	
	@FindBy(xpath="//*[contains(@name,'saveconfig')]")
	WebElement MapWardVsIcuIsolation_SaveConfigurationBtn;

	@FindBy(xpath="//*[contains(@value,'Show ICU Ward')]")
	WebElement MapWardVsIcuIsolation_ShowIcuWardBtn;

	@FindBy(xpath="//*[contains(@value,'Show Isolation Ward')]")
	WebElement MapWardVsIcuIsolation_ShowIsolationWardBtn;
	
	@FindBy(xpath="//*[contains(@onclick,'edit_icu')]")
	WebElement MapWardVsIcuIsolation_EditIcuWardBtn;
	
	@FindBy(xpath="//*[contains(@onclick,'edit_iso')]")
	WebElement MapWardVsIcuIsolation_EditIsolationWardBtn;
	
	
	
	//Constructor to initialize base class elements
	public ConfigurePointOfTreatmentPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	//Perform Actions
	
		//Validate: ConfigPointOfTrtment link isDisplayed
		public boolean ConfigPointOfTreatmentIsDisplayed(){
			WebElement link = ConfigPointOfTrtment;
			return link.isDisplayed();
		}
	
		//Validate: ConfigPointOfTrtment link isEnabled
				public boolean ConfigPointOfTreatmentIsEnabled(){
					WebElement link = ConfigPointOfTrtment;
					return link.isEnabled();
				}
	
				//Validate: ConfigPointOfTrtment link isClickable
				public void ConfigPointOfTreatmentIsClickable(){
				WebElement link = ConfigPointOfTrtment;
				link.click();
				}
				
				//Validate: ConfigPointOfTrtment_ManageUser link isDisplayed
				public boolean ConfigPointOfTrtment_ManageUserIsDisplayed(){
					WebElement link = ManageUserLink;
					return link.isDisplayed();
				}
			
				//Validate: ConfigPointOfTrtment_ManageUser link isEnabled
						public boolean ConfigPointOfTrtment_ManageUserIsEnabled(){
							WebElement link = ManageUserLink;
							return link.isEnabled();
						}
			
						//Validate: ConfigPointOfTrtment_ManageUser link isClickable
						public void ConfigPointOfTrtment_ManageUserIsClickable(){
						WebElement link = ManageUserLink;
						link.click();
						}
	
						//Validate:ManageUser_Initials dropdown is Displayed
						public boolean ManageUser_InitalsDrpdwnIsDisplayed(){
						WebElement drpdwn = ManageUser_InitalsDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate:ManageUser_Initials dropdown is Enabled
						public boolean ManageUser_InitalsDrpdwnIsEnabled(){
						WebElement drpdwn = ManageUser_InitalsDrpdwn;
						return drpdwn.isEnabled();
						}
						
						//Validate:ManageUser_Initials dropdown is Multiple
						public boolean ManageUser_InitalsDrpdwnIsMultiple() throws InterruptedException{
						Thread.sleep(3000);
						Select ListBox = new Select(ManageUser_InitalsDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}
	
						//Validate:ManageUser_First Name is Displayed
						public boolean ManageUser_FirstNameTxBoxIsDisplayed(){
						WebElement box = ManageUser_FirstNameTxbox;
						return box.isDisplayed();
						}
						
						//Validate:ManageUser_ First Name is Enabled
						public boolean ManageUser_FirstNameTxBoxIsEnabled(){
						WebElement box = ManageUser_FirstNameTxbox;
						return box.isEnabled();
						}
	
						//Validate:ManageUser_LastName txtbox is Displayed
						public boolean ManageUser_LastNameTxBoxIsDisplayed(){
						WebElement box = ManageUser_LastNameTxbox;
						return box.isDisplayed();
						}
						
						//Validate:ManageUser_ LastName txtbox is Enabled
						public boolean ManageUser_LastNameTxBoxIsEnabled(){
						WebElement box = ManageUser_LastNameTxbox;
						return box.isEnabled();
						}
						
						//Validate:ManageUser_ Designation dropdown is Displayed
						public boolean ManageUser_DesignatonDrpdwnIsDisplayed(){
						WebElement drpdwn = ManageUser_DesignationDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate:ManageUser_ Designation dropdown is Enabled
						public boolean ManageUser_DesignatonDrpdwnIsEnabled(){
						WebElement drpdwn = ManageUser_DesignationDrpdwn;
						return drpdwn.isEnabled();
						}
						
						//Validate:ManageUser_ Designation dropdown is Multiple
						public boolean ManageUser_DesignatonDrpdwnIsMultiple() throws InterruptedException{
						Thread.sleep(3000);
						Select ListBox = new Select(ManageUser_DesignationDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}
						
						//Validate:ManageUser_Mobile txtbox is Displayed
						public boolean ManageUser_MobileTxBoxIsDisplayed(){
						WebElement box = ManageUser_MobileTxBox;
						return box.isDisplayed();
						}
						
						//Validate:ManageUser_Mobile txtbox is Enabled
						public boolean ManageUser_MobileTxBoxIsEnabled(){
						WebElement box = ManageUser_MobileTxBox;
						return box.isEnabled();
						}
						
						//Validate:ManageUser_ Email txtbox is Displayed
						public boolean ManageUser_EmailTxBoxIsDisplayed(){
						WebElement box = ManageUser_EmailTxBox;
						return box.isDisplayed();
						}
						
						//Validate:ManageUser_ Email txtbox is Enabled
						public boolean ManageUser_EmailTxBoxIsEnabled(){
						WebElement box = ManageUser_EmailTxBox;
						return box.isEnabled();
						}
						
						//Validate:ManageUser_ Email txtbox is Displayed
						public boolean ManageUser_GenrateUsrNameBtnIsDisplayed(){
						WebElement box = ManageUser_GenrateUsrNameBtn;
						return box.isDisplayed();
						}
						
						//Validate:ManageUser_ ManageUser_GenrateUsrNameBtn is Enabled
						public boolean ManageUser_GenrateUsrNameBtnIsEnabled(){
						WebElement box = ManageUser_GenrateUsrNameBtn;
						return box.isEnabled();
						}
						
						//Validate:ManageUser_ ManageUser_GenrateUsrNameBtn is Enabled
						public void ManageUser_GenrateUsrNameBtnIsClickable() throws InterruptedException{
						WebElement box = ManageUser_GenrateUsrNameBtn;
						box.click();
						Thread.sleep(2000);
						}
						
						//Validate:ManageUser_ Valid Upto Btn is Displayed
						public boolean ManageUser_ValidUptoBtnIsDisplayed(){
						WebElement box = ManageUser_ValidUptoBtn;
						return box.isDisplayed();
						}
						
						//Validate:ManageUser_ Valid Upto Btn is Enabled
						public boolean ManageUser_ValidUptoBtnIsEnabled(){
						WebElement box = ManageUser_ValidUptoBtn;
						return box.isEnabled();
						}
						
						//Validate: ManageUser_Valid Upto Btn is Clickable
						public void ManageUser_ValidUptoBtnIsClickable() throws InterruptedException{
						WebElement box = ManageUser_ValidUptoBtn;
						box.click();
						Thread.sleep(2000);
						}
						
						//Validate: ManageUser_ Save Btn is Displayed
						public boolean ManageUser_SaveBtnIsDisplayed(){
						WebElement box = ManageUser_SaveBtn;
						return box.isDisplayed();
						}
						
						//Validate:ManageUser_ Save Btn is Enabled
						public boolean ManageUser_SaveBtnIsEnabled(){
						WebElement box = ManageUser_SaveBtn;
						return box.isEnabled();
						}
						
						//Validate:ManageUser_ Save Btn is Clickable
						public void ManageUser_SaveBtnIsClickable(){
						WebElement box = ManageUser_SaveBtn;
						box.click();
						}
						
						//Validate: ManageUser_ SelectInitial&ClickSaveBtn
						public void ManageUser_SelectInitialAndClickSaveBtn() throws InterruptedException{
						Select sel = new Select(ManageUser_InitalsDrpdwn);
						sel.selectByVisibleText("Dr.");
						ManageUser_SaveBtn.click();
						}
						
						//Validate: ManageUser_ SelectInitialFstName&ClickSaveBtn
						public void ManageUser_SelectInitialFstNameAndClickSaveBtn(String fn) throws InterruptedException{
						ManageUser_FirstNameTxbox.sendKeys(fn);
						Thread.sleep(2000);
						ManageUser_SaveBtn.click();
						Thread.sleep(2000);
						}
						
						//Validate: ManageUser_ SelectInitialFstLstName&ClickSaveBtn
						public void ManageUser_SelectInitialFstLstNameAndClickSaveBtn(String ln) throws InterruptedException{
						ManageUser_LastNameTxbox.sendKeys(ln);
						Thread.sleep(2000);
						ManageUser_SaveBtn.click();
						Thread.sleep(2000);
						}
						
						//Validate: ManageUser_SelectInitialFstLstNameDesigAndClickSaveBtn
						public void ManageUser_SelectInitialFstLstNameDesigAndClickSaveBtn() throws InterruptedException{
						Select sel = new Select(ManageUser_DesignationDrpdwn);
						sel.selectByVisibleText("Dental Doctor");
						Thread.sleep(2000);
						ManageUser_SaveBtn.click();
						Thread.sleep(2000);
						}
						
						//Validate: ManageUser_SelectInitialFstLstNameDesigMobAndClickSaveBtn
						public void ManageUser_SelectInitialFstLstNameDesigMobAndClickSaveBtn(String mn) throws InterruptedException{
						ManageUser_MobileTxBox.sendKeys(mn);
						Thread.sleep(2000);
						ManageUser_SaveBtn.click();
						Thread.sleep(2000);
						}
						
						//Validate: ManageUser_ SelectInitialFstLstName&ClickSaveBtn
						public void ManageUser_SelectInitialFstLstNameDesigMobGenUsrClickSaveBtn() throws InterruptedException{
						ManageUser_GenrateUsrNameBtn.click();
						Thread.sleep(4000);
						ManageUser_SaveBtn.click();
						Thread.sleep(2000);
						}
						
						//Validate: ManageUser_ Click on Today from Calender
						public void ManageUser_ClickTodayBtnFromCalndr() throws InterruptedException{
						ManageUser_TodayBtnCalender.click();
						Thread.sleep(2000);
						ManageUser_SaveBtn.click();
						Thread.sleep(2000);
						}
						
						//Validate: ManageUser_ Create User with Dr. Initial
						public void ManageUser_FillRequiredDetails(String Initials,String firstName,String lastName,String mobileNo) throws InterruptedException{
						Select sel1 = new Select(ManageUser_InitalsDrpdwn);
						sel1.selectByVisibleText(Initials);
						ManageUser_FirstNameTxbox.sendKeys(firstName);
						Thread.sleep(2000);
						ManageUser_LastNameTxbox.sendKeys(lastName);
						Thread.sleep(2000);
						Select sel = new Select(ManageUser_DesignationDrpdwn);
						sel.selectByVisibleText("Dental Doctor");
						Thread.sleep(2000);
						ManageUser_MobileTxBox.sendKeys(mobileNo);
						Thread.sleep(2000);
						}
						
						//Validate: ManageUser_ Generates UserName, Selects Date and CLick on Save Btn
						public void GenerateUserNameSelectDateAndClickSaveBtn() throws InterruptedException{
						ManageUser_GenrateUsrNameBtn.click();
						Thread.sleep(8000);
						ManageUser_ValidUptoBtn.click();
						ManageUser_TodayBtnCalender.click();
						Thread.sleep(2000);
						ManageUser_SaveBtn.click();
						Thread.sleep(5000);
						}
						
						//Validate: ManageUser_ Refresh Btn is Displayed
						public boolean RefreshBtnIsDisplayed(){
						WebElement btn = ManageUser_RefreshEmpListBtn;
						return btn.isDisplayed();
						}
						
						//Validate:ManageUser_ Refresh Btn is Enabled
						public boolean RefreshBtnIsEnabled(){
						WebElement btn = ManageUser_RefreshEmpListBtn;
						return btn.isEnabled();
						}
						
						//Validate: Click on Refresh Emp List Btn
						public void ClickRefreshBtn() throws InterruptedException{
						ManageUser_RefreshEmpListBtn.click();
						Thread.sleep(5000);
						}
						
						//Validate: ManageUser_ Edit Btn is Displayed
						public boolean EditBtnIsDisplayed(){
						WebElement btn = ManageUser_EditPencil;
						return btn.isDisplayed();
						}
						
						//Validate:ManageUser_ Edit Btn is Enabled
						public boolean EditBtnIsEnabled(){
						WebElement btn = ManageUser_EditPencil;
						return btn.isEnabled();
						}
						
						//Validate: Click on Edit Emp List Pencil
						public void clickEditBtn() throws InterruptedException{
						ManageUser_EditPencil.click();
						Thread.sleep(2000);
						}
						
						//Validate:ManageUser_Initials dropdown is Displayed
						public boolean ManageUser_DepartmentDrpdwnIsDisplayed(){
						WebElement drpdwn = ManageUser_DepartmentDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate:ManageUser_Initials dropdown is Enabled
						public boolean ManageUser_DepartmentDrpdwnIsEnabled(){
						WebElement drpdwn = ManageUser_DepartmentDrpdwn;
						return drpdwn.isEnabled();
						}
						
						//Validate:ManageUser_Initials dropdown is Multiple
						public boolean ManageUser_DepartmentDrpdwnIsMultiple() throws InterruptedException{
						Thread.sleep(3000);
						Select ListBox = new Select(ManageUser_DepartmentDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}
						
						//Validate: ManageUser_ Create User with Dr. Initial
						public void ManageUser_EditUser(String Email) throws InterruptedException{
						Select sel1 = new Select(ManageUser_DepartmentDrpdwn);
						sel1.selectByIndex(1);
						Thread.sleep(2000);
						ManageUser_EmailTxBox.clear();
						Thread.sleep(2000);
						ManageUser_EmailTxBox.sendKeys(Email);
						Thread.sleep(2000);
						ManageUser_SaveBtn.click();
						Thread.sleep(5000);
						}
						
						//Validate: Manage Department link isDisplayed
						public boolean manageDepartmentIsDisplayed(){
							WebElement link = ManageDepartmentLink;
							return link.isDisplayed();
						}
					
						//Validate: Manage Department link isEnabled
								public boolean manageDepartmentIsEnabled(){
									WebElement link = ManageDepartmentLink;
									return link.isEnabled();
								}
					
								//Validate: ManageDepartmentLink isClickable
								public void manageDepartmentIsClickable(){
								WebElement link = ManageDepartmentLink;
								link.click();
								}
								
								//Validate: Manage Department link isDisplayed
								public boolean ManageDepartment_AddNewDepartmentIsDisplayed(){
									WebElement link = ManageDepartment_AddNewDepartment;
									return link.isDisplayed();
								}
							
								//Validate: Manage Department link isEnabled
										public boolean ManageDepartment_AddNewDepartmentIsEnabled(){
											WebElement link = ManageDepartment_AddNewDepartment;
											return link.isEnabled();
										}
							
										//Validate: Manage Department link isClickable
										public void ManageDepartment_AddNewDepartmentIsClickable(){
										WebElement link = ManageDepartment_AddNewDepartment;
										link.click();
										}
										
						//Validate: Manage Department- AddNewDepartment_AddDepartment link isDisplayed
						public boolean AddNewDepartment_AddDepartmentIsDisplayed(){
						WebElement link = AddNewDepartment_AddDepartmentBtn;
						return link.isDisplayed();
					}
									
						//Validate: Manage Department- AddNewDepartment_AddDepartment link isEnabled
						public boolean AddNewDepartment_AddDepartmentIsEnabled(){
						WebElement link = AddNewDepartment_AddDepartmentBtn;
						return link.isEnabled();
					}
									
					//Validate:Manage Departmen - AddNewDepartment_AddDepartment link isClickable
					public void AddNewDepartment_AddDepartmentIsClickable(){
					//Clicking Add New Department without filling data
					WebElement link = AddNewDepartment_AddDepartmentBtn;
					link.click();
					}
										
					//Validate:Select Department dropdown is Displayed
					public boolean AddNewDepartment_DepartmentDrpdwnIsDisplayed(){
					WebElement drpdwn = AddNewDepartment_DepartmentDrpdwn;
					return drpdwn.isDisplayed();
					}
					
					//Validate:Select Department dropdown is Enabled
					public boolean AddNewDepartment_DepartmentDrpdwnIsEnabled(){
					WebElement drpdwn = AddNewDepartment_DepartmentDrpdwn;
					return drpdwn.isEnabled();
					}
					
					//Validate:Select Department dropdown is Multiple
					public boolean AddNewDepartment_DepartmentDrpdwnIsMultiple() throws InterruptedException{
					Thread.sleep(3000);
					Select ListBox = new Select(AddNewDepartment_DepartmentDrpdwn);
					boolean value = ListBox.isMultiple() ;
					return value;
					}
								
					//Validate: Select Existing Department from dropdown
					public void onlySelectExistingDept() throws InterruptedException{
					Select sel1 = new Select(AddNewDepartment_DepartmentDrpdwn);
					sel1.selectByIndex(1);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate: Description textbox is Displayed
					public boolean AddNewDepartment_DescriptionTxBoxIsDisplayed(){
					WebElement drpdwn = AddNewDepartment_DescriptionTxBox;
					return drpdwn.isDisplayed();
					}
					
					//Validate: Description textbox is Enabled
					public boolean AddNewDepartment_DescriptionTxBoxIsEnabled(){
					WebElement drpdwn = AddNewDepartment_DescriptionTxBox;
					return drpdwn.isEnabled();
					}
					
					//Validate: Entering invalid descrption
					public void enteringInvalidDescription(String invalidDes) throws InterruptedException{
					AddNewDepartment_DescriptionTxBox.sendKeys(invalidDes);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate: Entering valid descrption
					public void enteringValidDescription(String validDes) throws InterruptedException{
					AddNewDepartment_DescriptionTxBox.clear();
					Thread.sleep(2000);
					AddNewDepartment_DescriptionTxBox.sendKeys(validDes);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate: Manage Department- AddNewDepartment_Number of units textbox isDisplayed
					public boolean AddNewDepartment_NoOfUnitsTxBoxIsDisplayed(){
					WebElement link = AddNewDepartment_NoOfUnitsTxBox;
					return link.isDisplayed();
				}
								
					//Validate: Manage Department- AddNewDepartment_Number of units textbox is Enabled
					public boolean AddNewDepartment_NoOfUnitsTxBoxIsEnabled(){
					WebElement link = AddNewDepartment_NoOfUnitsTxBox;
					return link.isEnabled();
				}					
					
					//Validate: Entering Number of Units
					public void enteringNoOfUnits(String unit) throws InterruptedException{
					AddNewDepartment_NoOfUnitsTxBox.sendKeys(unit);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}	
				
					//Validate: Prints validation msg:Filled existing dept, description and Units 
					public WebElement printValidationMsg(){
					WebElement msg = printValMsgOnlyDeptDesUnitFilled;
					return msg;
					} 
					
					//Validate: Select Existing Department from dropdown
					public void selectOtherDepartment() throws InterruptedException{
					ManageDepartment_AddNewDepartment.click();
					Thread.sleep(2000);
					Select sel1 = new Select(AddNewDepartment_DepartmentDrpdwn);
					sel1.selectByVisibleText("Others");
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}	
					
					//Validate: Entering invalid descrption, while selecting Others department
					public void enteringInvalidDeptDescription(String invalidDes) throws InterruptedException{
					AddNewDepartment_DescriptionTxBox.sendKeys(invalidDes);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate: Entering valid descrption, while selecting Others department
					public void enteringValidDeptDescription(String validDes) throws InterruptedException{
					AddNewDepartment_DescriptionTxBox.clear();
					Thread.sleep(2000);
					AddNewDepartment_DescriptionTxBox.sendKeys(validDes);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate: Entering Number of Units, while selecting Others department
					public void enteringNoOfUnitsCrestingOtherDept(String unit) throws InterruptedException{
					AddNewDepartment_NoOfUnitsTxBox.sendKeys(unit);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}	
					
					//Validate: Enter Department Name TextBox isDisplayed
					public boolean AddNewDepartment_DeptNameTxBoxIsDisplayed(){
					WebElement link = AddNewDepartment_DeptNameTxBox;
					return link.isDisplayed();
					}
				
					//Validate: Enter Department Name TextBox isEnabled
					public boolean AddNewDepartment_DeptNameTxBoxIsEnabled(){
					WebElement link = AddNewDepartment_DeptNameTxBox;
					return link.isEnabled();
					}
					
					//Validate: Entering Invalid Department Name, while selecting Others department
					public void enteringInvalidDeptName(String invalidDept) throws InterruptedException{
					AddNewDepartment_DeptNameTxBox.sendKeys(invalidDept);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}

	//Validate: Entering Valid Department Name, while selecting Others department & create new Dept successfully
					public void enteringValidDeptName(String validDept) throws InterruptedException{
					AddNewDepartment_DeptNameTxBox.clear();
					Thread.sleep(2000);
					AddNewDepartment_DeptNameTxBox.sendKeys(validDept);
					Thread.sleep(4000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate: Prints validation msg:Department successfully added 
					public WebElement printValMsgDeptAdded(){
					WebElement msg = printValMsgOnlyDeptDesUnitFilled;
					return msg;
					} 
					
					//Validate:Add Duplicate Dept  
					public void addValidDuplicateDept(String validDesc, String unit) throws InterruptedException{
					ManageDepartment_AddNewDepartment.click();
					Thread.sleep(2000);
					Select sel1 = new Select(AddNewDepartment_DepartmentDrpdwn);
					sel1.selectByVisibleText("Anaesthesiology");
					Thread.sleep(2000);
					AddNewDepartment_DescriptionTxBox.sendKeys(validDesc);
					Thread.sleep(2000);
					AddNewDepartment_NoOfUnitsTxBox.sendKeys(unit);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate: Gender Specific Checkbox isDisplayed
					public boolean genderSpecificCheckboxIsDisplayed(){
					WebElement chkbox = AddNewDepartment_GenderSpecificChkbox;
					return chkbox.isDisplayed();
					}
					
					//Validate: Select Gender dropdown is Displayed
					public boolean genderSepcific_SelectGenderDrpdwnIsDisplayed(){
					WebElement drpdwn = AddNewDepartment_SelectGenderDrpdwn;
					return drpdwn.isDisplayed();
					}
					
					//Validate:Select Gender dropdown is Enabled
					public boolean genderSepcific_SelectGenderDrpdwnIsEnabled(){
					WebElement drpdwn = AddNewDepartment_SelectGenderDrpdwn;
					return drpdwn.isEnabled();
					}
					
					//Validate:Select Gender dropdown is Multiple
					public boolean genderSepcific_SelectGenderDrpdwnIsMultiple() throws InterruptedException{
					Select ListBox = new Select(AddNewDepartment_SelectGenderDrpdwn);
					boolean value = ListBox.isMultiple() ;
					return value;
					}
					
					//Validate:Add new Department while selecting NOT IN LIST 
					public void createDeptWithAllDetailsInOneGo(String validDeptName, String validDesc, String unit) throws InterruptedException{
					Thread.sleep(2000);
					ManageDepartment_AddNewDepartment.click();
					Thread.sleep(2000);
					Select sel1 = new Select(AddNewDepartment_DepartmentDrpdwn);
					sel1.selectByVisibleText("Others");
					Thread.sleep(2000);
					AddNewDepartment_DeptNameTxBox.sendKeys(validDeptName);
					Thread.sleep(2000);
					AddNewDepartment_DescriptionTxBox.sendKeys(validDesc);
					Thread.sleep(2000);
					AddNewDepartment_NoOfUnitsTxBox.sendKeys(unit);
					Thread.sleep(2000);
					AddNewDepartment_GenderSpecificChkbox.click();
					Thread.sleep(2000);
					Select gender = new Select(AddNewDepartment_SelectGenderDrpdwn);
					gender.selectByVisibleText("FEMALE");
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}

					//Validate:Gender Specific Checkbox isSelected
					public boolean genderSpecificCheckboxIsSelected(){
					WebElement chkbox = AddNewDepartment_GenderSpecificChkbox;	
					return chkbox.isSelected();
					}
					
					//Validate:Manage Department_EditBtn isDisplayed
					public boolean manageDept_EditBtnIsDisplayed(){
					WebElement link = ManageDept_EditBtn;
					return link.isDisplayed();
					}
				
					//Validate:Manage Department_EditBtn isEnabled
					public boolean manageDept_EditBtnIsEnabled(){
					WebElement link = ManageDept_EditBtn;
					return link.isEnabled();
					}
					
					//Validate:Manage Department_EditBtn isClkickable
					public void manageDept_EditBtnIsClkickable(){
					WebElement link = ManageDept_EditBtn;
					link.click();
					}
					
					//Validate:Edit Department with all fields blank click on Save Button to edit
					public void editDeptAllFieldsBlankClickSaveBtn() throws InterruptedException{
					AddNewDepartment_DescriptionTxBox.clear();
					Thread.sleep(2000);
					AddNewDepartment_NoOfUnitsTxBox.clear();
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
										
					//Validate:Enter invalid description & click on Save Button to edit
					public void enterInvalidDescriptonOnly(String invalidDescription) throws InterruptedException{
					AddNewDepartment_DescriptionTxBox.clear();
					Thread.sleep(2000);
					AddNewDepartment_NoOfUnitsTxBox.clear();
					Thread.sleep(2000);
					AddNewDepartment_DescriptionTxBox.sendKeys(invalidDescription);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate:Enter valid description & click on Save Button to edit
					public void enterValidDescriptonOnly(String validDescription) throws InterruptedException{
					AddNewDepartment_DescriptionTxBox.clear();
					Thread.sleep(2000);
					AddNewDepartment_NoOfUnitsTxBox.clear();
					Thread.sleep(2000);
					AddNewDepartment_DescriptionTxBox.sendKeys(validDescription);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate:Enter valid description & units & click on Save Button to edit
					public void enterValidDescriptonAndUnitOnly(String validDescription, String unit) throws InterruptedException{
					AddNewDepartment_NoOfUnitsTxBox.sendKeys(unit);
					Thread.sleep(2000);
					AddNewDepartment_AddDepartmentBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate: Prints validation msg:Department successfully Updated 
					public WebElement printValMsgDeptUpdated(){
					WebElement msg = printValMsgOnlyDeptDesUnitFilled;
					return msg;
					} 
					
					//Validate: Edit Department with Valid data
					public void editDeptWithValidDataInOneGO(String validDesc, String unit, String age) throws InterruptedException{
					Thread.sleep(2000);
					ManageDept_EditBtn.click();
					Thread.sleep(2000);
					Select sel1 = new Select(AddNewDepartment_DepartmentDrpdwn);
					sel1.selectByVisibleText("Anaesthesiology");
					Thread.sleep(2000);
					AddNewDepartment_DescriptionTxBox.clear();
					Thread.sleep(2000);
					AddNewDepartment_DescriptionTxBox.sendKeys(validDesc);
					Thread.sleep(2000);
					AddNewDepartment_NoOfUnitsTxBox.sendKeys(unit);
					Thread.sleep(2000);
					AddNewDepartment_GenderSpecificChkbox.click();
					Thread.sleep(2000);
					Select gender = new Select(AddNewDepartment_SelectGenderDrpdwn);
					gender.selectByVisibleText("FEMALE");
					Thread.sleep(2000);
					AddNewDepartment_MedDeptChkbox.click();
					Thread.sleep(2000);
					AddNewDepartment_IPDDeptChkbox.click();
					Thread.sleep(2000);
					AddNewDepartment_LabDeptChkbox.click();
					Thread.sleep(2000);
					AddNewDepartment_OperatonDeptChkbox.click();
					Thread.sleep(2000);
					AddNewDepartment_OutsideInvestigatonDeptChkbox.click();
					Thread.sleep(2000);
					AddNewDepartment_ClinicalChkbox.click();
					Thread.sleep(2000);
				//	AddNewDepartment_PediatricChkbbox.click();
					Thread.sleep(2000);
				//	AddNewDepartment_AddDepartmentBtn.click();
					}	
					
					//Validate: Medical Dept Checkbox Is Displayed
					public boolean medicalDeptChkboxIsDisplayed(){
					WebElement chkbox = AddNewDepartment_MedDeptChkbox;
					return chkbox.isDisplayed();
					}
					
					//Validate: IPD Dept Checkbox IsDisplayed
					public boolean ipdDeptChkboxIsDisplayed (){
					WebElement chkbox = AddNewDepartment_IPDDeptChkbox;
					return chkbox.isDisplayed();
					}
					
					//Validate: Lab Dept Checkbox IsDisplayed
					public boolean labDeptChkboxIsDisplayed (){
					WebElement chkbox = AddNewDepartment_LabDeptChkbox;
					return chkbox.isDisplayed();
					}
					
					//Validate: Operation Dept Checkbox IsDisplayed
					public boolean operationDeptChkboxIsDisplayed(){
					WebElement chkbox = AddNewDepartment_OperatonDeptChkbox;
					return chkbox.isDisplayed();
					}
					
					//Validate: Outside Investigation Dept Checkbox IsDisplayed
					public boolean outsideInvesDeptChkboxIsDisplayed (){
					WebElement chkbox = AddNewDepartment_OutsideInvestigatonDeptChkbox;
					return chkbox.isDisplayed();
					}
					
					//Validate: Clinical Dept Checkbox IsDisplayed
					public boolean  clinicalChkboxIsDisplayed(){
					WebElement chkbox = AddNewDepartment_ClinicalChkbox;
					return chkbox.isDisplayed();
					}
					
					//Validate: Pediatric Dept Checkbox IsDisplayed
					public boolean pediatericChkboxIsDisplayed(){
					WebElement chkbox = AddNewDepartment_PediatricChkbbox;
					return chkbox.isDisplayed();
					}
					
					//Validate:Manage Units Link isDisplayed
					public boolean manageUnitsLinkisDisplayed(){
					WebElement link = ManageUnitsLink;
					return link.isDisplayed();
					}
				
					//Validate:Manage Units Link isEnabled
					public boolean manageUnitsLinkisEnabled(){
					WebElement link = ManageUnitsLink;
					return link.isEnabled();
					}
					
					//Validate:Manage Units Link isClkickable
					public void manageUnitsLinkisClkickable(){
					WebElement link = ManageUnitsLink;
					link.click();
					}

					//Validate: Manage Unit_New Unit link isDisplayed
					public boolean addNewUnitIsDisplayed(){
						WebElement link = ManageUnit_AddNewUnit;
						return link.isDisplayed();
					}
				
					//Validate: Manage Unit_New Unit link isEnabled
							public boolean addNewUnitIsEnabled(){
								WebElement link = ManageUnit_AddNewUnit;
								return link.isEnabled();
							}
				
							//Validate: Manage Unit_New Unit Link isClickable
							public void addNewUnitIsDisplayedIsClickable(){
							WebElement link = ManageUnit_AddNewUnit;
							link.click();
							}

							//Validate: Add New Unit Btn IsDisplayed 
							public boolean addNewUnit_SaveBtnIsDisplayed() throws InterruptedException{
							WebElement btn = AdddNewUnit_AddUnitBtn;
							return btn.isDisplayed();
							}
							
							//Validate: Add New Unit Btn IsDisplayed 
							public boolean addNewUnit_SaveBtnIsEnabled(){
							WebElement drpdwn = AdddNewUnit_AddUnitBtn;
							return drpdwn.isEnabled();
							}

							//Validate: Manage Unit_New Unit Link isClickable
							public void addNewUnit_SaveBtnIsClickable(){
							WebElement link = AdddNewUnit_AddUnitBtn;
							link.click();
							}

							//Validate:ManageUser_Initials dropdown is Enabled
							public boolean addNewUnit_DeptNameDrpdwnIsDisplayed(){
							WebElement drpdwn = AdddNewUnit_DeptNameDrpdwn;
							return drpdwn.isEnabled();
							}
							
							//Validate:ManageUser_Initials dropdown is Multiple
							public boolean addNewUnit_DeptNameDrpdwnIsMultiple() throws InterruptedException{
							Thread.sleep(3000);
							Select ListBox = new Select(AdddNewUnit_DeptNameDrpdwn);
							boolean value = ListBox.isMultiple() ;
							return value;
							}
						
							//Validate: select Department only & click Add Unit btn
							public void selectDeptAndClickSaveBtn() throws InterruptedException{
							Select sel1 = new Select(AdddNewUnit_DeptNameDrpdwn);
							sel1.selectByVisibleText("Anaesthesiology");
							Thread.sleep(2000);
							AdddNewUnit_AddUnitBtn.click();
							}
							
							//Validate: ManageUnits_ Add Unit Name Txtbox is Displayed
							public boolean addNewUnit_UnitNameTxBoxIsDisplayed(){
							WebElement txtbox = AdddNewUnit_UnitNameTxBox;
							return txtbox.isDisplayed();
							}
							
							//Validate: ManageUnits_ Add Unit Name Txtbox is Enabled
							public boolean addNewUnit_UnitNameTxBoxIsEnabled(){
							WebElement txtbox = AdddNewUnit_UnitNameTxBox;
							return txtbox.isEnabled();
							}
							
							//Validate: select Department & input invalid Unit name & click Add Unit btn
							public void enterDeptInvalidUnitNameAndClickSaveBtn(String invalidUnit) throws InterruptedException{
							Thread.sleep(2000);
							AdddNewUnit_UnitNameTxBox.sendKeys(invalidUnit);
							Thread.sleep(2000);
							AdddNewUnit_AddUnitBtn.click();
							}
							
							//Validate: select Department & input Valid Unit name & click Add Unit btn
							public void enterDeptValidUnitNameAndClickSaveBtn(String validUnit) throws InterruptedException{
							Thread.sleep(2000);
							AdddNewUnit_UnitNameTxBox.clear();
							Thread.sleep(2000);
							AdddNewUnit_UnitNameTxBox.sendKeys(validUnit);
							Thread.sleep(2000);
							AdddNewUnit_AddUnitBtn.click();
							}
							
							//Validate: select UnitInCharge & click Add Unit btn
							public void selectDeptUnitNameInChargeAndDay() throws InterruptedException{
							Select sel1 = new Select(AdddNewUnit_UnitInChargeDrpdwn);
							sel1.selectByIndex(1);
							Thread.sleep(2000);
							Select sel = new Select(AdddNewUnit_SundayDrpdwn);
							sel.selectByIndex(1);
							Thread.sleep(2000);
							AdddNewUnit_AddUnitBtn.click();
							}
							
							//Validate: Prints validation msg: Unit successfully added 
							public WebElement printValMsgUnitAdded(){
							WebElement msg = AdddNewUnit_PrintValMsgUnitAdded;
							return msg;
							} 
								
								//Validate: Add Unit in one go with valid data
 public void addValidUnitInOneGo(String validUnit) throws InterruptedException{
		
	 /*driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(ManageUnit_AddNewUnit));
	 					*/		
								driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
								ManageUnit_AddNewUnit.click();
								Thread.sleep(2000);
								Select sel1 = new Select(AdddNewUnit_DeptNameDrpdwn);
								sel1.selectByVisibleText("Anatomy");
								Thread.sleep(2000);
								AdddNewUnit_UnitNameTxBox.sendKeys(validUnit);
								Thread.sleep(2000);
								Select sel = new Select(AdddNewUnit_UnitInChargeDrpdwn);
								sel.selectByIndex(1);
								Thread.sleep(2000);
								Select sun = new Select(AdddNewUnit_SundayDrpdwn);
								sun.selectByIndex(1);
								Thread.sleep(2000);
								Select mon = new Select(AdddNewUnit_MondayDrpdwn);
								mon.selectByIndex(1);
								Thread.sleep(2000);
								Select tue = new Select(AdddNewUnit_TuesdayDrpdwn);
								tue.selectByIndex(1);
								Thread.sleep(2000);
								Select wed = new Select(AdddNewUnit_WednesdayDrpdwn);
								wed.selectByIndex(1);
								Thread.sleep(2000);
								Select thur = new Select(AdddNewUnit_ThursdayDrpdwn);
								thur.selectByIndex(1);
								Thread.sleep(2000);
								Select fri = new Select(AdddNewUnit_FridayDrpdwn);
								fri.selectByIndex(1);
								Thread.sleep(2000);
								Select sat = new Select(AdddNewUnit_SaturdayDrpdwn);
								sat.selectByIndex(1);
								Thread.sleep(2000);
								AdddNewUnit_AddUnitBtn.click();
								Thread.sleep(3000);
								}
 
//Validate: Manage Units_Edit Unit Btn IsDisplayed 
	public boolean manageUnit_EditBtnIsDisplayed() throws InterruptedException{
	WebElement btn = manageUnit_EditBtn;
	return btn.isDisplayed();
	}
	
	//Validate: Manage Units_Edit Unit Btn IsDisplayed 
	public boolean manageUnit_EditBtnIsEnabled(){
	WebElement drpdwn = manageUnit_EditBtn;
	return drpdwn.isEnabled();
	}

	//Validate: Manage Units_Edit Unit Link isClickable
	public void manageUnit_EditBtnIsClickable(){
	WebElement link = manageUnit_EditBtn;
	link.click();
	}
							
	//Validate: Manage Units_Edit/Update Unit Btn IsDisplayed 
		public boolean manageUnit_EditUnitBtnIsDisplayed() throws InterruptedException{
		WebElement btn = EditUnit_EditUnitBtn;
		return btn.isDisplayed();
		}
		
		//Validate: Manage Units_Edit/Update Unit Btn IsEnabled
		public boolean manageUnit_EditUnitBtnIsEnabled(){
		WebElement drpdwn = EditUnit_EditUnitBtn;
		return drpdwn.isEnabled();
		}

		//Validate: Manage Units_Edit/Update Unit Link isClickable
		public void manageUnit_EditUnitBtnIsClickable(){
		WebElement link = EditUnit_EditUnitBtn;
		link.click();
		}
		
	//Validate: Edit Unit with Invalid Unit Name
	public void editUnitEnterInvalidUnitName(String invalidUnit) throws InterruptedException{
	Thread.sleep(2000);
	manageUnit_EditBtn.click();
	Thread.sleep(2000);
	AdddNewUnit_UnitNameTxBox.clear();
	Thread.sleep(2000);
	AdddNewUnit_UnitNameTxBox.sendKeys(invalidUnit);
	Thread.sleep(2000);
	Select sun = new Select(AdddNewUnit_SundayDrpdwn);
	sun.selectByIndex(1);
	Thread.sleep(2000);
	EditUnit_EditUnitBtn.click();
	Thread.sleep(3000);
	}

//Validate: select Department & input Valid Unit name & click Add Unit btn
public void editUnitEnterValidUnitName(String validUnit) throws InterruptedException{
Thread.sleep(2000);
AdddNewUnit_UnitNameTxBox.clear();
Thread.sleep(2000);
AdddNewUnit_UnitNameTxBox.sendKeys(validUnit);
Thread.sleep(2000);
Select tue = new Select(AdddNewUnit_TuesdayDrpdwn);
tue.selectByIndex(1);
Thread.sleep(2000);
Select wed = new Select(AdddNewUnit_WednesdayDrpdwn);
wed.selectByIndex(1);
Thread.sleep(2000);
EditUnit_EditUnitBtn.click();
Thread.sleep(2000);
}	
	
//Validate: Add Unit in one go with valid data
public void editValidUnitInOneGo(String validUnit) throws InterruptedException{
Thread.sleep(2000);
//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

//WebDriverWait wc = new WebDriverWait(driver,4);
//wc.until(ExpectedConditions.visibilityOf(Add_EditWardLink));

//wc.until(ExpectedConditions.presenceOfElementLocated())''

//WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(ManageUnit_AddNewUnit));
manageUnit_EditBtn.click();
Thread.sleep(2000);
//	Select sel1 = new Select(AdddNewUnit_DeptNameDrpdwn);
//	sel1.selectByVisibleText("Anatomy");
//	Thread.sleep(2000);
AdddNewUnit_UnitNameTxBox.clear();
Thread.sleep(2000);
AdddNewUnit_UnitNameTxBox.sendKeys(validUnit);
Thread.sleep(2000);
Select sel = new Select(AdddNewUnit_UnitInChargeDrpdwn);
sel.selectByIndex(0);
Thread.sleep(2000);
Select sun = new Select(AdddNewUnit_SundayDrpdwn);
sun.selectByIndex(1);
Thread.sleep(2000);
Select mon = new Select(AdddNewUnit_MondayDrpdwn);
mon.selectByIndex(1);
Thread.sleep(2000);
Select tue = new Select(AdddNewUnit_TuesdayDrpdwn);
tue.selectByIndex(1);
Thread.sleep(2000);
Select wed = new Select(AdddNewUnit_WednesdayDrpdwn);
wed.selectByIndex(1);
Thread.sleep(2000);
Select thur = new Select(AdddNewUnit_ThursdayDrpdwn);
thur.selectByIndex(1);
Thread.sleep(2000);
Select fri = new Select(AdddNewUnit_FridayDrpdwn);
fri.selectByIndex(1);
Thread.sleep(2000);
Select sat = new Select(AdddNewUnit_SaturdayDrpdwn);
sat.selectByIndex(1);
Thread.sleep(2000);
EditUnit_EditUnitBtn.click();
Thread.sleep(3000);
}	
	
//Validate: Manage Shifts Link IsDisplayed 
		public boolean manageShiftsLinkIsDisplayed() throws InterruptedException{
		WebElement btn = ManageShiftsLink;
		return btn.isDisplayed();
		}
		
		//Validate:Manage Shifts Link IsEnabled 
		public boolean manageShiftsLinkIsEnabled(){
		WebElement drpdwn = ManageShiftsLink;
		return drpdwn.isEnabled();
		}

		//Validate: Manage Shifts Link isClickable
		public void manageShiftsLinkIsClickable() throws InterruptedException{
		ManageShiftsLink.click();
		Thread.sleep(3000);
		}
		
		//Validate: Manage Shifts_Shift Name Txtbox IsDisplayed 
				public boolean shiftNameTxtboxIsDisplayed() throws InterruptedException{
				WebElement btn = ShiftNameTxtbox;
				return btn.isDisplayed();
				}
				
				//Validate:Manage Shifts_Shift Name Txtbox IsEnabled 
				public boolean shiftNameTxtboxIsEnabled(){
				WebElement drpdwn = ShiftNameTxtbox;
				return drpdwn.isEnabled();
				}
	
				
				//Validate: Manage Shifts_ Shift Timings from Txtbox IsDisplayed 
						public boolean shiftTmingsFromTxtboxIsDisplayed() throws InterruptedException{
						WebElement btn = shiftTmingsFromTxtbox;
						return btn.isDisplayed();
						}
						
						//Validate:Manage Shifts_ Shift Timings from Txtbox IsEnabled 
						public boolean shiftTmingsFromTxtboxIsEnabled(){
						WebElement drpdwn = shiftTmingsFromTxtbox;
						return drpdwn.isEnabled();
						}
				
						//Validate: Manage Shifts_ Shift Timings To Txtbox IsDisplayed 
						public boolean shiftTmingsToTxtboxIsDisplayed() throws InterruptedException{
						WebElement btn = shiftTmingsToTxtbox;
						return btn.isDisplayed();
						}
						
						//Validate:Manage Shifts_ Shift Timings To Txtbox IsEnabled 
						public boolean shiftTmingsToTxtboxIsEnabled(){
						WebElement drpdwn = shiftTmingsToTxtbox;
						return drpdwn.isEnabled();
						}	
	

						//Validate: ManageShits_Select Shift Type dropdown is Displayed
						public boolean selectShiftTypeDrpdwnIsDisplayed(){
						WebElement drpdwn = ShiftTypeDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: ManageShits_Select Shift Type dropdown is Enabled
						public boolean selectShiftTypeDrpdwnIsEnabled(){
						WebElement drpdwn = ShiftTypeDrpdwn;
						return drpdwn.isEnabled();
						}
						
						//Validate: ManageShits_Select Shift Type dropdown is Multiple
						public boolean selectShiftTypeDrpdwnIsMultiple() throws InterruptedException{
						Thread.sleep(3000);
						Select ListBox = new Select(ShiftTypeDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}
							
						//Validate: Manage Shifts_Save Btn IsDisplayed 
						public boolean shiftsSaveBtnIsDisplayed() throws InterruptedException{
						WebElement btn = ManageShifts_SaveBtn;
						return btn.isDisplayed();
						}
						
						//Validate: Manage Shifts_Save Btn IsEnabled 
						public boolean shiftsSaveBtnIsEnabled(){
						WebElement drpdwn = ManageShifts_SaveBtn;
						return drpdwn.isEnabled();
						}

						//Validate: Manage Shifts_Save Btn isClickable
						public void shiftsSaveBtnIsClickable(){
						WebElement link = ManageShifts_SaveBtn;
						link.click();
						}
						
						//Validate: Manage Shifts_ Edit Btn IsDisplayed 
						public boolean shiftsEditBtnIsDisplayed() throws InterruptedException{
						WebElement btn = ManageShifts_EditBtn;
						return btn.isDisplayed();
						}
						
						//Validate: Manage Shifts_ Edit  Btn IsEnabled 
						public boolean shiftsEditBtnIsEnabled(){
						WebElement drpdwn = ManageShifts_EditBtn;
						return drpdwn.isEnabled();
						}

						//Validate: Manage Shifts_ Edit Btn isClickable
						public void shiftsEditeBtnIsClickable(){
						WebElement link = ManageShifts_EditBtn;
						link.click();
						}		
						
						//Validate: Prints validation msg:Department successfully Updated 
						public WebElement printValMsgShiftsUpdated(){
						WebElement msg = ManageShifts_PrintValidationmsg;
						return msg;
						} 
						
						//Validate: Manage Shifts_Update Btn IsDisplayed 
						public boolean shiftsUpdateBtnIsDisplayed() throws InterruptedException{
						WebElement btn = ManageShifts_UpdateBtn;
						return btn.isDisplayed();
						}
						
						//Validate: Manage Shifts_Update  Btn IsEnabled 
						public boolean shiftsUpdateBtnIsEnabled(){
						WebElement drpdwn = ManageShifts_UpdateBtn;
						return drpdwn.isEnabled();
						}

						//Validate: Manage Shifts_ Update Btn isClickable
						public void shiftsUpdateBtnIsClickable(){
						WebElement link = ManageShifts_UpdateBtn;
						link.click();
						}							
						
						//Validate: Manage Shifts_ All fields blank and click save btn
						public void manageShifts_AllFieldsBlank() throws InterruptedException{
						Thread.sleep(2000);	
						ManageShifts_SaveBtn.click();	
						Thread.sleep(2000);		
						}
						
						//Validate: Manage Shifts_ enter Invalid Shift name and click save btn
						public void enterInvalidShiftDetailsInAllFields(String invalidShift, String invalidTimeFrom, String invalidTimeTo) throws InterruptedException{
						ShiftNameTxtbox.sendKeys(invalidShift);
						Thread.sleep(2000);	
						shiftTmingsFromTxtbox.sendKeys(invalidTimeFrom);
						Thread.sleep(2000);	
						shiftTmingsToTxtbox.sendKeys(invalidTimeTo);
						Thread.sleep(2000);	
						ManageShifts_SaveBtn.click();	
						Thread.sleep(2000);		
						}	
						
						//Validate: Manage Shifts_ enter Valid Shift name and enter Invalid Timings and blank drpdwn
						public void enterValidShiftNameInvalidTimingAndBlankShiftTypeDrpdwn(String validShift) throws InterruptedException{
						Thread.sleep(2000);	
						ShiftNameTxtbox.clear();
						Thread.sleep(2000);	
						ShiftNameTxtbox.sendKeys(validShift);
						Thread.sleep(2000);	
						ManageShifts_SaveBtn.click();	
						Thread.sleep(2000);		
						}	
							
						//Validate: Manage Shifts_ enter Valid Shift name and enter Invalid Timings and drpdwn selects value
						public void enterValidShiftNameInvalidTimingSelectShiftTypeDrpdwn() throws InterruptedException{
						Thread.sleep(2000);	
						Select fri = new Select(ShiftTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(2000);	
						ManageShifts_SaveBtn.click();	
						Thread.sleep(2000);		
						}	
						
						//Validate: Manage Shifts_ enter Valid Shift name and enter Invalid Timings and drpdwn selects value
						public void validShiftNameAndFromTimeInvalidToTimeDrpdwnSelected(String validTimeFrom) throws InterruptedException{
						Thread.sleep(2000);	
						shiftTmingsFromTxtbox.clear();
						Thread.sleep(2000);	
						shiftTmingsFromTxtbox.sendKeys(validTimeFrom);
						Select fri = new Select(ShiftTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(2000);	
						ManageShifts_SaveBtn.click();	
						Thread.sleep(2000);		
						}						
						
						//Validate: Manage Shifts_ enter Valid Shift name and enter Invalid Timings and drpdwn selects value
						public void validShiftNameTimingShiftTypeSelectedClickSaveBtn(String validTimeTo) throws InterruptedException{
						Thread.sleep(2000);	
						shiftTmingsToTxtbox.clear();
						Thread.sleep(2000);
						shiftTmingsToTxtbox.sendKeys(validTimeTo);
						Thread.sleep(2000);	
						ManageShifts_SaveBtn.click();	
						Thread.sleep(2000);		
						}						
							
						//Validate: Create shift in one go
						public void createShiftInOneGo(String validShift, String validTimeFrom, String validTimeTo) throws InterruptedException{
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						
						ShiftNameTxtbox.sendKeys(validShift);
						Thread.sleep(5000);	
						shiftTmingsFromTxtbox.sendKeys(validTimeFrom);
						Thread.sleep(5000);	
						shiftTmingsToTxtbox.sendKeys(validTimeTo);
						Thread.sleep(5000);	
						Select fri = new Select(ShiftTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(3000);	
						ManageShifts_SaveBtn.click();	
						Thread.sleep(2000);		
						}	
						
					//----------------------------------------	
						
						//Validate: Edit Shifts_ All fields blank and click save btn
						public void editShifts_AllFieldsBlank() throws InterruptedException{
						Thread.sleep(2000);	
						ManageShifts_EditBtn.click();
						Thread.sleep(2000);
						ShiftNameTxtbox.clear();
						Thread.sleep(2000);	
						shiftTmingsFromTxtbox.clear();
						Thread.sleep(2000);	
						shiftTmingsToTxtbox.clear();
						Thread.sleep(2000);	
						Select fri = new Select(ShiftTypeDrpdwn);
						fri.selectByIndex(0);
						Thread.sleep(2000);	
						ManageShifts_UpdateBtn.click();	
						Thread.sleep(2000);		
						}
						
						//Validate: Edit Shifts_ enter Invalid Shift name and click save btn
						public void edit_EnterInvalidShiftDetailsInAllFields(String invalidShift, String invalidTimeFrom, String invalidTimeTo) throws InterruptedException{
						ShiftNameTxtbox.sendKeys(invalidShift);
						Thread.sleep(2000);	
						shiftTmingsFromTxtbox.sendKeys(invalidTimeFrom);
						Thread.sleep(2000);	
						shiftTmingsToTxtbox.sendKeys(invalidTimeTo);
						Thread.sleep(2000);	
						ManageShifts_UpdateBtn.click();	
						Thread.sleep(2000);		
						}	
						
						//Validate: Edit Shifts_ enter Valid Shift name and enter Invalid Timings and blank drpdwn
						public void edit_EnterValidShiftNameInvalidTimingAndBlankShiftTypeDrpdwn(String validShift) throws InterruptedException{
						Thread.sleep(2000);	
						ShiftNameTxtbox.clear();
						Thread.sleep(2000);	
						ShiftNameTxtbox.sendKeys(validShift);
						Thread.sleep(2000);	
						ManageShifts_UpdateBtn.click();	
						Thread.sleep(2000);		
						}	
							
						//Validate: Edit Shifts_ enter Valid Shift name and enter Invalid Timings and drpdwn selects value
						public void edit_EnterValidShiftNameInvalidTimingSelectShiftTypeDrpdwn() throws InterruptedException{
						Thread.sleep(2000);	
						Select fri = new Select(ShiftTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(2000);	
						ManageShifts_UpdateBtn.click();	
						Thread.sleep(2000);		
						}	
						
						//Validate: Edit Shifts_ enter Valid Shift name and enter Invalid Timings and drpdwn selects value
						public void edit_ValidShiftNameAndFromTimeInvalidToTimeDrpdwnSelected(String validTimeFrom, String invalidTimeTo) throws InterruptedException{
						Thread.sleep(2000);
						ManageShifts_EditBtn.click();
						Thread.sleep(2000);	
						shiftTmingsFromTxtbox.clear();
						Thread.sleep(2000);	
						shiftTmingsFromTxtbox.sendKeys(validTimeFrom);
						Thread.sleep(2000);
						shiftTmingsToTxtbox.clear();
						Thread.sleep(2000);	
						shiftTmingsToTxtbox.sendKeys(invalidTimeTo);
						Thread.sleep(2000);	
						Select fri = new Select(ShiftTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(2000);	
						ManageShifts_UpdateBtn.click();	
						Thread.sleep(2000);		
						}						
						
						//Validate: Edit Shifts_ enter Valid Shift name and enter Invalid Timings and drpdwn selects value
						public void edit_ValidShiftNameTimingShiftTypeSelectedClickSaveBtn(String validTimeTo) throws InterruptedException{
						Thread.sleep(2000);	
						ManageShifts_EditBtn.click();
						Thread.sleep(2000);	
						shiftTmingsToTxtbox.clear();
						Thread.sleep(2000);
						shiftTmingsToTxtbox.sendKeys(validTimeTo);
						Thread.sleep(2000);	
						ManageShifts_UpdateBtn.click();	
						Thread.sleep(2000);		
						}						
							
						//Validate: Edit shift in one go
						public void editShiftInOneGo(String validShift, String validTimeFrom, String validTimeTo) throws InterruptedException{
						Thread.sleep(4000);
						ManageShifts_EditBtn.click();
						Thread.sleep(2000);
						ShiftNameTxtbox.clear();
						Thread.sleep(5000);
						ShiftNameTxtbox.sendKeys(validShift);
						Thread.sleep(5000);	
						shiftTmingsFromTxtbox.clear();
						Thread.sleep(5000);	
						shiftTmingsFromTxtbox.sendKeys(validTimeFrom);
						Thread.sleep(5000);	
						shiftTmingsToTxtbox.clear();
						Thread.sleep(5000);	
						shiftTmingsToTxtbox.sendKeys(validTimeTo);
						Thread.sleep(5000);	
						Select fri = new Select(ShiftTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(3000);	
						ManageShifts_UpdateBtn.click();	
						Thread.sleep(2000);		
						}	
					

						//Validate: Manage Clinics Link isDisplayed
						public boolean manageClinicLinkIsDisplayed(){
						WebElement link = ManageClinicsLink;
						return link.isDisplayed();
						}
					
						//Validate: Manage Clinics Link isEnabled
						public boolean manageClinicLinkIsEnabled(){
						WebElement link = ManageClinicsLink;
						return link.isEnabled();
						}	
						
						//Validate: Manage Clinics Link isClickable
						public void manageClinicLinkIsClickable(){
						ManageClinicsLink.click();
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						}	
						
						//Validate: Manage Clinics _ Clinic Name Textbox  isDisplayed
						public boolean clinicNameTxtboxIsDisplayed(){
						WebElement link = ClinicNameTxtbox;
						return link.isDisplayed();
						}
					
						//Validate: Manage Clinics _ Clinic Name Textbox isEnabled
						public boolean clinicNameTxtboxIsEnabled(){
						WebElement link = ClinicNameTxtbox;
						return link.isEnabled();
						}				
						

						//Validate: Manage Clinics _ Clinic Type Dropdown is Displayed
						public boolean clinicTypeDrpdwnIsDisplayed(){
						WebElement drpdwn = ClinicTypeDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Manage Clinics _ Clinic Type Dropdown is Enabled
						public boolean clinicTypeDrpdwnIsEnabled(){
						WebElement drpdwn = ClinicTypeDrpdwn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Manage Clinics _ Clinic Type Dropdown is Multiple
						public boolean clinicTypeDrpdwnIsMultiple() throws InterruptedException{
						Thread.sleep(3000);
						Select ListBox = new Select(ClinicTypeDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}
					

						//Validate: Manage Clinics _ Save Btn isDisplayed
						public boolean saveClinicBtnIsDisplayed(){
						WebElement link = SaveClinicBtn;
						return link.isDisplayed();
						}
					
						//Validate: Manage Clinics  _ Save Btn isEnabled
						public boolean saveClinicBtnIsEnabled(){
						WebElement link = SaveClinicBtn;
						return link.isEnabled();
						}	
						
						//Validate: Manage Clinics  _ Save Btn isClickable
						public void saveClinicBtnIsClickable(){
						WebElement link = SaveClinicBtn;
						link.click();
						}	
						
						//Validate: Manage Clinics _ Edit Btn isDisplayed
						public boolean editClinicBtnIsDisplayed(){
						WebElement link = EditClinicBtn;
						return link.isDisplayed();
						}
					
						//Validate: Manage Clinics  _ Edit Btn isEnabled
						public boolean editClinicBtnIsEnabled(){
						WebElement link = EditClinicBtn;
						return link.isEnabled();
						}	
						
						//Validate: Manage Clinics  _ Edit Btn isClickable
						public void editClinicBtnIsClickable(){
						WebElement link = EditClinicBtn;
						link.click();
						}	
						
						//Validate: Manage Clinics _ Update Btn isDisplayed
						public boolean updateClinicBtnIsDisplayed(){
						WebElement link = UpdateClinicBtn;
						return link.isDisplayed();
						}
					
						//Validate: Manage Clinics  _ Update Btn isEnabled
						public boolean updateClinicBtnIsEnabled(){
						WebElement link = UpdateClinicBtn;
						return link.isEnabled();
						}	
						
						//Validate: Manage Clinics  _ Update Btn isClickable
						public void updateClinicBtnIsClickable(){
						WebElement link = UpdateClinicBtn;
						link.click();
						}		
						
						//Validate: Prints validation msg: Clinic successfully Updated 
						public WebElement printValMsgClinicUpdated(){
						WebElement msg = ManageClinic_PrintValidationMsg;
						return msg;
						} 	
						
						//   --------------Same for Edit
						
						//Validate: Manage Clinics, blank clinic name & clinic type selected 
						public void blankClinicNameTypeSelected() throws InterruptedException{
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(2000);	
						SaveClinicBtn.click();
						}		
						
						//Validate: Manage Clinics, enter invalid clinic name & clinic type dropdown blank 
						public void enterInvalidClinicNameBlankDropdown(String invalidClinic) throws InterruptedException{
						Thread.sleep(2000);	
						ClinicNameTxtbox.sendKeys(invalidClinic);
						Thread.sleep(2000);
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(0);
						Thread.sleep(2000);	
						SaveClinicBtn.click();
						}
						
						//Validate: Manage Clinics, enter valid clinic name & clinic type dropdown blank 
						public void enterValidClinicNameBlankDropdown(String validClinic) throws InterruptedException{
						Thread.sleep(2000);	
						ClinicNameTxtbox.clear();
						Thread.sleep(2000);
						ClinicNameTxtbox.sendKeys(validClinic);
						Thread.sleep(2000);
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(0);
						Thread.sleep(2000);	
						SaveClinicBtn.click();
						}
						
						//Validate: Manage Clinics, enter valid clinic name & clinic type dropdown blank 
						public void enterValidClinicNameAndDropdown() throws InterruptedException{
						Thread.sleep(2000);
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(2000);	
						SaveClinicBtn.click();
						}
						
						//Validate: Manage Clinics, Add clinic in one go
						public void addClinicInOneGo(String validClinic) throws InterruptedException{
						Thread.sleep(2000);
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						ClinicNameTxtbox.sendKeys(validClinic);
						Thread.sleep(2000);
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(2000);	
						SaveClinicBtn.click();
						}
						
				// edit func starts
						
						//Validate: Manage Clinics, blank clinic name & clinic type selected 
						public void edit_AllFieldsBlankClickingUpdateBtn() throws InterruptedException{
						Thread.sleep(2000);
						EditClinicBtn.click();
						Thread.sleep(2000);
						ClinicNameTxtbox.clear();
						Thread.sleep(2000);
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(0);
						Thread.sleep(2000);	
						UpdateClinicBtn.click();
						}	

						//Validate: Manage Clinics, blank clinic name & clinic type selected 
						public void edit_blankClinicNameTypeSelected() throws InterruptedException{
						/*Thread.sleep(2000);
						EditClinicBtn.click();
						Thread.sleep(2000);
						ClinicNameTxtbox.clear()*/;
						Thread.sleep(2000);
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(2000);	
						UpdateClinicBtn.click();
						}		
						
						//Validate: Manage Clinics, enter invalid clinic name & clinic type dropdown blank 
						public void edit_enterInvalidClinicNameBlankDropdown(String invalidClinic) throws InterruptedException{
						Thread.sleep(2000);	
						ClinicNameTxtbox.sendKeys(invalidClinic);
						Thread.sleep(2000);
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(0);
						Thread.sleep(2000);	
						UpdateClinicBtn.click();
						}
						
						//Validate: Manage Clinics, enter valid clinic name & clinic type dropdown blank 
						public void edit_enterValidClinicNameBlankDropdown(String validClinic) throws InterruptedException{
						Thread.sleep(2000);	
						ClinicNameTxtbox.clear();
						Thread.sleep(2000);
						ClinicNameTxtbox.sendKeys(validClinic);
						Thread.sleep(2000);
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(0);
						Thread.sleep(2000);	
						UpdateClinicBtn.click();
						}
						
						//Validate: Manage Clinics, enter valid clinic name & clinic type dropdown blank 
						public void edit_enterValidClinicNameAndDropdown() throws InterruptedException{
						Thread.sleep(2000);
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(2000);	
						UpdateClinicBtn.click();
						}
						
						//Validate: Manage Clinics, Add clinic in one go
						public void edit_ClinicInOneGo(String validClinic) throws InterruptedException{
						Thread.sleep(2000);
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						EditClinicBtn.click();
						Thread.sleep(2000);
						ClinicNameTxtbox.clear();
						Thread.sleep(2000);
						ClinicNameTxtbox.sendKeys(validClinic);
						Thread.sleep(2000);
						Select fri = new Select(ClinicTypeDrpdwn);
						fri.selectByIndex(0);
						Thread.sleep(2000);	
						Select drpdwn = new Select(ClinicTypeDrpdwn);
						drpdwn.selectByIndex(1);
						Thread.sleep(2000);	
						UpdateClinicBtn.click();
						}
						
						//Validate: Manage Wards link isDisplayed
						public boolean manageWardsIsDisplayed(){
						WebElement link = ManageWardsLink;
						return link.isDisplayed();
						}
					
						//Validate: Manage Wards link isEnabled
						public boolean manageWardsIsEnabled(){
						WebElement link = ManageWardsLink;
						return link.isEnabled();
						}
						
						
						
						

						//Validate: Manage Wards link / Edit Wards is clickable
						public void manageWardsIsClickable() throws InterruptedException{
						/*	Thread.sleep(2000);
							driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
							Thread.sleep(2000);*/
							
							Actions act = new Actions(driver);
							act.moveToElement(ManageWardsLink).perform(); 
						/*	
							Actions act = new Actions(driver);
							act.sendKeys(Keys.ARROW_DOWN).perform();
							WebElement link = ManageWardsLink;
							link.click();
							*/
							WebDriverWait wc = new WebDriverWait(driver,20);
							wc.until(ExpectedConditions.visibilityOf(Add_EditWardLink));
							
							/*act.perform();
							WebElement link1 = Add_EditWardLink;
							link1.click();*/
						}
						
						
						
						//Validate: Manage Wards_ Add/Edit Ward link isDisplayed
						public boolean add_EditWardLinkIsDisplayed(){
						WebElement link = Add_EditWardLink;
						return link.isDisplayed();
						}
					
						//Validate: Manage Wards_ Add/Edit Ward link isEnabled
						public boolean add_EditWardLinkIsEnabled(){
						WebElement link = Add_EditWardLink;
						return link.isEnabled();
						}
						
						//Validate: Manage Wards_ Add/Edit Ward link is Clickable
						public void add_EditWardLinkIsClickable(){
						Actions act = new Actions(driver);
						act.perform();
						WebElement link = Add_EditWardLink;
						link.click();
						}
						
						//Validate: Save Wards Btn is Displayed
						public boolean saveWardBtnIsDisplayed(){
						WebElement btn = SaveWardBtn;
						return btn.isDisplayed();
						}
						
						//Validate: Save Wards Btn is Enabled
						public boolean saveWardBtnIsEnabled(){
						WebElement btn = SaveWardBtn;
						return btn.isEnabled();
						}					
					
						//Validate: Save Wards Btn is Clickable
						public void saveWardBtnIsClickable(){
						WebElement btn = SaveWardBtn;
						btn.click();
						}
						
						//Validate: Ward Name Txtbox is Displayed
						public boolean wardNameTxtboxIsDisplayed(){
						WebElement txbox = WardNameTxtbox;
						return txbox.isDisplayed();
						}
						
						//Validate: Ward Name Txtbox is Enabled
						public boolean wardNameTxtboxIsEnabled(){
						WebElement txbox = WardNameTxtbox;
						return txbox.isEnabled();
						}	
						
						//Validate: Add/Edit Ward_Select Gender dropdown is Displayed
						public boolean selectGenderDrpdwnIsDisplayed(){
						WebElement drpdwn = AddEditWard_SelectGenderDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Add/Edit Ward_Select Gender dropdown is Enabled
						public boolean selectGenderDrpdwnIsEnabled(){
						WebElement drpdwn = AddEditWard_SelectGenderDrpdwn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Add/Edit Ward_Select Gender dropdown is Multiple
						public boolean selectGenderDrpdwnIsMultiple() throws InterruptedException{
						Select ListBox = new Select(AddEditWard_SelectGenderDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}						

						//Validate: Add/Edit Ward_Is Casuality Ward Radio Btn Yes is Displayed
						public boolean casualtyWardRadioBtnYesIsDisplayed(){
						WebElement radio = CasualityWardRadioBtnYes;
						return radio.isDisplayed();
						}
						
						//Validate: Add/Edit Ward_Is Casuality Ward Radio Btn No is Displayed
						public boolean casualtyWardRadioBtnNoIsDisplayed(){
						WebElement radio = CasualityWardRadioBtnNo;
						return radio.isDisplayed();
						}
						
						//Validate: Add/Edit Ward_Is Bed Allocation Mandatory Radio Btn Yes is Displayed
						public boolean bedAllocationMandatoryRadioBtnYesIsDisplayed(){
						WebElement radio = BedAllocatonMandatoryRadioBtnYes ;
						return radio.isDisplayed();
						}
						
						//Validate: Add/Edit Ward_Is Bed Allocation Mandatory Radio Btn No is Displayed
						public boolean bedAllocationMandatoryRadioBtnNoIsDisplayed(){
						WebElement radio = BedAllocatonMandatoryRadioBtnNo ;
						return radio.isDisplayed();
						}
						
						//Validate: Add/Edit Ward_Total No Of Beds Txtbox is Displayed
						public boolean totalNoOfBedsTxtboxIsDisplayed(){
						WebElement drpdwn = TotalNoBedsTxtbox;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Add/Edit Ward_Total No Of Beds Txtbox is Enabled
						public boolean totalNoOfBedsTxtboxIsEnabled(){
						WebElement drpdwn = TotalNoBedsTxtbox;
						return drpdwn.isEnabled();
						}

						//Validate: Enter ward name only & clicking save btn
						public void enterWardNameAndClickSaveBtn(String invalidWard) throws InterruptedException{
						WardNameTxtbox.sendKeys(invalidWard);
						Thread.sleep(2000);
						SaveWardBtn.click();
						}
						
						//Validate: Enter ward name & Gender & clicking save btn
						public void enterWardNameAndGenderClickSaveBtn() throws InterruptedException{
						Select drpdwn = new Select(AddEditWard_SelectGenderDrpdwn);
						drpdwn.selectByIndex(1);
						Thread.sleep(2000);
						SaveWardBtn.click();
						}
						
						//Validate: Select ward Is Casualty or not
						public void selectIsCasualtyRadioBtn() throws InterruptedException{
						CasualityWardRadioBtnNo.click();
						Thread.sleep(2000);
						SaveWardBtn.click();
						}
						
						//Validate: Is Casualty Ward Chekbox is Selected
						public boolean notACasualtyWardCheckboxIsSelected(){
						WebElement chkbox = CasualityWardRadioBtnNo;	
						return chkbox.isSelected();
						}	
						
						//Validate: Selects Bed Allocation Mandatory or not
						public void selectBedAllocationMandatoryYes() throws InterruptedException{
						BedAllocatonMandatoryRadioBtnYes.click();
						Thread.sleep(2000);
						SaveWardBtn.click();
						}
						
						//Validate: Is Bed Allocation Mandatory Chekbox is Selected
						public boolean bedAllocationmandatoryYesCheckboxIsSelected(){
						WebElement chkbox = BedAllocatonMandatoryRadioBtnYes;	
						return chkbox.isSelected();
						}	
						
						//Validate: Enter Invalid Total No of beds
						public void enterInvalidNoOfBed(String invalidBed) throws InterruptedException{
						TotalNoBedsTxtbox.sendKeys(invalidBed);
						Thread.sleep(2000);
						SaveWardBtn.click();
						}
						
						//Validate: Enter Valid Total No of beds
						public void enterValidNoOfBed(String validBed) throws InterruptedException{
						TotalNoBedsTxtbox.clear();
						Thread.sleep(2000);
						TotalNoBedsTxtbox.sendKeys(validBed);
						Thread.sleep(2000);
						SaveWardBtn.click();
						}
						
						//Validate: Ward Abbreviation Txtbox is Displayed
						public boolean wardAbbreviationTxtboxIsDisplayed(){
						WebElement drpdwn = WardAbbreviationTxtbox;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Ward Abbreviation Txtbox 
						public boolean wardAbbreviationTxtboxIsEnabled(){
						WebElement drpdwn = WardAbbreviationTxtbox;
						return drpdwn.isEnabled();
						}
						
						//Validate: Prints validation msg: As Ward is inserted 
						public WebElement wardAdded_printValidationMsg(){
						WebElement msg = AddEditWard_PrintValMsg;
						return msg;
						} 
						
						//Validate: Add Valid Ward In One Go
						public void addWardInOneGo(String validWard,String validAbb,String validBed) throws InterruptedException{
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						WardNameTxtbox.sendKeys(validWard);
						Thread.sleep(2000);
						WardAbbreviationTxtbox.sendKeys(validAbb);
						Thread.sleep(2000);
						Select fri = new Select(AddEditWard_SelectGenderDrpdwn);
						fri.selectByIndex(1);
						Thread.sleep(2000);
						CasualityWardRadioBtnNo.click();
						Thread.sleep(2000);
						BedAllocatonMandatoryRadioBtnYes.click();
						Thread.sleep(2000);
						TotalNoBedsTxtbox.sendKeys(validBed);
						Thread.sleep(2000);
						SaveWardBtn.click();
						}
						
						//Validate: Edit Ward Btn is Displayed
						public boolean editWardBtnIsDisplayed(){
						WebElement drpdwn = EditWardBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Edit Ward Btn is Enabled
						public boolean editWardBtnIsEnabled() throws InterruptedException{
						WebElement drpdwn = EditWardBtn;
						Thread.sleep(2000);
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						return drpdwn.isEnabled();
						}
						
						
						
						
						
						
						
						//Validate: Edit Ward Btn is clickable
						public void editWardBtnIsClickable() throws InterruptedException{
						EditWardBtn.click();	
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						}
						
						
						
						//Validate: Update Ward Btn is Displayed
						public boolean updateWardBtnIsDisplayed(){
						WebElement drpdwn = UpdateWardEditBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Update Ward Btn is Enabled
						public boolean updateWardBtnIsEnabled(){
						WebElement drpdwn = UpdateWardEditBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Update Ward Btn is clickable
						public void updateWardBtnIsClickable() throws InterruptedException{
						WebElement btn = UpdateWardEditBtn;	
						btn.click();
						}
						
						//Validate: Enter ward name only & clicking update btn
						public void editWard_AllFIeldsBlank() throws InterruptedException{
						Thread.sleep(2000);
						WardNameTxtbox.clear();
						Thread.sleep(2000);
						WardAbbreviationTxtbox.clear();
						Thread.sleep(2000);
						Select fri = new Select(AddEditWard_SelectGenderDrpdwn);
						fri.selectByIndex(0);
						Thread.sleep(2000);
						CasualityWardRadioBtnNo.click();
						Thread.sleep(2000);
						BedAllocatonMandatoryRadioBtnNo.click();
						Thread.sleep(2000);
						UpdateWardEditBtn.click();
						}
						
						//Validate: Enter invalid ward name clicking update_ward btn
						public void editWard_EnterInvalidWardNameOnly(String invalidWard) throws InterruptedException{
							Thread.sleep(2000);
							WardNameTxtbox.sendKeys(invalidWard);
							Thread.sleep(2000);
							UpdateWardEditBtn.click();
							}
						
						//Validate: Enter invalid ward name & select gender clicking update_ward btn
						public void enterWardNameAndGenderClickUpdateBtn() throws InterruptedException{
						Select drpdwn = new Select(AddEditWard_SelectGenderDrpdwn);
						drpdwn.selectByIndex(1);
						Thread.sleep(2000);
						UpdateWardEditBtn.click();
						}
						
						//Validate: Casualty ward No radio btn is selected
						public boolean casualtyWardNoRadioBtnIsSelected(){
						WebElement chkbox = CasualityWardRadioBtnNo;	
						return chkbox.isSelected();
						}	
						
						//Validate: Bed Aliocation Mandatory No radio btn is selected
						public boolean bedAllocationMandatoryNoRadioBtnIsSelected() throws InterruptedException{
						WebElement chkbox = BedAllocatonMandatoryRadioBtnNo ;	
						return chkbox.isSelected();
						}
						
						//Validate: Enter Invalid Ward Abbreviation and click update btn
						public void enterInvalidWardAbbreviation(String invalidWardAbb) throws InterruptedException{
						WardAbbreviationTxtbox.sendKeys(invalidWardAbb);
						Thread.sleep(2000);
						UpdateWardEditBtn.click();
						}
						
						//Validate: Enter Valid Ward Abbreviation and click update btn
						public void enterValidWardAbbreviation(String validWardAbb) throws InterruptedException{
						WardAbbreviationTxtbox.clear();
						Thread.sleep(2000);
						WardAbbreviationTxtbox.sendKeys(validWardAbb);
						Thread.sleep(2000);
						UpdateWardEditBtn.click();
						}
						
						//Validate: Prints validation msg: As Ward is inserted 
						public WebElement wardEdited_printValidationMsg() throws InterruptedException{
						WebElement msg = AddEditWard_PrintValMsg;
						Thread.sleep(2000);
						return msg;
						} 
						
						//Validate: Edit Valid Ward In One Go
						public void editWardInOneGo(String validWard,String validAbb,String validBed) throws InterruptedException{
							Thread.sleep(2000);
							driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
							WardNameTxtbox.clear();
							Thread.sleep(2000);
							WardAbbreviationTxtbox.clear();
							Thread.sleep(2000);
							Select fri = new Select(AddEditWard_SelectGenderDrpdwn);
							fri.selectByIndex(0);
							Thread.sleep(2000);
							CasualityWardRadioBtnYes.click();
							Thread.sleep(2000);
							BedAllocatonMandatoryRadioBtnYes.click();
							Thread.sleep(2000);
							WardNameTxtbox.sendKeys(validWard);
							Thread.sleep(2000);
							WardAbbreviationTxtbox.sendKeys(validAbb);
							Thread.sleep(2000);
							Select frid = new Select(AddEditWard_SelectGenderDrpdwn);
							frid.selectByIndex(1);
							Thread.sleep(2000);
							UpdateWardEditBtn.click();
						}
						
						//Validate: Show bed list Btn is Displayed
						public boolean showBedListBtnIsDisplayed(){
						WebElement drpdwn = ShowBedListBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Show bed list Btn is Enabled
						public boolean showBedListBtnIsEnabled(){
						WebElement drpdwn = ShowBedListBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Show bed list Btn is clickable
						public void showBedListBtnIsClickable() throws InterruptedException{
						ShowBedListBtn.click();	
						Thread.sleep(2000);
						}
						
						//Validate: close bed list Btn is Displayed
						public boolean closeBedListBtnIsDisplayed(){
						WebElement drpdwn = CloseBtnBedListTable;
						return drpdwn.isDisplayed();
						}
						
						//Validate: close bed list Btn is Enabled
						public boolean closeBedListBtnIsEnabled(){
						WebElement drpdwn = CloseBtnBedListTable;
						return drpdwn.isEnabled();
						}
						
						//Validate: Close bed list Btn is clickable	
						public void closeBedListBtnIsClickable(){
						CloseBtnBedListTable.click();
						}
						
						//Validate: Add Bed Btn is Displayed
						public boolean addBedBtnIsDisplayed(){
						WebElement drpdwn = AddBedRadioBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Add bed list Btn is Enabled
						public boolean addBedBtnIsEnabled(){
						WebElement drpdwn = AddBedRadioBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Add bed list Btn is clickable	
						public void addBedBtnIsClickable(){
						AddBedRadioBtn.click();
						}
						
						//Validate: Number of bed to be added textbox is Displayed
						public boolean bedsToBeAddedTxtboxIsDisplayed(){
						WebElement drpdwn = AddEditWard_AddBedTextbox;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Number of bed to be added textbox is Enabled
						public boolean bedsToBeAddedTxtboxIsEnabled(){
						WebElement drpdwn = AddEditWard_AddBedTextbox;
						return drpdwn.isEnabled();
						}
						
						//Validate: Save Btn For Bed is Displayed
						public boolean saveBtnForBedIsDisplayed(){
						WebElement drpdwn = SaveBtnForBed;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Save Btn For Bed is Enabled
						public boolean saveBtnForBedIsEnabled(){
						WebElement drpdwn = SaveBtnForBed;
						return drpdwn.isEnabled();
						}
						
						//Validate: Save Btn For Bed is clickable	
						public void saveBtnForBedIsClickable(){
						SaveBtnForBed.click();
						}
						
						//Validate: Total No Of Beds in the list textbox is Displayed
						public boolean totalNoOfBedsAvailableTxtboxIsDisplayed() throws InterruptedException{
						WebElement txtbox = TotalBedsDisplayedInTxtbox;
						Thread.sleep(3000);
						return txtbox.isDisplayed();
						}
						
						//Validate: Fetches Total No Of Beds displayed in the textbox
						public String fetchesTotallNoOfBedsAvailableInTheTxtbox() throws InterruptedException{
						WebElement txtbox = TotalBedsDisplayedInTxtbox;
						Thread.sleep(2000);
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						return txtbox.getAttribute("value");
						}
						
						//Validate: Add 1 Bed in the list
						public void adds1BedToBedList() throws InterruptedException{
							Thread.sleep(2000);
							AddEditWard_AddBedTextbox.sendKeys("1");
							Thread.sleep(2000);
							SaveBtnForBed.click();						
							}
						
						//Validate: Prints validation msg: 1 bed added to the list 
						public WebElement oneBedAdded_printValidationMsg(){
						WebElement msg = AddEditWard_PrintValMsg;
						return msg;
						} 
						
						//Validate: Remove bed radio btn is Displayed
						public boolean removeBedBtnIsDisplayed() throws InterruptedException{
						WebElement drpdwn = RemoveBedRadioBtn;
						Thread.sleep(2000);
						return drpdwn.isDisplayed();
						}
						
						//Validate: Remove bed radio btn is Enabled
						public boolean removeBedBtnIsEnabled() throws InterruptedException{
						WebElement drpdwn = RemoveBedRadioBtn;
						Thread.sleep(2000);
						return drpdwn.isEnabled();
						}
						
						//Validate: Remove bed radio btn is clickable	
						public void removeBedBtnIsClickable() throws InterruptedException{
						RemoveBedRadioBtn.click();
						Thread.sleep(2000);
						}
						
						//Validate: Directly clicking Save Btn without removing bed	
						public void clickingSaveBtnWithoutRemovingBed(){
						SaveBtnForBed.click();
						}
						
						//Validate: Remove Bed chkbox is Displayed
						public boolean removeBedChkboxIsDisplayed(){
						WebElement drpdwn = RemoveBed_AvailaibleBedChkbox;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Remove Bed chkbox is Enabled
						public boolean removeBedChkboxIsEnabled(){
						WebElement drpdwn = RemoveBed_AvailaibleBedChkbox;
						return drpdwn.isEnabled();
						}
						
						//Validate: Remove one bed from Remove Bed Table	
						public void removeOneBedFromTable() throws InterruptedException{
							Thread.sleep(2000);
						//	String val = TotalBedsDisplayedInTxtbox.getAttribute("value");
							Thread.sleep(2000);
							RemoveBed_AvailaibleBedChkbox.click();
							Thread.sleep(2000);
							SaveBtnForBed.click();
							Thread.sleep(2000);
							TotalBedsDisplayedInTxtbox.getAttribute("value");
							Thread.sleep(2000);
						}
						
						//Validate: Prints validation msg: 1 bed removed to the list 
						public WebElement oneBedRemoved_printValidationMsg() throws InterruptedException{
						WebElement msg = AddEditWard_PrintValMsg;
						Thread.sleep(2000);
						return msg;
						} 
						
						
						
						//Validate: Change bed number radio btn is Displayed
						public boolean changeBedNoRadioBtnIsDisplayed() throws InterruptedException{
						WebElement drpdwn = ChangeBedNoRadioBtn;
						Thread.sleep(2000);
						return drpdwn.isDisplayed();
						}
						
						//Validate: Change bed number radio btn is Enabled
						public boolean changeBedNoRadioBtnIsEnabled() throws InterruptedException{
						WebElement drpdwn = ChangeBedNoRadioBtn;
						Thread.sleep(2000);
						return drpdwn.isEnabled();
						}
						
						//Validate: Change bed number radio btn is clickable	
						public void changeBedNoRadioBtnIsClickable(){
						ChangeBedNoRadioBtn.click();
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						}
						
						//Validate: It validates that bed no. has been changed,Fetch values of a row which has different cols and print specific col value
						public Object validatesOldBedNo() throws InterruptedException{
						Thread.sleep(2000);
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);	
						ShowBedListBtn.click();
						Thread.sleep(2000);
		
						WebElement bedStatusTable = ShowBedStatusTable;
		
WebElement rows = bedStatusTable.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]"));

					String textInRows = rows.getText();
					
					System.out.println("Old Bed details are :"+ textInRows);
					
WebElement cell = rows.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]"));
					
					String textInCell = cell.getText();
					
					System.out.println("Old Bed number is :"+ textInCell);	
					
					CloseBtnBedListTable.click();
					Thread.sleep(2000);
					return textInCell;
					
						
		}
				
						
						//Validate: ChangeBedNO_Select old bed no drpdwn is displayed
						public boolean selectOldBedNoToChngDrpdwnIsDisplayed(){
						WebElement drpdwn = SelectOldBedNoDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: ChangeBedNO_Select old bed no drpdwn is enabled
						public boolean selectOldBedNoToChngDrpdwnIsEnabled(){
						WebElement drpdwn = SelectOldBedNoDrpdwn;
						return drpdwn.isEnabled();
						}
						
						//Validate: ChangeBedNO_Select old bed no drpdwn is multiple
						public boolean selectOldBedNoToChngDrpdwnIsMultiple() throws InterruptedException{
						Thread.sleep(3000);
						Select ListBox = new Select(SelectOldBedNoDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}
						
						//Validate: Prefix textbox is Displayed
						public boolean prefixTxtboxIsDisplayed(){
						WebElement txtbox = PrefixTextbox;
						return txtbox.isDisplayed();
						}
						
						//Validate: Prefix txtbox is Enabled
						public boolean prefixTxtboxIsEnabled(){
						WebElement txtbox = PrefixTextbox;
						return txtbox.isEnabled();
						}
						
						//Validate: Bed No textbox is Displayed
						public boolean bedNoTxtboxIsDisplayed(){
						WebElement txtbox = BedNoTextbox;
						return txtbox.isDisplayed();
						}
						
						//Validate: Bed No txtbox is Enabled
						public boolean bedNoTxtboxIsEnabled(){
						WebElement txtbox = BedNoTextbox;
						return txtbox.isEnabled();
						}
						
						
						//Validate: Postfix textbox is Displayed
						public boolean postfixTxtboxIsDisplayed(){
						WebElement txtbox = PostfixTextbox;
						return txtbox.isDisplayed();
						}
						
						//Validate: Postfix txtbox is Enabled
						public boolean postfixTxtboxIsEnabled(){
						WebElement txtbox = PostfixTextbox;
						return txtbox.isEnabled();
						}
						
								
						
						
						//Validate: Directly clicking Save Btn without Entering Prefix Postinx	
						public void clickingSaveBtnWithoutPrePostfix() throws InterruptedException{
						Thread.sleep(2000);
						SaveBtnForBed.click();
						}
						
						//Validate: Select bed no only from drpdwn and hit save btn	
						public void selectBedNoAndClickSaveBtn() throws InterruptedException{
						Thread.sleep(2000);
						Select ListBox = new Select(SelectOldBedNoDrpdwn);
						ListBox.selectByIndex(1);
						Thread.sleep(2000);
						SaveBtnForBed.click();
						}
						
						//Validate: Enter Invalid Prefix old bed no already selected and hit save btn	
						public void oldBedSelectedEnterInvalidPrefix() throws InterruptedException{
						Thread.sleep(2000);
						PrefixTextbox.sendKeys("@@##");
						Thread.sleep(2000);
						SaveBtnForBed.click();
						}
						
						//Validate: Enter Valid Prefix old bed no already selected and hit save btn	
						public void oldBedSelectedEnterValidPrefix() throws InterruptedException{
						Thread.sleep(2000);
						PrefixTextbox.clear();
						Thread.sleep(2000);
						PrefixTextbox.sendKeys("0");
						Thread.sleep(2000);
						SaveBtnForBed.click();
						}
						
						//Validate: Enter bed no  selected and hit save btn	
						public void enterBedNoOldBedPrefixSelected() throws InterruptedException{
						Thread.sleep(2000);
						BedNoTextbox.sendKeys("1");
						Thread.sleep(2000);
						SaveBtnForBed.click();
						}
						
						//Validate: Enter Invalid Postfix old bed no already selected and hit save btn	
						public void oldBedPrefixNewBedSelectedEnterInvalidPostfix() throws InterruptedException{
						Thread.sleep(2000);
						PostfixTextbox.sendKeys("@@##");
						Thread.sleep(2000);
						SaveBtnForBed.click();
						}
						
						//Validate: Enter Valid Postfix old bed no already selected and hit save btn	
						public void oldBedPrefixNewBedSelectedEnterValidPostfix() throws InterruptedException{
						Thread.sleep(2000);
						PostfixTextbox.clear();
						Thread.sleep(2000);
						PostfixTextbox.sendKeys("A");
						Thread.sleep(2000);
						SaveBtnForBed.click();
						}
						
						
						//Validate: Prints validation msg: Bed No. Successfully Changed
						public WebElement bedNoChanged_printValidationMsg(){
						WebElement msg = AddEditWard_PrintValMsg;
						return msg;
						} 
						
						
						//Validate: Change Bed Number in one go
						public void changeBedNoInOneGo(String prefix,String bedNo,String postfix) throws InterruptedException{
						Thread.sleep(2000);
						ChangeBedNoRadioBtn.click();
						Thread.sleep(2000);
						Select ListBox = new Select(SelectOldBedNoDrpdwn);
						ListBox.selectByIndex(1); //	????????????????
						Thread.sleep(2000);
						PrefixTextbox.sendKeys(prefix);
						Thread.sleep(2000);
						BedNoTextbox.sendKeys(bedNo);
						Thread.sleep(2000);
						PostfixTextbox.sendKeys(postfix);
						Thread.sleep(2000);
						SaveBtnForBed.click();
						Thread.sleep(2000);
						}
						
						
						
//Validate: It validates that bed no. has been changed,Fetch values of a row which has different cols and print specific col value
						public Object validatesChangedBedNo() throws InterruptedException{
						ShowBedListBtn.click();
						Thread.sleep(2000);
		
						WebElement bedStatusTable = ShowBedStatusTable;
		
WebElement rows = bedStatusTable.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]"));

					String textInRows = rows.getText();
					
					System.out.println("Updated Bed details are :"+ textInRows);
					
WebElement cell = rows.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]"));
					
					String textInCell = cell.getText();
					
					System.out.println("Updated Bed number is :"+ textInCell);	
					
					CloseBtnBedListTable.click();
					Thread.sleep(2000);
					return textInCell;
					
						
		}
						
						
						
						
						
						
						
						//Validate: Manage Wards link / Ward Unit Mapping is clickable
						public void clickManageWardsToReachWardUnitMappingLink() throws InterruptedException{
							
							Thread.sleep(2000);
							ManageClinicsLink.click();
							Thread.sleep(2000);
						
							
							/*JavascriptExecutor js = (JavascriptExecutor) driver;
						    js.executeScript("javascript:window.scrollBy(0,500)");
						*/
						    Actions act = new Actions(driver);
							act.moveToElement(ManageWardsLink).perform(); 
							Thread.sleep(2000);
						    
						    
						/*	
							Actions act = new Actions(driver);
							act.sendKeys(Keys.ARROW_DOWN).perform();
							WebElement link = ManageWardsLink;
							link.click();
							*/
							
							JavascriptExecutor js = (JavascriptExecutor)driver;
							 js.executeScript("arguments[0].click();", WardUnitMappingLink);
							 
							 
							/*WebDriverWait wc = new WebDriverWait(driver,20);
							wc.until(ExpectedConditions.visibilityOf(WardUnitMappingLink));
							*/
							
						/*	act.perform();
							WebElement link1 = WardUnitMappingLink;
							link1.click();
							Thread.sleep(10000);*/
						}	

						
						//Validate: Ward unit Mapping Link is Displayed
						public boolean wardUnitMappingLinkIsDisplayed() throws InterruptedException{
						WebElement link = WardUnitMappingLink;
						Thread.sleep(2000);
						return link.isDisplayed();
						}
						
						//Validate: Ward unit Mapping Link is Enabled
						public boolean wardUnitMappingLinkIsEnabled(){
						WebElement link = WardUnitMappingLink;
						return link.isEnabled();
						}

						
						
						//Validate: Ward unit Mapping Link is Clickable
						public void wardUnitMappingLinkIsClickable(){
						/*
							Actions act = new Actions(driver);
							act.moveToElement(WardUnitMappingLink).perform();
							WardUnitMappingLink.click();
							*/
							
					/*	Actions act = new Actions(driver);
						act.perform();
						WebElement link1 = WardUnitMappingLink;
						link1.click();
						*/
						
						
						/*WebDriverWait wait = new WebDriverWait(driver, 10);
						WebElement element = wait.until(ExpectedConditions.elementToBeClickable(WardUnitMappingLink));
						element.click();*/
						
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", WardUnitMappingLink); 
						
						}
						
						//Validate: WardUnitMapping_WardName dropdown is Displayed
						public boolean wardUnitMapping_WardNameDrpdwnIsDisplayed(){
						WebElement drpdwn = WardUnitMapping_WardNameDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: WardUnitMapping_WardName dropdown is Enabled
						public boolean wardUnitMapping_WardNameDrpdwnIsEnabled(){
						WebElement drpdwn = WardUnitMapping_WardNameDrpdwn;
						return drpdwn.isEnabled();
						}
						
						
						//Validate: WardUnitMapping_WardName dropdown is Multiple
						public boolean wardUnitMapping_WardNameDrpdwnIsMultiple() throws InterruptedException{
						Thread.sleep(3000);
						Select ListBox = new Select(WardUnitMapping_WardNameDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}
	

						//Validate: WardUnitMapping_UnitName dropdown is Displayed
						public boolean wardUnitMapping_UnitNameDrpdwnIsDisplayed(){
						WebElement drpdwn = WardUnitMapping_UnitNameDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: WardUnitMapping_UnitName dropdown is Enabled
						public boolean wardUnitMapping_UnitNameDrpdwnIsEnabled(){
						WebElement drpdwn = WardUnitMapping_UnitNameDrpdwn;
						return drpdwn.isEnabled();
						}
						
						//Validate: WardUnitMapping_UnitName dropdown is Multiple
						public boolean wardUnitMapping_UnitNameDrpdwnIsMultiple() throws InterruptedException{
						Thread.sleep(3000);
						Select ListBox = new Select(WardUnitMapping_UnitNameDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}

						//Validate: Ward Unit Mapping Save Btn is Displayed
						public boolean wardUnitMapping_SaveBtnIsDisplayed(){
						WebElement drpdwn = WardUnitMapping_SaveBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Ward Unit Mapping Save Btn is Enabled
						public boolean wardUnitMapping_SaveBtnIsEnabled(){
						WebElement drpdwn = WardUnitMapping_SaveBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Ward Unit Mapping Save Btn is clickable
						public void wardUnitMapping_SaveBtnIsClickable() throws InterruptedException{
						WardUnitMapping_SaveBtn.click();
						}

						//Validate: Edit Ward Unit Mapping btn is Displayed
						public boolean wardUnitMapping_EditBtnIsDisplayed(){
						WebElement drpdwn = WardUnitMapping_EditBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Edit Ward Unit Mapping Btn is Enabled
						public boolean wardUnitMapping_EditBtnIsEnabled(){
						WebElement drpdwn = WardUnitMapping_EditBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Edit Ward Unit Mapping Btn is clickable
						public void wardUnitMapping_EditBtnIsClickable() throws InterruptedException{
						WardUnitMapping_EditBtn.click();
						Thread.sleep(2000);
						}

						//Validate: Update Ward Unit Mapping btn is Displayed
						public boolean wardUnitMapping_UpdateBtnIsDisplayed(){
						WebElement drpdwn = WardUnitMapping_UpdateBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Update Ward Unit Mapping Btn is Enabled
						public boolean wardUnitMapping_UpdateBtnIsEnabled() throws InterruptedException{
						Thread.sleep(2000);
						WebElement drpdwn = WardUnitMapping_UpdateBtn;
						return drpdwn.isEnabled();
						}
						
						
						//Validate: Update Ward Unit Mapping Btn is clickable
						public void wardUnitMapping_UpdateBtnIsClickable() throws InterruptedException{
						WardUnitMapping_UpdateBtn.click();
						}

						//Validate: Update Ward Unit Mapping btn is Displayed
						public boolean wardUnitMapping_DeleteBtnIsDisplayed(){
						WebElement drpdwn = WardUnitMapping_DeleteBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Update Ward Unit Mapping Btn is Enabled
						public boolean wardUnitMapping_DeleteBtnIsEnabled(){
						WebElement drpdwn = WardUnitMapping_DeleteBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Update Ward Unit Mapping Btn is clickable
						public void wardUnitMapping_DeleteBtnIsClickable() throws InterruptedException{
						WardUnitMapping_DeleteBtn.click();
						}

						//Validate: Prints validation msg: Bed No. Successfully Changed
						public WebElement wardUnitMapping_printValidationMsg(){
						WebElement msg = WardUnitMapping_PrintValMsg;
						return msg;
						} 

						//Validate: Enter Ward Name only and hit save btn
						public void onlyWardNameSelectedClickSaveBtn() throws InterruptedException{
						Thread.sleep(2000); 	
						Select ListBox = new Select(WardUnitMapping_WardNameDrpdwn);
						ListBox.selectByIndex(1);
						Thread.sleep(2000); 	
						WardUnitMapping_SaveBtn.click();
						 Thread.sleep(2000);
						}

						//Validate: Enter Unit Name only and hit save btn
						public void selectingUnitNameOnlyAndClickSaveBtn() throws InterruptedException{
						Select ListBox = new Select(WardUnitMapping_WardNameDrpdwn);
						ListBox.selectByIndex(0);
						Thread.sleep(2000); 
						Select Box = new Select(WardUnitMapping_UnitNameDrpdwn);
						Box.selectByIndex(2);
						Thread.sleep(2000); 
						WardUnitMapping_SaveBtn.click();
						Thread.sleep(2000);
						}

						//Validate: Select both Ward & Unit name and hit save btn
						public void selectBothWardUnitNameAndClickSaveBtn() throws InterruptedException{
						Select ListBox = new Select(WardUnitMapping_WardNameDrpdwn);
						ListBox.selectByIndex(1);
						Thread.sleep(2000); 
						WardUnitMapping_SaveBtn.click();
						Thread.sleep(2000);
						}
						
						//Validate: Add Ward Unit Mapping in one go
						public void addWardUnitMappingInOneGo() throws InterruptedException{
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						Select Box = new Select(WardUnitMapping_WardNameDrpdwn);
						Box.selectByIndex(2);
						Thread.sleep(2000);
						Select Boxs = new Select(WardUnitMapping_UnitNameDrpdwn);
						Boxs.selectByIndex(2);
						Thread.sleep(2000);
						WardUnitMapping_SaveBtn.click();
						Thread.sleep(2000); 
						}
						
						//Validate: click on edit btn and hit update btn wthout any value
						public void clickEditBtnAndUpdateWithoutValues() throws InterruptedException{
						WardUnitMapping_EditBtn.click();
						Select ListBox = new Select(WardUnitMapping_WardNameDrpdwn);
						ListBox.selectByIndex(0);
						Thread.sleep(2000); 
						Select Box = new Select(WardUnitMapping_UnitNameDrpdwn);
						Box.selectByIndex(0);
						Thread.sleep(2000); 
						WardUnitMapping_UpdateBtn.click();
						Thread.sleep(2000); 
						}

						//Validate: Enter Ward Name only and hit update btn
						public void onlyWardNameAlreadySelectedClickUpdateBtn() throws InterruptedException{
						Select ListBox = new Select(WardUnitMapping_WardNameDrpdwn);
						ListBox.selectByIndex(1);
						Thread.sleep(2000); 
						WardUnitMapping_UpdateBtn.click();
						Thread.sleep(2000);
						}

						//Validate: Enter Unit Name only and hit update btn
						public void selectingUnitNameOnlyAndClickUpdateBtn() throws InterruptedException{
						WardUnitMapping_EditBtn.click();
						Thread.sleep(2000);
						Select ListBox = new Select(WardUnitMapping_WardNameDrpdwn);
						ListBox.selectByIndex(0);
						Thread.sleep(2000); 
						Select Box = new Select(WardUnitMapping_UnitNameDrpdwn);
						Box.selectByIndex(2);
						Thread.sleep(2000); 
						WardUnitMapping_UpdateBtn.click();
						Thread.sleep(2000);
						}

						//Validate: Select both Ward & Unit name and hit update btn
						public void selectBothWardUnitNameAndClickUpdateBtn() throws InterruptedException{
							Thread.sleep(2000);
						Select ListBox = new Select(WardUnitMapping_WardNameDrpdwn);
						ListBox.selectByIndex(1);
						Thread.sleep(2000); 
						WardUnitMapping_UpdateBtn.click();
						Thread.sleep(2000);
						}
						
						//Validate: Edit Ward Unit Mapping in one go
						public void editWardUnitMappingInOneGo() throws InterruptedException{
						Thread.sleep(2000);
						driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
						Thread.sleep(2000);
						WardUnitMapping_EditBtn.click();
						Thread.sleep(2000);
						Select ListBox = new Select(WardUnitMapping_WardNameDrpdwn);
						ListBox.selectByIndex(1);
						Thread.sleep(2000); 
						Select Box = new Select(WardUnitMapping_UnitNameDrpdwn);
						Box.selectByIndex(2);
						Thread.sleep(2000); 
						WardUnitMapping_UpdateBtn.click();
						Thread.sleep(2000); 
						}

						//Validate: Delete the first entry in row
						public void deletesFirstMappingInTheRow() throws InterruptedException{
						WardUnitMapping_DeleteBtn.click();
						Thread.sleep(2000); 
						}


						//Validate: Click Manage Wards to reach Map Ward Vs ICU ISOLATION Ward Link						
						public void clickManageWardsToReachMapWardVsIcuIsolationLink() throws InterruptedException{
							
							Thread.sleep(2000);
							ManageClinicsLink.click();
							Thread.sleep(2000);
							
							Actions act = new Actions(driver);
							act.moveToElement(ManageWardsLink).perform(); 

							/*WebDriverWait wc = new WebDriverWait(driver,20);
							wc.until(ExpectedConditions.visibilityOf(MapWardVsIcuIsolation));
							*/
							/*JavascriptExecutor js = (JavascriptExecutor)driver;
							 js.executeScript("arguments[0].click();", MapWardVsIcuIsolation);
							 */
							 
							/*WebDriverWait wc = new WebDriverWait(driver,20);
							wc.until(ExpectedConditions.visibilityOf(MapWardVsIcuIsolation));
							*/
							 
							/*
							act.perform();
							WebElement link1 = MapWardVsIcuIsolation;
							link1.click();
							Thread.sleep(10000);
							*/
							
							
						}	

						
						//Validate: Map Ward Vs ICU ISOLATION Ward Link is Displayed
						public boolean mapWardVsIcuIsolationLinkIsDisplayed() throws InterruptedException{
						WebElement link = MapWardVsIcuIsolation;
						return link.isDisplayed();
						}
						
						//Validate: Map Ward Vs ICU ISOLATION Ward Link is Enabled
						public boolean mapWardVsIcuIsolationLinkIsEnabled() throws InterruptedException{
						WebElement link = MapWardVsIcuIsolation;
						Thread.sleep(2000);
						return link.isEnabled();
						}
						
						//Validate: Map Ward Vs ICU ISOLATION Ward Link is Clickable
						public void mapWardVsIcuIsolationLinkIsClickable(){
							
							JavascriptExecutor js = (JavascriptExecutor)driver;
							 js.executeScript("arguments[0].click();", MapWardVsIcuIsolation);
							 
/*						Actions act = new Actions(driver);
						act.perform();
						WebElement link1 = MapWardVsIcuIsolation;
						link1.click();
*/						}

						//Validate: Ward List dropdown is Displayed
						public boolean wardListDrpdwnIsDisplayed(){
						WebElement drpdwn = MapWardVsIcuIsolation_WardListDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Ward List dropdown is Enabled
						public boolean wardListDrpdwnIsEnabled(){
						WebElement drpdwn = MapWardVsIcuIsolation_WardListDrpdwn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Ward List dropdown is Multiple
						public boolean wardListDrpdwnIsMultiple() throws InterruptedException{
						Select ListBox = new Select(MapWardVsIcuIsolation_WardListDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}		

						//Validate: ICU/Isolation Ward List dropdown is Displayed
						public boolean icuIsolationWardDrpdwnIsDisplayed(){
						WebElement drpdwn = MapWardVsIcuIsolation_IcuIsolationWardDrpdwn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: ICU/Isolation Ward List dropdown is Enabled
						public boolean icuIsolationWardDrpdwnIsEnabled(){
						WebElement drpdwn = MapWardVsIcuIsolation_IcuIsolationWardDrpdwn;
						return drpdwn.isEnabled();
						}
						
						//Validate: ICU/Isolation Ward List dropdown is Multiple
						public boolean icuIsolationWardDrpdwnIsMultiple() throws InterruptedException{
						Select ListBox = new Select(MapWardVsIcuIsolation_IcuIsolationWardDrpdwn);
						boolean value = ListBox.isMultiple() ;
						return value;
						}	

						//Validate: Show Configuration Btn is Displayed
						public boolean saveConfigurationBtnIsDisplayed(){
						WebElement drpdwn = MapWardVsIcuIsolation_SaveConfigurationBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Show Configuration  Btn is Enabled
						public boolean saveConfigurationBtnIsEnabled(){
						WebElement drpdwn = MapWardVsIcuIsolation_SaveConfigurationBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Show Configuration Btn is clickable
						public void saveConfigurationBtnIsClickable() throws InterruptedException{
						MapWardVsIcuIsolation_SaveConfigurationBtn.click();	
						Thread.sleep(3000);
						}
						
						
						//Validate: Show ICU Ward List Btn is Displayed
						public boolean showIcuWardListBtnIsDisplayed(){
						WebElement drpdwn = MapWardVsIcuIsolation_ShowIcuWardBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Show ICU Ward List  Btn is Enabled
						public boolean showIcuWardListBtnIsEnabled(){
						WebElement drpdwn = MapWardVsIcuIsolation_ShowIcuWardBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Show ICU Ward List Btn is clickable
						public void showIcuWardListBtnIsClickable() throws InterruptedException{
						MapWardVsIcuIsolation_ShowIcuWardBtn.click();	
						Thread.sleep(2000);
						}

						//Validate: Show ISOLATION Ward List Btn is Displayed
						public boolean showIsolationWardListBtnIsDisplayed(){
						WebElement drpdwn = MapWardVsIcuIsolation_ShowIsolationWardBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Show ISOLATION Ward List  Btn is Enabled
						public boolean showIsolationWardListBtnIsEnabled(){
						WebElement drpdwn = MapWardVsIcuIsolation_ShowIsolationWardBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Show ISOLATION Ward List Btn is clickable
						public void showIsolationWardListBtnIsClickable() throws InterruptedException{
						MapWardVsIcuIsolation_ShowIsolationWardBtn.click();;	
						Thread.sleep(2000);
						}
						
						//Validate: Edit ICU Ward List Btn is Displayed
						public boolean editIcuWardListBtnIsDisplayed(){
						WebElement drpdwn = MapWardVsIcuIsolation_EditIcuWardBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Edit ICU Ward List  Btn is Enabled
						public boolean editIcuWardListBtnIsEnabled(){
						WebElement drpdwn = MapWardVsIcuIsolation_EditIcuWardBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Edit ICU Ward List Btn is clickable
						public void editIcuWardListBtnIsClickable() throws InterruptedException{
						MapWardVsIcuIsolation_EditIcuWardBtn.click();;	
						Thread.sleep(2000);
						}
						
						//Validate: Edit ISOLATION Ward List Btn is Displayed
						public boolean editIsolationWardListBtnIsDisplayed(){
						WebElement drpdwn = MapWardVsIcuIsolation_EditIsolationWardBtn;
						return drpdwn.isDisplayed();
						}
						
						//Validate: Edit ISOLATION Ward List  Btn is Enabled
						public boolean editIsolationWardListBtnIsEnabled(){
						WebElement drpdwn = MapWardVsIcuIsolation_EditIsolationWardBtn;
						return drpdwn.isEnabled();
						}
						
						//Validate: Edit ISOLATION Ward List Btn is clickable
						public void editIsolationWardListBtnIsClickable() throws InterruptedException{
						MapWardVsIcuIsolation_EditIsolationWardBtn.click();	
						Thread.sleep(2000);
						}

						
						//Validate: Change ward name and convert ICU to Isolation ward 
						public void addIcuWardInOneGo() throws InterruptedException{
						Select ListBox = new Select(MapWardVsIcuIsolation_WardListDrpdwn);
						ListBox.selectByIndex(1);
						Thread.sleep(2000);
						Select list = new Select(MapWardVsIcuIsolation_IcuIsolationWardDrpdwn);
						list.selectByVisibleText("ICU ward");
						MapWardVsIcuIsolation_SaveConfigurationBtn.click();
						Thread.sleep(2000);
						}
						
						//Validate: Change ward name and convert Isolation ward to ICU Ward
						public void addIsolationWardInOneGo() throws InterruptedException{
						Select ListBox = new Select(MapWardVsIcuIsolation_WardListDrpdwn);
						ListBox.selectByIndex(2);
						Thread.sleep(2000);
						Select list = new Select(MapWardVsIcuIsolation_IcuIsolationWardDrpdwn);
						list.selectByVisibleText("Isolation ward");
						MapWardVsIcuIsolation_SaveConfigurationBtn.click();
						Thread.sleep(2000);
						}
						
						//edit--------------------------------------
						
						
						
						//Validate: Edit and convert Isolation Ward to Icu in one gos
						public void editIsolationWardInOneGo() throws InterruptedException{
						MapWardVsIcuIsolation_ShowIsolationWardBtn.click();
						Thread.sleep(2000);
						MapWardVsIcuIsolation_EditIsolationWardBtn.click();
						Thread.sleep(2000);
						Select ListBox = new Select(MapWardVsIcuIsolation_WardListDrpdwn);
						ListBox.selectByIndex(2);
						Thread.sleep(2000);
						Select list = new Select(MapWardVsIcuIsolation_IcuIsolationWardDrpdwn);
						list.selectByVisibleText("ICU ward");
						MapWardVsIcuIsolation_SaveConfigurationBtn.click();
						Thread.sleep(2000);
						}
						
						
						
						
						

						//Validate: Edit and convert ICU Ward to Isolation in one go
						public void editIcuWardInOneGo() throws InterruptedException{
							MapWardVsIcuIsolation_ShowIcuWardBtn.click();
							Thread.sleep(2000);
							MapWardVsIcuIsolation_EditIcuWardBtn.click();
							Thread.sleep(2000);
							Select ListBox = new Select(MapWardVsIcuIsolation_WardListDrpdwn);
							ListBox.selectByIndex(2);
							Thread.sleep(2000);
							Select list = new Select(MapWardVsIcuIsolation_IcuIsolationWardDrpdwn);
							list.selectByVisibleText("Isolation ward");
							MapWardVsIcuIsolation_SaveConfigurationBtn.click();
							Thread.sleep(2000);
							}




}







