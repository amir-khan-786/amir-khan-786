package Sam_Samayik.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.CurrentNewsPage;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;

public class TestCurrentNews extends BaseTest {
	public static void main(String[] args) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		openBrowser("chrome");
		FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra");
		
		
		HomePage home= new HomePage(driver);
		home.Sign_IN();
		
		
		
		LoginPage lp = new LoginPage(driver);

		lp.EnteruserName("9971808064");
		lp.enterPassword("12345678");
		lp.clickOnContinueBTN();
		System.out.println("Title of Login Page ");
		FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra");
		
        CurrentNewsPage cNews= new  CurrentNewsPage(driver);
   //     WebElement Element = driver.findElement(By.xpath("(//h1[text()='Current News'])[1]"));
      // int Yaxis = Element.getLocation().getY();
       js.executeScript("window.scrollBy(0,2100)");
        
        
      // js.executeScript("window.scrollBy(0,Yaxis)");
        
        //cNews.clickOnCurrentLive();
	
}
}

