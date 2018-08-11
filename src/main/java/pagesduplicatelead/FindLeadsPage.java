package pagesduplicatelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DuplicateLeadPage;
import pages.ViewLeadsPage;
import pagescreatelead.CreateLeadsPage;
import wdMethods.Annotations;

public class FindLeadsPage extends Annotations{

	public FindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text() = 'Email']")
	WebElement eleemailtab;

	@And("click on Email")
	public FindLeadsPage clickEmailtab()
	{
		click (eleemailtab);
		return this;  	
	}

	@FindBy(name = "emailAddress")
	WebElement eleaddress;

	@And ("Enter Email as (.*)")
	public FindLeadsPage typeemail(String email)
	{
		type(eleaddress, email);
		return this;
	}


	@FindBy(xpath ="//button[text()[contains(.,'Find Leads')]]")
	WebElement elebtnfindleads;

	@And ("click Find leads button")
	public FindLeadsPage clickFindLeadsbtn()
	{ 
		click (elebtnfindleads);
		return new FindLeadsPage();

	}
	
	   @FindBy(xpath = "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a")
	     WebElement elefirstleadid;
	      
	 	
	 	@And ("click first resulting lead")
	 	public ViewLeadsPage clickdupcaptureid()
	 	{
	 		click(elefirstleadid);
	 		return new ViewLeadsPage();
	 	}
	 	
	      
	 	@FindBy(id = "viewLead_firstName_sp")
	     WebElement elefirstleadname;
	     
	 	@And ("capture the name of first lead")
	     public ViewLeadsPage getcapturename() 
	     { 
	      firstResLeadName = elefirstleadname.getText();
	      System.out.println(elefirstleadname.getText());
	      return new ViewLeadsPage() ;
	     
	     }

	
	

	

}
