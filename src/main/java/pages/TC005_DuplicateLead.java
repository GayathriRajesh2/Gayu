package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class TC005_DuplicateLead extends Annotations {
 
	@BeforeTest
	public void setValues()
	{
	excelFName = "DuplicateLead";
	testName = "Duplicate Lead";
	testDesc = "Duplicate a lead";
	category = "sanity";
	author = "Gayu";
	moduleName = "Leads";

	}
	
	@Test(dataProvider = "fetchData")
	public void DeleteLead(String email, String eleverifytitle)
	{
		new MyHomePage()
		.clickLeads()
		.clickFindLead()
		.clickEmailtab()
		.typeemail(email)
		.clickFindLeadsbtn()
		.clickFirstLink()
		.getcapturename()
		.clickduplicatebtn()
		.checktitle(eleverifytitle)
		.clickCreateLeadbtn()
		.verifyFirstName();
		//.closeBrowser();
		
		
		
		
		
		
	}
}
