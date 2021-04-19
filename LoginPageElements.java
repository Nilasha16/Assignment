package MyMavenProject.Mymavenassignment;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.jar.*;

public class LoginPageElements {
	private static WebDriver _driver;
	   JavascriptExecutor js = (JavascriptExecutor)_driver;
	  
	   
	   public WebElement username = _driver.findElement(By.name("demo"));
	   public WebElement password = _driver.findElement(By.name("demo"));
	   public WebElement loginBtn = _driver.findElement(By.id("button"));
	   public WebElement SearchFilter = _driver.findElement(By.id("search-filters"));
	   
       
       
	    public LoginPageElements(WebDriver driver)
	    {
	        _driver = driver;
	    }

}
