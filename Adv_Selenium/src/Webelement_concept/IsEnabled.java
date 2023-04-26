package Webelement_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://106.51.87.42:9003"); // for enter the url
		Thread.sleep(2000);
		WebElement what = driver.findElement(By.xpath("//input[@name='q']"));
		what.sendKeys("car");
		boolean res = what.isEnabled();
		System.out.println(res); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Where ?']")).sendKeys("kolkata");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-search btn-block']")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
