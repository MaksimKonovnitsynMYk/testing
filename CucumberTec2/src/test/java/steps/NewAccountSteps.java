package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashboardPage;

public class NewAccountSteps {
	WebDriver driver;
	
	@When("^user clicks New Account$")
	public void user_clicks_New_Account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("^user inputs \"([^\"]*)\" nad \"([^\"]*)\" nad \"([^\"]*)\"$")
	public void user_inputs_nad_nad(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   DashboardPage dash=PageFactory.initElements(driver, NewAccountPage.class);
	}

	@When("^click submit$")
	public void click_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("^After Login close the browser$")
	public void after_Login_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	
	
	
	
}
