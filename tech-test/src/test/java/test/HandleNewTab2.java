package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNewTab2 {
	
	
WebDriver driver; 
	
	@Before
	public void LaunchBrowser() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.yahoo.com/");
	}
	
	@Test
	public void searchForXpathInYahoo() throws Exception {
		By SEARCH_FIELD_LOCATOR = By.cssSelector("input#header-search-input");
		By W3_LINK_LOCATOR = By.linkText("XPath Tutorial - w3schools.com");
		By SQL_LINK_LOCATOR = By.linkText("SQL");
		
		
		driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys("xpath");
		Thread.sleep(1500);
		driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		driver.findElement(W3_LINK_LOCATOR).click();
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getWindowHandle());
		
		for (String windowHandle: driver.getWindowHandles()) {
		
			driver.switchTo().window(windowHandle);	
		}
	driver.findElement(SQL_LINK_LOCATOR).click();	
		Thread.sleep(2500);
	}
	
	
	
	
	@After
	public void closeEverything() {
		
		driver.close();
		driver.quit();
	}
}
