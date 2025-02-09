package nic.ehospital.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import nic.ehospital.qa.base.TestBase;
import nic.ehospital.qa.util.TestUtil;

public class ConfigureHospitalInfraPage extends TestBase{
	
//PageFactory or Object Repository (OR)
	
	@FindBy(partialLinkText="Administration")
	WebElement Admin;
	
	@FindBy(partialLinkText="Hospital Administration")
	WebElement HospitalAdmin;
	
	@FindBy(partialLinkText="Configure Hospital Infrastructure")
	WebElement ConfigureHospitalInfra;
	
	@FindBy(partialLinkText="MANAGE BUILDING")
	WebElement ManageBuilding;
	
	@FindBy(id="txtBuildingName")
	WebElement BuildingName;
	
	@FindBy(xpath="/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[4]/td/input")
	WebElement SaveBuildingBtn;
	
	@FindBy(id="tStatMsg")
	WebElement ValidationMsgBuildingAddedSuccessfully;
	
	@FindBy(xpath="/html/body/form/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[3]/a")
	WebElement EditBuildingNameBtn;
	
	@FindBy(name="btnBuilding")
	WebElement UpdateBuildingNameBtn;
	
	@FindBy(partialLinkText="MANAGE BUILDING-BLOCKS")
	WebElement ManageBuildingBlock;
	
	@FindBy(name="ddlBuilding")
	WebElement SelectBuidlingDropdown;
	
	@FindBy(id="txtBlockName")
	WebElement BlockName;
	
	@FindBy(name="btnSubmit")
	WebElement SaveBuildingBlockNameBtn;
	
	@FindBy(xpath="/html/body/form/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[4]/a")
	WebElement ManageBuildingBlockEditBtn;
	
	/*@FindBy(id="tStatMsg")
	WebElement validBuilding_BlockAddedValidationMsg;*/
	
	@FindBy(id="tStatMsg")
	WebElement validBuilding_BlockUpdatedValidationMsg;
	
	@FindBy(name="btnSubmit")
	WebElement UpdateBuildingBlockNameBtn;
	
	@FindBy(id="tStatMsg")
	WebElement validBuilding_BlockAddedValidationMsgBtn;
	
	@FindBy(id="tStatMsg")
	WebElement ValidationMsgValidBuildingUpdated;
	
	@FindBy(partialLinkText="MANAGE FLOORS")
	WebElement ManageFloors;
	
	@FindBy(xpath="/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr[4]/td/input")
	WebElement saveFloorBtn;
	
	@FindBy(name="txtFloor")
	WebElement addFloorTextbox;
	
	@FindBy(xpath="/html/body/form/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[3]/a")
	WebElement editFloorBtn;
	
	@FindBy(name="btnSubmit")
	WebElement updateFloorBtn;
	
	@FindBy(xpath="//*[@id='tStatMsg']")
	WebElement validfloorAddedValidationMsg ;
	
	@FindBy(xpath="/html/body/form/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[3]/a")
	WebElement EditFloorBtn ;
	
	@FindBy(partialLinkText="MANAGE HOSPITAL ROOMS")
	WebElement ManageHsptlRoom;
	
	@FindBy(id="ddlBuildingName")  //start work from here
	WebElement ManageHsptlRoom_BuildingDrpdwn;
	
	@FindBy(id="ddlBlockName")
	WebElement ManageHsptlRoom_BlockDrpdwn;
	
	@FindBy(id="ddlFloorName")
	WebElement ManageHsptlRoom_FloorDrpdwn;
	
	@FindBy(id="txtRoomName")
	WebElement ManageHsptlRoom_RoomTextbox;
	
	@FindBy(id="txtRemark")
	WebElement ManageHsptlRoom_RemarksTextbox;
	
	@FindBy(name="btnSubmit")
	WebElement ManageHsptlRoom_SaveBtn;
	
	@FindBy(xpath="/html/body/form/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[7]/a")
	WebElement ManageHsptlRoom_EditBtn;
	
	@FindBy(name="btnSubmit")
	WebElement ManageHsptlRoom_UpdateBtn;
	
	@FindBy(id="tStatMsg")
	WebElement ManageHsptlRoom_DetailsUpdatedValidationMsg;
	
	@FindBy(xpath="//a[text()='HOSPITAL LOGO']")
	WebElement HospitalLogoLink;
	
	@FindBy(id="fuDocument")
	WebElement HospitalLogo_BrowseBtn;
	
	@FindBy(id="saveUserDp")
	WebElement HospitalLogo_UpdateBtn;
	
	@FindBy(xpath="//*[contains(@style,'color: red; font-size: 12px')]")
	WebElement logoUpdatedValidationMsg;
	
	@FindBy(xpath="//a[text()='Manage Hospital Details']")
	WebElement ManageHospitalDetailsLink;
	
	@FindBy(id="btnSave")
	WebElement ManageHospitalDetailsLink_SaveBtn;
	
	@FindBy(id="hospitalabbr")
	WebElement ManageHospitalDetailsLink_HsptlAbbrevatonTextbox;
	
	@FindBy(xpath="//*[contains(@placeholder,'Enter Address Line1')]")
	WebElement ManageHospitalDetailsLink_Add1Textbox;
		
	@FindBy(xpath="//*[contains(@placeholder,'Enter Address Line2')]")
	WebElement ManageHospitalDetailsLink_Add2Textbox;
	
	@FindBy(name="pin")
	WebElement ManageHospitalDetailsLink_PincodeTextbox;
	
	@FindBy(xpath="//*[contains(@placeholder,'Enter Telephone No.')]")
	WebElement ManageHospitalDetailsLink_HsptlPhoneNoTextbox;
	
	@FindBy(xpath="//*[contains(@placeholder,'Enter Fax')]")
	WebElement ManageHospitalDetailsLink_HsptlFaxTextbox;
	
	@FindBy(xpath="//*[contains(@placeholder,'Enter Email')]")
	WebElement ManageHospitalDetailsLink_HsptlEmailTextbox;
	
	@FindBy(xpath="//*[contains(@class,'input-group col-md-offset-4')]")
	WebElement ManageHospitalDetail_SaveBtnValidatonMsg;
	
	@FindBy(xpath="//a[text()='LOG IN-OUT REGISTER']")
	WebElement LoginLogoutRegister;
	
	@FindBy(id="ddlUser")
	WebElement LoginLogoutRegister_SelectUserDrpdwn;
	
	@FindBy(id="fromDt")
	WebElement LoginLogoutRegister_FromDate;	
	
	@FindBy(xpath="//th[text()='Today']")
	WebElement LoginLogoutRegister_Today;
	
	 @FindBy(id="btnUserDetail")
	WebElement LoginLogoutRegister_ShowBtn;
	
	//Constructor to initialize base class elements
	public ConfigureHospitalInfraPage() throws IOException {
		//super();
		PageFactory.initElements(driver, this);
	}

//Perform Actions
	
	//Validate: Administration link isDisplayed
	public boolean ValidateAdminLinkisDisplayed(){
		WebElement adminLink = Admin;
		return adminLink.isDisplayed();
	}
	
	//Validate: Administration link isEnabled
	public boolean ValidateAdminLinkisEnabled(){
		WebElement adminLink = Admin;
		return adminLink.isEnabled();
	}
	
	//Validate: Administration link isClickable
	public void ValidateAdminLinkisClickable(){
		WebElement adminLink = Admin;
		adminLink.click();
	}
	
	//Validate: Hospital Administration link isDisplayed
		public boolean ValidateHospitalAdminisDisplayed(){
			WebElement hospitalAdminLink = HospitalAdmin;
			return hospitalAdminLink.isDisplayed();
		}
	//Validate: Hospital Administration link isEnabled
		public boolean ValidateHospitalAdminisEnabled(){
		WebElement hospitalAdminLink = HospitalAdmin;
		return hospitalAdminLink.isEnabled() ;
		}

	//Validate: Hospital Administration link isClickable
		public void ValidateHospitalAdminisClickable(){
		WebElement hospitalAdminLink = HospitalAdmin;
		 hospitalAdminLink.click();
		}

