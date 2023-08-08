package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		button.click();		
		
		Alert popup = driver.switchTo().alert();
		//popup.sendKeys("GOTit");
		//popup.accept();
		//popup.dismiss();
		//popup.getText();
		String a= popup.getText();
		System.out.println(a);
		
	}

}
