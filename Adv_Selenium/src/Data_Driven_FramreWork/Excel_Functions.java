package Data_Driven_FramreWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Functions {
	
	String oparetion(String s,int r,int c) throws EncryptedDocumentException, IOException {
		
		FileInputStream f1 = new FileInputStream("./excel/Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(f1);
		
		Sheet sheet = book.getSheet(s);
		
		Row row = sheet.getRow(r);
		
		Cell cell = row.getCell(c);
		
		String data = cell.toString();
		
		return data;
		
	}
}
