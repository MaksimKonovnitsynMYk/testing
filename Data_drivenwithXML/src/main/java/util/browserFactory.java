package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserFactory {
	
	static WebDriver driver;

	public static WebDriver starBrowser () {

	System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	
	return driver;
	
}
}
