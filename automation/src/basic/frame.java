package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement first = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		first.click();
		driver.switchTo().frame(1); 	 	
		//Thread.sleep(2000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frameElement);
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Arise");
		
		
	}

}
