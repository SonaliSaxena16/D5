package ehospital.Billing_Module.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.BillSettlementHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;

public class BillSettlementTestScripts extends BaseClass {
	BillSettlementHelper bsh;
	BillSettlementTestScripts bst;
	PreparationOfReceiptsHelper porh;
	
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void BillSettlementlinkisDispalyed() {
bsh = new BillSettlementHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
bst = new BillSettlementTestScripts();
delay();

bst.switchtoLeftFrame();
boolean BillSettlement = bsh.ValidateBillsettlementlinkisDisplayed();
softAssert.assertTrue(BillSettlement, "Bill Settlement link is Not Displayed");
if(BillSettlement == true) {
	System.out.println("Bill Settlement link is Displayed");
}
}

@Test(priority = 2,groups = {"Functional","Smoke"})
public void BillSettlementlinkisEnabled() {
boolean BillSettlement = bsh.ValidateBillsettlementlinkisEnabled();
softAssert.assertTrue(BillSettlement, "Bill Settlement link is Not Enabled");
if(BillSettlement == true) {
	System.out.println("Bill Settlement link is Enabled");
	delay();
	bsh.ClickonBillsettlementlink();
	delay();
	bst.switchtoinnerRightFrame();
}
}

@Test(priority = 3,groups = {"Functional"})
public void SearchButtonisEnabledandClickable() {
boolean SearchButton = bsh.ValidateSearchButtonisEnabled();
softAssert.assertTrue(SearchButton, "Search Button is Not Enabled");
if(SearchButton == true) {
	System.out.println("Search Button is Enabled");
	delay();
	bsh.ClickonSearchButton();
softAssert.assertEquals(GetAlertText(), "Please Enter UHID", "Alert Pop up Message is not coming");
delay();
HandleAlert();
}
}

@Test(priority = 4,groups = {"Functional"})
public void UHIDTextBoxisEnabledandEnterInvalidID() {
boolean UHIDTextBox = bsh.ValidateUHIDTextBoxisEnabled();
softAssert.assertTrue(UHIDTextBox, "UHID Text Box is not Enabled");
if(UHIDTextBox == true) {
	System.out.println("UHID Text Box is Enabled");
	delay();
	bsh.EnterinvalidIDintoUHIDTextboxandClickonSearchbutton("RTYUI&*2");
softAssert.assertEquals(GetAlertText(), "Please Enter Valid UHID", "Alert Pop up Message is not coming");
HandleAlert();
}
}

@Test(priority = 5,groups = {"Functional"})
public void UHIDTextBoxisEnabledandCheckUHIDTextBoxlength() {
boolean UHIDTextBox = bsh.ValidateUHIDTextBoxisEnabled();
softAssert.assertTrue(UHIDTextBox, "UHID Text Box is not Enabled");
if(UHIDTextBox == true) {
	System.out.println("UHID Text Box is Enabled");
	delay();
	bsh.CheckUHIDTextBoxlength("2020002");
softAssert.assertEquals(GetAlertText(), "UHID Must be 11 Digit", "Alert Pop up Message is not coming");
delay();	
HandleAlert();
}
}

@Test(priority = 6,groups = {"Functional","Smoke"})
public void UHIDTextBoxisEnabledandEnterValidID() {
boolean UHIDTextBox = bsh.ValidateUHIDTextBoxisEnabled();
softAssert.assertTrue(UHIDTextBox, "UHID Text Box is not Enabled");
if(UHIDTextBox == true) {
	System.out.println("UHID Text Box is Enabled");
	delay();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 2);
	delay();
	bsh.EntervalidIDintoUHIDTextboxandClickonSearchbutton(ValidID);
boolean PatientinfoDetail = bsh.ValidatePatientinfoDetailisDisplayed();
Assert.assertTrue(PatientinfoDetail, "Patient info Detail is not displaying");
}
}

@Test(priority = 7,groups = {"Functional","Smoke"})
public void AdmissionChargeCheckBoxisEnabledandSelectable() {
boolean AdmissionCharge = bsh.ValidateAdmissionChargeCheckBoxisEnabled();
softAssert.assertTrue(AdmissionCharge, "Admission Charge Check box is Not Enabled");
if(AdmissionCharge == true) {
	System.out.println("Admission Charge Check box is Enabled");
	delay();
	bsh.SelectAdmissionChargeCheckBox();
boolean AdmissionChargepopup = bsh.ValidateAdmissionChargePopUpisDisplayed();
softAssert.assertTrue(AdmissionChargepopup, "Admission Charge popup is Not displayed");
		
}
}

@Test(priority = 8,groups = {"Functional"})
public void AdmissionChargeCheckBoxisSelected() {
boolean AdmissionCharge = bsh.ValidateAdmissionChargeCheckBoxisSelecetd();
softAssert.assertTrue(AdmissionCharge, "Admission Charge Check box is Not Selected");
if(AdmissionCharge == true) {
	System.out.println("Admission Charge Check box is Selected");
}
}

@Test(priority = 9,groups = {"Functional"})
public void CancelbuttonofAdmissionChargePopUpisEnabledandClickable() {
boolean Cancelbutton = bsh.ValidateCancelbuttonofAdmissionChargePopUpisEnabled();
softAssert.assertTrue(Cancelbutton, "Cancel button is Not Enabled");
if(Cancelbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	bsh.ClickonCancelbuttonofAdmissionChargePopUp();
}
}

@Test(priority =10,groups = {"Functional","Smoke"})
public void ServiceDropdownUnderAdmissionChargePopUpisEnabledandSelectValue() {
boolean ServiceDropdown = bsh.ValidateServiceDropdownUnderAdmissionChargePopUpisEnabled();
softAssert.assertTrue(ServiceDropdown, "Service Dropdwon is not Enabled");
if(ServiceDropdown == true) {
	System.out.println("Service Dropdwon is Enabled");
	delay();
	bsh.SelectValuefromServiceDropdownUnderAdmissionChargePopUp();
}
}

@Test(priority =11,groups = {"Functional"})
public void ServiceDropdownUnderAdmissionChargePopUpisMultiple() {
boolean ServiceDropdown = bsh.ValidateServiceDropdownUnderAdmissionChargePopUpisMultiple();
softAssert.assertTrue(ServiceDropdown, "Service Dropdwon is Multiple");
if(ServiceDropdown == false) {
	System.out.println("Service Dropdwon is Not Multiple");
}
}

@Test(priority =11,groups = {"Functional","Smoke"})
public void AddbuttonofAdmissionChargePopUpisEnabledandClickable() {
boolean Addbutton = bsh.ValidateAddbuttonofAdmissionChargePopUpisEnabled();
softAssert.assertTrue(Addbutton, "Add button is Not Enabled");
if(Addbutton == true) {
	System.out.println("Add button is Enabled");
	delay();
	bsh.ClickonAddbuttonofAdmissionChargePopUp();
HandleAlert();
delay();
softAssert.assertEquals(GetAlertText(), "Admission Charge Added...", "Alert PopUp Message is Not Matched");
delay();
HandleAlert();
}
}

