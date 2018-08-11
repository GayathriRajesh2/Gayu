package week3homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver ();
	     driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.findElementByLinkText("Contact Us").click();
	     Set<String> allWindowHandle = driver.getWindowHandles();
	     List<String> listOfAllWindowHandle = new ArrayList<String>();
	     listOfAllWindowHandle.addAll(allWindowHandle);
	     driver.switchTo().window(listOfAllWindowHandle.get(1));
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     driver.switchTo().window(listOfAllWindowHandle.get(0));
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     driver.findElementByLinkText("Compatible Browser").click();
	     Set<String> allWindowHandle1 = driver.getWindowHandles();
	     List<String> listOfAllWindowHandle1 = new ArrayList<String>();
	     listOfAllWindowHandle1.addAll(allWindowHandle1);
	     driver.switchTo().window(listOfAllWindowHandle1.get(2));    
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     driver.switchTo().window(listOfAllWindowHandle1.get(1));
	     driver.close();
	     driver.switchTo().window(listOfAllWindowHandle1.get(2));
	     System.out.println(driver.getTitle());
	     //System.out.println
	     System.out.println(driver.findElementByXPath("//div[@class = 'content_12']//li[1]").getText());
	     System.out.println(driver.findElementByXPath("//div[@class = 'content_12']//li[2]").getText());
	     System.out.println(driver.findElementByXPath("//div[@class = 'content_12']//li[3]").getText());
	     System.out.println(driver.findElementByXPath("//div[@class = 'content_12']//li[4]").getText());
	     System.out.println(driver.findElementByXPath("//div[@class = 'content_12']//li[5]").getText());
	     	     
	        
	}
	

}
