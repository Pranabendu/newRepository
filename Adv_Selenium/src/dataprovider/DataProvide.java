package dataprovider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Data_Driven_FramreWork.Excel_Functions;

public class DataProvide extends Launch{
	@DataProvider(name = "alldata")
	String [][] add() throws EncryptedDocumentException, IOException {
		
//		String [][] arr = {{"Pranabendu","pr123"},{"Kalu","kal345"},{"Laltu","la#*7"}};
		
		String [][] arr = new String[8][2];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 2; j++) {
				arr [i][j] = Excel_Functions.oparetion(i, j);

			}
		}
		return arr;
	}
		
    @Test(dataProvider = "alldata")
	void test(String un,String pass) throws InterruptedException {
		String title = driver.getTitle();
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		w1.until(ExpectedConditions.titleContains(title));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		Thread.sleep(2000);
	}
	
}
