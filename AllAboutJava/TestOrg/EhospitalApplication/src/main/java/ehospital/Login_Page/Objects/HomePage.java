package ehospital.Login_Page.Objects;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.nic.ehospial.generic.BaseClass;
import lombok.Getter;

public class HomePage {
	
	
	@FindBy(css="jnjkn")  
    private @Getter WebElement logoutbtn;
	
	@FindBy(id ="ehosfrm") 
	private @Getter WebElement mainiframe;
  
	@FindBy(name ="contents") 
	
	//@FindBy(xpath = "/html/frameset/frameset/frame[1]")
    private @Getter WebElement leftframe;
    
    @FindBy(name="main")
	
    //@FindBy(xpath = "/html/frameset/frameset/frame[2]")
 	private @Getter WebElement rightframe;
    
    @FindBy(id="frame")
 	private @Getter WebElement innerframe;
    
    @FindBy(xpath="/html/body/table/tbody/tr/td/strong/font") 
 	private @Getter WebElement homepagename;
    
    @FindBy(xpath="/html/frameset/frame")
	private @Getter WebElement headerframe;
    
    @FindBy(xpath="//*[@id=\"divHeader\"]/div/div[2]/span[2]/font")
	private @Getter WebElement userNameId;
    
    @FindAll({@FindBy(xpath ="//div[@class='dTreeNode']/a")})
    public @Getter List<WebElement> abcd;
    
    @FindAll({@FindBy(xpath ="//div[@id='divMenuDeck']/div")})
    public @Getter List<WebElement> homdesk;
    
    @FindBy(css="#id_iframe > iframe:nth-child(2)")
	private @Getter WebElement OrderEntryFrame;

    @FindBy(xpath="/html/body/div[8]/iframe")
	private @Getter WebElement LabConsoildatedReportOrderEntryframe;

    
    
	 @FindBy(id="btnlogout")
	 	private @Getter WebElement clickonlogout;
	 
////////////////////////////////////////Modules Tab////////////////////////////////
@FindBy(xpath = "//b[text()='Administration']")
private @Getter WebElement AdministrationTab;

@FindBy(xpath = "//div[@class='st-box'][1]")
private @Getter WebElement PatientregistrationTab;

@FindBy(xpath = "//div[@class='st-box'][3]")
private @Getter WebElement LaboratoryTab;

@FindBy(xpath = "//b[text()='Billing']")
private @Getter WebElement BillingTab;

//////////////////////////////////////////////////////////////////////////////////
@FindBy(linkText = "Administration")
private @Getter WebElement adminmodule;

@FindBy(linkText = "Configuration")	
private @Getter WebElement configuration;

@FindBy(xpath = "//*[contains(@title,'Configure OPD Registration')]")
private @Getter WebElement ConfigureOPDRegistration;

@FindBy(linkText = "CONFIGURE OPD REGISTRATION SLIP")
private @Getter WebElement Registrationslip;

@FindBy(xpath = "//*[contains(@id,'image-1')]")
private @Getter WebElement SelectOPDCardTemplate;

@FindBy(xpath = "//*[contains(@class,'glyphicon glyphicon-chevron-left')]")
private @Getter WebElement leftbuttontoselectslip;

@FindBy(xpath = "(//img[@src = 'img/barcode_slip_old.jpg'])[2]")
private @Getter WebElement selectTemplate5;

@FindBy(xpath = "//*[contains(@class,'btn btn-success')]")
private @Getter WebElement savebutton;

@FindBy(xpath = "//*[contains(@id,'txtuid')]") 
private @Getter WebElement username;

@FindBy(id = "ddl_mod")
private @Getter WebElement dropdown;

@FindBy(xpath = "//*[contains(@onclick,'return verification();')]")
private @Getter WebElement login;

@FindBy(xpath = "//*[contains(@placeholder,'Enter password')]")
private @Getter WebElement password;

@FindBy(xpath = "//*[contains(@onclick,'return validateAndPrepResponse();')]")
private @Getter WebElement signin;

/////////////////////////////////////////////////CONFIGURE REGISTRATION TEMPLATE/////////////

@FindBy(xpath = "//a[text()='CONFIGURE REGISTRATION TEMPLATE']")
private @Getter WebElement CONFIGUREREGISTRATIONTEMPLATETab;

@FindBy(xpath = "//*[contains(@value,'./opdregistration/OPDRegistration_NDMC')]")
private @Getter WebElement NDMCTemplateCheckBox;

@FindBy(xpath = "//*[contains(@value,'UPDATE')]")
private @Getter WebElement UpdateButton;

@FindBy(name = "printback")
private @Getter WebElement printbackframe;

@FindBy(name = "printPage")
private @Getter WebElement printPageframe;

@FindBy(name = "control")
private @Getter WebElement PrintbackframeforBillGenerationRecepit;



/////////////////////////////////////////////////////////////////////////////////////////////////////

    
     
     public HomePage(WebDriver driver) {
    
    	PageFactory.initElements(driver, this); 
     }
     
}



