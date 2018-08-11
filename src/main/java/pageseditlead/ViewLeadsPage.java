package pageseditlead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DuplicateLeadPage;
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
     
      @FindBy(xpath = "//title[text() = 'View Lead | opentaps CRM']")
      WebElement eTitle;
      
      @Then ("verify title of the page")
      public ViewLeadsPage Verifytitle()
      {
    	  verifyTitle(eTitle.getText());
    	  return this;
      }
     
      @FindBy(xpath= "//div[@class='frameSectionExtra']/a[3]")
  	  WebElement eleclickEdit;
      
      @And ("click Edit")
      public ViewLeadsPage clickEditbtn()
      { 
      click (eleclickEdit);
      return new ViewLeadsPage();
      
      }
     
      @FindBy(id = "updateLeadForm_companyName")
      WebElement eleupdcompname;
   	
      @And ("change the company name as (.*)")
   	  public ViewLeadsPage typecompanyname (String updcompname)
   	  {
  		type(eleupdcompname,updcompname);
  		return this;
     	 
   	  }
      
       @FindBy(name = "submitButton")
   	   WebElement eleupdsubmitbtn;
    	
       @When ("click update button")
       public ViewLeadsPage clickupdbtn()
        { 
         click (eleupdsubmitbtn);
         return new ViewLeadsPage();
        }
       

    	@FindBy(id = "viewLead_companyName_sp")
   	    WebElement eleupdcompname1;
    	
    	@Then ("confirm the changed name appears as (.*)")
    	public ViewLeadsPage verifyUpdcompname(String updcompname)
         { 
    		verifyPartialText (eleupdcompname1,updcompname);
            return new ViewLeadsPage();
         }
       
       
     
}