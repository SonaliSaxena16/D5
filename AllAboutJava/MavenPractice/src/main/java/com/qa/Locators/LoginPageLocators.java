package com.qa.Locators;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class LoginPageLocators extends TestBase{

	// Object Repository or Page Objects
	
	
	@FindBy(xpath = "//a[text()='Get started']")
	public WebElement getStartedLink;
	
	
	public LoginPageLocators() throws IOException {
		PageFactory.initElements(driver, this);

	}
	
	
}
