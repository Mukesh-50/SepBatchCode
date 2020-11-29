package readingdataExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcelDemo {

	
	@Test
	public void readExcel() throws IOException
	{
	
		File src=new File(System.getProperty("user.dir")+"/TestData/AutomationData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheet("Data1");
		XSSFRow r1=sh1.getRow(0);
		
		XSSFCell c1=r1.getCell(0);
		String str=c1.getStringCellValue();
		System.out.println(str);
		
		XSSFCell c2=r1.getCell(1);
		String str1=c2.getStringCellValue();
		System.out.println(str1);
		
		XSSFCell c3=r1.getCell(2);
		double str2=c3.getNumericCellValue();
		System.out.println(str2);
		
		double str3=c3.getNumericCellValue();
		System.out.println(String.valueOf(str3));
		
		wb.close();
	}
	
	
}
