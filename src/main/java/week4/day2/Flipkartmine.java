package week4.day2;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.SeMethods;
import week4day1.MoveToElement;

public class Flipkartmine extends SeMethods{
	@Test
	public void flipkartCompare () throws InterruptedException {
		startApp("chrome", "https://www.flipkart.com/");
		click(locateElement("xpath","//button[text()='✕']"));
		WebElement itemOne = locateElement("xpath","//span[text()='TVs & Appliances']");
		WebElement itemTwo = locateElement("xpath","//span[text()='Samsung'][2]");
		Actions builder = new Actions(driver);
		builder.moveToElement(itemOne).perform();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(itemTwo));
		click(itemTwo);
		selectDropDownUsingValue(locateElement("class","fPjUPw"),"25000");
		selectDropDownUsingValue(locateElement("class","fPjUPw"),"60000");
	}

}



