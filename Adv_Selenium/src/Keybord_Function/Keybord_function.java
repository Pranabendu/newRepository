package Keybord_Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keybord_function {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("file:///D:/Selenium_html/4%20textfield.html");
		
		WebElement ele1 = driver.findElement(By.xpath("(//input)[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//input)[2]"));
		WebElement ele3 = driver.findElement(By.xpath("(//input)[3]"));
		WebElement ele4 = driver.findElement(By.xpath("(//input)[4]"));
		
		ele1.sendKeys("kolkata");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		ele1.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		ele1.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		
		ele2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		ele2.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		ele2.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		ele2.sendKeys("Bangaluru");
		Thread.sleep(1000);
		ele2.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		ele2.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		ele2.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		
		ele3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
	}

}
