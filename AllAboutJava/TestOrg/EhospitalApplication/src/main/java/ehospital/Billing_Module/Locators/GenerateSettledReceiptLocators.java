package ehospital.Billing_Module.Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class GenerateSettledReceiptLocators {

	@FindBy(xpath = "//a[text() = 'Generate Settled Receipt']")  
	private @Getter WebElement GenerateSettledReceiptLink;

	@FindBy(xpath = "//*[@value='UHID']")  
	private @Getter WebElement UHIDRadiobutton;

	@FindBy(xpath = "//*[@value='Search']")  
	private @Getter WebElement Searchbutton;

	@FindBy(xpath = "//*[@id='txtreqno']")  
	private @Getter WebElement EnterUHIDTextBox;

	@FindBy(xpath = "//*[@id='ddlPaymentMode']")  
	private @Getter WebElement PaymentModeDropdown;

	@FindBy(xpath = "//*[@id='tblDetailsreport']")  
	private @Getter WebElement DetailsReportTable;

	@FindBy(xpath = "//*[@value='AI']")  
	private @Getter WebElement AdmissionIDRadiobutton;

	@FindBy(xpath = "//*[@id='txtAddId']")  
	private @Getter WebElement AdmissionIDTextBox;

	@FindBy(xpath = "//*[@value='DT']")  
	private @Getter WebElement DateRadiobutton;

	@FindBy(xpath = "//a[text() = 'Open']")  
	private @Getter WebElement Openbutton;

	@FindBy(xpath = "//*[@value='Cancel']")  
	private @Getter WebElement Cancelbutton;

	@FindBy(xpath = "//a[text() = 'Select']")  
	private @Getter WebElement Selectbutton;

	@FindBy(xpath = "/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[1]/table/tbody/tr")  
	private @Getter List<WebElement> PatientDetailsDuringSettlement; 

	@FindBy(xpath = "/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[3]/table/tbody/tr")  
	private @Getter List<WebElement> PatientDetailsDuringSettlementApproval;

	@FindBy(xpath = "//*[@value='Generate']")  
	private @Getter WebElement Generatebutton;

	@FindBy(xpath = "//*[@id='tblRegistered']/descendant::tr/td")  
	private @Getter List<WebElement> PatientDetailsonBillSettleMentPage;

	@FindBy(xpath = "/html/body/table/tbody/tr[3]/td/table/tbody/tr[3]/td/table/tbody/tr/td")  
	private @Getter List<WebElement> PatientDetailsonBillSettleMentPrintPage;

	@FindBy(xpath = "//*[@value='Click here to print Money Receipt']")  
	private @Getter WebElement PrintMoneyReceiptbutton;

	@FindBy(xpath = "//a[text() = 'Back']")  
	private @Getter WebElement Backbutton;

	@FindBy(xpath = "//*[@value='Settle Bill With Discharge']")  
	private @Getter WebElement SettleBillWithDischargebutton;

	
	
	
public GenerateSettledReceiptLocators(WebDriver driver) {

 PageFactory.initElements(driver, this); 
}


}


