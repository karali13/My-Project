package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));// xpath by attribute
		input.sendKeys("jeans for women");
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconSearch')]"));// xpath by contains
		search.click();
		
		Thread.sleep(2000);

		driver.navigate().back();
		
		
		WebElement profile = driver.findElement(By.xpath("//span[text()='Profile']"));//xpath by text
		profile.click();
		
		
		
		
		
	}

}
