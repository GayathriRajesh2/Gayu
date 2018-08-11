package pagesdeletelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagescreatelead.CreateLeadsPage;
import wdMethods.Annotations;

public class FindLeadsPage extends Annotations{

	public FindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	

    @FindBy(xpath = "(//em[@class = 'x-tab-left'])[2]/span/span")
	WebElement elephonetab;
	
    @And ("click phone tab")
    public FindLeadsPage clickphonetab()
    { 
    click (elephonetab);
    return this;
    
    }
    
    @FindBy(name = "phoneCountryCode")
   	WebElement electrycode;
   	
    @And("Enter country code as (.*)")
    public FindLeadsPage typephctrycode(String ctrycode)
    { 
     type(electrycode,ctrycode);
     return this;
    
    }

    @FindBy(name = "phoneAreaCode")
   	WebElement eleareacode;
	
    @And ("Enter area code as (.*)")
    public FindLeadsPage typephareacode(String areacode)
    { 
     type(eleareacode,areacode);
     return this;
    
    }
    
    @FindBy(name = "phoneNumber")
   	WebElement elephoneno;
    
    @And ("Enter Phone as (.*)")
    public FindLeadsPage typephoneno(String phoneno)
    { 
     type(elephoneno,phoneno);
     return this;
    
    }
    
    
    @FindBy(xpath ="//button[text()[contains(.,'Find Leads')]]")
 	WebElement elebtnfindleads;
 	
    @And ("click Find Leads button")
    public FindLeadsPage clickFindLeadsbtn()
     { 
     click (elebtnfindleads);
     return new FindLeadsPage();
     
     }
    
    @FindBy(xpath = "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a")
    WebElement elefirstleadid;
     
    @And ("capture lead id of first resulting Lead")
    public FindLeadsPage getcaptureid() 
    { 
     firstResLeadId = elefirstleadid.getText();
     return this;
    
    }
    
   
    @And ("click first resulting Lead")
    public ViewLeadsPage clickdelcaptureid()
    {
    	click(elefirstleadid);
    	return new ViewLeadsPage();
    }
    
    
    @FindBy(name = "id")
   	WebElement eleLeadId;
    
    @And ("Enter capture Lead id")
    public FindLeadsPage typeLeadId()
    {
    	type(eleLeadId,firstResLeadId);
    	return this;
    }
    
   
    @FindBy(xpath ="//button[text()[contains(.,'Find Leads')]]")
   	WebElement elebtnfindleadsdel;
   	
      @When ("clicking find leads button")
      public FindLeadsPage clickFindLeadsbtndel()
       { 
       click (elebtnfindleadsdel);
       return new FindLeadsPage();
       
       }
    
      @FindBy(xpath = "//div[@class='x-paging-info']")
      WebElement eleerror;
    
      @Then("Verify error message as (.*)")
      public FindLeadsPage errormsg(String errmsg)
      	{
    	  verifyPartialText(eleerror,errmsg);
    	  return this;  	 
      	}
    
      
}
