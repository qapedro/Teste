package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;
import pageObjects.Login_Page;
import utility.ExcelUtils3;

public class SignIn_Action {
	public static void Execute(WebDriver driver) throws Exception {
		// This is to get the values from Excel sheet, passing parameters (Row num; Col num) to getCellData method
		String sUserName = ExcelUtils3.getCellData(1, 1);
		String sPassword = ExcelUtils3.getCellData(1, 2);
		Home_Page.lnk_MyAccount(driver).click();
		Login_Page.txtbx_UserName(driver).sendKeys(sUserName);
		Login_Page.txtbx_Password(driver).sendKeys(sPassword);
		Login_Page.btn_LogIn(driver).click();
	}
}
