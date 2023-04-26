package WebDriver_concept;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(3000);
		
		org.openqa.selenium.Dimension d1 = new org.openqa.selenium.Dimension(250, 250);
		driver.manage().window().setSize(d1);
		
		Thread.sleep(3000);
		
		Point p1 = new Point(350, 400);
		driver.manage().window().setPosition(p1);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.close();
	}

}
