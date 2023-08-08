package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMForFB {
	@FindBy (xpath= "//input[@id='email']")private WebElement email;
	@FindBy (xpath= "//input[@id='pass']")private WebElement pass;
	@FindBy (xpath= "//button[@name='login']")private WebElement login;
	@FindBy (xpath= "//a[text()='Forgotten password?']")private WebElement forgetPass ;
	@FindBy (xpath= "//a[@data-testid='open-registration-form-button']")private WebElement createAccount;
	@FindBy (xpath= "//a[text()=Create a Page']")private WebElement createPage;
	public POMForFB(WebDriver driver)		//public constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	//initElement trigger @findby annotation to find all the webelement in the class
	
	public void enterID(String id)
	{
		email.sendKeys(id);
	}
	public void enterPass(String password)
	{
		pass.sendKeys(password);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	public void clickforgetPass()
	{
		forgetPass.click();
	}
	
	public void clickcreateAcc()
	{
		forgetPass.click();
	}
	public void clickcreateAccount()
	{
		createAccount.click();
	}
	
}
