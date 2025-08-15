package com.saucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThankYou {
	WebDriver driver;
	WebDriverWait wait;
	public ThankYou(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	//Elements 
	
	@FindBy(xpath="//h2[contains(text(),'Thank you for your order!')]") WebElement checkMessage;
	@FindBy(xpath="//button[@id='back-to-products']") WebElement backToHome;
	
	//Methods
	public String thxMsg() {
	
	wait.until(ExpectedConditions.visibilityOf(checkMessage));
	return checkMessage.getText().trim();
	}
	
	public void orderConfirm() {	
	
	wait.until(ExpectedConditions.visibilityOf(backToHome));
	backToHome.click();	
	}
	

}
