package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class
TC_01_CreateAccountRegistration extends BaseClass {
	
	@Test(groups= {"Regression","Smoke"})
	public void accountRegistration() {
		//click on register button from home page
		HomePage homepage = new HomePage(driver);
		homepage.clickRegister();
		
		AccountRegPage accpage = new AccountRegPage(driver);
		accpage.selectGender();
		accpage.enterFirstName(randomString());
		accpage.enterLastName(randomString());
		accpage.enterEmailId(randomAlphaNumeric()+"@gmail.com");
		String password = randomAlphaNumericForPasswords();
		accpage.enterPassword(password);
		accpage.enterConfirmPassword(password);
		accpage.clickRegister();
		String actualTitle = accpage.getTitle();
		String expectedTitle = accpage.getTitleTextBox();
		Assert.assertEquals(actualTitle, expectedTitle);
		String confirmmsg = accpage.getConfirmationText();
		Assert.assertEquals(confirmmsg, "Your registration completed");
		accpage.clickContinue();
		
		
		
	}
	
	
	
	

}
