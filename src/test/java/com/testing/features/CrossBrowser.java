package com.testing.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	public static WebDriver driver;
	@Test
	@Parameters({"browsername"})
	private void browserlaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://www.google.co.in/");

	}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://www.amazon.in/");
			
		}
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
	}
	

}
