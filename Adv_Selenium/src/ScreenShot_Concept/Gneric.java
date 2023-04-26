package ScreenShot_Concept;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Gneric {
	
	static void take(WebDriver ctrl) throws IOException{
		Date d1 = new Date();
		//System.out.println(d1);
		String s1 = d1.toString();
		String res = s1.replace(":", "-");
		//System.out.println(res);
		
		// type cast WebDriver to TakesScreenshot
		TakesScreenshot t1 = (TakesScreenshot) ctrl;
		
		// use getScreenShotAs() and take the screenshot then store it in the temporary memory
		File temp = t1.getScreenshotAs(OutputType.FILE);
		
		// set the path of permanent memory
		File f1 = new File("./photos/"+res+".png");
		
		// copy the temporary and paste it the permanent memory
		FileHandler.copy(temp, f1);
		
	}
}
