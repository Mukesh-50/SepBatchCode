package testngdemos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDemo {

	@Test
	public void test01()
	{
		Assert.assertTrue(false);
	}
	
	// if test 01 failed then testo2 will be in skip mode
	@Test(dependsOnMethods="test01")
	public void test02()
	{
		Assert.assertTrue(true);

	}
	
}
