package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import util.browserFactory;

public class LoginSteps {

	WebDriver driver = browserFactory.starBrowser();

	@Given("^user is already in Login Page$")
	public void user_is_already_in_Login_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Login - TechFios Test Application - Billing";
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LoginPage logintechfios = PageFactory.initElements(driver, LoginPage.class);
		logintechfios.login(username, password);
	}

	@Then("^AFter Login close the browser$")
	public void after_Login_close_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver.close();
		driver.quit();
	}

}
