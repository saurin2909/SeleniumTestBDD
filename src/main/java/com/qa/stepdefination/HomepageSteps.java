package com.qa.stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomepageSteps extends TestBase{
	
	LoginPage loginpage;
	Homepage homepage;
	
	//WebDriver driver;
	@Given("^User is already on login page$")	
	public void User_is_already_loginpage()
	{		
		  TestBase.initializae_driver();
	}
	
	
	@When("title of login page is Freecrm")
	public void title_of_login_page_is_freecrm() {
		loginpage = new LoginPage();
		String loginerror = loginpage.VeryLoginPageTitler();
	    Assert.assertEquals("Guru99 Bank Home Page", loginerror);
		}
	
	@Then("user enters username and password")
	public void user_enters_username_and_password() {
		homepage = loginpage.Loginprocess(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Then("User is on Home page")
	public void user_is_on_home_page() {
		String loginerror = homepage.VeryHomepageTitler();
	    //String loginerror = driver.switchTo().alert().getText();
	    Assert.assertEquals("User or Password is not valid", loginerror);
	}
	
	@And("Accept alert")
	public void Accept_alert() {
	    driver.switchTo().alert().accept();;
	    driver.quit();
	}

}


