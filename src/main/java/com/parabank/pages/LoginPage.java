package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userNameField;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement loginBTN;
	
	@FindBy(xpath = "//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a")
	private WebElement loginSuccessHeading;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginWithValidData(String userNameText,String passwordText) {
		
		userNameField.sendKeys(userNameText);
		passwordField.sendKeys(passwordText);
		loginBTN.click();
		
	}
	public String retrieveLoginSuccessPageHeading() {
		
		String loginSuccessHeadingText = loginSuccessHeading.getText();
		return loginSuccessHeadingText;
	}
	
	

}
