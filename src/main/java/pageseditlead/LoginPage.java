package pageseditlead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.Annotations;

public class LoginPage extends Annotations{
  
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement eleusername;
	
	@Given("Enter the username as (.*)")
	public LoginPage typeUserName (String username)
	{
		type(eleusername,username);
		return this;
	}
	
	@FindBy(id = "password")
	WebElement elepassword;
	
	@And("Enter the password as (.*)")
	public LoginPage typepassword (String password)
	{
		type(elepassword,password);
		return this;
	}
	
	@FindBy(className= "decorativeSubmit")
	WebElement elesubmit;
	
	@And ("click Login Button")
	public HomePage clicklogin()
	{
		click(elesubmit);
		return new HomePage();
	}
	
	
}
