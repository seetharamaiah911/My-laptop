package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_learning {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("E:/Test leaf/Excel data/Test sheet.xlsx");

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//to read sheet from file
		XSSFSheet sheet1 = workbook.getSheet("Test_sheet1");
		
		//to define Row
		Row row=sheet1.createRow(0);
		//to define cell  
		Cell cell=row.createCell(0);
		cell.setCellValue("selenium"); 
		
		String value = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
		
		

		
	}

}