@Test(priority = 12,groups = {"Functional","Smoke"})
public void RoomRentEntryCheckboxisEnabledandSelectable() {
boolean RoomRentEntry = bsh.ValidateRoomRentEntryCheckboxisEnabled();
softAssert.assertTrue(RoomRentEntry, "Room Rent Entry Check box is Not Enabled");
if(RoomRentEntry == true) {
	System.out.println("Room Rent Entry Check box is Enabled");
	delay();
	bsh.SelectRoomRentEntryCheckbox();
boolean RoomRentEntryPopup = bsh.ValidateRoomRentEntryPopUpisDisplayed();
softAssert.assertTrue(RoomRentEntryPopup, "Room Rent Entry popup is Not displayed");
		
}
}

@Test(priority = 13,groups = {"Functional"})
public void RoomRentEntryCheckBoxisSelected() {
boolean RoomRentEntry = bsh.ValidateRoomRentEntryCheckboxisSelecetd();
softAssert.assertTrue(RoomRentEntry, "Room Rent Entry Check box is Not Selected");
if(RoomRentEntry == true) {
	System.out.println("Room Rent Entry Check box is Selected");
}
}

@Test(priority = 14,groups = {"Functional"})
public void CancelbuttonofRoomRentEntryPopUpisEnabledandClickable() {
boolean Cancelbutton = bsh.ValidateCancelbuttonofRoomRentEntryPopUpisEnabled();
softAssert.assertTrue(Cancelbutton, "Cancel button is Not Enabled");
if(Cancelbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	bsh.ClickonCancelbuttonofRoomRentEntryPopUp();
}
}

@Test(priority = 15,groups = {"Functional"})
public void SelectCheckboxofRoomRentEntryPopUpisEnabledisEnabledandSelectable() {
boolean SelectCheckbox = bsh.ValidateSelectCheckboxofRoomRentEntryPopUpisEnabled();
softAssert.assertTrue(SelectCheckbox, "Select Check box is Not Enabled");
if(SelectCheckbox == true) {
	System.out.println("Select Check box is Enabled");
	delay();
	bsh.SelectCheckboxofRoomRentEntryPopUp();
}
}

@Test(priority = 16,groups = {"Functional"})
public void SelectCheckboxofRoomRentEntryPopUpisSelected() {
boolean SelectCheckbox = bsh.ValidateRoomRentEntryCheckboxisSelecetd();
softAssert.assertTrue(SelectCheckbox, "Select Check box is Not Selected");
if(SelectCheckbox == true) {
	System.out.println("Select Check box is Selected");
}
}

@Test(priority = 17,groups = {"Functional"})
public void RateTextBoxofRoomRentEntryPopUpisEnabledandEnterRate() {
boolean RateTextBox = bsh.ValidateRateTextBoxofRoomRentEntryPopUpisEnabled();
if(RateTextBox == true) {
	System.out.println("Rate Text box is Enabled");
	delay();
	//bsh.EnterRateintoRateTextBoxofRoomRentEntryPopUp("2000");
}else if(RateTextBox == false) {
	System.out.println("Rate Text box is Not Enabled");
}
}

@Test(priority =18,groups = {"Functional","Smoke"})
public void ServiceDropdownofRoomRentEntryPopUpisEnabledandSelectValue() {
boolean ServiceDropdown = bsh.ValidateServiceDropdownofRoomRentEntryPopUpisEnabled();
softAssert.assertTrue(ServiceDropdown, "Service Dropdwon is not Enabled");
if(ServiceDropdown == true) {
	System.out.println("Service Dropdwon is Enabled");
	delay();
	bsh.SelectValuefromServiceDropdownofRoomRentEntryPopUp();
}
}

@Test(priority =19,groups = {"Functional"})
public void ServiceDropdownofRoomRentEntryPopUpisMultiple() {
boolean ServiceDropdown = bsh.ValidateServiceDropdownofRoomRentEntryPopUpisMultiple();
softAssert.assertTrue(ServiceDropdown, "Service Dropdwon is Multiple");
if(ServiceDropdown == false) {
	System.out.println("Service Dropdwon is Not Multiple");
}
}

@Test(priority =20,groups = {"Functional","Smoke"})
public void AddButtonofRoomRentEntryPopUpisEnabledandClickable() {
boolean Addbutton = bsh.ValidateAddButtonofRoomRentEntryPopUpisEnabled();
softAssert.assertTrue(Addbutton, "Add button is Not Enabled");
if(Addbutton == true) {
	System.out.println("Add button is Enabled");
	delay();
	bsh.ClickonAddButtonofRoomRentEntryPopUp();
HandleAlert();
//softAssert.assertEquals(GetAlertText(), "Room Rent Added...", "Alert PopUp Message is Not Matched");
delay();
HandleAlert();
}
}

@Test(priority = 21,groups = {"Functional","Smoke"})
public void DietChargeEntryCheckBoxisEnabledandSelectable() {
boolean DietChargeEntry = bsh.ValidateDietChargeEntryCheckBoxisEnabled();
softAssert.assertTrue(DietChargeEntry, "Diet Charge Entry Check box is Not Enabled");
if(DietChargeEntry == true) {
	System.out.println("Diet Charge Entry Check box is Enabled");
	delay();
	bsh.SelectDietChargeEntryCheckBox();
boolean RoomRentEntryPopup = bsh.ValidateDietChargeEntryPopupisDisplayed();
softAssert.assertTrue(RoomRentEntryPopup, "Diet Charge Entry popup is Not displayed");
		
}
}

@Test(priority = 22,groups = {"Functional"})
public void DietChargeEntryCheckBoxisSelected() {
boolean DietChargeEntry = bsh.ValidateDietChargeEntryCheckBoxisSelecetd();
softAssert.assertTrue(DietChargeEntry, "Diet Charge Entry Check box is Not Selected");
if(DietChargeEntry == true) {
	System.out.println("Diet Charge Entry Check box is Selected");
}
}

@Test(priority = 23,groups = {"Functional"})
public void CancelbuttonofDietChargeEntryPopupisEnabledandClickable() {
boolean Cancelbutton = bsh.ValidateCancelbuttonofDietChargeEntryPopupisEnabled();
softAssert.assertTrue(Cancelbutton, "Cancel button is Not Enabled");
if(Cancelbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	bsh.ClickonCancelbuttonofDietChargeEntryPopup();
}
}

