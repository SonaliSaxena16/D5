package ehospital.ADT_Module.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class ExistingPatientLocators {

	@FindBy(xpath = "//a[text()= 'Admission/Discharge/Transfer']")  
	private @Getter WebElement ADTModule;

	@FindBy(xpath = "//a[text()= 'IPD Admission']")  
	private @Getter WebElement IPDAdmissionSubModule;

	@FindBy(xpath = "//a[text()= 'Existing Patient']")  
	private @Getter WebElement ExistingPatientLink;

	@FindBy(xpath = "//*[@id='txtRegNo']")  
	private @Getter WebElement UHIDTextBox;

	@FindBy(xpath = "//*[@value='Show Patient Details']")  
	private @Getter WebElement ShowPatientDetailsButton;

	@FindBy(xpath = "//*[@id='ddlDept']")  
	private @Getter WebElement DepartMentDropdown;

	@FindBy(xpath = "//*[@id='ddlUnit']")  
	private @Getter WebElement UnitDropdown;

	@FindBy(xpath = "//*[@id='ddlWard']")  
	private @Getter WebElement WardDropdown;

	@FindBy(xpath = "//*[@value='Save & Generate Ticket']")  
	private @Getter WebElement SaveandGenerateTicketbutton;

	@FindBy(xpath = "//a[text() = 'Duplicate Admission Slip']")  
	private @Getter WebElement DuplicateAdmissionSliplink;

	@FindBy(xpath = "//*[@value='  Search >>  ']")  
	private @Getter WebElement Searchbutton;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td/table/tbody/tr[5]/td/div/table/tbody/tr[2]/td[2]")  
	private @Getter WebElement AdmissionID;
	

	
	
public ExistingPatientLocators(WebDriver driver) {

 PageFactory.initElements(driver, this); 
}

	
	
	
	
	
	
}
