package Robot_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a[.='Customer Service']"));
		Actions a1 = new Actions(driver);
		a1.contextClick(ele).perform();
		Thread.sleep(3000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_D);
		Thread.sleep(3000);
		r1.keyRelease(KeyEvent.VK_D);
		Thread.sleep(3000);
		driver.quit();
	}

}
