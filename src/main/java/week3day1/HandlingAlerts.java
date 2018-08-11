package week3day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame1 = driver.findElementById("iframeResult");
		driver.switchTo().frame(frame1);
		//driver.switchTo().frame(driver.findElementById("iframeResult"));
		driver.findElementByXPath("//button[text()= 'Try it']").click();
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		alert1.sendKeys("Gayathri");
		alert1.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String text1 = driver.findElementById("demo").getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		
			
		
	}

	
}
