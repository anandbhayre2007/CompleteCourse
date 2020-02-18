package testScripts;

import java.io.FileOutputStream;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configuration.Configuration;
import library.ApplicationLibrary;
import pages.FlightFinder;
import pages.HomePage;

public class VerifyFlightBooking {
	
	WebDriver dr;
	HomePage homePage;
	FlightFinder flightFinderPage;
	
	@BeforeClass
	public void initialize() {
		ApplicationLibrary lib= new ApplicationLibrary();
		
		dr=lib.launchBrowser("Chrome");
		dr.get(Configuration.url);
		
		homePage=new HomePage(dr);
		flightFinderPage=new FlightFinder(dr);
	}
	
	@AfterClass
	public void closeBrowser() {
		dr.close();
	}
	
	@Test
	public void verifyLoginFunctionality() {
		
		String var=homePage.login(Configuration.globalUserName, Configuration.globalPassword);

		Assert.assertEquals(var, "Find a Flight: Mercury Tours:");
	}

	@Test(dependsOnMethods= {"verifyLoginFunctionality"})
	public void selectFlightDetails()
	{
		flightFinderPage.clickOneWay();
		flightFinderPage.clickFindFlights();
		
	}
}
