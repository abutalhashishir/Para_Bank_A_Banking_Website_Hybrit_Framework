package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreateSuccessPage {
WebDriver driver;
	
	@FindBy(className = "title")
	private WebElement accountCreateSuccessPageHeading;
	
	public AccountCreateSuccessPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public String retrieveAccountCreateSuccessPageHeading() {
		
		String accountCreateSuccessPageHeadingText = accountCreateSuccessPageHeading.getText();
		return accountCreateSuccessPageHeadingText;
	}

}