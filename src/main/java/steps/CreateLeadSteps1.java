package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps1 {
	
	public ChromeDriver driver;

	@Given("open the browser")
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
 
 	@And("Load the url")
 	public void loadurl()
 	{
 	driver.get("http://leaftaps.com/opentaps/");
 	}
 

    @And("set the timeout")
    public void timeout()
    {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
  
    @And("Enter the username")
    public void enterUserName()
    {
    	driver.findElementById("username").sendKeys("DemoSalesManager");
    }
   
   @And("Enter the password")
    public void password()
    {
    	driver.findElementById("password").sendKeys("crmsfa");
    }
 
    @And("click on the Login Button")
    public void clickOnLogin()
    {
    	driver.findElementByClassName("decorativeSubmit").click();
    }
    
    @And ("Click link Cmrsfa")
    public void clickCRMlink()
     {
       driver.findElementByLinkText("CRM/SFA").click();
     }
  
    @When ("Click link createLead")
    public void clickCreateLead()
    {
      driver.findElementByLinkText("Create Lead").click();
    }
    
    @When ("Enter the company Name")
    public void entercompname()
    {
       driver.findElementById("createLeadForm_companyName").sendKeys("Bofa");
    }
    
    @When ("Enter the first user Name") 
    public void enterfirstName()
    {
    	driver.findElementById("createLeadForm_firstName").sendKeys("Gayu");
    }
    
    @When ("Enter the Last name")
    public void enterlastName()
    {
    	driver.findElementById("createLeadForm_lastName").sendKeys("S");
    }
     
    @When ("Click CreateLead")
    public void CreateLeaad()
    {
    	driver.findElementByName("submitButton").click();
    }
    
    @Then ("verify lead is created")
    public void leadcreated()
    {
    	driver.findElementById("viewLead_firstName_sp").getText();
    }
    

}








