package ehospital.Billing_Module.Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class BillSettlementLocators {
	
	@FindBy(xpath = "//a[text() = 'Bill Settlement']")  
	private @Getter WebElement Billsettlementlink;
	
	@FindBy(xpath = "//*[@value='Search >>']")  
	private @Getter WebElement SearchButton;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td/table/tbody/tr[3]/td")  
	private @Getter WebElement BlankspaceforClick;

	@FindBy(xpath = "//*[@name='patient_registrationno1']")  
	private @Getter WebElement UHIDTextBox;

	@FindBy(xpath = "//*[@id='tblRegdetails']")  
	private @Getter WebElement PatientinfoDetail;
	  
	@FindBy(xpath = "//*[@id='chkAdmCharge']")  
	private @Getter WebElement AdmissionChargeCheckBox;
	  
	@FindBy(xpath = "//*[@id='chkAdmCharge']")  
	private @Getter WebElement AdmissionChargePopUp;

	@FindBy(css = "#AdmChgDiv > img:nth-child(1)")  
	private @Getter WebElement CancelbuttonofAdmissionChargePopUp;

	@FindBy(xpath = "//*[@id='ddlRentService_adm_chg']")  
	private @Getter WebElement ServiceDropdownUnderAdmissionChargePopUp;

	@FindBy(xpath = "//*[@id='btn_add_Admission']")  
	private @Getter WebElement AddbuttonofAdmissionChargePopUp;

	@FindBy(xpath = "//*[@id='chkRoomRent']")  
	private @Getter WebElement RoomRentEntryCheckbox;

	@FindBy(xpath = "//*[@id='AdmRentDiv']")  
	private @Getter WebElement RoomRentEntryPopUp;
	
	@FindBy(css = "#AdmRentDiv > img:nth-child(1)")  
	private @Getter WebElement CancelbuttonofRoomRentEntryPopUp;
	
	@FindBy(xpath = "//*[@id='chk_rent_service0']")  
	private @Getter WebElement SelectCheckboxofRoomRentEntryPopUp;
	
	@FindBy(xpath = "//*[@id='txt_rent_rate0']")  
	private @Getter WebElement RateTextBoxofRoomRentEntryPopUp;
	
	@FindBy(xpath = "//*[@id='ddlrentService_chg0']")  
	private @Getter WebElement ServiceDropdownofRoomRentEntryPopUp;

	@FindBy(xpath = "//*[@onclick='addAdmService()']")  
	private @Getter WebElement AddButtonofRoomRentEntryPopUp;

	@FindBy(xpath = "//*[@id='chkDietCharge']")  
	private @Getter WebElement DietChargeEntryCheckBox;

	@FindBy(xpath = "//*[@id='DietDiv']")  
	private @Getter WebElement DietChargeEntryPopup;

	@FindBy(css = "#DietDiv > img:nth-child(1)")  
	private @Getter WebElement CancelbuttonofDietChargeEntryPopup;

	@FindBy(xpath = "//*[@id='chk_diet_service0']")  
	private @Getter WebElement SelectCheckboxfDietChargeEntryPopup;

	@FindBy(xpath = "//*[@id='txt_diet_rate0']")  
	private @Getter WebElement RateTextboxoffDietChargeEntryPopup;

	@FindBy(xpath = "//*[@id='ddldietService_chg0']")  
	private @Getter WebElement ServiceDropdownoffDietChargeEntryPopup;

	@FindBy(xpath = "//*[@id='btnDiet']")  
	private @Getter WebElement AddbuttonoffDietChargeEntryPopup;

	@FindBy(xpath = "//*[@id='chkBillingService']")  
	private @Getter WebElement BillingServiceEntryCheckbox;

	@FindBy(xpath = "//*[@id='BillingServiceDiv']")  
	private @Getter WebElement BillingServiceEntryPopUp;

	@FindBy(css = "#BillingServiceDiv > img:nth-child(1)")  
	private @Getter WebElement CancelimgofBillingServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='chkBillselects1']")  
	private @Getter WebElement SelectCheckbocofBillingServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='ddlBillCategory1']")  
	private @Getter WebElement CategoryDropdownofBillingServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='ddlBillitemnames1']")  
	private @Getter WebElement ServiceDropdownofBillingServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='txtBillitemQtys1']")  
	private @Getter WebElement QuantityTextBoxofBillingServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='txtBillitemRates1']")  
	private @Getter WebElement RateTextBoxofBillingServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='btnBillingServiceAmounts']")  
	private @Getter WebElement AddButtonofBillingServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='chkOtherService']")  
	private @Getter WebElement OtherServiceEntryCheckbox;

	@FindBy(xpath = "//*[@id='OtherDiv']")  
	private @Getter WebElement OtherServiceEntryPopUp;

	@FindBy(css = "#OtherDiv > img:nth-child(1)")  
	private @Getter WebElement CancelimgofOtherServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='chkselects1']")  
	private @Getter WebElement SelectCheckboxofOtherServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='txtCategory1']")  
	private @Getter WebElement CategorytextBoxofOtherServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='txtitemnames1']")  
	private @Getter WebElement ServicetextBoxofOtherServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='txtitemQtys1']")  
	private @Getter WebElement QuantitytextBoxofOtherServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='txtitemRates1']")  
	private @Getter WebElement RatetextBoxofOtherServiceEntryPopUp;

	@FindBy(xpath = "//*[@id='btnOtherAmounts']")  
	private @Getter WebElement AddbuttonofOtherServiceEntryPopUp;

	@FindBy(xpath = "//*[@id= 'ddlTestStatus']")  
	private @Getter WebElement TestDoneorNotDropdown;

	@FindBy(xpath = "//*[@id='chkPrev0']")  
	private @Getter WebElement FirstCheckboxofRecommendedTestDetails;

	@FindBy(xpath = "//*[@id='chkPrev1']")  
	private @Getter WebElement SecondCheckboxofRecommendedTestDetails;

	@FindBy(xpath = "//*[@id='chkPrev2']")  
	private @Getter WebElement thirdCheckboxofRecommendedTestDetails;
	
	@FindBy(xpath = "//*[@title='Concession Calculator']")  
	private @Getter WebElement ConcessionCalculatorImgbutton;
	
	@FindBy(xpath = "//*[@id='Concession_calulatorDiv']")  
	private @Getter WebElement ConcessionCalculatorPopUp;
	
	@FindBy(css = "#Concession_calulatorDiv > img:nth-child(1)")  
	private @Getter WebElement CancelImgofConcessionCalculatorPopUp;
	
	@FindBy(xpath = "//*[@id='txtamountConc0']")  
	private @Getter WebElement AmountTextBoxofConcessionCalculatorPopUp;
	
	@FindBy(xpath = "//*[@id='ddldiscnttype0']")  
	private @Getter WebElement DisscountTypeDropdownofConcessionCalculatorPopUp;
	
	@FindBy(xpath = "//*[@id='txtdiscnt0']")  
	private @Getter WebElement DisscountAmountTextboxofConcessionCalculatorPopUp;
	
	@FindBy(xpath = "//*[@id='txtdiscntnet0']")  
	private @Getter WebElement NetDisscountTextboxofConcessionCalculatorPopUp;

	@FindBy(xpath = "//*[@id='ddldiscnttype1']")  
	private @Getter WebElement FlatDisscountTypeofConcessionCalculatorPopUp;

	@FindBy(xpath = "//*[@id='txtdiscnt1']")  
	private @Getter WebElement SecondDisscountAmountTextBoxofConcessionCalculatorPopUp;

	@FindBy(xpath = "//*[@id='txtAmountCS']")  
	private @Getter WebElement TotalAmountTextBoxofConcessionCalculatorPopUp;

	@FindBy(xpath = "//*[@id='txtDiscountCons']")  
	private @Getter WebElement DiscountAmountTextBoxofConcessionCalculatorPopUp;

	@FindBy(xpath = "//*[@name='btnConcession_calulator']")  
	private @Getter WebElement CalculateConcessionbuttonofConcessionCalculatorPopUp;

	@FindBy(css = "#tblSummary > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > input:nth-child(1)")  
	private @Getter WebElement NextButton;

	@FindBy(xpath = "//*[@id='tblDetails']/descendant::tr[9]/td")  
	private @Getter List<WebElement> RecommendedTestDetailsForVerification;

	@FindBy(xpath = "//*[@id='Concession_calulatorDiv']/descendant::tr[5]/td")  
	private @Getter List<WebElement> RecommendedTestDetailsForVerificationinConcessionPopUp;

	@FindBy(xpath = "//*[@id='txtRemarks']")  
	private @Getter WebElement RemarksTextArea;

	@FindBy(xpath = "//*[@value='Settle Bill Without Discharge']")  
	private @Getter WebElement SettleBillWithoutDischargeButton;

	@FindBy(xpath = "//a[text() = 'Go for approval']")  
	private @Getter WebElement GoForApprovallink;

////////////////////////////////////////////////////////////
	@FindBy(xpath = "//*[@value='UHID']")  
	private @Getter WebElement UHIDRadiobutton;

	@FindBy(xpath = "//*[@value='Search']")  
	private @Getter WebElement SearchButtonofSETTLEMENTAPPROVAL;

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

	
	
	
public BillSettlementLocators(WebDriver driver) {

 PageFactory.initElements(driver, this); 
}


}
