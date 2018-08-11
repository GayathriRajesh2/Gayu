package pagesduplicatelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.Annotations;

public class DuplicateLeadPage extends Annotations {

	public DuplicateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class = 'frameSectionExtra']/a")
	WebElement eleclickduplicatebtn;

	@When ("click duplicate lead")
	public DuplicateLeadPage clickduplicatebtn()
	{ 
		click (eleclickduplicatebtn);
		return this;

	}
	
	 @FindBy(xpath = "//title[text() = 'Duplicate Lead | opentaps CRM']")
 	 WebElement eleverifytitle;
 	 
	 @Then ("verify the title as (.*)")
 	 public DuplicateLeadPage checktitle(String eleverifytitle )
      { 
 		//boolean b = verifyTitle (eleverifytitle);
 		verifyTitle(eleverifytitle);
 		return this;
   
      }
	 
	 @FindBy(name = "submitButton")
	 WebElement elecreateleadbtn;
	 
	 @When ("click create Lead")
	 public ViewLeadsPage clickCreateLeadBtn()
	 {
		 click(elecreateleadbtn);
		 return new ViewLeadsPage(); 
		 
	 }
	
}
