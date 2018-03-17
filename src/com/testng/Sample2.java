package com.testng;

import org.testng.annotations.Test;

public class Sample2 {

	@Test
	public void thirdMethod() {
		System.out.println("My third method");
	}
	@Test
	public void fourthMethod() {
		System.out.println("My fourth method");
	}
	@Test(groups= {"smoke"})
	public void apione() {
		System.out.println("My API one method");
	}
	@Test
	public void apitwo() {
		System.out.println("My API second method");
	}
}
