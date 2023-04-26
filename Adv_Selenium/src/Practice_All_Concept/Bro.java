package Practice_All_Concept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Bro extends Launch_Browser{
	
	@Test
	void runBro() {
		
		WebElement dd = driver.findElement(By.xpath("//select[@id='sub']"));
		
		Select s1 = new Select(dd);
		List<WebElement> options = s1.getOptions();
		
		ArrayList<String> a1 = new ArrayList<>();
		for (WebElement opt : options) {
			String text = opt.getText();
			a1.add(text);
		}
		Collections.sort(a1);
		Collections.reverse(a1);
		for (String val : a1) {
			Reporter.log(val, true);
		}
		
//		TreeSet<String> t1 = new TreeSet<String>(); 
//		
//		for (WebElement ele : options) {
//			String txt = ele.getText();
//			t1.add(txt);
//		}
//		for (String text : t1) {
//			Reporter.log(text, true);
//		}
		
	}
}
