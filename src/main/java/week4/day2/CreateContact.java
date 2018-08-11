package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		 System.setProperty("webdriver.chrome.driver", "D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver ();
	     driver.get("http://leaftaps.com/opentaps/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.findElementById("username").sendKeys("DemoSalesManager");
	     driver.findElementById("password").sendKeys("crmsfa");
	     driver.findElementByClassName("decorativeSubmit").click();
	     driver.findElementByLinkText("CRM/SFA").click();
	     driver.findElementByLinkText("Create Contact").click();
	     driver.findElementById("firstNameField").sendKeys("Gayathri");
	     String firstName = driver.findElementById("firstNameField").getText();
	     driver.findElementById("lastNameField").sendKeys("S");
	     driver.findElementById("createContactForm_firstNameLocal").sendKeys("Gayu");
	     driver.findElementById("createContactForm_lastNameLocal").sendKeys("S");
	     driver.findElementById("createContactForm_personalTitle").sendKeys("Ms");
	     driver.findElementById("createContactForm_generalProfTitle").sendKeys("Test Title");
	     driver.findElementById("createContactForm_departmentName").sendKeys("IT");
	     WebElement currency = driver.findElementById("createContactForm_preferredCurrencyUomId");
	     Select scurrency = new Select (currency);
	     scurrency.selectByValue("INR");
	     driver.findElementById("createContactForm_description").sendKeys("Automating CreateContact");
	     driver.findElementById("createContactForm_importantNote").sendKeys("Important Note");
	     driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("044");
	     driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("26787");
	     driver.findElementById("createContactForm_primaryEmail").sendKeys("gayu.unique@gmail.com");
	     driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9886543219");
	     driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("R");
	     String ToName = driver.findElementById("generalToNameField").getText();
	     driver.findElementById("createContactForm_generalAddress1").sendKeys("address1");
	     driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
	     driver.findElementById("createContactForm_generalPostalCode").sendKeys("600126");
	     driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("126");
	     driver.findElementById("createContactForm_generalAttnName").sendKeys("G");
	     driver.findElementById("createContactForm_generalAddress2").sendKeys("address2");
	     WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
	     Select scountry = new Select(country);
	     scountry.selectByValue("IND");
	     WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
	     Select sstate = new Select(state);
	     sstate.selectByValue("IN-TN");
	     driver.findElementByName("submitButton").click();
	     Thread.sleep(3000);
	    
	    
	     if (ToName.contains(firstName))
	     {
	    	 System.out.println("The first name and to name are same");
	     }
	     else 
	     {
	    	 System.out.println("The first name and to name are not same");
	     }
	     
	    // driver.findElementByClassName("subMenuButton").click();
	     driver.findElementByLinkText("Edit").click();;
	     
	     driver.findElementById("addMarketingCampaignForm_marketingCampaignId").click();
	     WebElement markcamp = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
	     Select scmcamp = new Select (markcamp);
	     scmcamp.selectByValue("CATRQ_AUTOMOBILE");
	     Thread.sleep(3000);
	     
	     driver.findElementByXPath("(//input[@name = 'submitButton'])[2]").click();
	     String valmarkcmp = driver.findElementByXPath("//tr[@class='rowWhite']/td/a").getText();
	     driver.findElementByXPath("(//input[@name = 'submitButton'])[1]").click();
	     Thread.sleep(2000);
	     String mrcupd = driver.findElementById("viewContact_marketingCampaigns_sp").getText();
	     if (valmarkcmp.equals(mrcupd))
	     {
	    	 System.out.println("The marketing value Campaign is same");
	     }
	     else 
	     {
	    	 System.out.println("The marketing value Campaign is not same");
	     }
	     driver.close();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
		
	     
	}

}
