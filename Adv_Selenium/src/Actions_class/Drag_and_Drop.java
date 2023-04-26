package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("(//div[.='Oslo'])[2]"));
		WebElement drop = driver.findElement(By.xpath("//div[.='Norway']"));
		
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.dragAndDrop(drag, drop).perform();
	}

}
