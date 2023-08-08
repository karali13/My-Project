package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("www.google.com");
	//driver.get("https://google.com");
	
	Navigation nav = driver.navigate();
	nav.to("https://www.facebook.com");
	Thread.sleep(2000);
	//opt.addArguments();
	/*nav.back();
	Thread.sleep(2000);
	nav.forward();
	Thread.sleep(2000);
	nav.refresh();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	//driver.navigate().back();// method chaining 
	
	String url =driver.getCurrentUrl();
	System.out.println(url);*/
	
	/*Options opt = driver.manage();
	Window win = opt.window();
	win.maximize();
	Thread.sleep(2000);
	win.minimize();
	Thread.sleep(2000);
	driver.manage().window().maximize();*/
	
	/*WebElement logIn = driver.findElement(By.tagName("button"));
	logIn.click();*/
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("Arise@gmail.com");
	
	WebElement pass = driver.findElement(By.name("pass"));
	pass.sendKeys("12345");
	
	
}
}
