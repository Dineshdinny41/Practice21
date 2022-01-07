package com.AutomationPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Automation.pom.Categories;
import com.Automation.pom.Clicks;
import com.Automation.pom.LoginPage;
import com.Automation.pom.ScrollDown;
import com.Automation.pom.SignUp;
import com.Automation.pom.Single;
import com.Pommanager.PageObjectManager;
import com.file.reader.FileReaderManager;

public class Outputpart extends BaseClass {
	public static WebDriver driver= BaseClass.launchbrowser("chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static void main(String[] args) throws InterruptedException, IOException {
		    
			geturl(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
			Thread.sleep(3000);
			signin( pom.getlogin().getLoginbtn());
			signup1(pom.getsign().getMail(), "mail", FileReaderManager.getInstanceFRM().getInstanceCR().getUsername());
			signup1(pom.getsign().getPass(), "password", FileReaderManager.getInstanceFRM().getInstanceCR().getpassword());
			click(pom.getsign().getLogin());	
			action(pom.getCategories().getWomen(), "move");
			action(pom.getCategories().getCasual(), "click");
			action(pom.getCategories().getRadio(),"radio");
			scroll(pom.getscroll().getDow(), "down");
			scroll(pom.getscroll().getUpp(), "up");
			dropdown(pom.getsingle().getSing(), "index", "4");
			procced(pom.getclicks().getA(), "click");
			procced(pom.getclicks().getB(), "click1");
			procced(pom.getclicks().getC(), "click2");
			procced(pom.getclicks().getD(), "click3");
			procced(pom.getclicks().getE(), "click4");
			procced(pom.getclicks().getF(), "click5");
			procced(pom.getclicks().getG(), "click6");
			procced(pom.getclicks().getH(), "click7");
			gettext();
	}

}
