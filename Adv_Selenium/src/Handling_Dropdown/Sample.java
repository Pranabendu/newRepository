package Handling_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Selenium_html/Dropdowns.html");
		WebElement dd = driver.findElement(By.xpath("//select"));
		
		Select s1 = new Select(dd);
//		boolean res = s1.isMultiple();
//		System.out.println(res);
		
		s1.selectByIndex(1);
		Thread.sleep(1000);
		s1.selectByValue("alo");
		Thread.sleep(1000);
		s1.selectByVisibleText("Kiyara");
		Thread.sleep(3000);
		driver.close();
	}

}
