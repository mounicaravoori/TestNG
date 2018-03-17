package com.testng;

import java.io.IOException;

import org.testng.annotations.Test;

public class Sample extends DDProperties {

	@Test(groups= {"smoke"})
	public void firstMethod() {
		System.out.println("My first method");
	}
	@Test
	public void secondMethod() {
		System.out.println("My Second method");
	}
	@Test
	public void mobileSignin() throws IOException {
		System.out.println("My mobile signin method");
		credentials();
	}
	@Test
	public void mobileSignout() {
		System.out.println("My mobile signout method");
	}
	
	
}
