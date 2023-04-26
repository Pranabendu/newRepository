package WebDriver_concept;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drag_browser {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com");
		
		
		String key1 = "webdriver.chrome.driver";
		String value1 = "./softwares/chromedriver.exe";
		System.setProperty(key1, value1);
		WebDriver driver1 = new ChromeDriver();
		driver1.navigate().to("https://www.fb.com");
		Thread.sleep(2000);
		
		driver1.manage().window().maximize();
		Thread.sleep(2000);
	
		org.openqa.selenium.Dimension d1 = new org.openqa.selenium.Dimension(300, 300);
		
		driver1.manage().window().setSize(d1);
		Thread.sleep(2000);
		
		org.openqa.selenium.Point p1 = new org.openqa.selenium.Point(500, 400);		
		driver1.manage().window().setPosition(p1);
		
		
	}

}
