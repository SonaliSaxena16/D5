package ehospital.LAB_Module.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ehospital.ADT_Module.Locators.ExistingPatientLocators;
import ehospital.LAB_Module.Locators.SampleCollectionLocators;
import in.nic.ehospial.generic.BaseClass;

public class SampleCollectionHelper extends BaseClass {
	public WebDriver driver;
	
	SampleCollectionLocators SampleCollection;
									
									
	public SampleCollectionHelper(WebDriver driver) {
	this.driver = driver;
	SampleCollection = new SampleCollectionLocators(driver);
}
	
//Action
	
//Validate Lab module is displayed or not
public boolean ValidateLabmoduleisdispalyed() {
	WebElement LaboratoryModule = SampleCollection.getLabModule();
	return LaboratoryModule.isDisplayed();
	}

//validate Lab module is enabled or not
public boolean ValidateLabmoduleisenabled() {
	WebElement LaboratoryModule = SampleCollection.getLabModule();
	return LaboratoryModule.isEnabled();
	 }

//select Lab module
public void selectlabmodule() {
	SampleCollection.getLabModule().click();	
	}

//validate Sample collection link is displayed or not
public boolean validatesamplecollectionlnkisdisplayed() {
	WebElement samplecollectionlnk = SampleCollection.getSampleCollectionlink();
	return samplecollectionlnk.isDisplayed();
	}

//validate Sample collection link is enabled or not
public boolean validatesamplecollectionlnkisenabled() {
	WebElement samplecollectionlnk = SampleCollection.getSampleCollectionlink();;
	return samplecollectionlnk.isEnabled();
	}

//select Sample collection link
public void selectsamplecollectionlink() {
	SampleCollection.getSampleCollectionlink().click();	
	}
		
//validate drop down box is displayed
public boolean Validatedropdownboxisdisplayed() {
	WebElement dropdownbox = SampleCollection.getSampleCollectionCentreDropdown();
	return dropdownbox.isDisplayed();
	}

//validate drop down list is enabled
public boolean Valiadtedropdownlistisenabled() {
	WebElement dropdownbox = SampleCollection.getSampleCollectionCentreDropdown();
	return dropdownbox.isEnabled();
	}

//select value from drop down
public void selectvaluefromdropdown() {
	selectDropdownVisibleElementwithIndexValue(SampleCollection.getSampleCollectionCentreDropdown(),1);
	/*Select 	dopdown = new Select (SampleCollection.getSampleCollectionCentreDropdown());
			dopdown.selectByIndex(1);*/
	}

//validate Continue With Selected button is displayed
public boolean ValidateContinueWithSelectedisdisplayed() {
	WebElement ContinueWithSelectedbutton = SampleCollection.getContinueWithSelected();
	return ContinueWithSelectedbutton.isDisplayed();
	}

//validate Continue With Selected button is enabled
public boolean ValidateContinueWithSelectedisenabled() {
	WebElement ContinueWithSelectedbutton = SampleCollection.getContinueWithSelected();
	return ContinueWithSelectedbutton.isEnabled();
	}

//select ContinueWithSelected button
public void selectContinueWithSelectedbutton() {
	SampleCollection.getContinueWithSelected().click();
	}

//validate change collection center link is displayed 
public boolean ValidateChangeCollectionCentreisdispalyed() {
	WebElement ChangecollectionCentre = SampleCollection.getChangeCollectionCentre();
	return ChangecollectionCentre.isDisplayed();
	}

//validate change collection center link is displayed 
public boolean ValidateChangeCollectionCentreisenabled() {
	WebElement ChangecollectionCentre = SampleCollection.getChangeCollectionCentre();
	return ChangecollectionCentre.isEnabled();
	}

//select change collection center 
public void selectChangeCollectionCentrelink() throws InterruptedException {
	SampleCollection.getChangeCollectionCentre().click();
	delay();
	selectDropdownVisibleElementwithIndexValue(SampleCollection.getChangeCollectionCentre(),0);
	/*Select 	dopdown = new Select (SampleCollectionCentreDropdown);
	dopdown.selectByIndex(0);*/
	delay();
	SampleCollection.getContinueWithSelected().click();
	}
	
//validate UHIDTextbox is displayed
public boolean validateUHIDTextboxisdisplayed() {
	WebElement UHIDTextboxisdisplayed = SampleCollection.getUHIDTextBox();
	return UHIDTextboxisdisplayed.isDisplayed();
	}
		
//validate UHIDTextbox is displayed
public boolean validateUHIDTextboxisenabled() {
    WebElement UHIDTextboxisdisplayed = SampleCollection.getUHIDTextBox();
	return UHIDTextboxisdisplayed.isEnabled();
	}
		
//validate GO button is displayed
public boolean validateGObuttonisdispalyed() {
	WebElement GObuttonisdisplayed = SampleCollection.getGobutton();
	return 	GObuttonisdisplayed.isDisplayed();
	}
		
//validate GO button is Enabled
public boolean validateGObuttonisenabled() {
	WebElement GObuttonisdisplayed = SampleCollection.getGobutton();
	return 	GObuttonisdisplayed.isEnabled();
	}
		
//Click on Go button without enter UHID
public void ClickonGobuttonwithoutenterUHID() throws InterruptedException {
	delay();
	SampleCollection.getGobutton().click();
	}
		
//Click on Go button with Invalid UHID
public void ClickonGobuttonwithInvalidUHID(String Invalid) throws InterruptedException {
	delay();
	SampleCollection.getUHIDTextBox().sendKeys(Invalid);
	delay();
	SampleCollection.getGobutton().click();
	delay();
	SampleCollection.getUHIDTextBox().clear();
	}
		
//Click on Go button with valid UHID
public void ClickonGobuttonwithvalidUHID(String valid) throws InterruptedException {
	delay();
	SampleCollection.getUHIDTextBox().sendKeys(valid);
	delay();
	SampleCollection.getGobutton().click();	
	}

//validate Patient information Image button is displayed
public boolean validatePatientinformationImagebuttonisdisplayed() {
	WebElement PatientinformationImage = SampleCollection.getPatientinformationImagebutton();
	return PatientinformationImage.isDisplayed();
}

//validate Patient information Image button is enabled
public boolean validatePatientinformationImagebuttonisenabled() {
	WebElement PatientinformationImage = SampleCollection.getPatientinformationImagebutton();
	return PatientinformationImage.isEnabled();
}
		
//click on Patient information Image button
public void clickonPatientinformationImagebutton() throws InterruptedException {
	SampleCollection.getPatientinformationImagebutton().click();
	delay();
	SampleCollection.getPatientinformationImagebutton().click();
	}
			
//validate Collected Sample details Image button is displayed
public boolean validateCollectedSampledetailsImagebuttonisdisplayed() {
	WebElement CollectedSampledetailsImage = SampleCollection.getCollectedSampledetailsImagebutton();
	return CollectedSampledetailsImage.isDisplayed();
	}

//validate Collected Sample details Image button is displayed
public boolean validateCollectedSampledetailsImagebuttonisenabled() {
	WebElement CollectedSampledetailsImage = SampleCollection.getCollectedSampledetailsImagebutton();
	return CollectedSampledetailsImage.isEnabled();
	}
			
//click on Collected Sample details Image
public void clickonCollectedSampledetailsImagebutton() {
	SampleCollection.getCollectedSampledetailsImagebutton().click();	
	}
	  	
//validate ObservationEntryDoneImage  button is displayed
public boolean validateObservationEntryDoneisdisplayed() {
	WebElement ObservationEntryDoneImage = SampleCollection.getObservationEntryDone();
	return ObservationEntryDoneImage.isDisplayed();
	}

//validate ObservationEntryDoneImage  button is displayed
public boolean validateObservationEntryDoneisenabled() {
	WebElement ObservationEntryDoneImage = SampleCollection.getObservationEntryDone();
	return ObservationEntryDoneImage.isEnabled();
	}
					
//click on ObservationEntryDoneImage 
public void clickonObservationEntryDoneImagebutton() {
	SampleCollection.getObservationEntryDone().click();	
	}
	
//validate RecommendedDetails image button is displayed
public boolean validateRecommendedDetailsimageisdisplayed() {
	 WebElement RecommendedDetailsImage = SampleCollection.getRecommendedDetails();
	 return RecommendedDetailsImage.isDisplayed();
     }

//validate RecommendedDetails image button is enabled
public boolean validateRecommendedDetailsimageisenabled() {
	WebElement RecommendedDetailsImage = SampleCollection.getRecommendedDetails();
	return RecommendedDetailsImage.isEnabled();
	}

//click on RecommendedDetails Image
public void clickonRecommendedDetailsImagebutton() throws InterruptedException {
	SampleCollection.getRecommendedDetails().click();	
	delay();
	SampleCollection.getRecommendedDetails().click();	
	}
		
//validate Add New Investigation link is displayed
public boolean validateAddNewInvestigationlinkisdisplayed() {
	WebElement addNewInvestigationlink = SampleCollection.getAddNewInvestigationlink();
	return addNewInvestigationlink.isDisplayed();
	}

//validate Add New Investigation link is enabled
public boolean validateAddNewInvestigationlinkisenabled() {
	WebElement addNewInvestigationlink = SampleCollection.getAddNewInvestigationlink();
	return addNewInvestigationlink.isEnabled();
    }

//click on add new investigation link 
public void clickonaddnewinvestigationlink() {
	SampleCollection.getAddNewInvestigationlink().click();
	}
		
//validate LabConsolidatedReportbutton is displayed
public boolean validateLabConsolidatedReportbuttonisdisplayed() {
	WebElement labConsolidatedReportbutton = SampleCollection.getLabConsolidatedReportbutton();
	return labConsolidatedReportbutton.isDisplayed();
	}

//validate LabConsolidatedReportbutton is enabled
public boolean validateLabConsolidatedReportbuttonisenabled() {
	WebElement labConsolidatedReportbutton = SampleCollection.getLabConsolidatedReportbutton();
	return labConsolidatedReportbutton.isEnabled();
    }

//click on LabConsolidatedReportbutton
public void clickonLabConsolidatedReportbutton() {
	SampleCollection.getLabConsolidatedReportbutton().click();	
	}
		
//validate view template option is displayed
public boolean validateviewtemplateoptionisdisplayed() {
	WebElement viewtemplateoptionisdisplayed = SampleCollection.getViewTemplate();
	return viewtemplateoptionisdisplayed.isDisplayed();
	}
		
//validate view template option is enabled
public boolean validateviewtemplateoptionisenabled() {
	WebElement viewtemplateoptionisdisplayed = SampleCollection.getViewTemplate();
	return viewtemplateoptionisdisplayed.isEnabled();
	}
		
//click on view template option
public void clickonviewTemplateoption() {
	SampleCollection.getViewTemplate().click();	
	}
		
//validate close option is displayed
public boolean validatecloseoptionisdisplayed() {
	WebElement closeoptionisdisplayed = SampleCollection.getClosebutton();
	return closeoptionisdisplayed.isDisplayed();
	}

//validate close option is displayed
public boolean validatecloseoptionisenabled() {
	WebElement closeoptionisdisplayed = SampleCollection.getClosebutton();
	return closeoptionisdisplayed.isEnabled();
	}

//click on close option
public void clickoncloseoption() {
	SampleCollection.getClosebutton().click();
	}
		
//validate GO button is displayed
public boolean validateConsolidatedReportLabGObuttonisdisplayed() {
	WebElement GObuttonisdisplayed = SampleCollection.getConsolidatedReportLabGObutton();
	return GObuttonisdisplayed.isDisplayed();
	}
		
//validate GO button is enabled
public boolean validateConsolidatedReportLabGObuttonisenabled() {
	WebElement GObuttonisdisplayed = SampleCollection.getConsolidatedReportLabGObutton();
	return GObuttonisdisplayed.isEnabled();
	}
		
//click on Go button without select Date
public void clickonGobuttonwithoutselectDate() {
	SampleCollection.getConsolidatedReportLabGObutton().click();
	}
		
//validate Date wise calendar image is displayed
public boolean ValiadteDateWiseCalendarImageisdispalyed() {
	WebElement DateWiseCalendarImage = SampleCollection.getConsolidatedReportStartDateImageCalender();
	return DateWiseCalendarImage.isDisplayed();
	}
		
//validate Date wise calendar image is enabled
public boolean ValiadteDateWiseCalendarImageisenabled() {
	WebElement DateWiseCalendarImage = SampleCollection.getConsolidatedReportStartDateImageCalender();
	return DateWiseCalendarImage.isEnabled();
	}

//click on Date wise calendar image 
public void clickonDatewisecalendarimageandselectstartdateandclickonGobutton() throws InterruptedException {
	SampleCollection.getConsolidatedReportStartDateImageCalender().click();
	delay();
	SampleCollection.getConsolidatedReportselectstartdate().click();
	delay();
	SampleCollection.getConsolidatedReportLabGObutton().click();
	}
		
//click on Date wise calendar image and select end date and click on go button
public void clickonDatewisecalendarimageandselectenddateandclickonGobutton() throws InterruptedException {
	SampleCollection.getConsolidatedReportendDateImageCalender().click();
	delay();
	SampleCollection.getConsolidatedReportEndDate().click();
	delay();
	SampleCollection.getConsolidatedReportLabGObutton().click();
	}

//validate observation Search box is enabled
public boolean ValidateobservationsearchBoxisenabled() {
	WebElement observationsearchBoxisenabled = SampleCollection.getConsolidatedReportobservationSearchBox();
	return observationsearchBoxisenabled.isEnabled();
	}

//enter data into search box
public void enterdataintosearchbox(String Test) {
	SampleCollection.getConsolidatedReportobservationSearchBox().sendKeys(Test);
	}
		
//validate ConsolidatedReportclose button is enabled 
public boolean consolidatedReportclosebuttonisenabled() {
	WebElement consolidatedReportclosebutton = SampleCollection.getConsolidatedReportmaincloseoption();
	return consolidatedReportclosebutton.isEnabled();
	}

//click on close option
public void clickonConsolidatedReportcloseoption() {
	SampleCollection.getConsolidatedReportmaincloseoption().click();	
	}
		
////////////////////////////////////////Search New Patient Tab////////////////////
		
//validate Search New Patient Tab is Displayed
public boolean validateSearchNewPatientTabisdisplayed() {
	WebElement SearchNewPatientTab = SampleCollection.getSearchNewPatient();
	return SearchNewPatientTab.isDisplayed();
	}

//validate Search New Patient Tab is Enabled
public boolean validateSearchNewPatientTabisenabled() {
	WebElement SearchNewPatientTab = SampleCollection.getSearchNewPatient();
	return SearchNewPatientTab.isEnabled();
	}

//click on Search New Patient Tab
public void clickonSearchNewPatientTab() {
	SampleCollection.getSearchNewPatient().click();	
	}

//validate AnyPartofNameRadiobutton is displayed
public boolean validateAnyPartofNameRadiobuttonisdisplayed() {
	WebElement AnyPartofNameRadiobuttonisdisplayed = SampleCollection.getAnyPartofNameRadiobutton();
	return AnyPartofNameRadiobuttonisdisplayed.isDisplayed();
	}
		
//validate AnyPartofNameRadiobutton is enabled
public boolean validateAnyPartofNameRadiobuttonisenabled() {
	WebElement AnyPartofNameRadiobuttonisenabled = SampleCollection.getAnyPartofNameRadiobutton();
	return AnyPartofNameRadiobuttonisenabled.isEnabled();
	}
		
//select AnyPartofNameRadiobutton
public void selectAnyPartofNameRadiobutton() {
	SampleCollection.getAnyPartofNameRadiobutton().click();	
	}
		
//validate AnyPartofNameTextBox is displayed
public boolean validateAnyPartofNameTextBoxisdisplayed() {
	WebElement AnyPartofNameTextBoxisdisplayed = SampleCollection.getAnyPartofNameTextBox();
	return AnyPartofNameTextBoxisdisplayed.isDisplayed();
	}
		
//validate AnyPartofNameTextBox is enabled
public boolean validateAnyPartofNameTextBoxisenabled() {
	WebElement AnyPartofNameTextBoxisenabled = SampleCollection.getAnyPartofNameTextBox();
	return AnyPartofNameTextBoxisenabled.isEnabled();
	}
		
//validate submit button is displayed
public boolean validateAnyPartofNameSubmitbuttonisdisplayed() {
	WebElement AnyPartofNameSubmitbuttonisdisplayed = SampleCollection.getAnyPartofNameSubmitbutton();
	return AnyPartofNameSubmitbuttonisdisplayed.isDisplayed();
	}
		
//validate submit button is enabled
public boolean validateAnyPartofNameSubmitbuttonisenabled() {
	WebElement AnyPartofNameSubmitbuttonisenabled = SampleCollection.getAnyPartofNameSubmitbutton();
	return AnyPartofNameSubmitbuttonisenabled.isEnabled();
	}
		
//click on submit button
public void clickonsubmitbutton() {
	SampleCollection.getAnyPartofNameSubmitbutton().click();
	}
		
//click on submit button with invalid data
public void clickonsubmitbuttonwithinvaliddata(String InValidName) throws InterruptedException {
	SampleCollection.getAnyPartofNameTextBox().sendKeys(InValidName);
	delay();
	SampleCollection.getAnyPartofNameSubmitbutton().click();
	delay();
	SampleCollection.getAnyPartofNameTextBox().clear();
	}
		
//click on submit button with valid data
public void clickonsubmitbuttonwithvaliddata(String ValidName) throws InterruptedException {
	SampleCollection.getAnyPartofNameTextBox().sendKeys(ValidName);
	delay();
	SampleCollection.getAnyPartofNameSubmitbutton().click();
	}
		
//validate Select button is displayed
public boolean validateSelectbuttonisdisplayed() {
    WebElement Selectbuttonisdisplayed = SampleCollection.getSelectbutton();
	return Selectbuttonisdisplayed.isDisplayed();
	}
		
//validate Select button is enabled
public boolean validateSelectbuttonisenabled() {
	WebElement Selectbuttonisenabled = SampleCollection.getSelectbutton();
	return Selectbuttonisenabled.isEnabled();
	}
		
//click on select button
public void clickonselectbutton() {
	SampleCollection.getSelectbutton().click();
	}
		
//validate Date wise radio button is displayed
public boolean validateDatewiseradiobuttonisdisplayed() {
	WebElement Datewiseradiobuttonisdisplayed = SampleCollection.getDatewiseradiobutton();
	return Datewiseradiobuttonisdisplayed.isDisplayed();
	}

//validate Date wise radio button is enabled
public boolean validateDatewiseradiobuttonisenabled() {
	WebElement Datewiseradiobuttonisenabled = SampleCollection.getDatewiseradiobutton();
	return Datewiseradiobuttonisenabled.isEnabled();
	}
		
//select date wise radio button
public void selectdatewiseradiobutton() {
	SampleCollection.getDatewiseradiobutton().click();	
	}
		
//validate date wise calendar image is displayed
public boolean validatedatewisecalendarimageisdisplayed() {
	WebElement datewisecalendarimageisdisplayed = SampleCollection.getFirstdatewisecalendarimage();
	return datewisecalendarimageisdisplayed.isDisplayed();
	}

//validate date wise calendar image is enabled
public boolean validatedatewisecalendarimageisenabled() {
	WebElement datewisecalendarimageisdisenabled = SampleCollection.getFirstdatewisecalendarimage();
	return datewisecalendarimageisdisenabled.isEnabled();
	}
		
//click on data wise filter submit button
public  void clickondatawisefiltersubmitbutton() {
	SampleCollection.getDatewisefilterSubmitbutton().click();
	}
		
//select date from first calendar
public  void selectdatefromfirstcalendar() throws InterruptedException {
	SampleCollection.getFirstdatewisecalendarimage().click();
	delay();
	SampleCollection.getSelectdate().click();
	delay();
	SampleCollection.getDatewisefilterSubmitbutton().click();
	}
		
//select date from last calendar
public  void selectdatefromlastcalendar() throws InterruptedException {
	SampleCollection.getLastdatewisecalendarimage().click();
	delay();
	SampleCollection.getSelectdate().click();
	delay();
	SampleCollection.getDatewisefilterSubmitbutton().click();
	}
		
//validate Contact no.radio button is displayed
public boolean validateContactnumberradiobuttonisdisplayed() {
    WebElement Contactnumberradiobuttonisdisplayed = SampleCollection.getContactNoRadiobutton();
	return Contactnumberradiobuttonisdisplayed.isDisplayed();
	}
		
//validate Contact no.radio button is enabled
public boolean validateContactnumberradiobuttonisenabled() {
	WebElement Contactnumberradiobuttonisenabled = SampleCollection.getContactNoRadiobutton();
	return Contactnumberradiobuttonisenabled.isEnabled();
	}
	
//Select Contact no.radio button
public void SelectContactnoradiobutton() {
	SampleCollection.getContactNoRadiobutton().click();	
	}

//enter invalid data and click on submit button
public void enterinvalidcontactnodataandclickonsubmitbutton(String invalid) throws InterruptedException {
	SampleCollection.getAnyPartofNameTextBox().sendKeys(invalid);
	delay();
	SampleCollection.getAnyPartofNameSubmitbutton().click();
	}
	
public void entervalidcontactnodataandclickonsubmitbutton(String valid) throws InterruptedException {
	delay();
	SampleCollection.getAnyPartofNameTextBox().clear();
	SampleCollection.getAnyPartofNameTextBox().sendKeys(valid);
	delay();
	SampleCollection.getAnyPartofNameSubmitbutton().click();
	delay();
	SampleCollection.getSelectbutton().click();
	}
		
//validate UHID radio button is displayed
public boolean validateUHIDradiobuttonisdisplayed() {
	WebElement UHIDradiobuttonisdisplayed = SampleCollection.getUHIDRadiobutton();
	 return UHIDradiobuttonisdisplayed.isDisplayed();
	}
		
//validate UHID radio button is enabled
public boolean validateUHIDradiobuttonisenabled() {
	WebElement UHIDradiobuttonisenabled = SampleCollection.getUHIDRadiobutton();
	return UHIDradiobuttonisenabled.isEnabled();
	}

//Select UHID Radio button
public void SelectUHIDRadiobutton() {
	SampleCollection.getUHIDRadiobutton().click();
	}
	
//enter invalid UHID data and click on submit button
public void enterinvalidUHIDdataandclickonsubmitbutton(String InValid) throws InterruptedException {
	SampleCollection.getAnyPartofNameTextBox().sendKeys(InValid);
	delay();
	SampleCollection.getAnyPartofNameSubmitbutton().click();
	}
		
//enter valid UHID data and click on submit button
public void entervalidUHIDdataandclickonsubmitbutton(String valid) throws InterruptedException {
	delay();
	SampleCollection.getAnyPartofNameTextBox().clear();
	SampleCollection.getAnyPartofNameTextBox().sendKeys(valid);
	delay();
	SampleCollection.getAnyPartofNameSubmitbutton().click();
	delay();
	SampleCollection.getSelectbutton().click();
	}

///////////////////////////Main Order Entry(Advance) Page///////////////////////////////
		
//validate VerifyObservationMedicinebutton is displayed
public boolean validateVerifyObservationMedicinebuttonisdisplayed() {
	WebElement VerifyObservationMedicinebuttonisdisplayed = SampleCollection.getVerifyObservationMedicinebutton();
	return VerifyObservationMedicinebuttonisdisplayed.isDisplayed();
	}
		
//validate VerifyObservationMedicinebutton is displayed
public boolean validateVerifyObservationMedicinebuttonisenabled() {
	WebElement VerifyObservationMedicinebuttonisenabled = SampleCollection.getVerifyObservationMedicinebutton();
	return VerifyObservationMedicinebuttonisenabled.isEnabled();
	}
		
//click on VerifyObservationMedicinebutton
public void  clickonVerifyObservationMedicinebutton() {
	SampleCollection.getVerifyObservationMedicinebutton().click();
	}
		
	
//validate AllCategoryRadiobutton is displayed
public boolean validateAllCategoryRadiobuttonisdisplayed() {
	WebElement AllCategoryRadiobuttonisdisplayed = SampleCollection.getAllCategoryRadiobutton();
	return AllCategoryRadiobuttonisdisplayed.isDisplayed();
	}
		
//validate AllCategoryRadiobutton is enabled
public boolean validateAllCategoryRadiobuttonisenabled() {
	WebElement AllCategoryRadiobuttonisenabled = SampleCollection.getAllCategoryRadiobutton();
	return AllCategoryRadiobuttonisenabled.isEnabled();
	}
		
//Select AllCategoryRadiobutton
public void SelectAllCategoryRadiobutton() {
	SampleCollection.getAllCategoryRadiobutton().click();
	}
		
//validate AllCategoryDropdown box is enabled
public boolean validateAllCategoryDropdownboxisenabled() {
	WebElement AllCategoryDropdownboxisenabled = SampleCollection.getAllCategoryDropdown();
	return AllCategoryDropdownboxisenabled.isEnabled();
	}
		
//select value from All category drop down
public void selectvaluefromAllcategorydropdown() {
	selectDropdownVisibleElementwithIndexValue(SampleCollection.getAllCategoryDropdown(),1);
	
	/* Select dropdown = new Select(SampleCollection.getAllCategoryDropdown());
	 dropdown.selectByIndex(1);*/
	}

//validate Add service button is displayed
public boolean validateAddservicebuttonisdisplayed() {
	WebElement Addservicebuttonisdisplayed = SampleCollection.getAddservicebutton();
	return Addservicebuttonisdisplayed.isDisplayed();
	}
		
//validate Add service button is enabled
public boolean validateAddservicebuttonisenabled() {
	WebElement Addservicebuttonisenabled = SampleCollection.getAddservicebutton();
	return Addservicebuttonisenabled.isEnabled();
	}
		
//click on Add service button
	public void clickonAddservicebutton() {
	SampleCollection.getAddservicebutton().click();	
	}
		
//validate cancel service button is displayed
public boolean validatecancelservicebuttonisdisplayed() {
	WebElement cancelservicebuttonisdisplayed = SampleCollection.getCancelservicebutton();
	return cancelservicebuttonisdisplayed.isDisplayed();
	}
		
//validate cancel service button is enabled
public boolean validatecancelservicebuttonisenabled() {
	WebElement cancelservicebuttonisenabled = SampleCollection.getCancelservicebutton();
	return cancelservicebuttonisenabled.isEnabled();
	}
		
//click on cancel service button
public void clickoncancelservicebutton() {
	SampleCollection.getCancelservicebutton().click();	
	}
		
//validate FilterObservationTableSearchbox is displayed
public boolean validateFilterObservationTableSearchboxisdisplayed() {
	WebElement FilterObservationTableSearchboxisdisplayed = SampleCollection.getFilterObservationTableSearchbox();
	return FilterObservationTableSearchboxisdisplayed.isDisplayed();
	}
		
//validate FilterObservationTableSearchbox is enabled
public boolean validateFilterObservationTableSearchboxisenabled() {
	WebElement FilterObservationTableSearchboxisenabled = SampleCollection.getFilterObservationTableSearchbox();
	return FilterObservationTableSearchboxisenabled.isEnabled();
	}	
		
//enter data in to FilterObservationTableSearchbox
public void enterdataintoFilterObservationTableSearchbox(String Valid) throws InterruptedException {
	SampleCollection.getFilterObservationTableSearchbox().sendKeys(Valid);
	delay();
	SampleCollection.getFilterObservationTableSearchbox().clear();
	}
		
//validate ProcedureRadiobutton is displayed
public boolean validateProcedureRadiobuttonisdisplayed() {
	WebElement ProcedureRadiobuttonisdisplayed = SampleCollection.getProcedureRadiobutton();
	return ProcedureRadiobuttonisdisplayed.isDisplayed();
	}
		
//validate ProcedureRadiobutton is enabled
public boolean validateProcedureRadiobuttonisenabled() {
	WebElement ProcedureRadiobuttonisenabled = SampleCollection.getProcedureRadiobutton();
	return ProcedureRadiobuttonisenabled.isEnabled();
	}
		
//click on ProcedureRadiobutton
public void clickonProcedureRadiobutton() {
	SampleCollection.getProcedureRadiobutton().click();	
	}
		
//validate ProcedureDropdown is enabled
public boolean validateProcedureDropdownisenabled() {
	WebElement procedureDropdown = SampleCollection.getProcedureDropdown();
	return procedureDropdown.isEnabled();
	}
		
//select value from ProcedureDropdown
public void selectvaluefromProcedureDropdown() throws InterruptedException {
	selectDropdownVisibleElementwithIndexValue(SampleCollection.getProcedureDropdown(),1);
	/*Select dropdown = new Select(SampleCollection.getProcedureDropdown());
		dropdown.selectByIndex(1);*/
	delay();
	SampleCollection.getAddservicebutton().click();
	delay();
	SampleCollection.getCancelservicebutton().click();
	delay();
	SampleCollection.getAddservicebutton().click();
	}

//validate ImmunizationRadiobutton is displayed
public boolean validateImmunizationRadiobuttonisdisplayed() {
	WebElement ImmunizationRadiobuttonisdisplayed = SampleCollection.getImmunizationRadiobutton();
	return ImmunizationRadiobuttonisdisplayed.isDisplayed();
	}

//validate ImmunizationRadiobutton is enabled
public boolean validateImmunizationRadiobuttonisenabled() {
	WebElement ImmunizationRadiobuttonisenabled = SampleCollection.getImmunizationRadiobutton();
	return ImmunizationRadiobuttonisenabled.isEnabled();
	}
		
//click on ImmunizationRadiobutton
	public void clickonImmunizationRadiobutton() {
	SampleCollection.getImmunizationRadiobutton().click();	
	}
		
//validate ImmunizationDropdown is enabled
public boolean validateImmunizationDropdownisenabled() {
	WebElement immunizationDropdown = SampleCollection.getImmunizationDropdown();
	return immunizationDropdown.isEnabled();
	}
		
//select value from ImmunizationDropdown
public void selectvaluefromImmunizationDropdown() throws InterruptedException {
	selectDropdownVisibleElementwithIndexValue(SampleCollection.getImmunizationDropdown(),1);
	/*Select dropdown = new Select(SampleCollection.getImmunizationDropdown());
	dropdown.selectByIndex(1);*/
	delay();
	SampleCollection.getAddservicebutton().click();
	delay();
	SampleCollection.getCancelservicebutton().click();
	delay();
	SampleCollection.getAddservicebutton().click();
	}
		
//validate OtherServicesRadiobutton is displayed
public boolean validateOtherServicesRadiobuttonisdisplayed() {
	WebElement OtherServicesRadiobuttonisdisplayed = SampleCollection.getOtherServicesRadiobutton();
	return OtherServicesRadiobuttonisdisplayed.isDisplayed();
	}
		
//validate OtherServicesRadiobutton is enabled
public boolean validateOtherServicesRadiobuttonisenabled() {
	WebElement OtherServicesRadiobuttonisenabled = SampleCollection.getOtherServicesRadiobutton();
	return OtherServicesRadiobuttonisenabled.isEnabled();
	}
		
//click on OtherServicesRadiobutton
public void clickonOtherServicesRadiobutton() {
	SampleCollection.getOtherServicesRadiobutton().click();
	}
		
//validate OtherServices Drop down is enabled
public boolean validateOtherServicesDropdownisenabled() {
	WebElement OtherServicesDropdownisenabled = SampleCollection.getOtherServicesdropdown();
	return OtherServicesDropdownisenabled.isEnabled();
	}
		
//select value from OtherServiceDropdown
public void selectvaluefromOtherServicesDropdown() throws InterruptedException {
	selectDropdownVisibleElementwithIndexValue(SampleCollection.getOtherServicesdropdown(),1);
	 /*Select dropdown = new Select(SampleCollection.getOtherServicesdropdown());
	dropdown.selectByIndex(1);*/
	delay();
	SampleCollection.getAddservicebutton().click();
	delay();
	SampleCollection.getCancelservicebutton().click();
	delay();
	SampleCollection.getAddservicebutton().click();
	}
		
//validate Medicine radio button is displayed
public boolean validateMedicineradiobuttonisdisplayed() {
	WebElement Medicineradiobuttonisdisplayed = SampleCollection.getMedicineradiobutton();
	return Medicineradiobuttonisdisplayed.isDisplayed();
	}
		
//validate Medicine radio button is enabled
public boolean validateMedicineradiobuttonisenabled() {
	WebElement Medicineradiobuttonisenabled = SampleCollection.getMedicineradiobutton();
	return Medicineradiobuttonisenabled.isEnabled();
	}
		
//click on Medicine radio button
public void clickonMedicineradiobutton() {
	SampleCollection.getMedicineradiobutton().click();
	}
		
//Validate MedicineGroupTab is displayed
public boolean ValidateMedicineGroupTabisdisplayed() {
	WebElement MedicineGroupTabisdisplayed = SampleCollection.getMedicineGroupTab();
	return MedicineGroupTabisdisplayed.isDisplayed();
	}
		
//Validate MedicineGroupTab is displayed
public boolean ValidateMedicineGroupTabisenabled() {
	WebElement MedicineGroupTabisenabled = SampleCollection.getMedicineGroupTab();
	return MedicineGroupTabisenabled.isEnabled();
	}
		
//click on MedicineGroupTab
public void clickonMedicineGroupTab() {
	SampleCollection.getMedicineGroupTab().click();
	}
		
//validate Medicine Drop down is enabled
public boolean validateMedicineDropdownisenabled() {
	WebElement MedicineDropdownisenabled = SampleCollection.getMedicineDropdown();
	return MedicineDropdownisenabled.isEnabled();
	}
		
//Select value from Medicine Drop down
public void SelectvaluefromMedicineDropdown() throws InterruptedException {
	selectDropdownVisibleElementwithIndexValue(SampleCollection.getMedicineDropdown(),1);
	/*Select dropdown = new Select(SampleCollection.getMedicineDropdown());
	dropdown.selectByIndex(1);*/
	delay();
	}
		
//validate MedicineQuantityTextBox is displayed
public boolean validateMedicineQuantityTextBoxisdisplayed() {
	WebElement MedicineQuantityTextBoxisdisplayed = SampleCollection.getMedicineQuantityTextBox();
	return MedicineQuantityTextBoxisdisplayed.isDisplayed();
	}
		
//validate MedicineQuantityTextBox is enabled
public boolean validateMedicineQuantityTextBoxisenabled() {
	WebElement MedicineQuantityTextBoxisenabled = SampleCollection.getMedicineQuantityTextBox();
	return MedicineQuantityTextBoxisenabled.isEnabled();
	}
		
//validate MedicineAdviceTextbox is displayed
public boolean validateMedicineAdviceTextboxisdisplayed() {
	WebElement MedicineAdviceTextboxisdisplayed = SampleCollection.getMedicineAdviceTextbox();
	return MedicineAdviceTextboxisdisplayed.isDisplayed();
	}
		
//validate MedicineAdviceTextbox is displayed
public boolean validateMedicineAdviceTextboxisenabled() {
	WebElement MedicineAdviceTextboxisdisenabled = SampleCollection.getMedicineAdviceTextbox();
	return MedicineAdviceTextboxisdisenabled.isEnabled();
	}
		
//Enter InValidquantity into MedicineQuantityTextBox
public void EnterInValidquantityintoMedicineQuantityTextBox(String InValidQuantity) throws InterruptedException {
	SampleCollection.getMedicineQuantityTextBox().clear();
	delay();
	SampleCollection.getMedicineQuantityTextBox().sendKeys(InValidQuantity);
	delay();
	SampleCollection.getAddMedicinebutton().click();
	}
		
//Enter InValidAdvice into MedicineAdviceTextbox
public void EnterInValidAdviceintoMedicineAdviceTextbox(String InValidAdvice) throws InterruptedException {
	delay();
	SampleCollection.getMedicineAdviceTextbox().sendKeys(InValidAdvice);
	delay();
	SampleCollection.getAddMedicinebutton().click();
	}
		
//Enter Valid quantity into MedicineQuantityTextBox
public void EnterValidquantityintoMedicineQuantityTextBox(String ValidQuantity) throws InterruptedException {
	SampleCollection.getMedicineQuantityTextBox().clear();
	delay();
	SampleCollection.getMedicineAdviceTextbox().clear();
	delay();
	SampleCollection.getMedicineQuantityTextBox().sendKeys(ValidQuantity);
	delay();
	SampleCollection.getAddMedicinebutton().click();
	}

//Enter Valid quantity into MedicineQuantityTextBox
public void EnterValidAdviceintoMedicineAdviceTextBox(String ValidQuantity) throws InterruptedException {
	SampleCollection.getMedicineAdviceTextbox().clear();
	delay();
	SampleCollection.getMedicineAdviceTextbox().sendKeys(ValidQuantity);
	delay();
	SampleCollection.getAddMedicinebutton().click();
	}
		
//validate SearchMedicinewithNameStarttab is displayed
public boolean validateSearchMedicinewithNameStarttabisdisplayed() {
	WebElement SearchMedicinewithNameStarttabisdisplayed = SampleCollection.getSearchMedicinewithNameStarttab();
	return SearchMedicinewithNameStarttabisdisplayed.isDisplayed();
	}
		
//validate SearchMedicinewithNameStarttab is enabled
public boolean validateSearchMedicinewithNameStarttabisenabled() {
	WebElement SearchMedicinewithNameStarttabisenabled = SampleCollection.getSearchMedicinewithNameStarttab();
	return SearchMedicinewithNameStarttabisenabled.isEnabled();
	}

//click on SearchMedicinewithNameStarttab
public void clickonSearchMedicinewithNameStarttab() {
	SampleCollection.getSearchMedicinewithNameStarttab().click();	
	}
		
//validate MedicineFirstletter option is displayed
public boolean validateMedicineFirstletteroptionisdisplayed() {
	WebElement MedicineFirstletteroptionisdisplayed = SampleCollection.getMedicineFirstletter();
	return MedicineFirstletteroptionisdisplayed.isDisplayed();
	}
		
//validate MedicineFirstletter option is enabled
public boolean validateMedicineFirstletteroptionisenabled() {
	WebElement MedicineFirstletteroptionisenabled = SampleCollection.getMedicineFirstletter();
	return MedicineFirstletteroptionisenabled.isEnabled();
	}
		
//click on MedicineFirstletter option
public void clickonMedicineFirstletteroption(String ValidQuantity,String ValidAdvice ) throws InterruptedException {
	SampleCollection.getMedicineFirstletter().click();
	delay();
	SampleCollection.getMedicineQuantityTextBox().clear();
	delay();
	SampleCollection.getMedicineQuantityTextBox().sendKeys(ValidQuantity);
	delay();
	SampleCollection.getMedicineAdviceTextbox().sendKeys(ValidAdvice);
	delay();
	SampleCollection.getAddMedicinebutton().click();
	delay();
	SampleCollection.getMedicineCancelServicebutton().click();
	}
		
//validate Search option tab of Medicine part is displayed
public boolean validateSearchoptiontabofMedicinepartisdisplayed() {
	WebElement SearchoptiontabofMedicinepartisdisplayed = SampleCollection.getSearchoption();
	return SearchoptiontabofMedicinepartisdisplayed.isDisplayed();
	}
		
//validate Search option tab of Medicine part is displayed
public boolean validateSearchoptiontabofMedicinepartisenabled() {
	WebElement SearchoptiontabofMedicinepartisenabled = SampleCollection.getSearchoption();
	return SearchoptiontabofMedicinepartisenabled.isEnabled();
	}
		
//click on Search option tab
public void clickonSearchoptiontab() {
	SampleCollection.getSearchoption().click();	
	}

//validate AnycharacterofMedicineNameTextBox is displayed
public boolean validateAnycharacterofMedicineNameTextBoxisdisplayed() {
	WebElement AnycharacterofMedicineNameTextBoxisdisplayed = SampleCollection.getAnycharacterofMedicineNameTextBox();
	return AnycharacterofMedicineNameTextBoxisdisplayed.isDisplayed();
	}
		
//validate AnycharacterofMedicineNameTextBox is displayed
public boolean validateAnycharacterofMedicineNameTextBoxisenabled() {
	WebElement AnycharacterofMedicineNameTextBoxisenabled = SampleCollection.getAnycharacterofMedicineNameTextBox();
	return AnycharacterofMedicineNameTextBoxisenabled.isEnabled();
	}
		
//Enter data into AnycharacterofMedicineNameTextBox
public void EnterdataintoAnycharacterofMedicineNameTextBox(String MedicineName) throws InterruptedException {
	SampleCollection.getAnycharacterofMedicineNameTextBox().sendKeys(MedicineName);
		delay();
	SampleCollection.getAnycharacterofMedicineNameTextBox().clear();
	}
		
//validate SearchopttionforAnycharacterofMedicineName is displayed
public boolean validateSearchoptionforAnycharacterofMedicineNameisdisplayed() {
	WebElement searchopttionforAnycharacterofMedicineNameisdisplayed = SampleCollection.getSearchopttionforAnycharacterofMedicineName();
	return searchopttionforAnycharacterofMedicineNameisdisplayed.isDisplayed();
	}
		
//validate SearchopttionforAnycharacterofMedicineName is enabled
public boolean validateSearchoptionforAnycharacterofMedicineNameisenabled() {
	WebElement searchopttionforAnycharacterofMedicineNameisenabled = SampleCollection.getSearchopttionforAnycharacterofMedicineName();
	return searchopttionforAnycharacterofMedicineNameisenabled.isEnabled();
	}
		
//click on SearchopttionforAnycharacterofMedicineName without enter value
public void clickonSearchoptionforAnycharacterofMedicineNamebeforeentervalue() {
	SampleCollection.getSearchopttionforAnycharacterofMedicineName().click();	
	}
		
//click on SearchopttionforAnycharacterofMedicineName
public void clickonSearchoptionforAnycharacterofMedicineNameafterentervalue(String MedicineName,String ValidQuantity,String ValidAdvice ) throws InterruptedException {
	SampleCollection.getAnycharacterofMedicineNameTextBox().sendKeys(MedicineName);
	delay();
	SampleCollection.getSearchopttionforAnycharacterofMedicineName().click();
	delay();
	SampleCollection.getMedicineQuantityTextBox().clear();
	delay();
	SampleCollection.getMedicineQuantityTextBox().sendKeys(ValidQuantity);
	delay();
	SampleCollection.getMedicineAdviceTextbox().sendKeys(ValidAdvice);
	delay();
	SampleCollection.getAddMedicinebutton().click();
	}
		
//validate Investigation radio button is displayed
public boolean validateInvestigationradiobuttonisdisplayed() {
	WebElement Investigationradiobuttonisdisplayed = SampleCollection.getInvestigationradiobutton();
	return Investigationradiobuttonisdisplayed.isDisplayed();
	}

//validate Investigation radio button is enabled
public boolean validateInvestigationradiobuttonisenabled() {
	WebElement Investigationradiobuttonisenabled = SampleCollection.getInvestigationradiobutton();
	return Investigationradiobuttonisenabled.isEnabled();
	}

//click on Investigation radio button
public void clickonInvestigationradiobutton() {
	SampleCollection.getInvestigationradiobutton().click();	
		}

//validate InvestigationDropdown is enabled
public boolean validateInvestigationDropdownisenabled() {
	WebElement InvestigationDropdownisenabled = SampleCollection.getInvestigationDropdown();
	return InvestigationDropdownisenabled.isEnabled();
	}
		
//Select value from InvestigationDropdown
public void SelectvaluefromInvestigationDropdown() throws InterruptedException {
	selectDropdownVisibleElement(SampleCollection.getInvestigationDropdown(),"MICRO AUTOMATION TEST");
		/*Select 	dopdown = new Select (SampleCollection.getInvestigationDropdown());
		dopdown.selectByVisibleText("MICRO AUTOMATION TEST");*/
	delay();
	SampleCollection.getInvestigationAddservicebutton1().click();
	delay();
	}
		
//Select 2nd service 
public void Selectsecondservice() throws InterruptedException {
	SampleCollection.getInvestigationAddservicebutton3().click();
	delay();
	//VerifyObservationMedicinebutton.click();
	}
		
		
//Validate PrePostInstructionCommentRemarkspopupClosebutton is displayed
public boolean ValidatePrePostInstructionCommentRemarkspopupClosebuttonisdisplayed() {
	WebElement PrePostInstructionCommentRemarkspopupClosebuttonisdisplayed = SampleCollection.getPrePostInstructionCommentRemarkspopupClosebutton();
	return PrePostInstructionCommentRemarkspopupClosebuttonisdisplayed.isDisplayed();
	}
		
//Validate PrePostInstructionCommentRemarkspopupClosebutton is enabled
public boolean ValidatePrePostInstructionCommentRemarkspopupClosebuttonisenabled() {
	WebElement PrePostInstructionCommentRemarkspopupClosebuttonisenabled = SampleCollection.getPrePostInstructionCommentRemarkspopupClosebutton();
	return PrePostInstructionCommentRemarkspopupClosebuttonisenabled.isEnabled();
	}

//click on PrePostInstructionCommentRemarkspopupClosebutton
public void clickonPrePostInstructionCommentRemarkspopupClosebutton() {
	SampleCollection.getPrePostInstructionCommentRemarkspopupClosebutton().click();	
	}
		
//Verify Actual Doctor name on order entry page
public String VerifyActualDoctornameonorderentrypage() {
	String DoctorName = SampleCollection.getActualDoctornameonorderentrypage().getText();
	return DoctorName;
	}

//Verify expected Doctor name on PrePost Instruction Comment Remarks page
public String VerifyexpectedDoctornameonoPrePostInstructionCommentRemarkspage() {
	String DoctorName = SampleCollection.getExpectedDoctornameonoPrePostInstructionCommentRemarkspage().getText();
	return DoctorName;
	}
	
//Verify Actual Contact number on order entry page
public String VerifyActualContactnumberonorderentrypage() {
	String ContactNumber = SampleCollection.getActualContactnumberonorderentrypage().getText();
	return ContactNumber;
	}
		
//Verify expected Contact number on Pre Post Instruction Comment Remarks page
public String VerifyexcpectedContactnumberonPrePostInstructionCommentRemarkspage() {
	String ContactNumber = SampleCollection.getExcpectedContactnumberonPrePostInstructionCommentRemarkspage().getText();
	return ContactNumber;
	}
		
//validate PrePostInstructionCommentRemarkspopup1stcommentbox is displayed
public boolean validatePrePostInstructionCommentRemarkspopup1stcommentboxisdisplayed() {
	WebElement PrePostInstructionCommentRemarkspopup1stcommentboxisdisplayed = SampleCollection.getPrePostInstructionCommentRemarkspopup1stcommentbox();
	return PrePostInstructionCommentRemarkspopup1stcommentboxisdisplayed.isDisplayed();
	}
		
//validate PrePostInstructionCommentRemarkspopup1stcommentbox is displayed
public boolean validatePrePostInstructionCommentRemarkspopup1stcommentboxisenabled() {
	WebElement PrePostInstructionCommentRemarkspopup1stcommentboxisenabled = SampleCollection.getPrePostInstructionCommentRemarkspopup1stcommentbox();
	return PrePostInstructionCommentRemarkspopup1stcommentboxisenabled.isEnabled();
	}
		
//enter Data into PrePostInstructionCommentRemarkspopup1stcommentbox
public void enterDataintoPrePostInstructionCommentRemarkspopup1stcommentbox(String Text) throws InterruptedException {
	SampleCollection.getPrePostInstructionCommentRemarkspopup1stcommentbox().clear();
	delay();
	SampleCollection.getPrePostInstructionCommentRemarkspopup1stcommentbox().sendKeys(Text);
	}
		
//validate DepartMentDropdownonOforderEntryPage is enabled
public boolean validateDepartMentDropdownonOforderEntryPageisenabled() {
	WebElement DepartMentDropdownonOforderEntryPageisenabled = SampleCollection.getDepartMentDropdownonOforderEntryPage();
	return DepartMentDropdownonOforderEntryPageisenabled.isEnabled();
	}
	
//validate UnitDropdownonOforderEntryPage is enabled
public boolean validateUnitDropdownonOforderEntryPageisenabled() {
	WebElement UnitDropdownonOforderEntryPageisenabled = SampleCollection.getUnitDropdownonOforderEntryPage();
	return UnitDropdownonOforderEntryPageisenabled.isEnabled();
	}

//validate ContactnumberTextboxOforderEntryPage is displayed
public boolean validateContactnumberTextboxOforderEntryPageisdisplayed() {
	WebElement ContactnumberTextboxOforderEntryPageisdisplayed = SampleCollection.getContactnumberTextboxOforderEntryPage();
	return ContactnumberTextboxOforderEntryPageisdisplayed.isDisplayed();
	}

//validate ContactnumberTextboxOforderEntryPage is enabled
public boolean validateContactnumberTextboxOforderEntryPageisenabled() {
	WebElement ContactnumberTextboxOforderEntryPageisenabled = SampleCollection.getContactnumberTextboxOforderEntryPage();
	return ContactnumberTextboxOforderEntryPageisenabled.isEnabled();
	}
		
//enter invalid Data into ContactnumberTextboxOforderEntryPage
public void enterinvalidDataintoContactnumberTextboxOforderEntryPage(String InvalidContactNumber) throws InterruptedException {
	SampleCollection.getContactnumberTextboxOforderEntryPage().clear();
	delay();
	SampleCollection.getContactnumberTextboxOforderEntryPage().sendKeys(InvalidContactNumber);
	}

//enter valid Data into ContactnumberTextboxOforderEntryPage
public void entervalidDataintoContactnumberTextboxOforderEntryPage(String validContactNumber) throws InterruptedException {
	SampleCollection.getContactnumberTextboxOforderEntryPage().clear();
	delay();
	SampleCollection.getContactnumberTextboxOforderEntryPage().sendKeys(validContactNumber);
	}
		
//validate PrePostInstructionCommentRemarkspopup2ndcommentbox is displayed
public boolean validatePrePostInstructionCommentRemarkspopup2ndcommentboxisdisplayed() {
	WebElement PrePostInstructionCommentRemarkspopup2ndcommentboxisdisplayed = SampleCollection.getPrePostInstructionCommentRemarkspopup2ndcommentbox();
	return PrePostInstructionCommentRemarkspopup2ndcommentboxisdisplayed.isDisplayed();
	}
		
//validate PrePostInstructionCommentRemarkspopup2ndcommentbox is enabled
public boolean validatePrePostInstructionCommentRemarkspopup2ndcommentboxisenabled() {
	WebElement PrePostInstructionCommentRemarkspopup2ndcommentboxisenabled = SampleCollection.getPrePostInstructionCommentRemarkspopup2ndcommentbox();
	return PrePostInstructionCommentRemarkspopup2ndcommentboxisenabled.isEnabled();
	}
		
//Enter text into PrePostInstructionCommentRemarkspopup2ndcommentbox
public void EntertextintoPrePostInstructionCommentRemarkspopup2ndcommentbox(String text) throws InterruptedException {
	SampleCollection.getPrePostInstructionCommentRemarkspopup2ndcommentbox().clear();
	delay();
	SampleCollection.getPrePostInstructionCommentRemarkspopup2ndcommentbox().sendKeys(text);	
	}
		
//validate PrePostInstructionCommentRemarkspopupSavebutton is displayed
public boolean validatePrePostInstructionCommentRemarkspopupSavebuttonisdisplayed() {
	WebElement PrePostInstructionCommentRemarkspopupSavebuttonisdisplayed = SampleCollection.getPrePostInstructionCommentRemarkspopupSavebutton();
	return PrePostInstructionCommentRemarkspopupSavebuttonisdisplayed.isDisplayed();
	}
		
//validate PrePostInstructionCommentRemarkspopupSavebutton is enabled
public boolean validatePrePostInstructionCommentRemarkspopupSavebuttonisenabled() {
	WebElement PrePostInstructionCommentRemarkspopupSavebuttonisenabled = SampleCollection.getPrePostInstructionCommentRemarkspopupSavebutton();
	return PrePostInstructionCommentRemarkspopupSavebuttonisenabled.isEnabled();
	}

//click on PrePostInstructionCommentRemarkspopupSavebutton
public void clickonPrePostInstructionCommentRemarkspopupSavebutton() {
	SampleCollection.getPrePostInstructionCommentRemarkspopupSavebutton().click();
	}

//validate Pop up close option is displayed
public boolean validatePopupcloseoptionisdisplayed() {
	WebElement 	Popupcloseoptionisdisplayed = SampleCollection.getPopupcloseoption();
	return Popupcloseoptionisdisplayed.isDisplayed();
	}
		
//validate Pop up close option is enabled
public boolean validatePopupcloseoptionisenabled() {
	WebElement 	Popupcloseoptionisdisplayed = SampleCollection.getPopupcloseoption();
	return Popupcloseoptionisdisplayed.isDisplayed();
	}
		
//click on Pop up close option
public void clickonPopupcloseoption() {
	SampleCollection.getPopupcloseoption().click();	
	}
		
//validate Close option for order entry page is displayed
public boolean validateCloseoptionfororderentrypageisdisplayed() {
	WebElement Closeoptionfororderentrypageisdisplayed = SampleCollection.getCloseoptionfororderentrypage();
	return Closeoptionfororderentrypageisdisplayed.isDisplayed();	
	}
		
//validate Close option for order entry page is enabled
public boolean validateCloseoptionfororderentrypageisenabled() {
	WebElement Closeoptionfororderentrypageisenabled = SampleCollection.getCloseoptionfororderentrypage();
	return Closeoptionfororderentrypageisenabled.isEnabled();
	}
		
//click on Close option for order entry page
public void clickonCloseoptionfororderentrypage() {
	SampleCollection.getCloseoptionfororderentrypage().click();
	}
		
//validate SpecimenSiteTextBox is displayed
public boolean validateSpecimenSiteTextBoxisdisplayed() {
	WebElement SpecimenSiteTextBoxisdisplayed = SampleCollection.getSpecimenSiteTextBox();
	return SpecimenSiteTextBoxisdisplayed.isDisplayed();
	}
		
//validate SpecimenSiteTextBox is enabled
public boolean validateSpecimenSiteTextBoxisenabled() {
	WebElement SpecimenSiteTextBoxisenabled = SampleCollection.getSpecimenSiteTextBox();
	return SpecimenSiteTextBoxisenabled.isEnabled();
	}

//validate SelectAllCheckbox is displayed
public boolean validateSelectAllCheckboxisdisplayed() {
	WebElement SelectAllCheckboxisdisplayed = SampleCollection.getSelectAllCheckbox();
	return SelectAllCheckboxisdisplayed.isDisplayed();
	}
		
//validate SelectAllCheckbox is enabled
public boolean validateSelectAllCheckboxisenabled() {
	WebElement SelectAllCheckboxisenabled = SampleCollection.getSelectAllCheckbox();
	return SelectAllCheckboxisenabled.isEnabled();
	}
		
//Validate Select1stCheckbox is displayed
public boolean ValidateSelect1stCheckboxisdisplayed() {
	WebElement Select1stCheckboxisdisplayed = SampleCollection.getSelect1stCheckbox();
	return Select1stCheckboxisdisplayed.isDisplayed();
	}
		
//Validate Select1stCheckbox is enabled
public boolean ValidateSelect1stCheckboxisenabled() {
	WebElement Select1stCheckboxisenabled = SampleCollection.getSelect1stCheckbox();
	return Select1stCheckboxisenabled.isEnabled();
	}

//validate SampleCollectionSavebutton is displayed
public boolean validateSampleCollectionSavebuttonisdisplayed() {
	WebElement SampleCollectionSavebuttonisdisplayed = SampleCollection.getSampleCollectionSavebutton();
	return SampleCollectionSavebuttonisdisplayed.isDisplayed();
	}

//validate SampleCollectionSavebutton is displayed
public boolean validateSampleCollectionSavebuttonisenabled() {
	WebElement SampleCollectionSavebuttonisenabled = SampleCollection.getSampleCollectionSavebutton();
	return SampleCollectionSavebuttonisenabled.isEnabled();
	}

//Select 1st Check box and click on save button after enter invalid specimen site
public void Select1stCheckboxandclickonsavebuttonafterenterinvalidspecimensite(String InvalidSpecimenSite) throws InterruptedException {
	delay();	
	SampleCollection.getSpecimenSiteTextBox().clear();
	delay();	
	SampleCollection.getSpecimenSiteTextBox().sendKeys(InvalidSpecimenSite);
	delay();	
	SampleCollection.getSelect1stCheckbox().click();
	delay();	
	SampleCollection.getSampleCollectionSavebutton().click();
	}

//Select All Check box and click on save button after enter invalid specimen site
public void SelectAllCheckboxandclickonsavebuttonafterenterinvalidspecimensite(String validSpecimenSite) throws InterruptedException {
	delay();	
	SampleCollection.getSpecimenSiteTextBox().clear();
	delay();	
	SampleCollection.getSpecimenSiteTextBox().sendKeys(validSpecimenSite);
	delay();	
	SampleCollection.getSelectAllCheckbox().click();
	delay();	
	SampleCollection.getSampleCollectionSavebutton().click();
	}
		
////////////////////////////////////// Excel UHID/////////////////////////////
		
//Take Excel UHID and Click on Investigation link
public void TakeExcelUHID(String UHID) throws InterruptedException {
	longDelay();	
	SampleCollection.getUHIDTextBox().clear();
	longDelay();
	SampleCollection.getUHIDTextBox().sendKeys(UHID);
	longDelay();
	SampleCollection.getGobutton().click();
		
	}
		
public void ClickonInvestigationlink() throws InterruptedException {
	longDelay();
	SampleCollection.getAddNewInvestigationlink().click();	
	}

//Add Services from order entry page
public void AddServicesfromorderentrypage() throws InterruptedException {
			
	SampleCollection.getInvestigationradiobutton().click();
	selectDropdownVisibleElement(SampleCollection.getInvestigationDropdown(),"MICRO AUTOMATION TEST");
	/*Select 	dopdown = new Select (SampleCollection.getInvestigationDropdown());
	dopdown.selectByVisibleText("MICRO AUTOMATION TEST");*/
	longDelay();
	SampleCollection.getInvestigationAddservicebutton1().click();
	longDelay();
	SampleCollection.getInvestigationAddservicebutton2().click();
	longDelay();
	SampleCollection.getInvestigationAddservicebutton3().click();
	longDelay();
	SampleCollection.getVerifyObservationMedicinebutton().click();
	longDelay();
	SampleCollection.getPrePostInstructionCommentRemarkspopupSavebutton().click();
	longDelay();
	SampleCollection.getPopupcloseoption().click();
	}

//Send Services to the Lab Sub Center
public void SendServicestothrLabSubCenter() throws InterruptedException {
	SampleCollection.getCloseoptionfororderentrypage().click();
	SampleCollection.getSelectAllCheckbox().click();
	longDelay();	
	SampleCollection.getSampleCollectionSavebutton().click();
	}
	
//Get Sample No.
public String GetSampleNo(){
	String SampleNo = SampleCollection.getGetSampleNumber().getText();
	return SampleNo;
	}
		
		/*//Check Alert is present or Not
		public boolean isAlertPresent() {
		    try {
		        driver.switchTo().alert();
		        return true;
		    } // try
		    catch (Exception e) {
		        return false;
		    }
	}*/
	
	

}
