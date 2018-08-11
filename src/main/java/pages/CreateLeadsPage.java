package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class CreateLeadsPage extends Annotations {
	
	public CreateLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	 
     @FindBy(id = "createLeadForm_companyName")
     WebElement elecname;
     
     public CreateLeadsPage typeCompanyName (String cname)
     {
    	type(elecname,cname);
    	return this;
    	 
     }
     
     @FindBy(id = "createLeadForm_firstName")
     WebElement elefname;
     
     public CreateLeadsPage typeFirstName (String fname)
     {
    	type(elefname,fname);
    	return this;
    	 
     }
     
     @FindBy(id = "createLeadForm_lastName")
     WebElement elelname;
     
     public CreateLeadsPage typeLastName (String lname)
     {
    	type(elelname,lname);
    	return this;
    	 
     }
     
     
     
     
     @FindBy(name = "submitButton")
     WebElement elesubmit;
     
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
