package Data_Driven_FramreWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data {

	 static String fetch(String s,int r,int c) throws EncryptedDocumentException, IOException {
		
		// step1 specify the excel file path
		FileInputStream f1 = new FileInputStream("./excel/Book1.xlsx");
		
		// step2 open the excel file
		Workbook book = WorkbookFactory.create(f1);
		
		// step3 specify the sheet no
		Sheet sheet = book.getSheet(s);				
		
		// step4 fetch the row
		Row row = sheet.getRow(r);
		
		// step5 fetch the column
		Cell cell = row.getCell(c);
		
		// step6 fetch the data
		String data = cell.toString();
		
		
//		System.out.println(data);
		
		return data;
		
	}

}
