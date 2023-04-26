package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube_Song_Play {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver w1 = new FirefoxDriver();
		Thread.sleep(2000);
		w1.get("https://www.youtube.com");
		Thread.sleep(2000);
		w1.findElement(By.xpath("//input[@name='search_query']")).sendKeys("natu natu song"); // this is for typing the song name on the searching bar
		Thread.sleep(2000);
		w1.findElement(By.xpath("//button[@id='search-icon-legacy']")).click(); // this is for click on search button
		Thread.sleep(2000);
		w1.findElement(By.xpath("//a[@title='Naacho Naacho (Full Video) RRR - NTR, Ram Charan | M M Kreem | SS Rajamouli | Vishal Mishra & Rahul']//yt-formatted-string[1]")).click(); // this is for the particular song link
		Thread.sleep(2000);
		w1.findElement(By.xpath("//yt-icon-button[@id='guide-button']")).click(); // this is for menu button
		Thread.sleep(3000);
		w1.findElement(By.xpath("(//yt-formatted-string[@class='title style-scope ytd-guide-entry-renderer'])[1]")).click(); // this is for home button
		Thread.sleep(2000);
		w1.quit();
		
		String key2 = "webdriver.chrome.driver";
		String value2 = "./softwares/chromedriver.exe";
		System.setProperty(key2, value2);
		WebDriver w2 = new ChromeDriver();
		Thread.sleep(2000);
		w2.get("https://www.youtube.com");
		w2.findElement(By.xpath("//input[@name='search_query']")).sendKeys("kya bat hy");
		Thread.sleep(2000);
		w1.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		w1.findElement(By.xpath("//yt-formatted-string[.='Harrdy Sandhu - Kya Baat Ay | Jaani | B Praak |  Arvindr Khaira | Official Music Video']")).click();
		
	}

}
