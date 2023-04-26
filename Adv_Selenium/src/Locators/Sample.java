package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///D:/Selenium_html/Passport%20Seva.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("sun")).sendKeys("Star Boy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("a")).click();
		Thread.sleep(10000);
		driver.close();
	}

}
