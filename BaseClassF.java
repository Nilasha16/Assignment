package MyMavenProject.Mymavenassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassF {
	
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException  {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Nilasha Singh\\eclipse-workspace\\Mymavenassignment\\src\\main\\java\\MyMavenProject\\Mymavenassignment\\data.properties");
		
		prop.load(fis);
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\chromedriver.exe");
	        driver = new ChromeDriver();
		}
		
		else if (browsername.equals("IE)"))	
			
		{
			System.out.println("Browser not supported");
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}
}
