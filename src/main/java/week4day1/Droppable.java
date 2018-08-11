package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement draggableElement = driver.findElementById("draggable");
		WebElement droppableElement = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggableElement, droppableElement).perform();
		
		
		
	}

}
