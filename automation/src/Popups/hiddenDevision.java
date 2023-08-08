package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;

import practice.browser;

public class hiddenDevision {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= browser.chrome("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		
		name.sendKeys("Karali");
	}
}
