package basic;

import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
	List <WebElement> images = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
	WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
	Actions actions = new Actions(driver);
	for(int i=0; i<images.size();i++)
	{
		WebElement image = images.get(i);
		actions.dragAndDrop(image, trash);
		actions.perform();
	}
	}

}
