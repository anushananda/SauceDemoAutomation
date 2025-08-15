package com.saucedemo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.saucedemo.base.Base;
import com.saucedemo.pages.CheckoutComplete;

public class CheckoutCompleteTest extends Base{
  @Test
  public void validateCartAmount() {
	  
	  SoftAssert softAssert = new SoftAssert();
	  
	  CheckoutComplete checkoutTotal=new CheckoutComplete(driver);
	  double subtotAmt = checkoutTotal.getSubtotal();
	  double taxAmt = checkoutTotal.getTax();
	  double actualtotAmt = checkoutTotal.getTotal();
	  double expectedSumTotal = subtotAmt + taxAmt;
	  
	
	  softAssert.assertTrue(subtotAmt>0, "Subtotal Amount is not Displayed");
	  softAssert.assertTrue(taxAmt>0, "Tax amount is not Displaying");
	  softAssert.assertTrue(actualtotAmt>0, "Total Amount is not displaying");
	  softAssert.assertEquals(actualtotAmt, expectedSumTotal, "Total is not correct." + expectedSumTotal);
	  
	  	  
	  checkoutTotal.clickFinish();
	  
	  softAssert.assertAll();
  }
}
