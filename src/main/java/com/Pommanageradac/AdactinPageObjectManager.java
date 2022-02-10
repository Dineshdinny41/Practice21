package com.Pommanageradac;

import org.Adactin.pom.DropDown;
import org.Adactin.pom.Login;
import org.Adactin.pom.RadioButton;
import org.openqa.selenium.WebDriver;

public class AdactinPageObjectManager {
	public WebDriver driver;
	private DropDown dr;
	private Login lo;
	private RadioButton ra;
	
	public AdactinPageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	public DropDown getDropDown() {
		DropDown dr=new DropDown(driver);
		return dr;
		
	}
	public Login getLogin() {
		Login lo= new Login(driver);
		return lo;
	}
	public RadioButton getRadioButton() {
		RadioButton ra = new RadioButton(driver);
		return ra;
	}

}
