package WebDriver_concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hfkjshfdsk {

	public static void main(String[] args) throws InterruptedException {
		String key1 = "webdriver.chrome.driver";
		String value1 = "./softwares/chromedriver.exe";
		System.setProperty(key1, value1);
		WebDriver driver1 = new ChromeDriver();
		driver1.navigate().to("https://www.fb.com");
		Thread.sleep(2000);
	}

}
