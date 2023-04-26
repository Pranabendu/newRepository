package Webelement_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttribute {

	public static void main(String[] args) {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://106.51.87.42:9003/");
		driver.findElement(By.xpath("//a[contains(.,'Login')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("PRANAB@GMAIL.COM");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("PRANAB123");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();;
		WebElement element = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		
		WebElement element2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		element2.click();
		
		boolean output = element.isSelected();
		System.out.println(output);
		driver.close();
	}

}
