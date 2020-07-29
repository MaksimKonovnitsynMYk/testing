package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {

	@Test
	public void techFileSiteShouldOpen(){
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
