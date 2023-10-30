package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/test/java/feature/TC002_CreateLead.feature"}
                  ,glue="stepsdef",monochrome=true,publish=true)
public class Runner extends AbstractTestNGCucumberTests{
	
}
