package excelreader;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelDp {
 
	
	@Test
	public Object [][] readExcelDp(String filename) throws IOException
	{
	//open excel from file path
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+ filename+ ".xlsx");
		//go to the sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		//find the RowCount
		int rowNumber = sheet.getLastRowNum();
		//find the cell[column]
		short columncount = sheet.getRow(0).getLastCellNum();
		//read the data 
		String [][] data = new String [rowNumber][columncount];
		for (int i=1 ; i <= rowNumber; i++) 
		 {
			XSSFRow row = sheet.getRow(i);
		
		for (int j=0; j < columncount; j++)
		{
			XSSFCell cell = row.getCell(j);		
			data[i-1][j]= cell.getStringCellValue();
			
		    //String data = cell.getStringCellValue();
		   // System.out.println(data);
		
		}
		
		}
		wBook.close();
		return data;
	}
}
