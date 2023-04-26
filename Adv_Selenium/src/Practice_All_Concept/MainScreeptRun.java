package Practice_All_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MainScreeptRun {
//	@Test(priority = 0)
	void execute() throws Exception {
		
		String un = Excel.excel1(0);
		String pwd = Excel.excel1(1);
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://106.51.87.42:9003/");
		
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//a[.=' Settings ']"));
		Point loc = ele.getLocation();
		int y = loc.getY();
		int x = loc.getX();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		ele.click();
		
		js.executeScript("window.scrollBy("+-x+","+-y+")");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='navbar-brand logo logo-title']")).click();
		Thread.sleep(3000);
		Screenshot.capture(driver);
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
