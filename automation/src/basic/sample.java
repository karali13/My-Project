package basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample {
	@Test(priority=-2, enabled = false)
	public void test2()
	{
		System.out.println("2");
	}
	
	
	@Test(invocationCount =3)
	public void test1()
	{
		System.out.println("1");
	}
	
	@Test(priority=0, timeOut =2000)
	public void test3() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("3");
	}
	@Test(dependsOnMethods = {"test3"})
	public void test4()
	{
		System.out.println("4");
	}

}
