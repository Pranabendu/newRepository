package Practice_All_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Aampa {
	@Test
	void zani() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cardekho.com");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("(//span[.='Sell Car '])[1]"));
		Actions act = new Actions(driver);
		Action hovering = act.moveToElement(ele1).build();
		hovering.perform();
		Thread.sleep(2000);
		Action right_clik = act.contextClick(ele1).build();
		right_clik.perform();
		
		driver.close();
	}
}
