package automationFrameworkBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {
	public static void main(String[] args) {
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
		
		// Open ToolsQA web site
		String appUrl = "http://www.DemoQA.com";
		driver.get(appUrl);
		System.out.println(driver.getCurrentUrl());
		
		// Click on Registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		System.out.println(driver.getCurrentUrl());
		
		// Go back to home Page
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		// Go forward to Registration page
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		// Go back to Home Page
		driver.navigate().to(appUrl);
		System.out.println(driver.getCurrentUrl());
		
		// Refresh browser
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		// Close browser
		driver.close();
	}
}