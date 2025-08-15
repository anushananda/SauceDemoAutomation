package com.saucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu {
	
	WebDriver driver;
	WebDriverWait wait;
	public Menu(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	//Elements 
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") WebElement topMenu;
	@FindBy(xpath="//a[@id='logout_sidebar_link']") WebElement logout;
	
	public void clickMenuButton() {
    wait.until(ExpectedConditions.visibilityOf(topMenu));
    topMenu.click();
	}
	public void clickLogout() {
	wait.until(ExpectedConditions.visibilityOf(logout));
	logout.click();		
	}
}
