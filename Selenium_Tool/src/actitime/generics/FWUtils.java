package actitime.generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWUtils 
{
	/**
	 * This Method Is Used To Verify The Page Title
	 * @param driver
	 * @param expectedTitle
	 */
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
	/**
	 * This Method Is Used To Read The Data From Excel
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 */
	public static String read_XL_Data(String path,String sheet,int row,int cell)
	{
		String data="";
		try
		{
		    Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		    data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return data;
	}
	/**
	 * This Method Is Used to Count Number Of Data Rows Present in Current Sheet
	 * @param sheet
	 * @return
	 */
	public static int read_XL_RowCount(String path,String sheet)
	{
		int data=0;
		try
		{
		    Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		    data = wb.getSheet(sheet).getLastRowNum();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return data;
	}

}
