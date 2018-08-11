package week2codechallenge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UncheckChecbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		WebElement selected = driver.findElementByXPath("//*[contains(text(),'DeSelect only checked')]/following::input[2]");
		   boolean chkboxselected = selected.isSelected(); 	   
		   if (chkboxselected == true)
		   {
			   selected.click();		    
		   }
		
	}

}
