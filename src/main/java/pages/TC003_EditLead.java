package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class TC003_EditLead extends Annotations {

	@BeforeTest
	public void setValues()
	{
	excelFName = "EditLead";
	testName = "Edit Lead";
	testDesc = "Edit a lead";
	category = "sanity";
	author = "Gayu";
	moduleName = "Leads";

	}


@Test(dataProvider = "fetchData")
public void EditLead(String fname, String compname, String updcompname)
{
	new MyHomePage()
	.clickLeads()
	.clickFindLead()
	.typeFirstName(fname)
	.clickFindLeadsbtn()
	.clickFirstLink()
	.clickEditbtn()
	.typecompanyname(compname)
	.clickupdbtn()
	.verifyUpdcompname(updcompname);
	
	
	
	
	
	
	
	
	
	
	
	
    
	

	
	
	
}
}