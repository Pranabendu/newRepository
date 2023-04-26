package Find_Elements_Concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.youtube.com");
		Thread.sleep(1000);
		List<WebElement> img = driver.findElements(By.xpath("//a"));
//		for (WebElement print : img) {
//			String w = print.getText();
//			System.out.println(w);
//		}
		 int s = img.size();
		
		for (int i = 0; i <s ; i++) {
			String q = img.get(i).getText();
			System.out.println(q);
		}
		
		driver.close();
	}

}
