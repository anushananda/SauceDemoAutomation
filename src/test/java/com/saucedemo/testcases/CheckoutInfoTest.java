package com.saucedemo.testcases;

import org.testng.annotations.Test;

import com.saucedemo.base.Base;
import com.saucedemo.pages.CheckoutInfo;

public class CheckoutInfoTest extends Base {
	
  @Test
  public void userCheckoutInfo() {
	  CheckoutInfo userInfo=new CheckoutInfo(driver);
	  userInfo.addUserInfo("John", "Doe", "12345");
	  
	  userInfo.finalCheckout();	  
  }
}
