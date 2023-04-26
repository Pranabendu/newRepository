package Handling_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_Division_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		Thread.sleep(2000);
		WebElement first = driver.findElement(By.xpath("//a[@class='cd-popup-trigger']"));
		first.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Hi Baby");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Alert']")).click();
		Thread.sleep(2000);
		Alert js = driver.switchTo().alert();
		String text = js.getText();
		System.out.println(text);
		Thread.sleep(2000);
		js.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Close']")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
