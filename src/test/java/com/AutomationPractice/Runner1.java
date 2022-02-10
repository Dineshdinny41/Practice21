package com.AutomationPractice;

import java.io.IOException;

import org.Adactin.pom.DropDown;
import org.Adactin.pom.Login;
import org.Adactin.pom.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Automation.pom.LoginPage;
import com.Pommanager.PageObjectManager;
import com.Pommanageradac.AdactinPageObjectManager;
import com.file.reader.FileReaderManager1;

public class Runner1 extends BaseClass1 {
	public static WebDriver driver= BaseClass1.launchbrowser("chrome"); 
	
	public static AdactinPageObjectManager pom = new AdactinPageObjectManager(driver);
	public static void main(String[] args) throws IOException {
		
		geturl(FileReaderManager1.getInstanceFRM().getInstanceCR().geturl());
		signin(pom.getLogin().getA());
		signup1(pom.getLogin().getB(), "mail", FileReaderManager1.getInstanceFRM().getInstanceCR().getusername());
		signup1(pom.getLogin().getC(), "password", FileReaderManager1.getInstanceFRM().getInstanceCR().getpassword());
		click(pom.getLogin().getD());
		dropdown(pom.getDropDown().getA1(), "index", "5");
		dropdown(pom.getDropDown().getB1(), "value", "Hotel Hervey");
		dropdown(pom.getDropDown().getC1(), "text", "Double");
		dropdown(pom.getDropDown().getD1(), "index", "6");
		datesender(pom.getDropDown().getE1(), "25/01/2022", "one");	
		datesender(pom.getDropDown().getF1(), "27/01/2022", "two");
		drop(pom.getDropDown().getG1(), "index", "2");
	    dropdown(pom.getDropDown().getH1(), "value", "2");
	    searchclick(pom.getDropDown().getI1());
	    radd(pom.getRadioButton().getA2(), "radio");
	    radd(pom.getRadioButton().getB2(), "click");
	    fillupss(pom.getRadioButton().getC2(), "Dinesh", "firstname");
	    fillupss(pom.getRadioButton().getD2(), "manoharan", "lastname");
	    fillupss(pom.getRadioButton().getE2(), "no:88/4 west mada street,chennai- 122", "billingaddreess");
	    fillupss(pom.getRadioButton().getF2(), "0123456789012345", "creditcard");
	    drop1(pom.getRadioButton().getG2(), "index", "3");
	    drop1(pom.getRadioButton().getH2(), "value", "4");
	    drop1(pom.getRadioButton().getI2(), "text", "2022");
	    fillupss(pom.getRadioButton().getJ2(), "678", "cvv");
	    radd(pom.getRadioButton().getK2(), "booknow");
	    
	}

}
