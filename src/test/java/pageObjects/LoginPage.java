package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id='Email']")
	WebElement emailtextBox;

	@FindBy(xpath="//*[@class='password']")
	WebElement passwordTextbox;

	@FindBy(xpath="//*[@class='button-1 login-button']")
	WebElement loginButton;

	public void enterEmailId(String emailid) {
		emailtextBox.sendKeys(emailid);
	}
	
	public void enterpassword(String password) {
		passwordTextbox.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}

}
