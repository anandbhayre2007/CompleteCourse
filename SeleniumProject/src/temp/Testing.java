package temp;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		String downloadFilepath = "D:\\Anand1";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);		
		
		ChromeDriver dr= new ChromeDriver(options);
		dr.manage().window().maximize();
		dr.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server/3.141.59");
		
		dr.findElement(By.xpath("//a[contains(text(),'jar')]")).click();

	}

}
