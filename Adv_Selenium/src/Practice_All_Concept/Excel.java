package Practice_All_Concept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {
	
	static String excel1(int c) throws Exception {
		FileInputStream f1 = new FileInputStream("./excel/Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(f1);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(7);
		
		Cell cell = row.getCell(c);
		
		String data = cell.toString();
		
		return data;
		
	}
}
