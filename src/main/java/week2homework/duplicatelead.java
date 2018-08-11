package week2homework;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test(dataProvider = "dupData", groups = {"regression"})
public class duplicatelead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//a[text() = 'Leads']").click();
		driver.findElementByXPath("//a[text() = 'Find Leads']").click();
		driver.findElementByXPath("//span[text() = 'Email']").click();
		driver.findElementByXPath("//input[@name = 'emailAddress']").sendKeys("gayu.unique@gmail.com");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		driver.findElementByXPath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByXPath("//a[text() ='Duplicate Lead']").click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByName("submitButton").click();
		driver.close();

	}




	}


