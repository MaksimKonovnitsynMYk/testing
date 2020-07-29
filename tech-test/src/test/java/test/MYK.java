package test;

	import java.util.concurrent.TimeUnit;

import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class MYK {
		
		
	WebDriver driver; 
		
		@Before
		public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://vk.com/");
		}
		
		@Test
		public void searchForXpathInYahoo() throws Exception {
			By SEARCH_FIELD_LOCATOR = By.cssSelector("input#header-search-input");
			By W3_LINK_LOCATOR = By.linkText("XPath Tutorial - w3schools.com");
			By LOGIN = By.className("big_text");
			By PASSWORD = By.xpath("");
			
			driver.findElement(LOGIN).sendKeys("konovnicin@gmail.com");
			Thread.sleep(1500);
			driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys(Keys.ENTER);
			Thread.sleep(1500);
			driver.findElement(W3_LINK_LOCATOR).click();
			Thread.sleep(1500);
			
			
		}
		
		
		
		@After
		public void closeEverything() {
			
			driver.close();
			driver.quit();
		}
	}


