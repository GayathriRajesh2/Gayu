package wdMethods;


import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


import excelreader.ReadExcelDp;

public class Annotations extends SeMethods {
	
	public String excelFName, testName,testDesc, category,author, moduleName;

	@BeforeSuite
	public void StartsSuite()
	{
		beginResult();
	}
	@BeforeClass
	public void startTest()
	{
		startTest(testName,testDesc);
	}
	
	@Parameters({"url", "uname", "pword"})
	@BeforeMethod(groups = {"smoke", "sanity"})
	

	public void loginBroswer(String url, String uname, String pword)
	{
		
		startTestIteration(moduleName,author,category);
		startApp("chrome", url);
		type(locateElement("id","username"), uname );
		type(locateElement("id","password"), pword);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));
	}
	
	@AfterMethod(groups = {"smoke", "sanity"})
	
	public void closeApp()
	{
		closeBrowser();
	}

	@AfterSuite
	public void stopSuite ()
	{
		endResult();
	}
	
@DataProvider(name = "fetchData")
public Object [][] getData() throws IOException 
{
	
	ReadExcelDp excel = new ReadExcelDp();
	return excel.readExcelDp(excelFName);
	
}

	
}


