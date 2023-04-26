package Webelement_concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetRect {							

	public static void main(String[] args) {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://106.51.87.42:9003/");
		WebElement ele = driver.findElement(By.xpath("//a[.=' Post Free Ads']"));
		Rectangle r = ele.getRect();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("lalu"));
		wait.until(ExpectedConditions.titleContains("Classified"));		
		System.out.println(r.height+" "+r.width);
		System.out.println(ele.getLocation());
		System.out.println(ele.getSize());
		driver.close();
		
		
	}

}
