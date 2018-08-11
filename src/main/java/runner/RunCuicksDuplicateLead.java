package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/pagesduplicatelead/DuplicateLeadHooks.feature",
							glue = {"steps1","pagesduplicatelead"}, monochrome = true)


public class RunCuicksDuplicateLead {

}
