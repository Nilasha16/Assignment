package MyMavenProject.Mymavenassignment;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import ResourcesPageObject.LogInPage;

public class HomePage extends BaseClassF {

	@Test
	
	public void homepagenavigation() throws IOException
	
	{
		driver = initializeDriver();
		driver.get("https://expensemanager.demo.vaadin.com/login");
		LogInPage l = new LogInPage(driver);
		
		l.getUsername().sendKeys("demo", Keys.ENTER);
		l.getPassword().sendKeys("demo", Keys.ENTER);
		l.getLogin().click();
		
		
		
	}
}
