package com.parabank.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.base.Base;
import com.parabank.pages.LoginPage;

public class LoginTest extends Base{
	
	public LoginTest() {
		super();
	}
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		
		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void Login() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginWithValidData(prop.getProperty("validUserName"), prop.getProperty("validPassword"));
		
		Assert.assertEquals(loginPage.retrieveLoginSuccessPageHeading(),dataProp.getProperty("logInSuccessHeading"),"Login Success page is not displayed");
		
			
	}
	

}
