package Java_screept_executer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Till_BrowseByCategory {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://106.51.87.42:9003/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement ele = driver.findElement(By.xpath("//h6[.=' Automobiles ']"));
		
		Point loc = ele.getLocation();
		int x = loc.getY();
		int y = loc.getX();
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		ele.click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy("+-x+","+-y+")");
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
