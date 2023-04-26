package Handling_Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Selenium_html/Single%20Select%20Dropdown.html");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.xpath("//select"));
		Select s1 = new Select(dd); // multiple
		
//		s1.selectByIndex(0);
//		Thread.sleep(2000);
//		s1.selectByIndex(3);
//		Thread.sleep(2000);
//		WebElement opt = s1.getFirstSelectedOption();
//		String res = opt.getText();
//		System.out.println(res);
		
//		List<WebElement> all = s1.getOptions();
//		TreeSet<String> t1 = new TreeSet<String>();
//		for (WebElement opt : all) {
//			String txt = opt.getText();
//			t1.add(txt);
//		}
//	
//		for(String s2 : t1){
//			System.out.println(s2);
//		}
		
		List<WebElement> all = s1.getOptions();
		ArrayList<String> a1 = new ArrayList<String>();
		for(WebElement w1 : all){
			String txt = w1.getText();
			a1.add(txt);
		}
		// Assending order
		Collections.sort(a1);
		// Decending order
		Collections.reverse(a1);
//		Collections.replaceAll(a1," Kolkata", "Kanpur");
		for (String prt : a1) {
			System.out.println(prt);
		}
		
		driver.close();
	}
}