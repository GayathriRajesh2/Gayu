package testcase;

//import org.junit.Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class EditLead extends Annotations {
 
	//@Test(dependsOnMethods = {"testcase.CreateLead.CreateLead"})
	//@Test(groups = {"smoke"})
	
	@Test(groups = {"sanity"}, dataProvider = "editData", dependsOnGroups= {"smoke"})

	public void Editlead(String fname,String cname)
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
	
	  type(locateElement("xpath","//div[@class='x-tab-panel']//input[@name='firstName']"),fname);
	  click(locateElement("xpath","//button[text()[contains(.,'Find Leads')]]"));
	  click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	  verifyTitle("View Lead | opentaps CRM");
	  click(locateElement("xpath", "//div[@class='frameSectionExtra']/a[3]"));
	  type(locateElement("id", "updateLeadForm_companyName"),cname);
	  click(locateElement("class", "smallSubmit"));
	  verifyPartialText(locateElement("viewLead_companyName_sp"), "Gayu pvt Ltd");
	  //closeBrowser();
    }
}