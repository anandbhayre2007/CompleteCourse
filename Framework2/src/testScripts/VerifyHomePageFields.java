package testScripts;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import configuration.Configuration;
import library.ApplicationLibrary;
import pages.HomePage;

public class VerifyHomePageFields {

	WebDriver dr;
	HomePage homePage;	
	
	@BeforeClass
	public void initialize() {
		ApplicationLibrary lib= new ApplicationLibrary();
		
		dr=lib.launchBrowser("Chrome");
		dr.get(Configuration.url);
		
		homePage=new HomePage(dr);
	}

	@AfterClass
	public void closeBrowser() {
		dr.close();
	}

	@Test(priority=0)
	public void verifySignOffLink() {
		Assert.assertTrue(homePage.isSignOffDisplayed());
	}

	@Test(priority=1)
	public void verifyRegisterLink() {
		Assert.assertTrue(homePage.isRegisterDisplayed());
	}

	@Test(priority=2)
	public void verifyUserName() {
		Assert.assertTrue(homePage.isUserNameDisplayed());
	}

	@Test(priority=3)
	public void verifyPassword() {
		Assert.assertTrue(homePage.isPasswordDisplayed());
	}

	@Test(priority=4)
	public void verifyLogin() {
		Assert.assertTrue(homePage.isLoginDisplayed());
	}

	@Test(dependsOnMethods= {"verifyUserName","verifyPassword","verifyLogin"})
	public void verifyLoginFunctionality() {
		
		String var=homePage.login(Configuration.globalUserName, Configuration.globalPassword);

		Assert.assertEquals(var, "Find a Flight: Mercury Tours:");
	}

}
