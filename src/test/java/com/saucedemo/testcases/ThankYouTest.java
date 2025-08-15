package com.saucedemo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.base.Base;
import com.saucedemo.pages.ThankYou;

public class ThankYouTest extends Base{
  @Test
  public void validateOrderConfirm() {
	  ThankYou msgThnx=new ThankYou(driver);
	  String actualMsg= msgThnx.thxMsg();
	  String expectedMsg = "Thank you for your order!";	
	  
	  Assert.assertEquals(actualMsg, expectedMsg , "Thank you Message does not match.");
	  msgThnx.orderConfirm();
  }
}
