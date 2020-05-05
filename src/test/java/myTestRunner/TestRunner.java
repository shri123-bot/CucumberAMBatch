package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="features",
		features="C:\\Users\\Home\\eclipse-workspace\\CucumberAMBatch\\features\\Tagging.feature",
		glue="stepDefinitions",
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		dryRun=false,
		monochrome=true,
		strict=false,
		//tags= {"@SanityTest"} //execute only sanity tests
		
		//tags= {"@SanityTest,@RegressionTest"} // execute sanity or regression tests
		
	     //tags= {"@RegressionTest","@End2End"} // execute regression and end2end tests
		
		//tags={"@SanityTest","@End2End"} // execute sanity and end2end tests
		
		 //tags={"~@End2End"}  //this will ignore end2end tests
			
		  tags={"~@End2End","~@SanityTest"} // will ignore sanity and end2end
		)

public class TestRunner {

}
