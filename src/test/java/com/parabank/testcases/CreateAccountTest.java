package com.parabank.testcases;


import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.base.Base;
import com.parabank.pages.AccountCreateSuccessPage;
import com.parabank.pages.CreateAccountPage;
import com.parabank.pages.HomePage;

public class CreateAccountTest extends Base{
	
	
	public CreateAccountTest() {
		super();
	}
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = initializeBrowserAndOpenApplicationURL("chrome");
		HomePage homePage = new HomePage(driver);
		homePage.createAccountHome(prop.getProperty("validUserName"), prop.getProperty("validPassword"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
	@Test(priority = 1)
	public void createCheckingAccount() {
		
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		AccountCreateSuccessPage accountCreateSuccessPage = new AccountCreateSuccessPage(driver);
		createAccountPage.CreateCheckingAccount("CHECKING");
		
		Assert.assertEquals(accountCreateSuccessPage.retrieveAccountCreateSuccessPageHeading(),dataProp.getProperty("accountCreateSuccessfullyCreatedHeading"),"Account Create Success page is not displayed");

		
	}
	
	@Test(priority = 2)
	public void createSavingsAccountOne() {
		
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		AccountCreateSuccessPage accountCreateSuccessPage = new AccountCreateSuccessPage(driver);
		createAccountPage.CreateSavingsOneAccount("SAVINGS");
		
		Assert.assertEquals(accountCreateSuccessPage.retrieveAccountCreateSuccessPageHeading(),dataProp.getProperty("accountCreateSuccessfullyCreatedHeading"),"Account Create Success page is not displayed");
	}
	
	@Test(priority = 3)
	public void createSavingsAccountTwo() {
		
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		AccountCreateSuccessPage accountCreateSuccessPage = new AccountCreateSuccessPage(driver);

		createAccountPage.CreateSavingsTwoAccount("SAVINGS");
		Assert.assertEquals(accountCreateSuccessPage.retrieveAccountCreateSuccessPageHeading(),dataProp.getProperty("accountCreateSuccessfullyCreatedHeading"),"Account Create Success page is not displayed");

	}

}