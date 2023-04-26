package Practice_All_Concept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zkash {
	public static void main (String[] args) throws InterruptedException, AWTException
	{
	
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement tab1 = driver.findElement(By.xpath("//a[.='Amazon miniTV']"));
		WebElement tab2 = driver.findElement(By.xpath("//a[.='Mobiles']"));
		
		Actions a1 = new Actions(driver);
		
		
		Robot r1 = new Robot();

		a1.contextClick(tab2).perform();
			
		r1.keyPress(KeyEvent.VK_T);
		r1.keyRelease(KeyEvent.VK_T);
		
		a1.contextClick(tab1).perform();
		r1.keyPress(KeyEvent.VK_T);
		r1.keyRelease(KeyEvent.VK_T);
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> col = new ArrayList<>(ids);
		String id = col.get(1);
		
		driver.switchTo().window(id);
		
	}
}
