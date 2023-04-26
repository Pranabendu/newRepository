package ScreenShot_Concept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://106.51.87.42:9003/");
		Thread.sleep(2000);
		
		// Step:1  Type cast from WebDriver interface to TakesScreenshot interface
		TakesScreenshot scr = (TakesScreenshot) driver;
		
		// Step:2  Take the screenshot and specify the file type and store it in a temporary memory
		File temp = scr.getScreenshotAs(OutputType.FILE);
		
		// Step:3  Specify the Permanent memory file path
		File per = new File("./photos/Bro.png");
		
		// Step:4  Copy the temporary file to permanent memory
		FileHandler.copy(temp, per);
		
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
