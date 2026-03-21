package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoHomePage extends BasePage {

	public DemoHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@class='ico-logouts']")
	WebElement logoutButton;
	
	public boolean verifyLogoutButton() {
		logoutButton.isDisplayed();
		return true;
	}
	
	public void clickLogout() {
		logoutButton.click();	
	}

}
