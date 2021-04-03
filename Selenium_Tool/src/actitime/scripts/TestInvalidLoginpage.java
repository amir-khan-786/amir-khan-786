package actitime.scripts;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitime.generics.BaseTest;
import actitime.generics.FWUtils;
import actitime.pages.LoginPage;


public class TestInvalidLoginpage extends BaseTest {
	
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException 
	{
		
		int rowcount = FWUtils.read_XL_RowCount(READ_XL_DATA,"InvalidLoginPage");
		openBrowser("chrome");		
		LoginPage lp =new LoginPage(driver);
		
		for(int i=1; i<=rowcount;i++)
		{
			String un = FWUtils.read_XL_Data(READ_XL_DATA,"InvalidLoginPage",i,0);
			String pw = FWUtils.read_XL_Data(READ_XL_DATA,"InvalidLoginPage",i,1);
			lp.setUsername(un);
			lp.setPassword(pw);
			lp.clickOnLoginBTN();
			Thread.sleep(500);
			lp.verifyErrMSg(driver);
			
		}
		
	}

}
