package log4jSample;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j {
	private static WebDriver driver;
	private static Logger Log = Logger.getLogger(Log4j.class.getName());
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		driver = new FirefoxDriver();
		Log.info("New driver instantiated");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Log.info("Implicit wait applied on the driver for 10 seconds");
		driver.manage().window().maximize();
		Log.info("Browser maximazed");
		driver.get("http://www.store.demoqa.com");
		Log.info("Web application launched");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		Log.info("Click action performed on My Account");
		driver.findElement(By.id("log")).sendKeys("Pedro90");
		Log.info("Username entered in the Username text box");
		driver.findElement(By.id("pwd")).sendKeys("PwmkK7y57Vux");
		Log.info("Password entered in the Password text box");
		driver.findElement(By.id("login")).click();
		Log.info("Click action performed on Submit button");
		System.out.println("Login Successfully, now it is time to Log Off");
		driver.findElement(By.id("account_logout")).click();
		Log.info("Click action performed on Log out link");
		driver.quit();
		Log.info("Browser closed");
	}
}
