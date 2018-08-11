package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/pageseditlead/EditLeadHooks.feature",
							glue = {"steps1","pageseditlead"}, monochrome = true)

public class RunCuicksEditLead {

}
