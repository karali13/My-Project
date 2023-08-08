package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class indeed {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.indeed.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		
		WebElement signin = driver.findElement(By.xpath("//a[text()='Sign in']"));
		signin.click();
		
		Thread.sleep(2000);
		
		WebElement google = driver.findElement(By.xpath("//button[@id='login-google-button']"));
		google.click();
		Thread.sleep(2000);

		WebElement apple = driver.findElement(By.xpath("//button[@id='apple-signin-button']"));
		apple.click();
		Thread.sleep(2000);

		WebElement fb = driver.findElement(By.xpath("//button[@id='login-facebook-button']"));
		fb.click();
		Thread.sleep(2000);
		
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> i=handles.iterator();
		
		while(i.hasNext())
		{
			Thread.sleep(2000);
			String handle = i.next();
			driver.switchTo().window(handle);
			String url = driver.getCurrentUrl();
			if(url.contains("https://appleid.apple.com/"))
			{
				driver.findElement(By.xpath("//input[@id='account_name_text_field']")).sendKeys("Arise");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
