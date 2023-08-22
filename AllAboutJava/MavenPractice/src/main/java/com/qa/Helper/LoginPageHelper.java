package com.qa.Helper;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.qa.Base.TestBase;
import com.qa.Locators.LoginPageLocators;

public class LoginPageHelper extends TestBase{
	
	LoginPageLocators lp;

	public LoginPageHelper() throws IOException {
		super();
	}

	
	public void getStartedButtonIsClickable() throws IOException, InterruptedException {
		 lp = new LoginPageLocators();
		WebElement link = lp.getStartedLink;
		Thread.sleep(3000);
		link.click();
		Thread.sleep(3000);
		}
	
	
	
	
	
	
	
	
}
