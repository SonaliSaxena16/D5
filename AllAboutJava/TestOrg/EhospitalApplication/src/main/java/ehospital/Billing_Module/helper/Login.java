package ehospital.Billing_Module.helper;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import ehospital.Login_Page.Objects.HomePage;
import ehospital.Login_Page.Objects.LoginPage;
import in.nic.ehospial.generic.BaseClass;

public class Login extends BaseClass{
	public WebDriver driver;
	LoginPage lp;
	HomePage hp;

	public Login(WebDriver driver) {
		this.driver = driver;
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
	}

	public void ClosePopup() {
		if(isElementPresent(lp.getClosepopupbutton()) == true) {
			delay();
			lp.getClosepopupbutton().click();
		}else if(isElementPresent(lp.getClosepopupbutton()) == false) {
			System.out.println("Close Popup button is not coming ");
		}
	}
	
	
	public void doLogin(String userid,String password) throws Throwable {
//		lp.getCrsbtn().click();
		if(isElementPresent(lp.getLoginoption()) == true) {
			delay();
			moveToTheElementAndClick(lp.getLoginoption());
		}else if(isElementPresent(lp.getLoginoption()) == false) {
			Select ssodrpdwn = new Select(lp.getSsodropdown());
			ssodrpdwn.selectByIndex(2);		
		}
	    //lp.getLoginoption().click();
		delay();
		lp.getUserid().sendKeys(userid);
		//Select ssodrpdwn = new Select(lp.getSsodropdown());
		//ssodrpdwn.selectByIndex(2);
		delay();
		lp.getLoginbtnclick().click();
		lp.getPassword().sendKeys(password);
		Thread.sleep(10000);
		lp.getLoginbtn().click();
	}
public void verifymenudecks(String userid) {
	
	String actualuserid = hp.getUserNameId().getText();
	String actualvalue = actualuserid.substring(actualuserid.indexOf("(")+1,actualuserid.indexOf(")"));
	System.out.println(actualvalue);

	assertEquals(actualvalue, userid);
	Reporter.log("Home-Decks Page is Verified", true);
	
	
}
	
public void verifyloginhomepage() {
		String expectedmsg = "E-Hospital Tree View Structure";
		driver.switchTo().frame(hp.getMainiframe());
		driver.switchTo().frame(hp.getRightframe());
		String actualmsg = hp.getHomepagename().getText();
		assertEquals(actualmsg, expectedmsg);
		Reporter.log("Home Page is Verified", true);
	}

	public void dologout() {
		/*driver.switchTo().defaultContent();
		driver.switchTo().frame(hp.getMainiframe());
		driver.switchTo().frame(hp.getHeaderframe());*/
		hp.getClickonlogout().click();
	}


}
