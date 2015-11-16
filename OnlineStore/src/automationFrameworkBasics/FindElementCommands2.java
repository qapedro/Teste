package automationFrameworkBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementCommands2 {
	
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
		
		// Maximize browser window
		driver.manage().window().maximize();
		
		// Launch the Online Store WebSite
		driver.get("http://www.toolsqa.com/Automation-practice-form/");
		
		// Click on "Partial Link Text" link
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Partial Link Test Pass");
		
		// Convert element in to a string
		String sClass = driver.findElement(By.tagName("Button")).toString();
		System.out.println(sClass);
		
		// Click on "Link Text" link
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println("Link Test Pass");
	}
}
