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

	public class trial {
	    public static void main(String[] args) throws InterruptedException {
	    	
	    	
	    	
	    	//First and Second Case - Navigate to the Url : https://expensemanager.demo.vaadin.com
	    	//Login to the system with UserName/Password:demo/demo
	    	
	        System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://expensemanager.demo.vaadin.com/login");
	        driver.manage().window().maximize();
	        Thread.sleep(5000);
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        WebElement webElement = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('login-page').shadowRoot.querySelector('div')");
	        WebElement username = webElement.findElement(By.name("username"));
	        WebElement password = webElement.findElement(By.name("password"));
	        WebElement loginBtn = webElement.findElement(By.tagName("vaadin-button"));
	        //username.clear();
	        //password.clear();
	        username.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	        password.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));

	        username.sendKeys("demo");
	        password.sendKeys("demo");
	        loginBtn.click();
	        Thread.sleep(5000);
	         
	      
	        
	        //==========================================================
	        //3rd Case - Find the number of records returned for the expense for Breakfast for the month of Feb,2021 with the status "New".
	       
	        WebElement searchStartDate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
	        WebElement searchEndDate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[1].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
	        List<WebElement> options = (List<WebElement>) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelector('option-group').shadowRoot.querySelectorAll('vaadin-checkbox')");
	        searchStartDate.sendKeys("2/1/2021", Keys.ENTER);
	        searchEndDate.sendKeys("2/28/2021", Keys.ENTER);
	      //to un-select all options
	        for(WebElement opt : options){
	            opt.click();
	        }
	        options.get(0).click();
	       
	       
	        
	        //========================================================
	        //4th = Add a new expense of $100 for "Breakfast" on Feb 10,2021.
	        
	        WebElement we = (WebElement)js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('app-header-layout > div > content-panel').shadowRoot.querySelector('expenses-list').shadowRoot.querySelector('paper-icon-button-light').querySelector('button')");
	        we.click();
	        WebElement wd = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"#form > vaadin-combo-box\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#vaadin-text-field-input-7 > slot:nth-child(2) > input\")");
	        WebElement totalm = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"#form > vaadin-text-field\").shadowRoot.querySelector(\"#vaadin-text-field-input-8 > slot:nth-child(2) > input\")");
	        WebElement selectdate = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"#form > vaadin-date-picker\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#vaadin-text-field-input-9 > slot:nth-child(2) > input\")");
	   
	        wd.sendKeys("Breakfast", Keys.ENTER);
	        totalm.sendKeys("100", Keys.ENTER);
	        selectdate.sendKeys("2/10/2021", Keys.ENTER);
	        WebElement save = (WebElement)js.executeScript("return document.querySelector(\"#overlay\").shadowRoot.querySelector(\"#content\").shadowRoot.querySelector(\"div.buttons > vaadin-button.save-button\").shadowRoot.querySelector(\"#button\")");
	   
	        
	        //==========================================================
	        //5th step - Verify that a new record is created for the newly added expense for the selected filter.
	   
	        WebElement fromdate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
	        WebElement todate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
	        fromdate.sendKeys("2/10/2021", Keys.ENTER);
	        todate.sendKeys("2/10/2021", Keys.ENTER);
	        for(WebElement opt : options){
	            opt.click();
	        }
	        options.get(0).click();
	   
	 
	       
	       
	        
	        //===================================================
	        //6th one = Validate whether the total amount is equal to the reimbursement amount displayed in the right side of the page
	       
	        WebElement ClearFilterbtn  = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > filters-toolbar\").shadowRoot.querySelector(\"#filters\").shadowRoot.querySelector(\"div > div.title.section-title > vaadin-button\").shadowRoot.querySelector(\"#button\")");
	        ClearFilterbtn.click();
	   
	        for(WebElement opt : options){
	            opt.click();
	        }
	        options.get(0).click();
	        Thread.sleep(2000);
	       
	        WebElement ramount = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > content-panel\").shadowRoot.querySelector(\"history-panel\").shadowRoot.querySelector(\"div > div > span\")");
	        String ram = ramount.getText();
	        WebElement table = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > content-panel\").shadowRoot.querySelector(\"expenses-list\").shadowRoot.querySelector(\"#expenses\").shadowRoot.querySelector(\"#table\")");
	        String rcount = table.getAttribute("aria-rowcount");
	        int rowcount = Integer.parseInt(rcount);
	        WebElement tbody = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > content-panel\").shadowRoot.querySelector(\"expenses-list\").shadowRoot.querySelector(\"#expenses\").shadowRoot.querySelector(\"#items\")");
	        List<WebElement> trs = tbody.findElements(By.tagName("tr"));
	        double sum = 0.0f;
	       
	        for(int i = 0; i<rowcount-2; i++) {
	        WebElement tr = trs.get(i);
	       
	        List<WebElement> tds = tr.findElements(By.tagName("td"));
	        String amount = tds.get(2).getText();
	        amount = amount.replace("text$", "").replace("$", "");
	       
	        sum = sum + Double.parseDouble(amount);
	        }
	       assertEquals("$" + sum, ram);
	       System.out.println(sum);
	       System.out.println(ram);
	     }  }
	   
	





