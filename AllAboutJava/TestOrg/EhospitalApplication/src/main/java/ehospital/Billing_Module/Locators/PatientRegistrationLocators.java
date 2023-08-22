package ehospital.Billing_Module.Locators;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class PatientRegistrationLocators {

	@FindBy(linkText = "Patient Registration")
	private @Getter WebElement PatientRegistration;

	@FindBy(linkText = "New Registration")
	private @Getter WebElement NewRegistration ;

	@FindBy(xpath = "//*[contains(@id,'idCustom2_cancelButton')]")
	private @Getter WebElement Skipbutton;

	@FindBy(xpath = "//*[contains(@id,'patient_name_patient_name_initials')]")
	private @Getter WebElement Initialsdropdown;

	@FindBy(xpath = "//*[contains(@id,'patient_name_patient_name_first')]")
	private @Getter WebElement firstName;

	@FindBy(xpath = "//*[contains(@id,'patient_name_patient_name_middle')]")
	private @Getter WebElement middleName;

	@FindBy(xpath = "//*[contains(@id,'patient_name_patient_name_last')]")
	private @Getter WebElement lastName;

	@FindBy(xpath = "//*[contains(@id,'date_time_birth_year')]")
	private @Getter WebElement age;

	@FindBy(xpath = "//*[contains(@id,'date_time_birth_hour')]")
	private @Getter WebElement BabyOfAge;

	@FindBy(xpath = "//*[contains(@id,'fathers_name')]")
	private @Getter WebElement guardianname;

	@FindBy(xpath = "//*[contains(@id,'address_patient_add_street')]")
	private @Getter WebElement address;

	@FindBy(xpath = "//*[contains(@id,'cboDept')]")
	private @Getter WebElement Departmentdropdown;

	@FindBy(xpath = "//*[contains(@id,'btnSaveChanges')]")
	private @Getter WebElement Savebutton;

	@FindBy(xpath = "//*[contains(@value,'Close')]")
	private @Getter WebElement closebutton;

	@FindBy(linkText = "Duplicate Registration Slip")
	private @Getter WebElement DuplicateRegistrationSlip;

	@FindBy(xpath = "//*[contains(@id,'chkDt')]")
	private @Getter WebElement Datecheckbox;

	@FindBy(xpath = "//*[contains(@value,'Get Result')]")
	private @Getter WebElement GetResult;

	@FindBy(xpath = "/html/body/table/tbody/tr/td/table[2]/tbody/tr[1]/td/fieldset[2]/div/table[1]/tbody/tr[2]/td[1]")
	private @Getter WebElement selectuhid;

	//Initializing the page object
	public PatientRegistrationLocators(WebDriver driver) throws IOException {
	PageFactory.initElements(driver, this);
	}

}
