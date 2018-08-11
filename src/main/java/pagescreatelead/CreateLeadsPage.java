package pagescreatelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.Annotations;

public class CreateLeadsPage extends Annotations {
	
	public CreateLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	 
     @FindBy(id = "createLeadForm_companyName")
     WebElement elecname;
     
     @And("Enter the company Name as (.*)")
     public CreateLeadsPage typeCompanyName (String cname)
     {
    	type(elecname,cname);
    	return this;
    	 
     }
     
     @FindBy(id = "createLeadForm_firstName")
     WebElement elefname;
     
     @And ("Enter the first Name as (.*)")
     public CreateLeadsPage typeFirstName (String fname)
     {
    	type(elefname,fname);
    	return this;
    	 
     }
     
     @FindBy(id = "createLeadForm_lastName")
     WebElement elelname;
     
     @And ("Enter the Last name as (.*)")
     public CreateLeadsPage typeLastName (String lname)
     {
    	type(elelname,lname);
    	return this;
    	 
     }
     
     @FindBy(name = "submitButton")
     WebElement elesubmit;
     
     @When("Click submit button")
     public ViewLeadsPage clickCreateLead()
     { 
     click (elesubmit);
     return new ViewLeadsPage();
     
     }
     
     @FindBy(name = "submitButton")
     WebElement elesubmitfailure;
     
     public CreateLeadsPage clickSubmitError()
     {
    	 click(elesubmitfailure);
    	  return this;  	 
     }
 
     @FindBy(className = "errorList")
     WebElement eleerror;
     
     public CreateLeadsPage errormsg(String errmsg)
     {
    	 verifyPartialText(eleerror,errmsg);
    	  return this;  	 
     }
}
