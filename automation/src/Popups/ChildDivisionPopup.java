package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildDivisionPopup {
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
			Thread.sleep(2000);

			String handle =i.next();
			
			driver.switchTo().window(handle);
			//String url = driver.getTitle();
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			if(actualTitle.equals("Remote Jobs, 14531 Remote Job Vacancies In June 2023 - Naukri.com"))
			{	
				System.out.println("karali");
				
				break;
				
			}
			
		}
	}

}
