package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class ViewLeadsPage extends Annotations{

	public ViewLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	//For create Lead test case 
     @FindBy(id = "viewLead_firstName_sp")
      WebElement elevfname;
     
     public void verifyfirstname(String fname)
     { 
    	 verifyExactText(elevfname,fname);
       
     }
     //For Edit Lead test case 
     
     @FindBy(xpath= "//div[@class='frameSectionExtra']/a[3]")
 	 WebElement eleclickEdit;
     
     public ViewLeadsPage clickEditbtn()
     { 
     click (eleclickEdit);
     return new ViewLeadsPage();
     
     }
     
 	@FindBy(id = "updateLeadForm_companyName")
 	WebElement eleupdcompname;
 	
 	public ViewLeadsPage typecompanyname (String compname)
    {
		type(eleupdcompname,compname);
		return this;
   	 
    }
 	
 	@FindBy(name = "submitButton")
	WebElement eleupdsubmitbtn;
 	
 	public ViewLeadsPage clickupdbtn()
    { 
    click (eleupdsubmitbtn);
    return new ViewLeadsPage();
    }
 	
 	@FindBy(id = "viewLead_companyName_sp")
	WebElement eleupdcompname1;
 	
 	
 	public ViewLeadsPage verifyUpdcompname(String updcompname)
    { 
 		verifyPartialText (eleupdcompname,updcompname);
    return new ViewLeadsPage();
    }
	
 	@FindBy(id = "viewLead_firstName_sp")
    WebElement elefirstleadname;
    
    public ViewLeadsPage getcapturename() 
    { 
     firstResLeadName = elefirstleadname.getText();
     System.out.println(elefirstleadname.getText());
     return this;
    
    }
    
 	 @FindBy(xpath= "//div[@class = 'frameSectionExtra']/a[4]")
 	 WebElement eleclickdelete;
 	
 	public MyLeadsPage clickdeletebtn()
    { 
    click (eleclickdelete);
    return new MyLeadsPage();
    
    }
 	
 	 @FindBy(linkText = "Duplicate Lead")
 	 WebElement eleclickduplicatebtn;
 	 
 	
 	 public DuplicateLeadPage clickduplicatebtn()
     { 
     click (eleclickduplicatebtn);
     return new DuplicateLeadPage();
    
     }
 	
 	 @FindBy(id = "viewLead_firstNameLocal_sp")
	 WebElement elefirstname;
 	 
 	public ViewLeadsPage verifyFirstName()
    {
   	 verifyPartialText(elefirstname, firstResLeadName);
   	  return this;  	 
    }
 	
}
