package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class TC002_CreateLeadNeg extends Annotations{
	
	@BeforeTest
	public void setValues()
	{
	excelFName = "PagesNeg";
	testName = "Create Lead Neg";
	testDesc = "Create a lead";
	category = "sanity";
	author = "Gayu";
	moduleName = "Leads";

	}
	
	@Test(dataProvider = "fetchData")
	public void CreateLead(String cname, String fname, String lname, String errmsg)
	{
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cname)
		.typeFirstName(fname)
		.typeLastName(lname)
		.clickSubmitError()
		.errormsg(errmsg);
			
		
	}
	
	
	
}
