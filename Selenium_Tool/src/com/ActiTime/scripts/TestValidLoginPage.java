package com.ActiTime.scripts;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ActiTime.generics.BaseTest;
import com.ActiTime.generics.FWUtils;
import com.ActiTime.pages.EnterTimeTrackPage;
import com.ActiTime.pages.LoginPage;


public class TestValidLoginPage extends BaseTest{
	

	public static void main(String[] args)
	{		
		openBrowser("chrome");
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickOnKeepMeLoggedInCheckBox();
		lp.clickOnLoginBTN();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		FWUtils.verifyPageTitle(driver,"actiTIME - Enter Time-Track");
		etp.clickOnLogOutLink();
		closeBrowser();
		
	

	}

}
