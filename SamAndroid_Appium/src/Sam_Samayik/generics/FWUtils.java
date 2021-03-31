package Sam_Samayik.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWUtils 
{
	
	/**
	 * This Method Is Used To Verify The Page Title
	 * @param driver
	 * @param expectedTitle
	 */
	
	
	public static void verifyPageTitle( WebDriver driver,String expectedTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(expectedTitle));
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("The Expected Page is Dispalyed--->"+expectedTitle);
		}
		else
		{
			System.out.println("The Expected Page is not Dispalyed--->"+actualTitle);
		}
		
		
	}
	
		
		/**
		 * This Method is used To Verify The URl of the  WebPage 
		 * 
		 */
	

	public static void verifyURL( WebDriver driver,String expectedURL)
	{
		String actualURL = driver.getCurrentUrl();
		if(actualURL.equals(expectedURL))
		{
			System.out.println("The Expected Page is Dispalyed--->"+expectedURL);
		}
		else
		{
			System.out.println("The Expected Page is not Dispalyed--->"+actualURL);
		}
		
		
	}


}

