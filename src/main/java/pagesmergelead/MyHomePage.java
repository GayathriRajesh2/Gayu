package pagesmergelead;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;

public class MyHomePage extends Annotations {
	
	public MyHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
     @FindBy(linkText = "Leads")
      WebElement eleLeads;
     
     @And("Click link Leads")
     public MyLeadsPage clickLeads()
 	 {
 		//WebElement eleLeads = locateElement("linktext", "Leads");
 		click(eleLeads);
 		return new MyLeadsPage();
 	 }
 	

}