package com.saucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutInfo {
	
	WebDriver driver;
	WebDriverWait wait;
	public CheckoutInfo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	//Elements 
	@FindBy(name="firstName") WebElement fname;
	@FindBy(name="lastName") WebElement lname;
	@FindBy(name="postalCode") WebElement pCode;
	@FindBy(id="continue") WebElement addInfo;
	
	//Actions
	public void addUserInfo(String uFname, String uLname, String pinCode) {
		
		wait.until(ExpectedConditions.visibilityOf(fname));
		
		fname.sendKeys(uFname);
		lname.sendKeys(uLname);
		pCode.sendKeys(pinCode);	
	}
	
	
	public void finalCheckout() {
		wait.until(ExpectedConditions.visibilityOf(addInfo));
		addInfo.click();
	}
	

}
