package Handling_Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InDecending {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Selenium_html/Dropdowns.html");
		WebElement dd = driver.findElement(By.xpath("//select"));
		Select s1 = new Select(dd);
		List<WebElement> all = s1.getOptions();
		ArrayList<String> a1 = new ArrayList<String>();
		for(WebElement ele:all)
		{
			String text = ele.getText();
			a1.add(text);
		}
		
		Collections.sort(a1);
		Collections.reverse(a1);
		for (String ans : a1) {
			System.out.println(ans);
		}
		driver.close();
	}

}
