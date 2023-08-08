package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopup2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.drive", "C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement remote = driver.findElement(By.xpath("//a[@title='Remote']"));
		remote.click();	
		
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> i = handles.iterator();
		
		while(i.hasNext())
		{
			String handle =i.next();
			Thread.sleep(2000);
			driver.switchTo().window(handle);
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			
		}
	}

}
