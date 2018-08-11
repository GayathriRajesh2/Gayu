package week2homework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletelead {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text() = 'Phone']").click();
		WebElement ccode = driver.findElementByName("phoneCountryCode");
		ccode.clear();
		ccode.sendKeys("10",Keys.TAB);
		driver.findElementByName("phoneAreaCode").sendKeys("044");
		driver.findElementByName("phoneNumber").sendKeys("9845321676");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(2000);
		String id = driver.findElementByXPath("(//div[@class='x-grid3-scroller']//table[1]//div[1]/a)[1]").getText();
		System.out.println(id);
		driver.findElementByXPath("(//div[@class='x-grid3-scroller']//table[1]//div[1]/a)[1]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(id);
		Thread.sleep(2000);
		WebElement button1 = driver.findElementByXPath("//button[text() ='Find Leads']");
		button1.click();
		String comment = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(comment);
		driver.close();

	}




	}


