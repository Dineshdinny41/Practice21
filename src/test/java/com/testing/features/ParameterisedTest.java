package com.testing.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedTest {
	@Test
	@Parameters({"username","password"})
	private void credentials(String username,String password) {
		System.out.println("Username:"+ username);
		System.out.println("Password:"+ password);

	}

}
