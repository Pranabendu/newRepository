package Handling_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alart_Confirmation_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@value='Submit']"));
		ele.click();
		Thread.sleep(3000);
		Alert popup = driver.switchTo().alert();
		String txt = popup.getText();
		System.out.println(txt);
		Thread.sleep(2000);
		popup.accept();
		Thread.sleep(2000);
		String txt2 = popup.getText();
		System.out.println(txt2);
		popup.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
