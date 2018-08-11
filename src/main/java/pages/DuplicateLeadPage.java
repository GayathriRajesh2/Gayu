package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wdMethods.Annotations;

public class DuplicateLeadPage extends Annotations {

	 @FindBy(xpath = "//div[@class = 'frameSectionExtra']/a")
 	 WebElement eleclickduplicatebtn;
 	 
 	
 	 public DuplicateLeadPage clickduplicatebtn()
     { 
     click (eleclickduplicatebtn);
     return this;
    
     }
	
 	 @FindBy(xpath = "//title[text() = 'Duplicate Lead | opentaps CRM']")
 	 WebElement eleverifytitle;
 	 
 	public DuplicateLeadPage checktitle(String eleverifytitle )
    { 
 		//boolean b = verifyTitle (eleverifytitle);
 		verifyTitle(eleverifytitle);
 		return this;
   
    }
 	 
 	 @FindBy(name = "submitButton")
	 WebElement elesubmitcreateLeadbtn;
	
 	public ViewLeadsPage clickCreateLeadbtn()
    { 
    click (elesubmitcreateLeadbtn);
    return new ViewLeadsPage();
    }
 	 
}
