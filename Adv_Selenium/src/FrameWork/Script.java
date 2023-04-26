package FrameWork;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Script extends Launch{
	@Test
	void testase() {
		driver.findElement(By.xpath("//a[.=' Post Free Ads']")).click();
	}
}
