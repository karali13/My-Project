package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practice.browser;

public class FacebbookPage {
	
	static WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		 driver = browser.chrome("https://www.facebook.com");
		}
	
	@AfterMethod
	public void aftermethod()
	{
		POMForFB POMForfb = new POMForFB(driver);
		POMForfb.clickLogin();

	}
	@Test
	public static void validData()
	{
		
		POMForFB POMForfb = new POMForFB(driver);
		POMForfb.enterID("arise@gmail.com");
		POMForfb.enterPass("1234");
	
	}
	
	@Test
	public static void InvalidPass()
	{
		POMForFB POMForfb = new POMForFB(driver);
		POMForfb.enterID("arisegmail.com");
		POMForfb.enterPass("12345");
	
		
	}
	
@Test
	public static void InvalidData()
	{
		POMForFB POMForfb = new POMForFB(driver);
		POMForfb.enterID("@gmail.com");
		POMForfb.enterPass("123456");
	
	}
	
	public static void main(String[] args)
	{
		
		FacebbookPage.validData();
		FacebbookPage.InvalidData();
		FacebbookPage.InvalidPass();
	}

}