@Test(priority = 24,groups = {"Functional"})
public void SelectCheckboxfDietChargeEntryPopupisEnabledandSelectable() {
boolean SelectCheckbox = bsh.ValidateSelectCheckboxfDietChargeEntryPopupisEnabled();
softAssert.assertTrue(SelectCheckbox, "Select Check box is Not Enabled");
if(SelectCheckbox == true) {
	System.out.println("Select Check box is Enabled");
	delay();
	bsh.SelectCheckboxfDietChargeEntryPopup();
}
}

@Test(priority = 25,groups = {"Functional"})
public void SelectCheckboxfDietChargeEntryPopupisSelected() {
boolean SelectCheckbox = bsh.ValidateSelectCheckboxfDietChargeEntryPopupisSelected();
softAssert.assertTrue(SelectCheckbox, "Select Check box is Not Selected");
if(SelectCheckbox == true) {
	System.out.println("Select Check box is Selected");
}
}

@Test(priority = 26,groups = {"Functional"})
public void RateTextboxoffDietChargeEntryPopupisEnabledandEnterRate() {
boolean RateTextBox = bsh.ValidateRateTextboxoffDietChargeEntryPopupisEnabled();
if(RateTextBox == true) {
	System.out.println("Rate Text box is Enabled");
	delay();
	//bsh.EnterRateintoRateTextboxoffDietChargeEntryPopup("2000");
}else if(RateTextBox == false) {
	System.out.println("Rate Text box is Not Enabled");
}
}

@Test(priority =27,groups = {"Functional","Smoke"})
public void ServiceDropdownoffDietChargeEntryPopupisEnabledandSelectValue() {
boolean ServiceDropdown = bsh.ValidateServiceDropdownoffDietChargeEntryPopupisEnabled();
softAssert.assertTrue(ServiceDropdown, "Service Dropdwon is not Enabled");
if(ServiceDropdown == true) {
	System.out.println("Service Dropdwon is Enabled");
	delay();
	bsh.SelectValuefromServiceDropdownoffDietChargeEntryPopup();
}
}

@Test(priority =28,groups = {"Functional"})
public void ServiceDropdownoffDietChargeEntryPopupisMultiple() {
boolean ServiceDropdown = bsh.ValidateServiceDropdownoffDietChargeEntryPopupisMultiple();
softAssert.assertTrue(ServiceDropdown, "Service Dropdwon is Multiple");
if(ServiceDropdown == false) {
	System.out.println("Service Dropdwon is Not Multiple");
}
}

@Test(priority =29,groups = {"Functional","Smoke"})
public void AddbuttonoffDietChargeEntryPopupisEnabledandClickable() {
boolean Addbutton = bsh.ValidateAddbuttonoffDietChargeEntryPopupisEnabled();
softAssert.assertTrue(Addbutton, "Add button is Not Enabled");
if(Addbutton == true) {
	System.out.println("Add button is Enabled");
	delay();
	bsh.ClickonAddbuttonoffDietChargeEntryPopup();
HandleAlert();
delay();
softAssert.assertEquals(GetAlertText(), "Diet Charge Added...", "Alert PopUp Message is Not Matched");
delay();
HandleAlert();
}
}

@Test(priority = 30,groups = {"Functional","Smoke"})
public void BillingServiceEntryCheckboxisEnabledandSelectable() {
boolean BillingServiceEntry = bsh.ValidateBillingServiceEntryCheckboxisEnabled();
softAssert.assertTrue(BillingServiceEntry, "Billing Service Entry Check box is Not Enabled");
if(BillingServiceEntry == true) {
	System.out.println("Billing Service Entry Check box is Enabled");
	delay();
	bsh.SelectBillingServiceEntryCheckbox();
boolean BillingServiceEntryPopUp = bsh.ValidateBillingServiceEntryPopUpisDisplayed();
softAssert.assertTrue(BillingServiceEntryPopUp, "Billing Service Entry popup is Not displayed");
		
}
}

@Test(priority = 31,groups = {"Functional"})
public void BillingServiceEntryCheckboxisSelected() {
boolean BillingServiceEntry = bsh.ValidateBillingServiceEntryCheckboxisSelecetd();
softAssert.assertTrue(BillingServiceEntry, "Billing Service Entry Check box is Not Selected");
if(BillingServiceEntry == true) {
	System.out.println("Billing Service Entry Check box is Selected");
}
}

@Test(priority = 32,groups = {"Functional"})
public void CancelimgofBillingServiceEntryPopUpisEnabledandClickable() {
boolean Cancelbutton = bsh.ValidateCancelimgofBillingServiceEntryPopUpisEnabled();
softAssert.assertTrue(Cancelbutton, "Cancel button is Not Enabled");
if(Cancelbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	bsh.ClickonCancelimgofBillingServiceEntryPopUp();
}
}

@Test(priority = 33,groups = {"Functional","Smoke"})
public void SelectCheckbocofBillingServiceEntryPopUpisEnabledandSelectable() {
boolean SelectCheckbox = bsh.ValidateSelectCheckbocofBillingServiceEntryPopUpisEnabled();
softAssert.assertTrue(SelectCheckbox, "Select Check box is Not Enabled");
if(SelectCheckbox == true) {
	System.out.println("Select Check box is Enabled");
	delay();
	bsh.SelectCheckbocofBillingServiceEntryPopUp();
}
}

@Test(priority = 34,groups = {"Functional"})
public void SelectCheckbocofBillingServiceEntryPopUpisSelected() {
boolean SelectCheckbox = bsh.ValidateSelectCheckbocofBillingServiceEntryPopUpisSelected();
softAssert.assertTrue(SelectCheckbox, "Select Check box is Not Selected");
if(SelectCheckbox == true) {
	System.out.println("Select Check box is Selected");
}
}

@Test(priority =35,groups = {"Functional","Smoke"})
public void CategoryDropdownofBillingServiceEntryPopUpisEnabledandSelectValue() {
boolean CategoryDropdown = bsh.ValidateCategoryDropdownofBillingServiceEntryPopUpisEnabled();
softAssert.assertTrue(CategoryDropdown, "Category Dropdwon is not Enabled");
if(CategoryDropdown == true) {
	System.out.println("Category Dropdwon is Enabled");
	delay();
	bsh.SelectValuefromCategoryDropdownofBillingServiceEntryPopUp();
}
}

@Test(priority =36,groups = {"Functional"})
public void CategoryDropdownofBillingServiceEntryPopUpisMultiple() {
boolean CategoryDropdown = bsh.ValidateCategoryDropdownofBillingServiceEntryPopUpisMultiple();
softAssert.assertTrue(CategoryDropdown, "Category Dropdwon is Multiple");
if(CategoryDropdown == false) {
	System.out.println("Category Dropdwon is Not Multiple");
}
}

