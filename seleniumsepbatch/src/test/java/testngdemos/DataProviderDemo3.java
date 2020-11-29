package testngdemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo3 {

	@Test
	public void createQuote() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa122.aconex.com/Logon");
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frameMain"));
		driver.findElement(By.id("Correspondence_correspondenceTypeID")).click();
		Thread.sleep(3000);
		List<WebElement> allList=driver.findElements(By.xpath("//optgroup//option"));
		allList.get(1).click();
	}

	//@DataProvider(name = "LoginData")
	public Object[][] setDataForApplication() {
		System.out.println("LOG:INFO- Test Data is getting prepared");

		Object[][] arr = new Object[3][3];
		arr[0][0] = "Sumeet";
		arr[0][1] = "Rastogi";
		arr[0][2]="Pass";
		arr[1][0] = "Kris";
		arr[1][1] = "Adit";
		arr[1][2]="Pass";
		arr[2][0] = "Nita";
		arr[2][1] = "Rabiul";
		arr[2][2]="Fail";
		System.out.println("LOG:INFO: Test Data is ready");
		return arr;
	}

	@DataProvider(name = "createSalesOrder")
	public Object[][] setDataForApplication1() {
		System.out.println("LOG:INFO- Test Data is getting prepared");

		Object[][] arr = new Object[3][2];
		arr[0][0] = "Anil";
		arr[0][1] = "Megha";
		arr[1][0] = "Santhosh";
		arr[1][1] = "Shital";
		arr[2][0] = "Vidya";
		arr[2][1] = "Prasanna";

		System.out.println("LOG:INFO: Test Data is ready");
		return arr;
	}
}
