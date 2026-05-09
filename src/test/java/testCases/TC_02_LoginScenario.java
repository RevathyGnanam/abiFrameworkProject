package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.DemoHomePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_02_LoginScenario extends BaseClass {
	
	@Test(groups= {"Regression"})
	public void loginScenario() {
		
		HomePage homepage= new HomePage(driver);
		homepage.clickLogin();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmailId(prp.getProperty("username"));
		loginpage.enterpassword(prp.getProperty("password"));
		loginpage.clickLoginButton();
		System.out.println("Revathy Changes");
		DemoHomePage hp = new DemoHomePage(driver);
		System.out.println("Client changes");
		Assert.assertTrue(hp.verifyLogoutButton());
		
		hp.clickLogout();
		
		
	}
	
	
	
	

}
