package com.testing.features;

import java.net.URL;

import org.testng.annotations.Test;

public class TimesOut {
	@Test(timeOut=3000)
	private void browserlaunch() {
		System.out.println("browserlaunch");
		
	}
	@Test
	private void urrl() {
		System.out.println("url");
		

	}
	@Test(timeOut=3000)
	private void login() {
		System.out.println("login");
	

	}

}
