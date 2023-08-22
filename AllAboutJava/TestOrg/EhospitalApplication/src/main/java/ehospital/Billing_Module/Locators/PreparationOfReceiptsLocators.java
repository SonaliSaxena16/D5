package ehospital.Billing_Module.Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

//Automation Head_Recepit

public class PreparationOfReceiptsLocators {

	@FindBy(xpath = "//a[text() = 'Billing']")  
    private @Getter WebElement BillingModule;
	
	@FindBy(xpath = "//a[text() = 'Billing Counter']")  
    private @Getter WebElement BillingCounterSubModule;
	
	@FindBy(xpath = "//a[text() = 'Preparation Of Receipts']")  
    private @Getter WebElement PreparationOfReceiptslink;

	@FindBy(xpath = "//*[@value='R']//self::input[1]")  
    private @Getter WebElement PatientWithUHIDRadioButton;
	
	@FindBy(xpath = "//*[@name='ddlReg']//self::select")  
    private @Getter WebElement SearchFilterOfPatientWithUHIDDropdown;
	
	@FindBy(xpath = "//*[@name='patient_registrationno1']//self::input")  
    private @Getter WebElement EnterPatientIDTextBox;
	
	@FindBy(xpath = "//*[@name='btnpatient_registrationno']//self::input")  
    private @Getter WebElement SearchButton;
	
	@FindBy(xpath = "//div[text()='No Patient found.Please check the UHID.']")  
    private @Getter WebElement PatientIDValidationMessage;
	
	@FindBy(xpath = "//*[contains(@id , 'tblReg_details')]")  
    private @Getter List<WebElement> PatientInformationBox;
	
	@FindBy(xpath = "//*[contains(@name,'ddlcat')]")  
    private @Getter WebElement PatientTypeDropdown;

	@FindBy(xpath = "//*[contains(@name,'apl_bpl')]")  
    private @Getter WebElement BillingTypeDropdown;

	@FindBy(xpath = "//*[contains(@name,'inMonNo')]")  
    private @Getter WebElement MobileNumberTextBox;
	
	@FindBy(xpath = "//*[contains(@name,'ddlPaymentMode')]")  
    private @Getter WebElement PaymentModeDropdown;
	
	//
	
	@FindBy(xpath = "//*[contains(@name,'chkAdvance')]")  
    private @Getter WebElement PayAdvanceCheckBox;
	
	@FindBy(xpath = "//*[contains(@name,'btnAdvanceCancel')]")  
    private @Getter WebElement CancelbuttonOfPayAdvance;
	
	@FindBy(xpath = "//*[contains(@name,'txtAdvanceFor')]")  
    private @Getter WebElement AddAdvanceForTextBox;
	
	@FindBy(xpath = "//*[contains(@name,'txtAdvanceAmount')]")  
    private @Getter WebElement AddAdvanceAmountTextBox;
	
	@FindBy(xpath = "//*[contains(@value,'Add Advance')]")  
    private @Getter WebElement AddAdvanceButton;

//
	@FindBy(xpath = "//*[contains(@name,'chkOtherService')]")  
    private @Getter WebElement OtherServicesCheckBox;
 
	@FindBy(xpath = "//*[contains(@name,'btnOtherCancel')]")  
    private @Getter WebElement CancelButtonofOtherServices;
	
	@FindBy(xpath = "//*[contains(@name,'txtitemname1')]")  
    private @Getter WebElement ItemNmeTextBoxofOtherServices;
	
	@FindBy(xpath = "//*[contains(@name,'txtitemQty1')]")  
    private @Getter WebElement QuentityTextBoxofOtherServices;

	@FindBy(xpath = "//*[contains(@name,'txtitemRate1')]")  
    private @Getter WebElement RateTextBoxofOtherServices;	
	
	@FindBy(xpath = "//*[contains(@onclick,'chkItemName(this,1);')]")  
    private @Getter WebElement CheckBoxofOtherServices;	

	@FindBy(xpath = "//*[@name='btnOtherAmount']//self::input")  
    private @Getter WebElement AddButtonofOtherServices;	
	
	@FindBy(xpath = "//*[contains(@name,'ddlAccount')]")  
    private @Getter WebElement HeadOfAccountDropdown;
	
	@FindBy(xpath = "//*[contains(@name,'ddlNInvestgation')]")  
    private @Getter WebElement CategoryDropdown;
	