	//Validate: Configure Hospital Infra link isDisplayed
		public boolean ValidateConfigureHospitalInfraLinkisDisplayed(){
		WebElement ConfigureHospitalInfraLink = ConfigureHospitalInfra;
		return ConfigureHospitalInfraLink.isDisplayed();
		}
			
	//Validate: Configure Hospital Infra link isEnabled
		public boolean ValidateConfigureHospitalInfraLinkisEnabled(){
		WebElement ConfigureHospitalInfraLink = ConfigureHospitalInfra;
		return ConfigureHospitalInfraLink.isEnabled() ;
		}

	//Validate:Configure Hospital Infra link isClickable
		public void ValidateConfigureHospitalInfraLinkisClickable(){
		WebElement ConfigureHospitalInfraLink = ConfigureHospitalInfra;
		ConfigureHospitalInfraLink.click();
		}

	//Validate: Manage Building  link isDisplayed
		public boolean ValidateManageBuildingisDisplayed(){
		WebElement manageBuildingLink = ManageBuilding;
		return manageBuildingLink.isDisplayed();
		}

	//Validate: Manage Building link isEnabled
		public boolean ValidateManageBuildingisEnabled(){
		WebElement manageBuildingLink = ManageBuilding;
		return manageBuildingLink.isEnabled();
		}
		
		//Validate: Manage Building link isClickable
		public void ValidateManageBuildingisClickable() throws InterruptedException{
		WebElement manageBuildingLink = ManageBuilding;
		manageBuildingLink.click();
		Thread.sleep(2000);
		}

		//Validate:Add Building Name text box isDisplayed
		public boolean ValidateBuildingNameisDisplayed(){
		WebElement manageBuildingLink = ManageBuilding;
		return manageBuildingLink.isDisplayed();
		}
		
		//Validate:Save Building btn isDisplayed
		public boolean saveBuildingbtnisDisplayed(){
		WebElement saveBuildingBtn = SaveBuildingBtn;
		return saveBuildingBtn.isDisplayed();
		}

		//Validate:Save Building btn isEnabled
		public boolean saveBuildingbtnisEnabled(){
		WebElement saveBuildingBtn = SaveBuildingBtn;
		return saveBuildingBtn.isEnabled();
		}
				
		//Validate:Save Building btn isClickable
		public void saveBuildingbtnisClickable() throws InterruptedException{
		WebElement saveBuildingBtn = SaveBuildingBtn;
		saveBuildingBtn.click();
		Thread.sleep(2000);
		}
				
