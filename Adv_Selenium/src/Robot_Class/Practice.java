package Robot_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://106.51.87.42:9003/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[.='» View all Ads']"));
		Actions a1 = new Actions(driver);
		Action build = a1.contextClick(ele).build();
		build.perform();
		Thread.sleep(2000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_S);
		r1.keyRelease(KeyEvent.VK_S);
		Thread.sleep(3000);
		driver.close();
	}

}
