package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="/Users/Marsh/Selenium/CucumberTecFios2/src/test/java/features/NewAccount.feature", 
		glue= {"steps"}

		
		
		)



public class NewAccountRunner {

}