		//Validate: Valid building name entered in text box
		public void validateValidBuildingNameEntered(String building) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
		BuildingName.sendKeys(building);
		Thread.sleep(2000);
		SaveBuildingBtn.click();
		Thread.sleep(2000);
		}
		
		public WebElement validBuildingAddedValidationMsg(){
		WebElement buildingAddedValidationMsg = ValidationMsgBuildingAddedSuccessfully;
		return buildingAddedValidationMsg;
		} 
	
		//Validate: Invalid building name entered,alert handled, get validation msg of Invalid BuilName
		public void validatedInvalidBuildingNameEntered(String invalidBuilding) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
		//Thread.sleep(2000);
		BuildingName.sendKeys(invalidBuilding);
		Thread.sleep(3000);
		SaveBuildingBtn.click();
		//Thread.sleep(3000);
		}
		
		//Validate: Edit Building button isDisplayed
		public boolean editBuildingNameBtnisDisplayed(){
		WebElement editButton = EditBuildingNameBtn;
		return editButton.isDisplayed();
		}
		
		//Validate: Manage Building page Edit Building button isEnabled	
		public boolean editBuildingNameBtnisEnabled() throws InterruptedException{
		WebElement editButton = EditBuildingNameBtn;
		Thread.sleep(3000);
		return editButton.isEnabled();
		}
		
		//Validate: Manage Building page Edit Building button isEnabled	
		public void editBuildingNameBtnisClickable() throws InterruptedException{
		WebElement editButton = EditBuildingNameBtn;
		Thread.sleep(2000);
		editButton.click();
		Thread.sleep(3000);
		}
		
		//Validate: Edit Building button isDisplayed
		public boolean updateBuildingBtnisDisplayed(){
		WebElement updateBuildingBtn = UpdateBuildingNameBtn;
		return updateBuildingBtn.isDisplayed();
		}
		
		//Validate: Manage Building page Edit Building button isEnabled	
		public boolean updateBuildingBtnisEnabled(){
		WebElement updateBuildingBtn = UpdateBuildingNameBtn;
		return updateBuildingBtn.isEnabled();
		}
		
		//Validate: Manage Building page Edit Building button isEnabled	
		public void updateBuildingBtnisClickable() throws InterruptedException{
		WebElement updateBuildingBtn = UpdateBuildingNameBtn;
		Thread.sleep(2000);
		updateBuildingBtn.click();
		Thread.sleep(2000);
		}
		
		//Validate: On ManageBuilding page, update Building name by Edit btn using valid data
		public void editBuildingNameAndUpdateValidData(String updatedBuilding) throws InterruptedException{
		Thread.sleep(2000);
		WebElement editButton = EditBuildingNameBtn;
		editButton.click();
		BuildingName.clear();
		Thread.sleep(2000);
		BuildingName.sendKeys(updatedBuilding); 
		Thread.sleep(2000);
		UpdateBuildingNameBtn.click();
	//	Thread.sleep(2000);
		}
		
		public WebElement validBuildingUpdateValidationMsg(){
		WebElement validBuildingUpdatedValidationMsg = ValidationMsgValidBuildingUpdated;
		return validBuildingUpdatedValidationMsg;	
		}
		
		//Validate: On ManageBuilding page update Building name by Edit btn using invalid data-Alert handled,getText of Alert, compare text
		public void editBuildingNameAndUpdateInvalidData(String updatedInvalidBuilding) throws InterruptedException{
		WebElement editButton = EditBuildingNameBtn;
		editButton.click();
		BuildingName.clear();
		Thread.sleep(3000);
		BuildingName.sendKeys(updatedInvalidBuilding); 
		Thread.sleep(3000);
		UpdateBuildingNameBtn.click();
//		Thread.sleep(2000);
		}		
		
		//Validate: ManageBuildingBlock link is displayed
		public boolean validateManageBuildingBlockDisplayed(){
		WebElement manageBuildingBlockLink = ManageBuildingBlock;
		return manageBuildingBlockLink.isDisplayed();
		}
				
		//Validate: Manage Building-BLock link isEnabled
		public boolean validateManageBuildingBlockEnabled(){
		WebElement manageBuildingBlockLink = ManageBuildingBlock;
		return manageBuildingBlockLink.isEnabled();
		}
				
		//Validate: Manage Building-BLock link isClickable
		public void validateManageBuildingBlockClickable(){
		WebElement manageBuildingBlockLink = ManageBuildingBlock;
		 manageBuildingBlockLink.click();
		}
		 
		//Validate: SelectBuidling Name Dropdown is displayed
		public boolean validateSelectBuildingDropdownDisplayed(){
		WebElement selectBuidlingDropdown = SelectBuidlingDropdown;
		return selectBuidlingDropdown.isDisplayed();
		}
		
		//Validate: SelectBuidling Name Dropdown is enabled
		public boolean validateSelectBuildingDropdownEnabled(){
		WebElement selectBuidlingDropdown = SelectBuidlingDropdown;
		return selectBuidlingDropdown.isEnabled();
		}
		
		//Validation : select BuildingName DropDown has Multiple values
		public boolean validateSelectBuildingDropdwnIsMultiple() throws InterruptedException{
		Thread.sleep(3000);
		Select ListBox = new Select(SelectBuidlingDropdown);
		boolean value = ListBox.isMultiple() ;
		return value;
		}
		
		//Validate:Enter Block Name textbox is displayed
		public boolean enterBlockNameTextboxDisplayed(){
		WebElement enterBlockName = BlockName;
		return enterBlockName.isDisplayed();
		}
				
		//Validate: Save Building-BLock Button is displayed
		public boolean saveBlockNameBtnDisplayed(){
		WebElement saveBlockNameBtn = SaveBuildingBlockNameBtn;
		return saveBlockNameBtn.isDisplayed();
		}
				
		//Validate:Save Building-BLock Button is enabled
		public boolean saveBlockNameBtnEnabled(){
		WebElement saveBlockNameBtn = SaveBuildingBlockNameBtn;
		return saveBlockNameBtn.isEnabled();
		}		
				
		//Validate: Save Building-BLock Button isClickable
		public void saveBlockNameBtnClickable(){
		WebElement saveBlockNameBtn = SaveBuildingBlockNameBtn;
		saveBlockNameBtn.click();
		}
		
		//Validate: Edit Building-BLock Button is displayed
		public boolean editBuildingBlockBtnisDisplayed(){
		WebElement editBlockNameBtn = ManageBuildingBlockEditBtn;
		return editBlockNameBtn.isDisplayed();
		}
						
		//Validate: Edit Building-BLock Button is enabled
		public boolean editBuildingBlockBtnisEnabled(){
		WebElement editBlockNameBtn = ManageBuildingBlockEditBtn;
		return editBlockNameBtn.isEnabled();
		}		
						
		//Validate: Edit Building-BLock Button isClickable
		public void editBuildingBlockBtnisClickable(){
		WebElement editBlockNameBtn = ManageBuildingBlockEditBtn;
		editBlockNameBtn.click();
		}		
		
		//Validate: To SelectBuidling and enter Block-Name 
		public void selectBuidingAndBlockName(String blockName) throws InterruptedException{
		Select sel = new Select(SelectBuidlingDropdown);
		sel.selectByIndex(4);
		Thread.sleep(2000);
		BlockName.sendKeys(blockName);
		Thread.sleep(2000);
		SaveBuildingBlockNameBtn.click();
		Thread.sleep(2000);
		}
		
		public WebElement validBuildingBlocknameAddedValidationMsg(){
		WebElement validationMsg = validBuilding_BlockUpdatedValidationMsg;
		return validationMsg;
		}
		
		//Validate: Invalid Building & Block-Name entered, alert handled,getText alert,comparison of text
		public void invalidBuidingAndBlockNameAdded(String blockName) throws InterruptedException{
		Select sel = new Select(SelectBuidlingDropdown);
		sel.selectByIndex(4);
		Thread.sleep(2000);
		BlockName.sendKeys(blockName);
		Thread.sleep(2000);
		SaveBuildingBlockNameBtn.click();
		Thread.sleep(2000);
		}
		
		//Validate: Manage Building-Block page Edit Building button isDisplayed	
		public boolean manageBuildingBlockEditBtnisDisplayed(){
		WebElement editButton = ManageBuildingBlockEditBtn;
		return editButton.isDisplayed();
		}
				
		//Validate: Manage Building-Block page Edit Building button isEnabled	
		public boolean manageBuildingBlockEditBtnisEnabled(){
		WebElement editButton = ManageBuildingBlockEditBtn;
		return editButton.isEnabled();
		}
		
		//Validate: Manage Building-Block page Edit Building button isEnabled	
		public void manageBuildingBlockEditBtnisClickable(){
		WebElement editButton = ManageBuildingBlockEditBtn;
		editButton.click();
		}
		
		//Validate: Manage Building-Block page Edit Building button isDisplayed	
		public boolean updateBuildongBlockBtnisDisplayed(){
		WebElement updateBuildongBlockBtn = UpdateBuildingBlockNameBtn;
		return updateBuildongBlockBtn.isDisplayed();
		}
						
		//Validate: Manage Building-Block page Edit Building button isEnabled	
		public boolean updateBuildongBlockBtnisEnabled(){
		WebElement updateBuildongBlockBtn = UpdateBuildingBlockNameBtn;
		return updateBuildongBlockBtn.isEnabled();
		}
		
		//Validate: Edit Building-BLock Button isClickable
		public void updateBuildongBlockBtnisClickable(){
		WebElement updateBuildongBlockBtn = UpdateBuildingBlockNameBtn;
		updateBuildongBlockBtn.click();
		}	
				
		//Validate: Valid block name updated on  Manage Building-Block page using Edit btn 
		public void editBuildingBlockNameAndUpdate(String updatedBlock) throws InterruptedException{
		ManageBuildingBlockEditBtn.click();;
		Thread.sleep(2000);
		BlockName.clear();
		Thread.sleep(2000);
		BlockName.sendKeys(updatedBlock); 
		Thread.sleep(2000);
		UpdateBuildingBlockNameBtn.click();
		Thread.sleep(2000);
		}
		
		public WebElement buildingBlockUpdateValidationMsg(){
		WebElement validBuildingBlockUpdated = validBuilding_BlockUpdatedValidationMsg;
		return validBuildingBlockUpdated;
		}
	
		//Validate: Invalid block name updated on  Manage Building-Block page using Edit btn 
		public void invalidBuildingBlockNameAndUpdate(String updatedBlock) throws InterruptedException{
		WebElement editButton = ManageBuildingBlockEditBtn;
		editButton.click();
		BlockName.clear();
		Thread.sleep(2000);
		BlockName.sendKeys(updatedBlock); 
		Thread.sleep(2000);
		UpdateBuildingBlockNameBtn.click();
		}
	
		//Validate: Manage Floors  link isDisplayed
		public boolean ValidateManageFloorisDisplayed(){
		WebElement manageFloorLink = ManageFloors;
		return manageFloorLink.isDisplayed();
		}

		//Validate: Manage Floors link isEnabled
		public boolean ValidateManageFloorisEnabled(){
		WebElement manageFloorLink = ManageFloors;
		return manageFloorLink.isEnabled();
		}
				
		//Validate: Manage Floors link isClickable
		public void ValidateManageFloorisClickable() throws InterruptedException{
		WebElement manageFloorLink = ManageFloors;
		manageFloorLink.click();
		Thread.sleep(2000);
		}
		
		//Validate:Add Floor Textbox button isDisplayed
		public boolean addFloorTextboxIsDisplayed(){
		WebElement addFloor = addFloorTextbox;
		return addFloor.isDisplayed();
				}
						
		//Validate:Add Floor Textbox isEnabled	
		public boolean addFloorTextboxIsEnabled(){
		WebElement addFloor = addFloorTextbox;
		return addFloor.isEnabled();
		}
		
		//Validate: SaveFloor button isDisplayed
		public boolean saveFloorBtnIsDisplayed(){
		WebElement saveFloor = saveFloorBtn;
		return saveFloor.isDisplayed();
		}
				
		//Validate:SaveFloor button isEnabled	
		public boolean saveFloorBtnIsEnabled() throws InterruptedException{
		WebElement saveFloor = saveFloorBtn;
		Thread.sleep(2000);
		return saveFloor.isEnabled();
		}
		
		//Validate:SaveFloor button isClickable	
		public void saveFloorBtnIsClickable() throws InterruptedException{
		WebElement saveFloor = saveFloorBtn;
		Thread.sleep(2000);
		saveFloor.click();
		}
		
		//Validate:EditFloor button isDisplayed
		public boolean editFloorBtnIsDisplayed(){
		WebElement editFloor = editFloorBtn;
		return editFloor.isDisplayed();
		}
					
		//Validate:EditFloor button isEnabled	
		public boolean editFloorBtnIsEnabled() throws InterruptedException{
		WebElement editFloor = editFloorBtn;
		Thread.sleep(2000);
		return editFloor.isEnabled();
		}
				
		//Validate:EditFloor button isClickable	
		public void editFloorBtnIsClickable() throws InterruptedException{
		WebElement editFloor = editFloorBtn;
		Thread.sleep(2000);
		editFloor.click();
		}
		
		//Validate:Update Floor button isDisplayed
		public boolean updateFloorBtnIsDisplayed(){
		WebElement updateFloor = updateFloorBtn;
		return updateFloor.isDisplayed();
		}
							
		//Validate:Update Floor button isEnabled	
		public boolean updateFloorBtnIsEnabled() throws InterruptedException{
		WebElement updateFloor = updateFloorBtn;
		Thread.sleep(2000);
		return updateFloor.isEnabled();
		}
						
		//Validate:Update Floor button isClickable	
		public void updateFloorBtnIsClickable() throws InterruptedException{
		WebElement updateFloor = updateFloorBtn;
		Thread.sleep(2000);
		updateFloor.click();
		}
		
		//Validate: Valid Floor name entered in text box
		public void validFloorAdded(String floorName) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
		addFloorTextbox.clear();
		Thread.sleep(2000);	
		addFloorTextbox.sendKeys(floorName);
		Thread.sleep(2000);
		saveFloorBtn.click();
		Thread.sleep(2000);
		}
				
		//Validate: Print validation msg floor if duplicate floor name added
		public WebElement duplicateFloorAddedValidationMsg(){
		WebElement floorAddedValidationMsg = validfloorAddedValidationMsg;
		return floorAddedValidationMsg;
		} 
		
		//Validate: Print validation msg floor if duplicate floor name added
		public WebElement validFloorAddedValidationMsg(){
		WebElement floorAddedValidationMsg = validfloorAddedValidationMsg;
		return floorAddedValidationMsg;
		} 
		
		//Validate: Invalid floor name entered,alert handled, get validation msg 
		public void invalidFloorAdded(String invalidFloor) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
		Thread.sleep(2000);
		addFloorTextbox.clear();
		addFloorTextbox.sendKeys(invalidFloor);
		Thread.sleep(3000);
		saveFloorBtn.click();
	//	Thread.sleep(3000);
		}
		//Validate: Floor name updated using valid data
				public void editFloor_UpdateValidData(String updatedFloor) throws InterruptedException{
				Thread.sleep(2000);
				WebElement editButton = EditFloorBtn;
				editButton.click();
				addFloorTextbox.clear();
				Thread.sleep(2000);
				addFloorTextbox.sendKeys(updatedFloor); 
				Thread.sleep(2000);
				updateFloorBtn.click();
				}
				
				//Validate:Print validation msg of Floor name updated using valid data
				public WebElement validFloorUpdatedValidationMsg(){
				WebElement validBuildingUpdatedValidationMsg = validfloorAddedValidationMsg;
				return validBuildingUpdatedValidationMsg;	
				}
				
				//Validate: Floor name updated using valid data 
				public void editFloor_UpdateInvalidData(String updateInvalidFloor) throws InterruptedException{
				WebElement editButton = EditFloorBtn;
				editButton.click();
				addFloorTextbox.clear();
				Thread.sleep(3000);
				addFloorTextbox.sendKeys(updateInvalidFloor); 
				Thread.sleep(3000);
				updateFloorBtn.click();
				}	
				//Validate:Manage Hospital Rooms isDisplayed
				public boolean manageHospitalRoomsIsDisplayed(){
				WebElement mhr = ManageHsptlRoom;
				return mhr.isDisplayed();
				}
									
				//Validate:Manage Hospital Rooms isEnabled	
				public boolean manageHospitalRoomsIsEnabled() throws InterruptedException{
				WebElement mhr = ManageHsptlRoom;
				return mhr.isEnabled();
				}
								
				//Validate:Manage Hospital Rooms isClickable	
				public void manageHospitalRoomsIsClickable() throws InterruptedException{
				WebElement mhr = ManageHsptlRoom;
				Thread.sleep(2000);
				mhr.click();
				}
				
				//Validate: On Manage Hospital Room : SelectBuidling Name Dropdown is displayed
				public boolean buildingDropdownDisplayed(){
				WebElement selectBuidlingDropdown = ManageHsptlRoom_BuildingDrpdwn;
				return selectBuidlingDropdown.isDisplayed();
				}
				
				//Validate: On Manage Hospital Room : SelectBuidling Name Dropdown is enabled
				public boolean buildingDropdownEnabled(){
				WebElement selectBuidlingDropdown = ManageHsptlRoom_BuildingDrpdwn;
				return selectBuidlingDropdown.isEnabled();
				}
				
				//Validation: On Manage Hospital Room : select BuildingName DropDown has Multiple values
				public boolean buildingDropdwnIsMultiple() throws InterruptedException{
				Select ListBox = new Select(ManageHsptlRoom_BuildingDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				}
				
				//Validate: On Manage Hospital Room : block Name Dropdown is displayed
				public boolean blockDropdownDisplayed(){
				WebElement selectBuidlingDropdown = ManageHsptlRoom_BlockDrpdwn;
				return selectBuidlingDropdown.isDisplayed();
				}
				
				//Validate: On Manage Hospital Room : block Name Dropdown is enabled
				public boolean blockDropdownEnabled(){
				WebElement selectBuidlingDropdown = ManageHsptlRoom_BlockDrpdwn;
				return selectBuidlingDropdown.isEnabled();
				}
				
				//Validation: On Manage Hospital Room : select block DropDown has Multiple values
				public boolean blockDropdwnIsMultiple() throws InterruptedException{
				Select ListBox = new Select(ManageHsptlRoom_BlockDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				} 
			
				//Validate: On Manage Hospital Room : Select floor Dropdown is displayed
				public boolean floorDropdownDisplayed(){
				WebElement selectBuidlingDropdown = ManageHsptlRoom_FloorDrpdwn;
				return selectBuidlingDropdown.isDisplayed();
				}
				
				//Validate: On Manage Hospital Room : Select floor Dropdown is enabled
				public boolean floorDropdownEnabled(){
				WebElement selectBuidlingDropdown = ManageHsptlRoom_FloorDrpdwn;
				return selectBuidlingDropdown.isEnabled();
				}
				
				//Validation: On Manage Hospital Room : select floor DropDown has Multiple values
				public boolean floorDropdwnIsMultiple() throws InterruptedException{
				Select ListBox = new Select(ManageHsptlRoom_FloorDrpdwn);
				boolean value = ListBox.isMultiple() ;
				return value;
				} 
				
				//Validate: On Manage Hospital Room : Select Room textbox is displayed
				public boolean roomNumbeTxtboxDisplayed(){
				WebElement selectBuidlingDropdown = ManageHsptlRoom_RoomTextbox;
				return selectBuidlingDropdown.isDisplayed();
				}
				
				//Validate: On Manage Hospital Room : Select Room textbox is enabled
				public boolean roomNumbeTxtboxEnabled(){
				WebElement selectBuidlingDropdown = ManageHsptlRoom_RoomTextbox;
				return selectBuidlingDropdown.isEnabled();
				}
				
				//Validate: On Manage Hospital Room : Select Remarks textbox is displayed
				public boolean remarksTxtboxDisplayed(){
				WebElement selectBuidlingDropdown = ManageHsptlRoom_RemarksTextbox;
				return selectBuidlingDropdown.isDisplayed();
				}
				
				//Validate: On Manage Hospital Room : Select Remarks textbox is enabled
				public boolean remarksTxtboxEnabled(){
				WebElement selectBuidlingDropdown = ManageHsptlRoom_RemarksTextbox;
				return selectBuidlingDropdown.isEnabled();
				}
				
				//Validate:On Manage Hospital Room : Save Btn is displayed
				public boolean saveHsptlRoomsBtnisDisplayed(){
					WebElement saveBtn = ManageHsptlRoom_SaveBtn;
					return saveBtn.isDisplayed();
				}
				
				//Validate:On Manage Hospital Room : Save Btn is enabled
				public boolean saveHsptlRoomsBtnisEnabled(){
					WebElement saveBtn = ManageHsptlRoom_SaveBtn;
					return saveBtn.isEnabled();
				}
				
				//Validate:On Manage Hospital Room : Save Btn is clickable
				public void saveHsptlRoomsBtnisClickable(){
					WebElement saveBtn = ManageHsptlRoom_SaveBtn;
					 saveBtn.click();
				}
				
				//Validate:On Manage Hospital Room : Edit Btn is displayed
				public boolean editHsptlRoomsBtnisDisplayed(){
					WebElement editBtn = ManageHsptlRoom_EditBtn;
					return editBtn.isDisplayed();
				}
				
				//Validate:On Manage Hospital Room : Edit Btn is displayed
				public boolean editHsptlRoomsBtnisEnabled(){
					WebElement editBtn = ManageHsptlRoom_EditBtn;
					return editBtn.isEnabled();
				}
				
				//Validate:On Manage Hospital Room : Edit Btn is displayed
				public void editHsptlRoomsBtnisClickable(){
					WebElement editBtn = ManageHsptlRoom_EditBtn;
					editBtn.click();
				}
				
				//Validate:On Manage Hospital Room : Update Btn is displayed
				public boolean updateHsptlRoomsBtnisDisplayed(){
					WebElement updateBtn = ManageHsptlRoom_UpdateBtn;
					return updateBtn.isDisplayed();
				}
				
				//Validate:On Manage Hospital Room : Update Btn is displayed
				public boolean updateHsptlRoomsBtnisEnabled(){
					WebElement updateBtn = ManageHsptlRoom_UpdateBtn;
					return updateBtn.isEnabled();
				}
				
				//Validate:On Manage Hospital Room : Update Btn is displayed
				public void updateHsptlRoomsBtnisClickable(){
					WebElement updateBtn = ManageHsptlRoom_UpdateBtn;
					updateBtn.click();
				}

				public WebElement hsptlRoomsUpdatedValidationMsg(){
					WebElement validationMsg = ManageHsptlRoom_DetailsUpdatedValidationMsg;
					return validationMsg;
					}
				
				// Validate: On Manage Hospital Room : Entering valid data
				public void enteringValidDataForHospitalRooms(String RoomNumber, String Remarks) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
				Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
				building.selectByIndex(1);
				Thread.sleep(2000);
				Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
				block.selectByIndex(1);
				Thread.sleep(2000);
				Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
				floor.selectByIndex(1);
				Thread.sleep(2000);
				ManageHsptlRoom_RoomTextbox.sendKeys(RoomNumber);
				Thread.sleep(2000);
				ManageHsptlRoom_RemarksTextbox.sendKeys(Remarks);
				Thread.sleep(2000);
				ManageHsptlRoom_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				// Validate: Print validation msg while adding valid data
				public WebElement validHospitalzDetailsAddedValidationMsg(){
				WebElement hospitalDetailsAddedValidationMsg = ManageHsptlRoom_DetailsUpdatedValidationMsg;
				return hospitalDetailsAddedValidationMsg;
				}
				
				// Validate:On Manage Hospital Room : Selecting only Building from dropdown
				public void manageHospitalRooms_SelectBuildingOnly() throws InterruptedException{
					
				Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
				building.selectByIndex(1);
				Thread.sleep(2000);
				ManageHsptlRoom_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				// Validate: On Manage Hospital Room : Selecting Building&Block only from dropdown
				public void manageHospitalRooms_SelectBuildingAndBlock() throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
				Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
				building.selectByIndex(1);
				Thread.sleep(2000);
				Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
				block.selectByIndex(1);
				ManageHsptlRoom_SaveBtn.click();
				}

				// Validate: On Manage Hospital Room : Selecting Building Block & Floor
				public void manageHospitalRooms_SelectBuildingBlockFloor() throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
				Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
				building.selectByIndex(1);
				Thread.sleep(2000);
				Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
				block.selectByIndex(1);
				Thread.sleep(2000);
				Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
				floor.selectByIndex(1);
				Thread.sleep(2000);
				ManageHsptlRoom_SaveBtn.click();
				Thread.sleep(2000);
				}

				// Validate: On Manage Hospital Room :Entering Building Block Floor & RoomNo.
				public void manageHospitalRooms_EnteringBuildingBlockFloorRoomNo(String RoomNumber) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
				Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
				building.selectByIndex(1);
				Thread.sleep(2000);
				Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
				block.selectByIndex(1);
				Thread.sleep(2000);
				Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
				floor.selectByIndex(1);
				Thread.sleep(2000);
				ManageHsptlRoom_RoomTextbox.sendKeys(RoomNumber);
				Thread.sleep(2000);
				ManageHsptlRoom_SaveBtn.click();
				Thread.sleep(2000);
				}

				// Validate: On Manage Hospital Room :Entering Building Block Floor & Remarks.
				public void manageHospitalRooms_EnteringBuildingBlockFloorRemarks(String Remarks) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
				Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
				building.selectByIndex(1);
				Thread.sleep(2000);
				Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
				block.selectByIndex(1);
				Thread.sleep(2000);
				Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
				floor.selectByIndex(1);
				Thread.sleep(2000);
				ManageHsptlRoom_RoomTextbox.clear();
				Thread.sleep(2000);
				ManageHsptlRoom_RemarksTextbox.sendKeys(Remarks);
				Thread.sleep(2000);
				ManageHsptlRoom_SaveBtn.click();
				Thread.sleep(2000);
				}
				
				// Validate: On Manage Hospital Room :Entering invalid data.
					public void enteringInvalidData_ManageHospitalRooms(String InvalidRoomNumber, String InvalidRemarks) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
					building.selectByIndex(1);
					Thread.sleep(2000);
					Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
					block.selectByIndex(1);
					Thread.sleep(2000);
					Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
					floor.selectByIndex(1);
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.sendKeys(InvalidRoomNumber);
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.sendKeys(InvalidRemarks);
					Thread.sleep(2000);
					ManageHsptlRoom_SaveBtn.click();
					Thread.sleep(2000);
					}
					
					// Validate: On Manage Hospital Room :Entering invalid data in RoomNo and left blank remarks.
					public void enterInvalidRoomNoBlankRemarks_ManageHospitalRooms(String InvalidRoomNumber) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
					building.selectByIndex(1);
					Thread.sleep(2000);
					Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
					block.selectByIndex(1);
					Thread.sleep(2000);
					Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
					floor.selectByIndex(1);
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.sendKeys(InvalidRoomNumber);
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_SaveBtn.click();
					Thread.sleep(2000);
					}

					// Validate: On Manage Hospital Room :Entering invalid data in RoomNo and valid in remarks.
					public void enteringInvalidRoomValidRemarks_ManageHospitalRooms(String InvalidRoomNumber,String ValidRemarks) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
					building.selectByIndex(1);
					Thread.sleep(2000);
					Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
					block.selectByIndex(1);
					Thread.sleep(2000);
					Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
					floor.selectByIndex(1);
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.sendKeys(InvalidRoomNumber);
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.sendKeys(ValidRemarks);
					Thread.sleep(2000);
					ManageHsptlRoom_SaveBtn.click();
					Thread.sleep(2000);
					}
					
					// Validate: On Manage Hospital Room :RoomNo left blank and entering invalid data in remarks.
					public void roomNoBlankEnterInvalidRemarks_ManageHospitalRooms(String InvalidRemarks) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
					building.selectByIndex(1);
					Thread.sleep(2000);
					Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
					block.selectByIndex(1);
					Thread.sleep(2000);
					Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
					floor.selectByIndex(1);
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.sendKeys(InvalidRemarks);
					Thread.sleep(2000);
					ManageHsptlRoom_SaveBtn.click();
					Thread.sleep(2000);
					}

					// Validate: On Manage Hospital Room :Entering valid data in RoomNo and invalid in remarks.
					public void enterValidRoomNoInvalidRemarks_ManageHospitalRooms(String ValidRoomNumber,String InvalidRemarks) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
					building.selectByIndex(1);
					Thread.sleep(2000);
					Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
					block.selectByIndex(1);
					Thread.sleep(2000);
					Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
					floor.selectByIndex(1);
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.sendKeys(ValidRoomNumber);
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.sendKeys(InvalidRemarks);
					Thread.sleep(2000);
					ManageHsptlRoom_SaveBtn.click();
					Thread.sleep(2000);
					}

					// Validate: On Manage Hospital Room : edit Hospital Rooms with valid data
					public void editHsptlRoomsInOneGo(String RoomNumber, String Remarks) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					ManageHsptlRoom_EditBtn.click();
					Thread.sleep(2000);
					Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
					building.selectByIndex(1);
					Thread.sleep(2000);
					Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
					block.selectByIndex(1);
					Thread.sleep(2000);
					Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
					floor.selectByIndex(1);
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.sendKeys(RoomNumber);
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.sendKeys(Remarks);
					Thread.sleep(2000);
					ManageHsptlRoom_UpdateBtn.click();
					Thread.sleep(2000);
					}
					
					// Validate:On Manage Hospital Room : Selecting only Building from dropdown
					public void editHsptlRooms_SelectBuildingOnly() throws InterruptedException{
					ManageHsptlRoom_EditBtn.click();
					Thread.sleep(2000);
					Select building = new Select(ManageHsptlRoom_BuildingDrpdwn);
					building.selectByIndex(0);
					Thread.sleep(2000);
					Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
					floor.selectByIndex(0);
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.clear();
					Thread.sleep(2000);
					Select build = new Select(ManageHsptlRoom_BuildingDrpdwn);
					build.selectByIndex(1);
					Thread.sleep(2000);
					ManageHsptlRoom_UpdateBtn.click();
					Thread.sleep(2000);
					}
					
					// Validate: On Edit Hospital Room : Selecting Building&Block only from dropdown
					public void editHsptlRooms_SelectBuildingBlockOnly() throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					Select block = new Select(ManageHsptlRoom_BlockDrpdwn);
					block.selectByIndex(1);
					ManageHsptlRoom_UpdateBtn.click();
					}
					
					// Validate: Edit Hospital Room : Selecting Building Block & Floor
					public void editHsptlRooms_SelectBuildingBlockFloor() throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					Select floor = new Select(ManageHsptlRoom_FloorDrpdwn);
					floor.selectByIndex(1);
					Thread.sleep(2000);
					ManageHsptlRoom_UpdateBtn.click();
					Thread.sleep(2000);
					}
					
					// Validate: Edit Hospital Room :Entering Building Block Floor & RoomNo.
					public void editHsptlRooms_EnteringBuildingBlockFloorRoomNo(String RoomNumber) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					ManageHsptlRoom_RoomTextbox.sendKeys(RoomNumber);
					Thread.sleep(2000);
					ManageHsptlRoom_UpdateBtn.click();
					Thread.sleep(2000);
					}
					
					// Validate: Edit Hospital Room :Entering Building Block Floor & Remarks.
					public void editHsptlRooms_EnteringBuildingBlockFloorRemarks(String Remarks) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					ManageHsptlRoom_RoomTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.sendKeys(Remarks);
					Thread.sleep(2000);
					ManageHsptlRoom_UpdateBtn.click();
					Thread.sleep(2000);
					}					
					
					// Validate: On Manage Hospital Room :Entering invalid data.
					public void enteringInvalidRoomRemarks_editHsptlRooms(String InvalidRoomNumber, String InvalidRemarks) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					ManageHsptlRoom_RoomTextbox.sendKeys(InvalidRoomNumber);
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.sendKeys(InvalidRemarks);
					Thread.sleep(2000);
					ManageHsptlRoom_UpdateBtn.click();
					Thread.sleep(2000);
					}
					
					// Validate: On Manage Hospital Room :Entering invalid data in RoomNo and left blank remarks.
					public void enterInvalidRoomNoBlankRemarks_editHsptlRooms(String InvalidRoomNumber) throws InterruptedException{ //Used parameterized method bcz while using sendkeys func need to pass the value and that can't be hardcoded so whenever we use sendkeys we make that method parameterized and pass reference var
					ManageHsptlRoom_RoomTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RoomTextbox.sendKeys(InvalidRoomNumber);
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_UpdateBtn.click();
					Thread.sleep(2000);
					}
					
					// Validate: Edit Hospital Room :Entering invalid data in RoomNo and valid in remarks.
