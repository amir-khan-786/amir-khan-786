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
import actitime.pages.LicencesPage;
import actitime.pages.LoginPage;


public class TestProuctEdition extends BaseTest{
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
	{
		String un = FWUtils.read_XL_Data(READ_XL_DATA,"CheckProductEdition",1,0);
		String pw = FWUtils.read_XL_Data(READ_XL_DATA,"CheckProductEdition",1,1);
		String expectedTitleETP = FWUtils.read_XL_Data(READ_XL_DATA,"CheckProductEdition",1,2);
		String expectedTitleLCP = FWUtils.read_XL_Data(READ_XL_DATA,"CheckProductEdition",1,3);
		String expectedProductEdition = FWUtils.read_XL_Data(READ_XL_DATA,"CheckProductEdition",1,4);
		
		openBrowser("firefox");		
		LoginPage lp =new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pw);
		lp.clickOnKeepMeLoggedInCheckBox();
		lp.clickOnLoginBTN();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);	
		Thread.sleep(500);
		FWUtils.verifyPageTitle(driver,expectedTitleETP);
		Thread.sleep(500);
		etp.clickOnSettingsMenu();
		etp.clickOnLicensesLink();
		
		LicencesPage lcp = new LicencesPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPageTitle(driver,expectedTitleLCP);
		lcp.verifyProductEdition(expectedProductEdition);
		etp.clickOnLogOutLink();
	    closeBrowser();
		

	}

}
