package projecttestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngday1 {
	
	@BeforeTest
	public void btest() 
	{
		System.out.println("yerrakumar");
	}
	
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("rajkumar");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("sravn");
	}
	
	@Test
	public void Test2() 
	{
		System.out.println("saicharan");
	}
	
	@Test
	public void Test3()
	{
	   System.out.println("chinnasai");
	}
	
	@AfterMethod
	public void amethod()
	{
		System.out.println("End");
	}
	
	@AfterTest
	public void atest() 
	{
		System.out.println("lax");
	}
	

}
