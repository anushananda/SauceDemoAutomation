package com.saucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckoutComplete {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public CheckoutComplete(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	//Elements 
	@FindBy(xpath="//div[@class='summary_subtotal_label']") WebElement subTotal;
	@FindBy(xpath="//div[@class='summary_tax_label']") WebElement tax;
	@FindBy(xpath="//div[@class='summary_total_label']") WebElement total;
	@FindBy(xpath="//button[@id='finish']") WebElement finish;
	
	//Methods
	public double getSubtotal() {
		wait.until(ExpectedConditions.visibilityOf(subTotal));
		double subTotAmt= Double.parseDouble(subTotal.getText().replaceAll("[^0-9.]", ""));
		return subTotAmt;
	}
		public double getTax() {
			wait.until(ExpectedConditions.visibilityOf(tax));
			double taxAmt= Double.parseDouble(tax.getText().replaceAll("[^0-9.]", ""));
			return taxAmt;
		}
		public double getTotal() {
			wait.until(ExpectedConditions.visibilityOf(total));
			double totAmt=Double.parseDouble(total.getText().replaceAll("[^0-9.]", ""));
			return totAmt;
		}
		
		
		public void clickFinish() {
		wait.until(ExpectedConditions.visibilityOf(finish));
		finish.click();
		
	}
	
	
	
	
	
}
