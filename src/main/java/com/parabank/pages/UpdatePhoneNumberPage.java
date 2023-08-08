package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePhoneNumberPage {
	
	WebDriver driver;
	
	@FindBy(id = "customer.phoneNumber")
    private WebElement phoneNumberField;
    
    @FindBy(xpath = "//input[@value='Update Profile']")
    private WebElement updateBTN;
    
    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    private WebElement logOutBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/p[1]")
    private WebElement updateNumberHeading;
    
    public UpdatePhoneNumberPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void updateNumber(long phoneNumber) {
        phoneNumberField.clear();
        phoneNumberField.sendKeys(String.valueOf(phoneNumber));
        updateBTN.click();
    }
    public String retrieveUpdateNumberSuccessPageHeading() {
		
		String updateNumberHeadingText = updateNumberHeading.getText();
		return updateNumberHeadingText;
	}
    
    public void logOut() {
    	logOutBtn.click();
    }
}
