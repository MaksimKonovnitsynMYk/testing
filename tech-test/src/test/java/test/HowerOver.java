package test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowerOver {
	WebDriver driver; 
	
	@Before
	public void LaunchBrowser() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	}	
	
	@Test
	public void hoverOverTest() {
		
		
		
	}
}

	
