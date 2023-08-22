package ehospital.Login_Page.TestScripts;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ehospital.Billing_Module.helper.Login;
import ehospital.GenerateGetterSetter.AccessConfigData;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.BrowserFactory;
import in.nic.ehospial.generic.ReadPropertyFile;


public class LoginTest extends BaseClass {
	
	@Test(priority = 1,groups = {"Functional","Smoke"})
	public void validlogin() throws Throwable {
		preCondition();
		
		Login lf = new Login(driver);
		
		
		
		
		AccessConfigData user =ReadPropertyFile.loadUser();
	    String userid = user.getUserId();
		String password = user.getPassword();
		lf.ClosePopup();
		delay();
		lf.doLogin(userid,password);
		lf.verifymenudecks(userid);

	}

}


