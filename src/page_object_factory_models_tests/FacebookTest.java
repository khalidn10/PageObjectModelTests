// Package
package page_object_factory_models_tests;

// Imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import object_repository.FacebookLoginPagePFM;

// Class to test Facebook website
public class FacebookTest {

	@Test
	// Test to log into Facebook 
	public void logInToFacebook() throws InterruptedException
	{
		// Set up Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khalid\\Documents\\Documents\\Courses\\Selenium\\Apps\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Load Facebook login page
		driver.get("https://www.facebook.com/");
		
		// Create instance of FacebookLoginPage or FacebookLoginPagePFM in object repository
		//FacebookLoginPage facebookLogin = new FacebookLoginPagePFM(driver);
		FacebookLoginPagePFM facebookLogin = new FacebookLoginPagePFM(driver);
		
		// Enter username into Username field
		facebookLogin.getUserName().sendKeys("username");
		
		// Enter password into Password field
		facebookLogin.getPassWord().sendKeys("password");
		
		// Added so that cookies pop-up can be closed 
		Thread.sleep(5000);
		
		// Click Login button
		facebookLogin.getLogIn().click();
	}
}
