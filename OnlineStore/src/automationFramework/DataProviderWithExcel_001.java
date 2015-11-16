package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import utility.ExcelUtils;

public class DataProviderWithExcel_001 {
	WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
	@Test (dataProvider = "Authentication")
	public void test(String sUserName, String sPassword) {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        driver.findElement(By.id("log")).sendKeys(sUserName);
		System.out.println(sUserName);
        driver.findElement(By.id("pwd")).sendKeys(sPassword);
		System.out.println(sPassword);
        driver.findElement(By.id("login")).click();
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
        driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.store.demoqa.com");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] Authentication() throws Exception {
		ExcelUtils.setExcelFile("C://Users//pedro.guerra//workspace//OnlineStore//src//testData//TestData.xlsx", "Plan1");
		sTestCaseName = this.toString();
		sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, 0);
		Object[][] testObjArray = ExcelUtils.getTableArray("C://Users//pedro.guerra//workspace//OnlineStore//src//testData//TestData.xlsx", "Plan1", iTestCaseRow);
		return testObjArray;
	}
}
