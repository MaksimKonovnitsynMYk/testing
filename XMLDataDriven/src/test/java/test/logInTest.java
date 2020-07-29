package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.loginClass;
import util.browserFactory;

public class logInTest {
	
	
	String username;
	String password;
	
	@Test
	@Parameters({"username", "password"})
	public void techFiosLogin(String username, String password) {
	WebDriver driver = browserFactory.starBrowser();	
	
	loginClass logintowebsite = PageFactory.initElements(driver, loginClass.class);
		
	logintowebsite.login(username, password);
	
	
	driver.close();
	driver.quit();
	}

	
	
	
}
