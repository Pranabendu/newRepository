package Data_Driven_FramreWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
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

public class Fetch_And_Print_In_Excel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cardekho.com");
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		FileInputStream f1 = new FileInputStream("./excel/EmptyBook.xlsx");
		
		Workbook book = WorkbookFactory.create(f1);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		for (int i = 0; i < links.size(); i++) {
			Row row = sheet.createRow(i);
			
			Cell cell = row.createCell(0);
			
			String txt = links.get(i).getText();
			
			System.out.println(txt);
			
			cell.setCellValue(txt);
		}
		
		// For flash the data into the particular excel file
		FileOutputStream f2 = new FileOutputStream("./excel/EmptyBook.xlsx");
		book.write(f2);
		
//		// For print all output in console
//		ArrayList<WebElement> a1 = new ArrayList<WebElement>(links);
//		
//		for (WebElement s : a1) {
//			String t = s.getText();
//			System.out.println(t);
//		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
