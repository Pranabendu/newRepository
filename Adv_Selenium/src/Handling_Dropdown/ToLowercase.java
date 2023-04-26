package Handling_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLowercase {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Selenium_html/Dropdowns.html");
		
		WebElement dd = driver.findElement(By.xpath("//select"));
		Select s1 = new Select(dd);
		List<WebElement> store = s1.getOptions();
		int s = store.size();
		System.out.println(s);
		
		for (WebElement con : store) {
			String text = con.getText();
			String res = text.toLowerCase();
			System.out.println(res);
		}
		driver.close();
	}

}
