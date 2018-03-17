package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	@BeforeSuite
    public void bsuite() {
    	System.out.println("this is my before suite");
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

	@Test(dataProvider="getData")
    public void geturltitle(String url, String  title) {
      System.out.println("this is my test22");
      System.out.println(url);
      System.out.println(title);
    }
	@DataProvider
	  public Object[][] getData() {
	    	Object[][]  data = new Object[2][2];
	    	data[0][0] = "www.google.com";
	    	data[0][1] = "google";
	    	data[1][0] = "www.gmail.com";
	    	data[1][1] = "gmail";
	    	return data;
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
