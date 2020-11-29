package testngdemos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestNG3 
{
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, false);
	}

	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, false,"Test failed please check");
	}

	
	@Test
	public void test4()
	{
		Assert.assertEquals(true, true,"Test failed please check");
	}
	
	}
