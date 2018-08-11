package testcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelreader.ReadExcelDp;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class CreateLead extends Annotations {
   
	 
	@Test(groups = {"smoke"}, dataProvider = "createData")
	//@Test(dataProvider = "createData")
	//@Test(groups = {"smoke"})
	//@Test(dataProvider = "fetchData")
	
   public void CreateLead(String cname, String lname, String fname, String title, String srcid)
   {
		
    	/*startApp("chrome", "http://leaftaps.com/opentaps");
	   WebElement eleUserName = locateElement("id", "username");
	   type(eleUserName, "DemoSalesManager");
	   WebElement elePassword = locateElement("id", "password");
	   type(elePassword, "crmsfa");
	   WebEleme3nt eleLogin = locateElement("class","decorativeSubmit");
	   click(eleLogin);
	   click(locateElement("LinkText", "CRM/SFA"));*/

	   click(locateElement("LinkText","Create Lead"));
	   type(locateElement("createLeadForm_companyName"), cname);
	   type(locateElement("createLeadForm_lastName"),lname);
	   type(locateElement("createLeadForm_firstName"),fname);
	   type(locateElement("createLeadForm_personalTitle"),title);
	    selectDropDownUsingText(locateElement("createLeadForm_dataSourceId"), srcid);
	    type(locateElement("createLeadForm_generalProfTitle"), "Test Title");
	    type(locateElement("createLeadForm_annualRevenue"),"100000");
	    selectDropDownUsingText(locateElement("createLeadForm_industryEnumId"),"Computer Software");
	    selectDropDownUsingText(locateElement("createLeadForm_ownershipEnumId"),"Corporation");
	    type(locateElement("createLeadForm_sicCode"),"2345");
	    type(locateElement("createLeadForm_description"),"Test Description");
	    type(locateElement("createLeadForm_importantNote"),"To automate Create Lead");
	    type(locateElement("createLeadForm_primaryPhoneCountryCode"),"91");
	    type(locateElement("createLeadForm_primaryPhoneAreaCode"),"044");
	    type(locateElement("createLeadForm_primaryPhoneExtension"),"26787");
	    type(locateElement("createLeadForm_departmentName"),"GWIM");
	    selectDropDownUsingText(locateElement("createLeadForm_currencyUomId"),"INR - Indian Rupee");
	    type(locateElement("createLeadForm_numberEmployees"),"7000");
	    type(locateElement("createLeadForm_tickerSymbol"),"abcd");
	    type(locateElement("createLeadForm_primaryPhoneAskForName"),"R");
	    type(locateElement("createLeadForm_primaryWebUrl"),"www.google.com");
	    type(locateElement("createLeadForm_generalToName"), "Gayu");
	    type(locateElement("createLeadForm_generalAddress1"),"address1");
	    type(locateElement("createLeadForm_generalAddress2"), "address2");
	    type(locateElement("createLeadForm_generalCity"),"Chennai");
	    selectDropDownUsingText(locateElement("createLeadForm_generalCountryGeoId"),"India");
	    selectDropDownUsingText(locateElement("createLeadForm_generalStateProvinceGeoId"),"TAMILNADU");
	    type(locateElement("createLeadForm_generalPostalCode"), "600126");
	    type(locateElement("createLeadForm_generalPostalCodeExt"), "126");
	    selectDropDownUsingIndex(locateElement("createLeadForm_marketingCampaignId"),2);
	    type(locateElement("createLeadForm_primaryPhoneNumber"),"9884432408");
	    type(locateElement("createLeadForm_primaryEmail"),"gayu.unique@gmail.com");
	    click(locateElement("name", "submitButton"));
	    verifyExactText(locateElement("viewLead_firstName_sp"), "Gayu");
	    	  
	 }
  
@DataProvider(name = "createData")

public Object [][] getData() throws IOException
{
	ReadExcelDp read = new ReadExcelDp();
	return(read.readExcelDp("CreateLead"));

}

}
