package com.Automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clicks {
	public static WebDriver driver;
	@FindBy(xpath ="//a[contains(@class,'ajax_add_to_cart_button ')]")
	private WebElement a;
	@FindBy(xpath ="//a[@title='Proceed to checkout']")
	private WebElement b;
	@FindBy(xpath="(//i[@class=\"icon-chevron-right right\"])[3]")
    private WebElement c;
	@FindBy(name ="processAddress")
	private WebElement d;
	@FindBy(id ="cgv")
	private WebElement e;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement f;
	@FindBy(xpath ="//a[@title='Pay by check.']")
	private WebElement g;
	@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
	private WebElement h;
	public Clicks(WebDriver driver2) {
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
	public WebElement getE() {
		return e;
	}
	public WebElement getF() {
		return f;
	}
	public WebElement getG() {
		return g;
	}
	public WebElement getH() {
		return h;
	}

}