@Test(priority =37,groups = {"Functional","Smoke"})
public void ServiceDropdownofBillingServiceEntryPopUpisEnabledandSelectValue() {
boolean ServiceDropdown = bsh.ValidateServiceDropdownofBillingServiceEntryPopUpisEnabled();
softAssert.assertTrue(ServiceDropdown, "Service Dropdwon is not Enabled");
if(ServiceDropdown == true) {
	System.out.println("Service Dropdwon is Enabled");
	delay();
	bsh.SelectValuefromServiceDropdownofBillingServiceEntryPopUp();
}
}

@Test(priority =38,groups = {"Functional"})
public void ServiceDropdownofBillingServiceEntryPopUpisMultiple() {
boolean ServiceDropdown = bsh.ValidateServiceDropdownofBillingServiceEntryPopUpisMultiple();
softAssert.assertTrue(ServiceDropdown, "Service Dropdwon is Multiple");
if(ServiceDropdown == false) {
	System.out.println("Service Dropdwon is Not Multiple");
}
}

@Test(priority =39,groups = {"Functional"})
public void QuantityTextBoxofBillingServiceEntryPopUpisEnabledandEnterInvalidQuantity() {
boolean QuantityTextBox = bsh.ValidateQuantityTextBoxofBillingServiceEntryPopUpisEnabled();
softAssert.assertTrue(QuantityTextBox, "Quantity Text Box is not Enabled");
if(QuantityTextBox == true) {
	System.out.println("Quantity Text Box is Enabled");
	delay();
	bsh.EnterInvalidRateintoQuantityTextBoxofBillingServiceEntryPopUp("LJHY");
softAssert.assertEquals(GetAlertText(), "Enter only Numaric Value", "Alert PopUp is not Coming");
delay();
HandleAlert();
}
}

@Test(priority =40,groups = {"Functional","Smoke"})
public void QuantityTextBoxofBillingServiceEntryPopUpisEnabledandEnterValidQuantity() {
boolean QuantityTextBox = bsh.ValidateQuantityTextBoxofBillingServiceEntryPopUpisEnabled();
softAssert.assertTrue(QuantityTextBox, "Quantity Text Box is not Enabled");
if(QuantityTextBox == true) {
	System.out.println("Quantity Text Box is Enabled");
	delay();
	bsh.EnterValidRateintoQuantityTextBoxofBillingServiceEntryPopUp("2");
}
}

@Test(priority =41,groups = {"Functional"})
public void RateTextBoxofBillingServiceEntryPopUpisEnabledandEnterInvalidRate() {
boolean RateTextBox = bsh.ValidateRateTextBoxofBillingServiceEntryPopUpisEnabled();
softAssert.assertTrue(RateTextBox, "Rate Text Box is not Enabled");
if(RateTextBox == true) {
	System.out.println("Rate Text Box is Enabled");
	delay();
	bsh.EnterInvalidRateintoRateTextBoxofBillingServiceEntryPopUp("LJHY");
softAssert.assertEquals(GetAlertText(), "Enter only Numaric Value", "Alert PopUp is not Coming");
delay();
HandleAlert();
}
}

@Test(priority =42,groups = {"Functional","Smoke"})
public void RateTextBoxofBillingServiceEntryPopUpisEnabledandEnterValidRate() throws Exception {
boolean RateTextBox = bsh.ValidateRateTextBoxofBillingServiceEntryPopUpisEnabled();
softAssert.assertTrue(RateTextBox, "Rate Text Box is not Enabled");
if(RateTextBox == true) {
	System.out.println("Rate Text Box is Enabled");
	delay();
	bsh.EnterValidRateintoRateTextBoxofBillingServiceEntryPopUp("2000");
throw new Exception("Rate Text Box should not be Editable");
}
}

@Test(priority =43,groups = {"Functional","Smoke"})
public void AddButtonofBillingServiceEntryPopUpisEnabledandClickable() {
boolean Addbutton = bsh.ValidateAddButtonofBillingServiceEntryPopUpisEnabled();
softAssert.assertTrue(Addbutton, "Add button is Not Enabled");
if(Addbutton == true) {
	System.out.println("Add button is Enabled");
	delay();
	bsh.ClickonAddButtonofBillingServiceEntryPopUp();
	delay();
softAssert.assertEquals(GetAlertText(), "Other Service Added...", "Alert PopUp is not Coming");
delay();
HandleAlert();
}
}

@Test(priority = 44,groups = {"Functional","Smoke"})
public void OtherServiceEntryCheckboxisEnabledandSelectable() {
boolean OtherServiceEntry = bsh.ValidateOtherServiceEntryCheckboxisEnabled();
softAssert.assertTrue(OtherServiceEntry, "Other Service Entry Check box is Not Enabled");
if(OtherServiceEntry == true) {
	System.out.println("Other Service Entry Check box is Enabled");
	delay();
	bsh.SelectOtherServiceEntryCheckbox();
boolean BillingServiceEntryPopUp = bsh.ValidateOtherServiceEntryPopUpisDisplayed();
softAssert.assertTrue(BillingServiceEntryPopUp, "Other Service Entry popup is Not displayed");
		
}
}

@Test(priority = 45,groups = {"Functional"})
public void OtherServiceEntryCheckboxisSelected() {
boolean OtherServiceEntry = bsh.ValidateOtherServiceEntryCheckboxisSelecetd();
softAssert.assertTrue(OtherServiceEntry, "Other Service Entry Check box is Not Selected");
if(OtherServiceEntry == true) {
	System.out.println("Other Service Entry Check box is Selected");
}
}

@Test(priority = 46,groups = {"Functional"})
public void CancelimgofOtherServiceEntryPopUpisEnabledandClickable() {
boolean Cancelbutton = bsh.ValidateCancelimgofOtherServiceEntryPopUpisEnabled();
softAssert.assertTrue(Cancelbutton, "Cancel button is Not Enabled");
if(Cancelbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	bsh.ClickonCancelimgofOtherServiceEntryPopUp();
}
}

@Test(priority = 47,groups = {"Functional","Smoke"})
public void SelectCheckboxofOtherServiceEntryPopUpisEnabledandSelectable() {
boolean SelectCheckbox = bsh.ValidateSelectCheckboxofOtherServiceEntryPopUpisEnabled();
softAssert.assertTrue(SelectCheckbox, "Select Check box is Not Enabled");
if(SelectCheckbox == true) {
	System.out.println("Select Check box is Enabled");
	delay();
	bsh.SelectCheckboxofOtherServiceEntryPopUp();
}
}

@Test(priority = 48,groups = {"Functional"})
public void SelectCheckboxofOtherServiceEntryPopUpisSelected() {
boolean SelectCheckbox = bsh.ValidateSelectCheckboxofOtherServiceEntryPopUpisSelected();
softAssert.assertTrue(SelectCheckbox, "Select Check box is Not Selected");
if(SelectCheckbox == true) {
	System.out.println("Select Check box is Selected");
}
}

