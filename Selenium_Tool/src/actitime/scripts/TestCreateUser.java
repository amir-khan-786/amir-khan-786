package actitime.scripts;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitime.generics.BaseTest;
import actitime.generics.FWUtils;
import actitime.pages.EnterTimeTrackPage;
import actitime.pages.LoginPage;
import actitime.pages.TaskListPage;


public class TestCreateUser extends BaseTest{
	
	public static void main(String[] args) throws InterruptedException
	{
		openBrowser("chrome");		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickOnKeepMeLoggedInCheckBox();
		lp.clickOnLoginBTN();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPageTitle(driver,"actiTIME - Enter Time-Track");
		etp.clickOnTaskTab();
		
		TaskListPage tls = new TaskListPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPageTitle(driver,"actiTIME - Task List");
		tls.clickOnAddNewBTN();
		tls.clickOnPlusNwCustomer();
		Thread.sleep(1000);
		tls.setNewCustomerName("BPS11");
		tls.clickonPlusCreateCusomerBTN();
		tls.listofCustomers();
		etp.clickOnLogOutLink();
		closeBrowser();
		
	

	}

}
