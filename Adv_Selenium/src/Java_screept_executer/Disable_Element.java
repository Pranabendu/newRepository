package Java_screept_executer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disable_Element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Selenium_html/4%20textfield.html");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='aa']"));
		
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		
		j1.executeScript("document.getElementById('aa').value='QSpider'");
		
		
	}

}
