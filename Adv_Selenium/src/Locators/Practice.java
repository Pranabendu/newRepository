package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException	 {
		String key = "webdriver.chrome.driver";
		String value = "./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://106.51.87.42:9007");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("pranabendu@project.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("pranabendu123");
		Thread.sleep(2000);
		driver.findElement(By.className("entypo-login")).click();
		Thread.sleep(8000);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
