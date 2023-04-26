package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	// Declaration
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailtxt;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pwdtxt;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	
	// Initialization
	Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	void inputEmail(String email)
	{
		emailtxt.sendKeys(email);
	}
	
	void inputPwd(String pwd)
	{
		pwdtxt.sendKeys(pwd);
	}
	
	void clickLogin()
	{
		login.click();
	}
}
