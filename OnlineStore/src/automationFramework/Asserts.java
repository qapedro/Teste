package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts {
	
	private static WebDriver driver;
	
	@Test (enabled=false)
	public void f() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.store.demoqa.com");
		WebElement myAccount = driver.findElement(By.xpath(".//*[@id='account']/a"));
		Assert.assertTrue(myAccount.isDisplayed());
		myAccount.click();
		driver.quit();
	}
	
	@Test
	public void g() {
		String sValue = "Lakshay Sharma";
		System.out.println("What is your full name");
		Assert.assertEquals("Lakshay Sharma2", sValue);
		System.out.println(sValue);
	}
}
