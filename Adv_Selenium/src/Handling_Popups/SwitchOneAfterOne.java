package Handling_Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SwitchOneAfterOne {
	@Test
	void one() throws AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Robot r1 = new Robot();
		for (int i = 1; i < 4; i++) {
			
			r1.keyPress(KeyEvent.VK_CONTROL);
			r1.keyPress(KeyEvent.VK_T);
			r1.keyRelease(KeyEvent.VK_CONTROL);
			r1.keyRelease(KeyEvent.VK_T);
		}
		String pid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		allid.remove(pid);
		ArrayList<String> a1 = new ArrayList<>(allid);
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		
//		for(String s1:allid)
//		{
//			driver.switchTo().window(s1);
//			driver.get("https://www.amazon.in");
//			String title = driver.getTitle();
//			w1.until(ExpectedConditions.titleContains(title));
//			
//		}
		
		for (int i = 0; i < a1.size(); i++) {
			driver.switchTo().window(a1.get(i));
			driver.get("https://www.amazon.in");
			String title = "lalu";
			w1.until(ExpectedConditions.titleContains(title));
		}
	}
}
