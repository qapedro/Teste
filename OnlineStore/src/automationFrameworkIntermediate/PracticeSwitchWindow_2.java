package automationFrameworkIntermediate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSwitchWindow_2 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		
		// Maximize Firefox browser
		driver.manage().window().maximize();
		
		/* Put an Implict wait, this means that any search for elements on the page could take
		the time the implict wait is set for before throwing exception */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Launch the URL
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		// Click on the button "Alert Box"
		driver.findElement(By.id("alert")).click();
		
		// Switch to JavaScript Alert window
		Alert myAlert = driver.switchTo().alert();
		
		// Accept the Alert
		myAlert.accept();
		
		// Close Original window
		driver.close();
	}

}
