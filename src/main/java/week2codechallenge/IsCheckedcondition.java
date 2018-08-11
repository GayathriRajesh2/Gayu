package week2codechallenge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsCheckedcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		WebElement language = driver.findElementByXPath("//div[@class='example']//input[3]");
		boolean langselected = language.isSelected();
		if (langselected== true) 
		{
			System.out.println("SQL Checkbox is selected");	
		}
		else 
		{
			System.out.println("SQL Checkbox is not selected");	
		}
			
	   WebElement deselect = driver.findElementByXPath("//*[contains(text(),'DeSelect only checked')]/following::input[2]");
	   boolean chkselected = deselect.isSelected();
	   if (chkselected == true)
	   {
		   System.out.println("Deselect is selected");
	   }
	   else 
	   {
		   System.out.println("Deselect is not selected");
	   }
	
	
	
	}
	
		
	}


