package MyMavenProject.Mymavenassignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BClass {

	private static WebDriver _driver;
	public static void getLoginPage() throws Exception
	{
	String browser="Chrome";
	if(browser=="Chrome")
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Program Files (x86)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://expensemanager.demo.vaadin.com/login");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	WebElement loginBtnn = (WebElement) js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > login-page\").shadowRoot.querySelector(\"div > div.login > vaadin-button\").shadowRoot.querySelector(\"#button\")");
	// now you can click on clear data button
	loginBtnn.click();
	

    }
    
	if(browser=="Other")
	{
		//It can be used for other browsers
	}
	}
	
	 public BClass(WebDriver driver)
	    {
	        _driver = driver;
	    }
}
