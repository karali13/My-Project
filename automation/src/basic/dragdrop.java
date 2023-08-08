package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		WebElement source = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][1]"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions action = new Actions(driver);
		action.dragAndDrop(source, trash);
		action.perform();
		Thread.sleep(4000);
		//2nd
		WebElement source1 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][2]"));
		WebElement trash1 = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions action1 = new Actions(driver);
		action1.dragAndDrop(source1, trash1);
		action1.perform();
		Thread.sleep(4000);
		//3rd
		WebElement source2 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][3]"));
		WebElement trash2 = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions action2 = new Actions(driver);
		action2.dragAndDrop(source2, trash2);
		action2.perform();
		Thread.sleep(4000);
		
		WebElement source3 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][4]"));
		WebElement trash3 = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions action3 = new Actions(driver);
		action3.dragAndDrop(source3, trash3);
		action3.perform();
		Thread.sleep(4000);
		
		//WebElement recycle = driver.findElement(By.xpath("//a[text()='Recycle image']"));
		//recycle.click();
		
	}

}
