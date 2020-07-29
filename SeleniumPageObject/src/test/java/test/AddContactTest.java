package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import pages.ContactPage;
import pages.DashboardPage;
import pages.loginClass;
import util.browserFactory;

public class AddContactTest {

@Test
	
	public void AddingContact() throws InterruptedException {
	WebDriver driver = browserFactory.starBrowser();	
	
	loginClass logintowebsite = PageFactory.initElements(driver, loginClass.class);
		
	logintowebsite.login();
	
	String expectedTitle = "Dashboard- TechFios Test Application - Billing";
	String actualTitle = logintowebsite.getPageTitle();
	Assert.assertEquals(expectedTitle, actualTitle, "Title did not match");
	
	Thread.sleep(2000);
	DashboardPage Dashboard = PageFactory.initElements(driver, DashboardPage.class);
	Dashboard.isCustomerBoxDisplayed();
	Dashboard.ClickAddContact();
	Thread.sleep(2000);
	ContactPage contact = PageFactory.initElements(driver, ContactPage.class);
	contact.FillUpContactForm();
	
	
	driver.close();
	driver.quit();
}
}

