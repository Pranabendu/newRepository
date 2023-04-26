package Handling_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Experiment {

	public static void main(String[] args) throws InterruptedException {

		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		String mainid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		allid.remove(mainid);
		Thread.sleep(4000);
		driver.close();
		
		String cid1 = "";
		String cid2 = "";
		for (String id1 : allid) {
			cid1 = id1;
		}
		for (String id2 : allid) {
			if (cid1!=id2) {
				cid2 = id2;
			}
		}
		System.out.println(cid1);
		System.out.println(cid2);
		
		Thread.sleep(3000);
		driver.switchTo().window(cid1);
		driver.close();
		
		Thread.sleep(3000);
		driver.switchTo().window(cid2);
		driver.close();
	}

}
