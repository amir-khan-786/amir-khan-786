package Sam_Samayik.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadData {

	public static Workbook wb;
	public static Sheet sheet;
	
	public ExcelReadData(String path, String sheetName)
	{

		
		try {
			wb = WorkbookFactory.create(new FileInputStream(path));
			 wb.getSheet(sheetName);
		
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	 public static void getRowCount()
	 {
		 
		 try
		 {
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
	
	
	 
	 public static void getCellDataNumber(int rowNum ,int colNum)
	 {
		 try
		 {
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
	
	
	 

	 public static void getCellDataString(int rowNum ,int colNum)
	 {
		 try
		 {
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
}


