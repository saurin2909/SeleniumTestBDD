package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

import junit.framework.Assert;

public class Homepage extends TestBase{
	
	@FindBy(id="username")
	WebElement next1;
	
	@FindBy(id="password")
	WebElement next2;
	
	//Locating Login Button
	@FindBy(xpath="login")
	WebElement nextbutton;
	
	//initializing page factory
	public Homepage() {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public String VeryHomepageTitler() {
		return driver.switchTo().alert().getText();
	    }
	}


