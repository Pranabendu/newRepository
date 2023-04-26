package Data_Driven_FramreWork;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_And_Put_In_Project {

	public static void main(String[] args)throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://106.51.87.42:9003/");
		Thread.sleep(3000);
		
		FileInputStream f1 = new FileInputStream("./excel/Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(f1);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		String deta1 = "";
		String deta2 = "";
		
		for (int i = 0; i < 7; i++) {
			
			Row row = sheet.getRow(i);
			
			Cell cell = row.getCell(0);
			
			deta1 = cell.toString();
			
			WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='What ?']"));
			Thread.sleep(2000);
			ele1.sendKeys(deta1);
			Thread.sleep(1500);
			ele1.sendKeys(Keys.CONTROL+"A");
			ele1.sendKeys(Keys.BACK_SPACE);
			
			
			Row row1 = sheet.getRow(i);
			
			Cell cell1 = row1.getCell(1);
			
			deta2 = cell1.toString();
			
			WebElement ele2 = driver.findElement(By.xpath("//input[@placeholder='Where ?']"));
			ele2.sendKeys(deta2);
			Thread.sleep(1500);
			ele2.sendKeys(Keys.CONTROL+"A");
			ele2.sendKeys(Keys.BACK_SPACE);
			
		}
		
		Thread.sleep(3000);
		driver.close();
	
		
	}

}