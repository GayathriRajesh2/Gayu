package excelreader;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {
	
	//private int rowCount;

	@Test
	public void readExcel() throws IOException
	{
	//open excel from file path
		XSSFWorkbook wBook = new XSSFWorkbook("./data/login.xlsx");
		//go to the sheet
		XSSFSheet sheet = wBook.getSheet("login");
		//find the RowCount
		int rowNumber = sheet.getLastRowNum();
		//find the cell[column]
		short columncount = sheet.getRow(0).getLastCellNum();
		//read the data 
		for (int i=1 ; i <= rowNumber; i++) 
		 {
			XSSFRow row = sheet.getRow(i);
		//XSSFCell cell;
		for (int j=0; j < columncount; j++)
		{
			XSSFCell cell = row.getCell(j);		
		    String data = cell.getStringCellValue();
		    System.out.println(data);
		
		}
		
		 }

}
}
