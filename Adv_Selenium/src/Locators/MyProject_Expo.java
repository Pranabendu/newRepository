package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyProject_Expo {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://106.51.87.42:9007/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kabirsingh@project.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("preethi123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='entypo-login']")).click();
		Thread.sleep(2000);
		 WebElement dd = driver.findElement(By.xpath("(//a[@href='#'])[4]"));
		 Select s1 = new Select(dd);
		 boolean res = s1.isMultiple();
		 System.out.println(res);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://106.51.87.42:9007/index.php?doctor/appointment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='date_timestamp']")).sendKeys("Tue, 07 February 2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='time_timestamp']")).sendKeys("9:35");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='select2-search']")).sendKeys("Kalu Vai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='notify']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='entypo-logout right']")).click();
		
	}
}
