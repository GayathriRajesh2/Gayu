package week2codechallenge;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastButOneListOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
	    WebElement dropdown = driver.findElementById("dropdown3");
	    Select sc= new Select(dropdown);
	    List<WebElement> alloptions = sc.getOptions();
	    int sizes = alloptions.size();
	    System.out.println(sizes);
	    sc.selectByIndex(sizes-1);
	    
	}
	}
	
	