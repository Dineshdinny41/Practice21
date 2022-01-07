package com.Automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement mail;
	@FindBy(id="passwd")
	private WebElement pass;
	@FindBy(id="SubmitLogin")
	private WebElement login;
	public SignUp(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}

}
