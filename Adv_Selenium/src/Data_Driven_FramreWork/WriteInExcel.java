package Data_Driven_FramreWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteInExcel {
	public static void main(String[]args) throws EncryptedDocumentException, IOException{
		FileInputStream f1 = new FileInputStream("./excel/EmptyBook.xlsx");
		Workbook book = WorkbookFactory.create(f1);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Pranabendu");
		
		FileOutputStream fo = new FileOutputStream("./excel/EmptyBook.xlsx");
		book.write(fo);
	}
}
