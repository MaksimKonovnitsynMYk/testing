package test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewDepositTest {

	WebDriver driver;

	@BeforeMethod
	public void SearchForXpathInYahoo() {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
	}

	@Test 
	public void userShouldBeAbleToAddDeposite() throws InterruptedException {
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder, 'assword') and @class='form-control']")).sendKeys("abc123");
		// Also possible to use //input[contains(@placeholder, 'assword') and contains(@class, 'form-')]
		// Find element with using text
		driver.findElement(By.xpath("//*[contains(text(), 'Sign in') and @name='login']")).click();
		String expectedTitle = "Dashboard- TechFios Test Application - Billing";
		Assert.assertEquals(driver.getTitle(), expectedTitle, "Dashboard page did't display");
		By TRANSACTIONS_MENU_LOCATOR = By.xpath("//ul[@id='side-menu']/descendant::span[text()='Transactions']");
		By NEW_DEPOSIT_PAGE_LOCATOR = By.linkText("New Deposit");
		
		driver.findElement(TRANSACTIONS_MENU_LOCATOR).click();
	//	waitForElement(NEW_DEPOSIT_PAGE_LOCATOR, driver, 20);
		driver.findElement(NEW_DEPOSIT_PAGE_LOCATOR).click();
	
		//Select an account from DropDown
		
		Select select = new Select(driver.findElement(By.cssSelector("select#account")));
		select.selectByVisibleText("Swimming");
		
		String expectedDescription = "AutomationTest" + new Random().nextInt(999);
		Thread.sleep(2000);
		driver.findElement(By.id("description")).sendKeys(expectedDescription);
		Thread.sleep(2000);
		driver.findElement(By.id("amount")).sendKeys("100,000");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(5000);
	
		
		List<WebElement> descriptionElement = driver.findElements(By.xpath("//table/descendant::a"));
		System.out.println(descriptionElement.get(0).getText());
		
		Thread.sleep(5000);
		 
		Assert.assertTrue(isDescriptionMatch(expectedDescription,descriptionElement), "Deposite unsuccessful!");
		
		//Scroll up and down
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("scroll(0,400)");
				
				// To scroll up use negative number
				//JavascriptExecutor js = (JavascriptExecutor)driver;
				//js.executeScript("scroll(0,-400)");
	}
	private boolean isDescriptionMatch(String expectedDescription, List<WebElement> descriptionElement) {
		
		for (int i=0; i<descriptionElement.size(); i++) {
			if (expectedDescription.equalsIgnoreCase(descriptionElement.get(i).getText())) {
				return true; 
			}
		}	
				
				
		return false;
	}
		
		
	

	private void waitForElement(By locator, WebDriver driver1, int time) {
		new WebDriverWait(driver1,time).until(ExpectedConditions.invisibilityOfElementLocated(locator));
		
	}
	

	@AfterMethod
	public void closeEverything() {

		driver.close();
		driver.quit();

	}
}