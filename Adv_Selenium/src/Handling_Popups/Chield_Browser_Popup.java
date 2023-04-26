package Handling_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chield_Browser_Popup {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(3000);
		
		String pid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		
		
		String cid = "";
		for (String all : allid) {
			if (pid!=all) {
				cid = all;
			}
		}
		System.out.println(cid);
		driver.close();
		
		driver.switchTo().window(cid);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.close();
	}

}
