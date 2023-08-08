package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	//register
	@FindBy(xpath = "//a[normalize-space()='Register']")
	private WebElement registerBtn;
	
	//createAccount
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement inputUserName;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement loginBTN;
	
	@FindBy(xpath = "//a[normalize-space()='Open New Account']")
	private WebElement accountCreateBTN;
	
	//transaction
	
	@FindBy(xpath = "//a[normalize-space()='Find Transactions']")
	private WebElement transactionBTN;
	
	//fund Transfar
	
	@FindBy(xpath = "//a[normalize-space()='Transfer Funds']")
	private WebElement transfarFundBTN;
	
	//updateNumber
	
	@FindBy(xpath = "//a[normalize-space()='Update Contact Info']")
	private WebElement updateNumberBTN;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//register
	public void clickOnRegisterBTN() {
		registerBtn.click();
	}
	//createAccount
	
	public void createAccountHome(String validUserNameText,String validPasswordText) {
		inputUserName.sendKeys(validUserNameText);
		inputPassword.sendKeys(validPasswordText);
		loginBTN.click();
		accountCreateBTN.click();
	}
	
	
	//trans
	public void fundTransctionHome(String validUserNameText,String validPasswordText) {
		inputUserName.sendKeys(validUserNameText);
		inputPassword.sendKeys(validPasswordText);
		loginBTN.click();
		transactionBTN.click();
	}
	
	//funds
	
	public void transfarFundHome(String validUserNameText,String validPasswordText) {
		inputUserName.sendKeys(validUserNameText);
		inputPassword.sendKeys(validPasswordText);
		loginBTN.click();
		transfarFundBTN.click();
		
	}
	
	//updatenumber
	public void UpdateNumberHome(String validUserNameText,String validPasswordText) {
		inputUserName.sendKeys(validUserNameText);
		inputPassword.sendKeys(validPasswordText);
		loginBTN.click();
		updateNumberBTN.click();
	}
}
