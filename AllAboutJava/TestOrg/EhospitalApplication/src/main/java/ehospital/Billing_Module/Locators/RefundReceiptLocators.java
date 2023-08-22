package ehospital.Billing_Module.Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class RefundReceiptLocators {

	@FindBy(xpath = "//a[text() = 'Refund Receipt']")  
    private @Getter WebElement RefundReceiptlink;
	
	@FindBy(xpath = "//*[contains(@name,'ddlAccount')]")  
    private @Getter WebElement HeadofAccountDropdown;
	
	@FindBy(xpath = "//*[contains(@value,'rd')]")  
    private @Getter WebElement DateRadioButton;
	
	@FindBy(xpath = "//*[contains(@id,'trDateWiseSearch')]")  
    private @Getter WebElement DateWiseSearchElementInfo;
	
	@FindBy(css = "td.stlfont:nth-child(2) > img:nth-child(3)")  
    private @Getter WebElement CalenderImage;
	
	@FindBy(xpath = "//a[text() = 'Today']")  
    private @Getter WebElement TodayoptioninCalenderImage;

	@FindBy(xpath = "//input[@value='Get Search Result' and @name='B2']")  
    private @Getter WebElement GetSearchresultbutton;

	@FindBy(xpath = "//*[contains(@value,'select')]")  
    private @Getter WebElement Selectbutton;
	
	@FindBy(xpath = "//*[contains(@id,'divReceiptDetail')]")  
    private @Getter WebElement ReceiptDetailinfoBox;
	
	@FindBy(xpath = "//*[contains(@value,'Cancel')]")  
    private @Getter WebElement Cancelbutton;
	
	@FindBy(xpath = "//*[contains(@value,'rn')]")  
    private @Getter WebElement UHIDRadiobutton;
	
	@FindBy(xpath = "//*[contains(@name,'ddlcash')]")  
    private @Getter WebElement CashbookDropdown;
	
	@FindBy(xpath = "//*[contains(@name,'T1')]")  
    private @Getter WebElement EnterIDTextbox;
	
	@FindBy(xpath = "//input[@value='Get Search Result' and @name='B1']")  
    private @Getter WebElement GetSearchresultbuttonofUHIDateRecepitNoFilter;

	@FindBy(xpath = "//*[contains(@id,'table5')]")  
    private @Getter WebElement PatientinfoTable;

	@FindBy(xpath = "//*[@name='chk0']")  
    private @Getter WebElement FirstCheckboxtoSelectService;

	@FindBy(xpath = "//*[@name='chk1']")  
    private @Getter WebElement SecondCheckboxtoSelectService;

	@FindBy(xpath = "//*[@name='chk2']")  
    private @Getter WebElement ThirdCheckboxtoSelectService;
	
	@FindBy(xpath = "//*[@name='txtgross']")  
    private @Getter WebElement GrossAmountTextBox;
	
	@FindBy(xpath = "//*[@name='txtdiscount']")  
    private @Getter WebElement DisscountAmountTextBox;
	
	@FindBy(xpath = "//*[@name='txtnet']")  
    private @Getter WebElement NetAmountTextBox;
	
	@FindBy(xpath = "//*[@name='txtTotalRefund']")  
    private @Getter WebElement TotalRefundAmountTextBox;
	
	@FindBy(xpath = "//*[@name='txtremarks']")  
    private @Getter WebElement RemarksTextBox;
	
	@FindBy(xpath = "//*[@id='txtrefundamt0']")  
    private @Getter WebElement RefundAmountTextBox;
	
	@FindBy(xpath = "//*[@value='Refund Bill']")  
    private @Getter WebElement RefundBillButton;
	
	@FindBy(xpath = "//*[contains(@id,'divReceiptDetail')]/descendant::tr[3]/td")  
    private @Getter List<WebElement> ReceiptDetailinfoBoxForVerification;

	@FindBy(xpath = "//*[contains(@id,'table5')]/descendant::tr[2]/td")  
    private @Getter List<WebElement> PatientinfoTableForVerification;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[3]/td/table/tbody/tr[2]/td")  
    private @Getter List<WebElement> PtientinfoinRefundrecepit;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[4]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td")  
    private @Getter List<WebElement> ServiceinfoinRefundrecepit;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[6]/td/table/tbody/tr[1]/td")  
    private @Getter List<WebElement> TotalAmountinRefundrecepit;
	
	@FindBy(xpath = "//*[contains(@value,'mr')]")  
    private @Getter WebElement RecepitNoRadiobutton;

	
	
public RefundReceiptLocators(WebDriver driver) {

	PageFactory.initElements(driver, this); 
	}

}