@Test(priority =49,groups = {"Functional"})
public void CategorytextBoxofOtherServiceEntryPopUpisEnabledandEnterInvalidCategory() {
boolean CategoryTextBox = bsh.ValidateCategorytextBoxofOtherServiceEntryPopUpisEnabled();
softAssert.assertTrue(CategoryTextBox, "Category Text Box is not Enabled");
if(CategoryTextBox == true) {
	System.out.println("Category Text Box is Enabled");
	delay();
	bsh.EnterInvalidCategoryintotheCategoryTextBox("Test1#");
softAssert.assertEquals(GetAlertText(), "Enter Valid Category Name", "Alert PopUp is not Coming");
HandleAlert();
}
}

@Test(priority =50,groups = {"Functional","Smoke"})
public void CategorytextBoxofOtherServiceEntryPopUpisEnabledandEnterValidCategory() {
boolean CategoryTextBox = bsh.ValidateCategorytextBoxofOtherServiceEntryPopUpisEnabled();
softAssert.assertTrue(CategoryTextBox, "Category Text Box is not Enabled");
if(CategoryTextBox == true) {
	System.out.println("Category Text Box is Enabled");
	delay();
	bsh.EnterValidCategoryintotheCategoryTextBox("Other Category");
}
}

@Test(priority =51,groups = {"Functional"})
public void ServicetextBoxofOtherServiceEntryPopUpisEnabledandEnterInvalidService() {
boolean ServiceTextBox = bsh.ValidateServicetextBoxofOtherServiceEntryPopUpisEnabled();
softAssert.assertTrue(ServiceTextBox, "Service Text Box is not Enabled");
if(ServiceTextBox == true) {
	System.out.println("Service Text Box is Enabled");
	delay();
	bsh.EnterInvalidServiceintotheServiceTextBox("Test1#");
softAssert.assertEquals(GetAlertText(), "Enter Valid Service Name", "Alert PopUp is not Coming");
delay();
HandleAlert();
}
}

@Test(priority =52,groups = {"Functional","Smoke"})
public void ServicetextBoxofOtherServiceEntryPopUpisEnabledandEnterValidService() {
boolean ServiceTextBox = bsh.ValidateServicetextBoxofOtherServiceEntryPopUpisEnabled();
softAssert.assertTrue(ServiceTextBox, "Service Text Box is not Enabled");
if(ServiceTextBox == true) {
	System.out.println("Service Text Box is Enabled");
	delay();
	bsh.EnterValidServiceintotheServiceTextBox("Injection");
}
}

@Test(priority =53,groups = {"Functional","Smoke"})
public void QuantitytextBoxofOtherServiceEntryPopUpandEnterValidService() {
boolean ServiceTextBox = bsh.ValidateQuantitytextBoxofOtherServiceEntryPopUpisEnabled();
softAssert.assertTrue(ServiceTextBox, "Quantity Text Box is not Enabled");
if(ServiceTextBox == true) {
	System.out.println("Quantity Text Box is Enabled");
	delay();
	bsh.EnterValidQuantityintotheQuantityTextBox("2");
}
}

@Test(priority =54,groups = {"Functional","Smoke"})
public void RatetextBoxofOtherServiceEntryPopUpIsEnabledandEnterValidService() {
boolean RateTextBox = bsh.ValidateRatetextBoxofOtherServiceEntryPopUpisEnabled();
softAssert.assertTrue(RateTextBox, "Rate Text Box is not Enabled");
if(RateTextBox == true) {
	System.out.println("Rate Text Box is Enabled");
	delay();
	bsh.EnterValidRateintotheRateTextBox("2000");
}
}

@Test(priority =55,groups = {"Functional","Smoke"})
public void AddbuttonofOtherServiceEntryPopUpisEnabledandClickable() {
boolean Addbutton = bsh.ValidateAddbuttonofOtherServiceEntryPopUpisEnabled();
softAssert.assertTrue(Addbutton, "Add button is Not Enabled");
if(Addbutton == true) {
	System.out.println("Add button is Enabled");
	delay();
	bsh.ClickonAddbuttonofOtherServiceEntryPopUp();
	delay();
softAssert.assertEquals(GetAlertText(), "Other Service Added...", "Alert PopUp Message is Not Matched");
delay();
HandleAlert();
}
}

@Test(priority =56,groups = {"Functional","Smoke"})
public void TestDoneorNotDropdownisEnabledandSelectValue() {
boolean TestDoneorNotDropdown = bsh.ValidateTestDoneorNotDropdownisEnabled();
softAssert.assertTrue(TestDoneorNotDropdown, "Test Done or Not Dropdown is not Enabled");
if(TestDoneorNotDropdown == true) {
	System.out.println("Test Done or Not Dropdown is Enabled");
	delay();
	bsh.SelectValuefromTestDoneorNotDropdown();
	delay();
boolean Checkbox = bsh.ValidateFirstCheckboxofRecommendedTestDetailsisSelecetd();
softAssert.assertFalse(Checkbox, "Check box of Recommended Test Details is Selected");

}
}

@Test(priority =57,groups = {"Functional"})
public void TestDoneorNotDropdownisMultiple() {
boolean TestDoneorNotDropdown = bsh.ValidateTestDoneorNotDropdownisMultiple();
softAssert.assertFalse(TestDoneorNotDropdown, "Test Done or Not Dropdown is Multiple");
if(TestDoneorNotDropdown == false) {
	System.out.println("Test Done or Not Dropdown is Not Multiple");
}
}

@Test(priority = 58,groups = {"Functional","Smoke"})
public void CheckboxofRecommendedTestDetailsisEnabledandSelectable() {
boolean Checkbox = bsh.ValidateFirstCheckboxofRecommendedTestDetailsisEnabled();
softAssert.assertTrue(Checkbox, "Check box of Recommended Test Details is Not Enabled");
if(Checkbox == true) {
	System.out.println("Check box of Recommended Test Details is Enabled");
	delay();
	bsh.SelectCheckboxofRecommendedTestDetails();		
}
}

@Test(priority = 59,groups = {"Functional"})
public void CheckboxofRecommendedTestDetailsisSelected() {
boolean Checkbox = bsh.ValidateFirstCheckboxofRecommendedTestDetailsisSelecetd();
softAssert.assertTrue(Checkbox, "Check box of Recommended Test Details is Not Selected");
if(Checkbox == true) {
	System.out.println("Check box of Recommended Test Details is Selected");
}
}

@Test(priority = 60,groups = {"Functional","Smoke"})
public void ConcessionCalculatorImgbuttonisEnabledandClickable() {
boolean ConcessionCalculator = bsh.ValidateConcessionCalculatorImgbuttonisEnabled();
softAssert.assertTrue(ConcessionCalculator, "Concession Calculator img is Not Enabled");
if(ConcessionCalculator == true) {
	System.out.println("Concession Calculator img is Enabled");
	delay();
	bsh.RecommendedTestDetailsForVerification();
	delay();
	bsh.ClickonConcessionCalculatorImgbutton();
boolean ConcessionCalculatorPopUp = bsh.ValidateConcessionCalculatorPopUpisDisplayed();
softAssert.assertTrue(ConcessionCalculatorPopUp, "Concession Calculator img is Not displayed");
delay();
bsh.RecommendedTestDetailsForVerificationinConcessionPopUp();
}
}

