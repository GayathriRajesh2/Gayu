package week3homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNameInConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
     ChromeDriver driver = new ChromeDriver ();
     driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     WebElement frametry = driver.findElementById("iframeResult");
     driver.switchTo().frame(frametry);
     driver.findElementByXPath("//button[text() = 'Try it']").click();
     Alert myAlert = driver.switchTo().alert();
     String text = myAlert.getText();
     myAlert.sendKeys("Gayathri");
     System.out.println(myAlert.getText());
     myAlert.accept();
     
     
     
     
     
     
	}

	
}
