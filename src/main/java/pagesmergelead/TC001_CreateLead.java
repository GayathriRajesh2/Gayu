package pagesmergelead;

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
	
	
	
	
}
