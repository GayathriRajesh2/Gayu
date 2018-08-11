package pageseditlead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ViewLeadsPage;
import pagescreatelead.CreateLeadsPage;
import wdMethods.Annotations;

public class FindLeadsPage extends Annotations{

	public FindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	

		@FindBy(xpath = "//div[@class='x-tab-panel']//input[@name='firstName']")
	    WebElement elefirstname;
		
		@And ("Enter First name as (.*)")
		public FindLeadsPage typeFirstName (String fname)
	    {
			type(elefirstname,fname);
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
	    
		@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
		WebElement elefirstlink;
		
		
		@When ("click on first resulting lead")
		public ViewLeadsPage clickFirstLink()
	    { 
	    click (elefirstlink);
	    return new ViewLeadsPage();
	    
	    }
		

}