@Test(priority = 61,groups = {"Functional"})
public void CancelImgofConcessionCalculatorPopUpisEnabledandClickable() {
boolean Cancelbutton = bsh.ValidateCancelImgofConcessionCalculatorPopUpisEnabled();
softAssert.assertTrue(Cancelbutton, "Cancel button is Not Enabled");
if(Cancelbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	bsh.ClickonCancelImgofConcessionCalculatorPopUp();
}
}

@Test(priority =62,groups = {"Functional"})
public void AmountTextBoxofConcessionCalculatorPopUpisEnabledandEnterValidAmount() throws Exception {
boolean AmountTextBox = bsh.ValidateAmountTextBoxofConcessionCalculatorPopUpisEnabled();
softAssert.assertFalse(AmountTextBox, "Amount Text Box is Enabled");
if(AmountTextBox == true) {
	System.out.println("Amount Text Box is Enabled");
	/*delay();
	bsh.EnterValidAmountintotheAmountTextBox("2000");
	throw new Exception("Amount Text Box should not be Enabled");*/
}else if(AmountTextBox == false) {
	System.out.println("Amount Text Box is not Enabled");
}
}

@Test(priority =63,groups = {"Functional","Smoke"})
public void DisscountTypeDropdownofConcessionCalculatorPopUpisEnabledandSelectValue() {
boolean DisscountTypeDropdown = bsh.ValidateDisscountTypeDropdownofConcessionCalculatorPopUpisEnabled();
softAssert.assertTrue(DisscountTypeDropdown, "Disscount Dropdwon is not Enabled");
if(DisscountTypeDropdown == true) {
	System.out.println("Disscount Dropdwon is Enabled");
	delay();
	bsh.SelectValuefromDisscountTypeDropdownofConcessionCalculatorPopUp();
}
}

@Test(priority =64,groups = {"Functional"})
public void DisscountTypeDropdownofConcessionCalculatorPopUpisMultiple() {
boolean DisscountTypeDropdown = bsh.ValidateDisscountTypeDropdownofConcessionCalculatorPopUpisMultiple();
softAssert.assertFalse(DisscountTypeDropdown, "Disscount Dropdwon is Multiple");
if(DisscountTypeDropdown == false) {
	System.out.println("Disscount Dropdwon is Not Multiple");
}
}

@Test(priority =65,groups = {"Functional"})
public void DisscountAmountTextboxofConcessionCalculatorPopUpisEnabledandEnterInValidAmount() throws Exception {
boolean DisscountAmountTextBox = bsh.ValidateDisscountAmountTextboxofConcessionCalculatorPopUpisEnabled();
softAssert.assertTrue(DisscountAmountTextBox, "Disscount Amount Text Box is Not Enabled");
if(DisscountAmountTextBox == true) {
	System.out.println("Disscount Amount Text Box is Enabled");
	delay();
	bsh.EnterInValidAmountintotheDisscountAmountTextBox("200");
softAssert.assertEquals(GetAlertText(), "Please Enter Valid Discount Amount...", "Alert message Not matched");
delay();
HandleAlert();
}
}

@Test(priority =66,groups = {"Functional","Smoke"})
public void DisscountAmountTextboxofConcessionCalculatorPopUpisEnabledandEnterValidAmount() throws Exception {
boolean DisscountAmountTextBox = bsh.ValidateDisscountAmountTextboxofConcessionCalculatorPopUpisEnabled();
softAssert.assertTrue(DisscountAmountTextBox, "Disscount Amount Text Box is Not Enabled");
if(DisscountAmountTextBox == true) {
	System.out.println("Disscount Amount Text Box is Enabled");
	delay();
	bsh.EnterValidAmountintotheDisscountAmountTextBox("20");
}
}

@Test(priority =67,groups = {"Functional","Smoke"})
public void NetDisscountTextboxofConcessionCalculatorPopUpisEnabledandEnterInValidAmount() throws Exception {
boolean NetDisscountTextBox = bsh.ValidateNetDisscountTextboxofConcessionCalculatorPopUpisEnabled();
softAssert.assertTrue(NetDisscountTextBox, "Net Disscount Text Box is Not Enabled");
if(NetDisscountTextBox == true) {
	System.out.println("Net Disscount Text Box is Enabled");
	delay();
	bsh.EnterInValidAmountintotheNetDisscountTextBox("200");
throw new Exception("Net Disscount Text Box should not be editable.");
}
}

@Test(priority =68,groups = {"Functional","Smoke"})
public void NetDisscountTextboxofConcessionCalculatorPopUpisEnabledandEnterValidAmount() throws Exception {
boolean NetDisscountTextBox = bsh.ValidateDisscountAmountTextboxofConcessionCalculatorPopUpisEnabled();
softAssert.assertTrue(NetDisscountTextBox, "Net Disscount Text Box is Not Enabled");
if(NetDisscountTextBox == true) {
	System.out.println("Disscount Amount Text Box is Enabled");
	delay();
	bsh.EnterValidAmountintotheDisscountAmountTextBox("20");
	delay();
	bsh.SelcetAnotherDisscountTypeFromtheDropdownandEnterAmount("50");
}
}

@Test(priority =69 ,groups = {"Functional","Smoke"})
public void TotalAmountTextBoxofConcessionCalculatorPopUpisEnabled() throws Exception {
boolean TotalAmountTextBox = bsh.ValidateTotalAmountTextBoxofConcessionCalculatorPopUpisEnabled();
if(TotalAmountTextBox == true) {
	System.out.println("Total Amount Text Box is Enabled");
	delay();
throw new Exception("Total Amount Text Box in Concession Calculator Should Not be Editable");
}else if(TotalAmountTextBox == false) {
	System.out.println("Total Amount Text Box is Mot Enabled");
}
}

@Test(priority =70 ,groups = {"Functional","Smoke"})
public void DiscountAmountTextBoxofConcessionCalculatorPopUpisEnabled() throws Exception {
boolean DisscountAmountTextBox = bsh.ValidateDiscountAmountTextBoxofConcessionCalculatorPopUpisEnabled();
if(DisscountAmountTextBox == true) {
	System.out.println("Disscount Amount Text Box is Enabled");
	delay();
throw new Exception("Disscount Amount Text Box in Concession Calculator Should Not be Editable");
}else if(DisscountAmountTextBox == false) {
	System.out.println("Disscount Amount Text Box is Mot Enabled");
}
}

