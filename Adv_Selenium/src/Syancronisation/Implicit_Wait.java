package Syancronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://106.51.87.42:9007/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pranabendu@project.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pranabendu123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
