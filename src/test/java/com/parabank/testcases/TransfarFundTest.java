package com.parabank.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.base.Base;
import com.parabank.pages.HomePage;
import com.parabank.pages.TransfarFundPage;

public class TransfarFundTest extends Base{
	
	public TransfarFundTest() {
		super();
	}
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = initializeBrowserAndOpenApplicationURL("chrome");
		
		HomePage homePage = new HomePage(driver);
		homePage.transfarFundHome(prop.getProperty("validUserName"),prop.getProperty ("validPassword"));
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
	@Test(priority = 1)
	public void transfarFundSavingsToSavings() {
		
		TransfarFundPage transfarFundPage = new TransfarFundPage(driver);
		transfarFundPage.TransfarFundSavingsToSavings("31992", "32103", dataProp.getProperty("ammount"));
	
		Assert.assertEquals(transfarFundPage.fundTransfarSuccessPageHeading(),dataProp.getProperty("FundTrasnfatSuccessHeading"),"Fund Transfar Success page is not displayed");

	
        

	}
	
}