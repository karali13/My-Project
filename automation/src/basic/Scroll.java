package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.khanacademy.org/login");
		driver.manage().window().maximize();
		WebElement menu = driver.findElement(By.xpath("//a[text()='About']"));
		//Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
	// executeScript("arguments[0].scrollIntoView(true)", menu);
		//scroll.executeScript("scrollIntoView(true)", menu);
		//scroll.executeScript("window.scrollBy(250,100)");
		scroll.executeScript("arguments[0].scrollIntoView(true);", menu);
	}
}
    