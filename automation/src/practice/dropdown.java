package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	public static void main(String[] args) throws IOException  {
		WebDriver driver = browser.chrome("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement products = driver.findElement(By.xpath("//select[@id='first']"));
		Select select = new Select(products);
		select.selectByIndex(2);
		
		ss.clickss(driver,"new4");
	}

}
