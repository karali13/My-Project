package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rowCount2 {
	public static String price = "";
	public static String name = "";

	public static void main(String[] args) {
		WebDriver driver = browser.chrome("https://demo.guru99.com/test/web-table-element.php");
		List <WebElement> cp = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));
		List <WebElement> companyList = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[1]"));
		double max =0;
		String company ="";
		for(int i=0;i<cp.size();i++)
		{

			price= cp.get(i).getText();
			name= companyList.get(i).getText();
			double d = Double.parseDouble(price);
			if(d>max)
			{
				max=d;
				company=name;
			}
		}
		System.out.println("Company name:"+company+"  max price: "+max);
		double min=max;
		for(int j=0;j<cp.size();j++)
		{
			price = cp.get(j).getText();
			name = companyList.get(j).getText();
			double d= Double.parseDouble(price);
			if(d<min)
			{
				min=d;
				company=name;
			}
		}
		System.out.println("Company name:"+company+"  min price: "+min);
		
  }

}
