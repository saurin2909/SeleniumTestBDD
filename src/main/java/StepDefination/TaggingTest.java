package StepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TaggingTest {
	
	WebDriver driver;
	@Given("^User is already on login page$")	
	public void User_is_already_loginpage()
	{		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Devang\\Downloads\\chromedriverNew\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/V4/");	
		  driver.quit();
	}
	
	@Given("^User is already on Contact page$")	
	public void User_is_already_Contactpage()
	{		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Devang\\Downloads\\chromedriverNew\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/V4/");	
		  driver.quit();
	}
	
	@Given("^User is already on Number page$")
	public void User_is_already_Numberpage()
	{		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Devang\\Downloads\\chromedriverNew\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/V4/");	
		  driver.quit();
	}
	
	@Given("^User is already on Log page$")
	public void User_is_already_Logpage()
	{		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Devang\\Downloads\\chromedriverNew\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/V4/");	
		  driver.quit();
	}
	
	
	

}
