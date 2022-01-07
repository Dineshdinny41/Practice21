import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MiniProject {

	public static WebDriver driver;
	@BeforeMethod
	private  void launchbrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
	}
	public static void geturl(String url) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void signin(WebElement element) {
		
		element.click();

}
	@Test
	private void signup1(WebElement element,String option, String words) {
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
	public static void action(WebElement element,String options) {
		Actions act = new Actions(driver);
		if(options.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
		}
		else if (options.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		}
		else if(options.equalsIgnoreCase("radio")) {
			act.click(element).build().perform();
		}
		
	}
	public static void scroll(WebElement element,String option) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		if(option.equalsIgnoreCase("down")) {
		js.executeScript("arguments[0].scrollIntoView();", element);
		}
		else if(option.equalsIgnoreCase("up")) {
		js.executeScript("arguments[0].scrollIntoView();", element);
		}
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
		public static void procced(WebElement element, String option) {
			if(option.equalsIgnoreCase("click")) {
				element.click();
			}
			else if(option.equalsIgnoreCase("click1")) {
				element.click();
			}
			else if(option.equalsIgnoreCase("click2")) {
				element.click();
			}
			else if(option.equalsIgnoreCase("click3")) {
				element.click();
			}
			else if(option.equalsIgnoreCase("click4")) {
				element.click();
			}
			else if(option.equalsIgnoreCase("click5")) {
				element.click();
			}
			else if(option.equalsIgnoreCase("click6")) {
				element.click();
			}
			else if(option.equalsIgnoreCase("click7")) {
				element.click();
				
			}
		}
		@AfterMethod
		private void gettext() {
			 String text =driver.getTitle();
			 System.out.println(text);
		}
		
}
	

