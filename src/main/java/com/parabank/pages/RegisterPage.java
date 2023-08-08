package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy(id = "customer.firstName")
	private WebElement fristNameField;
	
	@FindBy(id = "customer.lastName")
	private WebElement lastNameField;
	
	@FindBy(id = "customer.address.street")
	private WebElement addressField;
	
	@FindBy(id = "customer.address.city")
	private WebElement cityField;
	
	@FindBy(id = "customer.address.state")
	private WebElement stateField;
	
	@FindBy(id = "customer.address.zipCode")
	private WebElement zipField;
	
	@FindBy(id = "customer.phoneNumber")
	private WebElement numberField;
	
	@FindBy(id = "customer.ssn")
	private WebElement ssnField;
	
	@FindBy(id = "customer.username")
	private WebElement userNameField;
	
	@FindBy(id = "customer.password")
	private WebElement passwordField;
	
	@FindBy(id = "repeatedPassword")
	private WebElement rePasswordField;

	@FindBy(xpath = "//input[@value='Register']")
	private WebElement clickOnRegisterBtn;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public com.parabank.pages.AccountSuccessPage registationAccounOne(String fristNameText,String lastNameText, String addtessText,String cityText, String stateText,String zipText,String numberText,String ssnText, String userNametext, String passwortText, String confirmPasswordText ) {
		fristNameField.sendKeys(fristNameText);
		lastNameField.sendKeys(lastNameText);
		addressField.sendKeys(addtessText);
		cityField.sendKeys(cityText);
		stateField.sendKeys(stateText);
		zipField.sendKeys(zipText);
		numberField.sendKeys(numberText);
		ssnField.sendKeys(ssnText);
		userNameField.sendKeys(userNametext);
		passwordField.sendKeys(passwortText);
		rePasswordField.sendKeys(confirmPasswordText);
		clickOnRegisterBtn.click();
		return new AccountSuccessPage(driver);
	}
	
	public AccountSuccessPage registationAccounTwo(String fristNameText,String lastNameText, String addtessText,String cityText, String stateText,String zipText,String numberText,String ssnText, String userNametext, String passwortText, String confirmPasswordText ) {
		fristNameField.sendKeys(fristNameText);
		lastNameField.sendKeys(lastNameText);
		addressField.sendKeys(addtessText);
		cityField.sendKeys(cityText);
		stateField.sendKeys(stateText);
		zipField.sendKeys(zipText);
		numberField.sendKeys(numberText);
		ssnField.sendKeys(ssnText);
		userNameField.sendKeys(userNametext);
		passwordField.sendKeys(passwortText);
		rePasswordField.sendKeys(confirmPasswordText);
		clickOnRegisterBtn.click();
		return new AccountSuccessPage(driver);
	}
	
	

}
