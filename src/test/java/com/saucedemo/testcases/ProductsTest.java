package com.saucedemo.testcases;

import org.testng.annotations.Test;
import com.saucedemo.base.Base;
import com.saucedemo.pages.Products;

public class ProductsTest extends Base {
	
//WebDriver driver;
  @Test
  public void addToCart() {
	  Products addprod = new Products(driver);
	  addprod.clickProducts();  
	  addprod.clickCart();
  }
}
