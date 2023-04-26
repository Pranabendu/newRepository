package Java_screept_executer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Function {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://106.51.87.42:9003/");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for (int i = 1; i <= 15; i++) {
		
		js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(1000);
		
		}
		driver.close();
	}

}
