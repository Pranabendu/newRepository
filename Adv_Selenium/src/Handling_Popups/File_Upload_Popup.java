package Handling_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Upload_Popup {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		Thread.sleep(2000);
		WebElement first = driver.findElement(By.xpath("//a[@class='cd-popup-trigger']"));
		first.click();
		Thread.sleep(2000);
		WebElement browse = driver.findElement(By.xpath("//input[@type='file']"));
		browse.sendKeys("D:\\All Document\\cv updated copy word new.pdf");
	}

}
