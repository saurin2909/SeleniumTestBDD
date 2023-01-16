package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pswd;
	
	
	//Locating Login Button
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	
	
	//initializing page factory
	public LoginPage() {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public String VeryLoginPageTitler() {
		return driver.getTitle();
		}
	
	public Homepage Loginprocess(String arg1 , String arg2) {
		username.sendKeys(arg1);
		pswd.sendKeys(arg2);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		  
		return new Homepage();
		}

	
		}
		
	

