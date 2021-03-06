package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginClass {
	
	WebDriver driver; 
	
	public loginClass(WebDriver driver) {
		this.driver=driver; 
		
	
	}
	
	
	@FindBy(how=How.ID, using="username")
	WebElement UserNmae;
	
	@FindBy(how=How.ID, using="password")
	WebElement Password; 
	
	@FindBy(how=How.NAME, using="login")
	WebElement SigninButton;
	
	
	public void login() {
		UserNmae.sendKeys("techfiosdemo@gmail.com");
		Password.sendKeys("abc123");
		SigninButton.click();
	}
	


public String getPageTitle() {
	
	return driver.getTitle();	 


}
}
