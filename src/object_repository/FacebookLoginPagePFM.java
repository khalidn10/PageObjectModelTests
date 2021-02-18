// Package
package object_repository;

// Imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Class containing objects in Facebook login page
public class FacebookLoginPagePFM {

	// Declare local driver
	WebDriver driver;
	
	// Constructor with WebDriver parameter
	public FacebookLoginPagePFM(WebDriver driver)
	{
		// Use static PageFactory.initElements() method to set local driver
		// to enable use of page factory model and Selenium FindBy annotation
		PageFactory.initElements(driver, this);
	}
	
	// Set a suitable locator for Username field (CSS Selector in this case) using FindBy annotation
	@FindBy(css="#email")
	// Declare userName WebElement to be set by locator used in FindBy annotation
	WebElement userName;
	
	// Set a suitable locator for Password field (CSS Selector in this case) using FindBy annotation
	@FindBy(css="#pass")
	// Declare passWord WebElement to be set by locator used in FindBy annotation
	WebElement passWord;
	
	// Set a suitable locator for Log In button (name locator in this case) using FindBy annotation
	@FindBy(name="login")
	// Declare logIn WebElement to be set by locator used in FindBy annotation
	WebElement logIn;
	
	// Get method for Username field
	public WebElement getUserName()
	{
		// Return Username field
		return userName;
	}
	
	// Get method for Password field
	public WebElement getPassWord()
	{
		// Return Password field
		return passWord;
	}
	
	// Get method for Log In button
	public WebElement getLogIn()
	{
		// Return Log In button
		return logIn;
	}
}
