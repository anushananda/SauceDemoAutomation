package com.saucedemo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.base.Base;
import com.saucedemo.pages.Menu;

public class MenuTest extends Base{
  @Test
  public void validateLogHome() {
	  Menu mclick=new Menu(driver);
	  mclick.clickMenuButton();
	  mclick.clickLogout();
	  	  
	  //Assert
	  String actualUrl= driver.getCurrentUrl();
	  Assert.assertTrue(actualUrl.contains("saucedemo.com/"), "The user is not on login page");   
  }
}
