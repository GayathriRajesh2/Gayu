package weeek2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcWebPage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","D:\\Gayathri\\TestLeaf\\Softwares\\drivers\\chromedriver.exe");
   ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
   driver.findElementById("userRegistrationForm:userName").sendKeys("gayathri");
   driver.findElementById("userRegistrationForm:password").sendKeys("pass123");
   driver.findElementById("userRegistrationForm:confpasword").sendKeys("pass123");
   WebElement secqs = driver.findElementById("userRegistrationForm:securityQ");
   Select sc = new Select(secqs);
   sc.selectByValue("0");
   driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("tommy");
   WebElement language = driver.findElementById("userRegistrationForm:prelan");
   Select sl = new Select(language);
   sl.selectByIndex(1);
   driver.findElementById("userRegistrationForm:firstName").sendKeys("Gayathri");
   driver.findElementById("userRegistrationForm:lastName").sendKeys("Sampath");
   WebElement gender = driver.findElementById("userRegistrationForm:gender:1");
   gender.click();
   WebElement maritalstatus = driver.findElementById("userRegistrationForm:maritalStatus:0");
   maritalstatus.click();
   WebElement dayofBirth = driver.findElementById("userRegistrationForm:dobDay");
   Select db = new Select (dayofBirth);
   db.selectByIndex(1);
   WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
   Select dm = new Select (month);
   dm.selectByIndex(5);
   WebElement yearofbirth = driver.findElementById("userRegistrationForm:dateOfBirth");
   Select yb = new Select (yearofbirth);
   yb.selectByVisibleText("1984");
   WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
   Select occ = new Select(occupation);
   occ.selectByIndex(4);
   WebElement country = driver.findElementById("userRegistrationForm:countries");
   Select ctry =new Select (country);
   ctry.selectByVisibleText("India");
   driver.findElementById("userRegistrationForm:email").sendKeys("gayu.unique@gmail.com");
   driver.findElementById("userRegistrationForm:isdCode").isEnabled();	
   driver.findElementById("userRegistrationForm:mobile").sendKeys("9884432408",Keys.TAB);
   WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
   Select nat = new Select (nationality);
   nat.selectByVisibleText("India");
   driver.findElementById("userRegistrationForm:address").sendKeys("24A, Bollineni Hills");
   driver.findElementById("userRegistrationForm:pincode").sendKeys("600126",Keys.TAB);
   Thread.sleep(5000);
   driver.findElementById("userRegistrationForm:statesName").isEnabled();
   System.out.println("Good evening");
   WebElement city = driver.findElementById("userRegistrationForm:cityName");
   Select ct = new Select (city);
   ct.selectByIndex(0);
   Thread.sleep(3000);
   WebElement postoffice = driver.findElementById("userRegistrationForm:postofficeName");
   Select po = new Select (postoffice);
   po.selectByIndex(3);
   driver.findElementById("userRegistrationForm:landline").sendKeys("9884432408");
   }
   
   
 
   
	}

	
	



