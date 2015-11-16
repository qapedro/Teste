package automationFrameworkBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
		//Storing the Application Url in the String variable
		String url = "http://www.store.demoqa.com";
		
		// Launch the Online Store Website
		driver.get(url);
		
		// Storing Title name in the String variable
		String title = driver.getTitle();
		
		// Storing Title length in the Int variable
		int titleLength = driver.getTitle().length();
		
		// Printing Title & Title lenght in the Console window
		System.out.println("Title of the page is: " + title);
		System.out.println("Length of the title is: " + titleLength);
		
		// Storing URL in String variable
		String actualUrl = driver.getCurrentUrl();
		
		if (actualUrl.equals(url)) {
			System.out.println("Verification Successful");
		} else {
			System.out.println("Verification Failed");
			System.out.println("Actual URL is: " + actualUrl);
			System.out.println("Expected URL us: " + url);
		}
		
		// Storing Page Source in String variable
		String pageSource = driver.getPageSource();
		
		// Storing Page Source length in Int variable
		int pageSourceLength = pageSource.length();
		
		// Printing length of the Page Source on console
		System.out.println("Total length of the Page Source is: " + pageSourceLength);
				
		// Close the driver
		driver.quit();
	}
}
