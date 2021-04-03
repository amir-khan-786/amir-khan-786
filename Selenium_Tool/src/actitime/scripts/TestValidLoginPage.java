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
import actitime.pages.EnterTimeTrackPage;
import actitime.pages.LoginPage;


public class TestValidLoginPage extends BaseTest{
	

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException
	{	
		String un = FWUtils.read_XL_Data(READ_XL_DATA,"ValidLoginPage",1,0);
		String pw = FWUtils.read_XL_Data(READ_XL_DATA,"ValidLoginPage",1,1);
		String expectedTitleETP = FWUtils.read_XL_Data(READ_XL_DATA,"ValidLoginPage",1,2);
		
		openBrowser("chrome");
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pw);
		lp.clickOnKeepMeLoggedInCheckBox();
		lp.clickOnLoginBTN();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		FWUtils.verifyPageTitle(driver,expectedTitleETP);
		etp.clickOnLogOutLink();
		closeBrowser();
		
	

	}

}
