package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
      
	
	@BeforeSuite
    public void bsuit() {
  	  System.out.println("this my before suite");
    }
	@BeforeTest
    public void btest() {
  	  System.out.println("this is my before test");
    }
	@BeforeClass
    public void bclass() {
  	  System.out.println("this is my before class");
    }
	@BeforeMethod
    public void bmethod() {
  	  System.out.println("this is my before method");
    }
	@Parameters({"username1","password1"})
	@Test
    public void login(String username, int password) {
      System.out.println("this is my test1");
      System.out.println(username);
      System.out.println(password);
    }
	@Test
    public void getTitle() {
      System.out.println("this is my test2");
    }
	@AfterSuite
    public void asuit() {
  	  System.out.println("this my after suite");
    }
	@AfterTest
    public void atest() {
  	  System.out.println("this is my after test");
    }
	@AfterClass
    public void aclass() {
  	  System.out.println("this is my after class");
    }
	@AfterMethod
    public void amethod() {
  	  System.out.println("this is my after method");
    }
	
}
