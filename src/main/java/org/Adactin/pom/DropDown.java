package org.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDown {
public static WebDriver driver;
@FindBy(id="location")
private WebElement a1;
@FindBy(id="hotels")
private WebElement b1;
@FindBy(name="room_type")
private WebElement c1;
@FindBy(id="room_nos")
private WebElement d1;
@FindBy(id="datepick_in")
private WebElement e1;
@FindBy(name="datepick_out")
private WebElement f1;
@FindBy(id="adult_room")
private WebElement g1;
@FindBy(id="child_room")
private WebElement h1;
@FindBy(id="Submit")
private WebElement i1;
public DropDown(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}
public static WebDriver getDriver() {
	return driver;
}
public WebElement getA1() {
	return a1;
}
public WebElement getB1() {
	return b1;
}
public WebElement getC1() {
	return c1;
}
public WebElement getD1() {
	return d1;
}
public WebElement getE1() {
	return e1;
}
public WebElement getF1() {
	return f1;
}
public WebElement getG1() {
	return g1;
}
public WebElement getH1() {
	return h1;
}
public WebElement getI1() {
	return i1;
}

}
