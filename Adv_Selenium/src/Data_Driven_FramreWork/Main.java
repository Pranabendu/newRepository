package Data_Driven_FramreWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		Excel_Functions e1 = new Excel_Functions();
		String un = e1.oparetion("Sheet1", 6, 0);
		String pwd = e1.oparetion("Sheet1", 6, 1);
		
		System.out.println(un);
		System.out.println(pwd);
		
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://106.51.87.42:9007/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(9000);
		driver.close();
	}

}
