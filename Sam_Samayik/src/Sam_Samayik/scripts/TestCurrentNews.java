package Sam_Samayik.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.CurrentNewsPage;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;

public class TestCurrentNews extends BaseTest {
	@Test
	public static void test_Current_News() {
		
		openBrowser("chrome");
		
		
		HomePage home= new HomePage(driver);
		home.Sign_IN();
		
		
		
		LoginPage lp = new LoginPage(driver);

		lp.EnteruserName("9971808064");
		lp.enterPassword("12345678");
		lp.clickOnContinueBTN();
		System.out.println("URL of Login Page ");
		FWUtils.verifyURL(driver, URL);
		
		
        CurrentNewsPage cNews= new  CurrentNewsPage(driver);
        scrollDownByElementLocation(CHROM_KEY);
        
	
}
}

