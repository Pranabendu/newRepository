package Practice_All_Concept;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import FrameWork.Launch;

public class Assert_And_Soft extends Launch{
	
	@Test
	void ullu() {
		String exp = "Online Shopping site in India: Shop Online for Mobiles, Books,"
				      + " Watches, Shoes and More - Amazon.iin";
		
		String act = driver.getTitle();
//		assertEquals(act, exp);
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(act, exp);
		s1.assertAll();
		
		driver.findElement(By.xpath("//a[.='Customer Service']")).click();
		
		Reporter.log("Execute till now", true);
	}
	
}
