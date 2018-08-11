package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		click(locateElement("LinkText", "CRM/SFA"));
		click(locateElement("LinkText","Create Lead"));
		type(locateElement("createLeadForm_companyName"),"BA");
		type(locateElement("createLeadForm_firstName"),"Gayu");
		type(locateElement("createLeadForm_lastName"),"S");
		click(locateElement("name","submitButton"));
		
		
		
		
		
	
	}
	
}






