package com.testing.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	@BeforeSuite
	private void setProperty() {
		System.out.println("before suite");
	}
	@BeforeTest
	private void url() {
		System.out.println("url");
	}
	@BeforeClass
	private void SigninBtn() {
		System.out.println("button click");
	}
	@BeforeMethod
	private void signIn() {
		System.out.println("used signed in");
		
	}
	@Test
	private void dresses() {
		System.out.println("Dresses");
	}
	@Test
	private void women() {
		System.out.println("casual dresses");
	}
	@AfterMethod
	private void signOut() {
		System.out.println("signout");
	}
	@AfterClass
	private void HomePage() {
		System.out.println("after class");
	}
	@AfterTest
	private void closeBrowser() {
		System.out.println("after test");
	}
	@AfterSuite
	private void deletecookies() {
		System.out.println("after suite");
	}

}
