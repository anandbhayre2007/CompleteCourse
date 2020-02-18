package module1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Module1InitializationAndTeardown {
	
	@BeforeTest
	public void module1Initialization()
	{
		System.out.println("Module 1 specific configuration");
	}
	
	@AfterTest
	public void module1tearDown()
	{
		System.out.println("Revertback module 1 specific configuration");
	}

}
