package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configuration.Configuration;

public class ApplicationLibrary {
	
	public WebDriver launchBrowser(String browserName)
	{	
		WebDriver dr=null;
		
		if(browserName.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", Configuration.chromeDriverPath);
		 dr= new ChromeDriver();
		dr.manage().window().maximize();
		}	
		
		
		return dr;		
	}

}
