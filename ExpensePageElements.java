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


public class ExpensePageElements {
	private static WebDriver _driver;

    public static JavascriptExecutor js = (JavascriptExecutor)_driver;
    public static WebElement pageverification = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > filters-toolbar\").shadowRoot.querySelector(\"#filters\").shadowRoot.querySelector(\"div\")");
    
    
	public static WebElement searchStartDate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
	public static WebElement searchEndDate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[1].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
	public static List<WebElement> options = (List<WebElement>) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelector('option-group').shadowRoot.querySelectorAll('vaadin-checkbox')");
	    
    public static WebElement we = (WebElement)js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('app-header-layout > div > content-panel').shadowRoot.querySelector('expenses-list').shadowRoot.querySelector('paper-icon-button-light').querySelector('button')");
    public static WebElement wd = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"#form > vaadin-combo-box\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#vaadin-text-field-input-7 > slot:nth-child(2) > input\")");
    public static WebElement totalm = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"#form > vaadin-text-field\").shadowRoot.querySelector(\"#vaadin-text-field-input-8 > slot:nth-child(2) > input\")");
    public static WebElement selectdate = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"#form > vaadin-date-picker\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#vaadin-text-field-input-9 > slot:nth-child(2) > input\")");
    public static WebElement save = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"div.buttons > vaadin-button.save-button\").shadowRoot.querySelector(\"#button\")");
	   
    public static WebElement fromdate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
    public static WebElement todate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
    
    
    public static WebElement ClearFilterbtn  = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > filters-toolbar\").shadowRoot.querySelector(\"#filters\").shadowRoot.querySelector(\"div > div.title.section-title > vaadin-button\").shadowRoot.querySelector(\"#button\")");
    public static WebElement ramount = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > content-panel\").shadowRoot.querySelector(\"history-panel\").shadowRoot.querySelector(\"div > div > span\")");
    public static WebElement tbody = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > content-panel\").shadowRoot.querySelector(\"expenses-list\").shadowRoot.querySelector(\"#expenses\").shadowRoot.querySelector(\"#items\")");
    public static WebElement table = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > content-panel\").shadowRoot.querySelector(\"expenses-list\").shadowRoot.querySelector(\"#expenses\").shadowRoot.querySelector(\"#table\")");
    String rcount = table.getAttribute("aria-rowcount");
    int rowcount = Integer.parseInt(rcount);

    public ExpensePageElements(WebDriver driver)
	    {
	        _driver = driver;
	    }

}
