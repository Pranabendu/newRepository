package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///D:/Selenium_html/ABCD.html");
		Thread.sleep(2000);
		WebElement A = driver.findElement(By.xpath("//div[1]//input[1]"));
		WebElement B = driver.findElement(By.xpath("//div[1]//input[2]"));
		WebElement C = driver.findElement(By.xpath("//div[2]//input[1]"));
		WebElement D = driver.findElement(By.xpath("//div[2]//input[2]"));
		
		// for the A textfield
		A.clear();
		Thread.sleep(2000);
		
		A.sendKeys("S"); 
		Thread.sleep(800);
		A.sendKeys("k");
		Thread.sleep(800);
		A.sendKeys("r");
		Thread.sleep(800);
		A.sendKeys(" ");
		Thread.sleep(800);
		A.sendKeys("S");
		Thread.sleep(800);
		A.sendKeys("i");
		Thread.sleep(800);
		A.sendKeys("r");
		
		Thread.sleep(2000);
		A.clear();
		Thread.sleep(2000);
		A.sendKeys("123");
		Thread.sleep(2000);
		
		//for the B textfield
		B.clear();
		Thread.sleep(2000);
		
		B.sendKeys("H");
		Thread.sleep(800);
		B.sendKeys("e");
		Thread.sleep(800);
		B.sendKeys("m");
		Thread.sleep(800);
		B.sendKeys("a");
		Thread.sleep(800);
		B.sendKeys("n");
		Thread.sleep(800);
		B.sendKeys("t");
		Thread.sleep(800);
		B.sendKeys("h");
		Thread.sleep(800);
		B.sendKeys(" ");
		Thread.sleep(800);
		B.sendKeys("S");
		Thread.sleep(800);
		B.sendKeys("i");
		Thread.sleep(800);
		B.sendKeys("r");
		
		
		Thread.sleep(2000);
		B.clear();
		Thread.sleep(2000);
		B.sendKeys("345");
		Thread.sleep(2000);
		
		//for the C textfield
		C.clear();
		Thread.sleep(2000);
		
		C.sendKeys("M");
		Thread.sleep(800);
		C.sendKeys("a");
		Thread.sleep(800);
		C.sendKeys("r");
		Thread.sleep(800);
		C.sendKeys("u");
		Thread.sleep(800);
		C.sendKeys("t");
		Thread.sleep(800);
		C.sendKeys("h");
		Thread.sleep(800);
		C.sendKeys("i");
		Thread.sleep(800);
		C.sendKeys(" ");
		Thread.sleep(800);
		C.sendKeys("S");
		Thread.sleep(800);
		C.sendKeys("i");
		Thread.sleep(800);
		C.sendKeys("r");
		
		Thread.sleep(2000);
		C.clear();
		Thread.sleep(2000);
		C.sendKeys("567");
		Thread.sleep(2000);
		
		//for the D textfield
		D.clear();
		Thread.sleep(2000);
		
		D.sendKeys("S");
		Thread.sleep(800);
		D.sendKeys("u");
		Thread.sleep(800);
		D.sendKeys("r");
		Thread.sleep(800);
		D.sendKeys("a");
		Thread.sleep(800);
		D.sendKeys("j");
		Thread.sleep(800);
		D.sendKeys(" ");
		Thread.sleep(800);
		D.sendKeys("S");
		Thread.sleep(800);
		D.sendKeys("i");
		Thread.sleep(800);
		D.sendKeys("r");
		
		Thread.sleep(2000);
		D.clear();
		Thread.sleep(2000);
		D.sendKeys("789");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
