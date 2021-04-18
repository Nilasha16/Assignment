package ResourcesPageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

JavascriptExecutor js = (JavascriptExecutor)driver;
public class SecondPageObjects {

	
	

	   private static WebDriver _driver;

       JavascriptExecutor js = (JavascriptExecutor)_driver;
	   WebElement searchStartDate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
       WebElement searchEndDate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[1].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
       List<WebElement> options = (List<WebElement>) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelector('option-group').shadowRoot.querySelectorAll('vaadin-checkbox')");
	    
       WebElement we = (WebElement)js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('app-header-layout > div > content-panel').shadowRoot.querySelector('expenses-list').shadowRoot.querySelector('paper-icon-button-light').querySelector('button')");
       WebElement wd = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"#form > vaadin-combo-box\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#vaadin-text-field-input-7 > slot:nth-child(2) > input\")");
       WebElement totalm = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"#form > vaadin-text-field\").shadowRoot.querySelector(\"#vaadin-text-field-input-8 > slot:nth-child(2) > input\")");
       WebElement selectdate = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"#form > vaadin-date-picker\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#vaadin-text-field-input-9 > slot:nth-child(2) > input\")");
       WebElement save = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"div.buttons > vaadin-button.save-button\").shadowRoot.querySelector(\"#button\")");
	   
       WebElement fromdate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
       WebElement todate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
       
       
       WebElement ClearFilterbtn  = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > filters-toolbar\").shadowRoot.querySelector(\"#filters\").shadowRoot.querySelector(\"div > div.title.section-title > vaadin-button\").shadowRoot.querySelector(\"#button\")");
       WebElement ramount = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > content-panel\").shadowRoot.querySelector(\"history-panel\").shadowRoot.querySelector(\"div > div > span\")");
      
       WebElement table = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > content-panel\").shadowRoot.querySelector(\"expenses-list\").shadowRoot.querySelector(\"#expenses\").shadowRoot.querySelector(\"#table\")");
       String rcount = table.getAttribute("aria-rowcount");
       int rowcount = Integer.parseInt(rcount);

       public ExpneseManagerPageElements(WebDriver driver)
	    {
	        _driver = driver;
	    }
	}
	
	
	
