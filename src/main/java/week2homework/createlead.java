package week2homework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class createlead {

	@Test
	public void createLead() throws IOException{
	//@BeforeSuite
	 ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
	 html.setAppendExisting(true);
	 ExtentReports extent = new ExtentReports();
	 extent.attachReporter(html);
	 String testCasessName = "TC001";
	 String testCasesDesc = "Create a new lead in leaf taps";
	// @BeforeTest
	 ExtentTest suiteTest = extent.createTest(testCasessName, testCasesDesc);
	 //@BeforeMethod
	 ExtentTest test = suiteTest.createNode("Leads");//for each row in DP
	
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://leaftaps.com/opentaps/");
	  test.pass("The Browser:Chrome lauched Successfully");
	   MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/createlead.png").build();
		
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		test.fail("The username is not enetered successfully with data - DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Bofa");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gayu");
		driver.findElementById("createLeadForm_lastName").sendKeys("S");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("gayu");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("S");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("MS");
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select sc= new Select(source);
		sc.selectByVisibleText("Employee");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("MS");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("100000");
		WebElement industry =driver.findElementById("createLeadForm_industryEnumId");
		Select sc1= new Select(industry);
		sc1.selectByVisibleText("Computer Software");
		WebElement ownersip =driver.findElementById("createLeadForm_ownershipEnumId");
		Select sc2= new Select(ownersip);
		sc2.selectByVisibleText("Corporation");
		driver.findElementById("createLeadForm_sicCode").sendKeys("0431");
		driver.findElementById("createLeadForm_description").sendKeys("Test Description");
		driver.findElementById("createLeadForm_importantNote").sendKeys("important Notes");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("26787");
		driver.findElementById("createLeadForm_departmentName").sendKeys("GWIM");
		driver.findElementById("createLeadForm_currencyUomId").click();
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select sc3 = new Select (currency);
		sc3.selectByValue("INR");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("5000");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("NSE");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Gayu");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Gayu");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Address1");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Address2");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select sc4 = new Select(state);
		sc4.selectByValue("IN");
		driver.findElementById("createLeadForm_generalCountryGeoId").click();
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select sc5 = new Select(country);
		sc5.selectByValue("IND");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600126");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("126");
		WebElement mc = driver.findElementById("createLeadForm_marketingCampaignId");
		Select sc6 = new Select(mc);
		sc6.selectByVisibleText("Automobile");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9884432408");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("gayu.unique@gmail.com");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/createlead.png");
		FileUtils.copyFile(src, dest);
		//@AfterSuite
		extent.flush();
		driver.findElementByName("submitButton").click();
		
		String firstname= driver.findElementById("viewLead_firstName_sp").getText();
		if(firstname .equals("Gayathri"))
		{ System.out.println("True");}	
		else {System.out.println("False");
		}
	System.out.println(firstname);

	}



	}


