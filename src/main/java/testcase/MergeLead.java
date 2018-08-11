package testcase;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MergeLead extends Annotations {
	
	//@Test(enabled = false)
	//@Test (groups = {"regression"})
	//@Test(timeOut =20000)
	

	@Test(groups = {"regression"}, dataProvider = "mergeData")
	
	public void MergeLead(String uid)
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
	  click(locateElement("LinkText", "Merge Leads"));
	  click(locateElement("xpath", "//table[@id = 'widget_ComboBox_partyIdFrom']/following::a/img"));
	  switchToWindow(1);
	  type(locateElement("name","id"), uid);
	  click(locateElement("class","x-btn-text"));
	  //clickNoSnap(locateElement("LinkText","11281"));
	  clickNoSnap(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a"));
	  
	  switchToWindow(0);
	  click(locateElement("xpath", "//table[@id = 'widget_ComboBox_partyIdTo']/following::a/img"));
	  
	  switchToWindow(1);
	  type(locateElement("name","id"), "10186");
	  click(locateElement("class","x-btn-text"));
	  //clickNoSnap(locateElement("LinkText","11285"));	
	  clickNoSnap(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a"));
	  switchToWindow(0);
	  clickNoSnap(locateElement("class", "buttonDangerous"));
	  acceptAlert(); 
	  click(locateElement("LinkText", "Find Leads"));
	  type(locateElement("name","id"), "10181");
	  click(locateElement("class","x-paging-info"));
	  //closeBrowser();
	  
}
}

