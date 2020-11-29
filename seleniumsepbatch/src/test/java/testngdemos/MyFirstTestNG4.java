package testngdemos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestNG4 
{
	// soft assert will continue program but it will fail at last (in reporting)
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test 2 started");
		Assert.assertEquals(true, false);
		System.out.println("Test 2 finised");
	}

	@Test
	public void test3()
	{
		String str1="Please enter your username";
		String str2="Please Enter your username";
		Assert.assertEquals(str1, str2);
	}
	
	
	@Test
	public void test4()
	{
		String str1="Please enter your username";
		String str2="Please enter your username ";
		Assert.assertEquals(str1, str2);
	}
	
	@Test
	public void test5()
	{
		String str1="Please enter your username";
		String str2="Please enter your username";
		Assert.assertEquals(str1, str2);
		
	}
	
	
	@Test
	public void test6()
	{
		String str1="Please enter your username, old username has expired";
		Assert.assertTrue(str1.contains("expired"),"Validation of error message has failed");
	}
	
	@Test
	public void test7()
	{
		String str1="Please enter your username, old username has expired";
		Assert.assertEquals(str1.contains("expired"), false);
	}
	
	}
