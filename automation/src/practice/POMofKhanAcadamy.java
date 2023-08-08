package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMofKhanAcadamy {
	
	@FindBy (xpath ="//button[@fdprocessedid='vy70i']")private WebElement google;
	@FindBy (xpath ="//button[@//button[@fdprocessedid='rmons']")private WebElement clever;
	@FindBy (xpath ="//button[@//button[@fdprocessedid='zmq4']")private WebElement facebook;
	@FindBy (xpath ="//button[@//button[@fdprocessedid='rt9l6l']")private WebElement apple;
	@FindBy (xpath ="//input[@type='text']")private WebElement email;
	@FindBy (xpath ="//input[@type='password']")private WebElement password;
	@FindBy (xpath ="//a[text()='Forgot password?']")private WebElement forgetpass;
	@FindBy (xpath ="//button[@type='submit']")private WebElement login;
	@FindBy (xpath ="//a[text()='Create an account']")private WebElement createAcc;

	public POMofKhanAcadamy(WebDriver driver)		
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGoogle()
	{
		google.click();
	}
	public void clickOnClever()
	{
		clever.click();
	}
	
	public void clickOnFacebook()
	{
		facebook.click();
	}
	public void clickOnApple()
	{
		apple.click();
	}
	
	public void sendEmail(String id)
	{
		email.sendKeys(id);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnFoegetPassword()
	{
		forgetpass.click();
	}
	
	public void clicklogin()
	{
		login.click();
	}
	
	public void clickcreateacc()
	{
		createAcc.click();
	}
	
}
