package Handling_Tabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class Close_Child_Windows {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//a[.='Customer Service']"));
		WebElement ele2 = driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));
		WebElement ele3 = driver.findElement(By.xpath("//a[.=' Electronics ']"));
		
		ArrayList<WebElement> a1 = new ArrayList<>();
		a1.add(ele1);
		a1.add(ele2);
		a1.add(ele3);
		
		Actions a2 = new Actions(driver);
		Robot r1 = new Robot();
		
		for (WebElement all : a1) {
			a2.contextClick(all).perform();
			Thread.sleep(2000);
			r1.keyPress(KeyEvent.VK_T);
			r1.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> a3 = new ArrayList<String>(allid);
		
		for (String uid : a3) {
			driver.switchTo().window(uid);
			driver.close();
			Thread.sleep(2000);
		}
		
	}

}
