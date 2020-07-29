package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.browserFactory;

public class LoginSteps {
	WebDriver driver;
	String username = "";
	String password = "";

	@Given("^a valid user$")
	public void a_valid_user() throws Throwable {
		username = "techfionsdemo@gmail.com";
		password = "abc123";
	}

	@When("^user goes to techfios site$")
	public void user_goes_to_techfios_site() throws Throwable {
		driver = browserFactory.starBrowser();

	}

	@Then("^techfios site should display$")
	public void techfios_site_should_display() throws Throwable {
		String expectedTitle = "Login - TechFios Test Application - Billing";
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		String actualTile = loginPage.getPageTitle();
		Assert.assertEquals("Titles did not match", expectedTitle, actualTile);

	}

	@When("^user provides valid credentials$")
	public void user_provides_valid_credentials() throws Throwable {

	}

	@Then("^Dashboard page should be displayd$")
	public void dashboard_page_should_be_displayd() throws Throwable {

	}

	@Then("^username should match$")
	public void username_should_match() throws Throwable {

	}

}
