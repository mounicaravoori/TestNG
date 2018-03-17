package com.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DDProperties {
	
	//variable initialization
	public WebDriver driver=null;	
	@Test
	public void credentials() throws IOException {
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Mona\\eclipse-workspace\\TestngPractice\\src\\com\\testng\\datadriven.properties");
		prop.load(fis);
		//System.out.println("the username from DD file is "+prop.getProperty("username"));
		//System.out.println("the password from DD file is "+prop.getProperty("password"));
		//System.out.println("the url from DD file is "+prop.getProperty("url"));
		
	//steps to invoke a browser using selenium
		if(prop.getProperty("browser").equals("firefox")){
	        driver = new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		       driver = new ChromeDriver();
		      
	    }
		else {
	        driver = new InternetExplorerDriver();
		}
		//navigating to webpage
		driver.get(prop.getProperty("url"));
		
   }
}
