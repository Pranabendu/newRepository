package Handling_Dropdown;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Remove_duplicate_option {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Selenium_html/Dropdowns.html");
		WebElement dd = driver.findElement(By.xpath("//select"));
		Select s1 = new Select(dd);
		List<WebElement> opt = s1.getOptions();
		TreeSet<String> a1 = new TreeSet<String>();
		for (WebElement ss : opt) {
			String text = ss.getText();
			a1.add(text);
		}
		for (String pp : a1) {
			System.out.println(pp);
		}
		driver.close();
	}

}
