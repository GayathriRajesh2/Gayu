package pagesdeletelead;

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
     
     
     public ViewLeadsPage verifyfirstname(String fname)
     { 
    	 verifyExactText(elevfname,fname);
    	 return this;
       
     }
     
     @FindBy(xpath = "//a[text()='Delete']")
     WebElement eleDelete;
     
     @And ("click delete")
     public MyLeadsPage deletelead()
     {
    	 click(eleDelete);
    	 return new MyLeadsPage();
     }
     
}