package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class radioButton {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		button.click();
		Thread.sleep(2000);

		boolean result = button.isSelected();
		System.out.println(result);
		
		Thread.sleep(2000);

		WebElement button1 = driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
		

		boolean result1 = button1.isSelected();
		System.out.println(result1);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\shimp\\OneDrive\\Pictures\\Screenshots\\radiobtn.png");
		FileHandler.copy(source, destination);
		
		
	}

}
