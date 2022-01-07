package com.testing.features;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="shopping")
	private void amazon() {
		System.out.println("amazon");
		

	}
	@Test(groups="shopping")
	private void flipkart() {
		System.out.println("flipkart");
		

	}
	@Test(groups="shopping")
	private void myntra() {
		System.out.println("myntra");
	

	}
	@Test(groups="social media")
	private void Whatsapp() {
		System.out.println("whatsapp");


	}
	
	@Test(groups="social media")
	private void instagram() {
	System.out.println("instagram");

	}
	

}
