package com.saucedemo.base;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.saucedemo.pages.Login;




public class Base {
	protected static WebDriver driver;
	
	String path = "D:\\All_Material_selenium\\Automation\\Drivers\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe";
	String url= "https://www.saucedemo.com";
	
	
	@BeforeSuite
	public void setupLogin() {
	System.setProperty("webdriver.firefox.driver", path);
	driver = new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//login once
	Login userlogin =new Login(driver);
	userlogin.flogin("standard_user", "secret_sauce");
  }
  
  
	 @AfterSuite
	 public void closeBrowser() {
	 if(driver !=null) {
	 driver.quit(); 
	 }
 }
}
