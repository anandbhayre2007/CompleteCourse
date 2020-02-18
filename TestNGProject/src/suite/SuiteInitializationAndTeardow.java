package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteInitializationAndTeardow {
	
	@BeforeSuite
	public void initialization()
	{
		System.out.println("Environment set up");
	}
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("Final report generation");
	}

}
