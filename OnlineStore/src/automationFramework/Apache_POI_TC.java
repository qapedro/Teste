package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModules.SignIn_Action;
import pageObjects.Home_Page;
import utility.Constant;
import utility.ExcelUtils3;

public class Apache_POI_TC {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {
		ExcelUtils3.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Plan1");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		SignIn_Action.Execute(driver);
		System.out.println("Login Successfully, now it is the time to Log Off");
		Home_Page.lnk_logOut(driver).click();
		driver.quit();
		ExcelUtils3.setCellData("Pass", 1, 3);
	}
}
