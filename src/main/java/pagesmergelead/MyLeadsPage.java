package pagesmergelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;

public class MyLeadsPage extends Annotations {

	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
     
     
       
}
