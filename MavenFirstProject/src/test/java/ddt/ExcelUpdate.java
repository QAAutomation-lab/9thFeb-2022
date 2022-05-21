package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ExcelUpdate extends SeleniumUtility {

	// read row1 data and login into actitime application
	@Test
	public void loginIntoActitme() {
		ExcelOperations ex = new ExcelOperations();
		String appUrl = ex.getCellValue(".\\src\\test\\resources\\testData\\AppData.xlsx", "Sheet1", 2, 0);
		String username = ex.getCellValue(".\\src\\test\\resources\\testData\\AppData.xlsx", "Sheet1", 2, 1);
		String password = ex.getCellValue(".\\src\\test\\resources\\testData\\AppData.xlsx", "Sheet1", 2, 2);
		String expectedTitle = ex.getCellValue(".\\src\\test\\resources\\testData\\AppData.xlsx", "Sheet1", 2, 3);
		System.out.println(appUrl);
		System.out.println(username);
		System.out.println(password);

		setUp("chrome", appUrl);
		System.out.println("Actual title: "+getCurrentTitleOfApplication());
		
		if(getCurrentTitleOfApplication().equals(expectedTitle)) {
			ex.updateCellValue(".\\src\\test\\resources\\testData\\AppData.xlsx", "Sheet1", 2, 4,"pass");
			Assert.assertEquals(getCurrentTitleOfApplication(), expectedTitle,
					"Either login was not successfull or title got changed");
		}else {
			ex.updateCellValue(".\\src\\test\\resources\\testData\\AppData.xlsx", "Sheet1", 2, 4,"failed");
			Assert.assertEquals(getCurrentTitleOfApplication(), expectedTitle,
					"Either login was not successfull or title got changed");
		}
		cleanUp();
	}
}
