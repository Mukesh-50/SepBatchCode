package testngdemos;

import org.testng.annotations.Test;

public class MyFirstTestNG2 
{
	
	
	@Test(priority=1,description="This test will open browser")
	public void openBrowser()
	{
		System.out.println("openBrowser");
	}

	@Test(priority=2,description="This test will login ")
	public void loginToApplication() 
	{
		System.out.println("loginToApplication");
		
	}
	
	@Test(priority=3,description="This test will logout browser")
	public void logout()
	{
		System.out.println("logout");
		
	}
	
	@Test(priority=4,description="This test will close browser")
	public void closeBrowser() 
	{
		System.out.println("closeBrowser");
		
	}
	
	}
