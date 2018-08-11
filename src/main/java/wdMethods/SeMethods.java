package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.management.RuntimeErrorException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import extentreports.ReportsLearning;

public class SeMethods extends ReportsLearning implements WdMethods{
	
	public static RemoteWebDriver driver ;
	public static String firstResLeadId, firstResLeadName;
	int i = 1;
	
	public void startApp(String browser, String url) {
		try {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
			 driver = new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//System.out.println("The Browser "+browser+" is Launched Successfully");
		reportStep("The Browser \" + browser + \"is Launched successfully", "pass");
		}
		catch (WebDriverException e )
		{
			//System.err.println("WebDriverException has occured");
			reportStep("WebDriverException has occured", "fail");
		}
		catch(Exception e)
		{
			//System.err.println("Exception has occured");
			reportStep("Exception has occured", "fail");
		}
		finally
		{
			takeSnap();
		}
		
		
	}

	public WebElement locateElement(String locator, String locValue) {
		
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "LinkText" : return driver.findElementByLinkText(locValue);
			case "name" : return driver.findElementByName(locValue);
			}
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException Exception is  thrown");
			reportStep("NoSuchElementException has occured", "fail");
			//e.printStackTrace();
			
		}
		catch (WebDriverException e) {
			//System.err.println("WebDriber Exception is  thrown");
			reportStep("WebDriverException has occured", "fail");
        	throw new RuntimeException();
	
	}
		return null;
	}
	
	

	public WebElement locateElement(String locValue) {
		WebElement ele = null;
		try {
			ele =  driver.findElementById(locValue);
			//reportStep(" has been located by ID successfully","Pass");
		   }
		catch (NoSuchElementException e)
		{
			//System.err.println("NosuchElementException occured");
			reportStep("NosuchElementException occured","Fail");
		}
		catch (Exception e)
		{
		//System.err.println("Exception occured");
			reportStep("Exception occured","Fail");
		}
		return ele;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			//System.out.println("The Data "+data+" is Entered Successfully");
			reportStep("The Data " + data + " is Entered Successfully","Pass");
			takeSnap();
		} catch (WebDriverException e) {
			
				//System.err.println("WebDriber Exception is  thrown");
			    reportStep("WebDriverException occured","Fail");
			}
			catch (Exception e) 
				{
					//System.err.println("Exception is  thrown");
				reportStep("Exception occured","Fail");
					throw new RuntimeException();
				}
				finally
				{
					takeSnap();
				}
			//e.printStackTrace();
		
	}

	public void click(WebElement ele) {
	
		try {
		ele.click();
		//System.out.println("The Element "+ele+" is clicked Successfully");
		reportStep("The Element " + ele + " is clicked Successfully","Pass");
		
		takeSnap();
	} catch (WebDriverException e) {
		//System.out.println("WebDriber Exception is  thrown");
		reportStep("WebDriverException occured","Fail");
	}
	catch (Exception e) 
	{
		//System.out.println("Exception is  thrown");
		reportStep("Exception occured","Fail");
		e.printStackTrace();
		throw new RuntimeException();
		
	}
	finally
	{
		takeSnap();
		
	}		
}
	
	public void clickNoSnap(WebElement ele) {
		try
		{
		ele.click();
		//System.out.println("The Element "+ele+" is clicked Successfully");
		reportStep("The Element " + ele + " is clicked Successfully","Pass");
	    } 
		catch(Exception e)
		{
		//System.err.println("Exception has occured");
		reportStep("Exception occured","Fail");
		}
	}
	
	public String getText(WebElement ele) {
		try
		{
			//System.out.println("Text is " + ele.getText());
			reportStep("Text is " + ele.getText(),"Pass");
			return ele.getText();
		}
		catch (Exception e)
		{
			//System.err.println("Exception has occured");
			reportStep("Exception occured","Fail");
			return null;
		}
		//String text = ele.getText();
		//System.out.println(text);
		//return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		
		// TODO Auto-generated method stub
		try
		{
		Select sctxt = new Select(ele);
		sctxt.selectByVisibleText(value);
		//System.out.println("The value selected in dropdown is " + value);
		reportStep("The value selected in dropdown is " + value,"pass");
		} 
		catch(ElementNotVisibleException e)
		{
			//System.err.println("ElementNotVisibleException occured");
			reportStep("ElementNotVisibleException occured","Fail");
			throw new RuntimeException();
		}
		catch(Exception e)
		{
			//System.err.println("Exception occured");
			reportStep("Exception occured","Fail");
		}
		finally {
			takeSnap();	
		}
		
			
	}

	public void selectDropDownUsingIndex(WebElement ele, int value) {
		// TODO Auto-generated method stub
		Select scidx = new Select(ele);
		scidx.selectByIndex(value);
		//System.out.println("The value select in dropdown is" + value);
		reportStep("The value select in dropdown is" + value, "Pass");
		takeSnap();	
	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select scvalue = new Select(ele);
		scvalue.selectByValue(value);
		//System.out.println("The value select in dropdown is" + value);
		reportStep("The value select in dropdown is" + value, "Pass");
		takeSnap();	
	}


	
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		String title = driver.getTitle();
		boolean bReturn = false;
		
		if (title.equals(expectedTitle))
		{
			System.out.println("Title is verified Successfully " + title + " = " + "expected Tile");
			reportStep("Title is matched","Pass");
			bReturn = true;
		}
		else 
		{
			System.out.println(title + " <> " + "expected Tile");
			reportStep("Title is not matched","Fail");
		}
		return bReturn;
	} 
	
	
	public void verifyExactText(WebElement ele, String expectedText) {
     String extext = ele.getText();
     if (extext.equals(expectedText))
     {
    	// System.out.println("The value of text is " + "= " +expectedText);
    	 reportStep("Exact Text is matched","Pass");
     }
     else 
     {
    	 //System.out.println("The value of text is" + "<>" + expectedText );
    	 reportStep("Exact Text is not matched","Fail");
     }
		
	}

	
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String partxt = ele.getText();
		if(partxt.contains(expectedText))
			//System.out.println("Text is partially same " + partxt + "="+ expectedText );
			reportStep("Partial Text is matched","Pass");
		else 
		{
			//System.out.println("Text is not partially same " + partxt + "=" + expectedText );
			reportStep("Partial Text is not matched","Fail");
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
	if(ele.getAttribute(attribute).equals(value))
	{
		//System.out.println("The value is same " + attribute + " = " + value);
		reportStep("Exact Attribute Value is matched","Pass");
	}
	else 
	{
		//System.out.println("The value is same " + attribute + " <> " + value);
		reportStep("Exact Attribute value is not matched","Fail");
	}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		if(ele.getAttribute(attribute).contains(value)) {
			//System.out.println("Text is Partially verified "+attribute+"="+value);
			reportStep("Partial Attribute Value is matched","Pass");
		}
		 else 
		{
			//System.out.println("Text is Partially verified "+attribute+"<>"+value);
			 reportStep("Partial Attribute value is not matched","Fail");
		}
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		boolean verselect = ele.isSelected();
		System.out.println(verselect);
			
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		boolean isdisplayed = ele.isDisplayed();
		System.out.println(isdisplayed);
	}

	public void switchToWindow(int index) {
		try {
			Set<String> allwindowhandles = driver.getWindowHandles();
			List <String> listOfWindowhandles = new ArrayList <String>();
			listOfWindowhandles.addAll(allwindowhandles);
			driver.switchTo().window(listOfWindowhandles.get(index));
		} catch (NoSuchWindowException e) {
			//System.err.println("NoSuchWindowException is thrown");
			reportStep("NoSuchWindowException has occured","Fail");
			throw new RuntimeException();
			//e.printStackTrace();
		}
		catch (NoSuchSessionException e) {
			//System.err.println("NoSuchSessionException is thrown");
			reportStep("NoSuchSessionException has occured","Fail");
			throw new RuntimeException();
		}
		catch (WebDriverException e) {
			
			System.err.println("WebDriber Exception is  thrown");
		}
		catch (Exception e) 
			{
				//System.err.println("Exception is  thrown");
			reportStep("Exception has occured","Fail");
				throw new RuntimeException();
			}
			finally
			{
				takeSnap();
			}
		
	}

	public void switchToFrame(WebElement ele) {
		
		// TODO Auto-generated method stub
		try {
			WebDriver frame = driver.switchTo().frame(ele);
			//System.out.println("The Window is switched to " + frame);
			reportStep("The Window is switched to " + frame,"pass");
		} catch (NoSuchFrameException e) {
			//System.err.println("NoSuchWindowException is thrown");
			reportStep("NoSuchWindowException is thrown","fail");
			throw new RuntimeException();
		}
			catch (NoSuchSessionException e) {
				//System.err.println("NoSuchSessionException is thrown");
				reportStep("NoSuchSessionException is thrown", "fail");
				throw new RuntimeException();
			}
			catch (WebDriverException e) {
				
				//System.err.println("WebDriber Exception is  thrown");
				reportStep("WebDriber Exception is  thrown", "fail");
			}
			catch (Exception e) 
				{
					//System.err.println("Exception is  thrown");
				reportStep("Exception is  thrown", "fail");
					throw new RuntimeException();
				}
				finally
				{
					takeSnap();
				}
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
		}
		catch(NoAlertPresentException e)
		{
			System.err.println("NoAlertPresentException is thrwon");
			throw new RuntimeException();
		}
		
		catch(UnhandledAlertException e)
		{
			System.err.println("UnhandledAlertException is thrown");
			throw new RuntimeException();
		}
		
		catch (WebDriverException e) {
			
			System.err.println("WebDriber Exception is  thrown");
		}
		catch (Exception e) 
			{
				System.err.println("Exception is  thrown");
				throw new RuntimeException();
			}
			finally
			{
				takeSnap();
			}
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			System.err.println("NoAlertPresentException is thrwon");
			throw new RuntimeException();
			//e.printStackTrace();
		}
			catch (WebDriverException e) {
			
			System.err.println("WebDriber Exception is  thrown");
		}
			catch (Exception e) 
			{
				System.err.println("Exception is  thrown");
				throw new RuntimeException();
			}
			finally
			{
				takeSnap();
			}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		try {
			String str = driver.switchTo().alert().getText();
			System.out.println(str);
			return str;
		} catch (WebDriverException e) {
			System.err.println("WebDriverException is  thrown");
			//e.printStackTrace();
		}
		catch (Exception e) 
		{
			System.err.println("Exception is  thrown");
			throw new RuntimeException();
		}
		finally
		{
			takeSnap();
		}
		return null;
		
	}
	
	public void timeouts() throws InterruptedException
	{
		Thread.sleep(3000);
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		try {
			driver.close();
			//System.out.println("Current browser is closed");
			reportStep("Current browser is closed","Pass");
		}
		catch (WebDriverException e) {
			//System.err.println("Webdriver exception has occurred");
			reportStep("WebDriverException has occured","Fail");
		}catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception has occured","Fail");
		}
	}
		
	

	public void closeAllBrowsers() {
		
		try {
			driver.quit();
			//System.out.println("All browsers are closed");
			reportStep("All browsers are closed","Pass");
		} catch (WebDriverException e) {
			//System.err.println("Webdriver exception has occurred");
			reportStep("WebDriverException has occured","Fail");
		}catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception has occured","Fail");
		}

	}
}


