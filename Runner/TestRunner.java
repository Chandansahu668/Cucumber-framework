package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:/Users/Chandan/eclipse-workspace/FreeCrmBDDFramework/src/main/java/features/*.feature", //the path of the feature files
			glue={"stepDefination"} //the path of the step definition files
			
			)

public class TestRunner {


}
