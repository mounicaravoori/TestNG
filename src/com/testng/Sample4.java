package com.testng;

import org.testng.annotations.Test;

public class Sample4 {

	@Test
	public void seventhMethod() {
		System.out.println("My seventh method");
	}
	@Test
	public void eightMethod() {
		System.out.println("My eighth method");
	}
	@Test
	public void apithree() {
		System.out.println("My API third method");
	}
	@Test(groups= {"smoke"})
	public void apifour() {
		System.out.println("My API fourth method");
	}
}
