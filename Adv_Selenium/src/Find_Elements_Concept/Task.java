package Find_Elements_Concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("file:///D:/Selenium_html/checkboxonly.html");
		Thread.sleep(2000);
		List<WebElement> check = driver.findElements(By.xpath("//input"));
		for (WebElement luka : check) {
			luka.click();
			Thread.sleep(1000);
		}
	}

}
