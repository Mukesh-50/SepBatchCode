package readingdataExcel;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
	
	
	@Test
	public void reportGenerate() throws IOException
	{
		ExtentSparkReporter html=new ExtentSparkReporter(System.getProperty("user.dir")+"/AutomationReport.html");
		html.config().setTheme(Theme.DARK);
		html.config().setDocumentTitle("Report");
		html.config().setReportName("Sprint 1 Report");
		
		ExtentReports report=new ExtentReports();
		report.attachReporter(html);
		
		ExtentTest logger1=report.createTest("Login");
		
		logger1.info("User entered username");
		logger1.info("User entered password");
		logger1.info("User clicked on login");
		logger1.pass("Test Passed with valid login");
		
		
		ExtentTest logger2=report.createTest("Buy");

		logger2.info("User entered card");
		logger2.info("User entered cvv");
		logger2.fail("Test failed because invalid otp");
		
		
		ExtentTest logger3=report.createTest("Logout");
		logger3.info("User clicked on logout");
		logger3.fail("Test Failed because element does not exist", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\USER\\Desktop\\sample2.jpg").build());
		
		report.flush();
	}

}
