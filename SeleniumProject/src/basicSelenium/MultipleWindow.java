package basicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		//Implicit wait
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.get("https://www.naukri.com/");
		
		Set<String> wins=dr.getWindowHandles();
		
		for(String s:wins)
		{
			dr.switchTo().window(s);
			if(dr.getTitle().equals("AGS Health")) {				
				dr.close();
			}
		}

	}

}
