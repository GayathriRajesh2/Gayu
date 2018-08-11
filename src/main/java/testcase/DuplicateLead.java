package testcase;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class DuplicateLead extends Annotations {

//@Test (groups = {"regression"})
	//@Test(enabled = false)
	
	@Test(groups = {"regression"}, dataProvider = "dupData")
	
public void DuplicateLead(String email)
{
	/*startApp("chrome", "http://leaftaps.com/opentaps");
	type(locateElement("id","username"), "DemoSalesManager");
	type(locateElement("id","password"), "crmsfa");
	click(locateElement("class", "decorativeSubmit"));
	click(locateElement("LinkText", "CRM/SFA"));*/
	click(locateElement("LinkText","Create Lead"));
	click(locateElement("LinkText","Find Leads"));
	//click(locateElement("xpath", "//em[@class ='x-tab-left'])[3]/span/span"));
	click(locateElement("xpath","//span[text() = 'Email']"));
	type(locateElement("name","emailAddress"), email);
	
	click(locateElement("xpath","//button[text() = 'Find Leads']"));
	String leadId = getText(locateElement("xpath", "//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId']/a"));
	//System.out.println(leadId);
	click(locateElement("xpath", "//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId']/a"));
	click(locateElement("xpath","//div[@class = 'frameSectionExtra']/a"));
	verifyTitle("Duplicate Lead | opentaps CRM");
	click(locateElement("class","smallSubmit"));
	verifyExactText(locateElement("viewLead_firstName_sp"), leadId);
	//closeBrowser();
	



}
	
	
}
