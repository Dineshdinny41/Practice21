package org.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	 public static WebDriver driver;
	 @FindBy(id="username")
	 private WebElement a;
	 @FindBy(id="username")
	 private WebElement b;
	 @FindBy(id="password")
	 private WebElement c;
	 @FindBy(id="login")
	 private WebElement d;
	public Login(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getA() {
		return a;
	}
	public WebElement getB() {
		return b;
	}
	public WebElement getC() {
		return c;
	}
	public WebElement getD() {
		return d;
	}

}
