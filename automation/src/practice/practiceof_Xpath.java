package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceof_Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));//by attribute
		email.sendKeys("karali");
		
		Thread.sleep(2000);
		
		

		WebElement password = driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]"));
		password.sendKeys("Karali@");
		
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button"));//by absolute xpath
		login.click();
		driver.navigate().back();

		
		WebElement text = driver.findElement(By.xpath("//a[text()='Create a Page']"));// by text
		text.click();
		Thread.sleep(2000);

		
		driver.navigate().back();
		
		
	}

}
