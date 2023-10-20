package Frame_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Selenium_html/Demo%20sites%20for%20frame/first.html");
		Thread.sleep(2000);
		
		// Controller in main/default page
		WebElement un_main = driver.findElement(By.xpath("//input[@id='aa']"));
		un_main.sendKeys("Pranabendu");
		Thread.sleep(2000);
		WebElement email_main = driver.findElement(By.xpath("//input[@id='cc']"));
		email_main.sendKeys("giri@gmail.com");
		Thread.sleep(2000);
		
		// for switching to parent frame
		WebElement pframe = driver.findElement(By.xpath("//iframe[@id='pframe']"));
		driver.switchTo().frame(pframe);
		WebElement pframe_pwd = driver.findElement(By.xpath("//input[@id='bb']"));
		pframe_pwd.sendKeys("khajra123");
		Thread.sleep(2000);
		
		// for switching to child frame
		WebElement cframe = driver.findElement(By.xpath("//iframe[@id='cframe']"));
		driver.switchTo().frame(cframe);
		WebElement cframe_adrs = driver.findElement(By.xpath("//input[@id='dd']"));
		cframe_adrs.sendKeys("Kolkata");
		Thread.sleep(2000);
		
		// Coming back to parent frame
		driver.switchTo().parentFrame();
		pframe_pwd.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		pframe_pwd.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		pframe_pwd.sendKeys("nano123");
		Thread.sleep(2000);
		
		// Coming back from parent frame to default/main page
		driver.switchTo().parentFrame();
		un_main.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		un_main.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		un_main.sendKeys("Qspiders");
	}

}
