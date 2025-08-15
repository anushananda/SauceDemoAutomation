package com.saucedemo.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.base.Base;
import com.saucedemo.pages.Cart;

public class CartTest extends Base{
  @Test
  public void CartItems() {
	  
	  Cart cartPage = new Cart(driver);
	  
	//Expected prod name and qty
		String[] expectedProdName= {"Sauce Labs Backpack", "Sauce Labs Bolt T-Shirt"};
		String[] expectedProdQty = {"1", "1"};
		
		List<WebElement> prodNameList= cartPage.getProdname();
		List<WebElement> prodQtyList =  cartPage.getProdQty();
	  
		//Assert	
		for(int i=0; i<expectedProdName.length; i++) {
//			String actualProdName = prodName.get(i).getText().trim();
//			String actualProdQty =  prodQty.get(i).getText().trim();
			
			Assert.assertEquals(prodNameList.get(i).getText().trim(), expectedProdName[i],"Product mismatched" + prodNameList.get(i).getText().trim());
			Assert.assertEquals(prodQtyList.get(i).getText().trim(), expectedProdQty[i],"Qty Mismatched" + prodQtyList.get(i).getText().trim());
		} 

		cartPage.clickCheckout();
  }
}
