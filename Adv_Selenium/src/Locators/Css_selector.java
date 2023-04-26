package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css_selector {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver w1 = new FirefoxDriver();
		Thread.sleep(2000);
		w1.get("http://106.51.87.42:9003/");
		Thread.sleep(2000);
		w1.findElement(By.cssSelector("a[href='http://106.51.87.42:9003/login']")).click();
		Thread.sleep(2000);
		w1.findElement(By.cssSelector("input[name='email']")).sendKeys("rumpadas@gmail.com");
		Thread.sleep(2000);
		w1.findElement(By.cssSelector("input[name='password']")).sendKeys("rumpa123");
		Thread.sleep(1000);
		w1.findElement(By.cssSelector("button[id='loginBtn']")).click();
		Thread.sleep(2000);
		w1.findElement(By.cssSelector("i[class='glyphicon glyphicon-off']")).click();
		Thread.sleep(2000);
		w1.close();
	}

}
  