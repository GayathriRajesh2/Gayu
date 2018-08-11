package week4.day2;

import org.junit.Test;

import wdMethods.SeMethods;

public class CreateContactSEMethod extends SeMethods{

	@Test
	public void CreateLead() throws InterruptedException
	{
		startApp("chrome", "http://leaftaps.com/opentaps/");
		
		type(locateElement("id","username"), "DemoSalesManager");
		type(locateElement("id","password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
		click(locateElement("linkText","Create Contact"));
	     type(locateElement("id","firstNameField"),"Gayathri");
	    // String firstName = driver.findElementById("firstNameField").getText();
	     getText(locateElement("firstNameField"));
	     type(locateElement("id","lastNameField"), "S");
	     type(locateElement("id","createContactForm_firstNameLocal"),"Gayu");
	     type(locateElement("id","createContactForm_lastNameLocal"), "S");
	     type(locateElement("id","createContactForm_personalTitle"),"Ms");
	     type(locateElement("id","createContactForm_generalProfTitle"),"Test Title");
		 type(locateElement("id","createContactForm_departmentName"),"IT");
	     selectDropDownUsingValue(locateElement("createContactForm_preferredCurrencyUomId"), "INR");
	     type(locateElement("id","createContactForm_description"),"Automating CreateContact");
	     type(locateElement("id","createContactForm_importantNote"),"Important Note");
	     type(locateElement("id","createContactForm_primaryPhoneAreaCode"),"044");
	     type(locateElement("id","createContactForm_primaryPhoneExtension"),"26787");
	     type(locateElement("id","createContactForm_primaryEmail"),"gayu.unique@gmail.com");
	     type(locateElement("id","createContactForm_primaryPhoneNumber"),"9886543219");
	     type(locateElement("id","createContactForm_primaryPhoneAskForName"),"R");
	     getText(locateElement("generalToNameField"));
	     type(locateElement("createContactForm_generalAddress1"),"address1");
	     type(locateElement("createContactForm_generalCity"),"Chennai");
	     type(locateElement("createContactForm_generalPostalCode"),"600126");
	     type(locateElement("createContactForm_generalPostalCodeExt"),"126");
	     type(locateElement("createContactForm_generalAttnName"),"G");
	     type(locateElement("createContactForm_generalAddress2"),"address2");
	     selectDropDownUsingValue(locateElement("createContactForm_generalCountryGeoId"), "IND");
	     selectDropDownUsingValue(locateElement("createContactForm_generalStateProvinceGeoId"), "IN-TN");
	     clickNoSnap(locateElement("name","submitButton"));
	     timeouts();
	     if (getText(locateElement("generalToNameField")).contains(getText(locateElement("firstNameField"))))
	     {
	    	 System.out.println("The first name and to name are same");
	     }
	     else 
	     {
	    	 System.out.println("The first name and to name are not same"); 
	     }
	 	 timeouts();
	 	 click(locateElement("LinkText","Edit"));
	 	 timeouts();
	 	 
	 	 click(locateElement("id","addMarketingCampaignForm_marketingCampaignId"));
	 	 selectDropDownUsingValue(locateElement("addMarketingCampaignForm_marketingCampaignId"), "AUTOMOBILE");
	     timeouts();
	     
	     click(locateElement("xpath","(//input[@name = 'submitButton'])[2]"));
	     timeouts();
	     
	     
	     getText(locateElement("xpath","//tr[@class='rowWhite']/td/a"));
	     click(locateElement("xpath","(//input[@name = 'submitButton'])[1]"));
	     timeouts();
	     getText(locateElement("id","viewContact_marketingCampaigns_sp"));
	     if (getText(locateElement("xpath","//tr[@class='rowWhite']/td/a")).contains(getText(locateElement("id","viewContact_marketingCampaigns_sp"))))
	     {
	    	 System.out.println("The marketing value Campaign is same");
	     }
	     else 
	     {
	    	 System.out.println("The marketing value Campaign is not same");
	     }
	     closeBrowser();
	     
	     
	     
	}
}
