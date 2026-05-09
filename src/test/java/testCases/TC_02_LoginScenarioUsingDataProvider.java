package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.DemoHomePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_02_LoginScenarioUsingDataProvider extends BaseClass {
	
	@Test(dataProvider ="gfghfh",dataProviderClass = DataProviders.class,groups= {"Regression","Sanity"})
	public void loginScenario(String email,String pass) {
		
		HomePage homepage= new HomePage(driver);
		homepage.clickLogin();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmailId(email);
		loginpage.enterpassword(pass);
		loginpage.clickLoginButton();
		
		DemoHomePage hp = new DemoHomePage(driver);
		Assert.assertTrue(hp.verifyLogoutButton());
		System.out.println("Testing the url")
		hp.clickLogout();
		
		
	}
	
	
	
	

}
