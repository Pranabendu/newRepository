package TestNG_Concept;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample1 {
	@Test(priority = 1)
	void bablu() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ALT);
		r1.keyPress(KeyEvent.VK_SPACE);
		r1.keyRelease(KeyEvent.VK_ALT);
		r1.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_N);
		r1.keyRelease(KeyEvent.VK_N);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}
}
