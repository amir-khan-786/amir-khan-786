package com.samsamyik.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWUtils 
{
	/**
	 * This Method Is Used To Verify The Page Title
	 * @param driver
	 * @param expectedTitle
	 */
	
	
	public static WebDriver driver;
	public static void verifyPageTitle(WebDriver driver,String expectedTitle)
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
	
	
	public static void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshot/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	

	
	
	public static void takeScreenShot( String fileName) throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("./ScreenShot/"+fileName);
		
		FileUtils.copyFile(src, desc);
		
	}
	
	
	public static void scrollDownByAxies( String location ) throws InterruptedException
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		Thread.sleep(2000);
		jse.executeScript(location);

	
	}
	
	
	public static void scrollDownByElementLocation( String pathvalue) throws InterruptedException
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		Thread.sleep(1000);
		
		WebElement cNews = driver.findElement(By.xpath(pathvalue));
		
		int yaxis = cNews.getLocation().getY();

		jse.executeScript("window.scrollBy(0,"+yaxis+")");

	}

	
}

