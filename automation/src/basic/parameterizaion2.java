package basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameterizaion2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shimp\\OneDrive\\Desktop\\Automation-tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		//WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		FileInputStream file = new FileInputStream("C:\\Users\\shimp\\OneDrive\\Desktop\\Study\\xcl\\testcase.xlsx");
		//String id = WorkbookFactory.create(file).getSheetName("test1").getRow(0).getCell(0).getStringCellValue();
		String id = WorkbookFactory.create(file).getSheet("test1").getRow(0).getCell(0).getStringCellValue();
		email.sendKeys(id);
		
	}
}