@Test(priority = 71,groups = {"Functional","Smoke"})
public void CalculateConcessionbuttonofConcessionCalculatorPopUpisEnabledandClickable() {
boolean CalculateConcession = bsh.ValidateCalculateConcessionbuttonofConcessionCalculatorPopUpisEnabled();
softAssert.assertTrue(CalculateConcession, "Calculate Concession Button is Not Enabled");
if(CalculateConcession == true) {
	System.out.println("Calculate Concession Button is Enabled");
	delay();
	//bsh.VerifyRecommendedTestDetails();
	delay();
	bsh.ClickonCalculateConcessionbuttonofConcessionCalculatorPopUp();
}
}

@Test(priority = 72,groups = {"Functional","Smoke"})
public void NextButtonisEnabledandClickable() {
bsh.PatientDetailsonBillSettleMentPageForVerification();
delay();
boolean Nextbutton = bsh.ValidateNextButtonisEnabled();
softAssert.assertTrue(Nextbutton, "Next Button is Not Enabled");
if(Nextbutton == true) {
	System.out.println("Next Button is Enabled");
	delay();
	bsh.ClickonNextButton();
HandleAlert();
delay();
HandleAlert();
}
}

@Test(priority = 73,groups = {"Functional","Smoke"})
public void RemarksTextAreaisEnabledandEnterRemarks() {
boolean Remarks = bsh.ValidateRemarksTextAreaisEnabled();
softAssert.assertTrue(Remarks, "Remarks TextArea is Not Enabled");
if(Remarks == true) {
	System.out.println("Remarks TextArea is Enabled");
	delay();
	bsh.EnterRemarksintoRemarksTextArea("Bill SettleMent Test");
}
}

@Test(priority = 74,groups = {"Functional","Smoke"})
public void SettleBillWithoutDischargeButtonisEnabledandClickable() {
boolean SettleBillbutton = bsh.ValidateSettleBillWithoutDischargeButtonisEnabled();
softAssert.assertTrue(SettleBillbutton, "Settle Bill Without Discharge Button is Not Enabled");
if(SettleBillbutton == true) {
	System.out.println("Settle Bill Without Discharge Button is Enabled");
	delay();
	bsh.ClickonSettleBillWithoutDischargeButton();
HandleAlert();
delay();
HandleAlert();
boolean GoForApprovallink = bsh.ValidateGoForApprovallinkisdisplayed();
softAssert.assertTrue(GoForApprovallink, "Go For Approval link is Not Displayed");
}
}	
	
@Test(priority = 75,groups = {"Functional","Smoke"})
public void GoForApprovallinkisEnabledandClickable() {
boolean GoForApprovallink = bsh.ValidateGoForApprovallinkisEnabled();
softAssert.assertTrue(GoForApprovallink, "Go For Approval link is Not Enabled");
if(GoForApprovallink == true) {
	System.out.println("Go For Approval link is Enabled");
	delay();
	bsh.ClickonGoForApprovallink();
}	
}	
	
@Test(priority = 76,groups = {"Functional"})
public void UHIDRadiobuttonisEnabledandSelectable() {
boolean UHIDRadiobutton = bsh.ValidateUHIDRadiobuttonisEnabled();
softAssert.assertTrue(UHIDRadiobutton, "UHID Radio button is Not Enabled");
if(UHIDRadiobutton == true) {
	System.out.println("UHID Radio button is Enabled");
	delay();
	bsh.SelectUHIDRadiobutton();
}
}

@Test(priority = 77,groups = {"Functional"})
public void UHIDRadiobuttonisSelected() {
boolean UHIDRadiobutton = bsh.ValidateUHIDRadiobuttonisSelecetd();
softAssert.assertTrue(UHIDRadiobutton, "UHID Radio button is Not Selected");
if(UHIDRadiobutton == true) {
	System.out.println("UHID Radio button is Selected");
}
}
	
@Test(priority = 78,groups = {"Functional"})
public void SearchbuttonisEnabledandClickable() {
boolean Searchbutton = bsh.ValidateSearchbuttonisEnabled();
softAssert.assertTrue(Searchbutton, "Search button is Not Enabled");
if(Searchbutton == true) {
	System.out.println("Search button is Enabled");
	delay();
	bsh.SelectSearchbutton();
softAssert.assertEquals(GetAlertText(), "Please Enter Valid UHID...", "Alert Message Not matched");
delay();
HandleAlert();
}
}
	
@Test(priority = 79,groups = {"Functional"})
public void EnterUHIDTextboxisEnabledandEnterInvalidID() {
boolean UHID = bsh.ValidateEnterUHIDTextBoxisEnabled();
softAssert.assertTrue(UHID, "Enter UHID Text Box is Not Enabled");
if(UHID == true) {
	System.out.println("Enter UHID Text Box is Enabled");
	delay();
	bsh.EnterInvalidUHIDintotheTextBox("HJJK &*");
softAssert.assertEquals(GetAlertText(), "Please Enter Valid UHID...", "Alert PopUp Message is not coming");
delay();
HandleAlert();
}
}
	
@Test(priority = 80,groups = {"Functional"})
public void EnterUHIDTextboxisEnabledandEnterInvalidlengthofID() {
boolean UHID = bsh.ValidateEnterUHIDTextBoxisEnabled();
softAssert.assertTrue(UHID, "Enter UHID Text Box is Not Enabled");
if(UHID == true) {
	System.out.println("Enter UHID Text Box is Enabled");
	delay();
	bsh.EnterInvalidlengthofUHIDintotheTextBox("2020000");
softAssert.assertEquals(GetAlertText(), "UHID ID Must be 11 Digit", "Alert PopUp Message is not coming");
delay();
HandleAlert();
}
}
	
@Test(priority = 81,groups = {"Functional"})
public void EnterUHIDTextboxisEnabledandEnterValidID() {
boolean UHID = bsh.ValidateEnterUHIDTextBoxisEnabled();
softAssert.assertTrue(UHID, "Enter UHID Text Box is Not Enabled");
if(UHID == true) {
	System.out.println("Enter UHID Text Box is Enabled");
	delay();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 2);
	delay();
	bsh.EnterValidUHIDintotheTextBox(ValidID);
}
}

@Test(priority =82,groups = {"Functional"})
public void PaymentModeDropdownisEnabledandSelectValue() {
boolean PaymentDropdown = bsh.ValidatePaymentModeDropdownisEnabled();
softAssert.assertTrue(PaymentDropdown, "Payment Mode Dropdwon is not Enabled");
if(PaymentDropdown == true) {
	System.out.println("Payment Mode Dropdwon is Enabled");
	delay();
	bsh.SelectValuefromPaymentModeDropdown();
boolean DetailReport = bsh.ValidateDetailsReportTableisDisplayed();
softAssert.assertTrue(DetailReport, "Detail Report table is not displayed");
}
}

