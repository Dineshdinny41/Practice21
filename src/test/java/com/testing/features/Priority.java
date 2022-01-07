package com.testing.features;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority =-2)
	private void women() {
		System.out.println("women");
		

	}
	@Test(priority=-1)
	private void men() {
		System.out.println("men");
		

	}
	@Test(priority=1)
	private void tshirts() {
		System.out.println("tshirts");
		

	}
	@Test(priority=1)
	private void books() {
		System.out.println("books");
		

	}

}