public void enteringInvalidRoomValidRemarks_editHsptlRoom(String ValidRemarks) throws InterruptedException{ //Used parameterized method bcz 
					/*	ManageHsptlRoom_RoomTextbox.clear();
						Thread.sleep(2000);
						ManageHsptlRoom_RoomTextbox.sendKeys(InvalidRoomNumber);
						Thread.sleep(2000);*/
						ManageHsptlRoom_RemarksTextbox.clear();
						Thread.sleep(2000);
						ManageHsptlRoom_RemarksTextbox.sendKeys(ValidRemarks);
						Thread.sleep(2000);
						ManageHsptlRoom_UpdateBtn.click();
						Thread.sleep(2000);
						}	
					

//Validate: On Manage Hospital Room :RoomNo left blank and entering invalid data in remarks.
	public void roomNoBlankEnterInvalidRemarks_editHsptlRooms(String InvalidRemarks) throws InterruptedException{ //Used parameterized method bcz while using sendkeys 
					ManageHsptlRoom_RoomTextbox.clear();
					Thread.sleep(2000);
					ManageHsptlRoom_RemarksTextbox.sendKeys(InvalidRemarks);
					Thread.sleep(2000);
					ManageHsptlRoom_UpdateBtn.click();
					Thread.sleep(2000);
					}

	// Validate: On Manage Hospital Room :Entering valid data in RoomNo and invalid in remarks.
