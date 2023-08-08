package com.parabank.testcases;


import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.base.Base;
import com.parabank.pages.AccountSuccessPage;
import com.parabank.pages.HomePage;
import com.parabank.pages.RegisterPage;
import com.parabank.utils.Utilities;

public class RegisterTest extends Base{
	
	public RegisterTest() {
		super();
	}
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		
		driver = initializeBrowserAndOpenApplicationURL("chrome");
		HomePage homePage = new HomePage(driver);
		homePage.clickOnRegisterBTN();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void registerAccounOne() {
		
		RegisterPage registerPage = new RegisterPage(driver);
		AccountSuccessPage accountSuccessPage = new AccountSuccessPage(driver);
		
		registerPage.registationAccounOne(dataProp.getProperty("firstName"), dataProp.getProperty("lastName"), dataProp.getProperty("address"),
				dataProp.getProperty("city"), dataProp.getProperty("state"), dataProp.getProperty("zip"), dataProp.getProperty("phone"), dataProp.getProperty("SSN"), 
				Utilities.generateUserNameWithTimeStamp(), dataProp.getProperty("password"), dataProp.getProperty("confirm"));
		
		Assert.assertEquals(accountSuccessPage.retrieveAccountSuccessPageHeading(),dataProp.getProperty("accountSuccessfullyCreatedHeading"),"Account Success page is not displayed");

		
		
			
	}
	
	@Test(priority = 2)
	public void registerAccounOTwo() {
		
		RegisterPage registerPage = new RegisterPage(driver);
		AccountSuccessPage accountSuccessPage = new AccountSuccessPage(driver);

		
		registerPage.registationAccounTwo(dataProp.getProperty("firstName"), dataProp.getProperty("lastName"), dataProp.getProperty("address"),
				dataProp.getProperty("city"), dataProp.getProperty("state"), dataProp.getProperty("zip"), dataProp.getProperty("phone"), dataProp.getProperty("SSN"), 
				Utilities.generateUserNameWithTimeStamp(), dataProp.getProperty("password"), dataProp.getProperty("confirm"));
		
		Assert.assertEquals(accountSuccessPage.retrieveAccountSuccessPageHeading(),dataProp.getProperty("accountSuccessfullyCreatedHeading"),"Account Success page is not displayed");
		
			
	}
	

	

}
