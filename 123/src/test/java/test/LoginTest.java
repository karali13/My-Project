package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.LaunchBrowser;
import pom.LoginPage;
import utility.Reports;

@Listeners(test.listeners.class)
public class LoginTest extends BaseClass {
	static ExtentReports extent;
	static ExtentTest test;
	//static WebDriver driver;
	@BeforeTest
	public void configureReports() {
		 extent = Reports.createReports();
	}
	@BeforeMethod
	public void beforeMethod()
	{
		driver = LaunchBrowser.chrome("https://www.facebook.com");
		}
	
	@AfterMethod
	public void aftermethod(ITestResult result)
	{
		//LoginPage POMForfb = new LoginPage(driver);
		//POMForfb.clickLogin();
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else {
			test.log(Status.SKIP, result.getName());
		}
		driver.close();

	}
	@AfterTest
	public void publish() {
		extent.flush();
	}
	@Test
	public static void validData(){
		test = extent.createTest("validData");
		LoginPage POMForfb = new LoginPage(driver);
		SoftAssert softAssert = new SoftAssert();
		POMForfb.enterID("arise@gmail.com");
		POMForfb.enterPass("1234");
		String currentTitle = driver.getTitle();
		softAssert.assertEquals(currentTitle,"Home Page");
		System.out.println("home page validation done");
		softAssert.assertTrue(true);
		System.out.println("assert true validation done");
		softAssert.assertNull(currentTitle);
		System.out.println("Post assertion");
		}
	
	@Test
	public static void InvalidPass()
	{
		test = extent.createTest("InvalidPass");
		LoginPage POMForfb = new LoginPage(driver);
		POMForfb.enterID("arisegmail.com");
		POMForfb.enterPass("12345");
	
		
	}
	
@Test
	public static void InvalidData()
	{
	test = extent.createTest("InvalidData");
	LoginPage POMForfb = new LoginPage(driver);
		POMForfb.enterID("@gmail.com");
		POMForfb.enterPass("123456");
	
	}
}
