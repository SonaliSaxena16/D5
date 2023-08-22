package ehospital.Billing_Module.Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class MapServiceWithSchemeLocators {

	@FindBy(xpath = "//a[text() = 'Scheme']")  
	private @Getter WebElement SchemeSubModule;

	@FindBy(xpath = "//a[text() = 'Map Service With Scheme']")  
	private @Getter WebElement MapServiceWithSchemelink;
	
	@FindBy(xpath = "//*[@id='ddlSchemeName']")  
	private @Getter WebElement SchemeNameDropdown;
	
	@FindBy(xpath = "//*[@id='ddlServiceCategory']")  
	private @Getter WebElement ServiceCategoryDropdown;
	
	@FindBy(xpath = "//*[@id='divService']")  
	private @Getter WebElement ServiceTable;
	
	@FindBy(xpath = "//*[@id='filterTextInput']")  
	private @Getter WebElement FilterServiceTextBox;
	
	@FindBy(xpath = "//*[@id='txtRate0']")  
	private @Getter WebElement FirstServiceRateTextBox;
	
	@FindBy(xpath = "//*[@id='chkpreAuth0']")  
	private @Getter WebElement PreauthorizationCheckbox;
	
	@FindBy(xpath = "//*[@id='chkselectall']")  
	private @Getter WebElement SelectCheckbox;
	
	@FindBy(xpath = "//*[@id='chksubtest0']")  
	private @Getter WebElement SelectFirstCheckbox;
	
	@FindBy(xpath = "//*[@value='Map Service']")  
	private @Getter WebElement MapServicebutton;
	
	@FindBy(xpath = "//div[text() = 'Map Service With Scheme Successfully.']")  
	private @Getter WebElement MapServiceMessage;
	
	@FindBy(xpath = "//*[@id='companylistdiv']")  
	private @Getter List<WebElement>  ServiceMapList;

	
	
	
	
	
	
	
	
	
	
public MapServiceWithSchemeLocators(WebDriver driver) {

 PageFactory.initElements(driver, this); 
}

	
	
	
}
