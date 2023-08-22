package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Helper.LoginPageHelper;

public class LoginPageTest extends TestBase{
	
	LoginPageHelper lph;
	
	public LoginPageTest() throws IOException {
		super();
	}

	
	@BeforeSuite
	public void setUp() throws InterruptedException, IOException {
		lph = new LoginPageHelper();
		initialization();
	}
	
	@Test(priority=1)
	public void getStartedButtonIsClickable() throws InterruptedException, IOException {
		lph.getStartedButtonIsClickable();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
}
