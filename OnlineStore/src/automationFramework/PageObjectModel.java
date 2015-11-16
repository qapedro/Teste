package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.Home_Page;
import pageObjects.Login_Page;

public class PageObjectModel {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		Home_Page.lnk_MyAccount(driver).click();
		Login_Page.txtbx_UserName(driver).sendKeys("Pedro90");
		Login_Page.txtbx_Password(driver).sendKeys("PwmkK7y57Vux");
		Login_Page.btn_LogIn(driver).click();
		System.out.println("Login Succesfully, now it is the time to Log Off");
		Home_Page.lnk_logOut(driver).click();
		driver.quit();
	}
}
