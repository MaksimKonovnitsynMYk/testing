package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactPage {

WebDriver driver; 
	
	public ContactPage(WebDriver driver) {
		this.driver=driver; 
	}
	
	
	@FindBy(how=How.ID, using="account")
	WebElement FullName;
	
	@FindBy(how=How.ID, using="company")
	WebElement CompanyName;
	
	@FindBy(how=How.ID, using="email")
	WebElement Email;
	
	@FindBy(how=How.ID, using="phone")
	WebElement Phone;
	
	@FindBy(how=How.ID, using="address")
	WebElement Address;
	
	@FindBy(how=How.ID, using="city")
	WebElement City;
	
	@FindBy(how=How.ID, using="zip")
	WebElement Zip;
	
	@FindBy(how=How.ID, using="state")
	WebElement State;
	
	@FindBy(how=How.ID, using="submit")
	WebElement Submit;
	
	public void FillUpContactForm () {
		
		FullName.sendKeys("John Wich");
		CompanyName.sendKeys("Kill Confirmed");
		Email.sendKeys("DontTouchMyDog");
		Phone.sendKeys("9548008000");
		Address.sendKeys("2099 ne 75 Terrace");
		City.sendKeys("New York");
		Zip.sendKeys("10001");
		State.sendKeys("NY");
		Submit.click();
		
		
		
	}
	
	
	
	
}
