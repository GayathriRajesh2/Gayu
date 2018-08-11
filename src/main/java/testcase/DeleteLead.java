package testcase;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class DeleteLead extends Annotations {
	
	//@Test(timeOut= 10000)
	//@Test (groups = {"sanity"})
	//@Test(dependsOnMethods = {"testcase.CreateLead.CreateLead"})
	
	@Test(groups = {"sanity"}, dataProvider = "deleteData", dependsOnGroups= {"smoke"})
	
	public void DeleteLead(String phctrycode, String phareacode) throws InterruptedException
	{
	
	  /*startApp("chrome", "http://leaftaps.com/opentaps");
	  WebElement eleuser = locateElement("id", "username");
	  type(eleuser, "DemoSalesManager");
	  WebElement elepwd = locateElement("id", "password");
	  type(elepwd, "crmsfa");
	  WebElement btnclick = locateElement("class", "decorativeSubmit");
	  btnclick.click();
	  click(locateElement("LinkText", "CRM/SFA"));*/
	  click(locateElement("LinkText", "Create Lead"));
	  click(locateElement("LinkText",  "Find Leads"));
	  Thread.sleep(20000);
	 // click(locateElement("xpath","//span[@class= 'X-tab-strip-text' and text() = 'phone']"));
	  click(locateElement("xpath","(//em[@class = 'x-tab-left'])[2]/span/span"));
	  type(locateElement("name", "phoneCountryCode"),phctrycode);
	  type(locateElement("name", "phoneAreaCode"),phareacode);
	  type(locateElement("name", "phoneNumber"),"9884432408");
	  
	  
	  click(locateElement("xpath","//button[text()[contains ( . ,'Find Leads')]]"));
	  
	 // click(locateElement("xpath","//table[@class= 'x-grid3-row-table']//following::td[1]"));
	  clickNoSnap(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a"));
	  click(locateElement("xpath", "//div[@class = 'frameSectionExtra']/a[4]"));
	  click(locateElement("LinkText",  "Find Leads"));
	  type(locateElement("name","id"), "11676");
	  click(locateElement("xpath", "//div[@class= 'x-paging-info']"));
	 // closeBrowser();
	  
	  
	 
	  
	  
	  
	  
			  
	
	{
	
}
	}
}

