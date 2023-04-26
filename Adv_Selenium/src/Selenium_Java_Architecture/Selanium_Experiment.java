package Selenium_Java_Architecture;

interface Webdriver{
	void namo();
	void amit();
}
abstract class RemoteWebDriver implements Webdriver{

	public void namo() {
		System.out.println("Yes Bro");
		
	}

	public void amit() {
		System.out.println("Again Bro");
		
	}
	
}
class ChromeDriver extends RemoteWebDriver{
//	public void namo() {
//		System.out.println("Jio Kaka");
//		
//	}
//
//	public void amit() {
//		System.out.println("Jay ma Bhabani");
//		
//	}
}

public class Selanium_Experiment {
     public static void main(String[] args) {
		Webdriver w1 = new ChromeDriver();
		w1.amit();
		w1.namo();
    	 
	}
}
