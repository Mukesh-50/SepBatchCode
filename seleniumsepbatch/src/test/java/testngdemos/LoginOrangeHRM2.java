package testngdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrangeHRM2 {

	
	WebDriver driver;
	
	@Parameters({"BrowserType","ApplicationURL"})
	@Test
	public void login(String browser,String appurl)
	{
	
		System.out.println("Running Test on "+browser);
		
		System.out.println("Thread id "+Thread.currentThread().getId());
		System.out.println("Thread id "+Thread.currentThread().getName());
		System.out.println("Thread id "+Thread.currentThread().getPriority());
		System.out.println("Thread id "+Thread.currentThread().getState());
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		
		else
		{
			System.out.println("Sorry we only support FF, Chrome, Edge,IE");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}
