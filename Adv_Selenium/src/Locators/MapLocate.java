package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MapLocate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/maps/dir///@21.125498,81.914063,5z");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @placeholder='Choose starting point, or click on the map...']")).sendKeys("kolkata");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[2]/div/div[3]/div[1]/div[2]/div[2]/div[1]/div/input")).sendKeys("bengaluru karnataka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[2]/div/div[3]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[9]/div/div/div[1]/div[2]/div/div[1]/div/div/div[4]/div[3]/div[1]/div[4]/div[1]/h1")).click();
	}

}
