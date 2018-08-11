package pagesduplicatelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import wdMethods.Annotations;

public class ViewLeadsPage extends Annotations{

	public ViewLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
     @FindBy(id = "viewLead_firstName_sp")
      WebElement elevfname;
     
     @Then ("confirm the duplicated lead name is same as (.*)")
     public ViewLeadsPage verifyfirstname(String capturedname)
     { 
    	 verifyExactText(elevfname,capturedname);
    	 return this;
       
     }
    
     
  
}