package basic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import practice.browser;

public class BrokenLinks {
	
	public static void main(String[] args) {
		HttpURLConnection huc;
		WebDriver driver = browser.chrome("https://www.zlti.com/");
		List <WebElement> anchor = driver.findElements(By.tagName("a"));
		for(int i=0;i<anchor.size();i++)
		{
			WebElement links = anchor.get(i);
			String url = links.getAttribute("href");
			if(url==null || url.isEmpty())
			{
			System.out.println("URL is invalid");
			continue;
			}
			
			try {
				URL uRL =new URL(url);
				huc =(HttpURLConnection)uRL.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				int response = huc.getResponseCode();
				if(response>=400)
				{
					System.out.println("URL is broken "+url);
				}
				else
				{
					System.out.println("URL is valid "+url);
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
