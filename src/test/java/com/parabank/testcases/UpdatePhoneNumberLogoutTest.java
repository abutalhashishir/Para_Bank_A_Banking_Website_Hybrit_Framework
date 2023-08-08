package com.parabank.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.base.Base;
import com.parabank.pages.HomePage;
import com.parabank.pages.UpdatePhoneNumberPage;
import com.parabank.utils.Utilities;

public class UpdatePhoneNumberLogoutTest extends Base{
	
	public UpdatePhoneNumberLogoutTest() {
		super();
	}
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = initializeBrowserAndOpenApplicationURL("chrome");
		
		HomePage homePage = new HomePage(driver);
		homePage.UpdateNumberHome(prop.getProperty("validUserName"),prop.getProperty ("validPassword"));
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
	@Test(priority = 1)
	public void updatePhoneNumber() {
		
		UpdatePhoneNumberPage updatePhoneNumberPage = new UpdatePhoneNumberPage(driver);
		updatePhoneNumberPage.updateNumber(Utilities.generateRandomNumber());
		Assert.assertEquals(updatePhoneNumberPage.retrieveUpdateNumberSuccessPageHeading(),dataProp.getProperty("updatePhoneNumberSuccessHeading"),"Number Success page is not displayed");

	}
	
	@Test(priority = 2)
	public void LogOut() {
		
		UpdatePhoneNumberPage updatePhoneNumberPage = new UpdatePhoneNumberPage(driver);
		updatePhoneNumberPage.logOut();
		Assert.assertTrue(driver.findElement(By.id("loginPanel")).isDisplayed());

	}
	
	
}