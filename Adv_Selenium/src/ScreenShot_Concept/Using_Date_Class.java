package ScreenShot_Concept;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Using_Date_Class {

	public static void main(String[] args) throws Exception {
		
		Date d1 = new Date();
		String s1 = d1.toString();
		String name = s1.replace(":", "-");
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.trivago.in/");
		Thread.sleep(2000);
		
		// Step:1  Type cast from WebDriver interface to TakesScreenshot interface
		TakesScreenshot scr = (TakesScreenshot) driver;
		
		// Step:2  Take the screenshot and specify the file type and store it in a temporary memory
		File temp = scr.getScreenshotAs(OutputType.FILE);
		
		
		// Step:3  Specify the Permanent memory file path
		File per = new File("./photos/"+name+".png");
		
		// Step:4  Copy the temporary file to permanent memory
		FileHandler.copy(temp, per);
		
		Thread.sleep(1000);
		driver.close();
	}

}
