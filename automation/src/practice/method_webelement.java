package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class method_webelement {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver, chrome.driver","C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		
		WebElement button = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		button.click();
		boolean result= button.isSelected();
		System.out.println(result);
		
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//b[@class='caret']"));
		dropdown.click();
		
		WebElement demo = driver.findElement(By.xpath("//a[text()='Table Demo']"));
		boolean result1 = demo.isDisplayed();
		System.out.println(result1);
	
		WebElement text = driver.findElement(By.xpath("//strong[2]"));
		String title =text.getText();
		System.out.println(title);
	}

}
