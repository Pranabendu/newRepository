package Data_Driven_FramreWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generic {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  {
		
		// pass the arguement for sheet no, row and cell
		String data1 = Fetch_Data.fetch("Sheet1",2,0);
		String data2 = Fetch_Data.fetch("Sheet1",2,1);
		
		System.out.println(data1);
		System.out.println(data2);
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://106.51.87.42:9003/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='What ?']")).sendKeys(data1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Where ?']")).sendKeys(data2);
			
	}

}
