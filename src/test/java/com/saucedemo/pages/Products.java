package com.saucedemo.pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Products {
	
	WebDriver driver;
	WebDriverWait wait;
	public Products(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	//Elements 
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") WebElement product1;
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt") WebElement product2 ;
	@FindBy(xpath="//a[@class='shopping_cart_link']") WebElement cartIcon;
			
			
	//Actions- Methods
	public void clickProducts() {
	//wait
		wait.until(ExpectedConditions.visibilityOf(product1));
		product1.click();
		product2.click();
	}		
	public void clickCart() {
		wait.until(ExpectedConditions.visibilityOf(cartIcon));
		cartIcon.click();
	}
}





