package week2homework;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import wdMethods.SeMethods;

public class CreateLeadSimple {

	public class CreateLead extends SeMethods {
		@Test
		public void login() {
			startApp("chrome", "http://leaftaps.com/opentaps");
			WebElement eleUserName = locateElement("id", "username");
			type(eleUserName, "DemoSalesManager");
			WebElement elePassword = locateElement("id","password");
			type(elePassword, "crmsfa");
			WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleLogin);
			click(locateElement("LinkText","CRM/SFA"));
			click(locateElement("LinkText","Create Lead"));
			verifyTitle("Create Lead");
			type(locateElement("createLeadForm_companyName"),"Bofa");
			type(locateElement("createLeadForm_firstName"),"Gayu");
			type(locateElement("createLeadForm_lastName"),"S");
			type(locateElement("createLeadForm_personalTitle"),"MS");
			selectDropDownUsingText(locateElement("createLeadForm_dataSourceId"),"Conference");
			type(locateElement("createLeadForm_generalProfTitle"),"MS");
			type(locateElement("createLeadForm_annualRevenue"),"10000");
			selectDropDownUsingText(locateElement("createLeadForm_industryEnumId"),"Computer Software");
			selectDropDownUsingText(locateElement("createLeadForm_ownershipEnumId"),"Corporation");
			type(locateElement("createLeadForm_sicCode"),"044");
			type(locateElement("createLeadForm_description"),"Description");
			type(locateElement("createLeadForm_importantNote"),"Testing leaf taps");
			locateElement("createLeadForm_primaryPhoneCountryCode").clear();
			type(locateElement("createLeadForm_primaryPhoneCountryCode"),"91");
			type(locateElement("createLeadForm_primaryPhoneAreaCode"),"044");
			type(locateElement("createLeadForm_primaryPhoneExtension"),"26787");
			type(locateElement("createLeadForm_departmentName"),"GBAMT");
			locateElement("createLeadForm_currencyUomId").click();
			selectDropDownUsingValue(locateElement("createLeadForm_currencyUomId"),"INR");
			type(locateElement("createLeadForm_numberEmployees"),"5000");
			type(locateElement("createLeadForm_tickerSymbol"),"NSE");
			type(locateElement("createLeadForm_primaryPhoneAskForName"),"Pavithra");
			type(locateElement("createLeadForm_primaryWebUrl"),"www.google.com");
			type(locateElement("createLeadForm_generalToName"),"Gayathri");
			type(locateElement("createLeadForm_generalAddress1"),"address1");
			type(locateElement("createLeadForm_generalAddress2"),"address2");
			type(locateElement("createLeadForm_generalCity"),"Chennai");
			selectDropDownUsingValue(locateElement("createLeadForm_generalStateProvinceGeoId"),"IN");
			selectDropDownUsingValue(locateElement("createLeadForm_generalCountryGeoId"),"IND");
			type(locateElement("createLeadForm_generalPostalCode"),"600126");
			type(locateElement("createLeadForm_generalPostalCodeExt"),"126");
			selectDropDownUsingIndex(locateElement("createLeadForm_marketingCampaignId"),2);
			type(locateElement("createLeadForm_primaryPhoneNumber"),"9884432408");
			type(locateElement("createLeadForm_primaryEmail"),"gayu.unique@gmail.com");
			click(locateElement("name","submitButton"));
			//driver.get("http://leaftaps.com/crmsfa/control/viewLead?partyId=11898");
			String firstname= getText(locateElement("viewLead_firstName_sp"));
			if(firstname .equals("Gayu"))
			{ System.out.println("True");}	
			else {System.out.println("False");
			}
		System.out.println(firstname);
			
			

	}
	
	}
}
