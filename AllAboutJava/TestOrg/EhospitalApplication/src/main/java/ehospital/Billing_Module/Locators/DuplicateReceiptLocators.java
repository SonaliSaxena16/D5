package ehospital.Billing_Module.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class DuplicateReceiptLocators {
	
	@FindBy(xpath = "//a[text()='Duplicate Receipt']")  
    private @Getter WebElement DuplicateReceiptLink;

	@FindBy(xpath = "//*[contains(@value,'mr')]")  
    private @Getter WebElement RecepitNoRadiobutton;
	
	@FindBy(xpath = "//*[contains(@value,'rn')]")  
    private @Getter WebElement UHIDRadiobutton;
	
	@FindBy(xpath = "//*[contains(@value,'rd')]")  
    private @Getter WebElement DateRadiobutton;
	
	@FindBy(css = "td.stlfont:nth-child(2) > img:nth-child(3)")  
    private @Getter WebElement CalenderImage;
	
	@FindBy(xpath = "//a[text() = 'Today']")  
    private @Getter WebElement TodayoptioninCalenderImage;
	
	@FindBy(xpath = "//input[@value='Get Search Result' and @name='B2']")  
    private @Getter WebElement GetSearchresultbutton;
	
	@FindBy(xpath = "//a[text() = 'select']")  
    private @Getter WebElement SelectbuttontoPrintReport;
	
	@FindBy(xpath = "//input[@value='Get Search Result' and @name='B1']")  
    private @Getter WebElement GetSearchresultbuttonofUHIDateRecepitNoFilter;

	@FindBy(xpath = "//*[contains(@name,'ddlcash')]")  
    private @Getter WebElement CashbookDropdown;
	
	@FindBy(xpath = "//*[contains(@name,'T1')]")  
    private @Getter WebElement EnterIDTextbox;
	
	@FindBy(xpath = "//*[contains(@id,'table5')]")  
    private @Getter WebElement PatientinfoTable;
	
	@FindBy(css = "td.stlfont:nth-child(10)")  
    private @Getter WebElement getReceiptNumber;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public DuplicateReceiptLocators(WebDriver driver) {

		PageFactory.initElements(driver, this); 
		}

}
