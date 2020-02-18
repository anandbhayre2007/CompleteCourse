package module3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Module3InitializationAndTeardown {
	
	@BeforeTest
	public void module3Initialization()
	{
		System.out.println("Module 3 specific configuration");
	}
	
	@AfterTest
	public void module3tearDown()
	{
		System.out.println("Revertback module 3 specific configuration");
	}

}
