package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement item1 = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement item2 = driver.findElementByXPath("//span[text()='Thomson']");
		Actions builder = new Actions(driver);
		builder.moveToElement(item1).pause(3000).click(item2).perform();
		driver.close();
		

	}

}
