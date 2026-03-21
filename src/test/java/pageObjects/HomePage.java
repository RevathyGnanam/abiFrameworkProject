package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[@class='ico-register']")
	WebElement registerLink;
	
	@FindBy(xpath="//*[@class='ico-login']")
	WebElement loginLink;
	
	public void clickRegister() {
		registerLink.click();
	}

	public void clickLogin() {
		loginLink.click();
	}





}
