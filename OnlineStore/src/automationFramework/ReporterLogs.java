package automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReporterLogs {
	private static WebDriver driver;
	private static Logger Log = Logger.getLogger(ReporterLogs.class.getName());
	
	@Test
	public void test() {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		Log.info("Click action performed on My Account");
		driver.findElement(By.id("log")).sendKeys("Pedro90");
		Log.info("Username entered in the Username text box");
		driver.findElement(By.id("pwd")).sendKeys("PwmkK7y57Vux");
		Log.info("Password entered in the Password text box");
		driver.findElement(By.id("login")).click();
		Log.info("Click action performed on Submit button");
		Reporter.log("Sign In Successful");
		driver.findElement(By.id("account_logout")).click();
		Log.info("Click action performed on Log out link");
		Reporter.log("Log Out Successful");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		DOMConfigurator.configure("log4j.xml");
		driver = new FirefoxDriver();
		Log.info("New driver instantiated");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Log.info("Implict wait applied on the driver for 10 seconds");
		driver.manage().window().maximize();
		Log.info("Browser was maximized");
		driver.get("http://www.store.demoqa.com");
		Log.info("Web application launched");
		Reporter.log("Web application launched");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
		Log.info("Browser closed");
		Reporter.log("Application is closed");
	}

}
