package com.saucedemo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.base.Base;
import com.saucedemo.pages.Login;



public class LoginTest extends Base{
	
  @Test
  public void vLogin() {
	  //Assert/validation after login 
	  String actualUrl= driver.getCurrentUrl();
	  Assert.assertTrue(actualUrl.contains("/inventory.html"), "Page has not redirected correctly");    
  }
}
