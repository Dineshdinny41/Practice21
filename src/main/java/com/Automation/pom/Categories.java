package com.Automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categories {
	public static WebDriver driver;
	 @FindBy(xpath = "//a[@title='Women']")
	 private WebElement women;
	 @FindBy(xpath ="//a[@title='Evening Dresses']")
	 private WebElement casual;
	 @FindBy(id ="layered_id_attribute_group_2")
	 private WebElement radio;
	public Categories(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getCasual() {
		return casual;
	}
	public WebElement getRadio() {
		return radio;
	}

}
