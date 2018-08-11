package week4day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		Point locationItem5 = driver.findElementByXPath("//ul[@id='sortable']/li[5]").getLocation();
		int x = locationItem5.getX();
		int y = locationItem5.getY();
		System.out.println(locationItem5);
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, x, y).perform();
		driver.close();
		
		

	}

}
