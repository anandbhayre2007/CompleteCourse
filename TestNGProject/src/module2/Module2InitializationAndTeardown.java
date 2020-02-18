package module2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Module2InitializationAndTeardown {
	
	@BeforeTest
	public void module2Initialization()
	{
		System.out.println("Module 2 specific configuration");
	}
	
	@AfterTest
	public void module2tearDown()
	{
		System.out.println("Revertback module 2 specific configuration");
	}

}
