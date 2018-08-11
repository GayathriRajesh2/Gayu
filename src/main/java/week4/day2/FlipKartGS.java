package week4.day2;



import java.text.NumberFormat;

import org.junit.Test;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.SeMethods;

public  class FlipKartGS extends SeMethods{

	   @Test
		public void FlipkartImp() throws InterruptedException
		{
		 startApp("chrome", "https://www.flipkart.com/");
		 clickNoSnap(locateElement("xpath","//button[text() = '✕']")); 
	     WebElement item1 = locateElement("xpath","//span[text()='TVs & Appliances']");
	    // WebElement item2 = locateElement("xpath",("//span[text()='Samsung'])[2]"));
	     Actions builder = new Actions(driver);
	     builder.moveToElement(item1).perform();
	     WebDriverWait wait = new WebDriverWait(driver,20);
	     WebElement item2 = locateElement("xpath",("(//span[text()='Samsung'])[2]"));
	     wait.until(ExpectedConditions.visibilityOf(item2));
	     
	     clickNoSnap(item2);
	     timeouts();
	     selectDropDownUsingValue(locateElement("xpath","//select[@class = 'fPjUPw']"), "25000");
	    // selectDropDownUsingValue(locateElement("xpath","//select [@class ='fPjUPw']/following::option"), "60000");
	     selectDropDownUsingValue(locateElement("xpath","(//select [@class ='fPjUPw'])[2]"), "60000");
	     clickNoSnap(locateElement("xpath", "//div[text()= 'Screen Size']"));
	     clickNoSnap(locateElement("xpath","//div[text()= 'Screen Size']/following::div[text()='48 - 55']"));
	     timeouts();
	     clickNoSnap(locateElement("xpath", "(//div[@class= '_3wU53n'])[1]"));
	     switchToWindow(1);
	     clickNoSnap(locateElement("xpath","(//div[@class= '_1p7h2j'])[1]"));
	     closeBrowser();
	     switchToWindow(0);
	     clickNoSnap(locateElement("xpath","(//div[@class= '_3wU53n'])[2]"));
	     switchToWindow(1);
	     clickNoSnap(locateElement("xpath","//div[@class = '_1p7h2j']"));
	     clickNoSnap(locateElement("xpath", "//span[text() = 'COMPARE']"));
	     switchToWindow(1);
	     String price1 = getText(locateElement("xpath","(//div[@class = '_1vC4OE'])[1]"));
	     String price2 = getText(locateElement("xpath","(//div[@class = '_1vC4OE'])[2]"));
	     
	     int result = price1.compareTo(price2);
	     
	     if(result <= 0)
	     {
	    	 clickNoSnap(locateElement("xpath","(//img[@class = 'u_5063'])[2]"));
	     }
	     else
	     {
	    	 clickNoSnap(locateElement("xpath","(//img[@class = 'u_5063'])[1]"));
	     }
	     
	   
		}
	   
	
	
	}


