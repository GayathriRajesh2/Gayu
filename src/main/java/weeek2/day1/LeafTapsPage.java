package weeek2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeafTapsPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("BOA");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gayathri");
		driver.findElementById("createLeadForm_lastName").sendKeys("Sampath");
		//driver.findElementByClassName("smallSubmit").click();
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select sc = new Select(industry);
		sc.selectByValue("IND_INSURANCE");
		List <WebElement> allOptions = sc.getOptions();
		int size = allOptions.size();
		System.out.println(size);
		
		
		







	}

}