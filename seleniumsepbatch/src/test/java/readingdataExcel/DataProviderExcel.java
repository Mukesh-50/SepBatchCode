package readingdataExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExcel {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.setHeadless(true);
		
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Test(dataProvider = "LoginData")
	public void createQuote(String uname, String pass ) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}

	@DataProvider(name = "LoginData")
	public Object[][] setDataForApplication() {
		
		System.out.println("LOG:INFO- Test Data is getting prepared");

		ExcelReader excel=new ExcelReader();
		
		int row=excel.getRowCount("Data1");
		
		int column=excel.getColumnCount("Data1");
		
		Object[][] arr = new Object[row][column];

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=excel.getCellData("Data1",i, j);
			}
		}
	
		System.out.println("LOG:INFO: Test Data is ready");
		return arr;
	}
}
