package test;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.loginClass;
import util.browserFactory;

public class logInTest {
	@Test
	
	public void techFiosLogin() {
	WebDriver driver = browserFactory.starBrowser();	
	
	loginClass logintowebsite = PageFactory.initElements(driver, loginClass.class);
		
	logintowebsite.login();
	
	
	driver.close();
	driver.quit();
	}

	
	
	
}
