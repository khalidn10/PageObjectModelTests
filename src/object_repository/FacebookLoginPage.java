// Package
package object_repository;

// Imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Class containing objects in Facebook login page
public class FacebookLoginPage {

	// Declare local driver
	WebDriver driver;
	
	// Constructor with WebDriver parameter
	public FacebookLoginPage(WebDriver driver)
	{
		// Set local driver to driver sent in parameter
		this.driver = driver;
	}
	
	// Set CSS Selector for Username field
	By userName = By.cssSelector("#email");
	
	// Set CSS Selector for Password field
	By passWord = By.cssSelector("#pass");
	
	// Set Name locator for Log In button
	By logIn = By.name("login");
	
	// Get method for Username field
	public WebElement getUserName()
	{
		// Return Username field
		return driver.findElement(userName);
	}
	
	// Get method for Password field
	public WebElement getPassWord()
	{
		// Return Password field
		return driver.findElement(passWord);
	}
	
	// Get method for Log In button
	public WebElement getLogIn()
	{
		// Return Log In button
		return driver.findElement(logIn);
	}
}
