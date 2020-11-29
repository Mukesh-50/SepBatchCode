package readingdataExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcelDemo2 {

	
	@Test
	public void readExcel() throws IOException
	{

		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/AutomationData.xlsx")));
		
		String data001=wb.getSheet("Data1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data001);
		
		System.out.println(wb.getSheet("Data2").getRow(1).getCell(0).getStringCellValue());
		
		System.out.println(wb.getSheet("Data2").getRow(1).getCell(2).getNumericCellValue());
		
		int row=wb.getSheet("Data1").getPhysicalNumberOfRows();
		
		int column=wb.getSheet("Data1").getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("Number of columns "+column);
		
		for(int i=0;i<row;i++)
		{
			String data=wb.getSheet("Data1").getRow(i).getCell(2).getStringCellValue();
			System.out.println(data);
		}
		
		wb.close();
		
		
	}
	
	
}
