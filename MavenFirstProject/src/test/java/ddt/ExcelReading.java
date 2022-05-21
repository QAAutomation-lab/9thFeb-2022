package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {

	@Test
	public void getSheetCount() throws IOException {
		//*****FileLocation
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		
		//*****Create an instance of respective workbook class and provide file location to its constructor
		//XSSFWorkbook workBook=new XSSFWorkbook(fis);
			//or more generic way
		Workbook workbook=new XSSFWorkbook(fis);
		
		//**** Get Sheet info
		int sheetCount=workbook.getNumberOfSheets();
		System.out.println("Number of sheets present in excel file: "+sheetCount);
		
		//get all the sheet names
		//String sheetName=workbook.getSheetName(0);
		
		for(int i=0;i<sheetCount;i++) {
			System.out.println(workbook.getSheetName(i));
		}
	}
	
	@Test
	public void getRowCount() throws IOException {
		//*****FileLocation
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		
		//*****Create an instance of respective workbook class and provide file location to its constructor
		//XSSFWorkbook workBook=new XSSFWorkbook(fis);
			//or more generic way
		Workbook workbook=new XSSFWorkbook(fis);
		
		//**** Get Sheet info
		//XSSFSheet sheet=workbook.getSheet("Sheet1");
				//or more generic way
		Sheet sheet=workbook.getSheet("Sheet1");
		
		//**** Row info
		int rowCount=sheet.getLastRowNum();//actual row count -1
		System.out.println("Number rows in sheet1: "+rowCount);
		
		//for particular raw
		//XSSFRow row=sheet.getRow(1);
				//or
		 Row row=sheet.getRow(1);	
	}
	@Test
	public void getCellCount() throws IOException {
		//*****FileLocation
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		
		//*****Create an instance of respective workbook class and provide file location to its constructor
		//XSSFWorkbook workBook=new XSSFWorkbook(fis);
			//or more generic way
		Workbook workbook=new XSSFWorkbook(fis);
		
		//**** Get Sheet info
		//XSSFSheet sheet=workbook.getSheet("Sheet1");
				//or more generic way
		Sheet sheet=workbook.getSheet("Sheet1");
		
		//**** for particular raw
		//XSSFRow row=sheet.getRow(1);
				//or
		 Row row=sheet.getRow(1);	
		
		//*** Cell info
		int cellCount= row.getLastCellNum();//actual count
		System.out.println("Cell count in row1 of sheet1: "+cellCount);
		
		//get cell 
		//XSSFCell cell=row.getCell(0);
			//or 
		Cell cell=row.getCell(2);
		
		//get value form cell
		String cellValue=cell.getStringCellValue();
		System.out.println("cell value form row1 sheet1: "+cellValue);
		System.out.println("************************");
		//get all cell value
		for(int i=0;i<cellCount;i++) {
			System.out.println(row.getCell(i).getStringCellValue());
		}
	}
	
	@Test
	public void updateExcel() throws IOException {
		//*****FileLocation
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		
		//*****Create an instance of respective workbook class and provide file location to its constructor
		//XSSFWorkbook workBook=new XSSFWorkbook(fis);
			//or more generic way
		Workbook workbook=new XSSFWorkbook(fis);
		
		//**** Get Sheet info
		//XSSFSheet sheet=workbook.getSheet("Sheet1");
				//or more generic way
		Sheet sheet=workbook.getSheet("Sheet1");
		
		//**** for particular raw
		//XSSFRow row=sheet.getRow(1);
				//or
		 Row row=sheet.getRow(1);	
		 row.createCell(4).setCellValue("Pass");
		 //update excel file content
		
		 //Identify the location where you want to store your new/update data
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		//write you content into your excel file
		workbook.write(fos);
		//flush the content from stream to excel file
		fos.flush();
		//close the stream to save the data
		fos.close();
		System.out.println("Updated excel");
	}
	
	//Create a method to read all the content of the excel sheet1
	
	//read row1 data and login into actitime application
	
	//read row2 data and login into vtiger application
}
