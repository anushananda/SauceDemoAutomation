package com.saucedemo.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Cart  {
	WebDriverWait wait ;
	WebDriver driver;
	public Cart(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	
	//Elements 
	
	@FindBy(xpath="//div[@class='inventory_item_name']") private List<WebElement> prodName;
	@FindBy(xpath="//div[@class='cart_quantity']") private List<WebElement> prodQty;
	@FindBy(id="checkout") private WebElement  checkOut;
	
	//Actions
	//get prodsName
	public List<WebElement> getProdname() {
	wait.until(ExpectedConditions.visibilityOfAllElements(prodName));
	return prodName;
	}
			
	//get ProdsQty 	
	public List<WebElement> getProdQty(){
	wait.until(ExpectedConditions.visibilityOfAllElements(prodQty));
	return prodQty ;	
	}
	
	public void clickCheckout() {
	wait.until(ExpectedConditions.visibilityOf(checkOut));
	checkOut.click();
	}
}

