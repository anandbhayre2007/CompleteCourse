package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver dr;
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	By username=By.name("userName");
	By password=By.name("password");
	By login=By.name("login");
	By signOff=By.xpath("//a[text()='SIGN-OFF']");
	By registration=By.linkText("REGISTER");
	
	public boolean isSignOffDisplayed()
	{
		return dr.findElement(signOff).isDisplayed();
	}
	
	public boolean isRegisterDisplayed()
	{
		return dr.findElement(registration).isDisplayed();
	}
	
	public boolean isUserNameDisplayed()
	{
		return dr.findElement(username).isDisplayed();
	}
	
	public boolean isPasswordDisplayed()
	{
		return dr.findElement(password).isDisplayed();
	}
	
	public boolean isLoginDisplayed()
	{
		return dr.findElement(login).isDisplayed();
	}

	public String login(String username, String password)
	{
		dr.findElement(this.username).sendKeys(username);
		dr.findElement(this.password).sendKeys(password);
		dr.findElement(this.login).click();
		
		return dr.getTitle();
	}
}
