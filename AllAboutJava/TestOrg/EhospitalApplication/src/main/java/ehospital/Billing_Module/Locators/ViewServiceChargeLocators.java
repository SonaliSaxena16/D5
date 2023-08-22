package ehospital.Billing_Module.Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class ViewServiceChargeLocators {

	@FindBy(xpath = "//a[text()='View Service Charge']")  
    private @Getter WebElement ViewServiceChargeLink;
	
	@FindBy(xpath = "//*[contains(@name,'ddlsearchtest')]")  
    private @Getter WebElement ServiceCategoryDropdown;
	
	@FindBy(xpath = "//*[contains(@name,'txtsearchtest')]")  
    private @Getter WebElement SearchTestByGenericNameTextbox;
	
	@FindBy(xpath = "//a[text() ='--View Charge--']")  
    private @Getter WebElement ViewChargelink;
	
	@FindBy(xpath = "//*[contains(@value,'Cancel')]")  
    private @Getter WebElement Cancelbutton;
	
	@FindBy(xpath = "//*[contains(@id,'dvdisplay')]")  
    private @Getter WebElement ServiceInformationTable;
	
	@FindBy(xpath = "//*[contains(@name,'ddlsearchtest')]")  
    private @Getter List<WebElement> ServiceCategoryDropdowninViewServiceChargeLink;
	
	@FindBy(xpath = "//*[contains(@name,'ddlsearchtest')]")  
    private @Getter List<WebElement> ServiceCategoryDropdowninConfigureServicelink;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public ViewServiceChargeLocators(WebDriver driver) {

		PageFactory.initElements(driver, this); 
		}

}
