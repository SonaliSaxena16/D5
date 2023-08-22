package ehospital.Billing_Module.Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class BillGenerationLocators {

	@FindBy(xpath = "//a[text() = 'Bill Generation']")  
	private @Getter WebElement  BillGenerationlink ;
	
	@FindBy(xpath = "//*[@value='R']//self::input[1]")  
    private @Getter WebElement RegisteredPatientRadioButton;

	@FindBy(xpath = "//*[@name='ddlReg']//self::select")  
    private @Getter WebElement PatientIDDropdown;

	@FindBy(xpath = "//*[@name='patient_registrationno1']//self::input")  
    private @Getter WebElement EnterPatientIDTextBox;
	
	@FindBy(xpath = "//*[@name='btnpatient_registrationno']//self::input")  
    private @Getter WebElement SearchButton;

	@FindBy(xpath = "//*[contains(@id , 'tblReg_details')]")  
    private @Getter List<WebElement> PatientInformationBox;

	@FindBy(xpath = "//*[contains(@name,'ddlcat')]")  
    private @Getter WebElement PatientTypeDropdown;

	@FindBy(xpath = "//*[contains(@name,'apl_bpl')]")  
    private @Getter WebElement BillingTypeDropdown;

	@FindBy(xpath = "//*[@id='ddlPatientAccount']")  
    private @Getter WebElement SchemeDropdown;
	
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
	
	@FindBy(xpath = "//*[@id='chkselect1']")  
    private @Getter WebElement CheckBoxofOtherServices;	

	@FindBy(xpath = "//*[@name='btnOtherAmount']//self::input")  
    private @Getter WebElement AddButtonofOtherServices;	

	@FindBy(xpath = "//*[@id='verifyDiv']")  
    private @Getter WebElement Serviceinfotable;	
	
	@FindBy(xpath = "//*[@alt = 'Remove']")  
    private @Getter WebElement RemoveServicesImgbutton;	
	
	@FindBy(xpath = "//a[text() = 'View Statement']")  
    private @Getter WebElement ViewStatementlink;	
	
	@FindBy(xpath = "//*[@id='divStatement']")  
    private @Getter WebElement ViewStatementPopup;	
	
	@FindBy(xpath = "//*[@alt='Print Statement']")  
    private @Getter WebElement CancelbuttonofViewStatementPopup;	
	
	@FindBy(xpath = "//*[@name='btnVerNext']")  
    private @Getter WebElement Nextbutton;	
	
	@FindBy(xpath = "//*[@value='Register Patient & Prepare Bill']//following-sibling::input")  
    private @Getter WebElement RegisterPatientandPrepareBillbutton;	

	@FindBy(xpath = "//*[@id='msgDiv']")  
    private @Getter WebElement  BillPreparedSuccessfullyMessagePopup;	
	
	@FindBy(xpath = "//*[@value='BlankRecpt']")  
    private @Getter WebElement  DetailedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup;	
	
	@FindBy(xpath = "//*[@value='PrePrintedRecpt']")  
    private @Getter WebElement  ConsolidatedReceiptRadiobuttoninBillPreparedSuccessfullyMessagePopup;	
	
	@FindBy(xpath = "//*[@value='Click here to print Money Receipt']")  
    private @Getter WebElement  ClickheretoprintMoneyReceiptbutton;	
	
	@FindBy(xpath = "//*[contains(@name,'ddlAccount')]")  
    private @Getter WebElement HeadOfAccountDropdown;

	@FindBy(xpath = "//*[contains(@name,'ddlNInvestgation')]")  
    private @Getter WebElement CategoryDropdown;

	@FindBy(xpath = "//*[contains(@id,'chksubtest1')]")  
    private @Getter WebElement Checkboxtoselectservices1;

	@FindBy(xpath = "//*[contains(@id,'chksubtest2')]")  
    private @Getter WebElement Checkboxtoselectservices2;

	@FindBy(xpath = "//*[contains(@id,'chksubtest3')]")  
    private @Getter WebElement Checkboxtoselectservices3;

	@FindBy(xpath = "//*[contains(@value,'Add to List')]")  
    private @Getter WebElement AddToListButton;

	
	
	
	
	
	
	
	
	
public BillGenerationLocators(WebDriver driver) {

 PageFactory.initElements(driver, this); 
}
}
