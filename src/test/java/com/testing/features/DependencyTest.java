package com.testing.features;

import org.testng.annotations.Test;

import com.Automation.pom.LoginPage;

public class DependencyTest {
	@Test(groups="loginpage")
	private void browserlaunch() {
		System.out.println("browserlaunch");
		

	}
	@Test(groups="loginpage")
	private void urll() {
	System.out.println("url");

	}
	@Test(dependsOnGroups="loginpage")
	private void homepage() {
		System.out.println("homepage");

	}
	@Test(dependsOnMethods="homepage")
	private void LoginPage() {
		System.out.println("loginpage");

	}

}
