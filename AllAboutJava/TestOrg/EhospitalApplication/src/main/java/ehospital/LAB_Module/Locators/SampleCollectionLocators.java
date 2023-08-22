package ehospital.LAB_Module.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class SampleCollectionLocators {

	@FindBy(linkText = "Laboratory")
	private @Getter WebElement LabModule;
	
	@FindBy(linkText = "Sample Collection")
	private @Getter WebElement SampleCollectionlink;
	
	@FindBy(xpath = "//*[contains(@id,'SampleCollectionCentreDropdown')]")
	private @Getter WebElement SampleCollectionCentreDropdown;
	
	@FindBy(xpath = "//*[contains(@onclick,'return submitForm();')]")
	private @Getter WebElement ContinueWithSelected;
	
	@FindBy(linkText = "Change Collection Centre")
	private @Getter WebElement ChangeCollectionCentre;
	
	@FindBy(xpath = "//*[contains(@id,'regno')]")
	private @Getter WebElement UHIDTextBox;
	
	@FindBy(xpath = "//*[contains(@value,'Go >>')]")
	private @Getter WebElement Gobutton;
	
	@FindBy(id = "patientInfoDiv_img")
	private @Getter WebElement 	PatientinformationImagebutton;
	
	@FindBy(id = "sampleDiv_img")
	private @Getter WebElement CollectedSampledetailsImagebutton;
	
	@FindBy(id = "obsDiv_img")
	private @Getter WebElement ObservationEntryDone;
	
	@FindBy(id = "testSubtestDiv_img")
	private @Getter WebElement RecommendedDetails;
	
	@FindBy(linkText = "Add New Investigation")
	private @Getter WebElement AddNewInvestigationlink; 
	
	@FindBy(xpath = "//input[starts-with(@id,'specimenSite')]")
	private @Getter WebElement SpecimenSiteTextBox;
	
	@FindBy(xpath = "//input[@value='0']")
	private @Getter WebElement SelectAllCheckbox;
	
	@FindBy(xpath = "//input[starts-with(@id,'sampleCollected')]")
	private @Getter WebElement Select1stCheckbox;
	
	@FindBy(xpath = "//*[contains(@value,' Save ')]")
	private @Getter WebElement SampleCollectionSavebutton;
	
	@FindBy(xpath = "//a[starts-with(@class,'bluelink')][1]")
	private @Getter WebElement GetSampleNumber;
	
	
	////////////////////////////////////////Lab Consolidated Report Tab Elements///////////////////////////////////////
	
	@FindBy(xpath = "//span[text()='Lab Consolidated Report ']")
	private @Getter WebElement LabConsolidatedReportbutton;
	
	@FindBy(xpath = "//*[contains(@class,'bluelink_tmp')]")
	private @Getter WebElement ViewTemplate;
	
	@FindBy(xpath = "//*[contains(@class,'close')]")
	private @Getter WebElement Closebutton;
	
	@FindBy(id = "labDropdown")
	private @Getter WebElement ConsolidatedReportLabDropdown;
	
	@FindBy(xpath = "//*[contains(@value,'Go >>')]")
	private @Getter WebElement ConsolidatedReportLabGObutton;
	
	@FindBy(xpath = "(//img[@src = '/ehospital/images/cal.gif'])[1]")
	private @Getter WebElement ConsolidatedReportStartDateImageCalender;
	
	@FindBy(xpath = "(//img[@src = '/ehospital/images/cal.gif'])[2]")
	private @Getter WebElement ConsolidatedReportendDateImageCalender;
	
	@FindBy(xpath = "//*[contains(@href,'javascript:CP_tmpReturnFunction(2020,4,22);CP_hideCalendar('0');')]")
	private @Getter WebElement ConsolidatedReportselectstartdate;
	
	@FindBy(xpath = "//*[contains(@href,'javascript:CP_tmpReturnFunction(2020,4,22);CP_hideCalendar('0');')]")
	private @Getter WebElement ConsolidatedReportEndDate;
	
	@FindBy(id = "txtsearch2")
	private @Getter WebElement ConsolidatedReportobservationSearchBox;
	
	@FindBy(xpath = "/html/body/div[8]/span/a")
	private @Getter WebElement ConsolidatedReportmaincloseoption;
	
	////////////////////////////////Search New Patient Tab Elements/////////////////////////////////////////////////////
	
	@FindBy(linkText = "Search New Patient")
	private @Getter WebElement SearchNewPatient;
	
	@FindBy(xpath = "//*[contains(@value , 'pn')]")
	private @Getter WebElement AnyPartofNameRadiobutton;
	
	@FindBy(id = "T1")
	private @Getter WebElement AnyPartofNameTextBox;
	
	@FindBy(xpath = "//*[contains(@value,'Submit')]")
	private @Getter WebElement AnyPartofNameSubmitbutton;
	
	@FindBy(xpath = "//*[contains(@value,'Select')]")
	private @Getter WebElement Selectbutton;
	
	@FindBy(xpath = "//*[contains(@value,'rd')]")
	private @Getter WebElement Datewiseradiobutton;
	
	@FindBy(xpath = "(//img[@src = '../images/cal.gif'])[1]")
	private @Getter WebElement firstdatewisecalendarimage;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[1]/td/form/table/tbody/tr[3]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/center/table[2]/tbody/tr[8]/td/a")
	private @Getter WebElement Selectdate;
	
	@FindBy(xpath = "(//img[@src = '../images/cal.gif'])[2]")
	private @Getter WebElement lastdatewisecalendarimage;
	
	@FindBy(css = "#table4 > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(8) > input:nth-child(1)")
	private @Getter WebElement datewisefilterSubmitbutton;
	
	@FindBy(xpath = "//*[contains(@value,'cn')]")
	private @Getter WebElement ContactNoRadiobutton;
	
	@FindBy(xpath = "//*[contains(@value,'rn')]")
	private @Getter WebElement UHIDRadiobutton;
	
	////////////////////////////////////////////////Order Entry Advance Page elements/////////////////////
	@FindBy(xpath = "//*[contains(@value,'Verify Observation(s)/Medicine(s)')]")
	private @Getter WebElement VerifyObservationMedicinebutton;
	
	@FindBy(id = "allCatRadio")
	private @Getter WebElement AllCategoryRadiobutton;
	
	@FindBy(xpath = "//*[contains(@id,'allCatDD')]")
	private @Getter WebElement AllCategoryDropdown;
	
	@FindBy(xpath = "//img[@alt='Add Observation'][1]")
	private @Getter WebElement Addservicebutton;
	
	@FindBy(xpath = "//*[contains(@src,'/ehospital/images/delete2.jpg')]")
	private @Getter WebElement cancelservicebutton;
	
	@FindBy(xpath = "//*[contains(@id,'filterTextInput')]")
	private @Getter WebElement FilterObservationTableSearchbox;
	
	@FindBy(id = "procedureCatRadio")
	private @Getter WebElement ProcedureRadiobutton;
	
	@FindBy(xpath = "//*[contains(@id,'surgeryCatDD')]")
	private @Getter WebElement ProcedureDropdown;
	
	@FindBy(id = "immunCatRadio")
	private @Getter WebElement ImmunizationRadiobutton;
	
	@FindBy(xpath = "//*[contains(@id,'immunizationCatDD')]")
	private @Getter WebElement ImmunizationDropdown;
	
	@FindBy(id = "otherCatRadio")
	private @Getter WebElement OtherServicesRadiobutton;
	
	@FindBy(xpath = "//*[contains(@id,'otherServicesCatDD')]")
	private @Getter WebElement OtherServicesdropdown;
	
	@FindBy(id = "medCatRadio")
	private @Getter WebElement Medicineradiobutton;
	
	@FindBy(xpath = "//*[contains(@rel,'MedicineGrpDiv')]")
	private @Getter WebElement MedicineGroupTab;
	
	@FindBy(xpath = "//*[contains(@id,'MedicineGrpDD')]")
	private @Getter WebElement MedicineDropdown;
	
	@FindBy(xpath = "//*[contains(@title,'Enter this Medicine Quantity..')]")
	private @Getter WebElement MedicineQuantityTextBox;
	
	@FindBy(xpath = "//*[contains(@title,'Enter Medicine advice.. e.g. Medicine dose etc..')]")
	private @Getter WebElement MedicineAdviceTextbox;
	
	@FindBy(xpath = "//*[contains(@alt,'Add Medicine')]")
	private @Getter WebElement AddMedicinebutton;
	
	@FindBy(xpath = "//*[contains(@rel,'medAlphabetDiv')]")
	private @Getter WebElement SearchMedicinewithNameStarttab;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[7]/td[1]/div[2]/table/tbody/tr[2]/td/div/div[2]/div[1]/a[2]")
	private @Getter WebElement MedicineFirstletter;
	
	@FindBy(xpath = "//img[@alt='Add Medicine'][1]")
	private @Getter WebElement MedicineCancelServicebutton;
	
	@FindBy(xpath = "//*[contains(@rel,'medSearchDiv')]")
	private @Getter WebElement Searchoption;
	
	@FindBy(xpath = "//*[contains(@id,'medSearchTxt')]")
	private @Getter WebElement AnycharacterofMedicineNameTextBox;
	
	@FindBy(xpath = "//*[contains(@value,'Search')]")
	private @Getter WebElement SearchopttionforAnycharacterofMedicineName;
	
	@FindBy(xpath = "//*[contains(@id,'dropdownDD')]")
	private @Getter WebElement DepartMentDropdownonOforderEntryPage;
	
	@FindBy(xpath = "//*[contains(@id,'unitDD')]")
	private @Getter WebElement UnitDropdownonOforderEntryPage;
	
	@FindBy(xpath = "//*[contains(@id,'txtDocContact')]")
	private @Getter WebElement ContactnumberTextboxOforderEntryPage;
	
	@FindBy(id ="investCatRadio" )
	private @Getter WebElement Investigationradiobutton;
	
	@FindBy(xpath = "//*[contains(@id,'investigationCatDD')]")
	private @Getter WebElement InvestigationDropdown;
	
	@FindBy(xpath = "//img[@alt='Add Observation'][1]")
	private @Getter WebElement InvestigationAddservicebutton1;
	
	@FindBy(xpath = "//*[@alt='Add Observation']//following::img[1]")
	private @Getter WebElement InvestigationAddservicebutton2;
	
	@FindBy(xpath = "//*[@alt='Add Observation']//following::img[2]")
	private @Getter WebElement InvestigationAddservicebutton3;
	
	@FindBy(xpath = "//*[contains(@value,'Close')]")
	private @Getter WebElement PrePostInstructionCommentRemarkspopupClosebutton;
	
	@FindBy(xpath = "//*[contains(@value,'Save')]")
	private @Getter WebElement PrePostInstructionCommentRemarkspopupSavebutton;
	
	@FindBy(xpath = "//*[contains(@rows,'2')]")
	private @Getter WebElement PrePostInstructionCommentRemarkspopup1stcommentbox;
	
	@FindBy(xpath = "//*[contains(@id,'txtComments')]")
	private @Getter WebElement PrePostInstructionCommentRemarkspopup2ndcommentbox;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[7]/td[2]/div[1]/table/tbody/tr[2]/td[2]/label[1]")
	private @Getter WebElement ActualDoctornameonorderentrypage;
	
	@FindBy(xpath = "//*[@id='tmpDocName']")
	private @Getter WebElement expectedDoctornameonoPrePostInstructionCommentRemarkspage;
	
	@FindBy(xpath = "//*[@id='txtDocContact']")
	private @Getter WebElement ActualContactnumberonorderentrypage;
	
	@FindBy(xpath = "//*[@id='txtDocContact']")
	private @Getter WebElement excpectedContactnumberonPrePostInstructionCommentRemarkspage;
	
	@FindBy(xpath = "/html/body/div[4]/table/tbody/tr[1]/td/a")
	private @Getter WebElement Popupcloseoption;
	
	@FindBy(xpath = "/html/body/div[8]/span/a")
	private @Getter WebElement Closeoptionfororderentrypage;

	
	
	
	
	
	

	
	
public SampleCollectionLocators(WebDriver driver) {

 PageFactory.initElements(driver, this); 
}

}
