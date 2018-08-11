package week2day2;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		List<WebElement>tr = driver.findElementsByXPath("//div[@id='contentblock']//table//tr");
		System.out.println(tr.size());
		int td = driver.findElementsByXPath("//div[@id = 'contentblock']//table//tr/td[1]").size();
		System.out.println(td);
	    String progress = driver.findElementByXPath("//*[contains(text(),'Learn to interact with')]/following::td[1]").getText();
	    System.out.println(progress);
	    boolean selected = driver.findElementByXPath("//*[contains(text(),'Handle Exceptions')]/following::td[2]").isSelected();
	    System.out.println(selected);
	
	}
}
