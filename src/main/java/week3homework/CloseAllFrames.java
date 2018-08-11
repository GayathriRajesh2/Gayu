package week3homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver ();
	     driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
	     driver.manage().window().maximize();
	     driver.findElementByXPath("//div[@class='ui-layout-west ui-layout-pane ui-layout-pane-west']//button").click();
	     driver.switchTo().frame("secondframe");
	     
	    
	}

}

