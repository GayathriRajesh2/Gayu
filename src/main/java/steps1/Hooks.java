package steps1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
	
	@Before()
	public void before(Scenario sc)
	{
		beginResult();
		startTest(sc.getName(),sc.getName());
		//startTestIteration("CreateLead","Gayu","Sanity");
		//startTestIteration("DeleteLead","Gayu","Sanity");
		startTestIteration("DuplicateLead","Gayu","Sanity");
		startApp("chrome", "http://leaftaps.com/opentaps");
		/*sc.getName();
		System.out.println(sc.getName());
		sc.getId();
		System.out.println(sc.getId());
	}*/
		
	}
	
	@After()
	public void after(Scenario sc)
	{
		/*sc.getStatus();
		System.out.println(sc.getStatus());
		sc.isFailed();
		System.out.println(sc.isFailed());*/
	    closeBrowser();
	    endResult();
	    
	
	}
	

}
