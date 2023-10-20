package TestNG_Concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	
	@Test(priority = 3)
	void ansim() {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Selenium_html/Multi%20Select%20Dropdowns.html");
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
			//System.out.println(ans);
			Reporter.log(ans,true);
		}
		driver.close();
	}
}
