package Runner;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;



@CucumberOptions(
		features = "C://Users//Rajeev//git//YourLogoTest//YourLogo//src//main//java//Features", //the path of the feature files
		glue={"StepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}		
		)

public class TestRunner extends AbstractTestNGCucumberTests
{
	private TestNGCucumberRunner testngCucumberrunner;
	
	@BeforeClass
	public void SetupClass()
	{
		testngCucumberrunner = new TestNGCucumberRunner(this.getClass());
	}
	
	 @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
		 testngCucumberrunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }
	 
	    @DataProvider
	    public Object[][] features() {
	    	 if(testngCucumberrunner == null){
	    	        testngCucumberrunner = new TestNGCucumberRunner(this.getClass());
	    	    }
	        return testngCucumberrunner.provideFeatures();
	    }
	 
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	    	testngCucumberrunner.finish();
	    }
}


