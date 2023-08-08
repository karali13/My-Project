package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement righ = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(righ);
		action.perform();
		WebElement close = driver.findElement(By.xpath("//span[text()='Quit']"));
		close.click();
		Thread.sleep(4000);
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(doubleclick);
		action.perform();
		Thread.sleep(4000);

		Alert pop = driver.switchTo().alert();
		pop.accept();
		
	}
}
