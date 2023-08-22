package ehospital.Billing_Module.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class CancelReceiptLocators {
	
	@FindBy(xpath = "//a[text() = 'Cancel Receipt']")  
    private @Getter WebElement CancelReceiptlink;

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

	@FindBy(xpath = "//*[@id='select']//following::a[1]")  
    private @Getter WebElement Selectbutton;
	
	@FindBy(xpath = "//*[@name='txtremarks']")  
    private @Getter WebElement 	ReasonForCancellationTextBox;

	@FindBy(xpath = "//*[@value='Cancel Receipt']")  
    private @Getter WebElement 	CancelReceiptButton;
	
	@FindBy(xpath = "//*[contains(@value,'mr')]")  
    private @Getter WebElement RecepitNoRadiobutton;

	
	
	
	
	
	
public CancelReceiptLocators(WebDriver driver) {

   PageFactory.initElements(driver, this); 
}

}
