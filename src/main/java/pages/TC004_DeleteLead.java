package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class TC004_DeleteLead extends Annotations{

	@BeforeTest
	public void setValues()
	{
	excelFName = "DeleteLead";
	testName = "Delete Lead";
	testDesc = "Delete a lead";
	category = "sanity";
	author = "Gayu";
	moduleName = "Leads";

	}

	@Test(dataProvider = "fetchData")
	public void DeleteLead(String ctrycode, String areacode, String phoneno)
	{
		new MyHomePage()
		.clickLeads()
		.clickFindLead()
		.clickphonetab()
		.typephctrycode(ctrycode)
		.typephareacode(areacode)
		.typephoneno(phoneno)
		.clickFindLeadsbtn()
		.getcaptureid()
		.clickFirstLink()
		.clickdeletebtn()
		.clickFindLead()
		.typeLeadId()
		.clickFindLeadsbtn();
}
}