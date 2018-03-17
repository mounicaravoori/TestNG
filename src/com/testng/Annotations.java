 package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeClass
	public void beforeClass() {
		System.out.println("W=This will be excuted before all methods in java class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("W=This will be excuted after all methods in java class");
	}
	@BeforeMethod
	public void beforeM() {
		System.out.println("I will be executed before every method ");
	}
	@AfterMethod
	public void afterM() {
		System.out.println("I will be executed after every method ");
	}
	@Test
	public void testM1() {
		System.out.println("this is my test method 1");
	}
	@AfterTest
	public void aftertestM() {
		System.out.println("I will be executed before every test");
	}
	@BeforeTest
	public void beforetestM() {
		System.out.println("I will be executed before every test");
	}
	@Test
	public void testM2() {
		System.out.println("this is my test method 2");
	}
	@Test
	public void testM3() {
		System.out.println("this is my test method 3");
	}
	@BeforeSuite
	public void beforesuiteM() {
		System.out.println("I will be executed first ");
	}
	@AfterSuite
	public void aftersuiteM() {
		System.out.println("I will be executed last ");
	}
	
}
