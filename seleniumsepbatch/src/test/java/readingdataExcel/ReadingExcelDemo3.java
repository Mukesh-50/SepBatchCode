package readingdataExcel;

import java.io.IOException;

import org.testng.annotations.Test;

public class ReadingExcelDemo3 {

	
	@Test
	public void readExcel() throws IOException
	{

		ExcelReader excel=new ExcelReader();
		System.out.println(excel.getCellData("Data1", 0, 0));
		System.out.println(excel.getCellData("Data1", 8, 2));
				
		
	}
	
	
}
