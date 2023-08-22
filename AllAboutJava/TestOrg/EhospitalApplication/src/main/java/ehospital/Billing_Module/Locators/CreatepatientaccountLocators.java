package ehospital.Billing_Module.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class CreatepatientaccountLocators {

	
	@FindBy(xpath = "//a[text() = 'Create patient account']")  
	private @Getter WebElement CreatepatientaccountLink;

	@FindBy(xpath = "//*[@id='ddlReg']")  
	private @Getter WebElement IDDropdown;

	@FindBy(xpath = "//*[@value='Search >>']")  
	private @Getter WebElement Searchbutton;
	
	@FindBy(xpath = "//*[@id='patient_registrationno1']")  
	private @Getter WebElement IDTextbox;
	
	@FindBy(xpath = "//*[@id='sppatient_billing_cat_details']")  
	private @Getter WebElement  BillingCategoryDetails;
	
	@FindBy(xpath = "//*[@id='ddlcat']")  
	private @Getter WebElement  PatientTypeDropdown;
	
	@FindBy(xpath = "//*[@id='apl_bpl']")  
	private @Getter WebElement  BillingTypeDropdown;
	
	@FindBy(xpath = "//*[@value='Save']")  
	private @Getter WebElement  SaveButton;
	
	@FindBy(xpath = "//*[@id='ddl_scheme']")  
	private @Getter WebElement  SchemeNamedropdown ;
	
	@FindBy(xpath = "//*[@id='txtValidAmount']")  
	private @Getter WebElement  AmountLimitTextBox ;
	
	@FindBy(xpath = "//*[@id='txtAccountNo']")  
	private @Getter WebElement  AccounttNumberTextBox ;
	
	@FindBy(xpath = "//*[@id='txtVDdate']")  
	private @Getter WebElement  ValiduptoTextbox ;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td/center/table[2]/tbody/tr[6]/td[7]/a")  
	private @Getter WebElement  SelectDate;
	
	@FindBy(xpath = "//*[@name='cpMonth']")  
	private @Getter WebElement  MonthDropdown ;
	
	@FindBy(xpath = "//*[@name='cpYear']")  
	private @Getter WebElement  YearDropdown ;
	
	@FindBy(xpath = "//*[@id='txtAccountDetails']")  
	private @Getter WebElement  AccountDetailsTextBox ;
	
	@FindBy(xpath = "//*[@alt='edit']")  
	private @Getter WebElement  Blockimgbutton ;
	
	@FindBy(xpath = "//a[text() = 'Unblock']")  
	private @Getter WebElement  Unblocklink ;
	
	@FindBy(xpath = "//*[@alt='delete']")  
	private @Getter WebElement  deletebutton ;
	
	
	
	
	
	
public CreatepatientaccountLocators(WebDriver driver) {

 PageFactory.initElements(driver, this); 
}
	

}
