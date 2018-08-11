package pagesmergelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;

public class HomePage extends Annotations {

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "CRM/SFA")
	WebElement eCRMSlink;
	
	@And ("Click link Cmrsfa")
	public MyHomePage ClickCRMS()
	{
		click(eCRMSlink);
		return new MyHomePage();
	}
}
