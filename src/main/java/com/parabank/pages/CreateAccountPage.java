package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountPage {
	
	WebDriver driver;
	
	@FindBy(id = "type")
	private WebElement dropDownaccountType;
	
	@FindBy(how = How.LINK_TEXT,using = "CHECKING")
	private WebElement clickOnChecking;
	
	@FindBy(className = "button")
	private WebElement newAccountBTN;
	
	@FindBy(how = How.LINK_TEXT, using = "SAVINGS")
	private WebElement clickOnSavings;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public com.parabank.pages.AccountSuccessPage CreateCheckingAccount(String text) {
		Select list = new Select(dropDownaccountType);
		list.selectByVisibleText(text);
		newAccountBTN.click();
		return new AccountSuccessPage(driver);
		
	}
	public void CreateSavingsOneAccount(String text) {
		Select list = new Select(dropDownaccountType);
		list.selectByVisibleText(text);
		newAccountBTN.click();
		
	}
	public void CreateSavingsTwoAccount(String text) {
		Select list = new Select(dropDownaccountType);
		list.selectByVisibleText(text);
		newAccountBTN.click();
		
	}
	
	
	

}
