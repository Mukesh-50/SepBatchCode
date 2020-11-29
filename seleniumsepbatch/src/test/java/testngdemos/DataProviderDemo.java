package testngdemos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider = "LoginData")
	public void createQuote(String uname, String pass,String status) {
		System.out.println("Username is " + uname);
		System.out.println("Password is " + pass);
		System.out.println("Status is " + status);
	}

	@DataProvider(name = "LoginData")
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
