package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("karalibaviskar5@gmail.com");
		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Godu@1307");
		
		WebElement login =driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		login.click();
	}
}
