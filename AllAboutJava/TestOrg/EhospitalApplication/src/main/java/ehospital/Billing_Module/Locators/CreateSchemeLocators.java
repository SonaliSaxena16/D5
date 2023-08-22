package ehospital.Billing_Module.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class CreateSchemeLocators {

	@FindBy(xpath = "//a[text() = 'Create Scheme']")  
	private @Getter WebElement CreateSchemelink;

	@FindBy(xpath = "//*[@id='save']")  
	private @Getter WebElement Savebutton;
	
	@FindBy(xpath = "//*[@id='Credit_Scheme_Name']")  
	private @Getter WebElement CreditSchemeNameTextBox;
	
	@FindBy(xpath = "//*[@name='Credit_Scheme_Category']")  
	private @Getter WebElement StateRadiobutton;
	
	@FindBy(xpath = "//*[@id='Credit_Scheme_Code']")  
	private @Getter WebElement CreditSchemeCodeTextBox;
	
	@FindBy(xpath = "//*[@id='Credit_Amount_Limit']")  
	private @Getter WebElement CreditAmountLimitTextBox;
	
	@FindBy(xpath = "//*[@id='Credit_Organized_Body']")  
	private @Getter WebElement CreditOrganizedBodyTextBox;

	@FindBy(xpath = "//*[@id='companyaddr']")  
	private @Getter WebElement MainOfficeAddressTextBox;
	
	@FindBy(xpath = "//*[@id='companypin']")  
	private @Getter WebElement MainOfficePINTextBox;
	
	@FindBy(xpath = "//*[@id='companyll']")  
	private @Getter WebElement MainOfficeLandLineTextBox;
	
	@FindBy(xpath = "//*[@id='companyurl']")  
	private @Getter WebElement CompanyWebsiteURLTextBox;
	
	@FindBy(xpath = "//*[@id='contactperson']")  
	private @Getter WebElement ContactPersonNameTextBox;
	
	@FindBy(xpath = "//*[@id='messagecomp']")  
	private @Getter WebElement  SavedSuccessfullyMessage;
	
	@FindBy(xpath = "//span[text() = '--select--']")  
	private @Getter WebElement  Selectbutton;

	@FindBy(xpath = "//*[@value='Update SCHEME']")  
	private @Getter WebElement  UpdateSCHEMEbutton;
	
	@FindBy(xpath = "//*[@value='ADD NEW SCHEME']")  
	private @Getter WebElement  ADDNEWSCHEMEbutton;
	
	
	
public CreateSchemeLocators(WebDriver driver) {

 PageFactory.initElements(driver, this); 
}

	
	
	
	
}
