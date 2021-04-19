package MyMavenProject.Mymavenassignment;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AutomatedTest {

	private static WebDriver _driver;


    public JavascriptExecutor js = (JavascriptExecutor)_driver;
	 
	
	  @Test public void LoginandValidate() throws Exception { BClass bs =new
	  BClass(_driver); bs.getLoginPage();
	  
	  
	  
	  }
	 
	
	@Test
	
	public void CalendarSelection () throws Exception
	{
		BClass.getLoginPage();
		Thread.sleep(5000);
		
		 //WebElement clickonCalendar = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('vaadin-date-picker').shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
		 //clickonCalendar.click();
	
		 ExpensePageElements.searchStartDate.sendKeys("2/1/2021\", Keys.ENTER");	
		 ExpensePageElements.searchEndDate.sendKeys("2/28/2021\", Keys.ENTER");
		for(WebElement opt : ExpensePageElements.options){
            opt.click();
        }
        ExpensePageElements.options.get(0).click();
		
	}
	
	
	
    @AfterTest
    
    public void DriverKill()
    {
    	_driver.quit();
    	
    }
    
    @Test
    
    public void AddNewExpense() throws Exception
    {
		 BClass.getLoginPage(); 
		 Thread.sleep(5000);
		 
		
    	ExpensePageElements.we.click();
    	ExpensePageElements.wd.sendKeys("Breakfast", Keys.ENTER);
    	ExpensePageElements.totalm.sendKeys("100", Keys.ENTER);
    	ExpensePageElements.selectdate.sendKeys("2/10/2021", Keys.ENTER);
    	ExpensePageElements.save.click();
    	
    }
    
    @Test
    public void Verifynewrecord() throws Exception
    {
    	BClass.getLoginPage(); 
		 Thread.sleep(5000);
    	ExpensePageElements.fromdate.sendKeys("2/10/2021", Keys.ENTER);
    	ExpensePageElements.todate.sendKeys("\"2/10/2021\", Keys.ENTER");
    	for(WebElement opt : ExpensePageElements.options){
            opt.click();
        }
    	ExpensePageElements.options.get(0).click();
    }
    
    @Test
    public void ValidatetotalandReimbursed() throws Exception
    {
    	
    	ExpensePageElements.ClearFilterbtn.click();
    	for(WebElement opt : ExpensePageElements.options){
            opt.click();
        }
    	ExpensePageElements.options.get(0).click();
        Thread.sleep(2000);
        String ram = ExpensePageElements.ramount.getText();
        String rcount = ExpensePageElements.table.getAttribute("aria-rowcount");
        int rowcount = Integer.parseInt(rcount);
        List<WebElement> trs = ExpensePageElements.tbody.findElements(By.tagName("tr"));
        
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
        
    }
}

	

