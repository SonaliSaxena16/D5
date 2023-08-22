package ehospital.Billing_Module.Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class RegistrationFeeCancellationLocators {

  @FindBy(xpath = "//a[text() = 'Registration Fee Cancellation']")  
  private @Getter WebElement RegistrationFeeCancellationlink;

  @FindBy(xpath = "//*[@id='other_div_img']")  
  private @Getter WebElement  SearchCriterionexpandimageButton;

  @FindBy(xpath = "//*[@id='other_div']")  
  private @Getter WebElement  SearchFilterContainerBox;
  
  @FindBy(xpath = "//*[@name='chkMobile']")  
  private @Getter WebElement  ContactNumberCheckbox;
  
  @FindBy(xpath = "//*[@value='Get Result']")  
  private @Getter WebElement  GetResultbutton;

  @FindBy(xpath = "//*[@name='txtMobile']")  
  private @Getter WebElement  MobileNumberTextBox;

  @FindBy(xpath = "//*[@id='gen_info_div']")  
  private @Getter WebElement  SearchResultInfoBox;
	
  @FindBy(xpath = "//*[@id='gen_info_div_img']")  
  private @Getter WebElement  SearchResultExpandbutton;

  @FindBy(xpath = "//*[@name='chkDt']")  
  private @Getter WebElement   RangeofVisitDateCheckbox;

  @FindBy(xpath = "//*[@name='Calfdt_calbutton']")  
  private @Getter WebElement   dateCalenderbutton;
  
  @FindBy(xpath = "//*[@id='todaysDateString']")  
  private @Getter WebElement TodayDate;
  
  @FindBy(xpath = "//*[@id='ChkDept']")  
  private @Getter WebElement ClinicCheckbox;
  
  @FindBy(xpath = "//*[@id='ChkName']")  
  private @Getter WebElement AnyPartofNameCheckBox;
  
  @FindBy(xpath = "//*[@name='txtName']")  
  private @Getter WebElement AnyPartofNameTextBox;
  
  @FindBy(xpath = "//*[@name='chkRegNo']")  
  private @Getter WebElement UHIDcheckBox;
  
  @FindBy(xpath = "//*[@name='txtRegNo']")  
  private @Getter WebElement UHIDTextBox;
  
  @FindBy(xpath = "//*[@id='gen_info_div']/descendant::tr[4]/td")  
  private @Getter List<WebElement> PatientinfoTableForVerification;

  @FindBy(xpath = "//*[contains(@value,'select')]")  
  private @Getter WebElement Selectbutton;
  
  @FindBy(xpath = "//*[@id='form1']/descendant::tr[2]/td/fieldset/table/tbody/tr/td")  
  private @Getter List<WebElement> PatientinfoTableintoUpdattionPageForVerification;
  
  @FindBy(xpath = "//*[@value=\"Cancel Registration Fee\"]")  
  private @Getter WebElement CancelRegistrationFeebutton;
  
  @FindBy(xpath = "//*[@id=\"textarea\"]")  
  private @Getter WebElement RemarksTextArea;

  @FindBy(xpath = "//*[@id=\"txtIncome\"]")  
  private @Getter WebElement RegistrationFeeTextbox;

  @FindBy(xpath = "//*[@value=\"Re- Search\"]")  
  private @Getter WebElement ReSearchbutton;

  @FindBy(xpath = "//span[text() = 'Fee was already updated.']")  
  private @Getter WebElement FeeUpdationMessage;

  @FindBy(xpath = "//*[@id='ddlcat']")  
  private @Getter WebElement CategoryDropdown;

  
  
public RegistrationFeeCancellationLocators(WebDriver driver) {

 PageFactory.initElements(driver, this); 
}


}
