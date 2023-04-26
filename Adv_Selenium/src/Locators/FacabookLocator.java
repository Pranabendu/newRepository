package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacabookLocator {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("pranabendugiri@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("1Pranabendu@");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement((By.xpath("//*[@id=mount_0_0_K1]/div/div[1]/div/div[2]/div[3]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[1]/div/i"))).click();
		Thread.sleep(2000);
		driver.close();
	}
	

}
