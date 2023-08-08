package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindTransactionPage {
	
	WebDriver driver;
	
	@FindBy(id = "accountId")
	private WebElement dropDownAccount;
	
	@FindBy(id = "criteria.amount")
	private WebElement amountField;
	
	@FindBy(xpath = "//button[@ng-click=\"criteria.searchType = 'AMOUNT'\"]")
	private WebElement transactionBTN;
	
	public FindTransactionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void FindTrasaction(String Text, String amountText) {
		Select list = new Select(dropDownAccount);
		list.selectByVisibleText(Text);
		amountField.sendKeys(amountText);
		transactionBTN.click();
	}
	

}
