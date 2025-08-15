package com.saucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	 WebDriver driver;
	
	//page factory initialization
	public Login(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);	
	}
	
	
	// Elements collection using locators 
	@FindBy(id="user-name") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement login;
	
//Action/Method to login
	public void flogin(String uname, String upass) {
	//wait 
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOf(username));
	username.sendKeys(uname);
	password.sendKeys(upass);
	login.click();
	}
}
