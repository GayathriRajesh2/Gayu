package pagesduplicatelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;

public class MyLeadsPage extends Annotations {

	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
     @FindBy(linkText = "Find Leads")
     WebElement eleFindLead;
     
     @And ("click link Find leads")
     public FindLeadsPage clickFindLead()
     { 
     click (eleFindLead);
     return new FindLeadsPage();
     
     }
     
}
