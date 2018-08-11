package week2codechallenge;

//import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryDropDownIRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		   WebElement country = driver.findElementById("userRegistrationForm:countries");
		   Select cy = new Select(country) ;
		   cy.selectByVisibleText("Egypt");
	}

}
