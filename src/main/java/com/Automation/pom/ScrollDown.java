package com.Automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollDown {
	public static WebDriver driver;
	@FindBy(xpath="//div[@class='rte']")
	private WebElement dow;
	@FindBy(xpath="(//div[@class='product-count'])[2]")
	private WebElement upp;
	public ScrollDown(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getDow() {
		return dow;
	}
	public WebElement getUpp() {
		return upp;
	}

}
