package ehospital.Billing_Module.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class RateConfigurationofServicesLocators {

	@FindBy(xpath = "//a[text() = 'Billing Admin']")  
    private @Getter WebElement BillingAdminSubModule;
	
	@FindBy(xpath = "//a[text() = 'Rate Configuration of Services']")  
    private @Getter WebElement RateConfigurationofServicesLink;
	
	@FindBy(xpath = "//*[contains(@name,'ddlsearchtest' )]")  
    private @Getter WebElement ServiceCategoryDropdown;
	
	@FindBy(xpath = "//a[text() = '--Details--']")  
    private @Getter WebElement Detailslink;
	
	@FindBy(xpath = "//*[contains(@name,'txtbasicrate')]")  
    private @Getter WebElement BasicRateTextBox;
	
	@FindBy(xpath = "//a[text()='Change For All']")  
    private @Getter WebElement ChangeForAlllink;

	@FindBy(xpath = "//*[contains(@name,'txtrate12')]")  
    private @Getter WebElement RateTextBox;
	
	@FindBy(xpath = "//*[contains(@name,'chkrate12')]")  
    private @Getter WebElement FreeCheckBox;
	
	@FindBy(xpath = "//*[contains(@value,'Save')]")  
    private @Getter WebElement Savebutton;
	
	@FindBy(xpath = "//*[contains(@value,'Cancel')]")  
    private @Getter WebElement Cancelbutton;
	
	@FindBy(xpath = "//*[contains(@name,'txtsearchtest')]")  
    private @Getter WebElement SearchServiceByGenericNameTextBox;
	
	@FindBy(xpath = "//*[contains(@id,'dvdisplay')]")  
    private @Getter WebElement ServiceInformationTable;
	
	@FindBy(xpath = "//*[contains(@id,'idCustom1_popup')]")  
    private @Getter WebElement ServiceChargePopUpbox;
	

	
	
	

	
	public RateConfigurationofServicesLocators(WebDriver driver) {

		PageFactory.initElements(driver, this); 
		}
}

