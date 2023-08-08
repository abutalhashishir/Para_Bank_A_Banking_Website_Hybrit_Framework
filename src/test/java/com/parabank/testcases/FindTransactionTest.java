package com.parabank.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.base.Base;
import com.parabank.pages.FindTransactionPage;
import com.parabank.pages.HomePage;
import com.parabank.pages.TransactionSuccessPage;

public class FindTransactionTest extends Base{
	
	public FindTransactionTest() {
		super();
	}
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = initializeBrowserAndOpenApplicationURL("chrome");
		HomePage homePage = new HomePage(driver);
		homePage.fundTransctionHome(prop.getProperty("validUserName"), prop.getProperty("validPassword"));
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	
	}
	
	@Test(priority = 1)
	public void transfarFundSavingsToSavings() {
		FindTransactionPage findTransactionPage = new FindTransactionPage(driver);
		TransactionSuccessPage transactionSuccessPage = new TransactionSuccessPage(driver);
		
		findTransactionPage.FindTrasaction("31992", dataProp.getProperty("ammount"));
		Assert.assertEquals(transactionSuccessPage.retrieveTransactionSuccessPageHeading(),dataProp.getProperty("transactionSuccessfullyPageHeading"),"tranaction Success page is not displayed");
		


	}
	
}