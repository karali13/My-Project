package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveto {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement obj = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action = new Actions(driver);
		action.moveToElement(obj);
		action.perform();
	}
}
