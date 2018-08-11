package week2homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class editlead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Find Leads").click();
		WebElement firstname = driver.findElementByXPath("(//input[@name='firstName'])[3]");
		firstname.sendKeys("Gayathri");
		WebElement button = driver.findElementByXPath("//button[text() ='Find Leads']");
		button.click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-scroller']//table[1]//div[1]/a)[1]").click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Bofa");
		driver.findElementByName("submitButton").click();
		Thread.sleep(2000);
		String cName = driver.findElementById("viewLead_companyName_sp").getText();
		String company ="bofa";
		if(cName .equals(company))
		{ System.out.println("correct");}
		else {System.out.println("not correct");}
		driver.close();

	}



	}


