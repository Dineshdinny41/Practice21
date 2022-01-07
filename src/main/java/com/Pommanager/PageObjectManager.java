package com.Pommanager;

import org.openqa.selenium.WebDriver;

import com.Automation.pom.Categories;
import com.Automation.pom.Clicks;
import com.Automation.pom.LoginPage;
import com.Automation.pom.ScrollDown;
import com.Automation.pom.SignUp;
import com.Automation.pom.Single;

public class PageObjectManager {
	public WebDriver driver;
	private Categories ca;
	private Clicks cl;
	private LoginPage lp;
	private ScrollDown scd;
	private SignUp si;
	private Single sin;
	
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		// TODO Auto-generated constructor stub
	}


	public Categories getCategories() {
		Categories ca = new Categories(driver);
		return ca;
	}
	public Clicks getclicks() {
		Clicks cl = new Clicks(driver);
		return cl;
	}
	 public LoginPage getlogin() {
		 LoginPage lp = new LoginPage(driver);
		 return lp;
	 }
	 public ScrollDown getscroll() {
		 ScrollDown scd= new ScrollDown(driver);
		 return scd;
	 }
	 public SignUp getsign() {
		 SignUp si = new SignUp(driver);
		 return si;
	 }
	 public Single getsingle() {
		 Single sin = new Single(driver);
		 return sin;
	 }

}
