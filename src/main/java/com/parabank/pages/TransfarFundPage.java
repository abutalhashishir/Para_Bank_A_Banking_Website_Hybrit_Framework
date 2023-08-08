package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TransfarFundPage {
	
	WebDriver driver;
	
	@FindBy(id = "fromAccountId")
	private WebElement dropDownafromAccount;
	
	@FindBy(id = "toAccountId")
	private WebElement dropDownatoAccount;
	
	@FindBy(id = "amount")
	private WebElement amoount;
	
	@FindBy(xpath = "//input[@value='Transfer']")
	private WebElement transfarBTN;
	
	@FindBy(xpath = "//p[normalize-space()='See Account Activity for more details.']")
	private WebElement fundTransfarSuccessHeading;
	
	public TransfarFundPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public TransactionSuccessPage TransfarFundSavingsToSavings(String text, String text2, String ammountText) {
		Select list = new Select(dropDownafromAccount);
		list.selectByVisibleText(text);
		Select list2 = new Select(dropDownatoAccount);
		list2.selectByVisibleText(text2);
		amoount.sendKeys(ammountText);
		transfarBTN.click();
		return new TransactionSuccessPage(driver);
		
	}
	public String fundTransfarSuccessPageHeading() {
		
		String fundTransfarSuccessHeadingText = fundTransfarSuccessHeading.getText();
		return fundTransfarSuccessHeadingText;
	}
	
	
	

}
