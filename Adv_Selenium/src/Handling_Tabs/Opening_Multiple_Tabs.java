package Handling_Tabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opening_Multiple_Tabs {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Robot r1 = new Robot();
		
		for (int i = 1; i <= 3; i++) {
			r1.keyPress(KeyEvent.VK_CONTROL);
			r1.keyPress(KeyEvent.VK_T);
			r1.keyRelease(KeyEvent.VK_CONTROL);
			r1.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		
	}

}
