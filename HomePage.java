package MyMavenProject.Mymavenassignment;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import ResourcesPageObject.LogInPage;

public class HomePage extends BaseClassF {

	
		 private static WebDriver _driver;
	 JavascriptExecutor js = (JavascriptExecutor)_driver;
	 
	@Test
	public void LoginandValidate_01() throws InterruptedException
	{ 
		BaseClass bs=new BaseClass(_driver);
		bs.getLoginPage();
		
		LoginPageElments lp = new LoginPageElments(_driver);
		Thread.sleep(1000);
		lp.username.sendKeys("demo");
		lp.password.sendKeys("demo");
		lp.loginBtn.click();
		
		
		
		
	}
	
	@Test
	public void GetNumberOfRecords_02()
	{ 
		BaseClass bs=new BaseClass(_driver);
		bs.getLoginPage();
		
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
	}
	@Test
	public void DAddNewExpense_03()
	{ 
		BaseClass bs=new BaseClass(_driver);
		bs.getLoginPage();
		
		WebElement fromdate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
        WebElement todate = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelectorAll('vaadin-date-picker')[0].shadowRoot.querySelector('vaadin-text-field').shadowRoot.querySelector('input')");
        List<WebElement> options = (List<WebElement>) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelector('option-group').shadowRoot.querySelectorAll('vaadin-checkbox')");
        fromdate.sendKeys("2/10/2021", Keys.ENTER);
        todate.sendKeys("2/10/2021", Keys.ENTER);
        for(WebElement opt : options){
            opt.click();
        }
        options.get(0).click();
   
	}
	@Test
	public void ValidateAmounts_04()
	{ 
		BaseClass bs=new BaseClass(_driver);
		bs.getLoginPage();
		
		 WebElement ClearFilterbtn  = (WebElement)js.executeScript("return document.querySelector(\"body > expense-app\").shadowRoot.querySelector(\"#pages > overview-page\").shadowRoot.querySelector(\"app-header-layout > div > filters-toolbar\").shadowRoot.querySelector(\"#filters\").shadowRoot.querySelector(\"div > div.title.section-title > vaadin-button\").shadowRoot.querySelector(\"#button\")");
	        ClearFilterbtn.click();
	        List<WebElement> options = (List<WebElement>) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('overview-page').shadowRoot.querySelector('filters-toolbar').shadowRoot.querySelector('search-filters').shadowRoot.querySelector('div').querySelector('option-group').shadowRoot.querySelectorAll('vaadin-checkbox')");
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
	       //assertEquals("$" + sum, ram);
	       System.out.println(sum);
	       System.out.println(ram);
	     }
}
}
