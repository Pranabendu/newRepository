package Script;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		String actual = "Login | e-health management system";
		
		String key = "webdriver.chrome.driver";
		String value = "./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://106.51.87.42:9007/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		//System.out.println(title);
//		if (title.equals(actual)) {
//			System.out.println("TC Pass");
//		} else {
//			System.out.println("TC Fail");
//		}
		String page_source = driver.getPageSource();
		System.out.println(page_source);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		driver.close();
		
	}

}
