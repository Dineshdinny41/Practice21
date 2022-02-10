package com.AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	public static WebDriver driver;
	public static  WebDriver launchbrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivernew\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir")+"\\Drivernew\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
		
	}
	public static void geturl(String url) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void signin(WebElement element) {
		
		element.click();

}
	public static void signup1(WebElement element,String option, String words) {
		if(option.equalsIgnoreCase("mail")) {
			element.sendKeys(words);
		}
		else if(option.equalsIgnoreCase("password")){
			element.sendKeys(words);
		}
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void dropdown(WebElement element, String option , String value) {
		Select s= new Select(element);
		if(option.equalsIgnoreCase("index")) {
			int index= Integer.parseInt(value);
			s.selectByIndex(index);
		}
		else if(option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if(option.equalsIgnoreCase("text")){
			s.selectByVisibleText(value);
		}
	}
	
	public static void datesender(WebElement element1, String msg ,String option1) {
		if(option1.equalsIgnoreCase("one")){
			element1.clear();
			element1.sendKeys(msg);
		}
		else if(option1.equalsIgnoreCase("two")) {
			element1.clear();
			element1.sendKeys(msg);
		}
	}
	public static void drop(WebElement element, String option , String value) {
		Select s= new Select(element);
		if(option.equalsIgnoreCase("index")) {
			int index= Integer.parseInt(value);
			s.selectByIndex(index);
		}
		else if(option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if(option.equalsIgnoreCase("text")){
			s.selectByVisibleText(value);
		}
	}
	public static void searchclick(WebElement element) {
		element.click();
	}
	public static void radd(WebElement element , String option) {
		if(option.equalsIgnoreCase("radio")) {
			element.click();
		}
		else if(option.equalsIgnoreCase("click")) {
			element.click();
		}
		else if(option.equalsIgnoreCase("booknow")) {
			element.click();
		}
	}
	public static void fillupss(WebElement element , String details, String options) {
		if(options.equalsIgnoreCase("firstname")) {
		element.sendKeys(details);
	}
	else if(options.equalsIgnoreCase("lastname")){
		element.sendKeys(details);
	}
	else if(options.equalsIgnoreCase("billingaddreess")) {
		element.sendKeys(details);
	}
	else if(options.equalsIgnoreCase("creditcard")) {
		element.sendKeys(details);
	}
	else if(options.equalsIgnoreCase("creditcard")) {
		element.sendKeys(details);
	}
	else if(options.equalsIgnoreCase("cvv")) {
		element.sendKeys(details);
	}
	}
	public static void drop1(WebElement element, String option , String value) {
		Select s= new Select(element);
		if(option.equalsIgnoreCase("index")) {
			int index= Integer.parseInt(value);
			s.selectByIndex(index);
		}
		else if(option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if(option.equalsIgnoreCase("text")){
			s.selectByVisibleText(value);
		}
	}
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
