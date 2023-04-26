package Practice_All_Concept;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {
	
	static void capture(WebDriver ctrl) throws Exception {
		
		Date d1 = new Date();
		String ans = d1.toString();
		String res = ans.replace(":", "-");
		System.out.println(res);
		
		TakesScreenshot t1 = (TakesScreenshot) ctrl;
		File loc = t1.getScreenshotAs(OutputType.FILE);
		File per = new File("./photos/"+res+".png");
		FileHandler.copy(loc, per);
	}
}
