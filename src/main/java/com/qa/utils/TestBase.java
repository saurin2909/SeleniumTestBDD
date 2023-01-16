package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class TestBase {

	    protected static WebDriver driver;	
		protected static Properties prop;
		
		public TestBase() 
		{
			prop = new Properties();
				FileInputStream objfile = null;
			try {
				objfile = new FileInputStream("F:\\Saurin\\eclipse_wokspace\\SeleniumTestBDD\\src\\main\\java\\com\\qa\\config\\config.properties"); //
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				try {
				prop.load(objfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void initializae_driver() 
		{	
			String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Devang\\Downloads\\chromedriverNew\\chromedriver.exe"); //
				driver = new ChromeDriver();
			}
			else if(browserName.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver",""); //
				driver = new FirefoxDriver();	
			}
		
	    driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));//
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		System.out.print("Samo");
		}

}


