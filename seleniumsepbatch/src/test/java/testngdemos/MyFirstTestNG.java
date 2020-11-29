package testngdemos;

import org.testng.annotations.Test;

public class MyFirstTestNG 
{
	
	
	@Test
	public void test1()
	{
		System.out.println("Test 1 executed");
	}

	@Test
	public void test2() throws InterruptedException
	{
		System.out.println("Test 2 executed");
		Thread.sleep(5000);
	}
	
	@Test
	public void test3() throws InterruptedException
	{
		System.out.println("Test 3 executed");
		Thread.sleep(15000);
	}
	
	}
