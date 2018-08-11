package week3homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckNumberOfFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver ();
	     driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
	}

}
