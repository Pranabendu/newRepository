package Practice_All_Concept;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import FrameWork.Launch;

public class Amazon extends Launch
{
	@Test
	void testCase1() throws InterruptedException
	{
		WebElement frame = driver.findElement(By.xpath("(//iframe)[2]"));
		Point loc = frame.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		frame.click();
		Thread.sleep(3000);
		
	}
}
