package ResourcesPageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

JavascriptExecutor js = (JavascriptExecutor)driver;
public class SecondPageObjects {

	
	private static WebElement searchStartDate =  null;
	
	
	public static WebElement searchSDate(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement searchStartDate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
        
		return searchStartDate;
				
	}
	
	public static WebElement searchEDate(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement searchEndDate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[1].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
	 return searchEndDate;
	
	}
	
	
	
	}
	
	
	