@Test(priority =83,groups = {"Functional"})
public void PaymentModeDropdownisMultiple() {
boolean PaymentDropdown = bsh.ValidatePaymentModeDropdownisMultiple();
softAssert.assertTrue(PaymentDropdown, "Payment Mode Dropdwon is Multiple");
if(PaymentDropdown == false) {
	System.out.println("Payment Mode Dropdwon is Not Multiple");
}
}

@Test(priority = 84,groups = {"Functional"})
public void AdmissionIDRadiobuttonisEnabledandSelectable() {
boolean AdmissionIDRadiobutton = bsh.ValidateAdmissionIDRadiobuttonisEnabled();
softAssert.assertTrue(AdmissionIDRadiobutton, "Admission ID Radio button is Not Enabled");
if(AdmissionIDRadiobutton == true) {
	System.out.println("Admission ID Radio button is Enabled");
	delay();
	bsh.SelectAdmissionIDRadiobutton();
}
}

@Test(priority = 85,groups = {"Functional"})
public void AdmissionIDRadiobuttonisSelected() {
boolean AdmissionIDRadiobutton = bsh.ValidateAdmissionIDRadiobuttonisSelecetd();
softAssert.assertTrue(AdmissionIDRadiobutton, "Admission ID Radio button is Not Selected");
if(AdmissionIDRadiobutton == true) {
	System.out.println("Admission ID Radio button is Selected");
}
}

@Test(priority = 86,groups = {"Functional"})
public void AdmissionIDTextboxisEnabledandEnterInvalidID() {
boolean AdmissionID = bsh.ValidateAdmissionIDTextBoxisEnabled();
softAssert.assertTrue(AdmissionID, "AdmissionID Text Box is Not Enabled");
if(AdmissionID == true) {
	System.out.println("AdmissionID Text Box is Enabled");
	delay();
	bsh.EnterInvalidAdmissionIDintotheTextBox("HJJK &*");
	delay();
softAssert.assertEquals(GetAlertText(), "Please Enter Valid Admission Id...", "Alert PopUp Message is not coming");
delay();
HandleAlert();
}
}
		
@Test(priority = 87,groups = {"Functional"})
public void AdmissionIDTextboxisEnabledandEnterValidID() {
boolean AdmissionID = bsh.ValidateAdmissionIDTextBoxisEnabled();
softAssert.assertTrue(AdmissionID, "AdmissionID Text Box is Not Enabled");
if(AdmissionID == true) {
	System.out.println("AdmissionID Text Box is Enabled");
	delay();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "IPNumber", 2);
	delay();
	bsh.EnterValidAdmissionIDintotheTextBox(ValidID);
	delay();
boolean DetailReport = bsh.ValidateDetailsReportTableisDisplayed();
delay();
softAssert.assertTrue(DetailReport, "Detail Report table is not displayed");
}
}

@Test(priority = 88,groups = {"Functional","Smoke"})
public void DateRadiobuttonisEnabledandSelectable() {
boolean DateRadiobutton = bsh.ValidateDateRadiobuttonisEnabled();
softAssert.assertTrue(DateRadiobutton, "Date Radio button is Not Enabled");
if(DateRadiobutton == true) {
	System.out.println("Date Radio button is Enabled");
	delay();
	bsh.SelectDateRadiobutton();
}
}

@Test(priority = 89,groups = {"Functional"})
public void DateRadiobuttonisSelected() {
boolean DateRadiobutton = bsh.ValidateDateRadiobuttonisSelecetd();
softAssert.assertTrue(DateRadiobutton, "Date Radio button is Not Selected");
if(DateRadiobutton == true) {
	System.out.println("Date Radio button is Selected");
}
}

@Test(priority = 90,groups = {"Functional"})
public void OpenbuttonisEnabledandClickable() {
boolean Openbutton = bsh.ValidateOpenbuttonisEnabled();
softAssert.assertTrue(Openbutton, "Open button is Not Enabled");
if(Openbutton == true) {
	System.out.println("Open button is Enabled");
	delay();
	bsh.ClickonOpenbutton();
}
}

@Test(priority = 91,groups = {"Functional"})
public void CancelbuttonisEnabledandClickable() {
boolean Cancelbutton = bsh.ValidateCancelbuttonisEnabled();
softAssert.assertTrue(Cancelbutton, "Cancel button is Not Enabled");
if(Cancelbutton == true) {
	System.out.println("Cancel button is Enabled");
	delay();
	bsh.ClickonCancelbutton();
}
}

@Test(priority = 92,groups = {"Functional","Smoke"})
public void SelectbuttonisEnabledandClickable() {
boolean Selectbutton = bsh.ValidateSelectbuttonisEnabled();
softAssert.assertTrue(Selectbutton, "Select button is Not Enabled");
if(Selectbutton == true) {
	System.out.println("Select button is Enabled");
	delay();
	bsh.ClickonSelectbutton();
delay();
//bsh.PatientDetailsDuringSettlementForVerification();
delay();
//bsh.PatientDetailsDuringSettlementApprovalForVerification();
//bsh.VerifyPatientDetails();
}
}

@Test(priority = 93,groups = {"Functional","Smoke"})
public void GeneratebuttonisEnabledandClickable() {
boolean Generatebutton = bsh.ValidateGeneratebuttonisEnabled();
softAssert.assertTrue(Generatebutton, "Generate button is Not Enabled");
if(Generatebutton == true) {
	System.out.println("Generate button is Enabled");
	delay();
	bsh.ClickonGeneratebutton();
	delay();
	bst.switchtoPrintPageFrame();
	delay();
	bsh.PatientDetailsonBillSettleMentPrintPageForVerification();
	delay();
	bst.switchtoPrintbackFrame();
	delay();
	bsh.ClickonBackbutton();
	bst.switchtoLeftFrame();
	delay();
	bsh.ClickonBillsettlementlink();
	delay();
	bst.switchtoinnerRightFrame();
}
}
@Test(priority = 94,groups = {"Functional","Smoke"})
public void SettleBillWithDischargebuttonisEnabledandClickable() {
boolean SettleBill = bsh.ValidateSettleBillWithDischargebuttonisEnabled();
softAssert.assertTrue(SettleBill, "Settle Bill With Discharge button is Not Enabled");
if(SettleBill == true) {
	System.out.println("Settle Bill With Discharge button is Enabled");
	delay();
	Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

	String ValidID = reader.getCellData("OPD", "UHID", 2);
	delay();
	bsh.EnterUHIDandClickonNextButton(ValidID);
	delay();
	HandleAlert();
	delay();
    HandleAlert();
	delay();
	bsh.ClickonSettleBillWithDischargebutton();
	delay();
	HandleAlert();
	delay();
    HandleAlert();

	/*bsh.VerifyRecommendedTestDetails();
	bsh.VerifyPatientDetails();
	bsh.VerifyPatientDetailsonReceipt();*/
}
}







}
