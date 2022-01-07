package com.Automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Single {
	public static WebDriver driver;
	@FindBy(id="selectProductSort")
	private WebElement sing;
	public Single(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getSing() {
		return sing;
	}
	

}
