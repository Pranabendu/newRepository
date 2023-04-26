package Data_Driven_FramreWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Write_In_Excel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream f1 = new FileInputStream("./excel/EmptyBook.xlsx");
		
		Workbook book = WorkbookFactory.create(f1);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.createRow(1);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("hi");
		
		// put the data into the excel
		FileOutputStream f2 = new FileOutputStream("./excel/EmptyBook.xlsx");
		
		book.write(f2);
		
	}

}
