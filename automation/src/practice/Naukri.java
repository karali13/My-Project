package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver, chrome.driver","C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		/*driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement register = driver.findElement(By.xpath("//button[text()='Register now']"));
		boolean result= register.isEnabled();
		System.out.println(result);
		driver.manage().window().minimize();
		
		Thread.sleep(3000);*/
		
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement product = driver.findElement(By.xpath("//select[@id='first']"));
		Select select = new Select(product);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("Yahoo");
		Thread.sleep(2000);
		select.selectByVisibleText("Google");
		
		
	}

}
