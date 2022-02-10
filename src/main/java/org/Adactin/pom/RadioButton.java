package org.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton {
	public static WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement a2;
	@FindBy(id="continue")
	private WebElement b2;
	@FindBy(id="first_name")
	private WebElement c2;
	@FindBy(id="last_name")
	private WebElement d2;
	@FindBy(id="address")
	private WebElement e2;
	@FindBy(id="cc_num")
	private WebElement f2;
	@FindBy(id="cc_type")
	private WebElement g2;
	@FindBy(id="cc_exp_month")
	private WebElement h2;
	@FindBy(id="cc_exp_year")
	private WebElement i2;
	@FindBy(id="cc_cvv")
	private WebElement j2;
	@FindBy(id="book_now")
	private WebElement k2;
	public RadioButton(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getA2() {
		return a2;
	}
	public WebElement getB2() {
		return b2;
	}
	public WebElement getC2() {
		return c2;
	}
	public WebElement getD2() {
		return d2;
	}
	public WebElement getE2() {
		return e2;
	}
	public WebElement getF2() {
		return f2;
	}
	public WebElement getG2() {
		return g2;
	}
	public WebElement getH2() {
		return h2;
	}
	public WebElement getI2() {
		return i2;
	}
	public WebElement getJ2() {
		return j2;
	}
	public WebElement getK2() {
		return k2;
	}
	

}
