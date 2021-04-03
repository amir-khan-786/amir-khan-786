package com.ActiTime.scripts;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ActiTime.generics.BaseTest;
import com.ActiTime.generics.FWUtils;
import com.ActiTime.pages.EnterTimeTrackPage;
import com.ActiTime.pages.LicencesPage;
import com.ActiTime.pages.LoginPage;

public class TestProuctEdition extends BaseTest{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		openBrowser("firefox");		
		LoginPage lp =new LoginPage(driver);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickOnKeepMeLoggedInCheckBox();
		lp.clickOnLoginBTN();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPageTitle(driver,"actiTIME - Enter Time-Track");
		etp.clickOnSettingsMenu();
		etp.clickOnLicensesLink();
		
		LicencesPage lcp = new LicencesPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPageTitle(driver,"actiTIME - Licenses");
		lcp.verifyProductEdition();
		etp.clickOnLogOutLink();
	    closeBrowser();
		

	}

}