	@FindBy(xpath = "//*[contains(@name,'filterTextInput')]")  
    private @Getter WebElement FilterObservationTableTextBox;
	
	@FindBy(xpath = "//*[contains(@id,'txtQtn1')]")  
    private @Getter WebElement QuantityTextBoxforService;

	@FindBy(xpath = "//*[contains(@id,'test_rate1')]")  
    private @Getter WebElement RateTextBoxforService;
	
	@FindBy(xpath = "//*[contains(@id,'chksubtest1')]")  
    private @Getter WebElement Checkboxtoselectservices1;

	@FindBy(xpath = "//*[contains(@id,'chksubtest2')]")  
    private @Getter WebElement Checkboxtoselectservices2;

	@FindBy(xpath = "//*[contains(@id,'chksubtest3')]")  
    private @Getter WebElement Checkboxtoselectservices3;
	
	@FindBy(xpath = "//*[contains(@value,'Add to List')]")  
    private @Getter WebElement AddToListButton;
	
	@FindBy(xpath = "//*[contains(@alt,'Remove')]")  
    private @Getter WebElement CancelOptionForSelectedServices;

	@FindBy(xpath = "//*[contains(@name,'ddlIssueingDoc')]")  
    private @Getter WebElement IssuingDoctorNameDropdown;
	
	@FindBy(xpath = "//*[contains(@name,'disp_doc')]")  
    private @Getter WebElement IsDoctorNameDisplayinTheReceiptCheckBox;
	
	@FindBy(xpath = "//*[@value='Prepare Receipt']//following-sibling::input")  
    private @Getter WebElement PrepareReceiptbutton;
	
	@FindBy(xpath = "//*[contains(@name,'ddlBankName')]")  
    private @Getter WebElement BankNameDropdown;

	@FindBy(xpath = "//*[contains(@name,'txtBankTranid')]")  
    private @Getter WebElement ChequeNoTextBox;

	@FindBy(xpath = "//*[contains(@id,'verifyDataTable')]")  
    private @Getter WebElement AddedServicesTable;

	@FindBy(xpath = "//*[contains(@value,'Click here to print Money Receipt')]")  
    private @Getter WebElement ClickheretoprintMoneyReceiptbutton;

	@FindBy(xpath = "//a[text()='Back']")  
    private @Getter WebElement BackbuttoninRecepit;

	@FindBy(xpath = "//*[contains(@name,'txtCardName')]")  
    private @Getter WebElement CardHolderNameTextBoxofDebitCard;
	
	@FindBy(xpath = "//*[contains(@name,'txtCardno')]")  
    private @Getter WebElement CardNumberTextBoxofDebitCard;

	@FindBy(xpath = "//a[text()='Close(X)']")  
    private @Getter WebElement CloseOptiontoavoidprintReceit;
	
	//
	
	@FindBy(xpath = "//*[@value='M']//self::input[1]")  
    private @Getter WebElement OutsideHospitalPatientRadioButton ;
	
	@FindBy(xpath = "//*[@name='patient_registrationno']//self::input")  
    private @Getter WebElement UHIDTextBoxofOutsideHospitalPatient ;

	@FindBy(xpath = "//*[contains(@name,'txtp_name_first')]")  
    private @Getter WebElement FirstNameTextBox ;
	
	@FindBy(xpath = "//*[contains(@name,'txtp_name_middle')]")  
    private @Getter WebElement MiddileNameTextBox ;
	
	@FindBy(xpath = "//*[contains(@name,'txtp_name_last')]")  
    private @Getter WebElement LastNameTextBox ;

	@FindBy(xpath = "//*[contains(@name,'date_time_birth_year')]")  
    private @Getter WebElement AgeTextBox ;

	@FindBy(xpath = "//*[contains(@value,'Get Receipt No')]")  
    private @Getter WebElement GetReceiptNoButton ;

	@FindBy(xpath = "//*[@value='Prepare Receipt']//self::input")  
    private @Getter WebElement  PrepareReceiptbuttonofOutsideHospitalPatient;	
	
	
	//*[@id='tblReg_details']/descendant::tr/td (Patient info table under preperation of recepit)
	///html/body/table/tbody/tr[3]/descendant::tr/td (Patient info table under printout page of recepit)
	

/////////////////////////////////////////////////////////////////////////////////////////////////////

    
    
public PreparationOfReceiptsLocators(WebDriver driver) {

PageFactory.initElements(driver, this); 
}
	
	
	
}
