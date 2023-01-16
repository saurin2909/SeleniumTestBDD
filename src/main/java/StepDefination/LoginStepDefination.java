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

public class LoginStepDefination {
	
	WebDriver driver;
	@Given("^User is already on login page$")
	
	public void User_is_already_loginpage()
	{		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Devang\\Downloads\\chromedriverNew\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/V4/");	
	}
	
	
	@When("title of login page is Freecrm")
	public void title_of_login_page_is_freecrm() {
	    String title = driver.getTitle();
	    Assert.assertEquals("Guru99 Bank Home Page", title);
	   	}
	
	/*@Then("user enters username and password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.name("uid")).sendKeys("Test");;
	    driver.findElement(By.name("password")).sendKeys("123");    
	}*/
	
	//@Then("user enters \"(.*)\" and \"(.*)\"$")
//		@Then("^user enters ([^\"]*) and ([^\"]*)$")
	/*public void user_enters_username_and_password(String Username , String Password)
	{
	    driver.findElement(By.name("uid")).sendKeys(Username);;
	    driver.findElement(By.name("password")).sendKeys(Password);    
	}*/
	
	///With list datatable in cucumber
	/*@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) throws Throwable
	{
		List<String> data = credentials.row(1);
		
	    driver.findElement(By.name("uid")).sendKeys(data.get(0));
	    driver.findElement(By.name("password")).sendKeys(data.get(1));    
	}*/
	
	/*With Map in cucumber
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) throws Throwable
	{
		for(Map<String,String> data : credentials.asMaps(String.class, String.class))
		{
	    driver.findElement(By.name("uid")).sendKeys(data.get("username"));
	    driver.findElement(By.name("password")).sendKeys(data.get("password"));    
	}
	}*/
	
	
	
	@Then("User clicks on login page")
	public void user_clicks_on_login_page() {
		driver.findElement(By.name("btnLogin")).click();
	    
	}
	
	@Then("^Then display ([^\"]*) page$")
	public void user_enters_value(String a)
	{
	    System.out.println(a);    
	}
	
	@Then("User is on Home page")
	public void user_is_on_home_page() {
	    String loginerror = driver.switchTo().alert().getText();
	    Assert.assertEquals("User or Password is not valid", loginerror);
	}
	
	@And("Accept alert")
	public void Accept_alert() {
	    driver.switchTo().alert().accept();
	    driver.quit();
	}

}


