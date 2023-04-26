package Robot_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Bro {

	public static void main(String[] args) throws Exception {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://106.51.87.42:9007/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pranabendu@project.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pranabendu123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[.='Medicine Category']"));
		ele.click();
//		Thread.sleep(2000);
//		Actions a1 = new Actions(driver);
//		a1.contextClick(ele).perform();
//		Thread.sleep(2000);
//		Robot r1 = new Robot();
//		r1.keyPress(KeyEvent.VK_D);
//		r1.keyRelease(KeyEvent.VK_D);
		
	}

}
