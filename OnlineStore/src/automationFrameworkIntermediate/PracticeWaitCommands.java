package automationFrameworkIntermediate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWaitCommands {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// Create a new instace of Firefox driver
		driver = new FirefoxDriver();
		
		// Maximize Firefox browser
		driver.manage().window().maximize();
		
		/* Put an Implict wait, this means that any search for elements on the page could take
		the time the implict wait is set for before throwing exception */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Launch the URL
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		// Click on the Button "Timing Alert"
		driver.findElement(By.id("alert")).click();
		System.out.println("Timer JavaScrip Alert is triggered but is not yet opened");
		
		// Create new WebDriver wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// Wait for Alert to be present
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Either Pop Up is displayed or it is Timed Out");
		
		// Accept the Alert
		Thread.sleep(5000);
		myAlert.accept();
		System.out.println("Alert Accepted");
		
		//Close the main window
		driver.close();
	}
}