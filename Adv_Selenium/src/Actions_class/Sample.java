package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[contains(.,'Account & Lists')]"));
		Actions act = new Actions(driver);
		Action hovering = act.moveToElement(ele1).build();
		hovering.perform();
		Thread.sleep(2000);
		Action right_clik = act.contextClick(ele1).build();
		right_clik.perform();
	}

}
