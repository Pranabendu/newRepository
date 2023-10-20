package Syancronisation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://106.51.87.42:9003/");
		
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("PRANAB@GMAIL.COM");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("PRANAB123");
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Signout ')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("My account"));
		
		
		
		String t = driver.getTitle();
		System.out.println(t);
		
		driver.close();		
	}

}
