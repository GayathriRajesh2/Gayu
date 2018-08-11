package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps2 {
	
		public ChromeDriver driver;

		@Given("Open the Browser")
		public void openBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//System.out.println(driver);  
			driver = new ChromeDriver();
			//System.out.println(driver);  
		}
	 
	    @And("Maximize the window")
		public void maxWindow()
		{
			driver.manage().window().maximize();
		}
	 
	 	@And("Load the Url")
	 	public void loadurl()
	 	{
	 	driver.get("http://leaftaps.com/opentaps/");
	 	}
	 

	    @And("Set the timeout")
	    public void timeout()
	    {
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    }
	  
	    @Given("Enter the user name as (.*)")
	    public void enterUserName(String username)
	    {
	    	driver.findElementById("username").sendKeys(username);
	    }
	   
	   @And("Enter the password as (.*)")
	    public void password(String password)
	    {
	    	driver.findElementById("password").sendKeys(password);
	    }
	 
	    @And("click on the login button")
	    public void clickOnLogin()
	    {
	    	driver.findElementByClassName("decorativeSubmit").click();
	    }
	    
	    @And ("click on CRMSFA")
	    public void clickCRMlink()
	     {
	       driver.findElementByLinkText("CRM/SFA").click();
	     }
	  
	    @When ("createlead link is clicked")
	    public void clickCreateLead()
	    {
	      driver.findElementByLinkText("Create Lead").click();
	    }
	    
	    @And ("Enter the company name as (.*)")
	    public void entercompname(String cname)
	    {
	       driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	    }
	    
	    @And ("Enter Firstname as (.*)") 
	    public void enterfirstName(String fname)
	    {
	    	driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	    }
	    
	    @And ("Enter Lastname as (.*)")
	    public void enterlastName(String lname)
	    {
	    	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	    }
	     
	    @And ("click CreateLead button")
	    public void CreateLeaad()
	    {
	    	driver.findElementByName("submitButton").click();
	    }
	    
	    @Then ("verify lead has been created")
	    public void leadcreated()
	    {
	    	driver.findElementById("viewLead_firstName_sp").getText();
	    }
	    

	}


