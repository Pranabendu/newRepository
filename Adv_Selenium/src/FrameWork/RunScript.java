package FrameWork;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RunScript extends Launch{
	@Test
	void run() throws EncryptedDocumentException, IOException, InterruptedException {
		Pom p1 = new Pom(driver);
		
		String act = "Login | Hospital Management System";
		
		for (int i = 1; i <= 2; i++) {
			
			p1.inputEmail(Excel.main(6, 0));
			Thread.sleep(2000);
			p1.inputPwd(Excel.main(6, 1));
			Thread.sleep(2000);
			p1.clickLogin();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
		}
			
			String exp = driver.getTitle();
			
			assertEquals(act, exp);
			
			Thread.sleep(4000);
			
			Reporter.log("Execute Till hare", true);
		
	}
}
