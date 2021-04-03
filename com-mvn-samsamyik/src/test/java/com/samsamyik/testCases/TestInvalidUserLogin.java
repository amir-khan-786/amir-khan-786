package com.samsamyik.testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.samsamyik.generics.BaseTest;
import com.samsamyik.generics.FWUtils;
import com.samsamyik.pageObject.HomePage;
import com.samsamyik.pageObject.LoginPage;

public class TestInvalidUserLogin extends BaseTest 

{
	@Test
public static void invalidUserName() throws EncryptedDocumentException, FileNotFoundException, IOException {

	/*
	 * openBrowser("chrome"); FWUtils.verifyPageTitle(driver,
	 * "Sam Samayik: Ghatna Chakra");
	 * 
	 * 
	 * HomePage home= new HomePage(driver); home.Sign_IN();
	 * 
	 * 
	 * 
	 * LoginPage lp = new LoginPage(driver);
	 */


		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Sam.xlsx"));
		
		Cell c = wb.getSheet("sheet2").getRow(1).getCell(0);
		 String s = c.toString();
		System.out.println(s);
     	
		/*
		 * int rowCount=4;
		 * 
		 * //Create a loop over all the rows of excel file to read it
		 * 
		 * for (int i = 0; i < rowCount+1; i++) {
		 * 
		 * Row row = s.getRow(i);
		 * 
		 * //Create a loop to print cell values in a row
		 * 
		 * for (int j = 0; j < row.getLastCellNum(); j++) {
		 * 
		 * //Print Excel data in console
		 * 
		 * Cell c = row.getCell(j); String value = c.getStringCellValue();
		 * 
		 * Reporter.log(value,true);
		 * 
		 * }
		 * 
		 * System.out.println(); }
		 */
		     
	

	
	//driver.close();

}


}
