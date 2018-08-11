package pagescreatelead;

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
	
     @FindBy(linkText = "Create Lead")
      WebElement eleCreateLead;
     
     @And("Click create Lead")
     public CreateLeadsPage clickCreateLead()
     { 
     click (eleCreateLead);
     return new CreateLeadsPage();
     
     }
     
       
}
