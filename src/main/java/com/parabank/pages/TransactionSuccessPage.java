package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionSuccessPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"transactionTable\"]/tbody/tr[1]/td[2]/a")
	private WebElement transactionSuccessPageHeading;
	
	public TransactionSuccessPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public String retrieveTransactionSuccessPageHeading() {
		
		String transactionSuccessPageHeadingText = transactionSuccessPageHeading.getText();
		return transactionSuccessPageHeadingText;
	}

}