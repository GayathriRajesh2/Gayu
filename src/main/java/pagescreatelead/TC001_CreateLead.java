package pagescreatelead;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class TC001_CreateLead extends Annotations{
	
	@BeforeTest
	public void setValues()
	{
	excelFName = "Pages";
	testName = "Create Lead";
	testDesc = "Create a lead";
	category = "sanity";
	author = "Gayu";
	moduleName = "Leads";

	}
	
	@Test(dataProvider = "fetchData")
	public void CreateLead(String cname, String lname, String fname)
	{
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cname)
		.typeFirstName(fname)
		.typeLastName(lname)
		.clickCreateLead();
		
	}
	
	
	
}
