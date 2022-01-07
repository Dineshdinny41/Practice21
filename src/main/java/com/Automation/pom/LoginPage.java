package com.Automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage { 
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement loginbtn;

	

	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
