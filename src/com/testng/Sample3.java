package com.testng;

import org.testng.annotations.Test;

public class Sample3 {
	//if i want to run sixthmethod before fifth method them am using depsOnMethod keyword
	@Test(dependsOnMethods= {"sixthMethod"})
	public void fifthMethod() {
		System.out.println("My fifth method");
	}
	@Test(timeOut=4000)
	public void sixthMethod() {
		System.out.println("My sixth method");
	}

}
