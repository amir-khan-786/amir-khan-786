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
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.samsamyik.generics.BaseTest;
import com.samsamyik.generics.ExcelReadData;
import com.samsamyik.generics.FWUtils;
import com.samsamyik.pageObject.HomePage;
import com.samsamyik.pageObject.LoginPage;

public class TestValidUserLogin  extends BaseTest{
	

	public static Workbook wb;
	public static Sheet sheet;
	
	
	 public static void getRowCount( String path, String sheetName)
	 {
		 
		 try
		 {

			 wb = WorkbookFactory.create(new FileInputStream(path));
			 wb.getSheet(sheetName);
			int rowCount = sheet.getPhysicalNumberOfRows(); 
			System.out.println("No of rows : "+rowCount);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
			 System.out.println(e.getCause());
			 e.printStackTrace();
		 }
	 }
	
	
	 
	 public static void getCellDataNumber(String path, String sheetName ,int rowNum ,int colNum)
	 {
		 try
		 {
			 wb = WorkbookFactory.create(new FileInputStream(path));
			 wb.getSheet(sheetName);
		
		 double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		 System.out.println();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
			 System.out.println(e.getCause());
			 e.printStackTrace();
		 }
		 
	 }
	
	
	 

	 public static void getCellDataString(String path, String sheetName ,int rowNum ,int colNum)
	 {
		 try
		 {
			 wb = WorkbookFactory.create(new FileInputStream(path));
			 wb.getSheet(sheetName);
		
		  String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		 System.out.println();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
			 System.out.println(e.getCause());
			 e.printStackTrace();
		 }
		 
	 }

public static void main(String[] args) throws InterruptedException {

	openBrowser("chrome");

	 Thread.sleep(1000);

			HomePage home = new HomePage(driver);
			home.Sign_IN();
			
			LoginPage lp = new LoginPage(driver);
	      getRowCount("./data/Sam.xlsx","Sheet1");
		
}
}

