package ehospital.Login_Page.Objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

	public class LoginPage  {
		
		 @FindBy(xpath="//*[@id='txtuid']")
		private @Getter WebElement userid;
	    
		 @FindBy(xpath="//select[@class='form-control']") 
	    private @Getter WebElement ssodropdown;
	    
		 @FindBy(css=".btn.btn-success.btn-lg")
	     private @Getter WebElement loginbtnclick;

	 	 @FindBy(xpath="//*[@id=\"txt_pwd\"]")
		 	private @Getter WebElement password;
	 	 
	 	 @FindBy(xpath="/html/body/div[12]/div/div[2]/div/div[2]/form[1]/div[5]/button/span")
		 	private @Getter WebElement loginbtn;
	 	 
	 
	 	 @FindBy(xpath="//*[@id='backgroundPopup_1']/button")
		 	private @Getter WebElement crsbtn;
	 	 
	 	@FindBy(xpath = "//*[contains(@onclick,'closeMIBPopup();')]")
	 	private @Getter	WebElement Closepopupbutton;
	 	
	 	@FindBy(xpath = "//b[text() = 'Login']") 
	 	private @Getter WebElement Loginoption;


	 	 
	 	 public LoginPage(WebDriver driver) {
	    
	    	 
	    	PageFactory.initElements(driver, this); 
	     }
	     
	}

