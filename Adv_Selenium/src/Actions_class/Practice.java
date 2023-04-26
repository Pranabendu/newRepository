package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		Actions a1 = new Actions(driver);
		
		WebElement ele1 = driver.findElement(By.xpath("//a[.='Customer Service']"));
		a1.contextClick(ele1).perform();
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		a1.moveToElement(ele2).perform();
		
	}

}
