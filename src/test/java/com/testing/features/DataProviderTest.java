package com.testing.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider="testData")
	private void credentials(String username, int password) {
		System.out.println("Username:"+ username);
		System.out.println("Password:"+ password);
	}
	@DataProvider
	private Object[][] testData(){
		return new Object[][] {
			{"abc",123},{"Hello123",345644},{"thursday",3812}
			
		};
	}

}
