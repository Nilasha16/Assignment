package ResourcesPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	public WebDriver driver;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
    WebElement webElement = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('login-page').shadowRoot.querySelector('div')");
    
    By username = 	By.name("username");
	By password =   By.name("password");
	
	
	public LogInPage(WebDriver driver2) {
		
		this.driver = driver;
		
		// TODO Auto-generated constructor stub
	}


	public WebElement getUsername()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(password);
		
	}
}
