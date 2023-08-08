 package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement exp=driver.findElement(By.xpath("//input[@placeholder='Select experience']"));
		exp.click();
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//li[@value='#2']"));
		year.click();
		boolean result = year.isSelected();
		System.out.println(result);
		
		
		
		/*Thread.sleep(2000);
		
		WebElement exp2=driver.findElement(By.xpath("//input[@placeholder='Select experience']"));
		exp2.click();
		Thread.sleep(2000);
		
		WebElement year1 = driver.findElement(By.xpath("//li[@value='#3']"));
		boolean result1 = year1.isSelected();
		System.out.println(result1);*/
		//year.click();

		
	}

}