public void enterValidRoomNoInvalidRemarks_editHsptlRooms(String ValidRoomNumber,String InvalidRemarks) throws InterruptedException {
						ManageHsptlRoom_RoomTextbox.clear();
						Thread.sleep(2000);
						ManageHsptlRoom_RoomTextbox.sendKeys(ValidRoomNumber);
						Thread.sleep(2000);
						ManageHsptlRoom_RemarksTextbox.clear();
						Thread.sleep(2000);
						ManageHsptlRoom_RemarksTextbox.sendKeys(InvalidRemarks);
						Thread.sleep(2000);
						ManageHsptlRoom_UpdateBtn.click();
						Thread.sleep(2000);
						}

				//Validate: Hospital Logo link isDisplayed
					public boolean hospitalLogoisDisplayed(){
						WebElement logo = HospitalLogoLink;
						return logo.isDisplayed();
					}
					
					//Validate: Hospital Logo link isEnabled
					public boolean hospitalLogoisEnabled(){
						WebElement logo = HospitalLogoLink;
						return logo.isEnabled();
					}
					
					//Validate: Hospital Logo link isClickable
					public void hospitalLogoisClickable(){
						WebElement logo = HospitalLogoLink;
						 logo.click();
					}

					//Validate: Hospital Logo BrowseBtn isDisplayed
					public boolean hospitalLogo_BrowseBtnisDisplayed(){
						WebElement browseBtn = HospitalLogo_BrowseBtn;
						return browseBtn.isDisplayed();
					}
					
					//Validate: Hospital Logo BrowseBtn isEnabled
					public boolean hospitalLogo_BrowseBtnisEnabled(){
						WebElement browseBtn = HospitalLogo_BrowseBtn;
						return browseBtn.isEnabled();
					}
					
			/*		//Validate: Hospital Logo BrowseBtn isClickable
					public void hospitalLogo_UploadLogo() throws InterruptedException {
					WebElement browseBtn = HospitalLogo_BrowseBtn;
					browseBtn.sendKeys("C:\\Users\\Sonali-pc\\Desktop\\download.jpg");
					
				//	browseBtn.sendKeys("C:\\Users\\DELL\\Desktop\\HospitalLogo.jpg");
					
					WebElement updateBtn = HospitalLogo_UpdateBtn;
					Thread.sleep(2000);
					updateBtn.click();
					}
						*/
						
					public void hospitalLogo_UploadLogo() throws InterruptedException {
						
						WebElement browseBtn = HospitalLogo_BrowseBtn;
						
							

							if(isPathVisible(HospitalLogo_BrowseBtn,"C:\\Users\\Sonali-pc\\Desktop\\download.jpg")==true){
								WebElement updateBtn = HospitalLogo_UpdateBtn;
								updateBtn.click();
							}
						
									
						else if(isPathVisible(HospitalLogo_BrowseBtn,"C:\\Users\\DELL\\Desktop\\HospitalLogo.jpg")==true){
							//isPathVisible();
							WebElement updateBtn = HospitalLogo_UpdateBtn;
							updateBtn.click();
						}
							
						
						
					}
					
					
					
						
					//Validate: Print validation msg HospitalLogo updated successfully.
					public WebElement logoUpdatedValidationMsg() throws InterruptedException{
					WebElement logoUpdatedMsg = logoUpdatedValidationMsg;
					Thread.sleep(2000);
					return logoUpdatedMsg;
					} 
					 
					//Validate: Hospital Logo UpdateBtn isDisplayed
					public boolean hospitalLogo_UpdateBtnIsDisplayed(){
						WebElement UpdateBtn = HospitalLogo_UpdateBtn;
						return UpdateBtn.isDisplayed();
					}
					
					//Validate: Hospital Logo UpdateBtn isEnabled
					public boolean hospitalLogo_UpdateBtnIsEnabled(){
						WebElement UpdateBtn = HospitalLogo_UpdateBtn;
						return UpdateBtn.isEnabled();
					}
					
					//Validate: Hospital Logo BrowseBtn isClickable
					public void hospitalLogo_UpdateBtnIsClickable(){
					WebElement updateBtn = HospitalLogo_UpdateBtn;
					updateBtn.click();
					}
					
					//Validate: ManageHospitalDetails isDisplayed
					public boolean  ManageHospitalDetails_IsDisplayed(){
						WebElement mhl = ManageHospitalDetailsLink;
						return mhl.isDisplayed();
					}
					
					//Validate: ManageHospitalDetails isEnabled
					public boolean  ManageHospitalDetailsLink_IsEnabled(){
						WebElement mhl = ManageHospitalDetailsLink;
						return mhl.isEnabled();
					}

					//Validate: ManageHospitalDetails isEnabled
					public void ManageHospitalDetailsLink_IsClickabled(){
						WebElement mhl = ManageHospitalDetailsLink;
						 mhl.click();
					}

					//Validate: ManageHospitalDetails_HsptlAbbrevatonTextbox isDisplayed
					public boolean  ManageHospitalDetailsLink_HsptlAbbrevatonTextboxIsDisplayed(){
						WebElement abbreviation = ManageHospitalDetailsLink_HsptlAbbrevatonTextbox;
						return abbreviation.isDisplayed();
					}
					
					//Validate: ManageHospitalDetails_HsptlAbbrevatonTextbox isEnabled
					public boolean  ManageHospitalDetailsLink_HsptlAbbrevatonTextboxIsEnabled(){
						WebElement abbreviation = ManageHospitalDetailsLink_HsptlAbbrevatonTextbox;
						return abbreviation.isEnabled();
					}
					
					//Validate: ManageHospitalDetails_Add1Textbox isDisplayed
					public boolean  ManageHsptlDetailLink_Add1TextboxIsDisplayed(){
						WebElement add1 = ManageHospitalDetailsLink_Add1Textbox;
						return add1.isDisplayed();
					}
					
					//Validate: ManageHospitalDetails_Add1Textbox isEnabled
					public boolean  ManageHsptlDetailLink_Add1TextboxIsEnabled(){
						WebElement add1 = ManageHospitalDetailsLink_Add1Textbox;
						return add1.isEnabled();
					}
					
					//Validate: ManageHospitalDetails_Add2Textbox isDisplayed
					public boolean  ManageHsptlDetailLink_Add2TextboxIsDisplayed(){
						WebElement add2 = ManageHospitalDetailsLink_Add2Textbox;
						return add2.isDisplayed();
					}
					
					//Validate: ManageHospitalDetails_Add2Textbox isEnabled
					public boolean ManageHsptlDetailLink_Add2TextboxIsEnabled(){
						WebElement add2 = ManageHospitalDetailsLink_Add2Textbox;
						return add2.isEnabled();
					}
					
					//Validate: ManageHospitalDetails_PincodeTextbox isDisplayed
					public boolean  ManageHsptlDetailLink_PincodeIsDisplayed(){
						WebElement pin = ManageHospitalDetailsLink_PincodeTextbox;
						return pin.isDisplayed();
					}
					
					//Validate: ManageHospitalDetails_PincodeTextbox isEnabled
					public boolean ManageHsptlDetailLink_PincodeIsEnabled(){
						WebElement pin = ManageHospitalDetailsLink_PincodeTextbox;
						return pin.isEnabled();
					}
					
					//Validate: ManageHospitalDetailsLink_HsptlPhoneNoTextbox isDisplayed
					public boolean  ManageHsptlDetailLink_PhnNoIsDisplayed(){
						WebElement phnNo = ManageHospitalDetailsLink_HsptlPhoneNoTextbox;
						return phnNo.isDisplayed();
					}
					
					//Validate: ManageHospitalDetails_HsptlPhoneNoTextbox isEnabled
					public boolean ManageHsptlDetailLink_PhnNoIsEnabled(){
						WebElement phnNo = ManageHospitalDetailsLink_HsptlPhoneNoTextbox;
						return phnNo.isEnabled();
					}
					
					//Validate: ManageHospitalDetailsLink_HsptlFaxTextbox isDisplayed
					public boolean  ManageHsptlDetailLink_FaxIsDisplayed(){
						WebElement fax = ManageHospitalDetailsLink_HsptlFaxTextbox;
						return fax.isDisplayed();
					}
					
					//Validate: ManageHospitalDetailsLink_HsptlFaxTextbox isEnabled
					public boolean  ManageHsptlDetailLink_FaxIsEnabled(){
						WebElement fax = ManageHospitalDetailsLink_HsptlFaxTextbox;
						return fax.isEnabled();
					}
					
					//Validate: ManageHospitalDetailsLink_HsptlEmailTextbox isDisplayed
					public boolean  ManageHsptlDetailLink_HsptlEmailIsDisplayed(){
						WebElement email = ManageHospitalDetailsLink_HsptlEmailTextbox;
						return email.isDisplayed();
					}
					
					//Validate: ManageHospitalDetailsLink_HsptlEmailTextbox isEnabled
					public boolean  ManageHsptlDetailLink_HsptlEmailIsEnabled(){
						WebElement email = ManageHospitalDetailsLink_HsptlEmailTextbox;
						return email.isEnabled();
					}
					
					//Validate: ManageHsptlDetailLink_SaveBtnIsDisplayed isDisplayed
					public boolean  ManageHsptlDetailLink_SaveBtnIsDisplayed(){
						WebElement saveBtn = ManageHospitalDetailsLink_SaveBtn;
						return saveBtn.isDisplayed();
					}
					
					//Validate: ManageHospitalDetailsLink_SaveBtn isEnabled
					public boolean  ManageHsptlDetailLink_SaveBtnIsEnabled(){
						WebElement saveBtn = ManageHospitalDetailsLink_SaveBtn;
						return saveBtn.isEnabled();
					}
					
					//Validate: ManageHospitalDetailsLink_SaveBtn isClickable
					public void ManageHsptlDetailLink_SaveBtnIsClickable(){
						WebElement saveBtn = ManageHospitalDetailsLink_SaveBtn;
						 saveBtn.click();
					}
					
					//Validate: Print validation msg on SaveBtn click
					public WebElement ManageHospitalDetail_SaveBtnValidatonMsg(){
					WebElement saveBtnMsg = ManageHospitalDetail_SaveBtnValidatonMsg;
					return saveBtnMsg;
					} 
					
					//Validate:Clear all Textbox & input Hospital Abbreviation only
					public void ManageHospitalDetail_InputHospitalAbbreviationOnly(String HsptlAbbreviation) throws InterruptedException{ 
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlAbbrevatonTextbox.clear();
					Thread.sleep(2000);
					ManageHospitalDetailsLink_Add1Textbox.clear();
					Thread.sleep(4000);
					ManageHospitalDetailsLink_Add2Textbox.clear();
					Thread.sleep(4000);
					ManageHospitalDetailsLink_PincodeTextbox.clear();
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlPhoneNoTextbox.clear();
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlFaxTextbox.clear();
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlEmailTextbox.clear();
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlAbbrevatonTextbox.sendKeys(HsptlAbbreviation);
					Thread.sleep(2000);
					ManageHospitalDetailsLink_SaveBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate:Clear all Textbox & input HsptlAbb & Address1 only
					public void ManageHospitalDetail_InputHsptlAbbAndAdd1(String Add1) throws InterruptedException{ 
					Thread.sleep(2000);
					ManageHospitalDetailsLink_Add1Textbox.sendKeys(Add1);
					Thread.sleep(2000);
					ManageHospitalDetailsLink_SaveBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate:Clear all Textbox & input HsptlAbb Address1 & Address2
					public void ManageHospitalDetail_InputHsptlAbbAdd1Add2(String Add2) throws InterruptedException{ 
					Thread.sleep(2000);
					ManageHospitalDetailsLink_Add2Textbox.sendKeys(Add2);
					Thread.sleep(2000);
					ManageHospitalDetailsLink_SaveBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate:Clear all Textbox & input HsptlAbb Address1 Address2 & Pincode
					public void ManageHospitalDetail_InputHsptlAbbAdd1Add2Pin(String pin) throws InterruptedException{ 
					Thread.sleep(2000);
					ManageHospitalDetailsLink_PincodeTextbox.sendKeys(pin);
					Thread.sleep(2000);
					ManageHospitalDetailsLink_SaveBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate: Update all details in one go
 public void updateAllFiedsInOneGo(String hsptlAbb, String add1,String add2, String pn, String phn, String fx, String mail) throws InterruptedException{ 
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlAbbrevatonTextbox.clear();
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlAbbrevatonTextbox.sendKeys(hsptlAbb);
					Thread.sleep(2000);
					ManageHospitalDetailsLink_Add1Textbox.clear();
					Thread.sleep(4000);
					ManageHospitalDetailsLink_Add1Textbox.sendKeys(add1);
					Thread.sleep(4000);
					ManageHospitalDetailsLink_Add2Textbox.clear();
					Thread.sleep(4000);
					ManageHospitalDetailsLink_Add2Textbox.sendKeys(add2);
					Thread.sleep(4000);
					ManageHospitalDetailsLink_PincodeTextbox.clear();
					Thread.sleep(2000);
					ManageHospitalDetailsLink_PincodeTextbox.sendKeys(pn);
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlPhoneNoTextbox.clear();
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlPhoneNoTextbox.sendKeys(phn);
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlFaxTextbox.clear();
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlFaxTextbox.sendKeys(fx);
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlEmailTextbox.clear();
					Thread.sleep(2000);
					ManageHospitalDetailsLink_HsptlEmailTextbox.sendKeys(mail);
					Thread.sleep(2000);
					ManageHospitalDetailsLink_SaveBtn.click();
					Thread.sleep(2000);
					}
					
 					//Validate: Print validation msg as soon as details updated in one Go
					public WebElement printValMsgDetailsUpdatedInOneGo(){
					WebElement msg = ManageHospitalDetail_SaveBtnValidatonMsg;
					return msg ;
					}
 					
					//Validate: LoginLogoutRegister isDisplayed
					public boolean LoginLogoutRegisterIsDisplayed(){
						WebElement loginLogoutLink = LoginLogoutRegister;
						return loginLogoutLink.isDisplayed();
					}
					
					//Validate: LoginLogoutRegister isEnabled
					public boolean LoginLogoutRegisterIsEnabled(){
						WebElement loginLogoutLink = LoginLogoutRegister;
						return loginLogoutLink.isEnabled();
					}
					
					//Validate: LoginLogoutRegister isClickabled
					public void LoginLogoutRegisterIsClickable(){
					WebElement loginLogoutLink = LoginLogoutRegister;
					 loginLogoutLink.click();
					}
					
					//Validate: LoginLogoutRegister : select user Dropdown IsDisplayed
					public boolean LoginLogoutRegister_SeletuserIsDisplayed(){
					WebElement user = LoginLogoutRegister_SelectUserDrpdwn;
					return user.isDisplayed();
					}
					
					//Validate: LoginLogoutRegister : select user Dropdown IsEnabled
					public boolean LoginLogoutRegister_SeletuserIsEnabled(){
					WebElement user = LoginLogoutRegister_SelectUserDrpdwn;
					return user.isEnabled();
					}
					
					//Validation: LoginLogoutRegister : select User DropDown has Multiple values
					public boolean LoginLogoutRegister_SeletuserIsMultiple() throws InterruptedException{
					Select ListBox = new Select(LoginLogoutRegister_SelectUserDrpdwn);
					boolean value = ListBox.isMultiple() ;
					return value;
					}
					
					//Validate: LoginLogoutRegister : Select From Date Dropdown IsDisplayed
					public boolean LoginLogoutRegister_SelectFromDateIsDisplayed(){
					WebElement user = LoginLogoutRegister_FromDate;
					return user.isDisplayed();
					}
					
					//Validate: LoginLogoutRegister : Select From Date Dropdown IsEnabled
					public boolean LoginLogoutRegister_SelectFromDateIsEnabled(){
					WebElement user = LoginLogoutRegister_FromDate;
					return user.isEnabled();
					}
					
					//Validate:LoginLogoutRegister : Select user and click on show detail without selecting date 
					public void LoginLogoutRegister_ClickingShowBtnWithoutDate() throws InterruptedException{
					Select sel = new Select(LoginLogoutRegister_SelectUserDrpdwn);
					sel.selectByVisibleText("ALL");
					Thread.sleep(2000);
					LoginLogoutRegister_ShowBtn.click();
					Thread.sleep(2000);
					}
					
					//Validate: LoginLogoutRegister : Select From Date Dropdown IsEnabled
					public void LoginLogoutRegister_SelectFromDateIsClickable(){
					WebElement user = LoginLogoutRegister_FromDate;
					user.click();
					}
					
					//Validate: LoginLogoutRegister : Select From Date Dropdown IsDisplayed
					public boolean LoginLogoutRegister_TodayIsDisplayed(){
					WebElement user = LoginLogoutRegister_Today;
					return user.isDisplayed();
					}
					
					//Validate: LoginLogoutRegister : Select From Date Dropdown IsEnabled
					public boolean LoginLogoutRegister_TodayIsEnabled(){
					WebElement user = LoginLogoutRegister_Today;
					return user.isEnabled();
					}
					
					//Validate:LoginLogoutRegister : With all valid inputs print LoginLogout Report 
					public void LoginLogoutRegister_ClickLoginOutReport() throws InterruptedException{
					Select sel = new Select(LoginLogoutRegister_SelectUserDrpdwn);
					sel.selectByVisibleText("ALL");
					Thread.sleep(2000);
					LoginLogoutRegister_FromDate.click();
					Thread.sleep(2000);
					LoginLogoutRegister_Today.click();
					Thread.sleep(2000);
					LoginLogoutRegister_ShowBtn.click();
					Thread.sleep(4000);
					}
					
					//Validate: LoginLogoutRegister : Select From Date Dropdown IsEnabled
					public void LoginLogoutRegister_TodayIsClickable(){
					WebElement user = LoginLogoutRegister_Today;
					user.click();
					}
					
					//Validate: LoginLogoutRegister : Select From Date Dropdown IsDisplayed
					public boolean LoginLogoutRegister_ShowBtnIsDisplayed(){
					WebElement user = LoginLogoutRegister_ShowBtn;
					return user.isDisplayed();
					}
					
					//Validate: LoginLogoutRegister : Select From Date Dropdown IsEnabled
					public boolean LoginLogoutRegister_ShowBtnIsEnabled(){
					WebElement user = LoginLogoutRegister_ShowBtn;
					return user.isEnabled();
					}
					
					//Validate: LoginLogoutRegister : Select From Date Dropdown IsEnabled
					public void LoginLogoutRegister_ShowBtnIsClickable(){
					WebElement user = LoginLogoutRegister_ShowBtn;
					user.click();
					}
					
					
					
					
					
					
					
					
					
					
}