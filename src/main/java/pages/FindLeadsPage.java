package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class FindLeadsPage extends Annotations{

	public FindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Edit Lead 
	@FindBy(xpath = "//div[@class='x-tab-panel']//input[@name='firstName']")
    WebElement elefirstname;
	
	public FindLeadsPage typeFirstName (String fname)
    {
		type(elefirstname,fname);
		return this;
   	 
    }

	@FindBy(xpath ="//button[text()[contains(.,'Find Leads')]]")
	WebElement elebtnfindleads;
	
	public FindLeadsPage clickFindLeadsbtn()
    { 
    click (elebtnfindleads);
    return new FindLeadsPage();
    
    }
    
	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement elefirstlink;
	
	public ViewLeadsPage clickFirstLink()
    { 
    click (elefirstlink);
    return new ViewLeadsPage();
    
    }
	
    @FindBy(xpath = "(//em[@class = 'x-tab-left'])[2]/span/span")
	WebElement elephonetab;
	
    //Delete Lead 
    public FindLeadsPage clickphonetab()
    { 
    click (elephonetab);
    return this;
    
    }
    
    @FindBy(name = "phoneCountryCode")
   	WebElement electrycode;
   	
    public FindLeadsPage typephctrycode(String ctrycode)
    { 
     type(electrycode,ctrycode);
     return this;
    
    }

    @FindBy(name = "phoneAreaCode")
   	WebElement eleareacode;
	
    public FindLeadsPage typephareacode(String areacode)
    { 
     type(eleareacode,areacode);
     return this;
    
    }
    
    @FindBy(name = "phoneNumber")
   	WebElement elephoneno;
    
    public FindLeadsPage typephoneno(String phoneno)
    { 
     type(elephoneno,phoneno);
     return this;
    
    }
    
    @FindBy(xpath = "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a")
    WebElement elefirstleadid;
      	
    public FindLeadsPage getcaptureid() 
    { 
     firstResLeadId = elefirstleadid.getText();
     return this;
    
    }
    
    @FindBy(name = "id")
   	WebElement eleLeadId;
    
    public FindLeadsPage typeLeadId()
    {
    	type(eleLeadId,firstResLeadId);
    	return this;
    }
    
    //Duplicate Lead
    
    @FindBy(xpath = "//span[text() = 'Email']")
   	WebElement eleemailtab;
    
    public FindLeadsPage clickEmailtab()
    {
    	click (eleemailtab);
        return this;  	
    }
    
    @FindBy(name = "emailAddress")
   	WebElement eleaddress;
    
    
    public FindLeadsPage typeemail(String email)
    {
    	type(eleaddress, email);
    	return this;
    }
    
    
    
}
